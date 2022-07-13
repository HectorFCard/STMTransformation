package org.tzi.use.STMPlugin.logic.optimization;

import org.tzi.use.api.UseModelApi;
import org.tzi.use.uml.mm.*;
import org.tzi.use.parser.use.USECompiler;
import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ModelOptimizer {
    public static File optimize(File inputFile, String inputExpressionText) {
        //Compile USE model
        PrintWriter logWriter = new PrintWriter(System.out);
        MModel inputModel = null;
        InputStream iStream = null;
        try {
            iStream = Files.newInputStream(inputFile.toPath());
            inputModel = USECompiler.compileSpecification(iStream, inputFile.toString(), logWriter, new ModelFactory());
            System.out.println("Model Compiled");
        } catch (IOException ex) {
            System.out.println("File `" + inputFile.toString() + "' not found.");
        }

        //Parse and compile OCL expression
        Integer contextIndex = inputExpressionText.indexOf("context");
        Integer invIndex = inputExpressionText.indexOf("inv");
        Integer endIndex = inputExpressionText.indexOf(":");
        if (contextIndex == -1 || invIndex == -1 || endIndex == -1) {
            System.out.println("Error parsing optimization expression");
            return null;
        }
        String invContext = inputExpressionText.substring(contextIndex + 7, invIndex).replaceAll("\\s", "");
        String invName = inputExpressionText.substring(invIndex + 3, endIndex).replaceAll("\\s", "");
        inputExpressionText = inputExpressionText.substring(endIndex + 1);

        UseModelApi inputModelEditor = new UseModelApi(inputModel);
        MClassInvariant newConstraint = null;

        try {
            newConstraint = inputModelEditor.createInvariant(invName.equals("") ? "optimizationConstraint" : invName,
                    invContext,
                    inputExpressionText,
                    false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Create set for all related elements
        HashSet<MModelElement> relatedElements = new HashSet<MModelElement>();

        //Find directly related elements
        HashSet<MModelElement> DRElems = new HashSet<MModelElement>();
        ExpressionAnalyzer analyzer = new ExpressionAnalyzer();
        try {
            DRElems = analyzer.findDREs(inputModel, newConstraint.bodyExpression());
            DRElems.add(newConstraint.cls());
            MOptimizationVisitor v = new MOptimizationVisitor(DRElems);
            inputModel.processWithVisitor(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
        relatedElements.addAll(DRElems);

        //Find indirectly related elements
        HashSet<MClassifier> IRElems = new HashSet<MClassifier>();
        for (MModelElement e : DRElems) {
            if (e instanceof MClass) {
                IRElems.addAll(((MClass) e).allChildren());
            }
        }
        relatedElements.addAll(IRElems);

        //Find related invariants
        HashSet<MClassInvariant> modelInvs = new HashSet<MClassInvariant>(inputModel.classInvariants());
        HashMap<MClassInvariant, HashSet<MModelElement>> wfInvElems = new HashMap<MClassInvariant, HashSet<MModelElement>>();
        HashSet<MModelElement> InvRElems = new HashSet<MModelElement>();
        for (MClassInvariant i : modelInvs) {
            if (newConstraint == i) {
                InvRElems.add(i);
                continue;
            }

            //Find invariant related elements
            HashSet<MModelElement> tmpRElems = new HashSet<MModelElement>(analyzer.findDREs(inputModel, i.bodyExpression()));
            HashSet<MModelElement> tmpIRElems = new HashSet<MModelElement>();
            for (MModelElement e : tmpRElems) {
                if (e instanceof MClass) {
                    tmpIRElems.addAll(((MClass) e).allChildren());
                }
            }
            tmpRElems.addAll(tmpIRElems);

            //Separate invariants specific to the STM
            if (i.name().equals("uniqueIds") || i.name().startsWith("validLinking")) {
                wfInvElems.put(i, tmpRElems);
                continue;
            }

            //Compare invREs and current REs
            Set<MModelElement> intersection = relatedElements
                    .stream().filter(tmpRElems::contains).collect(Collectors.toSet());
            if (intersection.size() > 0) {
                InvRElems.add(i);
                InvRElems.addAll(tmpRElems);
            }
        }
        relatedElements.addAll(InvRElems);

        //Add WFInvs only for referred elements
        for (MClassInvariant i : wfInvElems.keySet()) {
            if (i.name().equals("uniqueIds") && relatedElements.contains(i.cls())) {
                relatedElements.add(i);
                relatedElements.addAll(wfInvElems.get(i));
            }
            else if (i.name().startsWith("validLiking_")) {
                String associationName = i.name().substring(13);
                if (relatedElements.contains(inputModel.getAssociation(associationName))) {
                    relatedElements.add(i);
                    relatedElements.addAll(wfInvElems.get(i));
                }
            }
        }

        //Print model with only related elements
        Integer fileExtensionIndex = inputFile.getAbsolutePath().indexOf(".use");
        String outFilePath = inputFile.getAbsolutePath().substring(0, fileExtensionIndex)
                +"_"+newConstraint.name()+".use";
        try {
            File outfile = new File(outFilePath);
            FileWriter writer = new FileWriter(outfile);
            StringWriter sw = new StringWriter();
            MMPrintOptimizedVisitor v = new MMPrintOptimizedVisitor(new PrintWriter(sw, true), relatedElements);
            inputModel.processWithVisitor(v);
            writer.write(sw.toString());
            writer.close();
            return outfile;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

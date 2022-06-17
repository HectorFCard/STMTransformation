package org.tzi.use.STMPlugin.logic.uml2stm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.tzi.use.STMPlugin.logic.uml2stm.stm2use.XML2USEConverter;

public class UML2STMTransform {
    public static void main(String[] args) {
        final String STM_MM_FILE = "src/org/tzi/use/STMPlugin/logic/uml2stm/mmodel/sTM.ecore";

        //Registering Ecore recource
        ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry()
        .getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

        //Registering STM metamodel as resource
        Resource mmRes = rs.getResource(URI.createFileURI(STM_MM_FILE), true);

        EObject eObject = mmRes.getContents().get(0);
        EPackage p = null;
        if (eObject instanceof EPackage) {
            p = (EPackage)eObject;
            EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
        }

        //Creating a TransformationExecutor instance out of a qvto file
        File qvtFile = new File("src/org/tzi/use/STMPlugin/logic/uml2stm/qvto/STM.qvto");
        URI transformationURI = URI.createFileURI(qvtFile.getAbsolutePath());
        TransformationExecutor executor = new TransformationExecutor(transformationURI);

        //Registering UML metamodel
        EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE); 
	    Resource.Factory.Registry.INSTANCE.
	    getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

        //Loading UML class model
        String modelPath = "src/org/tzi/use/STMPlugin/logic/uml2stm/test_models/SteamBoiler.uml";
        Integer nameBeginIndex = modelPath.lastIndexOf('/');
        Integer nameEndIndex = modelPath.indexOf(".uml", 0);
        String modelName = modelPath.substring(nameBeginIndex + 1, nameEndIndex);
        URI umlmodel = URI.createFileURI(modelPath);
        Resource inResource = rs.getResource(umlmodel, true);
        EList<EObject> inObjects = inResource.getContents();

        // create the input extent with its initial contents
        ModelExtent input = new BasicModelExtent(inObjects);		
        // create an empty extent to catch the output
        ModelExtent output = new BasicModelExtent();

        // setup the execution environment details
        // configuration properties, logger, monitor object etc.
        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setConfigProperty("keepModeling", true);

        // run the transformation assigned to the executor with the given 
        // input and output and execution context
        ExecutionDiagnostic result = executor.execute(context, input, output);

        //Check for issues in transformation
        if(result.getSeverity() != Diagnostic.OK) {
            //Output error			
            IStatus status = BasicDiagnostic.toIStatus(result);
            System.out.println(status.getMessage());
        }

        //Make a new File containing a copy of the STM metamodel
        Path srcfile = new File(STM_MM_FILE).toPath();
        Path outfile = new File("src/org/tzi/use/STMPlugin/logic/uml2stm/temp/" + modelName + ".ecore").toPath();
        try {
            Files.copy(srcfile, outfile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Save transformed STM to the created file
        List<EObject> outObjects = output.getContents();
        Resource outResource = rs.getResource(
                URI.createFileURI(outfile.toFile().getAbsolutePath()), true);
        outResource.getContents().addAll(outObjects);
        try {
            outResource.save(Collections.emptyMap());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Generate USE file from STM ecore file
        XML2USEConverter converter = new XML2USEConverter();
        try {
            converter.genUseSpec(outfile.toAbsolutePath().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
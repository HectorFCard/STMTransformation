package org.tzi.use.STMPlugin.logic.xml2use.ast;

import org.tzi.use.STMPlugin.logic.xml2use.XMLParser.ElementContext;
import org.tzi.use.STMPlugin.logic.xml2use.ast.stm.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class STMModel extends ASTModel {
    ArrayList<ASTClassifier> ownedElements = new ArrayList<ASTClassifier>();

    public void enterElem(ElementContext ctx) {
        switch (ctx.Name(0).getText()) {
            case "ownedElements" -> {
                String classifierType = ctx.attribute(0).STRING().getText();
                classifierType = classifierType.substring(1, classifierType.length() - 1);
                switch (classifierType) {
                    case "sTM:SnapshotClassifier" -> processedElements.add(new ASTSnapshotClass());
                    case "sTM:Association" -> processedElements.add(new ASTAssociation());
                    case "sTM:Enumeration" -> processedElements.add(new ASTEnumeration());
                    case "sTM:TransitionClass" -> processedElements.add(new ASTTransitionClass());
                    case "sTM:DataType" -> processedElements.add(new ASTClassifier());
                }
            }
            case "snapshotObjects" -> {
                processedElements.add(new ASTComponentClass());
            }
            case "attributes", "ownedEnd", "context" -> {
                processedElements.add(new ASTProperty());
            }
            case "queryOperations" -> {
                processedElements.add(new ASTQueryOperation());
            }
            case "parameters" -> {
                processedElements.add(new ASTParameter());
            }
            case "postcondition" -> {
                processedElements.add(new ASTConstraint("post"));
            }
            case "precondition" -> {
                processedElements.add(new ASTConstraint("pre"));
            }
            case "bodyCondition" -> {
                processedElements.add(new ASTConstraint("body"));
            }
            case "constraints" -> {
                processedElements.add(new ASTConstraint("inv"));
            }
            case "ownedLiteral" -> {
                processedElements.add(new ASTEnumLiteral());
            }
            default -> {}
        }
    }

    public void exitElem(ElementContext ctx) {
        switch (ctx.Name(0).getText()) {
            case "ownedElements" -> {
                addElem((ASTClassifier) processedElements.lastElement());
                processedElements.pop();
            }
            case "snapshotObjects" -> {
                ASTComponentClass newClass = (ASTComponentClass) processedElements.pop();
                ((ASTSnapshotClass) processedElements.lastElement()).addComponentClass(newClass);
            }
            case "attributes" -> {
                ASTProperty newAttr = (ASTProperty) processedElements.pop();
                if (processedElements.lastElement() instanceof ASTComponentClass) {
                    ((ASTComponentClass) processedElements.lastElement()).addAttribute(newAttr);
                }
                else if (processedElements.lastElement() instanceof ASTTransitionClass) {
                    ((ASTTransitionClass) processedElements.lastElement()).addAttribute(newAttr);
                }
            }
            case "queryOperations" -> {
                ASTQueryOperation newOp = (ASTQueryOperation) processedElements.pop();
                ((ASTComponentClass) processedElements.lastElement()).addOperation(newOp);
            }
            case "parameters" -> {
                ASTParameter newParam = (ASTParameter) processedElements.pop();
                ((ASTQueryOperation) processedElements.lastElement()).addParameter(newParam);
            }
            case "postcondition", "precondition", "bodyCondition" -> {
                ASTConstraint newParam = (ASTConstraint) processedElements.pop();
                ((ASTQueryOperation) processedElements.lastElement()).addCondition(newParam);
            }
            case "constraints" -> {
                ASTConstraint newConstr = (ASTConstraint) processedElements.pop();
                try {
                    processedElements.lastElement().getClass()
                            .getMethod("addInv", ASTConstraint.class)
                            .invoke(processedElements.lastElement(), newConstr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case "body" -> {
                String bodyText = ctx.content().getText();
                ((ASTConstraint) processedElements.lastElement()).setField("body", bodyText);
            }
            case "ownedEnd" -> {
                ASTProperty newEnd = (ASTProperty) processedElements.pop();
                ((ASTAssociation) processedElements.lastElement()).addMemberEnds(newEnd);
            }
            case "ownedLiteral" -> {
                ASTEnumLiteral newLiteral = (ASTEnumLiteral) processedElements.pop();
                ((ASTEnumeration) processedElements.lastElement()).addLiteral(newLiteral);
            }
            case "generalization" -> {
                String genType = ctx.attribute(0).STRING().getText();
                genType = genType.substring(0, genType.length() - 1);
                try {
                    processedElements.lastElement().getClass()
                            .getMethod("setField", String.class, String.class)
                            .invoke(processedElements.lastElement(), "general", genType);
                } catch (Exception e) {

                }
            }
            case "context" -> {
                ASTProperty newAttr = (ASTProperty) processedElements.pop();
                ((ASTTransitionClass) processedElements.lastElement()).addAttribute(newAttr);
            }
            default -> {}
        }
    }

    public void doFinalTasks() {
        assignTypes();

        ArrayList<ASTAssociation> newAssociations = new ArrayList<ASTAssociation>();
        for (ASTClassifier e : ownedElements) {
            if (e instanceof ASTSnapshotClass && ((ASTSnapshotClass) e).getComponents().size() > 0) {
                ASTProperty snapEnd = new ASTProperty();
                snapEnd.setField("name", e.getName().toLowerCase());
                snapEnd.setField("lower", "1");
                snapEnd.setField("upper", "1");
                snapEnd.setType(e);

                for (ASTComponentClass c : ((ASTSnapshotClass) e).getComponents()){
                    ASTAssociation newComp = new ASTAssociation();
                    newComp.setField("name", e.getName()+c.getName());
                    ASTProperty classEnd = new ASTProperty();
                    classEnd.setField("name", c.getName().toLowerCase());
                    classEnd.setField("lower", "0");
                    classEnd.setField("upper", "-1");
                    classEnd.setField("aggregation", "composite");
                    classEnd.setType(c);
                    if (c.getSuperType() != null) {
                        ASTProperty redefSnapEnd = new ASTProperty();
                        redefSnapEnd.setField("name", newComp.getName().toLowerCase());
                        redefSnapEnd.setField("lower", "1");
                        redefSnapEnd.setField("upper", "1");
                        redefSnapEnd.setType(e);
                        redefSnapEnd.setRedefines(snapEnd);
                        newComp.addMemberEnds(redefSnapEnd);

                        classEnd.setSubsets(c.getSuperType().getName().toLowerCase());
                    }
                    else {
                        newComp.addMemberEnds(snapEnd);
                    }
                    newComp.addMemberEnds(classEnd);

                    newAssociations.add(newComp);
                    c.doFinalTasks((ASTSnapshotClass) e);
                }

                ((ASTSnapshotClass) e).doFinalTasks();
            }
            else if (e instanceof ASTTransitionClass) {
                if (((ASTTransitionClass) e).isParentClass) {
                    ASTAssociation beforeTrans = new ASTAssociation();
                    beforeTrans.setField("name", "beforeTransition"); 
                    ASTProperty beforeS = new ASTProperty();
                    beforeS.setField("name", "beforeS");
                    beforeS.setField("lower", "1");
                    beforeS.setField("upper", "1");
                    beforeS.setType(ownedElements.get(0));
                    ASTProperty nextT = new ASTProperty();
                    nextT.setField("name", "nextT");
                    nextT.setField("lower", "0");
                    nextT.setField("upper", "1");
                    nextT.setType(e);
                    beforeTrans.addMemberEnds(beforeS);
                    beforeTrans.addMemberEnds(nextT);
                    
                    ASTAssociation afterTrans = new ASTAssociation();
                    afterTrans.setField("name", "afterTransition");
                    ASTProperty nextS = new ASTProperty();
                    nextS.setField("name", "nextS");
                    nextS.setField("lower", "1");
                    nextS.setField("upper", "1");
                    nextS.setType(ownedElements.get(0));
                    ASTProperty beforeT = new ASTProperty();
                    beforeT.setField("name", "beforeT");
                    beforeT.setField("lower", "0");
                    beforeT.setField("upper", "1");
                    beforeT.setType(e);
                    afterTrans.addMemberEnds(nextS);
                    afterTrans.addMemberEnds(beforeT);
                    
                    newAssociations.add(beforeTrans);
                    newAssociations.add(afterTrans);
                }

                ((ASTTransitionClass) e).doFinalTasks();
            }
            else if (e instanceof ASTAssociation) {
                Boolean allComponents = true;
                for (ASTProperty end1 : ((ASTAssociation) e).getMemberEnds()) {
                    ArrayList<String> expBodyParts = new ArrayList<String>();
                    ASTConstraint validLinking = new ASTConstraint("inv");
                    for (ASTProperty end2 : ((ASTAssociation) e).getMemberEnds()) {
                        if (end2.getType() instanceof ASTSnapshotClass || end2.getType() instanceof ASTTransitionClass) {
                            allComponents = false;
                            break;
                        }
                        if (end2.getType().getName().equals(end1.getType().getName())) {
                            continue;
                        }
                        String snapRoleName = end2.getType().getName().toLowerCase();
                        String roleName = end2.getName();
                        expBodyParts.add("Set{self.snapshot."+snapRoleName+"}->flatten()->includesAll(Set{self."+roleName+"}->flatten())");
                    }
                    if (allComponents) {
                        validLinking.setField("name", "validLinking_"+e.getName());
                        validLinking.setField("body", String.join(" and ", expBodyParts));
                        ((ASTComponentClass) end1.getType()).addInv(validLinking);
                    }
                    allComponents = true;
                }
            }
        }

        ownedElements.addAll(newAssociations);
    }

    public void assignTypes() {
        for (ASTClassifier e : ownedElements) {
            if (e instanceof ASTSnapshotClass) {
                for (ASTProperty a : ((ASTSnapshotClass) e).getAttributes()) {
                    if (a.getTypeIndex() != null) a.setType(findType(a.getTypeIndex()));
                }
                for (ASTQueryOperation o : ((ASTSnapshotClass) e).getQueryOps()) {
                    if (o.getTypeIndex() != null) o.setType(findType(o.getTypeIndex()));
                    for (ASTParameter p : o.getParameters()) {
                        if (p.getTypeIndex() != null) p.setType(findType(p.getTypeIndex()));
                    }
                }
                for (ASTComponentClass c : ((ASTSnapshotClass) e).getComponents()){
                    for (ASTProperty a : c.getAttributes()) {
                        if (a.getTypeIndex() != null) a.setType(findType(a.getTypeIndex()));
                    }
                    for (ASTQueryOperation o : c.getQueryOps()) {
                        if (o.getTypeIndex() != null) o.setType(findType(o.getTypeIndex()));
                        for (ASTParameter p : o.getParameters()) {
                            if (p.getTypeIndex() != null) p.setType(findType(p.getTypeIndex()));
                        }
                    }
                    if (c.getSuperTypeIndex() != null) {
                        ASTClassifier type = findType(c.getSuperTypeIndex());
                        c.setSuperType(type);
                    }
                }
                if (((ASTSnapshotClass) e).getSuperTypeIndex() != null) {
                    ASTClassifier type = findType(((ASTSnapshotClass) e).getSuperTypeIndex());
                    ((ASTSnapshotClass) e).setSuperType(type);
                }
            }
            if (e instanceof ASTAssociation) {
                for (ASTProperty m : ((ASTAssociation) e).getMemberEnds()) {
                    if (m.getTypeIndex() != null) m.setType(findType(m.getTypeIndex()));
                }
            }
            if (e instanceof ASTTransitionClass) {
                for (ASTProperty a : ((ASTTransitionClass) e).getAttributes()) {
                    if (a.getTypeIndex() != null) a.setType(findType(a.getTypeIndex()));
                }
                if (((ASTTransitionClass) e).getSuperTypeIndex() != null) {
                    ASTClassifier type = findType(((ASTTransitionClass) e).getSuperTypeIndex());
                    ((ASTTransitionClass) e).setSuperType(type);
                }
            }
        }
    }

    public ASTClassifier findType(String i) {

        Pattern integerPattern = Pattern.compile("\\d+");
        Matcher matcher = integerPattern.matcher(i);

        ArrayList<Integer> indexes = new ArrayList<>();
        while (matcher.find()) {
            indexes.add(Integer.parseInt(matcher.group()));
        }
        if (indexes.size() == 3) {
            ASTClassifier type = ((ASTSnapshotClass) ownedElements.get(indexes.get(1)))
                    .getComponents().get(indexes.get(2));
            return type;
        } else if (indexes.size() == 2) {
            return ownedElements.get(indexes.get(1));
        } else return null;
    }

    public void addElem(ASTClassifier e) {
        ownedElements.add(e);
    }

    public ArrayList<ASTClassifier> getOwnedElements() {
        return ownedElements;
    }
    
    public String toString() {
        String elemText = "";
        String constrText = "";
        for (ASTClassifier e : ownedElements) {
            if (e.getClass() == ASTClassifier.class) continue;
            elemText = elemText.concat(e.toString());
        }
        for (ASTClassifier e : ownedElements) {
            constrText = constrText.concat(e.getConstrText());
        }
        if (constrText.length() > 0) constrText = "constraints\n".concat(constrText);
        return "model "+name+"\n\n"+elemText+"\n"+constrText+"\n";
    }
}
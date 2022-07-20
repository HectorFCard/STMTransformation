package org.tzi.use.STMPlugin.logic.xml2use.ast;

import org.tzi.use.STMPlugin.logic.xml2use.XMLParser;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.*;

import java.util.ArrayList;
import java.util.HashMap;

public class UMLModel extends ASTModel {
    ArrayList<ASTClassifier> packagedElements = new ArrayList<ASTClassifier>();
    HashMap<String, ASTClassifier> types = new HashMap<String, ASTClassifier>();
    Boolean ignoredElem;

    public void enterElem(XMLParser.ElementContext ctx) {
        switch (ctx.Name(0).getText()) {
            case "packagedElement" -> {
                String classifierType = ctx.attribute(0).STRING().getText();
                classifierType = classifierType.substring(1, classifierType.length() - 1);
                switch (classifierType) {
                    case "uml:Class" -> {
                        processedElements.add(new ASTClass());
                        ignoredElem = false;
                    }
                    case "uml:Association" -> {
                        processedElements.add(new ASTAssociation());
                        ignoredElem = false;
                    }
                    case "uml:Enumeration" -> {
                        processedElements.add(new ASTEnumeration());
                        ignoredElem = false;
                    }
                    case "uml:PrimitiveType" -> {
                        processedElements.add(new ASTClassifier());
                        ignoredElem = false;
                    }
                    default -> ignoredElem = true;
                }
                if (!ignoredElem) {
                    String id = ctx.attribute(1).STRING().getText();
                    id = id.substring(1, id.length() - 1);
                    types.put(id, (ASTClassifier) processedElements.lastElement());
                }
            }
            case "ownedAttribute", "ownedEnd" -> {
                processedElements.add(new ASTProperty());
            }
            case "ownedOperation" -> {
                processedElements.add(new ASTOperation());
            }
            case "ownedParameter" -> {
                processedElements.add(new ASTParameter());
            }
            case "ownedRule" -> {
                if (processedElements.lastElement() instanceof ASTClass) {
                    processedElements.add(new ASTConstraint("inv"));
                }
                else if (processedElements.lastElement() instanceof ASTOperation) {
                    String id = ctx.attribute(0).STRING().getText();
                    id = id.substring(1, id.length() - 1);
                    processedElements.add(new ASTConstraint(
                            ((ASTOperation) processedElements.lastElement()).findConditionType(id)));
                }
            }
            case "ownedLiteral" -> {
                processedElements.add(new ASTEnumLiteral());
            }
            default -> {}
        }
    }

    public void exitElem(XMLParser.ElementContext ctx) {
        switch (ctx.Name(0).getText()) {
            case "packagedElement" -> {
                addElem((ASTClassifier) processedElements.lastElement());
                processedElements.pop();
            }
            case "ownedAttribute" -> {
                ASTProperty newAttr = (ASTProperty) processedElements.pop();
                if (processedElements.lastElement() instanceof ASTClass) {
                    ((ASTClass) processedElements.lastElement()).addAttribute(newAttr);
                }
            }
            case "ownedOperation" -> {
                ASTOperation newOp = (ASTOperation) processedElements.pop();
                ((ASTClass) processedElements.lastElement()).addOperation(newOp);
            }
            case "ownedParameter" -> {
                ASTParameter newParam = (ASTParameter) processedElements.pop();
                ((ASTOperation) processedElements.lastElement()).addParameter(newParam);
            }
            case "lowerValue" -> {
                if ( processedElements.lastElement() instanceof  ASTProperty) {
                    String lower = ctx.attribute(2).STRING().getText();
                    lower = lower.substring(1, lower.length()-1);
                    ((ASTProperty) processedElements.lastElement())
                            .setField("lower", lower);
                }
            }
            case "upperValue" -> {
                if ( processedElements.lastElement() instanceof  ASTProperty) {
                    String upper = ctx.attribute(2).STRING().getText();
                    upper = upper.substring(1, upper.length()-1);
                    ((ASTProperty) processedElements.lastElement())
                            .setField("upper", upper);
                }
            }
            case "ownedRule" -> {
                ASTConstraint newContr = (ASTConstraint) processedElements.pop();
                if (processedElements.lastElement() instanceof ASTClass) {
                    ((ASTClass) processedElements.lastElement()).addInv(newContr);
                }
                else if (processedElements.lastElement() instanceof ASTOperation) {
                    ((ASTOperation) processedElements.lastElement()).addCondition(newContr);
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
            default -> {}
        }
    }

    public void doFinalTasks() {
        assignTypes();
    }

    public void assignTypes() {
        for (ASTClassifier e : packagedElements) {
            if (e instanceof ASTClass) {
                for (ASTProperty a : ((ASTClass) e).getAttributes()) {
                    if (a.getTypeIndex() != null) a.setType(findType(a.getTypeIndex()));
                }
                for (ASTOperation o : ((ASTClass) e).getQueryOps()) {
                    if (o.getTypeIndex() != null) o.setType(findType(o.getTypeIndex()));
                    for (ASTParameter p : o.getParameters()) {
                        if (p.getTypeIndex() != null) p.setType(findType(p.getTypeIndex()));
                    }
                }
                if (((ASTClass) e).getSuperTypeIndex() != null) {
                    ASTClassifier type = findType(((ASTClass) e).getSuperTypeIndex());
                    ((ASTClass) e).setSuperType(type);
                }
            }
            if (e instanceof ASTAssociation) {
                for (ASTProperty m : ((ASTAssociation) e).getMemberEnds()) {
                    if (m.getTypeIndex() != null) m.setType(findType(m.getTypeIndex()));
                }
            }
        }
    }

    public ASTClassifier findType(String i) {
        if (types.get(i) != null) {
            return types.get(i);
        } else return null;
    }
    
    public void addElem(ASTClassifier e) {
        packagedElements.add(e);
    }

    public ArrayList<ASTClassifier> getOwnedElements() {
        return packagedElements;
    }
    
    public String toString() {
        String elemText = "";
        String constrText = "";
        for (ASTClassifier e : packagedElements) {
            if (e.getClass() == ASTClassifier.class) continue;
            elemText = elemText.concat(e.toString());
        }
        for (ASTClassifier e : packagedElements) {
            constrText = constrText.concat(e.getConstrText());
        }
        if (constrText.length() > 0) constrText = "constraints\n".concat(constrText);
        return "model "+name+"\n\n"+elemText+"\n"+constrText+"\n";
    }
}
package org.tzi.use.STMPlugin.logic.uml2stm.stm2use.ast;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ASTModel {
    String name;
    ArrayList<ASTClassifier> ownedElements = new ArrayList<ASTClassifier>();

    public void doFinalTasks() {
        ArrayList<ASTAssociation> newAssociations = new ArrayList<ASTAssociation>();

        for (ASTClassifier e : ownedElements) {
            if (e instanceof ASTSnapshotClass && ((ASTSnapshotClass) e).getComponents().size() > 0) {
                ASTProperty snapEnd = new ASTProperty();
                snapEnd.setField("name", "snapshot");
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
                    newComp.addMemberEnds(snapEnd);
                    newComp.addMemberEnds(classEnd);

                    newAssociations.add(newComp);
                    c.doFinalTasks();
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

                    ((ASTTransitionClass) e).doFinalTasks();
                }
            }
        }

        ownedElements.addAll(newAssociations);
        assignTypes();
    }

    public void assignTypes() {
        for (ASTClassifier e : ownedElements) {
            if (e instanceof ASTSnapshotClass) {
                for (ASTProperty a : ((ASTSnapshotClass) e).getAttributes()) {
                    if (a.getTypeIndex() != null) a.setType(findType(a.getTypeIndex()));
                }
                for (ASTQueryOperation o : ((ASTSnapshotClass) e).getQueryOps()) {
                    if (o.getTypeIndex() != null) o.setType(findType(o.getTypeIndex()));
                }
                for (ASTComponentClass c : ((ASTSnapshotClass) e).getComponents()){
                    for (ASTProperty a : c.getAttributes()) {
                        if (a.getTypeIndex() != null) a.setType(findType(a.getTypeIndex()));
                    }
                    for (ASTQueryOperation o : c.getQueryOps()) {
                        if (o.getTypeIndex() != null) o.setType(findType(o.getTypeIndex()));
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
            return ((ASTSnapshotClass) ownedElements.get(indexes.get(1)))
                .getComponents().get(indexes.get(2));
        } else if (indexes.size() == 2) {
            return ownedElements.get(indexes.get(1));
        } else return null;
    }

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
    }

    public String getName() {
        return name;
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
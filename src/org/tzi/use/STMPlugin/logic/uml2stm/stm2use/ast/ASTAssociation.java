package org.tzi.use.STMPlugin.logic.uml2stm.stm2use.ast;

import java.util.ArrayList;

public class ASTAssociation extends ASTClassifier {
    ArrayList<ASTProperty> memberEnds = new ArrayList<ASTProperty>();

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("isAbstract")) isAbstract = Boolean.parseBoolean(fieldValue);
    }

    public void addMemberEnds(ASTProperty m) {
        memberEnds.add(m);
    }

    public ArrayList<ASTProperty> getMemberEnds() {
        return memberEnds;
    }

    public String toString() {
        String abs = (isAbstract) ? "abstract " : "";
        String memEnds = "";
        for (ASTProperty m : memberEnds) {
            memEnds = memEnds.concat(m.getType().getName()+"["+m.getLower()+".."+m.getUpper()+"] role "+m.getName()+"\n");
        }
        return abs+"association "+name+" between\n"+memEnds+"end\n";
    }
}
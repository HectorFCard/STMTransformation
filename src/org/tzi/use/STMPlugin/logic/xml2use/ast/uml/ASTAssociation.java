package org.tzi.use.STMPlugin.logic.xml2use.ast.uml;

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
        String aggKind = "none";
        for (ASTProperty m : memberEnds) {
            memEnds = memEnds.concat(m.getType().getName()+
                "["+((m.getLower() != m.getUpper()) ? m.getLower()+".." : "")
                +((m.getUpper() > -1) ? m.getUpper() : "*")+"] role "+m.getName()+"\n");
            if (m.aggregationKind().equals("composite")) aggKind = "composition ";
            else if (m.aggregationKind().equals("shared")) aggKind = "aggregation ";
        }
        return abs+((aggKind.equals("none")) ? "association " : aggKind)+name+" between\n"+memEnds+"end\n";
    }
}
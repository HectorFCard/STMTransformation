package org.tzi.use.STMPlugin.logic.uml2stm.stm2use.ast;

import java.util.ArrayList;

public class ASTQueryOperation {
    String name;
    String typeIndex;
    ASTClassifier type;
    Integer lower;
    Integer upper;
    ArrayList<ASTParameter> parameters = new ArrayList<ASTParameter>();
    ArrayList<ASTConstraint> conditions = new ArrayList<ASTConstraint>();

    public void setType(ASTClassifier t) { type = t; }

    public String getTypeIndex() { return typeIndex; }

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("type")) typeIndex = fieldValue;
        else if (fieldName.equals("lower")) lower = Integer.parseInt(fieldValue);
        else if (fieldName.equals("upper")) upper = Integer.parseInt(fieldValue);
    }

    public void addParameter(ASTParameter p) {
        parameters.add(p);
    }

    public void addCondition(ASTConstraint c) {
        conditions.add(c);
    }

    public String getCondText() {
        String conds = "";
        for (ASTConstraint c : conditions) {
            conds = conds.concat(c.toString());
        }
        return conds;
    }

    public String toString() {
        String typeName = "";
        if (type != null) {
            typeName = " : "+type.getName();
            if (type.getName().toLowerCase().equals("void")) typeName = "";
        }
        else if (upper > 1) typeName = "Set("+typeName+")";
        ArrayList<String> params = new ArrayList<String>();
        for (ASTParameter p : parameters) {
            params.add(p.toString());
        }
        String paramText = "";
        if (params.size() > 0) paramText = String.join(", ", params);
        return name+"("+paramText+")"+typeName;
    }
}
package org.tzi.use.STMPlugin.logic.xml2use.ast.stm;

import java.util.ArrayList;

public class ASTQueryOperation {
    String name;
    String typeIndex;
    ASTClassifier type;
    Integer lower;
    Integer upper;
    ASTConstraint bodyCondition = null;
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

    public ArrayList<ASTParameter> getParameters() {
        return parameters;
    }

    public void addCondition(ASTConstraint c) {
        conditions.add(c);
        if (c.getType().equals("body")) bodyCondition = c;
    }

    public String getCondText() {
        String conds = "";
        for (ASTConstraint c : conditions) {
            if (!c.getType().equals("body")) conds = conds.concat(c.toString());
        }
        return conds;
    }

    public String toString() {
        return toString(false);
    }

    public String toString(Boolean includeBody) {
        String typeName = "";
        if (type != null && !type.getName().toLowerCase().equals("void")) {
            if (upper > 1 || upper < 0) typeName = " : Set("+type.getName()+")";
            else typeName = " : "+type.getName();
        }
        ArrayList<String> params = new ArrayList<String>();
        String paramText = "";
        for (ASTParameter p : parameters) {
            params.add(p.toString());
        }
        if (params.size() > 0) paramText = String.join(", ", params);
        return name+"("+paramText+")"+typeName+
            ((bodyCondition != null && includeBody) ? " = "+bodyCondition.toString() : "");
    }
}
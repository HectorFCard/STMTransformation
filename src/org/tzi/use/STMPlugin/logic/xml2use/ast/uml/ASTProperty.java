package org.tzi.use.STMPlugin.logic.xml2use.ast.uml;

public class ASTProperty {
    String name = null;
    ASTClassifier type;
    String typeIndex = null;
    Integer lower = 1;
    Integer upper = 1;
    Boolean isDerived = false;
    String aggregation = "none";

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("type")) typeIndex = fieldValue;
        else if (fieldName.equals("lower")) lower = Integer.parseInt(fieldValue);
        else if (fieldName.equals("upper")) try { upper = Integer.parseInt(fieldValue); } catch (NumberFormatException e) { upper = -1; }
        else if (fieldName.equals("isDerived")) isDerived = Boolean.parseBoolean(fieldValue);
        else if (fieldName.equals("aggregation")) aggregation = fieldValue;
    }

    public String getName() { return name; }

    public void setType(ASTClassifier t) { type = t; }
    
    public ASTClassifier getType() {
        if (type != null) {
            if (type.getName().equals("Void")) {
                return null;
            }
        }
        return type;
    }
    public String getTypeIndex() { return typeIndex; }
    public Integer getLower() { return lower; }
    public Integer getUpper() { return upper; }
    public Boolean isDerived() { return isDerived; }
    public String aggregationKind() { return aggregation; }
}
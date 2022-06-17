package org.tzi.use.logic.uml2stm.stm2use.ast;

public class ASTClassifier {
    String name;
    String superTypeIndex;
    Boolean isAbstract = false;
    ASTClassifier superType;

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("general")) superTypeIndex = fieldValue;
        else if (fieldName.equals("isAbstract")) isAbstract = Boolean.parseBoolean(fieldValue);
    }

    public void setSuperType(ASTClassifier t) {
        superType = t;
    }

    public String getSuperTypeIndex() {
        return superTypeIndex;
    }

    public String getConstrText() {
        return "";
    }
    
    public String getName() {
        return name;
    }
}

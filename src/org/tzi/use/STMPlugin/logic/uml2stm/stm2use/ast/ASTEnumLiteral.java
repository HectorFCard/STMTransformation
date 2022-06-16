package org.tzi.use.logic.uml2stm.stm2use.ast;

public class ASTEnumLiteral {
    String name;

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
    }

    public String getName() { return name; }
}
package org.tzi.use.STMPlugin.logic.xml2use.ast.uml;

public class ASTEnumLiteral {
    String name;

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
    }

    public String getName() { return name; }
}
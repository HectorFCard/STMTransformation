package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTEnumLiteralExp extends ASTLiteralExp {
    public ASTEnumLiteralExp(String t, String l) {
            super("Enumeration");
            type = t;
            literal = l;
    }

    String type;
    String literal;
}
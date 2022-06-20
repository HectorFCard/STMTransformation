package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTNullLiteralExp extends ASTPrimitiveLiteralExp {
    public ASTNullLiteralExp() {
        super("OclNull");
    }

    String value = "null";
}
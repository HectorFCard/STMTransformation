package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTInvalidLiteralExp extends ASTPrimitiveLiteralExp {
    public ASTInvalidLiteralExp () {
        super("OclInvalid");
    }

    String value = "invalid";
}
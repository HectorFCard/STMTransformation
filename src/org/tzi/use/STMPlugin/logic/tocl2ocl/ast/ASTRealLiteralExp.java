package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTRealLiteralExp extends ASTPrimitiveLiteralExp {
    public ASTRealLiteralExp(String v) {
        super("Real");
        value =  Float.parseFloat(v);
    }

    Float value;
}
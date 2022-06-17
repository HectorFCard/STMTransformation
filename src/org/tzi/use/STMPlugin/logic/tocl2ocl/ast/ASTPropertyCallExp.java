package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTPropertyCallExp extends ASTCallExp{
    public ASTPropertyCallExp(ASTOclExpression src, String n, Boolean p) {
            super(src);
            attributeName = n;
            isPre = p;
    }

    String attributeName;
    Boolean isPre;
}
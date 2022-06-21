package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTAssociationClassCallExp extends ASTCallExp{
    public ASTAssociationClassCallExp(ASTOclExpression src, String n, String a) {
            super(src);
            className = n;
            args = a;
    }

    String className;
    String args;
}
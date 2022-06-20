package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTCallExp extends ASTOclExpression {
    public ASTCallExp(ASTOclExpression s){
        super(null);
        src = s;
    }

    protected ASTOclExpression src;
}
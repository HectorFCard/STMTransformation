package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTVariableExp extends ASTOclExpression{
    public ASTVariableExp(ASTVariableDeclaration d) {
        super(d.getType().getName());
        declaration = d;
    }

    ASTVariableDeclaration declaration;
}
package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTBinaryOperationExp extends ASTOclExpression{
    public ASTBinaryOperationExp(String op, ASTOclExpression l, ASTOclExpression r) {
        super("Boolean");
        operation = op;
        left = l;
        right = r;
    }

    ASTOclExpression left;
    ASTOclExpression right;
    String operation;
}
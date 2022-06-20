package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

import java.util.List;

public class ASTOperationCallExp extends ASTCallExp{
    public ASTOperationCallExp(ASTOclExpression src, String n, List<ASTOclExpression> a) {
            super(src);
            operationName = n;
            args = a;
    }

    String operationName;
    List<ASTOclExpression> args;
}
package org.tzi.use.STMPlugin.logic.optimization;

import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.expr.*;

import java.util.HashSet;

public class ExpressionAnalyzer implements ExpressionVisitor {
    MModel model;
    HashSet<MModelElement> DRElems;

    public HashSet<MModelElement> findDREs(MModel m, Expression exp) {
        model = m;
        DRElems = new HashSet<MModelElement>();
        exp.processWithVisitor(this);
        return DRElems;
    }

    private void visitCollectionLiteral(ExpCollectionLiteral exp) {
        for (Expression elemExp : exp.getElemExpr()) {
            elemExp.processWithVisitor(this);
        }
    }

    @Override
    public void visitAllInstances(ExpAllInstances exp) {}

    @Override
    public void visitAny(ExpAny exp) {
        visitQuery(exp);
    }

    @Override
    public void visitAsType(ExpAsType exp) {
        if (model.getClassifier(exp.getTargetType().shortName()) != null)
            DRElems.add(model.getClassifier(exp.getTargetType().shortName()));
        exp.getSourceExpr().processWithVisitor(this);
    }

    @Override
    public void visitAttrOp(ExpAttrOp exp) {
        DRElems.add(exp.attr());
        DRElems.add(exp.attr().owner());
        if (model.getClassifier(exp.attr().type().shortName()) != null)
            DRElems.add(model.getClassifier(exp.attr().type().shortName()));
        exp.objExp().processWithVisitor(this);
    }

    @Override
    public void visitBagLiteral(ExpBagLiteral exp) {
        visitCollectionLiteral(exp);
    }

    @Override
    public void visitCollect(ExpCollect exp) {
        visitQuery(exp);
    }

    @Override
    public void visitCollectNested(ExpCollectNested exp) {
        visitQuery(exp);
    }

    @Override
    public void visitConstBoolean(ExpConstBoolean exp) {}

    @Override
    public void visitConstEnum(ExpConstEnum exp) {
        if (model.enumType(exp.type().shortName()) != null)
            DRElems.add(model.enumType(exp.type().shortName()));
    }

    @Override
    public void visitConstInteger(ExpConstInteger exp) {}

    @Override
    public void visitConstReal(ExpConstReal exp) {}

    @Override
    public void visitConstString(ExpConstString exp) {}

    @Override
    public void visitEmptyCollection(ExpEmptyCollection exp) {}

    @Override
    public void visitExists(ExpExists exp) {
        visitQuery(exp);
    }

    @Override
    public void visitForAll(ExpForAll exp) {
        visitQuery(exp);
    }

    @Override
    public void visitIf(ExpIf exp) {
        exp.getCondition().processWithVisitor(this);
        exp.getThenExpression().processWithVisitor(this);
        exp.getElseExpression().processWithVisitor(this);
    }

    @Override
    public void visitIsKindOf(ExpIsKindOf exp) {
        exp.getSourceExpr().processWithVisitor(this);
    }

    @Override
    public void visitIsTypeOf(ExpIsTypeOf exp) {
        if (model.getClassifier(exp.getTargetType().shortName()) != null)
            DRElems.add(model.getClassifier(exp.getTargetType().shortName()));
        exp.getSourceExpr().processWithVisitor(this);
    }

    @Override
    public void visitIsUnique(ExpIsUnique exp) {
        visitQuery(exp);
    }

    @Override
    public void visitIterate(ExpIterate exp) {
        visitQuery(exp, exp.getAccuInitializer());
    }

    @Override
    public void visitLet(ExpLet exp) {
        if (model.getClassifier(exp.getVarType().shortName()) != null)
            DRElems.add(model.getClassifier(exp.getVarType().shortName()));
        exp.getVarExpression().processWithVisitor(this);
        exp.getInExpression().processWithVisitor(this);
    }

    @Override
    public void visitNavigation(ExpNavigation exp) {
        DRElems.add(exp.getDestination().association());
        DRElems.add(exp.getSource().cls());
        DRElems.add(exp.getDestination().cls());
        DRElems.addAll(exp.getDestination().association().associationEnds());

        exp.getObjectExpression().processWithVisitor(this);

        MClass src = exp.getSource().cls();
        MClass dest = exp.getDestination().cls();
        int endsRequired = src.equals(dest) ? 2 : 1;

        if(exp.getQualifierExpression().length > 0){
            for(Expression e : exp.getQualifierExpression()){
                e.processWithVisitor(this);
            }
        }
    }

    @Override
    public void visitNavigationClassifierSource(ExpNavigationClassifierSource exp) {
        exp.getObjectExpression().processWithVisitor(this);
    }

    @Override
    public void visitObjAsSet(ExpObjAsSet exp) {
        exp.getObjectExpression().processWithVisitor(this);
    }

    @Override
    public void visitObjOp(ExpObjOp exp) {
        DRElems.add(exp.getOperation());
        DRElems.add(exp.getOperation().cls());

        exp.getOperation().paramList().processWithVisitor(this);
        ExpressionAnalyzer bodyAnalyzer = new ExpressionAnalyzer();
        DRElems.addAll(bodyAnalyzer.findDREs(model, exp.getOperation().expression()));
        exp.getArguments()[0].processWithVisitor(this);
        for (int i = 1; i < exp.getArguments().length; ++i) {
            exp.getArguments()[i].processWithVisitor(this);
        }
    }

    @Override
    public void visitObjRef(ExpObjRef exp) {}

    @Override
    public void visitOne(ExpOne exp) {
        visitQuery(exp);
    }

    @Override
    public void visitOrderedSetLiteral(ExpOrderedSetLiteral exp) {
        visitCollectionLiteral(exp);
    }

    private void visitQuery(ExpQuery exp, VarInitializer accuInitializer) {
        exp.getRangeExpression().processWithVisitor(this);
        exp.getVariableDeclarations().processWithVisitor(this);
        if (accuInitializer != null) {
            accuInitializer.getVarDecl().processWithVisitor(this);
            accuInitializer.initExpr().processWithVisitor(this);
        }
        exp.getQueryExpression().processWithVisitor(this);
    }

    @Override
    public void visitQuery(ExpQuery exp) {
        visitQuery(exp, null);
    }

    @Override
    public void visitReject(ExpReject exp) {
        visitQuery(exp);
    }

    @Override
    public void visitWithValue(ExpressionWithValue exp) {}

    @Override
    public void visitSelect(ExpSelect exp) {
        visitQuery(exp);
    }

    @Override
    public void visitSequenceLiteral(ExpSequenceLiteral exp) {
        visitCollectionLiteral(exp);
    }

    @Override
    public void visitSetLiteral(ExpSetLiteral exp) {
        visitCollectionLiteral(exp);
    }

    @Override
    public void visitSortedBy(ExpSortedBy exp) {
        visitQuery(exp);
    }

    @Override
    public void visitStdOp(ExpStdOp exp) {
        Expression[] args = exp.args();
        String operationName;

        if(exp.getOperation().isInfixOrPrefix()){
            if(args.length == 1){
                args[0].processWithVisitor(this);
            } else { // Infix has two arguments
                args[0].processWithVisitor(this);
                args[1].processWithVisitor(this);
            }
        } else {
            if(args.length != 0) {
                args[0].processWithVisitor(this);
                if(args.length > 1){
                    for(int i = 1; i < args.length; i++){
                        args[i].processWithVisitor(this);
                    }
                }
            }
        }
    }

    @Override
    public void visitTupleLiteral(ExpTupleLiteral exp) {
        for(ExpTupleLiteral.Part p : exp.getParts()){
            p.getExpression().processWithVisitor(this);
        }
    }

    @Override
    public void visitTupleSelectOp(ExpTupleSelectOp exp) {
        exp.getTupleExp().processWithVisitor(this);
    }

    @Override
    public void visitUndefined(ExpUndefined exp) {}

    @Override
    public void visitVariable(ExpVariable exp) {}

    @Override
    public void visitClosure(ExpClosure exp) {
        visitQuery(exp);
    }

    @Override
    public void visitOclInState(ExpOclInState exp) {
        exp.getSourceExpr().processWithVisitor(this);
    }

    @Override
    public void visitVarDeclList(VarDeclList varDeclList) {
        for (int i = 0; i < varDeclList.size(); ++i) {
            varDeclList.varDecl(i).processWithVisitor(this);
        }
    }

    @Override
    public void visitVarDecl(VarDecl varDecl) {
        if (model.getClassifier(varDecl.type().shortName()) != null)
            DRElems.add(model.getClassifier(varDecl.type().shortName()));
    }

    @Override
    public void visitObjectByUseId(ExpObjectByUseId expObjectByUseId) {
        expObjectByUseId.processWithVisitor(this);
    }

    @Override
    public void visitConstUnlimitedNatural(ExpConstUnlimitedNatural expressionConstUnlimitedNatural) {}

    @Override
    public void visitSelectByKind(ExpSelectByKind expSelectByKind) {
        expSelectByKind.getSourceExpression().processWithVisitor(this);
    }

    @Override
    public void visitExpSelectByType(ExpSelectByType expSelectByType) {
        visitSelectByKind(expSelectByType);
    }

    @Override
    public void visitRange(ExpRange exp) {
        exp.getStart().processWithVisitor(this);
        exp.getEnd().processWithVisitor(this);
    }
}

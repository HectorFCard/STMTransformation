package org.tzi.use.STMPlugin.logic.optimization;

import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.mm.commonbehavior.communications.MSignal;
import org.tzi.use.uml.ocl.expr.*;
import org.tzi.use.uml.ocl.type.EnumType;

import java.util.HashSet;

public class MOptimizationVisitor implements MMVisitor {
    HashSet<MModelElement> DRElems = new HashSet<MModelElement>();
    MClassInvariant inputConstraint;
    Expression inputExpression;

    MOptimizationVisitor(HashSet<MModelElement> DREs) {
        DRElems = DREs;
    }

    @Override
    public void visitAnnotation(MElementAnnotation a) {

    }

    @Override
    public void visitAssociation(MAssociation e) {

    }

    @Override
    public void visitAssociationClass(MAssociationClass e) {

    }

    @Override
    public void visitAssociationEnd(MAssociationEnd e) {

    }

    @Override
    public void visitAttribute(MAttribute e) {

    }

    @Override
    public void visitClass(MClass e) {

    }

    @Override
    public void visitClassInvariant(MClassInvariant e) {

    }

    @Override
    public void visitGeneralization(MGeneralization e) {

    }

    @Override
    public void visitModel(MModel e) {

    }

    @Override
    public void visitOperation(MOperation e) {

    }

    @Override
    public void visitPrePostCondition(MPrePostCondition e) {

    }

    @Override
    public void visitSignal(MSignal mSignalImpl) {

    }

    @Override
    public void visitEnum(EnumType enumType) {

    }
}
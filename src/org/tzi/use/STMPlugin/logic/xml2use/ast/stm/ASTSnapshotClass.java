package org.tzi.use.STMPlugin.logic.xml2use.ast.stm;

import java.util.ArrayList;

public class ASTSnapshotClass extends ASTClassifier {
    ArrayList<ASTProperty> attributes = new ArrayList<ASTProperty>();
    ArrayList<ASTQueryOperation> queryOps = new ArrayList<ASTQueryOperation>();
    ArrayList<ASTConstraint> invariants = new ArrayList<ASTConstraint>();
    ArrayList<ASTComponentClass> components = new ArrayList<ASTComponentClass>();

    public void doFinalTasks() {
        ASTQueryOperation getNext = new ASTQueryOperation();
        getNext.setField("name", "getNext");
        getNext.setField("lower", "0");
        getNext.setField("upper", "1");
        getNext.setType(this);
        ASTConstraint bodyCond = new ASTConstraint("body");
        bodyCond.setField("body", "self.nextT.nextS");
        getNext.addCondition(bodyCond);
        addOperation(getNext);

        ASTQueryOperation getPost = new ASTQueryOperation();
        getPost.setField("name", "getPost");
        getPost.setField("lower", "0");
        getPost.setField("upper", "-1");
        getPost.setType(this);
        bodyCond = new ASTConstraint("body");
        bodyCond.setField("body", "Set{self.getNext()}->closure(getNext())->excluding(null)");
        getPost.addCondition(bodyCond);
        addOperation(getPost);

        ASTQueryOperation getPrevious = new ASTQueryOperation();
        getPrevious.setField("name", "getPrevious");
        getPrevious.setField("lower", "0");
        getPrevious.setField("upper", "1");
        getPrevious.setType(this);
        bodyCond = new ASTConstraint("body");
        bodyCond.setField("body", "self.beforeT.beforeS");
        getPrevious.addCondition(bodyCond);
        addOperation(getPrevious);

        ASTQueryOperation getPre = new ASTQueryOperation();
        getPre.setField("name", "getPre");
        getPre.setField("lower", "0");
        getPre.setField("upper", "-1");
        getPre.setType(this);
        bodyCond = new ASTConstraint("body");
        bodyCond.setField("body", "Set{self.getPrevious()}->closure(getPrevious())->excluding(null)");
        getPre.addCondition(bodyCond);
        addOperation(getPre);

        ASTQueryOperation sat = new ASTQueryOperation();
        sat.setField("name", "sat");
        sat.setField("lower", "0");
        sat.setField("upper", "1");
        ASTClassifier b = new ASTClassifier();
        b.setField("name", "Boolean");
        sat.setType(b);
        ASTClassifier oclAny = new ASTClassifier();
        oclAny.setField("name", "OclAny");
        ASTParameter exp = new ASTParameter();
        exp.setField("name", "e");
        exp.setType(oclAny);
        bodyCond = new ASTConstraint("body");
        bodyCond.setField("body", "true");
        sat.addCondition(bodyCond);
        sat.addParameter(exp);
        addOperation(sat);

        ASTConstraint acyclicScenareo = new ASTConstraint("inv");
        acyclicScenareo.setField("name", "acyclicScenareo");
        acyclicScenareo.setField("body", "self.getPost()->excludes(self) and self.getPre()->excludes(self)");
        addInv(acyclicScenareo);
        ASTConstraint sameSnap = new ASTConstraint("inv");
        sameSnap.setField("name", "sameSnapshot");
        sameSnap.setField("body", name+".allInstances()->forAll(s | (self.nextT = s.nextT and self.beforeT = s.beforeT) implies self = s)");
        addInv(sameSnap);
        ASTConstraint oneScenareo = new ASTConstraint("inv");
        oneScenareo.setField("name", "oneScenareo");
        oneScenareo.setField("body", name+".allInstances()->select(oclIsTypeOf(FirstSnapshot))->size() <= 1 and "+name+".allInstances()->select(oclIsTypeOf(LastSnapshot))->size() <= 1");
        addInv(oneScenareo);
        ASTConstraint firstLast = new ASTConstraint("inv");
        firstLast.setField("name", "firstLast");
        firstLast.setField("body", name+".allInstances()->size() > 1 implies (self.beforeT.oclIsUndefined() implies self.oclIsTypeOf(FirstSnapshot) and self.nextT.oclIsUndefined() implies self.oclIsTypeOf(LastSnapshot))");
        addInv(firstLast);
    }

    public ArrayList<ASTProperty> getAttributes() {
        return attributes;
    }

    public void addOperation(ASTQueryOperation o) {
        queryOps.add(o);
    }

    public ArrayList<ASTQueryOperation> getQueryOps() {
        return queryOps;
    }
    
    public void addComponentClass(ASTComponentClass c) {
        components.add(c);
    }

    public ArrayList<ASTComponentClass> getComponents() {
        return components;
    }

    public void addInv(ASTConstraint c) {
        invariants.add(c);
    }

    @Override public String getConstrText() {
        String invs = "";
        for (ASTConstraint i : invariants) {
            invs = invs.concat("context "+name+"\n"+i.toString()+"\n");
        }
        for (ASTQueryOperation o : queryOps) {
            if(o.getCondText().length() > 0)
                invs = invs.concat("context "+name+"::"+o.toString()+"\n"+o.getCondText()+"\n");
        }
        for (ASTComponentClass c : components) {
            if(c.getConstrText().length() > 0)
                invs = invs.concat(c.getConstrText()+"\n");
        }
        return invs;
    }

    public String toString() {
        String abs = (isAbstract) ? "abstract " : "";
        String attrs = "";
        String qOps = "";
        String comps = "";
        String superName = "";
        if (superType != null) superName = " < "+superType.getName(); 
        if (attributes.size() > 0) attrs = "attributes\n";
        for (ASTProperty a : attributes) {
            attrs = attrs.concat(a.getName()+" : "+a.getType().getName()+"\n");
        }
        if (queryOps.size() > 0) qOps = "operations\n"; 
        for (ASTQueryOperation o : queryOps) {
            qOps = qOps.concat(o.toString(true)+"\n");
        }
        for (ASTComponentClass c : components) {
            comps = comps.concat(c.toString());
        }
        return abs+"class "+name+superName+"\n"+attrs+qOps+"end\n\n"+comps;
    }
}
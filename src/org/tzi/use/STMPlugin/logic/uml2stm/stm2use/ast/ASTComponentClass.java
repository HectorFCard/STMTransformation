package org.tzi.use.STMPlugin.logic.uml2stm.stm2use.ast;

import java.util.ArrayList;

public class ASTComponentClass extends ASTClassifier {
    ArrayList<ASTProperty> attributes = new ArrayList<ASTProperty>();
    ArrayList<ASTQueryOperation> queryOps = new ArrayList<ASTQueryOperation>();
    ArrayList<ASTConstraint> invariants = new ArrayList<ASTConstraint>();

    public void doFinalTasks() {
        String className =  name.toLowerCase();
        String varName = className.substring(0, 1);

        ASTProperty id = new ASTProperty();
        id.setField("name", "_objectId");
        id.setField("lower", "0");
        id.setField("upper", "1");
        ASTClassifier _int = new ASTClassifier();
        _int.setField("name", "Integer");
        id.setType(_int);
        addAttribute(id);

        ASTQueryOperation getCurrSnap = new ASTQueryOperation();
        getCurrSnap.setField("name", "getCurrentSnapshot");
        getCurrSnap.setField("lower", "1");
        getCurrSnap.setField("upper", "1");
        getCurrSnap.setField("type", "0#0");
        ASTConstraint bodyCond = new ASTConstraint("body");
        bodyCond.setField("body", "self.snapshot");
        getCurrSnap.addCondition(bodyCond);
        addOperation(getCurrSnap);

        ASTQueryOperation getNext = new ASTQueryOperation();
        getNext.setField("name", "getNext");
        getNext.setField("lower", "0");
        getNext.setField("upper", "1");
        getNext.setType(this);
        bodyCond = new ASTConstraint("body");
        bodyCond.setField("body",
            "self.snapshot.getNext()."+className+
            "->any("+varName+" | self._objectId = "+varName+"._objectId)");
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
        bodyCond.setField("body",
            "self.snapshot.getPrevious()."+className+
            "->any("+varName+" | self._objectId = "+varName+"._objectId)");
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

        ASTConstraint uniqueIds = new ASTConstraint("inv");
        uniqueIds.setField("name", "uniqueIds");
        uniqueIds.setField("body", name+".allInstances()->forAll("+varName+" : "+name+" | "+varName+"._objectId = self._objectId implies "+varName+" = self)");
        addInv(uniqueIds);
    }

    public void setSuperType(ASTClassifier t) {
        superType = t;
    }

    public String getSuperTypeIndex() {
        return superTypeIndex;
    }
    
    public void addAttribute(ASTProperty a) {
        attributes.add(a);
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
        return invs;
    }

    public String toString() {
        String abs = (isAbstract) ? "abstract " : "";
        String attrs = "";
        String qOps = "";
        String superTypeName = "";
        if (superType != null) superTypeName = " < "+superType.getName();
        if (attributes.size() > 0) attrs = "attributes\n"; 
        for (ASTProperty a : attributes) {
            if (a.aggregation.equals("composite")) continue;
            attrs = attrs.concat(a.getName()+" : "+a.getType().getName()+"\n");
        }
        if (queryOps.size() > 0) qOps = "operations\n"; 
        for (ASTQueryOperation o : queryOps) {
            qOps = qOps.concat(o.toString(true)+"\n");
        }
        return abs+"class "+name+superTypeName+"\n"+attrs+qOps+"end\n\n";
    }
}
package org.tzi.use.STMPlugin.logic.xml2use.ast.uml;

public class ASTConstraint {
    public ASTConstraint() {}
    public ASTConstraint(String t) {
        type = t;
    }

    String name = "";
    String type;
    String body;

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("type")) type = fieldValue;
        else if (fieldName.equals("body")) {
            body = fieldValue;
            body = body.replace("&gt;", ">");
            body = body.replace("&lt;", "<");
        }
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return (!type.equals("body") ? type+" "+name+": " : "")+body+"\n";
    }
}
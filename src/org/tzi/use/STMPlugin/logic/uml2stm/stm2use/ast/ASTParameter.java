public class ASTParameter {
    public class IsReturnException extends Exception {}

    String name;
    ASTClassifier type;
    String typeIndex;
    String init;
    Integer lower;
    Integer upper;
    String direction;

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("type")) typeIndex = fieldValue;
        else if (fieldName.equals("default")) init = fieldValue;
        else if (fieldName.equals("lower")) lower = Integer.parseInt(fieldValue);
        else if (fieldName.equals("upper")) upper = Integer.parseInt(fieldValue);
        else if (fieldName.equals("direction")) direction = fieldValue;
    }

    public String toString() {
        if (direction.equals("return")) return "";
        String typeName = "";
        if (type != null) typeName = " : "+type.getName();
        if (upper > 1) typeName = "Set("+typeName+")";
        return name+" : "+typeName;
    }

    public void setType(ASTClassifier t) { type = t; }

    public String getTypeIndex() { return typeIndex; }
}
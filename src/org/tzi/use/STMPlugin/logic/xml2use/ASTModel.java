package org.tzi.use.STMPlugin.logic.xml2use.ast;

import org.tzi.use.STMPlugin.logic.xml2use.XMLParser.ElementContext;

import java.util.Stack;

public abstract class ASTModel {
    String name;
    Stack<Object> processedElements = new Stack<Object>();

    public ASTModel() {
        processedElements.add(this);
    }

    public void doFinalTasks() {}

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
    }

    public String getName() {
        return name;
    }

    public void enterElem(ElementContext ctx) {}

    public void exitElem(ElementContext ctx) {}

    public Object getLastElement() {
        return processedElements.lastElement();
    }
}

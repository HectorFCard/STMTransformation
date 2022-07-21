package org.tzi.use.STMPlugin.gui;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.misc.Interval;

import javax.swing.JTextArea;

import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLParserBaseListener;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLParser;
import org.tzi.use.STMPlugin.gui.AddTOCLErrorListener;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLLexer;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTProperty;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTClass;

import java.util.ArrayList;
import java.util.HashMap;

//Still needs work

public class AddTOCLHandler {
    public static class TOCLChecker extends TOCLParserBaseListener {
        TOCLParser parser;
        ArrayList<ASTClass> classes;
        public TOCLChecker(TOCLParser parser, ArrayList<ASTClass> classes, String context) {
            this.parser = parser;
            this.classes = classes;
            currentContext = context;
        }

        private boolean invariantCreated = false;
        private boolean operationDecEntered = false;
        private boolean propertyDecEntered = false;
        private boolean defCreated = false;
        private String currentContext = null;
        private HashMap<String,String> variableMap = new HashMap<String,String>();
        private String lastDeclaredVar = null;

        private String lastType = null;

        public void exitInvOrDef(TOCLParser.InvOrDefContext ctx) { 
            if (ctx.getText().startsWith("inv")) {
                invariantCreated = true;
            }
            else {
                defCreated = true;
            }
        }

        public void exitPropertyContextDecl(TOCLParser.PropertyContextDeclContext ctx) {
            propertyDecEntered = true;
        }

        public void exitOperationContextDecl(TOCLParser.OperationContextDeclContext ctx) {
            operationDecEntered = true;
        }

        public void enterClassifierContextDecl(TOCLParser.ClassifierContextDeclContext ctx) { 
            int numChildren = ctx.getChildCount();
            currentContext = ctx.getChild(numChildren-2).getText();
            System.out.println(currentContext);
        }

        public void enterLetExp(TOCLParser.LetExpContext ctx) { 
            lastDeclaredVar = ctx.getChild(1).getChild(0).getText();
            System.out.println("variable declared: " + lastDeclaredVar);
            String varType = null;

            if (ctx.getChild(1).getChild(1).getText().equals(":")) {
                varType = ctx.getChild(1).getChild(2).getText();
            }
            variableMap.put(lastDeclaredVar,varType);
        }

        public void exitLetExp(TOCLParser.LetExpContext ctx) { 
            variableMap.remove(ctx.getChild(1).getChild(0).getText());
            System.out.println("Removing variable: " + ctx.getChild(1).getChild(0).getText());
        }

        public void exitPostfixExp(TOCLParser.PostfixExpContext ctx) {
            int numChildren = ctx.getChildCount();

            if (numChildren > 1) {
                String currentClass = ctx.getChild(0).getText();
                boolean isCollection = false;
                if (currentClass.equals("self")) {
                    currentClass = currentContext;
                }
                else if (variableMap.containsKey(currentClass)) {
                    currentClass = variableMap.get(currentClass);
                }

                for (int i = 1; i < numChildren; i++) {
                    if (i % 2 == 1) {
                        if (ctx.getChild(i).getText().equals(".")) {
                            if (isCollection) {
                                //error
                                TokenStream tokens = parser.getTokenStream();
                                Interval srcInterval = ctx.getSourceInterval();
                                //parser.notifyErrorListeners("Expected '->'; received '.'");
                                parser.notifyErrorListeners(tokens.get(srcInterval.a+i), "Expected '->'; received '.'", new RecognitionException(parser,parser.getInputStream(),ctx));
                            }
                            else {
                                continue;
                            }
                        }
                        else {
                            if (isCollection) {
                                continue;
                            }
                            else {
                                //error
                                TokenStream tokens = parser.getTokenStream();
                                Interval srcInterval = ctx.getSourceInterval();
                                parser.notifyErrorListeners(tokens.get(srcInterval.a+i), "Expected '.'; received '->'", new RecognitionException(parser,parser.getInputStream(),ctx));
                                //parser.notifyErrorListeners("Expected '.'; received '->'");
                            }
                        }
                    }
                    else {
                        String currentAttr = ctx.getChild(i).getText();
                        boolean containsAttribute = false;
                        System.out.println(currentAttr);
                        for (ASTClass c : classes) {
                            System.out.println("class "+c.getName());
                            if (c.getName().equals(currentClass)) {
                                for (ASTProperty p : c.getAttributes()) {
                                    System.out.println("attribute: "+p.getName());
                                    if (p.getName().equals(currentAttr)) {
                                        containsAttribute = true;
                                        currentClass = p.getType().getName();
                                        if (p.getUpper() > 1) {
                                            System.out.println("true "+p.getUpper());
                                            isCollection = true;
                                        }
                                        else {
                                            System.out.println("false "+p.getUpper());
                                            isCollection = false;
                                        }
                                        System.out.println("current class is "+ currentClass);
                                        break;
                                    }
                                    if (containsAttribute) {
                                        break;
                                    }
                                }
                                if (currentAttr.contains("(")) {
                                    containsAttribute = true;
                                }
                            }
                        }
                        if (!containsAttribute) {
                            TokenStream tokens = parser.getTokenStream();
                            Interval srcInterval = ctx.getSourceInterval();
                            parser.notifyErrorListeners(tokens.get(srcInterval.a+i), currentAttr + " is not an attribute or association end of " + currentClass, new RecognitionException(parser,parser.getInputStream(),ctx));

                        }
                    }
                }
                lastType = currentClass;
            }
        }

        public boolean isValidInvariant() {
            return (invariantCreated && !(defCreated || operationDecEntered || propertyDecEntered));
        }

        public String getLastType() {
            return (lastType != null ? lastType : currentContext);
        }
    }

    public static Boolean verifyCorrectInput(String toclInput, JTextArea feedBack, AddTOCLErrorListener parserErrorListener, AddTOCLErrorListener lexerErrorListener, ArrayList<ASTClass> classes) {
        CharStream input = null;
        input = CharStreams.fromString(toclInput);
        TOCLLexer lexer = new TOCLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TOCLParser parser = new TOCLParser(tokens);
        //parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(parserErrorListener); // add ours
        //lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrorListener);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expressionInOcl();
        ParseTreeWalker walker = new ParseTreeWalker();
        TOCLChecker checker = new TOCLChecker(parser, classes, null);
        walker.walk(checker, tree);
        
        return checker.isValidInvariant();
    }

    public static String getType(String toclInput,ArrayList<ASTClass> classes,String context) {
        CharStream input = null;
        input = CharStreams.fromString(toclInput);
        TOCLLexer lexer = new TOCLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TOCLParser parser = new TOCLParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expressionInOcl();
        ParseTreeWalker walker = new ParseTreeWalker();
        TOCLChecker checker = new TOCLChecker(parser, classes, context);
        walker.walk(checker, tree);

        return checker.getLastType();
    }

}


package org.tzi.use.STMPlugin.gui;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.JTextArea;

import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLParserBaseListener;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLParser;
import org.tzi.use.STMPlugin.gui.AddTOCLErrorListener;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLLexer;

public class AddTOCLHandler {
    public static class TOCLChecker extends TOCLParserBaseListener {
        TOCLParser parser;
        public TOCLChecker(TOCLParser parser) {this.parser = parser;}

        private boolean invariantCreated = false;
        private boolean operationDecEntered = false;
        private boolean propertyDecEntered = false;
        private boolean defCreated = false;

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

        public boolean isValidInvariant() {
            return (invariantCreated && !(defCreated || operationDecEntered || propertyDecEntered));
        }
    }

    public static Boolean verifyCorrectInput(String toclInput, JTextArea feedBack, AddTOCLErrorListener parserErrorListener, AddTOCLErrorListener lexerErrorListener) {
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
        TOCLChecker checker = new TOCLChecker(parser);
        walker.walk(checker, tree);
        
        return checker.isValidInvariant();
    }

}


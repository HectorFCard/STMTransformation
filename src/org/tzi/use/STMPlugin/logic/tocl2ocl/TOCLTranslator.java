package org.tzi.use.STMPlugin.logic.tocl2ocl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTClass;
import org.tzi.use.STMPlugin.gui.AddTOCLHandler;

import java.io.*;
import java.util.Stack;
import java.util.ArrayList;


public class TOCLTranslator {
    public static class OCLEmitter extends TOCLParserBaseListener {
        TOCLParser parser;
        ArrayList<ASTClass> classes;
        public OCLEmitter(TOCLParser parser, ArrayList<ASTClass> classes) {
            this.parser = parser;
            this.classes = classes;
        }
        ParseTreeProperty<String> ocl = new ParseTreeProperty<String>();
        String getOCL(ParseTree ctx) { return ocl.get(ctx); }
        void setOCL(ParseTree ctx, String s) { ocl.put(ctx, s); }

        Stack<String> stack = new Stack<String>();
        private boolean nestedTOCL = false;
        private String TOCLReplacement = null;
        private final String[] toclOperators = {"sometime","always","next","sometimePast","alwaysPast","previous"};
        private String currentContext = null;
        private String lastPostfixExp = null;
        private String toclOpCallPostfix = null;
        //BASIC RULES

        public void exitExpressionInOcl(TOCLParser.ExpressionInOclContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String expressionInOcl = tokens.getText(ctx);

            CharSequence toclV;
            CharSequence oclV;
            while (!stack.empty()) {
                toclV = stack.pop();
                oclV = stack.pop();

                expressionInOcl = expressionInOcl.replace(toclV, oclV);
            }
            setOCL(ctx,expressionInOcl);
        }

        public void exitOclExpression(TOCLParser.OclExpressionContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            setOCL(ctx, tokens.getText(ctx));
        }

        public void exitBinaryOperationExp(TOCLParser.BinaryOperationExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            setOCL(ctx, tokens.getText(ctx));
        }

        //TOCL Translation Rules
        public void exitNextExp(TOCLParser.NextExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            //oclTranslation = "self.getCurrentSnapshot().getNext().sat("+getOCL(ctx.getChild(1))+")";
            String exprToSatisfy = getOCL(ctx.getChild(1));
            while (hasNestedTOCL(exprToSatisfy)) {
                String origExpr = stack.pop();
                String oclExpr = stack.pop();
                exprToSatisfy = exprToSatisfy.replace(origExpr,oclExpr);
            }
            oclTranslation = exprToSatisfy.replace("self","self.getNext()");
            oclTranslation = oclTranslation.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = self.getCurrentSnapshot().getNext())");
            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void exitAlwaysExp(TOCLParser.AlwaysExpContext ctx) {
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            if (ctx.getChildCount() == 2) {
                String exprToSatisfy = getOCL(ctx.getChild(1));
                while (hasNestedTOCL(exprToSatisfy)) {
                    String origExpr = stack.pop();
                    String oclExpr = stack.pop();
                    exprToSatisfy = exprToSatisfy.replace(origExpr,oclExpr);
                }
                String alwaysExp = exprToSatisfy.replace("self","self.getPost()->including(self)->any(o | o.getCurrentSnapshot()=s)");
                alwaysExp = alwaysExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
                oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->forAll(s | "+alwaysExp+"))";
                //setOCL(ctx, "let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->forAll(s | s.sat("+getOCL(ctx.getChild(1))+"))");
                stack.push(oclTranslation);
                stack.push(origTocl);
                
                //let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->forAll(s | s.sat(P))
            } else {
                if (ctx.op.getText().equals("until")) {
                    String expr1ToSatisfy = getOCL(ctx.getChild(1));
                    String expr2ToSatisfy = getOCL(ctx.getChild(3));
                    while (hasNestedTOCL(expr2ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr2ToSatisfy = expr2ToSatisfy.replace(origExpr,oclExpr);
                    }
                    while (hasNestedTOCL(expr1ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr1ToSatisfy = expr1ToSatisfy.replace(origExpr,oclExpr);
                    }
                    String alwaysExp = expr1ToSatisfy.replace("self","self.getPost()->including(self)->any(o | o.getCurrentSnapshot()=s)");
                    alwaysExp = alwaysExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
                    String untilExp = expr2ToSatisfy.replace("self","self.getPost()->any(o | o.getCurrentSnapshot()=s)");
                    untilExp = untilExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");

                    
                    oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() \nin let FS:Set(Snapshot) = CS.getPost() \nin let FSQ:Set(Snapshot) = FS->select(s | " + untilExp + ") \nin let FSP:Set(Snapshot) = FS->including(CS)->select(s | " + alwaysExp+ ") \nin if (FSQ->size()>0) then (if (FSP->size()>0) then (FSQ->exists(s | FSP-(s.getPost()->including(s)) = FS->including(CS)-(s.getPost()->including(s)))) else false endif) else (FSP = FS->including(CS)) endif)";
                    //oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in let FSQ = CS.getPost()->select(s | s.sat("+getOCL(ctx.getChild(3))+"))->asOrderedSet()->first() in if (FSQ.isDefined()) then (FSQ.getPre()-CS.getPre())->forAll(s | s.sat("+getOCL(ctx.getChild(1))+") else CS.getPost()->including(CS)->forAll(s | s.sat("+getOCL(ctx.getChild(1))+")) endif";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
                else {
                    String expr1ToSatisfy = getOCL(ctx.getChild(1));
                    String expr2ToSatisfy = getOCL(ctx.getChild(3));
                    while (hasNestedTOCL(expr2ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr2ToSatisfy = expr2ToSatisfy.replace(origExpr,oclExpr);
                    }
                    while (hasNestedTOCL(expr1ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr1ToSatisfy = expr1ToSatisfy.replace(origExpr,oclExpr);
                    }
                    String alwaysExp = expr1ToSatisfy.replace("self","self.getPre()->including(self)->any(o | o.getCurrentSnapshot()=s)");
                    alwaysExp = alwaysExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
                    String sinceExp = expr2ToSatisfy.replace("self","self.getPre()->any(o | o.getCurrentSnapshot()=s)");
                    sinceExp = sinceExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");

                    oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() \nin let PS:Set(Snapshot) = CS.getPre() \nin let PSQ:Set(Snapshot) = PS->select(s | "+sinceExp+") \nin let PSP:Set(Snapshot) = PS->including(CS)->select(s | " + alwaysExp+ ") \nin if (PSQ->size()>0) then (if (PSP->size()>0) then (PSQ->exists(s | PSP-(s.getPre()->including(s)) = PS->including(CS)-(s.getPre()->including(s)))) else false endif) else (PSP = PS->including(CS)) endif)";

                    //oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in let LSQ = CS.getPre()->select(s | s.sat("+getOCL(ctx.getChild(3))+"))->asOrderedSet()->first() in if (LSQ.isDefined()) then (CS.getPre()->including(CS) - LSQ.getPre())->including(LSQ)->forAll(s | s.sat("+getOCL(ctx.getChild(1))+")) else CS.getPre()->forAll(s | s.sat("+getOCL(ctx.getChild(1))+")) endif";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
            }
        }

        public void exitSometimeExp(TOCLParser.SometimeExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            if (ctx.getChildCount() == 2) {
                
                String exprToSatisfy = getOCL(ctx.getChild(1));
                while (hasNestedTOCL(exprToSatisfy)) {
                    String origExpr = stack.pop();
                    String oclExpr = stack.pop();
                    exprToSatisfy = exprToSatisfy.replace(origExpr,oclExpr);
                }
                String sometimeExp = exprToSatisfy.replace("self","self.getPost()->including(self)->any(o | o.getCurrentSnapshot()=s)");
                sometimeExp = sometimeExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
                oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->exists(s | "+sometimeExp+"))";
                //oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->exists(s | s.sat("+getOCL(ctx.getChild(1))+"))";
                
                stack.push(oclTranslation);
                stack.push(origTocl);
                
            } else {
                if (ctx.op.getText().equals("before")) {
                    String expr1ToSatisfy = getOCL(ctx.getChild(1));
                    String expr2ToSatisfy = getOCL(ctx.getChild(3));
                    while (hasNestedTOCL(expr2ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr2ToSatisfy = expr2ToSatisfy.replace(origExpr,oclExpr);
                    }
                    while (hasNestedTOCL(expr1ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr1ToSatisfy = expr1ToSatisfy.replace(origExpr,oclExpr);
                    }
                    String sometimeExp = expr1ToSatisfy.replace("self","self.getPost()->including(self)->any(o | o.getCurrentSnapshot()=s)");
                    sometimeExp = sometimeExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
                    String beforeExp = expr2ToSatisfy.replace("self","self.getPost()->any(o | o.getCurrentSnapshot()=s)");
                    beforeExp = beforeExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");

                    oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() \nin let FS:Set(Snapshot) = CS.getPost() \nin let FSQ:Set(Snapshot) = FS->select(s | "+beforeExp+") \nin let FSP:Set(Snapshot) = FS->including(CS)->select(s | " + sometimeExp+ ") \nin if (FSQ->size()>0) then (if (FSP->size()>0) then (FSP->exists(s1 | FSQ->forAll(s2 | s1.getPost()->size() > s2.getPost()->size()))) else false endif) else FSP->size()>0 endif)";
                    //oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() in let FSQ = CS.getPost()->select(s | "+beforeExp+")->asOrderedSet()->first() in if (FSQ.isDefined()) then (FSQ.getPre()-CS.getPre())->exists(s | ("+sometimeExp+")) else CS.getPost()->including(CS)->exists(s | ("+sometimeExp+")) endif)";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
                else {
                    String expr1ToSatisfy = getOCL(ctx.getChild(1));
                    String expr2ToSatisfy = getOCL(ctx.getChild(3));
                    while (hasNestedTOCL(expr2ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr2ToSatisfy = expr2ToSatisfy.replace(origExpr,oclExpr);
                    }
                    while (hasNestedTOCL(expr1ToSatisfy)) {
                        String origExpr = stack.pop();
                        String oclExpr = stack.pop();
                        expr1ToSatisfy = expr1ToSatisfy.replace(origExpr,oclExpr);
                    }
                    String sometimeExp = expr1ToSatisfy.replace("self","self.getPre()->including(self)->any(o | o.getCurrentSnapshot()=s)");
                    sometimeExp = sometimeExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
                    String sinceExp = expr2ToSatisfy.replace("self","self.getPre()->any(o | o.getCurrentSnapshot()=s)");
                    sinceExp = sinceExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");

                    oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() \nin let PS:Set(Snapshot) = CS.getPre() \nin let PSQ:Set(Snapshot) = PS->select(s | "+sinceExp+") \nin let PSP:Set(Snapshot) = PS->including(CS)->select(s | " + sometimeExp+ ") \nin if (PSQ->size()>0) then (if (PSP->size()>0) then (PSP->exists(s1 | PSQ->forAll(s2 | s1.getPre()->size() > s2.getPre()->size()))) else false endif) else PSP->size()>0 endif)";

                    //oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in let LSQ = CS.getPre()->select(s | s.sat("+getOCL(ctx.getChild(3))+"))->asOrderedSet()->first() in if (LSQ.isDefined()) then (CS.getPre()->including(CS) - LSQ.getPre())->including(LSQ)->exists(s | s.sat("+getOCL(ctx.getChild(1))+")) else CS.getPre()->exists(s | s.sat("+getOCL(ctx.getChild(1))+")) endif";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
            }
        }

        public void exitPreviousExp(TOCLParser.PreviousExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            String exprToSatisfy = getOCL(ctx.getChild(1));
            while (hasNestedTOCL(exprToSatisfy)) {
                String origExpr = stack.pop();
                String oclExpr = stack.pop();
                exprToSatisfy = exprToSatisfy.replace(origExpr,oclExpr);
            }
            String previousExp = exprToSatisfy.replace("self","self.getPrevious()");
            previousExp = previousExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = self.getCurrentSnapshot().getPrevious())");
            oclTranslation = "(let CSPrev:Snapshot = self.getCurrentSnapshot().getPrevious() in CSPrev.isDefined() implies ("+previousExp+"))";
            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void exitAlwaysPastExp(TOCLParser.AlwaysPastExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            String exprToSatisfy = getOCL(ctx.getChild(1));
            while (hasNestedTOCL(exprToSatisfy)) {
                String origExpr = stack.pop();
                String oclExpr = stack.pop();
                exprToSatisfy = exprToSatisfy.replace(origExpr,oclExpr);
            }
            String alwaysPastExp = exprToSatisfy.replace("self","self.getPre()->any(o | o.getCurrentSnapshot()=s)");
            alwaysPastExp = alwaysPastExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
            oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() in CS.getPre()->forAll(s | "+alwaysPastExp+"))";
            //oclTranslation = "self.getCurrentSnapshot().getPre()->forAll(s | s.sat("+getOCL(ctx.getChild(1))+"))";
            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void exitSometimePastExp(TOCLParser.SometimePastExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            String exprToSatisfy = getOCL(ctx.getChild(1));
            while (hasNestedTOCL(exprToSatisfy)) {
                String origExpr = stack.pop();
                String oclExpr = stack.pop();
                exprToSatisfy = exprToSatisfy.replace(origExpr,oclExpr);
            }
            String sometimePastExp = exprToSatisfy.replace("self","self.getPre()->any(o | o.getCurrentSnapshot()=s)");
            sometimePastExp = sometimePastExp.replace("allInstances()","allInstances()->select(o | o.getCurrentSnapshot() = s)");
            oclTranslation = "(let CS:Snapshot = self.getCurrentSnapshot() in CS.getPre()->exists(s | "+sometimePastExp+"))";
            //oclTranslation = "self.getCurrentSnapshot().getPre()->exists(s | s.sat("+exprToSatisfy+"))";
            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void enterToclOpCallExp(TOCLParser.ToclOpCallExpContext ctx) { 
            toclOpCallPostfix = lastPostfixExp.replace(ctx.getText(),"");
            if (toclOpCallPostfix.charAt(toclOpCallPostfix.length()-1) == '.') {
                toclOpCallPostfix = toclOpCallPostfix.substring(0,toclOpCallPostfix.length()-1);
            }
            else {
                toclOpCallPostfix = toclOpCallPostfix.substring(0,toclOpCallPostfix.length()-2);
            }
        }

        public void exitToclOpCallExp(TOCLParser.ToclOpCallExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);

            if (ctx.getChild(1).getText().equals("@next")) {
                //self.requested implies self.switchPedLight@next
                //self.requested implies self.getCurrentSnapshot().nextT.oclIsTypeOf(TrafficLight_switchPedLight)
                oclTranslation = "getCurrentSnapshot().nextT.oclIsTypeOf("+ AddTOCLHandler.getType(toclOpCallPostfix,classes,currentContext) + "_" + ctx.getChild(0).getText() +")";
            }
            else {
                oclTranslation = "getCurrentSnapshot().previousT.oclIsTypeOf("+ AddTOCLHandler.getType(toclOpCallPostfix,classes,currentContext) + "_" + ctx.getChild(0).getText() +")";
            }

            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void enterClassifierContextDecl(TOCLParser.ClassifierContextDeclContext ctx) { 
            int numChildren = ctx.getChildCount();
            currentContext = ctx.getChild(numChildren-2).getText();
        }

        public void enterPostfixExp(TOCLParser.PostfixExpContext ctx) { 
            lastPostfixExp = ctx.getText();
        }

        private boolean hasNestedTOCL(String toclExpr) {
            boolean hasNested = false;

            for (String op : toclOperators) {
                hasNested = toclExpr.contains(op);
                if (hasNested) {
                    System.out.println("has nested tocl\n");
                    return true;
                }
            }
            return false;
        }
    }

    public static String translate(String text, ArrayList<ASTClass> classes) {
        CharStream input = null;
        try {
            input = CharStreams.fromStream(new ByteArrayInputStream(text.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        TOCLLexer lexer = new TOCLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TOCLParser parser = new TOCLParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expressionInOcl();

        ParseTreeWalker walker = new ParseTreeWalker();
        OCLEmitter converter = new OCLEmitter(parser, classes);
        walker.walk(converter, tree);

        return converter.getOCL(tree);
    }
        
    public static String translate(File infile, ArrayList<ASTClass> classes) {
        CharStream input = null;
        try {
            FileReader fileReader = new FileReader(infile.getAbsolutePath());
            input = CharStreams.fromReader(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        TOCLLexer lexer = new TOCLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TOCLParser parser = new TOCLParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expressionInOcl();

        ParseTreeWalker walker = new ParseTreeWalker();
        OCLEmitter converter = new OCLEmitter(parser, classes);
        walker.walk(converter, tree);

        String inputFilePath = infile.getAbsolutePath();
        Integer fileExtensionIndex = inputFilePath.lastIndexOf('.');
        String outFilePath = inputFilePath.substring(0,fileExtensionIndex)+"STM.ocl";

        try {
            File oclFile = new File(outFilePath);
            if (oclFile.createNewFile()) {
              System.out.println("File created: " + oclFile.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          try {
            FileWriter oclWriter = new FileWriter(outFilePath);
            oclWriter.write(converter.getOCL(tree));
            oclWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        return converter.getOCL(tree);
    }
}
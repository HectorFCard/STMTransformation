// Generated from STMParser.g4 by ANTLR 4.9.3
package stm2use;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STMParser}.
 */
public interface STMParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link STMParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(STMParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(STMParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(STMParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(STMParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(STMParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(STMParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(STMParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(STMParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#modelElem}.
	 * @param ctx the parse tree
	 */
	void enterModelElem(STMParser.ModelElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#modelElem}.
	 * @param ctx the parse tree
	 */
	void exitModelElem(STMParser.ModelElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#modelOwnedElem}.
	 * @param ctx the parse tree
	 */
	void enterModelOwnedElem(STMParser.ModelOwnedElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#modelOwnedElem}.
	 * @param ctx the parse tree
	 */
	void exitModelOwnedElem(STMParser.ModelOwnedElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#compClassElem}.
	 * @param ctx the parse tree
	 */
	void enterCompClassElem(STMParser.CompClassElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#compClassElem}.
	 * @param ctx the parse tree
	 */
	void exitCompClassElem(STMParser.CompClassElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#attributeElem}.
	 * @param ctx the parse tree
	 */
	void enterAttributeElem(STMParser.AttributeElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#attributeElem}.
	 * @param ctx the parse tree
	 */
	void exitAttributeElem(STMParser.AttributeElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#queryOpElem}.
	 * @param ctx the parse tree
	 */
	void enterQueryOpElem(STMParser.QueryOpElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#queryOpElem}.
	 * @param ctx the parse tree
	 */
	void exitQueryOpElem(STMParser.QueryOpElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#paramsElem}.
	 * @param ctx the parse tree
	 */
	void enterParamsElem(STMParser.ParamsElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#paramsElem}.
	 * @param ctx the parse tree
	 */
	void exitParamsElem(STMParser.ParamsElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#condElem}.
	 * @param ctx the parse tree
	 */
	void enterCondElem(STMParser.CondElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#condElem}.
	 * @param ctx the parse tree
	 */
	void exitCondElem(STMParser.CondElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#constrElem}.
	 * @param ctx the parse tree
	 */
	void enterConstrElem(STMParser.ConstrElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#constrElem}.
	 * @param ctx the parse tree
	 */
	void exitConstrElem(STMParser.ConstrElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#specElem}.
	 * @param ctx the parse tree
	 */
	void enterSpecElem(STMParser.SpecElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#specElem}.
	 * @param ctx the parse tree
	 */
	void exitSpecElem(STMParser.SpecElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#bodyElem}.
	 * @param ctx the parse tree
	 */
	void enterBodyElem(STMParser.BodyElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#bodyElem}.
	 * @param ctx the parse tree
	 */
	void exitBodyElem(STMParser.BodyElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#langElem}.
	 * @param ctx the parse tree
	 */
	void enterLangElem(STMParser.LangElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#langElem}.
	 * @param ctx the parse tree
	 */
	void exitLangElem(STMParser.LangElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#ownedEndElem}.
	 * @param ctx the parse tree
	 */
	void enterOwnedEndElem(STMParser.OwnedEndElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#ownedEndElem}.
	 * @param ctx the parse tree
	 */
	void exitOwnedEndElem(STMParser.OwnedEndElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#literalElem}.
	 * @param ctx the parse tree
	 */
	void enterLiteralElem(STMParser.LiteralElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#literalElem}.
	 * @param ctx the parse tree
	 */
	void exitLiteralElem(STMParser.LiteralElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#genElem}.
	 * @param ctx the parse tree
	 */
	void enterGenElem(STMParser.GenElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#genElem}.
	 * @param ctx the parse tree
	 */
	void exitGenElem(STMParser.GenElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#ctxElem}.
	 * @param ctx the parse tree
	 */
	void enterCtxElem(STMParser.CtxElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#ctxElem}.
	 * @param ctx the parse tree
	 */
	void exitCtxElem(STMParser.CtxElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#miscElem}.
	 * @param ctx the parse tree
	 */
	void enterMiscElem(STMParser.MiscElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#miscElem}.
	 * @param ctx the parse tree
	 */
	void exitMiscElem(STMParser.MiscElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(STMParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(STMParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(STMParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(STMParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(STMParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(STMParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link STMParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(STMParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link STMParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(STMParser.MiscContext ctx);
}
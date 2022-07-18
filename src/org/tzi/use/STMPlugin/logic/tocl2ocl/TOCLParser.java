// Generated from TOCLParser.g4 by ANTLR 4.9.3
package org.tzi.use.STMPlugin.logic.tocl2ocl;

        import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import org.tzi.use.STMPlugin.logic.tocl2ocl.ast.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TOCLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NATURAL_N=1, INTEGER_N=2, REAL_N=3, PLUS=4, MINUS=5, ASTERISK=6, DIVIDED_BY=7, 
		SELF=8, UNDERSCORE=9, SINGLE_QUOTE=10, TUPLE=11, SCOPE=12, HASH=13, LBRACK=14, 
		RBRACK=15, SET=16, BAG=17, SEQUENCE=18, COLLECTION=19, ORDERED_SET=20, 
		COMMA=21, DOT=22, DOUBLE_DOT=23, TRUE=24, FALSE=25, BAR=26, ARROW=27, 
		SELECT=28, REJECT=29, COLLECT=30, EXISTS=31, FOR_ALL=32, IS_UNIQUE=33, 
		SORTED_BY=34, INCLUDES=35, EXCLUDES=36, INCLUDES_ALL=37, EXCLUDES_ALL=38, 
		DIV=39, L_SQ_BRACK=40, R_SQ_BRACK=41, ITERATE=42, COLON=43, EQUALS=44, 
		NOT_EQUAL=45, BOOLEAN=46, INTEGER=47, REAL=48, STRING=49, UNLIMITED_NATURAL=50, 
		OCL_ANY=51, OCL_INVALID=52, OCL_MESSAGE=53, OCL_VOID=54, LPAREN=55, RPAREN=56, 
		IMPLIES=57, OR=58, XOR=59, AND=60, NOT=61, GT=62, LT=63, OCL_AS_TYPE=64, 
		OCL_IS_KIND_OF=65, OCL_IS_TYPE_OF=66, SELECT_BY_KIND=67, SELECT_BY_TYPE=68, 
		ALL_INSTANCES=69, AT_PRE=70, LET=71, IN=72, SEMI=73, QUESTION_MARK=74, 
		IF=75, THEN=76, ELSE=77, ENDIF=78, INVALID=79, NULL=80, PACKAGE=81, ENDPACKAGE=82, 
		CONTEXT=83, INIT=84, DERIVE=85, INV=86, STATIC=87, DEF=88, PRE=89, POST=90, 
		BODY=91, NEXT=92, ALWAYS=93, SOMETIME=94, UNTIL=95, BEFORE=96, PREVIOUS=97, 
		ALWAYS_PAST=98, SOMETIME_PAST=99, SINCE=100, AT_NEXT=101, SIMPLE_NAME=102, 
		WhiteSpaceChar=103, SL_COMMENT=104, ML_COMMENT=105, Char=106, EscapeSequence=107, 
		STRING_CHARS=108;
	public static final int
		RULE_expressionInOcl = 0, RULE_oclExpression = 1, RULE_varExp = 2, RULE_simpleName = 3, 
		RULE_restrictedKeyword = 4, RULE_unreservedSimpleName = 5, RULE_pathName = 6, 
		RULE_literalExp = 7, RULE_enumLiteralExp = 8, RULE_collectionLiteralExp = 9, 
		RULE_collectionTypeIdentifier = 10, RULE_collectionLiteralParts = 11, 
		RULE_collectionLiteralPart = 12, RULE_collectionRange = 13, RULE_primitiveLiteralExp = 14, 
		RULE_tupleLiteralExp = 15, RULE_unlimitedNaturalLiteralExp = 16, RULE_integerLiteralExp = 17, 
		RULE_realLiteralExp = 18, RULE_stringLiteralExp = 19, RULE_booleanLiteralExp = 20, 
		RULE_binaryOperationExp = 21, RULE_orExp = 22, RULE_xorExp = 23, RULE_andExp = 24, 
		RULE_equalityExp = 25, RULE_relationalExp = 26, RULE_additiveExp = 27, 
		RULE_multiplicativeExp = 28, RULE_unaryExp = 29, RULE_postfixExp = 30, 
		RULE_primaryExp = 31, RULE_callExp = 32, RULE_loopExp = 33, RULE_oclQueryExp = 34, 
		RULE_oclOperationIdentifier = 35, RULE_iterateExp = 36, RULE_variableDeclaration = 37, 
		RULE_type = 38, RULE_primitiveType = 39, RULE_oclType = 40, RULE_collectionType = 41, 
		RULE_tupleType = 42, RULE_variableDeclarationList = 43, RULE_featureCallExp = 44, 
		RULE_oclTypeExpIdentifier = 45, RULE_isMarkedPre = 46, RULE_arguments = 47, 
		RULE_letExp = 48, RULE_letExpSub = 49, RULE_ifExp = 50, RULE_nullLiteralExp = 51, 
		RULE_invalidLiteralExp = 52, RULE_packageDeclaration = 53, RULE_contextDeclaration = 54, 
		RULE_propertyContextDecl = 55, RULE_initOrDerValue = 56, RULE_classifierContextDecl = 57, 
		RULE_invOrDef = 58, RULE_defExpression = 59, RULE_operationContextDecl = 60, 
		RULE_prePostOrBodyDecl = 61, RULE_operation = 62, RULE_parameters = 63, 
		RULE_toclOperatorExpression = 64, RULE_nextExp = 65, RULE_alwaysExp = 66, 
		RULE_sometimeExp = 67, RULE_previousExp = 68, RULE_alwaysPastExp = 69, 
		RULE_sometimePastExp = 70, RULE_isMarkedNext = 71, RULE_toclOpCallExp = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"expressionInOcl", "oclExpression", "varExp", "simpleName", "restrictedKeyword", 
			"unreservedSimpleName", "pathName", "literalExp", "enumLiteralExp", "collectionLiteralExp", 
			"collectionTypeIdentifier", "collectionLiteralParts", "collectionLiteralPart", 
			"collectionRange", "primitiveLiteralExp", "tupleLiteralExp", "unlimitedNaturalLiteralExp", 
			"integerLiteralExp", "realLiteralExp", "stringLiteralExp", "booleanLiteralExp", 
			"binaryOperationExp", "orExp", "xorExp", "andExp", "equalityExp", "relationalExp", 
			"additiveExp", "multiplicativeExp", "unaryExp", "postfixExp", "primaryExp", 
			"callExp", "loopExp", "oclQueryExp", "oclOperationIdentifier", "iterateExp", 
			"variableDeclaration", "type", "primitiveType", "oclType", "collectionType", 
			"tupleType", "variableDeclarationList", "featureCallExp", "oclTypeExpIdentifier", 
			"isMarkedPre", "arguments", "letExp", "letExpSub", "ifExp", "nullLiteralExp", 
			"invalidLiteralExp", "packageDeclaration", "contextDeclaration", "propertyContextDecl", 
			"initOrDerValue", "classifierContextDecl", "invOrDef", "defExpression", 
			"operationContextDecl", "prePostOrBodyDecl", "operation", "parameters", 
			"toclOperatorExpression", "nextExp", "alwaysExp", "sometimeExp", "previousExp", 
			"alwaysPastExp", "sometimePastExp", "isMarkedNext", "toclOpCallExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'self'", "'_'", 
			"'''", "'Tuple'", "'::'", "'#'", "'{'", "'}'", "'Set'", "'Bag'", "'Sequence'", 
			"'Collection'", "'OrderedSet'", "','", "'.'", "'..'", "'true'", "'false'", 
			"'|'", "'->'", "'select'", "'reject'", "'collect'", "'exists'", "'forAll'", 
			"'isUnique'", "'sortedBy'", "'includes'", "'excludes'", "'includesAll'", 
			"'excludesAll'", "'div'", "'['", "']'", "'iterate'", "':'", "'='", "'<>'", 
			"'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", 
			"'OclAny'", "'OclInvalid'", "'OclMessage'", "'OclVoid'", "'('", "')'", 
			"'implies'", "'or'", "'xor'", "'and'", "'not'", "'>'", "'<'", "'oclAsType'", 
			"'oclIsKindOf'", "'oclIsTypeOf'", "'selectByKind'", "'selectByType'", 
			"'allInstances'", "'@pre'", "'let'", "'in'", "';'", "'?'", "'if'", "'then'", 
			"'else'", "'endif'", "'invalid'", "'null'", "'package'", "'endpackage'", 
			"'context'", "'init'", "'derive'", "'inv'", "'static'", "'def'", "'pre'", 
			"'post'", "'body'", "'next'", "'always'", "'sometime'", "'until'", "'before'", 
			"'previous'", "'alwaysPast'", "'sometimePast'", "'since'", "'@next'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NATURAL_N", "INTEGER_N", "REAL_N", "PLUS", "MINUS", "ASTERISK", 
			"DIVIDED_BY", "SELF", "UNDERSCORE", "SINGLE_QUOTE", "TUPLE", "SCOPE", 
			"HASH", "LBRACK", "RBRACK", "SET", "BAG", "SEQUENCE", "COLLECTION", "ORDERED_SET", 
			"COMMA", "DOT", "DOUBLE_DOT", "TRUE", "FALSE", "BAR", "ARROW", "SELECT", 
			"REJECT", "COLLECT", "EXISTS", "FOR_ALL", "IS_UNIQUE", "SORTED_BY", "INCLUDES", 
			"EXCLUDES", "INCLUDES_ALL", "EXCLUDES_ALL", "DIV", "L_SQ_BRACK", "R_SQ_BRACK", 
			"ITERATE", "COLON", "EQUALS", "NOT_EQUAL", "BOOLEAN", "INTEGER", "REAL", 
			"STRING", "UNLIMITED_NATURAL", "OCL_ANY", "OCL_INVALID", "OCL_MESSAGE", 
			"OCL_VOID", "LPAREN", "RPAREN", "IMPLIES", "OR", "XOR", "AND", "NOT", 
			"GT", "LT", "OCL_AS_TYPE", "OCL_IS_KIND_OF", "OCL_IS_TYPE_OF", "SELECT_BY_KIND", 
			"SELECT_BY_TYPE", "ALL_INSTANCES", "AT_PRE", "LET", "IN", "SEMI", "QUESTION_MARK", 
			"IF", "THEN", "ELSE", "ENDIF", "INVALID", "NULL", "PACKAGE", "ENDPACKAGE", 
			"CONTEXT", "INIT", "DERIVE", "INV", "STATIC", "DEF", "PRE", "POST", "BODY", 
			"NEXT", "ALWAYS", "SOMETIME", "UNTIL", "BEFORE", "PREVIOUS", "ALWAYS_PAST", 
			"SOMETIME_PAST", "SINCE", "AT_NEXT", "SIMPLE_NAME", "WhiteSpaceChar", 
			"SL_COMMENT", "ML_COMMENT", "Char", "EscapeSequence", "STRING_CHARS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TOCLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TOCLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionInOclContext extends ParserRuleContext {
		public OclExpressionContext o1;
		public PackageDeclarationContext p;
		public TerminalNode EOF() { return getToken(TOCLParser.EOF, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ExpressionInOclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInOcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterExpressionInOcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitExpressionInOcl(this);
		}
	}

	public final ExpressionInOclContext expressionInOcl() throws RecognitionException {
		ExpressionInOclContext _localctx = new ExpressionInOclContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expressionInOcl);

		                Environment env = new Environment(null);
		                env.addElement("self", null);
		        
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURAL_N:
			case INTEGER_N:
			case REAL_N:
			case MINUS:
			case ASTERISK:
			case SELF:
			case UNDERSCORE:
			case TUPLE:
			case HASH:
			case SET:
			case BAG:
			case SEQUENCE:
			case COLLECTION:
			case ORDERED_SET:
			case TRUE:
			case FALSE:
			case SELECT:
			case REJECT:
			case COLLECT:
			case EXISTS:
			case FOR_ALL:
			case IS_UNIQUE:
			case SORTED_BY:
			case INCLUDES:
			case EXCLUDES:
			case INCLUDES_ALL:
			case EXCLUDES_ALL:
			case ITERATE:
			case LPAREN:
			case NOT:
			case OCL_AS_TYPE:
			case OCL_IS_KIND_OF:
			case OCL_IS_TYPE_OF:
			case SELECT_BY_KIND:
			case SELECT_BY_TYPE:
			case ALL_INSTANCES:
			case LET:
			case IF:
			case INVALID:
			case NULL:
			case NEXT:
			case ALWAYS:
			case SOMETIME:
			case PREVIOUS:
			case ALWAYS_PAST:
			case SOMETIME_PAST:
			case SIMPLE_NAME:
			case STRING_CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((ExpressionInOclContext)_localctx).o1 = oclExpression(env);
				setState(147);
				match(EOF);
				}
				break;
			case PACKAGE:
			case CONTEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((ExpressionInOclContext)_localctx).p = packageDeclaration(env);
				setState(150);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclExpressionContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public LiteralExpContext lit;
		public LetExpContext let;
		public BinaryOperationExpContext op;
		public LiteralExpContext literalExp() {
			return getRuleContext(LiteralExpContext.class,0);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public BinaryOperationExpContext binaryOperationExp() {
			return getRuleContext(BinaryOperationExpContext.class,0);
		}
		public OclExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OclExpressionContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_oclExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOclExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOclExpression(this);
		}
	}

	public final OclExpressionContext oclExpression(Environment env) throws RecognitionException {
		OclExpressionContext _localctx = new OclExpressionContext(_ctx, getState(), env);
		enterRule(_localctx, 2, RULE_oclExpression);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((OclExpressionContext)_localctx).lit = literalExp(_localctx.env);
				 ((OclExpressionContext)_localctx).ast =  ((OclExpressionContext)_localctx).lit.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((OclExpressionContext)_localctx).let = letExp(_localctx.env);
				 ((OclExpressionContext)_localctx).ast =  ((OclExpressionContext)_localctx).let.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				((OclExpressionContext)_localctx).op = binaryOperationExp(_localctx.env);
				 ((OclExpressionContext)_localctx).ast =  ((OclExpressionContext)_localctx).op.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarExpContext extends ParserRuleContext {
		public Environment env;
		public ASTVariableExp ast;
		public SimpleNameContext name;
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode SELF() { return getToken(TOCLParser.SELF, 0); }
		public VarExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_varExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitVarExp(this);
		}
	}

	public final VarExpContext varExp(Environment env) throws RecognitionException {
		VarExpContext _localctx = new VarExpContext(_ctx, getState(), env);
		enterRule(_localctx, 4, RULE_varExp);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((VarExpContext)_localctx).name = simpleName();

				                Object obj = _localctx.env.lookup(((VarExpContext)_localctx).name.str);
				                ASTVariableDeclaration dec;
				                if (obj instanceof ASTVariableDeclaration) {
				                        dec = (ASTVariableDeclaration) obj;
				                        ((VarExpContext)_localctx).ast =  new ASTVariableExp(dec);
				                }
				        
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(SELF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleNameContext extends ParserRuleContext {
		public String str;
		public Token n1;
		public TerminalNode SIMPLE_NAME() { return getToken(TOCLParser.SIMPLE_NAME, 0); }
		public TerminalNode STRING_CHARS() { return getToken(TOCLParser.STRING_CHARS, 0); }
		public TerminalNode UNDERSCORE() { return getToken(TOCLParser.UNDERSCORE, 0); }
		public SimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterSimpleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitSimpleName(this);
		}
	}

	public final SimpleNameContext simpleName() throws RecognitionException {
		SimpleNameContext _localctx = new SimpleNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleName);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((SimpleNameContext)_localctx).n1 = match(SIMPLE_NAME);
				 ((SimpleNameContext)_localctx).str =  (((SimpleNameContext)_localctx).n1!=null?((SimpleNameContext)_localctx).n1.getText():null); 
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((SimpleNameContext)_localctx).n1 = match(UNDERSCORE);
				setState(174);
				match(STRING_CHARS);
				((SimpleNameContext)_localctx).str =  (((SimpleNameContext)_localctx).n1!=null?((SimpleNameContext)_localctx).n1.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestrictedKeywordContext extends ParserRuleContext {
		public String str;
		public CollectionTypeIdentifierContext cTypeIdent;
		public PrimitiveTypeContext primType;
		public OclTypeContext oType;
		public Token t;
		public CollectionTypeIdentifierContext collectionTypeIdentifier() {
			return getRuleContext(CollectionTypeIdentifierContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public TerminalNode TUPLE() { return getToken(TOCLParser.TUPLE, 0); }
		public RestrictedKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restrictedKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterRestrictedKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitRestrictedKeyword(this);
		}
	}

	public final RestrictedKeywordContext restrictedKeyword() throws RecognitionException {
		RestrictedKeywordContext _localctx = new RestrictedKeywordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_restrictedKeyword);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BAG:
			case SEQUENCE:
			case COLLECTION:
			case ORDERED_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((RestrictedKeywordContext)_localctx).cTypeIdent = collectionTypeIdentifier();
				 ((RestrictedKeywordContext)_localctx).str =  ((RestrictedKeywordContext)_localctx).cTypeIdent.str; 
				}
				break;
			case BOOLEAN:
			case INTEGER:
			case REAL:
			case STRING:
			case UNLIMITED_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((RestrictedKeywordContext)_localctx).primType = primitiveType();
				 ((RestrictedKeywordContext)_localctx).str =  ((RestrictedKeywordContext)_localctx).primType.ast.getName(); 
				}
				break;
			case OCL_ANY:
			case OCL_INVALID:
			case OCL_MESSAGE:
			case OCL_VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				((RestrictedKeywordContext)_localctx).oType = oclType();
				 ((RestrictedKeywordContext)_localctx).str =  ((RestrictedKeywordContext)_localctx).oType.ast.getName(); 
				}
				break;
			case TUPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				((RestrictedKeywordContext)_localctx).t = match(TUPLE);
				 ((RestrictedKeywordContext)_localctx).str =  (((RestrictedKeywordContext)_localctx).t!=null?((RestrictedKeywordContext)_localctx).t.getText():null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnreservedSimpleNameContext extends ParserRuleContext {
		public String str;
		public SimpleNameContext name;
		public RestrictedKeywordContext restrKwrd;
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public RestrictedKeywordContext restrictedKeyword() {
			return getRuleContext(RestrictedKeywordContext.class,0);
		}
		public UnreservedSimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedSimpleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterUnreservedSimpleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitUnreservedSimpleName(this);
		}
	}

	public final UnreservedSimpleNameContext unreservedSimpleName() throws RecognitionException {
		UnreservedSimpleNameContext _localctx = new UnreservedSimpleNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unreservedSimpleName);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				((UnreservedSimpleNameContext)_localctx).name = simpleName();
				 ((UnreservedSimpleNameContext)_localctx).str =  ((UnreservedSimpleNameContext)_localctx).name.str; 
				}
				break;
			case TUPLE:
			case SET:
			case BAG:
			case SEQUENCE:
			case COLLECTION:
			case ORDERED_SET:
			case BOOLEAN:
			case INTEGER:
			case REAL:
			case STRING:
			case UNLIMITED_NATURAL:
			case OCL_ANY:
			case OCL_INVALID:
			case OCL_MESSAGE:
			case OCL_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				((UnreservedSimpleNameContext)_localctx).restrKwrd = restrictedKeyword();
				 ((UnreservedSimpleNameContext)_localctx).str =  ((UnreservedSimpleNameContext)_localctx).restrKwrd.str; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathNameContext extends ParserRuleContext {
		public ArrayList<String> path;
		public SimpleNameContext n;
		public UnreservedSimpleNameContext uSimpleName;
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public TerminalNode SCOPE() { return getToken(TOCLParser.SCOPE, 0); }
		public UnreservedSimpleNameContext unreservedSimpleName() {
			return getRuleContext(UnreservedSimpleNameContext.class,0);
		}
		public PathNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPathName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPathName(this);
		}
	}

	public final PathNameContext pathName() throws RecognitionException {
		return pathName(0);
	}

	private PathNameContext pathName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PathNameContext _localctx = new PathNameContext(_ctx, _parentState);
		PathNameContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_pathName, _p);
		 ((PathNameContext)_localctx).path =  new ArrayList<String>(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			((PathNameContext)_localctx).n = simpleName();
			 _localctx.path.add(((PathNameContext)_localctx).n.str); 
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PathNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pathName);
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					match(SCOPE);
					setState(205);
					((PathNameContext)_localctx).uSimpleName = unreservedSimpleName();
					 
					                          ((PathNameContext)_localctx).path =  new ArrayList<String>();
					                          _localctx.path.add(((PathNameContext)_localctx).uSimpleName.str); 
					                  
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralExpContext extends ParserRuleContext {
		public Environment env;
		public ASTLiteralExp ast;
		public EnumLiteralExpContext e;
		public CollectionLiteralExpContext colLit;
		public TupleLiteralExpContext tupleLit;
		public PrimitiveLiteralExpContext primLit;
		public EnumLiteralExpContext enumLiteralExp() {
			return getRuleContext(EnumLiteralExpContext.class,0);
		}
		public CollectionLiteralExpContext collectionLiteralExp() {
			return getRuleContext(CollectionLiteralExpContext.class,0);
		}
		public TupleLiteralExpContext tupleLiteralExp() {
			return getRuleContext(TupleLiteralExpContext.class,0);
		}
		public PrimitiveLiteralExpContext primitiveLiteralExp() {
			return getRuleContext(PrimitiveLiteralExpContext.class,0);
		}
		public LiteralExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LiteralExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_literalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitLiteralExp(this);
		}
	}

	public final LiteralExpContext literalExp(Environment env) throws RecognitionException {
		LiteralExpContext _localctx = new LiteralExpContext(_ctx, getState(), env);
		enterRule(_localctx, 14, RULE_literalExp);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case HASH:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((LiteralExpContext)_localctx).e = enumLiteralExp(_localctx.env);
				 ((LiteralExpContext)_localctx).ast =  ((LiteralExpContext)_localctx).e.ast; 
				}
				break;
			case SET:
			case BAG:
			case SEQUENCE:
			case COLLECTION:
			case ORDERED_SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				((LiteralExpContext)_localctx).colLit = collectionLiteralExp(_localctx.env);
				 ((LiteralExpContext)_localctx).ast =  ((LiteralExpContext)_localctx).colLit.ast; 
				}
				break;
			case TUPLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				((LiteralExpContext)_localctx).tupleLit = tupleLiteralExp(_localctx.env);
				 ((LiteralExpContext)_localctx).ast =  ((LiteralExpContext)_localctx).tupleLit.ast; 
				}
				break;
			case NATURAL_N:
			case INTEGER_N:
			case REAL_N:
			case ASTERISK:
			case TRUE:
			case FALSE:
			case INVALID:
			case NULL:
			case STRING_CHARS:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				((LiteralExpContext)_localctx).primLit = primitiveLiteralExp(_localctx.env);
				 ((LiteralExpContext)_localctx).ast =  ((LiteralExpContext)_localctx).primLit.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumLiteralExpContext extends ParserRuleContext {
		public Environment env;
		public ASTEnumLiteralExp ast;
		public SimpleNameContext lit1;
		public PathNameContext name;
		public SimpleNameContext lit2;
		public TerminalNode HASH() { return getToken(TOCLParser.HASH, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode SCOPE() { return getToken(TOCLParser.SCOPE, 0); }
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public EnumLiteralExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumLiteralExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_enumLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterEnumLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitEnumLiteralExp(this);
		}
	}

	public final EnumLiteralExpContext enumLiteralExp(Environment env) throws RecognitionException {
		EnumLiteralExpContext _localctx = new EnumLiteralExpContext(_ctx, getState(), env);
		enterRule(_localctx, 16, RULE_enumLiteralExp);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(HASH);
				setState(228);
				((EnumLiteralExpContext)_localctx).lit1 = simpleName();
				 ((EnumLiteralExpContext)_localctx).ast =  new ASTEnumLiteralExp(null, ((EnumLiteralExpContext)_localctx).lit1.str); 
				}
				break;
			case UNDERSCORE:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				((EnumLiteralExpContext)_localctx).name = pathName(0);
				setState(232);
				match(SCOPE);
				setState(233);
				((EnumLiteralExpContext)_localctx).lit2 = simpleName();
				 ((EnumLiteralExpContext)_localctx).ast =  new ASTEnumLiteralExp(((EnumLiteralExpContext)_localctx).name.path.get(0), ((EnumLiteralExpContext)_localctx).lit2.str); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionLiteralExpContext extends ParserRuleContext {
		public Environment env;
		public ASTCollectionLiteralExp ast;
		public CollectionTypeIdentifierContext typeIdent;
		public CollectionLiteralPartsContext parts;
		public TerminalNode LBRACK() { return getToken(TOCLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TOCLParser.RBRACK, 0); }
		public CollectionTypeIdentifierContext collectionTypeIdentifier() {
			return getRuleContext(CollectionTypeIdentifierContext.class,0);
		}
		public CollectionLiteralPartsContext collectionLiteralParts() {
			return getRuleContext(CollectionLiteralPartsContext.class,0);
		}
		public CollectionLiteralExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CollectionLiteralExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterCollectionLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitCollectionLiteralExp(this);
		}
	}

	public final CollectionLiteralExpContext collectionLiteralExp(Environment env) throws RecognitionException {
		CollectionLiteralExpContext _localctx = new CollectionLiteralExpContext(_ctx, getState(), env);
		enterRule(_localctx, 18, RULE_collectionLiteralExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((CollectionLiteralExpContext)_localctx).typeIdent = collectionTypeIdentifier();
			setState(239);
			match(LBRACK);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_N) | (1L << INTEGER_N) | (1L << REAL_N) | (1L << MINUS) | (1L << ASTERISK) | (1L << SELF) | (1L << UNDERSCORE) | (1L << TUPLE) | (1L << HASH) | (1L << SET) | (1L << BAG) | (1L << SEQUENCE) | (1L << COLLECTION) | (1L << ORDERED_SET) | (1L << TRUE) | (1L << FALSE) | (1L << SELECT) | (1L << REJECT) | (1L << COLLECT) | (1L << EXISTS) | (1L << FOR_ALL) | (1L << IS_UNIQUE) | (1L << SORTED_BY) | (1L << INCLUDES) | (1L << EXCLUDES) | (1L << INCLUDES_ALL) | (1L << EXCLUDES_ALL) | (1L << ITERATE) | (1L << LPAREN) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OCL_AS_TYPE - 64)) | (1L << (OCL_IS_KIND_OF - 64)) | (1L << (OCL_IS_TYPE_OF - 64)) | (1L << (SELECT_BY_KIND - 64)) | (1L << (SELECT_BY_TYPE - 64)) | (1L << (ALL_INSTANCES - 64)) | (1L << (LET - 64)) | (1L << (IF - 64)) | (1L << (INVALID - 64)) | (1L << (NULL - 64)) | (1L << (NEXT - 64)) | (1L << (ALWAYS - 64)) | (1L << (SOMETIME - 64)) | (1L << (PREVIOUS - 64)) | (1L << (ALWAYS_PAST - 64)) | (1L << (SOMETIME_PAST - 64)) | (1L << (SIMPLE_NAME - 64)) | (1L << (STRING_CHARS - 64)))) != 0)) {
				{
				setState(240);
				((CollectionLiteralExpContext)_localctx).parts = collectionLiteralParts(_localctx.env);
				}
			}

			setState(243);
			match(RBRACK);
			 ((CollectionLiteralExpContext)_localctx).ast =  new ASTCollectionLiteralExp(((CollectionLiteralExpContext)_localctx).typeIdent.str, ((CollectionLiteralExpContext)_localctx).parts.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionTypeIdentifierContext extends ParserRuleContext {
		public String str;
		public Token set;
		public Token b;
		public Token s;
		public Token c;
		public Token o;
		public TerminalNode SET() { return getToken(TOCLParser.SET, 0); }
		public TerminalNode BAG() { return getToken(TOCLParser.BAG, 0); }
		public TerminalNode SEQUENCE() { return getToken(TOCLParser.SEQUENCE, 0); }
		public TerminalNode COLLECTION() { return getToken(TOCLParser.COLLECTION, 0); }
		public TerminalNode ORDERED_SET() { return getToken(TOCLParser.ORDERED_SET, 0); }
		public CollectionTypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionTypeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterCollectionTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitCollectionTypeIdentifier(this);
		}
	}

	public final CollectionTypeIdentifierContext collectionTypeIdentifier() throws RecognitionException {
		CollectionTypeIdentifierContext _localctx = new CollectionTypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_collectionTypeIdentifier);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((CollectionTypeIdentifierContext)_localctx).set = match(SET);
				 ((CollectionTypeIdentifierContext)_localctx).str =  (((CollectionTypeIdentifierContext)_localctx).set!=null?((CollectionTypeIdentifierContext)_localctx).set.getText():null); 
				}
				break;
			case BAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((CollectionTypeIdentifierContext)_localctx).b = match(BAG);
				 ((CollectionTypeIdentifierContext)_localctx).str =  (((CollectionTypeIdentifierContext)_localctx).b!=null?((CollectionTypeIdentifierContext)_localctx).b.getText():null); 
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				((CollectionTypeIdentifierContext)_localctx).s = match(SEQUENCE);
				 ((CollectionTypeIdentifierContext)_localctx).str =  (((CollectionTypeIdentifierContext)_localctx).s!=null?((CollectionTypeIdentifierContext)_localctx).s.getText():null); 
				}
				break;
			case COLLECTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				((CollectionTypeIdentifierContext)_localctx).c = match(COLLECTION);
				 ((CollectionTypeIdentifierContext)_localctx).str =  (((CollectionTypeIdentifierContext)_localctx).c!=null?((CollectionTypeIdentifierContext)_localctx).c.getText():null); 
				}
				break;
			case ORDERED_SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				((CollectionTypeIdentifierContext)_localctx).o = match(ORDERED_SET);
				 ((CollectionTypeIdentifierContext)_localctx).str =  (((CollectionTypeIdentifierContext)_localctx).o!=null?((CollectionTypeIdentifierContext)_localctx).o.getText():null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionLiteralPartsContext extends ParserRuleContext {
		public Environment env;
		public ArrayList<ASTCollectionLiteralPart> ast;
		public CollectionLiteralPartContext cPart;
		public CollectionLiteralPartsContext cPartArrayList;
		public CollectionLiteralPartContext collectionLiteralPart() {
			return getRuleContext(CollectionLiteralPartContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TOCLParser.COMMA, 0); }
		public CollectionLiteralPartsContext collectionLiteralParts() {
			return getRuleContext(CollectionLiteralPartsContext.class,0);
		}
		public CollectionLiteralPartsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CollectionLiteralPartsContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteralParts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterCollectionLiteralParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitCollectionLiteralParts(this);
		}
	}

	public final CollectionLiteralPartsContext collectionLiteralParts(Environment env) throws RecognitionException {
		CollectionLiteralPartsContext _localctx = new CollectionLiteralPartsContext(_ctx, getState(), env);
		enterRule(_localctx, 22, RULE_collectionLiteralParts);
		 ((CollectionLiteralPartsContext)_localctx).ast =  new ArrayList<ASTCollectionLiteralPart>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((CollectionLiteralPartsContext)_localctx).cPart = collectionLiteralPart(_localctx.env);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(259);
				match(COMMA);
				setState(260);
				((CollectionLiteralPartsContext)_localctx).cPartArrayList = collectionLiteralParts(_localctx.env);
				}
			}


			                if (((CollectionLiteralPartsContext)_localctx).cPartArrayList.ast != null) {
			                        ((CollectionLiteralPartsContext)_localctx).ast =  ((CollectionLiteralPartsContext)_localctx).cPartArrayList.ast; 
			                }
			                _localctx.ast.add(((CollectionLiteralPartsContext)_localctx).cPart.ast);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionLiteralPartContext extends ParserRuleContext {
		public Environment env;
		public ASTCollectionLiteralPart ast;
		public CollectionRangeContext r;
		public CollectionRangeContext collectionRange() {
			return getRuleContext(CollectionRangeContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public CollectionLiteralPartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CollectionLiteralPartContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteralPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterCollectionLiteralPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitCollectionLiteralPart(this);
		}
	}

	public final CollectionLiteralPartContext collectionLiteralPart(Environment env) throws RecognitionException {
		CollectionLiteralPartContext _localctx = new CollectionLiteralPartContext(_ctx, getState(), env);
		enterRule(_localctx, 24, RULE_collectionLiteralPart);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				((CollectionLiteralPartContext)_localctx).r = collectionRange(_localctx.env);
				 ((CollectionLiteralPartContext)_localctx).ast =  ((CollectionLiteralPartContext)_localctx).r.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				oclExpression(_localctx.env);
				 ((CollectionLiteralPartContext)_localctx).ast =  null; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionRangeContext extends ParserRuleContext {
		public Environment env;
		public ASTCollectionRange ast;
		public OclExpressionContext first;
		public OclExpressionContext last;
		public TerminalNode DOUBLE_DOT() { return getToken(TOCLParser.DOUBLE_DOT, 0); }
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public CollectionRangeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CollectionRangeContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_collectionRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterCollectionRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitCollectionRange(this);
		}
	}

	public final CollectionRangeContext collectionRange(Environment env) throws RecognitionException {
		CollectionRangeContext _localctx = new CollectionRangeContext(_ctx, getState(), env);
		enterRule(_localctx, 26, RULE_collectionRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((CollectionRangeContext)_localctx).first = oclExpression(_localctx.env);
			setState(274);
			match(DOUBLE_DOT);
			setState(275);
			((CollectionRangeContext)_localctx).last = oclExpression(_localctx.env);
			 ((CollectionRangeContext)_localctx).ast =  new ASTCollectionRange(((CollectionRangeContext)_localctx).first.ast, ((CollectionRangeContext)_localctx).last.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveLiteralExpContext extends ParserRuleContext {
		public Environment env;
		public ASTPrimitiveLiteralExp ast;
		public IntegerLiteralExpContext i;
		public RealLiteralExpContext real;
		public StringLiteralExpContext str;
		public BooleanLiteralExpContext b;
		public UnlimitedNaturalLiteralExpContext uNatural;
		public NullLiteralExpContext n;
		public InvalidLiteralExpContext inv;
		public IntegerLiteralExpContext integerLiteralExp() {
			return getRuleContext(IntegerLiteralExpContext.class,0);
		}
		public RealLiteralExpContext realLiteralExp() {
			return getRuleContext(RealLiteralExpContext.class,0);
		}
		public StringLiteralExpContext stringLiteralExp() {
			return getRuleContext(StringLiteralExpContext.class,0);
		}
		public BooleanLiteralExpContext booleanLiteralExp() {
			return getRuleContext(BooleanLiteralExpContext.class,0);
		}
		public UnlimitedNaturalLiteralExpContext unlimitedNaturalLiteralExp() {
			return getRuleContext(UnlimitedNaturalLiteralExpContext.class,0);
		}
		public NullLiteralExpContext nullLiteralExp() {
			return getRuleContext(NullLiteralExpContext.class,0);
		}
		public InvalidLiteralExpContext invalidLiteralExp() {
			return getRuleContext(InvalidLiteralExpContext.class,0);
		}
		public PrimitiveLiteralExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimitiveLiteralExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_primitiveLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPrimitiveLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPrimitiveLiteralExp(this);
		}
	}

	public final PrimitiveLiteralExpContext primitiveLiteralExp(Environment env) throws RecognitionException {
		PrimitiveLiteralExpContext _localctx = new PrimitiveLiteralExpContext(_ctx, getState(), env);
		enterRule(_localctx, 28, RULE_primitiveLiteralExp);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_N:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((PrimitiveLiteralExpContext)_localctx).i = integerLiteralExp();
				 ((PrimitiveLiteralExpContext)_localctx).ast =  ((PrimitiveLiteralExpContext)_localctx).i.ast; 
				}
				break;
			case REAL_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((PrimitiveLiteralExpContext)_localctx).real = realLiteralExp();
				 ((PrimitiveLiteralExpContext)_localctx).ast =  ((PrimitiveLiteralExpContext)_localctx).real.ast; 
				}
				break;
			case STRING_CHARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((PrimitiveLiteralExpContext)_localctx).str = stringLiteralExp();
				 ((PrimitiveLiteralExpContext)_localctx).ast =  ((PrimitiveLiteralExpContext)_localctx).str.ast; 
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				((PrimitiveLiteralExpContext)_localctx).b = booleanLiteralExp();
				 ((PrimitiveLiteralExpContext)_localctx).ast =  ((PrimitiveLiteralExpContext)_localctx).b.ast; 
				}
				break;
			case NATURAL_N:
			case ASTERISK:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				((PrimitiveLiteralExpContext)_localctx).uNatural = unlimitedNaturalLiteralExp();
				 ((PrimitiveLiteralExpContext)_localctx).ast =  ((PrimitiveLiteralExpContext)_localctx).uNatural.ast; 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				((PrimitiveLiteralExpContext)_localctx).n = nullLiteralExp();
				 ((PrimitiveLiteralExpContext)_localctx).ast =  ((PrimitiveLiteralExpContext)_localctx).n.ast; 
				}
				break;
			case INVALID:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				((PrimitiveLiteralExpContext)_localctx).inv = invalidLiteralExp();
				 ((PrimitiveLiteralExpContext)_localctx).ast =  ((PrimitiveLiteralExpContext)_localctx).inv.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleLiteralExpContext extends ParserRuleContext {
		public Environment env;
		public ASTTupleLiteralExp ast;
		public VariableDeclarationListContext vDecArrayList;
		public TerminalNode TUPLE() { return getToken(TOCLParser.TUPLE, 0); }
		public TerminalNode LBRACK() { return getToken(TOCLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TOCLParser.RBRACK, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TupleLiteralExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TupleLiteralExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_tupleLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterTupleLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitTupleLiteralExp(this);
		}
	}

	public final TupleLiteralExpContext tupleLiteralExp(Environment env) throws RecognitionException {
		TupleLiteralExpContext _localctx = new TupleLiteralExpContext(_ctx, getState(), env);
		enterRule(_localctx, 30, RULE_tupleLiteralExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(TUPLE);
			setState(302);
			match(LBRACK);
			setState(303);
			((TupleLiteralExpContext)_localctx).vDecArrayList = variableDeclarationList(_localctx.env);
			setState(304);
			match(RBRACK);
			 ((TupleLiteralExpContext)_localctx).ast =  new ASTTupleLiteralExp(((TupleLiteralExpContext)_localctx).vDecArrayList.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlimitedNaturalLiteralExpContext extends ParserRuleContext {
		public ASTUnlimitedNaturalLiteralExp ast;
		public Token n;
		public TerminalNode NATURAL_N() { return getToken(TOCLParser.NATURAL_N, 0); }
		public TerminalNode ASTERISK() { return getToken(TOCLParser.ASTERISK, 0); }
		public UnlimitedNaturalLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlimitedNaturalLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterUnlimitedNaturalLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitUnlimitedNaturalLiteralExp(this);
		}
	}

	public final UnlimitedNaturalLiteralExpContext unlimitedNaturalLiteralExp() throws RecognitionException {
		UnlimitedNaturalLiteralExpContext _localctx = new UnlimitedNaturalLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unlimitedNaturalLiteralExp);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURAL_N:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((UnlimitedNaturalLiteralExpContext)_localctx).n = match(NATURAL_N);
				 ((UnlimitedNaturalLiteralExpContext)_localctx).ast =  new ASTUnlimitedNaturalLiteralExp((((UnlimitedNaturalLiteralExpContext)_localctx).n!=null?((UnlimitedNaturalLiteralExpContext)_localctx).n.getText():null)); 
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(ASTERISK);
				 ((UnlimitedNaturalLiteralExpContext)_localctx).ast =  new ASTUnlimitedNaturalLiteralExp("-1"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralExpContext extends ParserRuleContext {
		public ASTIntegerLiteralExp ast;
		public Token i;
		public TerminalNode INTEGER_N() { return getToken(TOCLParser.INTEGER_N, 0); }
		public IntegerLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterIntegerLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitIntegerLiteralExp(this);
		}
	}

	public final IntegerLiteralExpContext integerLiteralExp() throws RecognitionException {
		IntegerLiteralExpContext _localctx = new IntegerLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_integerLiteralExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((IntegerLiteralExpContext)_localctx).i = match(INTEGER_N);
			 ((IntegerLiteralExpContext)_localctx).ast =  new ASTIntegerLiteralExp((((IntegerLiteralExpContext)_localctx).i!=null?((IntegerLiteralExpContext)_localctx).i.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealLiteralExpContext extends ParserRuleContext {
		public ASTRealLiteralExp ast;
		public Token r;
		public TerminalNode REAL_N() { return getToken(TOCLParser.REAL_N, 0); }
		public RealLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterRealLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitRealLiteralExp(this);
		}
	}

	public final RealLiteralExpContext realLiteralExp() throws RecognitionException {
		RealLiteralExpContext _localctx = new RealLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_realLiteralExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((RealLiteralExpContext)_localctx).r = match(REAL_N);
			 ((RealLiteralExpContext)_localctx).ast =  new ASTRealLiteralExp((((RealLiteralExpContext)_localctx).r!=null?((RealLiteralExpContext)_localctx).r.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralExpContext extends ParserRuleContext {
		public ASTStringLiteralExp ast;
		public Token s;
		public TerminalNode STRING_CHARS() { return getToken(TOCLParser.STRING_CHARS, 0); }
		public StringLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterStringLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitStringLiteralExp(this);
		}
	}

	public final StringLiteralExpContext stringLiteralExp() throws RecognitionException {
		StringLiteralExpContext _localctx = new StringLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringLiteralExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((StringLiteralExpContext)_localctx).s = match(STRING_CHARS);
			 ((StringLiteralExpContext)_localctx).ast =  new ASTStringLiteralExp((((StringLiteralExpContext)_localctx).s!=null?((StringLiteralExpContext)_localctx).s.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralExpContext extends ParserRuleContext {
		public ASTBooleanLiteralExp ast;
		public TerminalNode TRUE() { return getToken(TOCLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TOCLParser.FALSE, 0); }
		public BooleanLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterBooleanLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitBooleanLiteralExp(this);
		}
	}

	public final BooleanLiteralExpContext booleanLiteralExp() throws RecognitionException {
		BooleanLiteralExpContext _localctx = new BooleanLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanLiteralExp);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(TRUE);
				 ((BooleanLiteralExpContext)_localctx).ast =  new ASTBooleanLiteralExp(true); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(FALSE);
				 ((BooleanLiteralExpContext)_localctx).ast =  new ASTBooleanLiteralExp(false); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperationExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public OrExpContext or1;
		public Token op;
		public OrExpContext or2;
		public List<OrExpContext> orExp() {
			return getRuleContexts(OrExpContext.class);
		}
		public OrExpContext orExp(int i) {
			return getRuleContext(OrExpContext.class,i);
		}
		public List<TerminalNode> IMPLIES() { return getTokens(TOCLParser.IMPLIES); }
		public TerminalNode IMPLIES(int i) {
			return getToken(TOCLParser.IMPLIES, i);
		}
		public BinaryOperationExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BinaryOperationExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_binaryOperationExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterBinaryOperationExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitBinaryOperationExp(this);
		}
	}

	public final BinaryOperationExpContext binaryOperationExp(Environment env) throws RecognitionException {
		BinaryOperationExpContext _localctx = new BinaryOperationExpContext(_ctx, getState(), env);
		enterRule(_localctx, 42, RULE_binaryOperationExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((BinaryOperationExpContext)_localctx).or1 = orExp(_localctx.env);
			 ((BinaryOperationExpContext)_localctx).ast =  ((BinaryOperationExpContext)_localctx).or1.ast; 
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					((BinaryOperationExpContext)_localctx).op = match(IMPLIES);
					setState(331);
					((BinaryOperationExpContext)_localctx).or2 = orExp(_localctx.env);
					 ((BinaryOperationExpContext)_localctx).ast =  new ASTBinaryOperationExp((((BinaryOperationExpContext)_localctx).op!=null?((BinaryOperationExpContext)_localctx).op.getText():null), ((BinaryOperationExpContext)_localctx).or1.ast, ((BinaryOperationExpContext)_localctx).or2.ast); 
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public XorExpContext xor1;
		public Token op;
		public XorExpContext xor2;
		public List<XorExpContext> xorExp() {
			return getRuleContexts(XorExpContext.class);
		}
		public XorExpContext xorExp(int i) {
			return getRuleContext(XorExpContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TOCLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TOCLParser.OR, i);
		}
		public OrExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OrExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_orExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOrExp(this);
		}
	}

	public final OrExpContext orExp(Environment env) throws RecognitionException {
		OrExpContext _localctx = new OrExpContext(_ctx, getState(), env);
		enterRule(_localctx, 44, RULE_orExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((OrExpContext)_localctx).xor1 = xorExp(_localctx.env);
			 ((OrExpContext)_localctx).ast =  ((OrExpContext)_localctx).xor1.ast; 
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					((OrExpContext)_localctx).op = match(OR);
					setState(342);
					((OrExpContext)_localctx).xor2 = xorExp(_localctx.env);
					 ((OrExpContext)_localctx).ast =  new ASTBinaryOperationExp((((OrExpContext)_localctx).op!=null?((OrExpContext)_localctx).op.getText():null), ((OrExpContext)_localctx).xor1.ast, ((OrExpContext)_localctx).xor2.ast); 
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public AndExpContext and1;
		public Token op;
		public AndExpContext and2;
		public List<AndExpContext> andExp() {
			return getRuleContexts(AndExpContext.class);
		}
		public AndExpContext andExp(int i) {
			return getRuleContext(AndExpContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(TOCLParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(TOCLParser.XOR, i);
		}
		public XorExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public XorExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_xorExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterXorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitXorExp(this);
		}
	}

	public final XorExpContext xorExp(Environment env) throws RecognitionException {
		XorExpContext _localctx = new XorExpContext(_ctx, getState(), env);
		enterRule(_localctx, 46, RULE_xorExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((XorExpContext)_localctx).and1 = andExp(_localctx.env);
			 ((XorExpContext)_localctx).ast =  ((XorExpContext)_localctx).and1.ast; 
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					((XorExpContext)_localctx).op = match(XOR);
					setState(353);
					((XorExpContext)_localctx).and2 = andExp(_localctx.env);
					 ((XorExpContext)_localctx).ast =  new ASTBinaryOperationExp((((XorExpContext)_localctx).op!=null?((XorExpContext)_localctx).op.getText():null), ((XorExpContext)_localctx).and1.ast, ((XorExpContext)_localctx).and2.ast); 
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public EqualityExpContext eq1;
		public Token op;
		public EqualityExpContext eq2;
		public List<EqualityExpContext> equalityExp() {
			return getRuleContexts(EqualityExpContext.class);
		}
		public EqualityExpContext equalityExp(int i) {
			return getRuleContext(EqualityExpContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TOCLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TOCLParser.AND, i);
		}
		public AndExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AndExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitAndExp(this);
		}
	}

	public final AndExpContext andExp(Environment env) throws RecognitionException {
		AndExpContext _localctx = new AndExpContext(_ctx, getState(), env);
		enterRule(_localctx, 48, RULE_andExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			((AndExpContext)_localctx).eq1 = equalityExp(_localctx.env);
			 ((AndExpContext)_localctx).ast =  ((AndExpContext)_localctx).eq1.ast; 
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					((AndExpContext)_localctx).op = match(AND);
					setState(364);
					((AndExpContext)_localctx).eq2 = equalityExp(_localctx.env);
					 ((AndExpContext)_localctx).ast =  new ASTBinaryOperationExp((((AndExpContext)_localctx).op!=null?((AndExpContext)_localctx).op.getText():null), ((AndExpContext)_localctx).eq1.ast, ((AndExpContext)_localctx).eq2.ast); 
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public RelationalExpContext rel1;
		public Token op;
		public RelationalExpContext rel2;
		public List<RelationalExpContext> relationalExp() {
			return getRuleContexts(RelationalExpContext.class);
		}
		public RelationalExpContext relationalExp(int i) {
			return getRuleContext(RelationalExpContext.class,i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(TOCLParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(TOCLParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(TOCLParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(TOCLParser.EQUALS, i);
		}
		public EqualityExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EqualityExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_equalityExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterEqualityExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitEqualityExp(this);
		}
	}

	public final EqualityExpContext equalityExp(Environment env) throws RecognitionException {
		EqualityExpContext _localctx = new EqualityExpContext(_ctx, getState(), env);
		enterRule(_localctx, 50, RULE_equalityExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			((EqualityExpContext)_localctx).rel1 = relationalExp(_localctx.env);
			 ((EqualityExpContext)_localctx).ast =  ((EqualityExpContext)_localctx).rel1.ast; 
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					((EqualityExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EQUALS || _la==NOT_EQUAL) ) {
						((EqualityExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(375);
					((EqualityExpContext)_localctx).rel2 = relationalExp(_localctx.env);
					 ((EqualityExpContext)_localctx).ast =  new ASTBinaryOperationExp((((EqualityExpContext)_localctx).op!=null?((EqualityExpContext)_localctx).op.getText():null), ((EqualityExpContext)_localctx).rel1.ast, ((EqualityExpContext)_localctx).rel2.ast); 
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public AdditiveExpContext add1;
		public Token op;
		public AdditiveExpContext add2;
		public List<AdditiveExpContext> additiveExp() {
			return getRuleContexts(AdditiveExpContext.class);
		}
		public AdditiveExpContext additiveExp(int i) {
			return getRuleContext(AdditiveExpContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(TOCLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TOCLParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(TOCLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(TOCLParser.LT, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(TOCLParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(TOCLParser.EQUALS, i);
		}
		public RelationalExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RelationalExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_relationalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterRelationalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitRelationalExp(this);
		}
	}

	public final RelationalExpContext relationalExp(Environment env) throws RecognitionException {
		RelationalExpContext _localctx = new RelationalExpContext(_ctx, getState(), env);
		enterRule(_localctx, 52, RULE_relationalExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((RelationalExpContext)_localctx).add1 = additiveExp(_localctx.env);
			 ((RelationalExpContext)_localctx).ast =  ((RelationalExpContext)_localctx).add1.ast; 
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					((RelationalExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==GT || _la==LT) ) {
						((RelationalExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUALS) {
						{
						setState(386);
						match(EQUALS);
						}
					}

					setState(389);
					((RelationalExpContext)_localctx).add2 = additiveExp(_localctx.env);
					 ((RelationalExpContext)_localctx).ast =  new ASTBinaryOperationExp((((RelationalExpContext)_localctx).op!=null?((RelationalExpContext)_localctx).op.getText():null), ((RelationalExpContext)_localctx).add1.ast, ((RelationalExpContext)_localctx).add2.ast); 
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public MultiplicativeExpContext mul1;
		public Token op;
		public MultiplicativeExpContext mul2;
		public List<MultiplicativeExpContext> multiplicativeExp() {
			return getRuleContexts(MultiplicativeExpContext.class);
		}
		public MultiplicativeExpContext multiplicativeExp(int i) {
			return getRuleContext(MultiplicativeExpContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(TOCLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TOCLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(TOCLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(TOCLParser.MINUS, i);
		}
		public AdditiveExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AdditiveExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_additiveExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterAdditiveExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitAdditiveExp(this);
		}
	}

	public final AdditiveExpContext additiveExp(Environment env) throws RecognitionException {
		AdditiveExpContext _localctx = new AdditiveExpContext(_ctx, getState(), env);
		enterRule(_localctx, 54, RULE_additiveExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			((AdditiveExpContext)_localctx).mul1 = multiplicativeExp(_localctx.env);
			 ((AdditiveExpContext)_localctx).ast =  ((AdditiveExpContext)_localctx).mul1.ast; 
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					((AdditiveExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditiveExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(400);
					((AdditiveExpContext)_localctx).mul2 = multiplicativeExp(_localctx.env);
					 ((AdditiveExpContext)_localctx).ast =  new ASTBinaryOperationExp((((AdditiveExpContext)_localctx).op!=null?((AdditiveExpContext)_localctx).op.getText():null), ((AdditiveExpContext)_localctx).mul1.ast, ((AdditiveExpContext)_localctx).mul2.ast); 
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public UnaryExpContext un1;
		public Token op;
		public UnaryExpContext un2;
		public List<UnaryExpContext> unaryExp() {
			return getRuleContexts(UnaryExpContext.class);
		}
		public UnaryExpContext unaryExp(int i) {
			return getRuleContext(UnaryExpContext.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(TOCLParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(TOCLParser.ASTERISK, i);
		}
		public List<TerminalNode> DIVIDED_BY() { return getTokens(TOCLParser.DIVIDED_BY); }
		public TerminalNode DIVIDED_BY(int i) {
			return getToken(TOCLParser.DIVIDED_BY, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TOCLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TOCLParser.DIV, i);
		}
		public MultiplicativeExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiplicativeExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterMultiplicativeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitMultiplicativeExp(this);
		}
	}

	public final MultiplicativeExpContext multiplicativeExp(Environment env) throws RecognitionException {
		MultiplicativeExpContext _localctx = new MultiplicativeExpContext(_ctx, getState(), env);
		enterRule(_localctx, 56, RULE_multiplicativeExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			((MultiplicativeExpContext)_localctx).un1 = unaryExp(_localctx.env);
			 ((MultiplicativeExpContext)_localctx).ast =  ((MultiplicativeExpContext)_localctx).un1.ast; 
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					((MultiplicativeExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERISK) | (1L << DIVIDED_BY) | (1L << DIV))) != 0)) ) {
						((MultiplicativeExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(411);
					((MultiplicativeExpContext)_localctx).un2 = unaryExp(_localctx.env);
					 ((MultiplicativeExpContext)_localctx).ast =  new ASTBinaryOperationExp((((MultiplicativeExpContext)_localctx).op!=null?((MultiplicativeExpContext)_localctx).op.getText():null), ((MultiplicativeExpContext)_localctx).un1.ast, ((MultiplicativeExpContext)_localctx).un2.ast); 
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public UnaryExpContext un;
		public PostfixExpContext p;
		public TerminalNode NOT() { return getToken(TOCLParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(TOCLParser.MINUS, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public PostfixExpContext postfixExp() {
			return getRuleContext(PostfixExpContext.class,0);
		}
		public UnaryExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UnaryExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitUnaryExp(this);
		}
	}

	public final UnaryExpContext unaryExp(Environment env) throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState(), env);
		enterRule(_localctx, 58, RULE_unaryExp);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(420);
				((UnaryExpContext)_localctx).un = unaryExp(_localctx.env);
				 ((UnaryExpContext)_localctx).ast =  ((UnaryExpContext)_localctx).un.ast; 
				}
				break;
			case NATURAL_N:
			case INTEGER_N:
			case REAL_N:
			case ASTERISK:
			case SELF:
			case UNDERSCORE:
			case TUPLE:
			case HASH:
			case SET:
			case BAG:
			case SEQUENCE:
			case COLLECTION:
			case ORDERED_SET:
			case TRUE:
			case FALSE:
			case SELECT:
			case REJECT:
			case COLLECT:
			case EXISTS:
			case FOR_ALL:
			case IS_UNIQUE:
			case SORTED_BY:
			case INCLUDES:
			case EXCLUDES:
			case INCLUDES_ALL:
			case EXCLUDES_ALL:
			case ITERATE:
			case LPAREN:
			case OCL_AS_TYPE:
			case OCL_IS_KIND_OF:
			case OCL_IS_TYPE_OF:
			case SELECT_BY_KIND:
			case SELECT_BY_TYPE:
			case ALL_INSTANCES:
			case IF:
			case INVALID:
			case NULL:
			case NEXT:
			case ALWAYS:
			case SOMETIME:
			case PREVIOUS:
			case ALWAYS_PAST:
			case SOMETIME_PAST:
			case SIMPLE_NAME:
			case STRING_CHARS:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				((UnaryExpContext)_localctx).p = postfixExp(_localctx.env);
				 ((UnaryExpContext)_localctx).ast =  ((UnaryExpContext)_localctx).p.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public PrimaryExpContext pExp;
		public Token op;
		public CallExpContext cExp;
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public List<CallExpContext> callExp() {
			return getRuleContexts(CallExpContext.class);
		}
		public CallExpContext callExp(int i) {
			return getRuleContext(CallExpContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(TOCLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TOCLParser.DOT, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(TOCLParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(TOCLParser.ARROW, i);
		}
		public PostfixExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostfixExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_postfixExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPostfixExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPostfixExp(this);
		}
	}

	public final PostfixExpContext postfixExp(Environment env) throws RecognitionException {
		PostfixExpContext _localctx = new PostfixExpContext(_ctx, getState(), env);
		enterRule(_localctx, 60, RULE_postfixExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			((PostfixExpContext)_localctx).pExp = primaryExp(_localctx.env);
			 ((PostfixExpContext)_localctx).ast =  ((PostfixExpContext)_localctx).pExp.ast; 
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					((PostfixExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ARROW) ) {
						((PostfixExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(431);
					((PostfixExpContext)_localctx).cExp = callExp(_localctx.env, _localctx.ast);
					 ((PostfixExpContext)_localctx).ast =  ((PostfixExpContext)_localctx).cExp.ast; 
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public LiteralExpContext literalExp() {
			return getRuleContext(LiteralExpContext.class,0);
		}
		public VarExpContext varExp() {
			return getRuleContext(VarExpContext.class,0);
		}
		public CallExpContext callExp() {
			return getRuleContext(CallExpContext.class,0);
		}
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public ToclOperatorExpressionContext toclOperatorExpression() {
			return getRuleContext(ToclOperatorExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimaryExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPrimaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPrimaryExp(this);
		}
	}

	public final PrimaryExpContext primaryExp(Environment env) throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState(), env);
		enterRule(_localctx, 62, RULE_primaryExp);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				literalExp(_localctx.env);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				varExp(_localctx.env);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				callExp(_localctx.env, null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				ifExp(_localctx.env);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				toclOperatorExpression(_localctx.env);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				match(LPAREN);
				setState(445);
				oclExpression(_localctx.env);
				setState(446);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression src;
		public ASTCallExp ast;
		public FeatureCallExpContext fCallExp;
		public LoopExpContext lExp;
		public FeatureCallExpContext featureCallExp() {
			return getRuleContext(FeatureCallExpContext.class,0);
		}
		public LoopExpContext loopExp() {
			return getRuleContext(LoopExpContext.class,0);
		}
		public ToclOpCallExpContext toclOpCallExp() {
			return getRuleContext(ToclOpCallExpContext.class,0);
		}
		public CallExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CallExpContext(ParserRuleContext parent, int invokingState, Environment env, ASTOclExpression src) {
			super(parent, invokingState);
			this.env = env;
			this.src = src;
		}
		@Override public int getRuleIndex() { return RULE_callExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitCallExp(this);
		}
	}

	public final CallExpContext callExp(Environment env,ASTOclExpression src) throws RecognitionException {
		CallExpContext _localctx = new CallExpContext(_ctx, getState(), env, src);
		enterRule(_localctx, 64, RULE_callExp);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				((CallExpContext)_localctx).fCallExp = featureCallExp(_localctx.env, _localctx.src);
				 ((CallExpContext)_localctx).ast =  ((CallExpContext)_localctx).fCallExp.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				((CallExpContext)_localctx).lExp = loopExp(_localctx.env, _localctx.src);
				 ((CallExpContext)_localctx).ast =  ((CallExpContext)_localctx).lExp.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				toclOpCallExp(_localctx.env);
				 ((CallExpContext)_localctx).ast =  null; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression src;
		public ASTCallExp ast;
		public OclQueryExpContext qExp;
		public IterateExpContext itExp;
		public OclQueryExpContext oclQueryExp() {
			return getRuleContext(OclQueryExpContext.class,0);
		}
		public IterateExpContext iterateExp() {
			return getRuleContext(IterateExpContext.class,0);
		}
		public LoopExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LoopExpContext(ParserRuleContext parent, int invokingState, Environment env, ASTOclExpression src) {
			super(parent, invokingState);
			this.env = env;
			this.src = src;
		}
		@Override public int getRuleIndex() { return RULE_loopExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterLoopExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitLoopExp(this);
		}
	}

	public final LoopExpContext loopExp(Environment env,ASTOclExpression src) throws RecognitionException {
		LoopExpContext _localctx = new LoopExpContext(_ctx, getState(), env, src);
		enterRule(_localctx, 66, RULE_loopExp);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case REJECT:
			case COLLECT:
			case EXISTS:
			case FOR_ALL:
			case IS_UNIQUE:
			case SORTED_BY:
			case INCLUDES:
			case EXCLUDES:
			case INCLUDES_ALL:
			case EXCLUDES_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				((LoopExpContext)_localctx).qExp = oclQueryExp(_localctx.env, _localctx.src);
				 ((LoopExpContext)_localctx).ast =  ((LoopExpContext)_localctx).qExp.ast; 
				}
				break;
			case ITERATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				((LoopExpContext)_localctx).itExp = iterateExp(_localctx.env, _localctx.src);
				 ((LoopExpContext)_localctx).ast =  ((LoopExpContext)_localctx).itExp.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclQueryExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression src;
		public ASTOclQueryExp ast;
		public OclOperationIdentifierContext qIdent;
		public VariableDeclarationContext fDec;
		public VariableDeclarationContext sDec;
		public OclExpressionContext exp;
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public OclOperationIdentifierContext oclOperationIdentifier() {
			return getRuleContext(OclOperationIdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TOCLParser.COMMA, 0); }
		public TerminalNode BAR() { return getToken(TOCLParser.BAR, 0); }
		public OclQueryExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OclQueryExpContext(ParserRuleContext parent, int invokingState, Environment env, ASTOclExpression src) {
			super(parent, invokingState);
			this.env = env;
			this.src = src;
		}
		@Override public int getRuleIndex() { return RULE_oclQueryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOclQueryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOclQueryExp(this);
		}
	}

	public final OclQueryExpContext oclQueryExp(Environment env,ASTOclExpression src) throws RecognitionException {
		OclQueryExpContext _localctx = new OclQueryExpContext(_ctx, getState(), env, src);
		enterRule(_localctx, 68, RULE_oclQueryExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			((OclQueryExpContext)_localctx).qIdent = oclOperationIdentifier();
			setState(470);
			match(LPAREN);
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(471);
				((OclQueryExpContext)_localctx).fDec = variableDeclaration(_localctx.env);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(472);
					match(COMMA);
					setState(473);
					((OclQueryExpContext)_localctx).sDec = variableDeclaration(_localctx.env);
					}
				}

				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BAR) {
					{
					setState(476);
					match(BAR);
					setState(477);
					((OclQueryExpContext)_localctx).exp = oclExpression(_localctx.env);
					}
				}

				}
				break;
			case 2:
				{
				setState(480);
				((OclQueryExpContext)_localctx).exp = oclExpression(_localctx.env);
				}
				break;
			}
			setState(483);
			match(RPAREN);

			                if (((OclQueryExpContext)_localctx).exp != null) {
			                        if (((OclQueryExpContext)_localctx).fDec != null) {
			                                if (((OclQueryExpContext)_localctx).sDec != null) {
			                                        ((OclQueryExpContext)_localctx).ast =  new ASTOclQueryExp(_localctx.src, ((OclQueryExpContext)_localctx).qIdent.str, ((OclQueryExpContext)_localctx).fDec.ast, ((OclQueryExpContext)_localctx).sDec.ast, ((OclQueryExpContext)_localctx).exp.ast);
			                                }
			                                else {
			                                        ((OclQueryExpContext)_localctx).ast =  new ASTOclQueryExp(_localctx.src, ((OclQueryExpContext)_localctx).qIdent.str, ((OclQueryExpContext)_localctx).fDec.ast, null, ((OclQueryExpContext)_localctx).exp.ast);
			                                }
			                        }
			                        else {
			                                ((OclQueryExpContext)_localctx).ast =  new ASTOclQueryExp(_localctx.src, ((OclQueryExpContext)_localctx).qIdent.str, null, null, ((OclQueryExpContext)_localctx).exp.ast);
			                        }
			                }
			                else {
			                        if (((OclQueryExpContext)_localctx).fDec != null) {
			                                if (((OclQueryExpContext)_localctx).sDec != null) {
			                                        ((OclQueryExpContext)_localctx).ast =  new ASTOclQueryExp(_localctx.src, ((OclQueryExpContext)_localctx).qIdent.str, ((OclQueryExpContext)_localctx).fDec.ast, ((OclQueryExpContext)_localctx).sDec.ast, null);
			                                }
			                                else {
			                                        ((OclQueryExpContext)_localctx).ast =  new ASTOclQueryExp(_localctx.src, ((OclQueryExpContext)_localctx).qIdent.str, ((OclQueryExpContext)_localctx).fDec.ast, null, null);
			                                }
			                        }
			                        else {
			                                ((OclQueryExpContext)_localctx).ast =  new ASTOclQueryExp(_localctx.src, ((OclQueryExpContext)_localctx).qIdent.str, null, null, null);
			                        }
			                }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclOperationIdentifierContext extends ParserRuleContext {
		public String str;
		public TerminalNode SELECT() { return getToken(TOCLParser.SELECT, 0); }
		public TerminalNode REJECT() { return getToken(TOCLParser.REJECT, 0); }
		public TerminalNode COLLECT() { return getToken(TOCLParser.COLLECT, 0); }
		public TerminalNode EXISTS() { return getToken(TOCLParser.EXISTS, 0); }
		public TerminalNode FOR_ALL() { return getToken(TOCLParser.FOR_ALL, 0); }
		public TerminalNode IS_UNIQUE() { return getToken(TOCLParser.IS_UNIQUE, 0); }
		public TerminalNode SORTED_BY() { return getToken(TOCLParser.SORTED_BY, 0); }
		public TerminalNode INCLUDES() { return getToken(TOCLParser.INCLUDES, 0); }
		public TerminalNode EXCLUDES() { return getToken(TOCLParser.EXCLUDES, 0); }
		public TerminalNode INCLUDES_ALL() { return getToken(TOCLParser.INCLUDES_ALL, 0); }
		public TerminalNode EXCLUDES_ALL() { return getToken(TOCLParser.EXCLUDES_ALL, 0); }
		public OclOperationIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclOperationIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOclOperationIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOclOperationIdentifier(this);
		}
	}

	public final OclOperationIdentifierContext oclOperationIdentifier() throws RecognitionException {
		OclOperationIdentifierContext _localctx = new OclOperationIdentifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_oclOperationIdentifier);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(SELECT);
				 ((OclOperationIdentifierContext)_localctx).str =  "select"; 
				}
				break;
			case REJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(REJECT);
				 ((OclOperationIdentifierContext)_localctx).str =  "reject"; 
				}
				break;
			case COLLECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(COLLECT);
				 ((OclOperationIdentifierContext)_localctx).str =  "collect"; 
				}
				break;
			case EXISTS:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				match(EXISTS);
				 ((OclOperationIdentifierContext)_localctx).str =  "exists"; 
				}
				break;
			case FOR_ALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(FOR_ALL);
				 ((OclOperationIdentifierContext)_localctx).str =  "forAll"; 
				}
				break;
			case IS_UNIQUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(496);
				match(IS_UNIQUE);
				 ((OclOperationIdentifierContext)_localctx).str =  "isUnique"; 
				}
				break;
			case SORTED_BY:
				enterOuterAlt(_localctx, 7);
				{
				setState(498);
				match(SORTED_BY);
				 ((OclOperationIdentifierContext)_localctx).str =  "sortedby"; 
				}
				break;
			case INCLUDES:
				enterOuterAlt(_localctx, 8);
				{
				setState(500);
				match(INCLUDES);
				 ((OclOperationIdentifierContext)_localctx).str =  "includes"; 
				}
				break;
			case EXCLUDES:
				enterOuterAlt(_localctx, 9);
				{
				setState(502);
				match(EXCLUDES);
				 ((OclOperationIdentifierContext)_localctx).str =  "excludes"; 
				}
				break;
			case INCLUDES_ALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(504);
				match(INCLUDES_ALL);
				 ((OclOperationIdentifierContext)_localctx).str =  "includesAll"; 
				}
				break;
			case EXCLUDES_ALL:
				enterOuterAlt(_localctx, 11);
				{
				setState(506);
				match(EXCLUDES_ALL);
				 ((OclOperationIdentifierContext)_localctx).str =  "excludesAll"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterateExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression src;
		public ASTIterateExp ast;
		public VariableDeclarationContext fDec;
		public VariableDeclarationContext sDec;
		public OclExpressionContext exp;
		public TerminalNode ITERATE() { return getToken(TOCLParser.ITERATE, 0); }
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public TerminalNode BAR() { return getToken(TOCLParser.BAR, 0); }
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TOCLParser.SEMI, 0); }
		public IterateExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IterateExpContext(ParserRuleContext parent, int invokingState, Environment env, ASTOclExpression src) {
			super(parent, invokingState);
			this.env = env;
			this.src = src;
		}
		@Override public int getRuleIndex() { return RULE_iterateExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterIterateExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitIterateExp(this);
		}
	}

	public final IterateExpContext iterateExp(Environment env,ASTOclExpression src) throws RecognitionException {
		IterateExpContext _localctx = new IterateExpContext(_ctx, getState(), env, src);
		enterRule(_localctx, 72, RULE_iterateExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(ITERATE);
			setState(511);
			match(LPAREN);
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(512);
				((IterateExpContext)_localctx).fDec = variableDeclaration(_localctx.env);
				setState(513);
				match(SEMI);
				}
				break;
			}
			setState(517);
			((IterateExpContext)_localctx).sDec = variableDeclaration(_localctx.env);
			setState(518);
			match(BAR);
			setState(519);
			((IterateExpContext)_localctx).exp = oclExpression(_localctx.env);
			setState(520);
			match(RPAREN);
			 ((IterateExpContext)_localctx).ast =  new ASTIterateExp(_localctx.src, ((IterateExpContext)_localctx).fDec.ast, ((IterateExpContext)_localctx).sDec.ast, ((IterateExpContext)_localctx).exp.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public Environment env;
		public ASTVariableDeclaration ast;
		public SimpleNameContext n;
		public TypeContext t;
		public OclExpressionContext v;
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TOCLParser.COLON, 0); }
		public TerminalNode EQUALS() { return getToken(TOCLParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration(Environment env) throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState(), env);
		enterRule(_localctx, 74, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((VariableDeclarationContext)_localctx).n = simpleName();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(524);
				match(COLON);
				setState(525);
				((VariableDeclarationContext)_localctx).t = type(_localctx.env);
				}
			}

			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(528);
				match(EQUALS);
				setState(529);
				((VariableDeclarationContext)_localctx).v = oclExpression(_localctx.env);
				}
				break;
			}

			                if (((VariableDeclarationContext)_localctx).t != null) {
			                        if (((VariableDeclarationContext)_localctx).v != null) {
			                                ((VariableDeclarationContext)_localctx).ast =  new ASTVariableDeclaration(((VariableDeclarationContext)_localctx).n.str, ((VariableDeclarationContext)_localctx).t.ast, ((VariableDeclarationContext)_localctx).v.ast); 
			                        }
			                        else {
			                                ((VariableDeclarationContext)_localctx).ast =  new ASTVariableDeclaration(((VariableDeclarationContext)_localctx).n.str, ((VariableDeclarationContext)_localctx).t.ast, null);
			                        }
			                }
			                else {
			                        ((VariableDeclarationContext)_localctx).ast =  new ASTVariableDeclaration(((VariableDeclarationContext)_localctx).n.str, null, null);
			                }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Environment env;
		public ASTType ast;
		public PathNameContext p;
		public CollectionTypeContext cType;
		public TupleTypeContext tType;
		public PrimitiveTypeContext pType;
		public OclTypeContext oType;
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public CollectionTypeContext collectionType() {
			return getRuleContext(CollectionTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type(Environment env) throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState(), env);
		enterRule(_localctx, 76, RULE_type);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				((TypeContext)_localctx).p = pathName(0);
				 ((TypeContext)_localctx).ast =  new ASTType(((TypeContext)_localctx).p.path.get(((TypeContext)_localctx).p.path.size() - 1)); 
				}
				break;
			case SET:
			case BAG:
			case SEQUENCE:
			case COLLECTION:
			case ORDERED_SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				((TypeContext)_localctx).cType = collectionType(_localctx.env);
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).cType.ast; 
				}
				break;
			case TUPLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				((TypeContext)_localctx).tType = tupleType(_localctx.env);
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).tType.ast; 
				}
				break;
			case BOOLEAN:
			case INTEGER:
			case REAL:
			case STRING:
			case UNLIMITED_NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				((TypeContext)_localctx).pType = primitiveType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).pType.ast; 
				}
				break;
			case OCL_ANY:
			case OCL_INVALID:
			case OCL_MESSAGE:
			case OCL_VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				((TypeContext)_localctx).oType = oclType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).oType.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public ASTType ast;
		public Token b;
		public Token i;
		public Token r;
		public Token s;
		public Token u;
		public TerminalNode BOOLEAN() { return getToken(TOCLParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(TOCLParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(TOCLParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(TOCLParser.STRING, 0); }
		public TerminalNode UNLIMITED_NATURAL() { return getToken(TOCLParser.UNLIMITED_NATURAL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primitiveType);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				((PrimitiveTypeContext)_localctx).b = match(BOOLEAN);
				 ((PrimitiveTypeContext)_localctx).ast =  new ASTType("Boolean"); 
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				((PrimitiveTypeContext)_localctx).i = match(INTEGER);
				 ((PrimitiveTypeContext)_localctx).ast =  new ASTType("Integer"); 
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				((PrimitiveTypeContext)_localctx).r = match(REAL);
				 ((PrimitiveTypeContext)_localctx).ast =  new ASTType("Real"); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				((PrimitiveTypeContext)_localctx).s = match(STRING);
				 ((PrimitiveTypeContext)_localctx).ast =  new ASTType("String"); 
				}
				break;
			case UNLIMITED_NATURAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				((PrimitiveTypeContext)_localctx).u = match(UNLIMITED_NATURAL);
				 ((PrimitiveTypeContext)_localctx).ast =  new ASTType("UnlimitedNatural"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclTypeContext extends ParserRuleContext {
		public ASTType ast;
		public TerminalNode OCL_ANY() { return getToken(TOCLParser.OCL_ANY, 0); }
		public TerminalNode OCL_INVALID() { return getToken(TOCLParser.OCL_INVALID, 0); }
		public TerminalNode OCL_MESSAGE() { return getToken(TOCLParser.OCL_MESSAGE, 0); }
		public TerminalNode OCL_VOID() { return getToken(TOCLParser.OCL_VOID, 0); }
		public OclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOclType(this);
		}
	}

	public final OclTypeContext oclType() throws RecognitionException {
		OclTypeContext _localctx = new OclTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_oclType);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCL_ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(OCL_ANY);
				 ((OclTypeContext)_localctx).ast =  new ASTType("OclAny"); 
				}
				break;
			case OCL_INVALID:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(OCL_INVALID);
				 ((OclTypeContext)_localctx).ast =  new ASTType("OclInvalid"); 
				}
				break;
			case OCL_MESSAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				match(OCL_MESSAGE);
				 ((OclTypeContext)_localctx).ast =  new ASTType("OclMessage"); 
				}
				break;
			case OCL_VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				match(OCL_VOID);
				 ((OclTypeContext)_localctx).ast =  new ASTType("OclVoid"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionTypeContext extends ParserRuleContext {
		public Environment env;
		public ASTType ast;
		public CollectionTypeIdentifierContext cIdent;
		public TypeContext t;
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public CollectionTypeIdentifierContext collectionTypeIdentifier() {
			return getRuleContext(CollectionTypeIdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CollectionTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CollectionTypeContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_collectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterCollectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitCollectionType(this);
		}
	}

	public final CollectionTypeContext collectionType(Environment env) throws RecognitionException {
		CollectionTypeContext _localctx = new CollectionTypeContext(_ctx, getState(), env);
		enterRule(_localctx, 82, RULE_collectionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			((CollectionTypeContext)_localctx).cIdent = collectionTypeIdentifier();
			setState(574);
			match(LPAREN);
			setState(575);
			((CollectionTypeContext)_localctx).t = type(_localctx.env);
			setState(576);
			match(RPAREN);
			 ((CollectionTypeContext)_localctx).ast =  new ASTCollectionType(((CollectionTypeContext)_localctx).cIdent.str, ((CollectionTypeContext)_localctx).t.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public Environment env;
		public ASTType ast;
		public VariableDeclarationListContext varDecs;
		public TerminalNode TUPLE() { return getToken(TOCLParser.TUPLE, 0); }
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TupleTypeContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType(Environment env) throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState(), env);
		enterRule(_localctx, 84, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(TUPLE);
			setState(580);
			match(LPAREN);
			setState(581);
			((TupleTypeContext)_localctx).varDecs = variableDeclarationList(_localctx.env);
			setState(582);
			match(RPAREN);
			 ((TupleTypeContext)_localctx).ast =  new ASTTupleType(((TupleTypeContext)_localctx).varDecs.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public Environment env;
		public ArrayList<ASTVariableDeclaration> ast;
		public VariableDeclarationContext vDec;
		public VariableDeclarationListContext vDecArrayList;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TOCLParser.COMMA, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList(Environment env) throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState(), env);
		enterRule(_localctx, 86, RULE_variableDeclarationList);
		 ((VariableDeclarationListContext)_localctx).ast =  new ArrayList<ASTVariableDeclaration>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			((VariableDeclarationListContext)_localctx).vDec = variableDeclaration(_localctx.env);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(586);
				match(COMMA);
				setState(587);
				((VariableDeclarationListContext)_localctx).vDecArrayList = variableDeclarationList(_localctx.env);
				}
			}


			                if (((VariableDeclarationListContext)_localctx).vDecArrayList != null) {
			                        ((VariableDeclarationListContext)_localctx).ast =  ((VariableDeclarationListContext)_localctx).vDecArrayList.ast; 
			                }
			                _localctx.ast.add(((VariableDeclarationListContext)_localctx).vDec.ast);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureCallExpContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression src;
		public ASTCallExp ast;
		public SimpleNameContext n1;
		public SimpleNameContext n2;
		public IsMarkedPreContext p;
		public Token l;
		public ArgumentsContext a;
		public OclTypeExpIdentifierContext ident;
		public TypeContext t;
		public List<SimpleNameContext> simpleName() {
			return getRuleContexts(SimpleNameContext.class);
		}
		public SimpleNameContext simpleName(int i) {
			return getRuleContext(SimpleNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public TerminalNode L_SQ_BRACK() { return getToken(TOCLParser.L_SQ_BRACK, 0); }
		public TerminalNode R_SQ_BRACK() { return getToken(TOCLParser.R_SQ_BRACK, 0); }
		public IsMarkedPreContext isMarkedPre() {
			return getRuleContext(IsMarkedPreContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public OclTypeExpIdentifierContext oclTypeExpIdentifier() {
			return getRuleContext(OclTypeExpIdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ALL_INSTANCES() { return getToken(TOCLParser.ALL_INSTANCES, 0); }
		public FeatureCallExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FeatureCallExpContext(ParserRuleContext parent, int invokingState, Environment env, ASTOclExpression src) {
			super(parent, invokingState);
			this.env = env;
			this.src = src;
		}
		@Override public int getRuleIndex() { return RULE_featureCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterFeatureCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitFeatureCallExp(this);
		}
	}

	public final FeatureCallExpContext featureCallExp(Environment env,ASTOclExpression src) throws RecognitionException {
		FeatureCallExpContext _localctx = new FeatureCallExpContext(_ctx, getState(), env, src);
		enterRule(_localctx, 88, RULE_featureCallExp);
		 Boolean isPre = false; 
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				((FeatureCallExpContext)_localctx).n1 = simpleName();
				setState(611);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_SQ_BRACK:
					{
					{
					setState(593);
					match(L_SQ_BRACK);
					setState(594);
					((FeatureCallExpContext)_localctx).n2 = simpleName();
					setState(595);
					match(R_SQ_BRACK);
					}

					                        if (((FeatureCallExpContext)_localctx).n2.str == null) {
					                                ((FeatureCallExpContext)_localctx).ast =  new ASTPropertyCallExp(_localctx.src, ((FeatureCallExpContext)_localctx).n1.str, false);
					                        }
					                        else {
					                                ((FeatureCallExpContext)_localctx).ast =  new ASTAssociationClassCallExp(_localctx.src, ((FeatureCallExpContext)_localctx).n1.str, ((FeatureCallExpContext)_localctx).n2.str);
					                        }
					                
					}
					break;
				case EOF:
				case PLUS:
				case MINUS:
				case ASTERISK:
				case DIVIDED_BY:
				case RBRACK:
				case COMMA:
				case DOT:
				case DOUBLE_DOT:
				case BAR:
				case ARROW:
				case DIV:
				case EQUALS:
				case NOT_EQUAL:
				case RPAREN:
				case IMPLIES:
				case OR:
				case XOR:
				case AND:
				case GT:
				case LT:
				case AT_PRE:
				case IN:
				case SEMI:
				case THEN:
				case ELSE:
				case ENDIF:
				case ENDPACKAGE:
				case CONTEXT:
				case INIT:
				case DERIVE:
				case INV:
				case STATIC:
				case DEF:
				case PRE:
				case POST:
				case BODY:
				case UNTIL:
				case BEFORE:
				case SINCE:
					{
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AT_PRE) {
						{
						setState(599);
						((FeatureCallExpContext)_localctx).p = isMarkedPre();
						 isPre = true; 
						}
					}


					                       ((FeatureCallExpContext)_localctx).ast =  new ASTPropertyCallExp(_localctx.src, ((FeatureCallExpContext)_localctx).n1.str, isPre);
					                
					}
					break;
				case LPAREN:
					{
					setState(605);
					((FeatureCallExpContext)_localctx).l = match(LPAREN);
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_N) | (1L << INTEGER_N) | (1L << REAL_N) | (1L << MINUS) | (1L << ASTERISK) | (1L << SELF) | (1L << UNDERSCORE) | (1L << TUPLE) | (1L << HASH) | (1L << SET) | (1L << BAG) | (1L << SEQUENCE) | (1L << COLLECTION) | (1L << ORDERED_SET) | (1L << TRUE) | (1L << FALSE) | (1L << SELECT) | (1L << REJECT) | (1L << COLLECT) | (1L << EXISTS) | (1L << FOR_ALL) | (1L << IS_UNIQUE) | (1L << SORTED_BY) | (1L << INCLUDES) | (1L << EXCLUDES) | (1L << INCLUDES_ALL) | (1L << EXCLUDES_ALL) | (1L << ITERATE) | (1L << LPAREN) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OCL_AS_TYPE - 64)) | (1L << (OCL_IS_KIND_OF - 64)) | (1L << (OCL_IS_TYPE_OF - 64)) | (1L << (SELECT_BY_KIND - 64)) | (1L << (SELECT_BY_TYPE - 64)) | (1L << (ALL_INSTANCES - 64)) | (1L << (LET - 64)) | (1L << (IF - 64)) | (1L << (INVALID - 64)) | (1L << (NULL - 64)) | (1L << (NEXT - 64)) | (1L << (ALWAYS - 64)) | (1L << (SOMETIME - 64)) | (1L << (PREVIOUS - 64)) | (1L << (ALWAYS_PAST - 64)) | (1L << (SOMETIME_PAST - 64)) | (1L << (SIMPLE_NAME - 64)) | (1L << (STRING_CHARS - 64)))) != 0)) {
						{
						setState(606);
						((FeatureCallExpContext)_localctx).a = arguments(_localctx.env);
						}
					}

					setState(609);
					match(RPAREN);

					                        if (((FeatureCallExpContext)_localctx).a == null) {
					                                ((FeatureCallExpContext)_localctx).ast =  new ASTOperationCallExp(_localctx.src, ((FeatureCallExpContext)_localctx).n1.str, null);
					                        }
					                        else {
					                                ((FeatureCallExpContext)_localctx).ast =  new ASTOperationCallExp(_localctx.src, ((FeatureCallExpContext)_localctx).n1.str, ((FeatureCallExpContext)_localctx).a.ast);
					                        }
					                
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OCL_AS_TYPE:
			case OCL_IS_KIND_OF:
			case OCL_IS_TYPE_OF:
			case SELECT_BY_KIND:
			case SELECT_BY_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				((FeatureCallExpContext)_localctx).ident = oclTypeExpIdentifier();
				setState(614);
				match(LPAREN);
				setState(615);
				((FeatureCallExpContext)_localctx).t = type(_localctx.env);
				setState(616);
				match(RPAREN);

				                ArrayList l = new ArrayList<ASTOclExpression>();
				                l.add(((FeatureCallExpContext)_localctx).t.ast);
				                ((FeatureCallExpContext)_localctx).ast =  new ASTOperationCallExp(_localctx.src, ((FeatureCallExpContext)_localctx).ident.str, l);
				        
				}
				break;
			case ALL_INSTANCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				match(ALL_INSTANCES);
				setState(620);
				match(LPAREN);
				setState(621);
				match(RPAREN);
				 ((FeatureCallExpContext)_localctx).ast =  new ASTOperationCallExp(_localctx.src, "allInstances", null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclTypeExpIdentifierContext extends ParserRuleContext {
		public String str;
		public TerminalNode OCL_AS_TYPE() { return getToken(TOCLParser.OCL_AS_TYPE, 0); }
		public TerminalNode OCL_IS_KIND_OF() { return getToken(TOCLParser.OCL_IS_KIND_OF, 0); }
		public TerminalNode OCL_IS_TYPE_OF() { return getToken(TOCLParser.OCL_IS_TYPE_OF, 0); }
		public TerminalNode SELECT_BY_KIND() { return getToken(TOCLParser.SELECT_BY_KIND, 0); }
		public TerminalNode SELECT_BY_TYPE() { return getToken(TOCLParser.SELECT_BY_TYPE, 0); }
		public OclTypeExpIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclTypeExpIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOclTypeExpIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOclTypeExpIdentifier(this);
		}
	}

	public final OclTypeExpIdentifierContext oclTypeExpIdentifier() throws RecognitionException {
		OclTypeExpIdentifierContext _localctx = new OclTypeExpIdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oclTypeExpIdentifier);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCL_AS_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(OCL_AS_TYPE);
				 ((OclTypeExpIdentifierContext)_localctx).str =  "oclAsType"; 
				}
				break;
			case OCL_IS_KIND_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(OCL_IS_KIND_OF);
				 ((OclTypeExpIdentifierContext)_localctx).str =  "oclIsKindOf"; 
				}
				break;
			case OCL_IS_TYPE_OF:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				match(OCL_IS_TYPE_OF);
				 ((OclTypeExpIdentifierContext)_localctx).str =  "ocArrayListypeOf"; 
				}
				break;
			case SELECT_BY_KIND:
				enterOuterAlt(_localctx, 4);
				{
				setState(631);
				match(SELECT_BY_KIND);
				 ((OclTypeExpIdentifierContext)_localctx).str =  "selectByKind"; 
				}
				break;
			case SELECT_BY_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(633);
				match(SELECT_BY_TYPE);
				 ((OclTypeExpIdentifierContext)_localctx).str =  "selectByType"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsMarkedPreContext extends ParserRuleContext {
		public TerminalNode AT_PRE() { return getToken(TOCLParser.AT_PRE, 0); }
		public IsMarkedPreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isMarkedPre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterIsMarkedPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitIsMarkedPre(this);
		}
	}

	public final IsMarkedPreContext isMarkedPre() throws RecognitionException {
		IsMarkedPreContext _localctx = new IsMarkedPreContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_isMarkedPre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(AT_PRE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public Environment env;
		public ArrayList<ASTOclExpression> ast;
		public OclExpressionContext e;
		public ArgumentsContext args;
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TOCLParser.COMMA, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments(Environment env) throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState(), env);
		enterRule(_localctx, 94, RULE_arguments);
		 ((ArgumentsContext)_localctx).ast =  new ArrayList<ASTOclExpression>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			((ArgumentsContext)_localctx).e = oclExpression(_localctx.env);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(640);
				match(COMMA);
				setState(641);
				((ArgumentsContext)_localctx).args = arguments(_localctx.env);
				}
			}


			                if (((ArgumentsContext)_localctx).args != null) {
			                        ((ArgumentsContext)_localctx).ast =  ((ArgumentsContext)_localctx).args.ast;
			                }
			                _localctx.ast.add(((ArgumentsContext)_localctx).e.ast);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetExpContext extends ParserRuleContext {
		public Environment env;
		public ASTLetExp ast;
		public VariableDeclarationContext vDec;
		public LetExpSubContext sub;
		public TerminalNode LET() { return getToken(TOCLParser.LET, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public LetExpSubContext letExpSub() {
			return getRuleContext(LetExpSubContext.class,0);
		}
		public LetExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LetExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_letExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterLetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitLetExp(this);
		}
	}

	public final LetExpContext letExp(Environment env) throws RecognitionException {
		LetExpContext _localctx = new LetExpContext(_ctx, getState(), env);
		enterRule(_localctx, 96, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(LET);
			setState(647);
			((LetExpContext)_localctx).vDec = variableDeclaration(_localctx.env);
			setState(648);
			((LetExpContext)_localctx).sub = letExpSub(_localctx.env.nestedEnvironment().addElement(((LetExpContext)_localctx).vDec.ast.getVarName(), ((LetExpContext)_localctx).vDec.ast));
			 ((LetExpContext)_localctx).ast =  new ASTLetExp(((LetExpContext)_localctx).vDec.ast, ((LetExpContext)_localctx).sub.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetExpSubContext extends ParserRuleContext {
		public Environment env;
		public ASTOclExpression ast;
		public VariableDeclarationContext vDec;
		public LetExpSubContext sub;
		public OclExpressionContext e;
		public TerminalNode COMMA() { return getToken(TOCLParser.COMMA, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public LetExpSubContext letExpSub() {
			return getRuleContext(LetExpSubContext.class,0);
		}
		public TerminalNode IN() { return getToken(TOCLParser.IN, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public LetExpSubContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LetExpSubContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_letExpSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterLetExpSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitLetExpSub(this);
		}
	}

	public final LetExpSubContext letExpSub(Environment env) throws RecognitionException {
		LetExpSubContext _localctx = new LetExpSubContext(_ctx, getState(), env);
		enterRule(_localctx, 98, RULE_letExpSub);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(COMMA);
				setState(652);
				((LetExpSubContext)_localctx).vDec = variableDeclaration(_localctx.env);
				setState(653);
				((LetExpSubContext)_localctx).sub = letExpSub(_localctx.env.nestedEnvironment().addElement(((LetExpSubContext)_localctx).vDec.ast.getVarName(), ((LetExpSubContext)_localctx).vDec.ast));
				 ((LetExpSubContext)_localctx).ast =  new ASTLetExp(((LetExpSubContext)_localctx).vDec.ast, ((LetExpSubContext)_localctx).sub.ast); 
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(IN);
				setState(657);
				((LetExpSubContext)_localctx).e = oclExpression(_localctx.env);
				 ((LetExpSubContext)_localctx).ast =  ((LetExpSubContext)_localctx).e.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpContext extends ParserRuleContext {
		public Environment env;
		public ASTIfExp ast;
		public OclExpressionContext e1;
		public OclExpressionContext e2;
		public OclExpressionContext e3;
		public TerminalNode IF() { return getToken(TOCLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(TOCLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(TOCLParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(TOCLParser.ENDIF, 0); }
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public IfExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_ifExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitIfExp(this);
		}
	}

	public final IfExpContext ifExp(Environment env) throws RecognitionException {
		IfExpContext _localctx = new IfExpContext(_ctx, getState(), env);
		enterRule(_localctx, 100, RULE_ifExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(IF);
			setState(663);
			((IfExpContext)_localctx).e1 = oclExpression(_localctx.env);
			setState(664);
			match(THEN);
			setState(665);
			((IfExpContext)_localctx).e2 = oclExpression(_localctx.env);
			setState(666);
			match(ELSE);
			setState(667);
			((IfExpContext)_localctx).e3 = oclExpression(_localctx.env);
			setState(668);
			match(ENDIF);
			 ((IfExpContext)_localctx).ast =  new ASTIfExp(((IfExpContext)_localctx).e1.ast, ((IfExpContext)_localctx).e2.ast, ((IfExpContext)_localctx).e3.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralExpContext extends ParserRuleContext {
		public ASTNullLiteralExp ast;
		public TerminalNode NULL() { return getToken(TOCLParser.NULL, 0); }
		public NullLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterNullLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitNullLiteralExp(this);
		}
	}

	public final NullLiteralExpContext nullLiteralExp() throws RecognitionException {
		NullLiteralExpContext _localctx = new NullLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_nullLiteralExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(NULL);
			 ((NullLiteralExpContext)_localctx).ast =  new ASTNullLiteralExp(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidLiteralExpContext extends ParserRuleContext {
		public ASTInvalidLiteralExp ast;
		public TerminalNode INVALID() { return getToken(TOCLParser.INVALID, 0); }
		public InvalidLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterInvalidLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitInvalidLiteralExp(this);
		}
	}

	public final InvalidLiteralExpContext invalidLiteralExp() throws RecognitionException {
		InvalidLiteralExpContext _localctx = new InvalidLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_invalidLiteralExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(INVALID);
			 ((InvalidLiteralExpContext)_localctx).ast =  new ASTInvalidLiteralExp(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode PACKAGE() { return getToken(TOCLParser.PACKAGE, 0); }
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public TerminalNode ENDPACKAGE() { return getToken(TOCLParser.ENDPACKAGE, 0); }
		public List<ContextDeclarationContext> contextDeclaration() {
			return getRuleContexts(ContextDeclarationContext.class);
		}
		public ContextDeclarationContext contextDeclaration(int i) {
			return getRuleContext(ContextDeclarationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration(Environment env) throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState(), env);
		enterRule(_localctx, 106, RULE_packageDeclaration);
		int _la;
		try {
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(PACKAGE);
				setState(678);
				pathName(0);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONTEXT) {
					{
					{
					setState(679);
					contextDeclaration(_localctx.env);
					}
					}
					setState(684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(685);
				match(ENDPACKAGE);
				}
				break;
			case CONTEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(688); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(687);
					contextDeclaration(_localctx.env);
					}
					}
					setState(690); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONTEXT );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextDeclarationContext extends ParserRuleContext {
		public Environment env;
		public PropertyContextDeclContext propertyContextDecl() {
			return getRuleContext(PropertyContextDeclContext.class,0);
		}
		public ClassifierContextDeclContext classifierContextDecl() {
			return getRuleContext(ClassifierContextDeclContext.class,0);
		}
		public OperationContextDeclContext operationContextDecl() {
			return getRuleContext(OperationContextDeclContext.class,0);
		}
		public ContextDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ContextDeclarationContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_contextDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterContextDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitContextDeclaration(this);
		}
	}

	public final ContextDeclarationContext contextDeclaration(Environment env) throws RecognitionException {
		ContextDeclarationContext _localctx = new ContextDeclarationContext(_ctx, getState(), env);
		enterRule(_localctx, 108, RULE_contextDeclaration);
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				propertyContextDecl(_localctx.env);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				classifierContextDecl(_localctx.env);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				operationContextDecl(_localctx.env);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContextDeclContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode CONTEXT() { return getToken(TOCLParser.CONTEXT, 0); }
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public TerminalNode SCOPE() { return getToken(TOCLParser.SCOPE, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TOCLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InitOrDerValueContext initOrDerValue() {
			return getRuleContext(InitOrDerValueContext.class,0);
		}
		public PropertyContextDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PropertyContextDeclContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_propertyContextDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPropertyContextDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPropertyContextDecl(this);
		}
	}

	public final PropertyContextDeclContext propertyContextDecl(Environment env) throws RecognitionException {
		PropertyContextDeclContext _localctx = new PropertyContextDeclContext(_ctx, getState(), env);
		enterRule(_localctx, 110, RULE_propertyContextDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(CONTEXT);
			setState(700);
			pathName(0);
			setState(701);
			match(SCOPE);
			setState(702);
			simpleName();
			setState(703);
			match(COLON);
			setState(704);
			type(_localctx.env);
			setState(705);
			initOrDerValue(_localctx.env);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitOrDerValueContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode COLON() { return getToken(TOCLParser.COLON, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public TerminalNode INIT() { return getToken(TOCLParser.INIT, 0); }
		public TerminalNode DERIVE() { return getToken(TOCLParser.DERIVE, 0); }
		public InitOrDerValueContext initOrDerValue() {
			return getRuleContext(InitOrDerValueContext.class,0);
		}
		public InitOrDerValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitOrDerValueContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_initOrDerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterInitOrDerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitInitOrDerValue(this);
		}
	}

	public final InitOrDerValueContext initOrDerValue(Environment env) throws RecognitionException {
		InitOrDerValueContext _localctx = new InitOrDerValueContext(_ctx, getState(), env);
		enterRule(_localctx, 112, RULE_initOrDerValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if ( !(_la==INIT || _la==DERIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(708);
			match(COLON);
			setState(709);
			oclExpression(_localctx.env);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT || _la==DERIVE) {
				{
				setState(710);
				initOrDerValue(_localctx.env);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassifierContextDeclContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode CONTEXT() { return getToken(TOCLParser.CONTEXT, 0); }
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public InvOrDefContext invOrDef() {
			return getRuleContext(InvOrDefContext.class,0);
		}
		public List<SimpleNameContext> simpleName() {
			return getRuleContexts(SimpleNameContext.class);
		}
		public SimpleNameContext simpleName(int i) {
			return getRuleContext(SimpleNameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(TOCLParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TOCLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TOCLParser.COMMA, i);
		}
		public ClassifierContextDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassifierContextDeclContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_classifierContextDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterClassifierContextDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitClassifierContextDecl(this);
		}
	}

	public final ClassifierContextDeclContext classifierContextDecl(Environment env) throws RecognitionException {
		ClassifierContextDeclContext _localctx = new ClassifierContextDeclContext(_ctx, getState(), env);
		enterRule(_localctx, 114, RULE_classifierContextDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(CONTEXT);
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(714);
				simpleName();
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(715);
					match(COMMA);
					setState(716);
					simpleName();
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(722);
				match(COLON);
				}
				break;
			}
			setState(726);
			pathName(0);
			setState(727);
			invOrDef(_localctx.env);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvOrDefContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode INV() { return getToken(TOCLParser.INV, 0); }
		public TerminalNode COLON() { return getToken(TOCLParser.COLON, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public InvOrDefContext invOrDef() {
			return getRuleContext(InvOrDefContext.class,0);
		}
		public TerminalNode DEF() { return getToken(TOCLParser.DEF, 0); }
		public DefExpressionContext defExpression() {
			return getRuleContext(DefExpressionContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(TOCLParser.STATIC, 0); }
		public InvOrDefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InvOrDefContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_invOrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterInvOrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitInvOrDef(this);
		}
	}

	public final InvOrDefContext invOrDef(Environment env) throws RecognitionException {
		InvOrDefContext _localctx = new InvOrDefContext(_ctx, getState(), env);
		enterRule(_localctx, 116, RULE_invOrDef);
		int _la;
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INV:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(INV);
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDERSCORE || _la==SIMPLE_NAME) {
					{
					setState(730);
					simpleName();
					}
				}

				setState(733);
				match(COLON);
				setState(734);
				oclExpression(_localctx.env);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (INV - 86)) | (1L << (STATIC - 86)) | (1L << (DEF - 86)))) != 0)) {
					{
					setState(735);
					invOrDef(_localctx.env);
					}
				}

				}
				break;
			case STATIC:
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(738);
					match(STATIC);
					}
				}

				setState(741);
				match(DEF);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDERSCORE || _la==SIMPLE_NAME) {
					{
					setState(742);
					simpleName();
					}
				}

				setState(745);
				match(COLON);
				setState(746);
				defExpression(_localctx.env);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (INV - 86)) | (1L << (STATIC - 86)) | (1L << (DEF - 86)))) != 0)) {
					{
					setState(747);
					invOrDef(_localctx.env);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefExpressionContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode EQUALS() { return getToken(TOCLParser.EQUALS, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DefExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefExpressionContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_defExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterDefExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitDefExpression(this);
		}
	}

	public final DefExpressionContext defExpression(Environment env) throws RecognitionException {
		DefExpressionContext _localctx = new DefExpressionContext(_ctx, getState(), env);
		enterRule(_localctx, 118, RULE_defExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(752);
				variableDeclaration(_localctx.env);
				}
				break;
			case 2:
				{
				setState(753);
				operation(_localctx.env);
				}
				break;
			}
			setState(756);
			match(EQUALS);
			setState(757);
			oclExpression(_localctx.env);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContextDeclContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode CONTEXT() { return getToken(TOCLParser.CONTEXT, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrePostOrBodyDeclContext prePostOrBodyDecl() {
			return getRuleContext(PrePostOrBodyDeclContext.class,0);
		}
		public OperationContextDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OperationContextDeclContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_operationContextDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOperationContextDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOperationContextDecl(this);
		}
	}

	public final OperationContextDeclContext operationContextDecl(Environment env) throws RecognitionException {
		OperationContextDeclContext _localctx = new OperationContextDeclContext(_ctx, getState(), env);
		enterRule(_localctx, 120, RULE_operationContextDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(CONTEXT);
			setState(760);
			operation(_localctx.env);
			setState(761);
			prePostOrBodyDecl(_localctx.env);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrePostOrBodyDeclContext extends ParserRuleContext {
		public Environment env;
		public TerminalNode COLON() { return getToken(TOCLParser.COLON, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public TerminalNode PRE() { return getToken(TOCLParser.PRE, 0); }
		public TerminalNode POST() { return getToken(TOCLParser.POST, 0); }
		public TerminalNode BODY() { return getToken(TOCLParser.BODY, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public PrePostOrBodyDeclContext prePostOrBodyDecl() {
			return getRuleContext(PrePostOrBodyDeclContext.class,0);
		}
		public PrePostOrBodyDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrePostOrBodyDeclContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_prePostOrBodyDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPrePostOrBodyDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPrePostOrBodyDecl(this);
		}
	}

	public final PrePostOrBodyDeclContext prePostOrBodyDecl(Environment env) throws RecognitionException {
		PrePostOrBodyDeclContext _localctx = new PrePostOrBodyDeclContext(_ctx, getState(), env);
		enterRule(_localctx, 122, RULE_prePostOrBodyDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PRE - 89)) | (1L << (POST - 89)) | (1L << (BODY - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE || _la==SIMPLE_NAME) {
				{
				setState(764);
				simpleName();
				}
			}

			setState(767);
			match(COLON);
			setState(768);
			oclExpression(_localctx.env);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PRE - 89)) | (1L << (POST - 89)) | (1L << (BODY - 89)))) != 0)) {
				{
				setState(769);
				prePostOrBodyDecl(_localctx.env);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public Environment env;
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(TOCLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public TerminalNode SCOPE() { return getToken(TOCLParser.SCOPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OperationContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation(Environment env) throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState(), env);
		enterRule(_localctx, 124, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(772);
				pathName(0);
				setState(773);
				match(SCOPE);
				}
				break;
			}
			setState(777);
			simpleName();
			setState(778);
			match(LPAREN);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE || _la==SIMPLE_NAME) {
				{
				setState(779);
				parameters(_localctx.env);
				}
			}

			setState(782);
			match(RPAREN);
			setState(783);
			match(COLON);
			setState(784);
			type(_localctx.env);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Environment env;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TOCLParser.COMMA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParametersContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters(Environment env) throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState(), env);
		enterRule(_localctx, 126, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			variableDeclaration(_localctx.env);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(787);
				match(COMMA);
				setState(788);
				parameters(_localctx.env);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToclOperatorExpressionContext extends ParserRuleContext {
		public Environment env;
		public NextExpContext nextExp() {
			return getRuleContext(NextExpContext.class,0);
		}
		public AlwaysExpContext alwaysExp() {
			return getRuleContext(AlwaysExpContext.class,0);
		}
		public SometimeExpContext sometimeExp() {
			return getRuleContext(SometimeExpContext.class,0);
		}
		public PreviousExpContext previousExp() {
			return getRuleContext(PreviousExpContext.class,0);
		}
		public AlwaysPastExpContext alwaysPastExp() {
			return getRuleContext(AlwaysPastExpContext.class,0);
		}
		public SometimePastExpContext sometimePastExp() {
			return getRuleContext(SometimePastExpContext.class,0);
		}
		public ToclOperatorExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ToclOperatorExpressionContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_toclOperatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterToclOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitToclOperatorExpression(this);
		}
	}

	public final ToclOperatorExpressionContext toclOperatorExpression(Environment env) throws RecognitionException {
		ToclOperatorExpressionContext _localctx = new ToclOperatorExpressionContext(_ctx, getState(), env);
		enterRule(_localctx, 128, RULE_toclOperatorExpression);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				nextExp(_localctx.env);
				}
				break;
			case ALWAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				alwaysExp(_localctx.env);
				}
				break;
			case SOMETIME:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				sometimeExp(_localctx.env);
				}
				break;
			case PREVIOUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				previousExp(_localctx.env);
				}
				break;
			case ALWAYS_PAST:
				enterOuterAlt(_localctx, 5);
				{
				setState(795);
				alwaysPastExp(_localctx.env);
				}
				break;
			case SOMETIME_PAST:
				enterOuterAlt(_localctx, 6);
				{
				setState(796);
				sometimePastExp(_localctx.env);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextExpContext extends ParserRuleContext {
		public Environment env;
		public BinaryOperationExpContext e;
		public TerminalNode NEXT() { return getToken(TOCLParser.NEXT, 0); }
		public BinaryOperationExpContext binaryOperationExp() {
			return getRuleContext(BinaryOperationExpContext.class,0);
		}
		public NextExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NextExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_nextExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterNextExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitNextExp(this);
		}
	}

	public final NextExpContext nextExp(Environment env) throws RecognitionException {
		NextExpContext _localctx = new NextExpContext(_ctx, getState(), env);
		enterRule(_localctx, 130, RULE_nextExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(NEXT);
			setState(800);
			((NextExpContext)_localctx).e = binaryOperationExp(_localctx.env);

			                if (((NextExpContext)_localctx).e != null && ((NextExpContext)_localctx).e.ast != null && ((NextExpContext)_localctx).e.ast.getType() != null) {
			                        if (!((NextExpContext)_localctx).e.ast.getType().equals("Boolean")) {
			                                System.out.println("Warning: 'Next' operator applied to non-boolean expression");
			                        }
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlwaysExpContext extends ParserRuleContext {
		public Environment env;
		public BinaryOperationExpContext e1;
		public Token op;
		public BinaryOperationExpContext e2;
		public TerminalNode ALWAYS() { return getToken(TOCLParser.ALWAYS, 0); }
		public List<BinaryOperationExpContext> binaryOperationExp() {
			return getRuleContexts(BinaryOperationExpContext.class);
		}
		public BinaryOperationExpContext binaryOperationExp(int i) {
			return getRuleContext(BinaryOperationExpContext.class,i);
		}
		public TerminalNode SINCE() { return getToken(TOCLParser.SINCE, 0); }
		public TerminalNode UNTIL() { return getToken(TOCLParser.UNTIL, 0); }
		public AlwaysExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AlwaysExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_alwaysExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterAlwaysExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitAlwaysExp(this);
		}
	}

	public final AlwaysExpContext alwaysExp(Environment env) throws RecognitionException {
		AlwaysExpContext _localctx = new AlwaysExpContext(_ctx, getState(), env);
		enterRule(_localctx, 132, RULE_alwaysExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(ALWAYS);
			setState(804);
			((AlwaysExpContext)_localctx).e1 = binaryOperationExp(_localctx.env);
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(805);
				((AlwaysExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==SINCE) ) {
					((AlwaysExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(806);
				((AlwaysExpContext)_localctx).e2 = binaryOperationExp(_localctx.env);
				}
				break;
			}

			                if (((AlwaysExpContext)_localctx).e1 != null && ((AlwaysExpContext)_localctx).e1.ast != null && ((AlwaysExpContext)_localctx).e1.ast.getType() != null) {
			                        if (!((AlwaysExpContext)_localctx).e1.ast.getType().equals("Boolean")) {
			                                System.out.println("Warning: 'Always' operator applied to non-boolean expression");
			                        }
			                        if (((AlwaysExpContext)_localctx).e2 != null && ((AlwaysExpContext)_localctx).e2.ast != null && ((AlwaysExpContext)_localctx).e2.ast.getType() != null) {
			                                if (!((AlwaysExpContext)_localctx).e2.ast.getType().equals("Boolean")) {
			                                        System.out.println("Warning: " + (((AlwaysExpContext)_localctx).op!=null?((AlwaysExpContext)_localctx).op.getText():null) + " operator applied to non-boolean expression");
			                                }
			                        }
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SometimeExpContext extends ParserRuleContext {
		public Environment env;
		public BinaryOperationExpContext e1;
		public Token op;
		public BinaryOperationExpContext e2;
		public TerminalNode SOMETIME() { return getToken(TOCLParser.SOMETIME, 0); }
		public List<BinaryOperationExpContext> binaryOperationExp() {
			return getRuleContexts(BinaryOperationExpContext.class);
		}
		public BinaryOperationExpContext binaryOperationExp(int i) {
			return getRuleContext(BinaryOperationExpContext.class,i);
		}
		public TerminalNode SINCE() { return getToken(TOCLParser.SINCE, 0); }
		public TerminalNode BEFORE() { return getToken(TOCLParser.BEFORE, 0); }
		public SometimeExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SometimeExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_sometimeExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterSometimeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitSometimeExp(this);
		}
	}

	public final SometimeExpContext sometimeExp(Environment env) throws RecognitionException {
		SometimeExpContext _localctx = new SometimeExpContext(_ctx, getState(), env);
		enterRule(_localctx, 134, RULE_sometimeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(SOMETIME);
			setState(812);
			((SometimeExpContext)_localctx).e1 = binaryOperationExp(_localctx.env);
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(813);
				((SometimeExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BEFORE || _la==SINCE) ) {
					((SometimeExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(814);
				((SometimeExpContext)_localctx).e2 = binaryOperationExp(_localctx.env);
				}
				break;
			}

			                if (((SometimeExpContext)_localctx).e1 != null && ((SometimeExpContext)_localctx).e1.ast != null && ((SometimeExpContext)_localctx).e1.ast.getType() != null) {
			                        if (!((SometimeExpContext)_localctx).e1.ast.getType().equals("Boolean")) {
			                                System.out.println("Warning: 'Always' operator applied to non-boolean expression");
			                        }
			                        if (((SometimeExpContext)_localctx).e2 != null && ((SometimeExpContext)_localctx).e2.ast != null && ((SometimeExpContext)_localctx).e2.ast.getType() != null) {
			                                if (!((SometimeExpContext)_localctx).e2.ast.getType().equals("Boolean")) {
			                                        System.out.println("Warning: " + (((SometimeExpContext)_localctx).op!=null?((SometimeExpContext)_localctx).op.getText():null) + " operator applied to non-boolean expression");
			                                }
			                        }
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreviousExpContext extends ParserRuleContext {
		public Environment env;
		public BinaryOperationExpContext e;
		public TerminalNode PREVIOUS() { return getToken(TOCLParser.PREVIOUS, 0); }
		public BinaryOperationExpContext binaryOperationExp() {
			return getRuleContext(BinaryOperationExpContext.class,0);
		}
		public PreviousExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PreviousExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_previousExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterPreviousExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitPreviousExp(this);
		}
	}

	public final PreviousExpContext previousExp(Environment env) throws RecognitionException {
		PreviousExpContext _localctx = new PreviousExpContext(_ctx, getState(), env);
		enterRule(_localctx, 136, RULE_previousExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(PREVIOUS);
			setState(820);
			((PreviousExpContext)_localctx).e = binaryOperationExp(_localctx.env);

			                if (((PreviousExpContext)_localctx).e != null && ((PreviousExpContext)_localctx).e.ast != null && ((PreviousExpContext)_localctx).e.ast.getType() != null) {
			                        if (!((PreviousExpContext)_localctx).e.ast.getType().equals("Boolean")) {
			                                System.out.println("Warning: 'Previous' operator applied to non-boolean expression");
			                        }
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlwaysPastExpContext extends ParserRuleContext {
		public Environment env;
		public BinaryOperationExpContext e;
		public TerminalNode ALWAYS_PAST() { return getToken(TOCLParser.ALWAYS_PAST, 0); }
		public BinaryOperationExpContext binaryOperationExp() {
			return getRuleContext(BinaryOperationExpContext.class,0);
		}
		public AlwaysPastExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AlwaysPastExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_alwaysPastExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterAlwaysPastExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitAlwaysPastExp(this);
		}
	}

	public final AlwaysPastExpContext alwaysPastExp(Environment env) throws RecognitionException {
		AlwaysPastExpContext _localctx = new AlwaysPastExpContext(_ctx, getState(), env);
		enterRule(_localctx, 138, RULE_alwaysPastExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(ALWAYS_PAST);
			setState(824);
			((AlwaysPastExpContext)_localctx).e = binaryOperationExp(_localctx.env);

			                if (((AlwaysPastExpContext)_localctx).e != null && ((AlwaysPastExpContext)_localctx).e.ast != null && ((AlwaysPastExpContext)_localctx).e.ast.getType() != null) {
			                        if (!((AlwaysPastExpContext)_localctx).e.ast.getType().equals("Boolean")) {
			                                System.out.println("Warning: 'Next' operator applied to non-boolean expression");
			                        }
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SometimePastExpContext extends ParserRuleContext {
		public Environment env;
		public BinaryOperationExpContext e;
		public TerminalNode SOMETIME_PAST() { return getToken(TOCLParser.SOMETIME_PAST, 0); }
		public BinaryOperationExpContext binaryOperationExp() {
			return getRuleContext(BinaryOperationExpContext.class,0);
		}
		public SometimePastExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SometimePastExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_sometimePastExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterSometimePastExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitSometimePastExp(this);
		}
	}

	public final SometimePastExpContext sometimePastExp(Environment env) throws RecognitionException {
		SometimePastExpContext _localctx = new SometimePastExpContext(_ctx, getState(), env);
		enterRule(_localctx, 140, RULE_sometimePastExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(SOMETIME_PAST);
			setState(828);
			((SometimePastExpContext)_localctx).e = binaryOperationExp(_localctx.env);

			                if (((SometimePastExpContext)_localctx).e != null && ((SometimePastExpContext)_localctx).e.ast != null && ((SometimePastExpContext)_localctx).e.ast.getType() != null) {
			                        if (!((SometimePastExpContext)_localctx).e.ast.getType().equals("Boolean")) {
			                                System.out.println("Warning: 'Next' operator applied to non-boolean expression");
			                        }
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsMarkedNextContext extends ParserRuleContext {
		public TerminalNode AT_NEXT() { return getToken(TOCLParser.AT_NEXT, 0); }
		public IsMarkedNextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isMarkedNext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterIsMarkedNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitIsMarkedNext(this);
		}
	}

	public final IsMarkedNextContext isMarkedNext() throws RecognitionException {
		IsMarkedNextContext _localctx = new IsMarkedNextContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_isMarkedNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(AT_NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToclOpCallExpContext extends ParserRuleContext {
		public Environment env;
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TOCLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TOCLParser.RPAREN, 0); }
		public IsMarkedPreContext isMarkedPre() {
			return getRuleContext(IsMarkedPreContext.class,0);
		}
		public IsMarkedNextContext isMarkedNext() {
			return getRuleContext(IsMarkedNextContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ToclOpCallExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ToclOpCallExpContext(ParserRuleContext parent, int invokingState, Environment env) {
			super(parent, invokingState);
			this.env = env;
		}
		@Override public int getRuleIndex() { return RULE_toclOpCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).enterToclOpCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOCLParserListener ) ((TOCLParserListener)listener).exitToclOpCallExp(this);
		}
	}

	public final ToclOpCallExpContext toclOpCallExp(Environment env) throws RecognitionException {
		ToclOpCallExpContext _localctx = new ToclOpCallExpContext(_ctx, getState(), env);
		enterRule(_localctx, 144, RULE_toclOpCallExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			simpleName();
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_PRE:
				{
				setState(834);
				isMarkedPre();
				}
				break;
			case AT_NEXT:
				{
				setState(835);
				isMarkedNext();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(838);
			match(LPAREN);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_N) | (1L << INTEGER_N) | (1L << REAL_N) | (1L << MINUS) | (1L << ASTERISK) | (1L << SELF) | (1L << UNDERSCORE) | (1L << TUPLE) | (1L << HASH) | (1L << SET) | (1L << BAG) | (1L << SEQUENCE) | (1L << COLLECTION) | (1L << ORDERED_SET) | (1L << TRUE) | (1L << FALSE) | (1L << SELECT) | (1L << REJECT) | (1L << COLLECT) | (1L << EXISTS) | (1L << FOR_ALL) | (1L << IS_UNIQUE) | (1L << SORTED_BY) | (1L << INCLUDES) | (1L << EXCLUDES) | (1L << INCLUDES_ALL) | (1L << EXCLUDES_ALL) | (1L << ITERATE) | (1L << LPAREN) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OCL_AS_TYPE - 64)) | (1L << (OCL_IS_KIND_OF - 64)) | (1L << (OCL_IS_TYPE_OF - 64)) | (1L << (SELECT_BY_KIND - 64)) | (1L << (SELECT_BY_TYPE - 64)) | (1L << (ALL_INSTANCES - 64)) | (1L << (LET - 64)) | (1L << (IF - 64)) | (1L << (INVALID - 64)) | (1L << (NULL - 64)) | (1L << (NEXT - 64)) | (1L << (ALWAYS - 64)) | (1L << (SOMETIME - 64)) | (1L << (PREVIOUS - 64)) | (1L << (ALWAYS_PAST - 64)) | (1L << (SOMETIME_PAST - 64)) | (1L << (SIMPLE_NAME - 64)) | (1L << (STRING_CHARS - 64)))) != 0)) {
				{
				setState(839);
				arguments(_localctx.env);
				}
			}

			setState(842);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return pathName_sempred((PathNameContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pathName_sempred(PathNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u034f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u009b\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u00a6\n\3\3\4\3\4\3\4\3\4\5\4\u00ac\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00b3\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00c0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00d3\n\b\f\b\16\b\u00d6\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00ef\n\n\3\13\3\13\3\13\5\13\u00f4\n\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0103\n\f\3\r\3\r\3\r\5\r\u0108"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0112\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012e\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u013a\n\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0149\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0151\n\27\f\27\16\27\u0154\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u015c\n\30\f\30\16\30\u015f\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0167\n\31\f\31\16\31\u016a\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0172\n\32\f\32\16\32\u0175\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u017d\n\33\f\33\16\33\u0180\13\33"+
		"\3\34\3\34\3\34\3\34\5\34\u0186\n\34\3\34\3\34\3\34\7\34\u018b\n\34\f"+
		"\34\16\34\u018e\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0196\n\35\f"+
		"\35\16\35\u0199\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01a1\n\36\f"+
		"\36\16\36\u01a4\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01ad\n"+
		"\37\3 \3 \3 \3 \3 \3 \7 \u01b5\n \f \16 \u01b8\13 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\5!\u01c3\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ce\n\""+
		"\3#\3#\3#\3#\3#\3#\5#\u01d6\n#\3$\3$\3$\3$\3$\5$\u01dd\n$\3$\3$\5$\u01e1"+
		"\n$\3$\5$\u01e4\n$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01ff\n%\3&\3&\3&\3&\3&\5&\u0206\n&\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u0211\n\'\3\'\3\'\5\'\u0215\n\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0228\n(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u0234\n)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u023e\n*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\5-\u024f\n-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u025d\n.\3.\3.\3.\5.\u0262\n.\3.\3.\5.\u0266\n"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0272\n.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u027e\n/\3\60\3\60\3\61\3\61\3\61\5\61\u0285\n\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5"+
		"\63\u0297\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u02ab\n\67\f\67\16\67\u02ae\13"+
		"\67\3\67\3\67\3\67\6\67\u02b3\n\67\r\67\16\67\u02b4\5\67\u02b7\n\67\3"+
		"8\38\38\58\u02bc\n8\39\39\39\39\39\39\39\39\3:\3:\3:\3:\5:\u02ca\n:\3"+
		";\3;\3;\3;\7;\u02d0\n;\f;\16;\u02d3\13;\3;\3;\5;\u02d7\n;\3;\3;\3;\3<"+
		"\3<\5<\u02de\n<\3<\3<\3<\5<\u02e3\n<\3<\5<\u02e6\n<\3<\3<\5<\u02ea\n<"+
		"\3<\3<\3<\5<\u02ef\n<\5<\u02f1\n<\3=\3=\5=\u02f5\n=\3=\3=\3=\3>\3>\3>"+
		"\3>\3?\3?\5?\u0300\n?\3?\3?\3?\5?\u0305\n?\3@\3@\3@\5@\u030a\n@\3@\3@"+
		"\3@\5@\u030f\n@\3@\3@\3@\3@\3A\3A\3A\5A\u0318\nA\3B\3B\3B\3B\3B\3B\5B"+
		"\u0320\nB\3C\3C\3C\3C\3D\3D\3D\3D\5D\u032a\nD\3D\3D\3E\3E\3E\3E\5E\u0332"+
		"\nE\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3J\3J\3J\5J\u0347"+
		"\nJ\3J\3J\5J\u034b\nJ\3J\3J\3J\2\3\16K\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2\f\3\2./\3\2@"+
		"A\3\2\6\7\4\2\b\t))\4\2\7\7??\4\2\30\30\35\35\3\2VW\3\2[]\4\2aaff\4\2"+
		"bbff\2\u037a\2\u009a\3\2\2\2\4\u00a5\3\2\2\2\6\u00ab\3\2\2\2\b\u00b2\3"+
		"\2\2\2\n\u00bf\3\2\2\2\f\u00c7\3\2\2\2\16\u00c9\3\2\2\2\20\u00e3\3\2\2"+
		"\2\22\u00ee\3\2\2\2\24\u00f0\3\2\2\2\26\u0102\3\2\2\2\30\u0104\3\2\2\2"+
		"\32\u0111\3\2\2\2\34\u0113\3\2\2\2\36\u012d\3\2\2\2 \u012f\3\2\2\2\"\u0139"+
		"\3\2\2\2$\u013b\3\2\2\2&\u013e\3\2\2\2(\u0141\3\2\2\2*\u0148\3\2\2\2,"+
		"\u014a\3\2\2\2.\u0155\3\2\2\2\60\u0160\3\2\2\2\62\u016b\3\2\2\2\64\u0176"+
		"\3\2\2\2\66\u0181\3\2\2\28\u018f\3\2\2\2:\u019a\3\2\2\2<\u01ac\3\2\2\2"+
		">\u01ae\3\2\2\2@\u01c2\3\2\2\2B\u01cd\3\2\2\2D\u01d5\3\2\2\2F\u01d7\3"+
		"\2\2\2H\u01fe\3\2\2\2J\u0200\3\2\2\2L\u020d\3\2\2\2N\u0227\3\2\2\2P\u0233"+
		"\3\2\2\2R\u023d\3\2\2\2T\u023f\3\2\2\2V\u0245\3\2\2\2X\u024b\3\2\2\2Z"+
		"\u0271\3\2\2\2\\\u027d\3\2\2\2^\u027f\3\2\2\2`\u0281\3\2\2\2b\u0288\3"+
		"\2\2\2d\u0296\3\2\2\2f\u0298\3\2\2\2h\u02a1\3\2\2\2j\u02a4\3\2\2\2l\u02b6"+
		"\3\2\2\2n\u02bb\3\2\2\2p\u02bd\3\2\2\2r\u02c5\3\2\2\2t\u02cb\3\2\2\2v"+
		"\u02f0\3\2\2\2x\u02f4\3\2\2\2z\u02f9\3\2\2\2|\u02fd\3\2\2\2~\u0309\3\2"+
		"\2\2\u0080\u0314\3\2\2\2\u0082\u031f\3\2\2\2\u0084\u0321\3\2\2\2\u0086"+
		"\u0325\3\2\2\2\u0088\u032d\3\2\2\2\u008a\u0335\3\2\2\2\u008c\u0339\3\2"+
		"\2\2\u008e\u033d\3\2\2\2\u0090\u0341\3\2\2\2\u0092\u0343\3\2\2\2\u0094"+
		"\u0095\5\4\3\2\u0095\u0096\7\2\2\3\u0096\u009b\3\2\2\2\u0097\u0098\5l"+
		"\67\2\u0098\u0099\7\2\2\3\u0099\u009b\3\2\2\2\u009a\u0094\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009b\3\3\2\2\2\u009c\u009d\5\20\t\2\u009d\u009e\b\3\1"+
		"\2\u009e\u00a6\3\2\2\2\u009f\u00a0\5b\62\2\u00a0\u00a1\b\3\1\2\u00a1\u00a6"+
		"\3\2\2\2\u00a2\u00a3\5,\27\2\u00a3\u00a4\b\3\1\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u009c\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\5\3\2\2\2"+
		"\u00a7\u00a8\5\b\5\2\u00a8\u00a9\b\4\1\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac"+
		"\7\n\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\7\3\2\2\2\u00ad"+
		"\u00ae\7h\2\2\u00ae\u00b3\b\5\1\2\u00af\u00b0\7\13\2\2\u00b0\u00b1\7n"+
		"\2\2\u00b1\u00b3\b\5\1\2\u00b2\u00ad\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3"+
		"\t\3\2\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\b\6\1\2\u00b6\u00c0\3\2\2"+
		"\2\u00b7\u00b8\5P)\2\u00b8\u00b9\b\6\1\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb"+
		"\5R*\2\u00bb\u00bc\b\6\1\2\u00bc\u00c0\3\2\2\2\u00bd\u00be\7\r\2\2\u00be"+
		"\u00c0\b\6\1\2\u00bf\u00b4\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00ba\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\13\3\2\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3"+
		"\b\7\1\2\u00c3\u00c8\3\2\2\2\u00c4\u00c5\5\n\6\2\u00c5\u00c6\b\7\1\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\r\3\2\2\2"+
		"\u00c9\u00ca\b\b\1\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\b\b\1\2\u00cc\u00d4"+
		"\3\2\2\2\u00cd\u00ce\f\3\2\2\u00ce\u00cf\7\16\2\2\u00cf\u00d0\5\f\7\2"+
		"\u00d0\u00d1\b\b\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\17\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\b\t\1\2\u00d9\u00e4\3"+
		"\2\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\b\t\1\2\u00dc\u00e4\3\2\2\2\u00dd"+
		"\u00de\5 \21\2\u00de\u00df\b\t\1\2\u00df\u00e4\3\2\2\2\u00e0\u00e1\5\36"+
		"\20\2\u00e1\u00e2\b\t\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00d7\3\2\2\2\u00e3"+
		"\u00da\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\21\3\2\2"+
		"\2\u00e5\u00e6\7\17\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\b\n\1\2\u00e8"+
		"\u00ef\3\2\2\2\u00e9\u00ea\5\16\b\2\u00ea\u00eb\7\16\2\2\u00eb\u00ec\5"+
		"\b\5\2\u00ec\u00ed\b\n\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee"+
		"\u00e9\3\2\2\2\u00ef\23\3\2\2\2\u00f0\u00f1\5\26\f\2\u00f1\u00f3\7\20"+
		"\2\2\u00f2\u00f4\5\30\r\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\7\21\2\2\u00f6\u00f7\b\13\1\2\u00f7\25\3\2"+
		"\2\2\u00f8\u00f9\7\22\2\2\u00f9\u0103\b\f\1\2\u00fa\u00fb\7\23\2\2\u00fb"+
		"\u0103\b\f\1\2\u00fc\u00fd\7\24\2\2\u00fd\u0103\b\f\1\2\u00fe\u00ff\7"+
		"\25\2\2\u00ff\u0103\b\f\1\2\u0100\u0101\7\26\2\2\u0101\u0103\b\f\1\2\u0102"+
		"\u00f8\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\27\3\2\2\2\u0104\u0107\5\32\16\2\u0105"+
		"\u0106\7\27\2\2\u0106\u0108\5\30\r\2\u0107\u0105\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\r\1\2\u010a\31\3\2\2\2\u010b"+
		"\u010c\5\34\17\2\u010c\u010d\b\16\1\2\u010d\u0112\3\2\2\2\u010e\u010f"+
		"\5\4\3\2\u010f\u0110\b\16\1\2\u0110\u0112\3\2\2\2\u0111\u010b\3\2\2\2"+
		"\u0111\u010e\3\2\2\2\u0112\33\3\2\2\2\u0113\u0114\5\4\3\2\u0114\u0115"+
		"\7\31\2\2\u0115\u0116\5\4\3\2\u0116\u0117\b\17\1\2\u0117\35\3\2\2\2\u0118"+
		"\u0119\5$\23\2\u0119\u011a\b\20\1\2\u011a\u012e\3\2\2\2\u011b\u011c\5"+
		"&\24\2\u011c\u011d\b\20\1\2\u011d\u012e\3\2\2\2\u011e\u011f\5(\25\2\u011f"+
		"\u0120\b\20\1\2\u0120\u012e\3\2\2\2\u0121\u0122\5*\26\2\u0122\u0123\b"+
		"\20\1\2\u0123\u012e\3\2\2\2\u0124\u0125\5\"\22\2\u0125\u0126\b\20\1\2"+
		"\u0126\u012e\3\2\2\2\u0127\u0128\5h\65\2\u0128\u0129\b\20\1\2\u0129\u012e"+
		"\3\2\2\2\u012a\u012b\5j\66\2\u012b\u012c\b\20\1\2\u012c\u012e\3\2\2\2"+
		"\u012d\u0118\3\2\2\2\u012d\u011b\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0121"+
		"\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e"+
		"\37\3\2\2\2\u012f\u0130\7\r\2\2\u0130\u0131\7\20\2\2\u0131\u0132\5X-\2"+
		"\u0132\u0133\7\21\2\2\u0133\u0134\b\21\1\2\u0134!\3\2\2\2\u0135\u0136"+
		"\7\3\2\2\u0136\u013a\b\22\1\2\u0137\u0138\7\b\2\2\u0138\u013a\b\22\1\2"+
		"\u0139\u0135\3\2\2\2\u0139\u0137\3\2\2\2\u013a#\3\2\2\2\u013b\u013c\7"+
		"\4\2\2\u013c\u013d\b\23\1\2\u013d%\3\2\2\2\u013e\u013f\7\5\2\2\u013f\u0140"+
		"\b\24\1\2\u0140\'\3\2\2\2\u0141\u0142\7n\2\2\u0142\u0143\b\25\1\2\u0143"+
		")\3\2\2\2\u0144\u0145\7\32\2\2\u0145\u0149\b\26\1\2\u0146\u0147\7\33\2"+
		"\2\u0147\u0149\b\26\1\2\u0148\u0144\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"+\3\2\2\2\u014a\u014b\5.\30\2\u014b\u0152\b\27\1\2\u014c\u014d\7;\2\2"+
		"\u014d\u014e\5.\30\2\u014e\u014f\b\27\1\2\u014f\u0151\3\2\2\2\u0150\u014c"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"-\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5\60\31\2\u0156\u015d\b\30\1"+
		"\2\u0157\u0158\7<\2\2\u0158\u0159\5\60\31\2\u0159\u015a\b\30\1\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0157\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e/\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161"+
		"\5\62\32\2\u0161\u0168\b\31\1\2\u0162\u0163\7=\2\2\u0163\u0164\5\62\32"+
		"\2\u0164\u0165\b\31\1\2\u0165\u0167\3\2\2\2\u0166\u0162\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\61\3\2\2"+
		"\2\u016a\u0168\3\2\2\2\u016b\u016c\5\64\33\2\u016c\u0173\b\32\1\2\u016d"+
		"\u016e\7>\2\2\u016e\u016f\5\64\33\2\u016f\u0170\b\32\1\2\u0170\u0172\3"+
		"\2\2\2\u0171\u016d\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\63\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\5\66\34"+
		"\2\u0177\u017e\b\33\1\2\u0178\u0179\t\2\2\2\u0179\u017a\5\66\34\2\u017a"+
		"\u017b\b\33\1\2\u017b\u017d\3\2\2\2\u017c\u0178\3\2\2\2\u017d\u0180\3"+
		"\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\65\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0182\58\35\2\u0182\u018c\b\34\1\2\u0183\u0185\t"+
		"\3\2\2\u0184\u0186\7.\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\58\35\2\u0188\u0189\b\34\1\2\u0189\u018b\3"+
		"\2\2\2\u018a\u0183\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\67\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\5:\36"+
		"\2\u0190\u0197\b\35\1\2\u0191\u0192\t\4\2\2\u0192\u0193\5:\36\2\u0193"+
		"\u0194\b\35\1\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2\u0196\u0199\3"+
		"\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u01989\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019b\5<\37\2\u019b\u01a2\b\36\1\2\u019c\u019d\t\5\2\2"+
		"\u019d\u019e\5<\37\2\u019e\u019f\b\36\1\2\u019f\u01a1\3\2\2\2\u01a0\u019c"+
		"\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		";\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\t\6\2\2\u01a6\u01a7\5<\37\2"+
		"\u01a7\u01a8\b\37\1\2\u01a8\u01ad\3\2\2\2\u01a9\u01aa\5> \2\u01aa\u01ab"+
		"\b\37\1\2\u01ab\u01ad\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a9\3\2\2\2"+
		"\u01ad=\3\2\2\2\u01ae\u01af\5@!\2\u01af\u01b6\b \1\2\u01b0\u01b1\t\7\2"+
		"\2\u01b1\u01b2\5B\"\2\u01b2\u01b3\b \1\2\u01b3\u01b5\3\2\2\2\u01b4\u01b0"+
		"\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"?\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01c3\5\20\t\2\u01ba\u01c3\5\6\4\2"+
		"\u01bb\u01c3\5B\"\2\u01bc\u01c3\5f\64\2\u01bd\u01c3\5\u0082B\2\u01be\u01bf"+
		"\79\2\2\u01bf\u01c0\5\4\3\2\u01c0\u01c1\7:\2\2\u01c1\u01c3\3\2\2\2\u01c2"+
		"\u01b9\3\2\2\2\u01c2\u01ba\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c2\u01bc\3\2"+
		"\2\2\u01c2\u01bd\3\2\2\2\u01c2\u01be\3\2\2\2\u01c3A\3\2\2\2\u01c4\u01c5"+
		"\5Z.\2\u01c5\u01c6\b\"\1\2\u01c6\u01ce\3\2\2\2\u01c7\u01c8\5D#\2\u01c8"+
		"\u01c9\b\"\1\2\u01c9\u01ce\3\2\2\2\u01ca\u01cb\5\u0092J\2\u01cb\u01cc"+
		"\b\"\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd"+
		"\u01ca\3\2\2\2\u01ceC\3\2\2\2\u01cf\u01d0\5F$\2\u01d0\u01d1\b#\1\2\u01d1"+
		"\u01d6\3\2\2\2\u01d2\u01d3\5J&\2\u01d3\u01d4\b#\1\2\u01d4\u01d6\3\2\2"+
		"\2\u01d5\u01cf\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6E\3\2\2\2\u01d7\u01d8"+
		"\5H%\2\u01d8\u01e3\79\2\2\u01d9\u01dc\5L\'\2\u01da\u01db\7\27\2\2\u01db"+
		"\u01dd\5L\'\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01df\7\34\2\2\u01df\u01e1\5\4\3\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e4\5\4\3\2\u01e3\u01d9\3\2"+
		"\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7:\2\2\u01e6"+
		"\u01e7\b$\1\2\u01e7G\3\2\2\2\u01e8\u01e9\7\36\2\2\u01e9\u01ff\b%\1\2\u01ea"+
		"\u01eb\7\37\2\2\u01eb\u01ff\b%\1\2\u01ec\u01ed\7 \2\2\u01ed\u01ff\b%\1"+
		"\2\u01ee\u01ef\7!\2\2\u01ef\u01ff\b%\1\2\u01f0\u01f1\7\"\2\2\u01f1\u01ff"+
		"\b%\1\2\u01f2\u01f3\7#\2\2\u01f3\u01ff\b%\1\2\u01f4\u01f5\7$\2\2\u01f5"+
		"\u01ff\b%\1\2\u01f6\u01f7\7%\2\2\u01f7\u01ff\b%\1\2\u01f8\u01f9\7&\2\2"+
		"\u01f9\u01ff\b%\1\2\u01fa\u01fb\7\'\2\2\u01fb\u01ff\b%\1\2\u01fc\u01fd"+
		"\7(\2\2\u01fd\u01ff\b%\1\2\u01fe\u01e8\3\2\2\2\u01fe\u01ea\3\2\2\2\u01fe"+
		"\u01ec\3\2\2\2\u01fe\u01ee\3\2\2\2\u01fe\u01f0\3\2\2\2\u01fe\u01f2\3\2"+
		"\2\2\u01fe\u01f4\3\2\2\2\u01fe\u01f6\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe"+
		"\u01fa\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ffI\3\2\2\2\u0200\u0201\7,\2\2\u0201"+
		"\u0205\79\2\2\u0202\u0203\5L\'\2\u0203\u0204\7K\2\2\u0204\u0206\3\2\2"+
		"\2\u0205\u0202\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208"+
		"\5L\'\2\u0208\u0209\7\34\2\2\u0209\u020a\5\4\3\2\u020a\u020b\7:\2\2\u020b"+
		"\u020c\b&\1\2\u020cK\3\2\2\2\u020d\u0210\5\b\5\2\u020e\u020f\7-\2\2\u020f"+
		"\u0211\5N(\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0214\3\2\2"+
		"\2\u0212\u0213\7.\2\2\u0213\u0215\5\4\3\2\u0214\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\b\'\1\2\u0217M\3\2\2\2\u0218"+
		"\u0219\5\16\b\2\u0219\u021a\b(\1\2\u021a\u0228\3\2\2\2\u021b\u021c\5T"+
		"+\2\u021c\u021d\b(\1\2\u021d\u0228\3\2\2\2\u021e\u021f\5V,\2\u021f\u0220"+
		"\b(\1\2\u0220\u0228\3\2\2\2\u0221\u0222\5P)\2\u0222\u0223\b(\1\2\u0223"+
		"\u0228\3\2\2\2\u0224\u0225\5R*\2\u0225\u0226\b(\1\2\u0226\u0228\3\2\2"+
		"\2\u0227\u0218\3\2\2\2\u0227\u021b\3\2\2\2\u0227\u021e\3\2\2\2\u0227\u0221"+
		"\3\2\2\2\u0227\u0224\3\2\2\2\u0228O\3\2\2\2\u0229\u022a\7\60\2\2\u022a"+
		"\u0234\b)\1\2\u022b\u022c\7\61\2\2\u022c\u0234\b)\1\2\u022d\u022e\7\62"+
		"\2\2\u022e\u0234\b)\1\2\u022f\u0230\7\63\2\2\u0230\u0234\b)\1\2\u0231"+
		"\u0232\7\64\2\2\u0232\u0234\b)\1\2\u0233\u0229\3\2\2\2\u0233\u022b\3\2"+
		"\2\2\u0233\u022d\3\2\2\2\u0233\u022f\3\2\2\2\u0233\u0231\3\2\2\2\u0234"+
		"Q\3\2\2\2\u0235\u0236\7\65\2\2\u0236\u023e\b*\1\2\u0237\u0238\7\66\2\2"+
		"\u0238\u023e\b*\1\2\u0239\u023a\7\67\2\2\u023a\u023e\b*\1\2\u023b\u023c"+
		"\78\2\2\u023c\u023e\b*\1\2\u023d\u0235\3\2\2\2\u023d\u0237\3\2\2\2\u023d"+
		"\u0239\3\2\2\2\u023d\u023b\3\2\2\2\u023eS\3\2\2\2\u023f\u0240\5\26\f\2"+
		"\u0240\u0241\79\2\2\u0241\u0242\5N(\2\u0242\u0243\7:\2\2\u0243\u0244\b"+
		"+\1\2\u0244U\3\2\2\2\u0245\u0246\7\r\2\2\u0246\u0247\79\2\2\u0247\u0248"+
		"\5X-\2\u0248\u0249\7:\2\2\u0249\u024a\b,\1\2\u024aW\3\2\2\2\u024b\u024e"+
		"\5L\'\2\u024c\u024d\7\27\2\2\u024d\u024f\5X-\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\b-\1\2\u0251Y\3\2\2\2\u0252"+
		"\u0265\5\b\5\2\u0253\u0254\7*\2\2\u0254\u0255\5\b\5\2\u0255\u0256\7+\2"+
		"\2\u0256\u0257\3\2\2\2\u0257\u0258\b.\1\2\u0258\u0266\3\2\2\2\u0259\u025a"+
		"\5^\60\2\u025a\u025b\b.\1\2\u025b\u025d\3\2\2\2\u025c\u0259\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0266\b.\1\2\u025f\u0261\79\2"+
		"\2\u0260\u0262\5`\61\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0264\7:\2\2\u0264\u0266\b.\1\2\u0265\u0253\3\2\2\2\u0265"+
		"\u025c\3\2\2\2\u0265\u025f\3\2\2\2\u0266\u0272\3\2\2\2\u0267\u0268\5\\"+
		"/\2\u0268\u0269\79\2\2\u0269\u026a\5N(\2\u026a\u026b\7:\2\2\u026b\u026c"+
		"\b.\1\2\u026c\u0272\3\2\2\2\u026d\u026e\7G\2\2\u026e\u026f\79\2\2\u026f"+
		"\u0270\7:\2\2\u0270\u0272\b.\1\2\u0271\u0252\3\2\2\2\u0271\u0267\3\2\2"+
		"\2\u0271\u026d\3\2\2\2\u0272[\3\2\2\2\u0273\u0274\7B\2\2\u0274\u027e\b"+
		"/\1\2\u0275\u0276\7C\2\2\u0276\u027e\b/\1\2\u0277\u0278\7D\2\2\u0278\u027e"+
		"\b/\1\2\u0279\u027a\7E\2\2\u027a\u027e\b/\1\2\u027b\u027c\7F\2\2\u027c"+
		"\u027e\b/\1\2\u027d\u0273\3\2\2\2\u027d\u0275\3\2\2\2\u027d\u0277\3\2"+
		"\2\2\u027d\u0279\3\2\2\2\u027d\u027b\3\2\2\2\u027e]\3\2\2\2\u027f\u0280"+
		"\7H\2\2\u0280_\3\2\2\2\u0281\u0284\5\4\3\2\u0282\u0283\7\27\2\2\u0283"+
		"\u0285\5`\61\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0287\b\61\1\2\u0287a\3\2\2\2\u0288\u0289\7I\2\2\u0289\u028a"+
		"\5L\'\2\u028a\u028b\5d\63\2\u028b\u028c\b\62\1\2\u028cc\3\2\2\2\u028d"+
		"\u028e\7\27\2\2\u028e\u028f\5L\'\2\u028f\u0290\5d\63\2\u0290\u0291\b\63"+
		"\1\2\u0291\u0297\3\2\2\2\u0292\u0293\7J\2\2\u0293\u0294\5\4\3\2\u0294"+
		"\u0295\b\63\1\2\u0295\u0297\3\2\2\2\u0296\u028d\3\2\2\2\u0296\u0292\3"+
		"\2\2\2\u0297e\3\2\2\2\u0298\u0299\7M\2\2\u0299\u029a\5\4\3\2\u029a\u029b"+
		"\7N\2\2\u029b\u029c\5\4\3\2\u029c\u029d\7O\2\2\u029d\u029e\5\4\3\2\u029e"+
		"\u029f\7P\2\2\u029f\u02a0\b\64\1\2\u02a0g\3\2\2\2\u02a1\u02a2\7R\2\2\u02a2"+
		"\u02a3\b\65\1\2\u02a3i\3\2\2\2\u02a4\u02a5\7Q\2\2\u02a5\u02a6\b\66\1\2"+
		"\u02a6k\3\2\2\2\u02a7\u02a8\7S\2\2\u02a8\u02ac\5\16\b\2\u02a9\u02ab\5"+
		"n8\2\u02aa\u02a9\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b0\7T"+
		"\2\2\u02b0\u02b7\3\2\2\2\u02b1\u02b3\5n8\2\u02b2\u02b1\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6"+
		"\u02a7\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b7m\3\2\2\2\u02b8\u02bc\5p9\2\u02b9"+
		"\u02bc\5t;\2\u02ba\u02bc\5z>\2\u02bb\u02b8\3\2\2\2\u02bb\u02b9\3\2\2\2"+
		"\u02bb\u02ba\3\2\2\2\u02bco\3\2\2\2\u02bd\u02be\7U\2\2\u02be\u02bf\5\16"+
		"\b\2\u02bf\u02c0\7\16\2\2\u02c0\u02c1\5\b\5\2\u02c1\u02c2\7-\2\2\u02c2"+
		"\u02c3\5N(\2\u02c3\u02c4\5r:\2\u02c4q\3\2\2\2\u02c5\u02c6\t\b\2\2\u02c6"+
		"\u02c7\7-\2\2\u02c7\u02c9\5\4\3\2\u02c8\u02ca\5r:\2\u02c9\u02c8\3\2\2"+
		"\2\u02c9\u02ca\3\2\2\2\u02cas\3\2\2\2\u02cb\u02d6\7U\2\2\u02cc\u02d1\5"+
		"\b\5\2\u02cd\u02ce\7\27\2\2\u02ce\u02d0\5\b\5\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2"+
		"\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d5\7-\2\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02cc\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\5\16"+
		"\b\2\u02d9\u02da\5v<\2\u02dau\3\2\2\2\u02db\u02dd\7X\2\2\u02dc\u02de\5"+
		"\b\5\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\7-\2\2\u02e0\u02e2\5\4\3\2\u02e1\u02e3\5v<\2\u02e2\u02e1\3\2\2"+
		"\2\u02e2\u02e3\3\2\2\2\u02e3\u02f1\3\2\2\2\u02e4\u02e6\7Y\2\2\u02e5\u02e4"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\7Z\2\2\u02e8"+
		"\u02ea\5\b\5\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ec\7-\2\2\u02ec\u02ee\5x=\2\u02ed\u02ef\5v<\2\u02ee\u02ed"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02db\3\2\2\2\u02f0"+
		"\u02e5\3\2\2\2\u02f1w\3\2\2\2\u02f2\u02f5\5L\'\2\u02f3\u02f5\5~@\2\u02f4"+
		"\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\7."+
		"\2\2\u02f7\u02f8\5\4\3\2\u02f8y\3\2\2\2\u02f9\u02fa\7U\2\2\u02fa\u02fb"+
		"\5~@\2\u02fb\u02fc\5|?\2\u02fc{\3\2\2\2\u02fd\u02ff\t\t\2\2\u02fe\u0300"+
		"\5\b\5\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0302\7-\2\2\u0302\u0304\5\4\3\2\u0303\u0305\5|?\2\u0304\u0303\3\2\2"+
		"\2\u0304\u0305\3\2\2\2\u0305}\3\2\2\2\u0306\u0307\5\16\b\2\u0307\u0308"+
		"\7\16\2\2\u0308\u030a\3\2\2\2\u0309\u0306\3\2\2\2\u0309\u030a\3\2\2\2"+
		"\u030a\u030b\3\2\2\2\u030b\u030c\5\b\5\2\u030c\u030e\79\2\2\u030d\u030f"+
		"\5\u0080A\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2"+
		"\2\u0310\u0311\7:\2\2\u0311\u0312\7-\2\2\u0312\u0313\5N(\2\u0313\177\3"+
		"\2\2\2\u0314\u0317\5L\'\2\u0315\u0316\7\27\2\2\u0316\u0318\5\u0080A\2"+
		"\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0081\3\2\2\2\u0319\u0320"+
		"\5\u0084C\2\u031a\u0320\5\u0086D\2\u031b\u0320\5\u0088E\2\u031c\u0320"+
		"\5\u008aF\2\u031d\u0320\5\u008cG\2\u031e\u0320\5\u008eH\2\u031f\u0319"+
		"\3\2\2\2\u031f\u031a\3\2\2\2\u031f\u031b\3\2\2\2\u031f\u031c\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320\u0083\3\2\2\2\u0321\u0322\7^"+
		"\2\2\u0322\u0323\5,\27\2\u0323\u0324\bC\1\2\u0324\u0085\3\2\2\2\u0325"+
		"\u0326\7_\2\2\u0326\u0329\5,\27\2\u0327\u0328\t\n\2\2\u0328\u032a\5,\27"+
		"\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c"+
		"\bD\1\2\u032c\u0087\3\2\2\2\u032d\u032e\7`\2\2\u032e\u0331\5,\27\2\u032f"+
		"\u0330\t\13\2\2\u0330\u0332\5,\27\2\u0331\u032f\3\2\2\2\u0331\u0332\3"+
		"\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\bE\1\2\u0334\u0089\3\2\2\2\u0335"+
		"\u0336\7c\2\2\u0336\u0337\5,\27\2\u0337\u0338\bF\1\2\u0338\u008b\3\2\2"+
		"\2\u0339\u033a\7d\2\2\u033a\u033b\5,\27\2\u033b\u033c\bG\1\2\u033c\u008d"+
		"\3\2\2\2\u033d\u033e\7e\2\2\u033e\u033f\5,\27\2\u033f\u0340\bH\1\2\u0340"+
		"\u008f\3\2\2\2\u0341\u0342\7g\2\2\u0342\u0091\3\2\2\2\u0343\u0346\5\b"+
		"\5\2\u0344\u0347\5^\60\2\u0345\u0347\5\u0090I\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a\79\2\2\u0349\u034b\5`\61"+
		"\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d"+
		"\7:\2\2\u034d\u0093\3\2\2\2J\u009a\u00a5\u00ab\u00b2\u00bf\u00c7\u00d4"+
		"\u00e3\u00ee\u00f3\u0102\u0107\u0111\u012d\u0139\u0148\u0152\u015d\u0168"+
		"\u0173\u017e\u0185\u018c\u0197\u01a2\u01ac\u01b6\u01c2\u01cd\u01d5\u01dc"+
		"\u01e0\u01e3\u01fe\u0205\u0210\u0214\u0227\u0233\u023d\u024e\u025c\u0261"+
		"\u0265\u0271\u027d\u0284\u0296\u02ac\u02b4\u02b6\u02bb\u02c9\u02d1\u02d6"+
		"\u02dd\u02e2\u02e5\u02e9\u02ee\u02f0\u02f4\u02ff\u0304\u0309\u030e\u0317"+
		"\u031f\u0329\u0331\u0346\u034a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
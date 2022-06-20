// Generated from STMParser.g4 by ANTLR 4.9.3
package org.tzi.use.STMPlugin.logic.uml2stm.stm2use;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, CLOSE=10, SPECIAL_CLOSE=11, SLASH_CLOSE=12, SLASH=13, EQUALS=14, 
		STRING=15, Model=16, OwnedElems=17, SnapObjs=18, Attributes=19, QOps=20, 
		Params=21, Conditions=22, Constraints=23, Spec=24, Lang=25, Body=26, OwnedEnd=27, 
		OwnedLiteral=28, Gization=29, Context=30, Name=31, S=32, PI=33;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, 
		RULE_modelElem = 4, RULE_modelOwnedElem = 5, RULE_compClassElem = 6, RULE_attributeElem = 7, 
		RULE_queryOpElem = 8, RULE_paramsElem = 9, RULE_condElem = 10, RULE_constrElem = 11, 
		RULE_specElem = 12, RULE_bodyElem = 13, RULE_langElem = 14, RULE_ownedEndElem = 15, 
		RULE_literalElem = 16, RULE_genElem = 17, RULE_ctxElem = 18, RULE_miscElem = 19, 
		RULE_reference = 20, RULE_attribute = 21, RULE_chardata = 22, RULE_misc = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "prolog", "content", "element", "modelElem", "modelOwnedElem", 
			"compClassElem", "attributeElem", "queryOpElem", "paramsElem", "condElem", 
			"constrElem", "specElem", "bodyElem", "langElem", "ownedEndElem", "literalElem", 
			"genElem", "ctxElem", "miscElem", "reference", "attribute", "chardata", 
			"misc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, null, "'>'", null, 
			"'/>'", "'/'", "'='", null, "'sTM:Model'", "'ownedElements'", "'snapshotObjects'", 
			"'attributes'", "'queryOperations'", "'parameters'", null, "'constraints'", 
			"'specification'", "'language'", "'body'", "'ownedEnd'", "'ownedLiteral'", 
			"'generalization'", "'context'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", 
			"EQUALS", "STRING", "Model", "OwnedElems", "SnapObjs", "Attributes", 
			"QOps", "Params", "Conditions", "Constraints", "Spec", "Lang", "Body", 
			"OwnedEnd", "OwnedLiteral", "Gization", "Context", "Name", "S", "PI"
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
	public String getGrammarFileName() { return "STMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public STMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(48);
				prolog();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(51);
				misc();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			element();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(58);
				misc();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(STMParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(STMParser.SPECIAL_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitProlog(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(XMLDeclOpen);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(65);
				attribute();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(SPECIAL_CLOSE);
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

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(STMParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(STMParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(STMParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(STMParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(STMParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(STMParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(73);
				chardata();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(76);
						element();
						}
						break;
					case EntityRef:
					case CharRef:
						{
						setState(77);
						reference();
						}
						break;
					case CDATA:
						{
						setState(78);
						match(CDATA);
						}
						break;
					case PI:
						{
						setState(79);
						match(PI);
						}
						break;
					case COMMENT:
						{
						setState(80);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(83);
						chardata();
						}
					}

					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public ModelElemContext modelElem() {
			return getRuleContext(ModelElemContext.class,0);
		}
		public ModelOwnedElemContext modelOwnedElem() {
			return getRuleContext(ModelOwnedElemContext.class,0);
		}
		public CompClassElemContext compClassElem() {
			return getRuleContext(CompClassElemContext.class,0);
		}
		public AttributeElemContext attributeElem() {
			return getRuleContext(AttributeElemContext.class,0);
		}
		public QueryOpElemContext queryOpElem() {
			return getRuleContext(QueryOpElemContext.class,0);
		}
		public ParamsElemContext paramsElem() {
			return getRuleContext(ParamsElemContext.class,0);
		}
		public CondElemContext condElem() {
			return getRuleContext(CondElemContext.class,0);
		}
		public ConstrElemContext constrElem() {
			return getRuleContext(ConstrElemContext.class,0);
		}
		public SpecElemContext specElem() {
			return getRuleContext(SpecElemContext.class,0);
		}
		public BodyElemContext bodyElem() {
			return getRuleContext(BodyElemContext.class,0);
		}
		public LangElemContext langElem() {
			return getRuleContext(LangElemContext.class,0);
		}
		public OwnedEndElemContext ownedEndElem() {
			return getRuleContext(OwnedEndElemContext.class,0);
		}
		public LiteralElemContext literalElem() {
			return getRuleContext(LiteralElemContext.class,0);
		}
		public GenElemContext genElem() {
			return getRuleContext(GenElemContext.class,0);
		}
		public CtxElemContext ctxElem() {
			return getRuleContext(CtxElemContext.class,0);
		}
		public MiscElemContext miscElem() {
			return getRuleContext(MiscElemContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				modelElem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				modelOwnedElem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				compClassElem();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				attributeElem();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				queryOpElem();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				paramsElem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				condElem();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				constrElem();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				specElem();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				bodyElem();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(101);
				langElem();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(102);
				ownedEndElem();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(103);
				literalElem();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(104);
				genElem();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(105);
				ctxElem();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(106);
				miscElem();
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

	public static class ModelElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Model() { return getTokens(STMParser.Model); }
		public TerminalNode Model(int i) {
			return getToken(STMParser.Model, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public ModelElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterModelElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitModelElem(this);
		}
	}

	public final ModelElemContext modelElem() throws RecognitionException {
		ModelElemContext _localctx = new ModelElemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modelElem);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(OPEN);
				setState(110);
				match(Model);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(111);
					attribute();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(CLOSE);
				setState(118);
				content();
				setState(119);
				match(OPEN);
				setState(120);
				match(SLASH);
				setState(121);
				match(Model);
				setState(122);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(OPEN);
				setState(125);
				match(Model);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(126);
					attribute();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(SLASH_CLOSE);
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

	public static class ModelOwnedElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> OwnedElems() { return getTokens(STMParser.OwnedElems); }
		public TerminalNode OwnedElems(int i) {
			return getToken(STMParser.OwnedElems, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public ModelOwnedElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelOwnedElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterModelOwnedElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitModelOwnedElem(this);
		}
	}

	public final ModelOwnedElemContext modelOwnedElem() throws RecognitionException {
		ModelOwnedElemContext _localctx = new ModelOwnedElemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modelOwnedElem);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(OPEN);
				setState(136);
				match(OwnedElems);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(137);
					attribute();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(CLOSE);
				setState(144);
				content();
				setState(145);
				match(OPEN);
				setState(146);
				match(SLASH);
				setState(147);
				match(OwnedElems);
				setState(148);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(OPEN);
				setState(151);
				match(OwnedElems);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(152);
					attribute();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(SLASH_CLOSE);
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

	public static class CompClassElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> SnapObjs() { return getTokens(STMParser.SnapObjs); }
		public TerminalNode SnapObjs(int i) {
			return getToken(STMParser.SnapObjs, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public CompClassElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compClassElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterCompClassElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitCompClassElem(this);
		}
	}

	public final CompClassElemContext compClassElem() throws RecognitionException {
		CompClassElemContext _localctx = new CompClassElemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compClassElem);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(OPEN);
				setState(162);
				match(SnapObjs);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(163);
					attribute();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(CLOSE);
				setState(170);
				content();
				setState(171);
				match(OPEN);
				setState(172);
				match(SLASH);
				setState(173);
				match(SnapObjs);
				setState(174);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(OPEN);
				setState(177);
				match(SnapObjs);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(178);
					attribute();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(SLASH_CLOSE);
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

	public static class AttributeElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Attributes() { return getTokens(STMParser.Attributes); }
		public TerminalNode Attributes(int i) {
			return getToken(STMParser.Attributes, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public AttributeElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterAttributeElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitAttributeElem(this);
		}
	}

	public final AttributeElemContext attributeElem() throws RecognitionException {
		AttributeElemContext _localctx = new AttributeElemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeElem);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(OPEN);
				setState(188);
				match(Attributes);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(189);
					attribute();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(CLOSE);
				setState(196);
				content();
				setState(197);
				match(OPEN);
				setState(198);
				match(SLASH);
				setState(199);
				match(Attributes);
				setState(200);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(OPEN);
				setState(203);
				match(Attributes);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(204);
					attribute();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(SLASH_CLOSE);
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

	public static class QueryOpElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> QOps() { return getTokens(STMParser.QOps); }
		public TerminalNode QOps(int i) {
			return getToken(STMParser.QOps, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public QueryOpElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOpElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterQueryOpElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitQueryOpElem(this);
		}
	}

	public final QueryOpElemContext queryOpElem() throws RecognitionException {
		QueryOpElemContext _localctx = new QueryOpElemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_queryOpElem);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(OPEN);
				setState(214);
				match(QOps);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(215);
					attribute();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(CLOSE);
				setState(222);
				content();
				setState(223);
				match(OPEN);
				setState(224);
				match(SLASH);
				setState(225);
				match(QOps);
				setState(226);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(OPEN);
				setState(229);
				match(QOps);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(230);
					attribute();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(SLASH_CLOSE);
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

	public static class ParamsElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Params() { return getTokens(STMParser.Params); }
		public TerminalNode Params(int i) {
			return getToken(STMParser.Params, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public ParamsElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterParamsElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitParamsElem(this);
		}
	}

	public final ParamsElemContext paramsElem() throws RecognitionException {
		ParamsElemContext _localctx = new ParamsElemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramsElem);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(OPEN);
				setState(240);
				match(Params);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(241);
					attribute();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(CLOSE);
				setState(248);
				content();
				setState(249);
				match(OPEN);
				setState(250);
				match(SLASH);
				setState(251);
				match(Params);
				setState(252);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(OPEN);
				setState(255);
				match(Params);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(256);
					attribute();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(SLASH_CLOSE);
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

	public static class CondElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Conditions() { return getTokens(STMParser.Conditions); }
		public TerminalNode Conditions(int i) {
			return getToken(STMParser.Conditions, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public CondElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterCondElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitCondElem(this);
		}
	}

	public final CondElemContext condElem() throws RecognitionException {
		CondElemContext _localctx = new CondElemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condElem);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(OPEN);
				setState(266);
				match(Conditions);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(267);
					attribute();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(CLOSE);
				setState(274);
				content();
				setState(275);
				match(OPEN);
				setState(276);
				match(SLASH);
				setState(277);
				match(Conditions);
				setState(278);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(OPEN);
				setState(281);
				match(Conditions);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(282);
					attribute();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(SLASH_CLOSE);
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

	public static class ConstrElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Constraints() { return getTokens(STMParser.Constraints); }
		public TerminalNode Constraints(int i) {
			return getToken(STMParser.Constraints, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public ConstrElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterConstrElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitConstrElem(this);
		}
	}

	public final ConstrElemContext constrElem() throws RecognitionException {
		ConstrElemContext _localctx = new ConstrElemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constrElem);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(OPEN);
				setState(292);
				match(Constraints);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(293);
					attribute();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(CLOSE);
				setState(300);
				content();
				setState(301);
				match(OPEN);
				setState(302);
				match(SLASH);
				setState(303);
				match(Constraints);
				setState(304);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(OPEN);
				setState(307);
				match(Constraints);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(308);
					attribute();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(SLASH_CLOSE);
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

	public static class SpecElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Spec() { return getTokens(STMParser.Spec); }
		public TerminalNode Spec(int i) {
			return getToken(STMParser.Spec, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public SpecElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterSpecElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitSpecElem(this);
		}
	}

	public final SpecElemContext specElem() throws RecognitionException {
		SpecElemContext _localctx = new SpecElemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_specElem);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(OPEN);
				setState(318);
				match(Spec);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(319);
					attribute();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(CLOSE);
				setState(326);
				content();
				setState(327);
				match(OPEN);
				setState(328);
				match(SLASH);
				setState(329);
				match(Spec);
				setState(330);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(OPEN);
				setState(333);
				match(Spec);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(334);
					attribute();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(SLASH_CLOSE);
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

	public static class BodyElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Body() { return getTokens(STMParser.Body); }
		public TerminalNode Body(int i) {
			return getToken(STMParser.Body, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public BodyElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterBodyElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitBodyElem(this);
		}
	}

	public final BodyElemContext bodyElem() throws RecognitionException {
		BodyElemContext _localctx = new BodyElemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bodyElem);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(OPEN);
				setState(344);
				match(Body);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(345);
					attribute();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(CLOSE);
				setState(352);
				content();
				setState(353);
				match(OPEN);
				setState(354);
				match(SLASH);
				setState(355);
				match(Body);
				setState(356);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(OPEN);
				setState(359);
				match(Body);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(360);
					attribute();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(SLASH_CLOSE);
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

	public static class LangElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Lang() { return getTokens(STMParser.Lang); }
		public TerminalNode Lang(int i) {
			return getToken(STMParser.Lang, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public LangElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterLangElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitLangElem(this);
		}
	}

	public final LangElemContext langElem() throws RecognitionException {
		LangElemContext _localctx = new LangElemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_langElem);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(OPEN);
				setState(370);
				match(Lang);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(371);
					attribute();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
				match(CLOSE);
				setState(378);
				content();
				setState(379);
				match(OPEN);
				setState(380);
				match(SLASH);
				setState(381);
				match(Lang);
				setState(382);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(OPEN);
				setState(385);
				match(Lang);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(386);
					attribute();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(SLASH_CLOSE);
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

	public static class OwnedEndElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> OwnedEnd() { return getTokens(STMParser.OwnedEnd); }
		public TerminalNode OwnedEnd(int i) {
			return getToken(STMParser.OwnedEnd, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public OwnedEndElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownedEndElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterOwnedEndElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitOwnedEndElem(this);
		}
	}

	public final OwnedEndElemContext ownedEndElem() throws RecognitionException {
		OwnedEndElemContext _localctx = new OwnedEndElemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ownedEndElem);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(OPEN);
				setState(396);
				match(OwnedEnd);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(397);
					attribute();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(CLOSE);
				setState(404);
				content();
				setState(405);
				match(OPEN);
				setState(406);
				match(SLASH);
				setState(407);
				match(OwnedEnd);
				setState(408);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(OPEN);
				setState(411);
				match(OwnedEnd);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(412);
					attribute();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				match(SLASH_CLOSE);
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

	public static class LiteralElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> OwnedLiteral() { return getTokens(STMParser.OwnedLiteral); }
		public TerminalNode OwnedLiteral(int i) {
			return getToken(STMParser.OwnedLiteral, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public LiteralElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterLiteralElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitLiteralElem(this);
		}
	}

	public final LiteralElemContext literalElem() throws RecognitionException {
		LiteralElemContext _localctx = new LiteralElemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literalElem);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(OPEN);
				setState(422);
				match(OwnedLiteral);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(423);
					attribute();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				match(CLOSE);
				setState(430);
				content();
				setState(431);
				match(OPEN);
				setState(432);
				match(SLASH);
				setState(433);
				match(OwnedLiteral);
				setState(434);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(OPEN);
				setState(437);
				match(OwnedLiteral);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(438);
					attribute();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				match(SLASH_CLOSE);
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

	public static class GenElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Gization() { return getTokens(STMParser.Gization); }
		public TerminalNode Gization(int i) {
			return getToken(STMParser.Gization, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public GenElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterGenElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitGenElem(this);
		}
	}

	public final GenElemContext genElem() throws RecognitionException {
		GenElemContext _localctx = new GenElemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_genElem);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(OPEN);
				setState(448);
				match(Gization);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(449);
					attribute();
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(455);
				match(CLOSE);
				setState(456);
				content();
				setState(457);
				match(OPEN);
				setState(458);
				match(SLASH);
				setState(459);
				match(Gization);
				setState(460);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(OPEN);
				setState(463);
				match(Gization);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(464);
					attribute();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				match(SLASH_CLOSE);
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

	public static class CtxElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Context() { return getTokens(STMParser.Context); }
		public TerminalNode Context(int i) {
			return getToken(STMParser.Context, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public CtxElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctxElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterCtxElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitCtxElem(this);
		}
	}

	public final CtxElemContext ctxElem() throws RecognitionException {
		CtxElemContext _localctx = new CtxElemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ctxElem);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(OPEN);
				setState(474);
				match(Context);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(475);
					attribute();
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				match(CLOSE);
				setState(482);
				content();
				setState(483);
				match(OPEN);
				setState(484);
				match(SLASH);
				setState(485);
				match(Context);
				setState(486);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(OPEN);
				setState(489);
				match(Context);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(490);
					attribute();
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				match(SLASH_CLOSE);
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

	public static class MiscElemContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(STMParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(STMParser.OPEN, i);
		}
		public List<TerminalNode> Name() { return getTokens(STMParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(STMParser.Name, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(STMParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(STMParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(STMParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(STMParser.SLASH_CLOSE, 0); }
		public MiscElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miscElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterMiscElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitMiscElem(this);
		}
	}

	public final MiscElemContext miscElem() throws RecognitionException {
		MiscElemContext _localctx = new MiscElemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_miscElem);
		int _la;
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(OPEN);
				setState(500);
				match(Name);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(501);
					attribute();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(507);
				match(CLOSE);
				setState(508);
				content();
				setState(509);
				match(OPEN);
				setState(510);
				match(SLASH);
				setState(511);
				match(Name);
				setState(512);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(OPEN);
				setState(515);
				match(Name);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(516);
					attribute();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				match(SLASH_CLOSE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(STMParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(STMParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(STMParser.Name, 0); }
		public TerminalNode EQUALS() { return getToken(STMParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(STMParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(Name);
			setState(528);
			match(EQUALS);
			setState(529);
			match(STRING);
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(STMParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(STMParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitChardata(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(STMParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(STMParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(STMParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STMParserListener ) ((STMParserListener)listener).exitMisc(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u021a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\5\4M\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4T\n\4\3\4\5\4W\n\4\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3"+
		"\6\3\6\7\6s\n\6\f\6\16\6v\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0082\n\6\f\6\16\6\u0085\13\6\3\6\5\6\u0088\n\6\3\7\3\7\3\7\7\7\u008d"+
		"\n\7\f\7\16\7\u0090\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009c"+
		"\n\7\f\7\16\7\u009f\13\7\3\7\5\7\u00a2\n\7\3\b\3\b\3\b\7\b\u00a7\n\b\f"+
		"\b\16\b\u00aa\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b6\n"+
		"\b\f\b\16\b\u00b9\13\b\3\b\5\b\u00bc\n\b\3\t\3\t\3\t\7\t\u00c1\n\t\f\t"+
		"\16\t\u00c4\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d0\n\t"+
		"\f\t\16\t\u00d3\13\t\3\t\5\t\u00d6\n\t\3\n\3\n\3\n\7\n\u00db\n\n\f\n\16"+
		"\n\u00de\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ea\n\n\f"+
		"\n\16\n\u00ed\13\n\3\n\5\n\u00f0\n\n\3\13\3\13\3\13\7\13\u00f5\n\13\f"+
		"\13\16\13\u00f8\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0104\n\13\f\13\16\13\u0107\13\13\3\13\5\13\u010a\n\13\3\f\3\f\3"+
		"\f\7\f\u010f\n\f\f\f\16\f\u0112\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u011e\n\f\f\f\16\f\u0121\13\f\3\f\5\f\u0124\n\f\3\r\3\r\3\r"+
		"\7\r\u0129\n\r\f\r\16\r\u012c\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0138\n\r\f\r\16\r\u013b\13\r\3\r\5\r\u013e\n\r\3\16\3\16\3\16"+
		"\7\16\u0143\n\16\f\16\16\16\u0146\13\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0152\n\16\f\16\16\16\u0155\13\16\3\16\5\16"+
		"\u0158\n\16\3\17\3\17\3\17\7\17\u015d\n\17\f\17\16\17\u0160\13\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u016c\n\17\f\17\16"+
		"\17\u016f\13\17\3\17\5\17\u0172\n\17\3\20\3\20\3\20\7\20\u0177\n\20\f"+
		"\20\16\20\u017a\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0186\n\20\f\20\16\20\u0189\13\20\3\20\5\20\u018c\n\20\3\21\3\21"+
		"\3\21\7\21\u0191\n\21\f\21\16\21\u0194\13\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u01a0\n\21\f\21\16\21\u01a3\13\21\3\21"+
		"\5\21\u01a6\n\21\3\22\3\22\3\22\7\22\u01ab\n\22\f\22\16\22\u01ae\13\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01ba\n\22\f\22"+
		"\16\22\u01bd\13\22\3\22\5\22\u01c0\n\22\3\23\3\23\3\23\7\23\u01c5\n\23"+
		"\f\23\16\23\u01c8\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u01d4\n\23\f\23\16\23\u01d7\13\23\3\23\5\23\u01da\n\23\3\24\3"+
		"\24\3\24\7\24\u01df\n\24\f\24\16\24\u01e2\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u01ee\n\24\f\24\16\24\u01f1\13\24\3"+
		"\24\5\24\u01f4\n\24\3\25\3\25\3\25\7\25\u01f9\n\25\f\25\16\25\u01fc\13"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0208\n\25"+
		"\f\25\16\25\u020b\13\25\3\25\5\25\u020e\n\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\2\5\3\2\6\7\4\2\b\b\13\13\5\2\3\3\b\b##\2\u024b\2\63"+
		"\3\2\2\2\4B\3\2\2\2\6L\3\2\2\2\bm\3\2\2\2\n\u0087\3\2\2\2\f\u00a1\3\2"+
		"\2\2\16\u00bb\3\2\2\2\20\u00d5\3\2\2\2\22\u00ef\3\2\2\2\24\u0109\3\2\2"+
		"\2\26\u0123\3\2\2\2\30\u013d\3\2\2\2\32\u0157\3\2\2\2\34\u0171\3\2\2\2"+
		"\36\u018b\3\2\2\2 \u01a5\3\2\2\2\"\u01bf\3\2\2\2$\u01d9\3\2\2\2&\u01f3"+
		"\3\2\2\2(\u020d\3\2\2\2*\u020f\3\2\2\2,\u0211\3\2\2\2.\u0215\3\2\2\2\60"+
		"\u0217\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\63\64\3\2\2\2\648\3\2\2\2\65"+
		"\67\5\60\31\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2"+
		"\2:8\3\2\2\2;?\5\b\5\2<>\5\60\31\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@\3\3\2\2\2A?\3\2\2\2BF\7\n\2\2CE\5,\27\2DC\3\2\2\2EH\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\r\2\2J\5\3\2\2\2KM\5.\30\2LK"+
		"\3\2\2\2LM\3\2\2\2MZ\3\2\2\2NT\5\b\5\2OT\5*\26\2PT\7\4\2\2QT\7#\2\2RT"+
		"\7\3\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TV\3\2\2\2U"+
		"W\5.\30\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XS\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[\7\3\2\2\2\\Z\3\2\2\2]n\5\n\6\2^n\5\f\7\2_n\5\16\b\2`n\5\20"+
		"\t\2an\5\22\n\2bn\5\24\13\2cn\5\26\f\2dn\5\30\r\2en\5\32\16\2fn\5\34\17"+
		"\2gn\5\36\20\2hn\5 \21\2in\5\"\22\2jn\5$\23\2kn\5&\24\2ln\5(\25\2m]\3"+
		"\2\2\2m^\3\2\2\2m_\3\2\2\2m`\3\2\2\2ma\3\2\2\2mb\3\2\2\2mc\3\2\2\2md\3"+
		"\2\2\2me\3\2\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3"+
		"\2\2\2ml\3\2\2\2n\t\3\2\2\2op\7\t\2\2pt\7\22\2\2qs\5,\27\2rq\3\2\2\2s"+
		"v\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\f\2\2xy\5\6\4\2"+
		"yz\7\t\2\2z{\7\17\2\2{|\7\22\2\2|}\7\f\2\2}\u0088\3\2\2\2~\177\7\t\2\2"+
		"\177\u0083\7\22\2\2\u0080\u0082\5,\27\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0088\7\16\2\2\u0087o\3\2\2\2\u0087~\3\2\2\2\u0088"+
		"\13\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008e\7\23\2\2\u008b\u008d\5,\27"+
		"\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\f\2\2\u0092"+
		"\u0093\5\6\4\2\u0093\u0094\7\t\2\2\u0094\u0095\7\17\2\2\u0095\u0096\7"+
		"\23\2\2\u0096\u0097\7\f\2\2\u0097\u00a2\3\2\2\2\u0098\u0099\7\t\2\2\u0099"+
		"\u009d\7\23\2\2\u009a\u009c\5,\27\2\u009b\u009a\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\7\16\2\2\u00a1\u0089\3\2\2\2\u00a1\u0098\3"+
		"\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a8\7\24\2\2\u00a5"+
		"\u00a7\5,\27\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\f\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\7\17"+
		"\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00bc\3\2\2\2\u00b2"+
		"\u00b3\7\t\2\2\u00b3\u00b7\7\24\2\2\u00b4\u00b6\5,\27\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7\16\2\2\u00bb\u00a3\3"+
		"\2\2\2\u00bb\u00b2\3\2\2\2\u00bc\17\3\2\2\2\u00bd\u00be\7\t\2\2\u00be"+
		"\u00c2\7\25\2\2\u00bf\u00c1\5,\27\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5\6\4\2\u00c7\u00c8\7\t"+
		"\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\7\25\2\2\u00ca\u00cb\7\f\2\2\u00cb"+
		"\u00d6\3\2\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00d1\7\25\2\2\u00ce\u00d0\5"+
		",\27\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7\16"+
		"\2\2\u00d5\u00bd\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00d8"+
		"\7\t\2\2\u00d8\u00dc\7\26\2\2\u00d9\u00db\5,\27\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\5\6\4\2\u00e1"+
		"\u00e2\7\t\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e4\7\26\2\2\u00e4\u00e5\7"+
		"\f\2\2\u00e5\u00f0\3\2\2\2\u00e6\u00e7\7\t\2\2\u00e7\u00eb\7\26\2\2\u00e8"+
		"\u00ea\5,\27\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\7\16\2\2\u00ef\u00d7\3\2\2\2\u00ef\u00e6\3\2\2\2\u00f0\23\3\2\2"+
		"\2\u00f1\u00f2\7\t\2\2\u00f2\u00f6\7\27\2\2\u00f3\u00f5\5,\27\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\f\2\2\u00fa"+
		"\u00fb\5\6\4\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\7"+
		"\27\2\2\u00fe\u00ff\7\f\2\2\u00ff\u010a\3\2\2\2\u0100\u0101\7\t\2\2\u0101"+
		"\u0105\7\27\2\2\u0102\u0104\5,\27\2\u0103\u0102\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\7\16\2\2\u0109\u00f1\3\2\2\2\u0109\u0100\3"+
		"\2\2\2\u010a\25\3\2\2\2\u010b\u010c\7\t\2\2\u010c\u0110\7\30\2\2\u010d"+
		"\u010f\5,\27\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\7\f\2\2\u0114\u0115\5\6\4\2\u0115\u0116\7\t\2\2\u0116\u0117\7\17"+
		"\2\2\u0117\u0118\7\30\2\2\u0118\u0119\7\f\2\2\u0119\u0124\3\2\2\2\u011a"+
		"\u011b\7\t\2\2\u011b\u011f\7\30\2\2\u011c\u011e\5,\27\2\u011d\u011c\3"+
		"\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7\16\2\2\u0123\u010b\3"+
		"\2\2\2\u0123\u011a\3\2\2\2\u0124\27\3\2\2\2\u0125\u0126\7\t\2\2\u0126"+
		"\u012a\7\31\2\2\u0127\u0129\5,\27\2\u0128\u0127\3\2\2\2\u0129\u012c\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012e\7\f\2\2\u012e\u012f\5\6\4\2\u012f\u0130\7\t"+
		"\2\2\u0130\u0131\7\17\2\2\u0131\u0132\7\31\2\2\u0132\u0133\7\f\2\2\u0133"+
		"\u013e\3\2\2\2\u0134\u0135\7\t\2\2\u0135\u0139\7\31\2\2\u0136\u0138\5"+
		",\27\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\7\16"+
		"\2\2\u013d\u0125\3\2\2\2\u013d\u0134\3\2\2\2\u013e\31\3\2\2\2\u013f\u0140"+
		"\7\t\2\2\u0140\u0144\7\32\2\2\u0141\u0143\5,\27\2\u0142\u0141\3\2\2\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\f\2\2\u0148\u0149\5\6\4\2\u0149"+
		"\u014a\7\t\2\2\u014a\u014b\7\17\2\2\u014b\u014c\7\32\2\2\u014c\u014d\7"+
		"\f\2\2\u014d\u0158\3\2\2\2\u014e\u014f\7\t\2\2\u014f\u0153\7\32\2\2\u0150"+
		"\u0152\5,\27\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0158\7\16\2\2\u0157\u013f\3\2\2\2\u0157\u014e\3\2\2\2\u0158\33\3\2\2"+
		"\2\u0159\u015a\7\t\2\2\u015a\u015e\7\34\2\2\u015b\u015d\5,\27\2\u015c"+
		"\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\f\2\2\u0162"+
		"\u0163\5\6\4\2\u0163\u0164\7\t\2\2\u0164\u0165\7\17\2\2\u0165\u0166\7"+
		"\34\2\2\u0166\u0167\7\f\2\2\u0167\u0172\3\2\2\2\u0168\u0169\7\t\2\2\u0169"+
		"\u016d\7\34\2\2\u016a\u016c\5,\27\2\u016b\u016a\3\2\2\2\u016c\u016f\3"+
		"\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0172\7\16\2\2\u0171\u0159\3\2\2\2\u0171\u0168\3"+
		"\2\2\2\u0172\35\3\2\2\2\u0173\u0174\7\t\2\2\u0174\u0178\7\33\2\2\u0175"+
		"\u0177\5,\27\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\7\f\2\2\u017c\u017d\5\6\4\2\u017d\u017e\7\t\2\2\u017e\u017f\7\17"+
		"\2\2\u017f\u0180\7\33\2\2\u0180\u0181\7\f\2\2\u0181\u018c\3\2\2\2\u0182"+
		"\u0183\7\t\2\2\u0183\u0187\7\33\2\2\u0184\u0186\5,\27\2\u0185\u0184\3"+
		"\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\7\16\2\2\u018b\u0173\3"+
		"\2\2\2\u018b\u0182\3\2\2\2\u018c\37\3\2\2\2\u018d\u018e\7\t\2\2\u018e"+
		"\u0192\7\35\2\2\u018f\u0191\5,\27\2\u0190\u018f\3\2\2\2\u0191\u0194\3"+
		"\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\7\f\2\2\u0196\u0197\5\6\4\2\u0197\u0198\7\t"+
		"\2\2\u0198\u0199\7\17\2\2\u0199\u019a\7\35\2\2\u019a\u019b\7\f\2\2\u019b"+
		"\u01a6\3\2\2\2\u019c\u019d\7\t\2\2\u019d\u01a1\7\35\2\2\u019e\u01a0\5"+
		",\27\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\7\16"+
		"\2\2\u01a5\u018d\3\2\2\2\u01a5\u019c\3\2\2\2\u01a6!\3\2\2\2\u01a7\u01a8"+
		"\7\t\2\2\u01a8\u01ac\7\36\2\2\u01a9\u01ab\5,\27\2\u01aa\u01a9\3\2\2\2"+
		"\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7\f\2\2\u01b0\u01b1\5\6\4\2\u01b1"+
		"\u01b2\7\t\2\2\u01b2\u01b3\7\17\2\2\u01b3\u01b4\7\36\2\2\u01b4\u01b5\7"+
		"\f\2\2\u01b5\u01c0\3\2\2\2\u01b6\u01b7\7\t\2\2\u01b7\u01bb\7\36\2\2\u01b8"+
		"\u01ba\5,\27\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01c0\7\16\2\2\u01bf\u01a7\3\2\2\2\u01bf\u01b6\3\2\2\2\u01c0#\3\2\2\2"+
		"\u01c1\u01c2\7\t\2\2\u01c2\u01c6\7\37\2\2\u01c3\u01c5\5,\27\2\u01c4\u01c3"+
		"\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7\f\2\2\u01ca\u01cb\5\6"+
		"\4\2\u01cb\u01cc\7\t\2\2\u01cc\u01cd\7\17\2\2\u01cd\u01ce\7\37\2\2\u01ce"+
		"\u01cf\7\f\2\2\u01cf\u01da\3\2\2\2\u01d0\u01d1\7\t\2\2\u01d1\u01d5\7\37"+
		"\2\2\u01d2\u01d4\5,\27\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01da\7\16\2\2\u01d9\u01c1\3\2\2\2\u01d9\u01d0\3\2\2\2\u01da"+
		"%\3\2\2\2\u01db\u01dc\7\t\2\2\u01dc\u01e0\7 \2\2\u01dd\u01df\5,\27\2\u01de"+
		"\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7\f\2\2\u01e4"+
		"\u01e5\5\6\4\2\u01e5\u01e6\7\t\2\2\u01e6\u01e7\7\17\2\2\u01e7\u01e8\7"+
		" \2\2\u01e8\u01e9\7\f\2\2\u01e9\u01f4\3\2\2\2\u01ea\u01eb\7\t\2\2\u01eb"+
		"\u01ef\7 \2\2\u01ec\u01ee\5,\27\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f4\7\16\2\2\u01f3\u01db\3\2\2\2\u01f3\u01ea\3"+
		"\2\2\2\u01f4\'\3\2\2\2\u01f5\u01f6\7\t\2\2\u01f6\u01fa\7!\2\2\u01f7\u01f9"+
		"\5,\27\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7\f"+
		"\2\2\u01fe\u01ff\5\6\4\2\u01ff\u0200\7\t\2\2\u0200\u0201\7\17\2\2\u0201"+
		"\u0202\7!\2\2\u0202\u0203\7\f\2\2\u0203\u020e\3\2\2\2\u0204\u0205\7\t"+
		"\2\2\u0205\u0209\7!\2\2\u0206\u0208\5,\27\2\u0207\u0206\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020c\u020e\7\16\2\2\u020d\u01f5\3\2\2\2\u020d"+
		"\u0204\3\2\2\2\u020e)\3\2\2\2\u020f\u0210\t\2\2\2\u0210+\3\2\2\2\u0211"+
		"\u0212\7!\2\2\u0212\u0213\7\20\2\2\u0213\u0214\7\21\2\2\u0214-\3\2\2\2"+
		"\u0215\u0216\t\3\2\2\u0216/\3\2\2\2\u0217\u0218\t\4\2\2\u0218\61\3\2\2"+
		"\2;\638?FLSVZmt\u0083\u0087\u008e\u009d\u00a1\u00a8\u00b7\u00bb\u00c2"+
		"\u00d1\u00d5\u00dc\u00eb\u00ef\u00f6\u0105\u0109\u0110\u011f\u0123\u012a"+
		"\u0139\u013d\u0144\u0153\u0157\u015e\u016d\u0171\u0178\u0187\u018b\u0192"+
		"\u01a1\u01a5\u01ac\u01bb\u01bf\u01c6\u01d5\u01d9\u01e0\u01ef\u01f3\u01fa"+
		"\u0209\u020d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
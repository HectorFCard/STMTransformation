// Generated from STMLexer.g4 by ANTLR 4.9.3
package org.tzi.use.STMPlugin.logic.uml2stm.stm2use;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STMLexer extends Lexer {
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
		INSIDE=1, PROC_INSTR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PROC_INSTR"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "SPECIAL_OPEN", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", 
			"SLASH", "EQUALS", "STRING", "Model", "OwnedElems", "SnapObjs", "Attributes", 
			"QOps", "Params", "Conditions", "Constraints", "Spec", "Lang", "Body", 
			"OwnedEnd", "OwnedLiteral", "Gization", "Context", "Name", "S", "HEXDIGIT", 
			"DIGIT", "NameChar", "NameStartChar", "PI", "IGNORE"
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


	public STMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "STMLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u01d2\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\7\4{\n\4\f\4\16\4~\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\6\6\u008c\n\6\r\6\16\6\u008d\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6\u0097\n\6\r\6\16\6\u0098\3\6\3\6\5\6\u009d\n\6\3\7\3\7\5\7\u00a1"+
		"\n\7\3\7\6\7\u00a4\n\7\r\7\16\7\u00a5\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00bf"+
		"\n\13\r\13\16\13\u00c0\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21\u00d7\n\21\f\21\16\21"+
		"\u00da\13\21\3\21\3\21\3\21\7\21\u00df\n\21\f\21\16\21\u00e2\13\21\3\21"+
		"\5\21\u00e5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u015b\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\7!\u01b4\n!\f!\16!\u01b7"+
		"\13!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\5%\u01c5\n%\3&\5&\u01c8\n"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\5[o|\2)\5\3\7\4\t\5\13\6\r\7\17\b\21"+
		"\t\23\n\25\2\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26"+
		"/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G\2I\2K\2M\2O#Q\2\5"+
		"\2\3\4\f\4\2\13\13\"\"\4\2((>>\4\2$$>>\4\2))>>\5\2\13\f\17\17\"\"\5\2"+
		"\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2"+
		"<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\2"+
		"\u01de\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3"+
		"\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3"+
		"%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61"+
		"\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2"+
		"\3=\3\2\2\2\3?\3\2\2\2\3A\3\2\2\2\3C\3\2\2\2\3E\3\2\2\2\4O\3\2\2\2\4Q"+
		"\3\2\2\2\5S\3\2\2\2\7b\3\2\2\2\tv\3\2\2\2\13\u0083\3\2\2\2\r\u009c\3\2"+
		"\2\2\17\u00a3\3\2\2\2\21\u00a7\3\2\2\2\23\u00ab\3\2\2\2\25\u00b5\3\2\2"+
		"\2\27\u00be\3\2\2\2\31\u00c2\3\2\2\2\33\u00c6\3\2\2\2\35\u00cb\3\2\2\2"+
		"\37\u00d0\3\2\2\2!\u00d2\3\2\2\2#\u00e4\3\2\2\2%\u00e6\3\2\2\2\'\u00f0"+
		"\3\2\2\2)\u00fe\3\2\2\2+\u010e\3\2\2\2-\u0119\3\2\2\2/\u0129\3\2\2\2\61"+
		"\u015a\3\2\2\2\63\u015c\3\2\2\2\65\u0168\3\2\2\2\67\u0176\3\2\2\29\u017f"+
		"\3\2\2\2;\u0184\3\2\2\2=\u018d\3\2\2\2?\u019a\3\2\2\2A\u01a9\3\2\2\2C"+
		"\u01b1\3\2\2\2E\u01b8\3\2\2\2G\u01bc\3\2\2\2I\u01be\3\2\2\2K\u01c4\3\2"+
		"\2\2M\u01c7\3\2\2\2O\u01c9\3\2\2\2Q\u01ce\3\2\2\2ST\7>\2\2TU\7#\2\2UV"+
		"\7/\2\2VW\7/\2\2W[\3\2\2\2XZ\13\2\2\2YX\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2["+
		"Y\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7/\2\2_`\7/\2\2`a\7@\2\2a\6\3\2\2\2b"+
		"c\7>\2\2cd\7#\2\2de\7]\2\2ef\7E\2\2fg\7F\2\2gh\7C\2\2hi\7V\2\2ij\7C\2"+
		"\2jk\7]\2\2ko\3\2\2\2ln\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2"+
		"\2pr\3\2\2\2qo\3\2\2\2rs\7_\2\2st\7_\2\2tu\7@\2\2u\b\3\2\2\2vw\7>\2\2"+
		"wx\7#\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2"+
		"}\177\3\2\2\2~|\3\2\2\2\177\u0080\7@\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\b\4\2\2\u0082\n\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085\5C!\2\u0085\u0086"+
		"\7=\2\2\u0086\f\3\2\2\2\u0087\u0088\7(\2\2\u0088\u0089\7%\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u008c\5I$\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7="+
		"\2\2\u0090\u009d\3\2\2\2\u0091\u0092\7(\2\2\u0092\u0093\7%\2\2\u0093\u0094"+
		"\7z\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5G#\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\7=\2\2\u009b\u009d\3\2\2\2\u009c\u0087\3\2\2\2\u009c"+
		"\u0091\3\2\2\2\u009d\16\3\2\2\2\u009e\u00a4\t\2\2\2\u009f\u00a1\7\17\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4"+
		"\7\f\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7>\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\b\3\2\u00aa\22\3\2\2\2\u00ab\u00ac"+
		"\7>\2\2\u00ac\u00ad\7A\2\2\u00ad\u00ae\7z\2\2\u00ae\u00af\7o\2\2\u00af"+
		"\u00b0\7n\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5E\"\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00b4\b\t\3\2\u00b4\24\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7"+
		"\7A\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\5C!\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\b\n\4\2\u00bb\u00bc\b\n\5\2\u00bc\26\3\2\2\2\u00bd\u00bf\n\3\2"+
		"\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\b\f\6\2\u00c5\32\3\2\2\2\u00c6\u00c7\7A\2\2\u00c7\u00c8\7@\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\r\6\2\u00ca\34\3\2\2\2\u00cb\u00cc"+
		"\7\61\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\16\6\2"+
		"\u00cf\36\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7?\2"+
		"\2\u00d3\"\3\2\2\2\u00d4\u00d8\7$\2\2\u00d5\u00d7\n\4\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e5\7$\2\2\u00dc\u00e0\7)\2"+
		"\2\u00dd\u00df\n\5\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e5\7)\2\2\u00e4\u00d4\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e5$\3\2\2\2\u00e6"+
		"\u00e7\7u\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9\7O\2\2\u00e9\u00ea\7<\2\2"+
		"\u00ea\u00eb\7O\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00ef\7n\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2"+
		"\7y\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7f\2\2\u00f5"+
		"\u00f6\7G\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7o\2\2"+
		"\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd"+
		"\7u\2\2\u00fd(\3\2\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7p\2\2\u0100\u0101"+
		"\7c\2\2\u0101\u0102\7r\2\2\u0102\u0103\7u\2\2\u0103\u0104\7j\2\2\u0104"+
		"\u0105\7q\2\2\u0105\u0106\7v\2\2\u0106\u0107\7Q\2\2\u0107\u0108\7d\2\2"+
		"\u0108\u0109\7l\2\2\u0109\u010a\7g\2\2\u010a\u010b\7e\2\2\u010b\u010c"+
		"\7v\2\2\u010c\u010d\7u\2\2\u010d*\3\2\2\2\u010e\u010f\7c\2\2\u010f\u0110"+
		"\7v\2\2\u0110\u0111\7v\2\2\u0111\u0112\7t\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7d\2\2\u0114\u0115\7w\2\2\u0115\u0116\7v\2\2\u0116\u0117\7g\2\2"+
		"\u0117\u0118\7u\2\2\u0118,\3\2\2\2\u0119\u011a\7s\2\2\u011a\u011b\7w\2"+
		"\2\u011b\u011c\7g\2\2\u011c\u011d\7t\2\2\u011d\u011e\7{\2\2\u011e\u011f"+
		"\7Q\2\2\u011f\u0120\7r\2\2\u0120\u0121\7g\2\2\u0121\u0122\7t\2\2\u0122"+
		"\u0123\7c\2\2\u0123\u0124\7v\2\2\u0124\u0125\7k\2\2\u0125\u0126\7q\2\2"+
		"\u0126\u0127\7p\2\2\u0127\u0128\7u\2\2\u0128.\3\2\2\2\u0129\u012a\7r\2"+
		"\2\u012a\u012b\7c\2\2\u012b\u012c\7t\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7o\2\2\u012e\u012f\7g\2\2\u012f\u0130\7v\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7t\2\2\u0132\u0133\7u\2\2\u0133\60\3\2\2\2\u0134\u0135\7r\2\2\u0135"+
		"\u0136\7q\2\2\u0136\u0137\7u\2\2\u0137\u0138\7v\2\2\u0138\u0139\7e\2\2"+
		"\u0139\u013a\7q\2\2\u013a\u013b\7p\2\2\u013b\u013c\7f\2\2\u013c\u013d"+
		"\7k\2\2\u013d\u013e\7v\2\2\u013e\u013f\7k\2\2\u013f\u0140\7q\2\2\u0140"+
		"\u015b\7p\2\2\u0141\u0142\7r\2\2\u0142\u0143\7t\2\2\u0143\u0144\7g\2\2"+
		"\u0144\u0145\7e\2\2\u0145\u0146\7q\2\2\u0146\u0147\7p\2\2\u0147\u0148"+
		"\7f\2\2\u0148\u0149\7k\2\2\u0149\u014a\7v\2\2\u014a\u014b\7k\2\2\u014b"+
		"\u014c\7q\2\2\u014c\u015b\7p\2\2\u014d\u014e\7d\2\2\u014e\u014f\7q\2\2"+
		"\u014f\u0150\7f\2\2\u0150\u0151\7{\2\2\u0151\u0152\7E\2\2\u0152\u0153"+
		"\7q\2\2\u0153\u0154\7p\2\2\u0154\u0155\7f\2\2\u0155\u0156\7k\2\2\u0156"+
		"\u0157\7v\2\2\u0157\u0158\7k\2\2\u0158\u0159\7q\2\2\u0159\u015b\7p\2\2"+
		"\u015a\u0134\3\2\2\2\u015a\u0141\3\2\2\2\u015a\u014d\3\2\2\2\u015b\62"+
		"\3\2\2\2\u015c\u015d\7e\2\2\u015d\u015e\7q\2\2\u015e\u015f\7p\2\2\u015f"+
		"\u0160\7u\2\2\u0160\u0161\7v\2\2\u0161\u0162\7t\2\2\u0162\u0163\7c\2\2"+
		"\u0163\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165\u0166\7v\2\2\u0166\u0167"+
		"\7u\2\2\u0167\64\3\2\2\2\u0168\u0169\7u\2\2\u0169\u016a\7r\2\2\u016a\u016b"+
		"\7g\2\2\u016b\u016c\7e\2\2\u016c\u016d\7k\2\2\u016d\u016e\7h\2\2\u016e"+
		"\u016f\7k\2\2\u016f\u0170\7e\2\2\u0170\u0171\7c\2\2\u0171\u0172\7v\2\2"+
		"\u0172\u0173\7k\2\2\u0173\u0174\7q\2\2\u0174\u0175\7p\2\2\u0175\66\3\2"+
		"\2\2\u0176\u0177\7n\2\2\u0177\u0178\7c\2\2\u0178\u0179\7p\2\2\u0179\u017a"+
		"\7i\2\2\u017a\u017b\7w\2\2\u017b\u017c\7c\2\2\u017c\u017d\7i\2\2\u017d"+
		"\u017e\7g\2\2\u017e8\3\2\2\2\u017f\u0180\7d\2\2\u0180\u0181\7q\2\2\u0181"+
		"\u0182\7f\2\2\u0182\u0183\7{\2\2\u0183:\3\2\2\2\u0184\u0185\7q\2\2\u0185"+
		"\u0186\7y\2\2\u0186\u0187\7p\2\2\u0187\u0188\7g\2\2\u0188\u0189\7f\2\2"+
		"\u0189\u018a\7G\2\2\u018a\u018b\7p\2\2\u018b\u018c\7f\2\2\u018c<\3\2\2"+
		"\2\u018d\u018e\7q\2\2\u018e\u018f\7y\2\2\u018f\u0190\7p\2\2\u0190\u0191"+
		"\7g\2\2\u0191\u0192\7f\2\2\u0192\u0193\7N\2\2\u0193\u0194\7k\2\2\u0194"+
		"\u0195\7v\2\2\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2\u0197\u0198\7c\2\2"+
		"\u0198\u0199\7n\2\2\u0199>\3\2\2\2\u019a\u019b\7i\2\2\u019b\u019c\7g\2"+
		"\2\u019c\u019d\7p\2\2\u019d\u019e\7g\2\2\u019e\u019f\7t\2\2\u019f\u01a0"+
		"\7c\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7|\2\2\u01a3"+
		"\u01a4\7c\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7q\2\2"+
		"\u01a7\u01a8\7p\2\2\u01a8@\3\2\2\2\u01a9\u01aa\7e\2\2\u01aa\u01ab\7q\2"+
		"\2\u01ab\u01ac\7p\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af"+
		"\7z\2\2\u01af\u01b0\7v\2\2\u01b0B\3\2\2\2\u01b1\u01b5\5M&\2\u01b2\u01b4"+
		"\5K%\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6D\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\t\6\2\2"+
		"\u01b9\u01ba\3\2\2\2\u01ba\u01bb\b\"\2\2\u01bbF\3\2\2\2\u01bc\u01bd\t"+
		"\7\2\2\u01bdH\3\2\2\2\u01be\u01bf\t\b\2\2\u01bfJ\3\2\2\2\u01c0\u01c5\5"+
		"M&\2\u01c1\u01c5\t\t\2\2\u01c2\u01c5\5I$\2\u01c3\u01c5\t\n\2\2\u01c4\u01c0"+
		"\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"L\3\2\2\2\u01c6\u01c8\t\13\2\2\u01c7\u01c6\3\2\2\2\u01c8N\3\2\2\2\u01c9"+
		"\u01ca\7A\2\2\u01ca\u01cb\7@\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\b\'\6"+
		"\2\u01cdP\3\2\2\2\u01ce\u01cf\13\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1"+
		"\b(\4\2\u01d1R\3\2\2\2\26\2\3\4[o|\u008d\u0098\u009c\u00a0\u00a3\u00a5"+
		"\u00c0\u00d8\u00e0\u00e4\u015a\u01b5\u01c4\u01c7\7\b\2\2\7\3\2\5\2\2\7"+
		"\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
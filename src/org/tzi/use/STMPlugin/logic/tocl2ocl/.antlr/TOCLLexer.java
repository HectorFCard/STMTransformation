// Generated from /Users/hectorsresearch/Documents/ToolGitHub/STMTransformation/src/org/tzi/use/STMPlugin/logic/tocl2ocl/TOCLLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TOCLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NATURAL_N", "INTEGER_N", "REAL_N", "PLUS", "MINUS", "ASTERISK", "DIVIDED_BY", 
			"SELF", "UNDERSCORE", "SINGLE_QUOTE", "TUPLE", "SCOPE", "HASH", "LBRACK", 
			"RBRACK", "SET", "BAG", "SEQUENCE", "COLLECTION", "ORDERED_SET", "COMMA", 
			"DOT", "DOUBLE_DOT", "TRUE", "FALSE", "BAR", "ARROW", "SELECT", "REJECT", 
			"COLLECT", "EXISTS", "FOR_ALL", "IS_UNIQUE", "SORTED_BY", "INCLUDES", 
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


	public TOCLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TOCLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2n\u0396\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\7\2\u00df\n\2\f\2\16\2\u00e2\13\2\5\2\u00e4"+
		"\n\2\3\3\5\3\u00e7\n\3\3\3\3\3\7\3\u00eb\n\3\f\3\16\3\u00ee\13\3\3\4\3"+
		"\4\3\4\6\4\u00f3\n\4\r\4\16\4\u00f4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3L"+
		"\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W"+
		"\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3["+
		"\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3g\3g\7g\u034b\ng\f"+
		"g\16g\u034e\13g\3h\3h\3h\5h\u0353\nh\3h\3h\3i\3i\3i\3i\7i\u035b\ni\fi"+
		"\16i\u035e\13i\3i\3i\3j\3j\3j\3j\7j\u0366\nj\fj\16j\u0369\13j\3j\3j\3"+
		"j\3j\3j\3k\3k\3k\3k\3k\5k\u0375\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u038b\nl\3m\3m\3m\3m\6m\u0391\nm\rm\16m\u0392"+
		"\3m\3m\3\u0367\2n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9"+
		"n\3\2\n\3\2\63;\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\3\2\f\f\3\2C\\\4\2&&c|\2\u03ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\3\u00e3\3\2\2\2\5\u00e6\3\2\2\2\7\u00ef\3\2\2\2\t\u00f6\3\2\2\2\13"+
		"\u00f8\3\2\2\2\r\u00fa\3\2\2\2\17\u00fc\3\2\2\2\21\u00fe\3\2\2\2\23\u0103"+
		"\3\2\2\2\25\u0105\3\2\2\2\27\u0107\3\2\2\2\31\u010d\3\2\2\2\33\u0110\3"+
		"\2\2\2\35\u0112\3\2\2\2\37\u0114\3\2\2\2!\u0116\3\2\2\2#\u011a\3\2\2\2"+
		"%\u011e\3\2\2\2\'\u0127\3\2\2\2)\u0132\3\2\2\2+\u013d\3\2\2\2-\u013f\3"+
		"\2\2\2/\u0141\3\2\2\2\61\u0144\3\2\2\2\63\u0149\3\2\2\2\65\u014f\3\2\2"+
		"\2\67\u0151\3\2\2\29\u0154\3\2\2\2;\u015b\3\2\2\2=\u0162\3\2\2\2?\u016a"+
		"\3\2\2\2A\u0171\3\2\2\2C\u0178\3\2\2\2E\u0181\3\2\2\2G\u018a\3\2\2\2I"+
		"\u0193\3\2\2\2K\u019c\3\2\2\2M\u01a8\3\2\2\2O\u01b4\3\2\2\2Q\u01b8\3\2"+
		"\2\2S\u01ba\3\2\2\2U\u01bc\3\2\2\2W\u01c4\3\2\2\2Y\u01c6\3\2\2\2[\u01c8"+
		"\3\2\2\2]\u01cb\3\2\2\2_\u01d3\3\2\2\2a\u01db\3\2\2\2c\u01e0\3\2\2\2e"+
		"\u01e7\3\2\2\2g\u01f8\3\2\2\2i\u01ff\3\2\2\2k\u020a\3\2\2\2m\u0215\3\2"+
		"\2\2o\u021d\3\2\2\2q\u021f\3\2\2\2s\u0221\3\2\2\2u\u0229\3\2\2\2w\u022c"+
		"\3\2\2\2y\u0230\3\2\2\2{\u0234\3\2\2\2}\u0238\3\2\2\2\177\u023a\3\2\2"+
		"\2\u0081\u023c\3\2\2\2\u0083\u0246\3\2\2\2\u0085\u0252\3\2\2\2\u0087\u025e"+
		"\3\2\2\2\u0089\u026b\3\2\2\2\u008b\u0278\3\2\2\2\u008d\u0285\3\2\2\2\u008f"+
		"\u028a\3\2\2\2\u0091\u028e\3\2\2\2\u0093\u0291\3\2\2\2\u0095\u0293\3\2"+
		"\2\2\u0097\u0295\3\2\2\2\u0099\u0298\3\2\2\2\u009b\u029d\3\2\2\2\u009d"+
		"\u02a2\3\2\2\2\u009f\u02a8\3\2\2\2\u00a1\u02b0\3\2\2\2\u00a3\u02b5\3\2"+
		"\2\2\u00a5\u02bd\3\2\2\2\u00a7\u02c8\3\2\2\2\u00a9\u02d0\3\2\2\2\u00ab"+
		"\u02d5\3\2\2\2\u00ad\u02dc\3\2\2\2\u00af\u02e0\3\2\2\2\u00b1\u02e7\3\2"+
		"\2\2\u00b3\u02eb\3\2\2\2\u00b5\u02ef\3\2\2\2\u00b7\u02f4\3\2\2\2\u00b9"+
		"\u02f9\3\2\2\2\u00bb\u02fe\3\2\2\2\u00bd\u0305\3\2\2\2\u00bf\u030e\3\2"+
		"\2\2\u00c1\u0314\3\2\2\2\u00c3\u031b\3\2\2\2\u00c5\u0324\3\2\2\2\u00c7"+
		"\u032f\3\2\2\2\u00c9\u033c\3\2\2\2\u00cb\u0342\3\2\2\2\u00cd\u0348\3\2"+
		"\2\2\u00cf\u0352\3\2\2\2\u00d1\u0356\3\2\2\2\u00d3\u0361\3\2\2\2\u00d5"+
		"\u0374\3\2\2\2\u00d7\u038a\3\2\2\2\u00d9\u038c\3\2\2\2\u00db\u00e4\7\62"+
		"\2\2\u00dc\u00e0\t\2\2\2\u00dd\u00df\t\3\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00dc\3\2\2\2\u00e4"+
		"\4\3\2\2\2\u00e5\u00e7\7/\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00ec\t\2\2\2\u00e9\u00eb\t\3\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\6\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5\5\3\2\u00f0\u00f2\7\60\2"+
		"\2\u00f1\u00f3\t\3\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\b\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7"+
		"\n\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9\f\3\2\2\2\u00fa\u00fb\7,\2\2\u00fb"+
		"\16\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd\20\3\2\2\2\u00fe\u00ff\7u\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\u0101\7n\2\2\u0101\u0102\7h\2\2\u0102\22\3\2\2\2\u0103"+
		"\u0104\7a\2\2\u0104\24\3\2\2\2\u0105\u0106\7)\2\2\u0106\26\3\2\2\2\u0107"+
		"\u0108\7V\2\2\u0108\u0109\7w\2\2\u0109\u010a\7r\2\2\u010a\u010b\7n\2\2"+
		"\u010b\u010c\7g\2\2\u010c\30\3\2\2\2\u010d\u010e\7<\2\2\u010e\u010f\7"+
		"<\2\2\u010f\32\3\2\2\2\u0110\u0111\7%\2\2\u0111\34\3\2\2\2\u0112\u0113"+
		"\7}\2\2\u0113\36\3\2\2\2\u0114\u0115\7\177\2\2\u0115 \3\2\2\2\u0116\u0117"+
		"\7U\2\2\u0117\u0118\7g\2\2\u0118\u0119\7v\2\2\u0119\"\3\2\2\2\u011a\u011b"+
		"\7D\2\2\u011b\u011c\7c\2\2\u011c\u011d\7i\2\2\u011d$\3\2\2\2\u011e\u011f"+
		"\7U\2\2\u011f\u0120\7g\2\2\u0120\u0121\7s\2\2\u0121\u0122\7w\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7p\2\2\u0124\u0125\7e\2\2\u0125\u0126\7g\2\2"+
		"\u0126&\3\2\2\2\u0127\u0128\7E\2\2\u0128\u0129\7q\2\2\u0129\u012a\7n\2"+
		"\2\u012a\u012b\7n\2\2\u012b\u012c\7g\2\2\u012c\u012d\7e\2\2\u012d\u012e"+
		"\7v\2\2\u012e\u012f\7k\2\2\u012f\u0130\7q\2\2\u0130\u0131\7p\2\2\u0131"+
		"(\3\2\2\2\u0132\u0133\7Q\2\2\u0133\u0134\7t\2\2\u0134\u0135\7f\2\2\u0135"+
		"\u0136\7g\2\2\u0136\u0137\7t\2\2\u0137\u0138\7g\2\2\u0138\u0139\7f\2\2"+
		"\u0139\u013a\7U\2\2\u013a\u013b\7g\2\2\u013b\u013c\7v\2\2\u013c*\3\2\2"+
		"\2\u013d\u013e\7.\2\2\u013e,\3\2\2\2\u013f\u0140\7\60\2\2\u0140.\3\2\2"+
		"\2\u0141\u0142\7\60\2\2\u0142\u0143\7\60\2\2\u0143\60\3\2\2\2\u0144\u0145"+
		"\7v\2\2\u0145\u0146\7t\2\2\u0146\u0147\7w\2\2\u0147\u0148\7g\2\2\u0148"+
		"\62\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b\7c\2\2\u014b\u014c\7n\2\2\u014c"+
		"\u014d\7u\2\2\u014d\u014e\7g\2\2\u014e\64\3\2\2\2\u014f\u0150\7~\2\2\u0150"+
		"\66\3\2\2\2\u0151\u0152\7/\2\2\u0152\u0153\7@\2\2\u01538\3\2\2\2\u0154"+
		"\u0155\7u\2\2\u0155\u0156\7g\2\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7e\2\2\u0159\u015a\7v\2\2\u015a:\3\2\2\2\u015b\u015c\7t\2"+
		"\2\u015c\u015d\7g\2\2\u015d\u015e\7l\2\2\u015e\u015f\7g\2\2\u015f\u0160"+
		"\7e\2\2\u0160\u0161\7v\2\2\u0161<\3\2\2\2\u0162\u0163\7e\2\2\u0163\u0164"+
		"\7q\2\2\u0164\u0165\7n\2\2\u0165\u0166\7n\2\2\u0166\u0167\7g\2\2\u0167"+
		"\u0168\7e\2\2\u0168\u0169\7v\2\2\u0169>\3\2\2\2\u016a\u016b\7g\2\2\u016b"+
		"\u016c\7z\2\2\u016c\u016d\7k\2\2\u016d\u016e\7u\2\2\u016e\u016f\7v\2\2"+
		"\u016f\u0170\7u\2\2\u0170@\3\2\2\2\u0171\u0172\7h\2\2\u0172\u0173\7q\2"+
		"\2\u0173\u0174\7t\2\2\u0174\u0175\7C\2\2\u0175\u0176\7n\2\2\u0176\u0177"+
		"\7n\2\2\u0177B\3\2\2\2\u0178\u0179\7k\2\2\u0179\u017a\7u\2\2\u017a\u017b"+
		"\7W\2\2\u017b\u017c\7p\2\2\u017c\u017d\7k\2\2\u017d\u017e\7s\2\2\u017e"+
		"\u017f\7w\2\2\u017f\u0180\7g\2\2\u0180D\3\2\2\2\u0181\u0182\7u\2\2\u0182"+
		"\u0183\7q\2\2\u0183\u0184\7t\2\2\u0184\u0185\7v\2\2\u0185\u0186\7g\2\2"+
		"\u0186\u0187\7f\2\2\u0187\u0188\7D\2\2\u0188\u0189\7{\2\2\u0189F\3\2\2"+
		"\2\u018a\u018b\7k\2\2\u018b\u018c\7p\2\2\u018c\u018d\7e\2\2\u018d\u018e"+
		"\7n\2\2\u018e\u018f\7w\2\2\u018f\u0190\7f\2\2\u0190\u0191\7g\2\2\u0191"+
		"\u0192\7u\2\2\u0192H\3\2\2\2\u0193\u0194\7g\2\2\u0194\u0195\7z\2\2\u0195"+
		"\u0196\7e\2\2\u0196\u0197\7n\2\2\u0197\u0198\7w\2\2\u0198\u0199\7f\2\2"+
		"\u0199\u019a\7g\2\2\u019a\u019b\7u\2\2\u019bJ\3\2\2\2\u019c\u019d\7k\2"+
		"\2\u019d\u019e\7p\2\2\u019e\u019f\7e\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1"+
		"\7w\2\2\u01a1\u01a2\7f\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7u\2\2\u01a4"+
		"\u01a5\7C\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7n\2\2\u01a7L\3\2\2\2\u01a8"+
		"\u01a9\7g\2\2\u01a9\u01aa\7z\2\2\u01aa\u01ab\7e\2\2\u01ab\u01ac\7n\2\2"+
		"\u01ac\u01ad\7w\2\2\u01ad\u01ae\7f\2\2\u01ae\u01af\7g\2\2\u01af\u01b0"+
		"\7u\2\2\u01b0\u01b1\7C\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7n\2\2\u01b3"+
		"N\3\2\2\2\u01b4\u01b5\7f\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7x\2\2\u01b7"+
		"P\3\2\2\2\u01b8\u01b9\7]\2\2\u01b9R\3\2\2\2\u01ba\u01bb\7_\2\2\u01bbT"+
		"\3\2\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7g\2\2\u01bf"+
		"\u01c0\7t\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7g\2\2"+
		"\u01c3V\3\2\2\2\u01c4\u01c5\7<\2\2\u01c5X\3\2\2\2\u01c6\u01c7\7?\2\2\u01c7"+
		"Z\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9\u01ca\7@\2\2\u01ca\\\3\2\2\2\u01cb"+
		"\u01cc\7D\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7n\2\2"+
		"\u01cf\u01d0\7g\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7p\2\2\u01d2^\3\2\2"+
		"\2\u01d3\u01d4\7K\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7"+
		"\7g\2\2\u01d7\u01d8\7i\2\2\u01d8\u01d9\7g\2\2\u01d9\u01da\7t\2\2\u01da"+
		"`\3\2\2\2\u01db\u01dc\7T\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7c\2\2\u01de"+
		"\u01df\7n\2\2\u01dfb\3\2\2\2\u01e0\u01e1\7U\2\2\u01e1\u01e2\7v\2\2\u01e2"+
		"\u01e3\7t\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7i\2\2"+
		"\u01e6d\3\2\2\2\u01e7\u01e8\7W\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea\7n\2"+
		"\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7o\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee"+
		"\7v\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7f\2\2\u01f0\u01f1\7P\2\2\u01f1"+
		"\u01f2\7c\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4\7w\2\2\u01f4\u01f5\7t\2\2"+
		"\u01f5\u01f6\7c\2\2\u01f6\u01f7\7n\2\2\u01f7f\3\2\2\2\u01f8\u01f9\7Q\2"+
		"\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7n\2\2\u01fb\u01fc\7C\2\2\u01fc\u01fd"+
		"\7p\2\2\u01fd\u01fe\7{\2\2\u01feh\3\2\2\2\u01ff\u0200\7Q\2\2\u0200\u0201"+
		"\7e\2\2\u0201\u0202\7n\2\2\u0202\u0203\7K\2\2\u0203\u0204\7p\2\2\u0204"+
		"\u0205\7x\2\2\u0205\u0206\7c\2\2\u0206\u0207\7n\2\2\u0207\u0208\7k\2\2"+
		"\u0208\u0209\7f\2\2\u0209j\3\2\2\2\u020a\u020b\7Q\2\2\u020b\u020c\7e\2"+
		"\2\u020c\u020d\7n\2\2\u020d\u020e\7O\2\2\u020e\u020f\7g\2\2\u020f\u0210"+
		"\7u\2\2\u0210\u0211\7u\2\2\u0211\u0212\7c\2\2\u0212\u0213\7i\2\2\u0213"+
		"\u0214\7g\2\2\u0214l\3\2\2\2\u0215\u0216\7Q\2\2\u0216\u0217\7e\2\2\u0217"+
		"\u0218\7n\2\2\u0218\u0219\7X\2\2\u0219\u021a\7q\2\2\u021a\u021b\7k\2\2"+
		"\u021b\u021c\7f\2\2\u021cn\3\2\2\2\u021d\u021e\7*\2\2\u021ep\3\2\2\2\u021f"+
		"\u0220\7+\2\2\u0220r\3\2\2\2\u0221\u0222\7k\2\2\u0222\u0223\7o\2\2\u0223"+
		"\u0224\7r\2\2\u0224\u0225\7n\2\2\u0225\u0226\7k\2\2\u0226\u0227\7g\2\2"+
		"\u0227\u0228\7u\2\2\u0228t\3\2\2\2\u0229\u022a\7q\2\2\u022a\u022b\7t\2"+
		"\2\u022bv\3\2\2\2\u022c\u022d\7z\2\2\u022d\u022e\7q\2\2\u022e\u022f\7"+
		"t\2\2\u022fx\3\2\2\2\u0230\u0231\7c\2\2\u0231\u0232\7p\2\2\u0232\u0233"+
		"\7f\2\2\u0233z\3\2\2\2\u0234\u0235\7p\2\2\u0235\u0236\7q\2\2\u0236\u0237"+
		"\7v\2\2\u0237|\3\2\2\2\u0238\u0239\7@\2\2\u0239~\3\2\2\2\u023a\u023b\7"+
		">\2\2\u023b\u0080\3\2\2\2\u023c\u023d\7q\2\2\u023d\u023e\7e\2\2\u023e"+
		"\u023f\7n\2\2\u023f\u0240\7C\2\2\u0240\u0241\7u\2\2\u0241\u0242\7V\2\2"+
		"\u0242\u0243\7{\2\2\u0243\u0244\7r\2\2\u0244\u0245\7g\2\2\u0245\u0082"+
		"\3\2\2\2\u0246\u0247\7q\2\2\u0247\u0248\7e\2\2\u0248\u0249\7n\2\2\u0249"+
		"\u024a\7K\2\2\u024a\u024b\7u\2\2\u024b\u024c\7M\2\2\u024c\u024d\7k\2\2"+
		"\u024d\u024e\7p\2\2\u024e\u024f\7f\2\2\u024f\u0250\7Q\2\2\u0250\u0251"+
		"\7h\2\2\u0251\u0084\3\2\2\2\u0252\u0253\7q\2\2\u0253\u0254\7e\2\2\u0254"+
		"\u0255\7n\2\2\u0255\u0256\7K\2\2\u0256\u0257\7u\2\2\u0257\u0258\7V\2\2"+
		"\u0258\u0259\7{\2\2\u0259\u025a\7r\2\2\u025a\u025b\7g\2\2\u025b\u025c"+
		"\7Q\2\2\u025c\u025d\7h\2\2\u025d\u0086\3\2\2\2\u025e\u025f\7u\2\2\u025f"+
		"\u0260\7g\2\2\u0260\u0261\7n\2\2\u0261\u0262\7g\2\2\u0262\u0263\7e\2\2"+
		"\u0263\u0264\7v\2\2\u0264\u0265\7D\2\2\u0265\u0266\7{\2\2\u0266\u0267"+
		"\7M\2\2\u0267\u0268\7k\2\2\u0268\u0269\7p\2\2\u0269\u026a\7f\2\2\u026a"+
		"\u0088\3\2\2\2\u026b\u026c\7u\2\2\u026c\u026d\7g\2\2\u026d\u026e\7n\2"+
		"\2\u026e\u026f\7g\2\2\u026f\u0270\7e\2\2\u0270\u0271\7v\2\2\u0271\u0272"+
		"\7D\2\2\u0272\u0273\7{\2\2\u0273\u0274\7V\2\2\u0274\u0275\7{\2\2\u0275"+
		"\u0276\7r\2\2\u0276\u0277\7g\2\2\u0277\u008a\3\2\2\2\u0278\u0279\7c\2"+
		"\2\u0279\u027a\7n\2\2\u027a\u027b\7n\2\2\u027b\u027c\7K\2\2\u027c\u027d"+
		"\7p\2\2\u027d\u027e\7u\2\2\u027e\u027f\7v\2\2\u027f\u0280\7c\2\2\u0280"+
		"\u0281\7p\2\2\u0281\u0282\7e\2\2\u0282\u0283\7g\2\2\u0283\u0284\7u\2\2"+
		"\u0284\u008c\3\2\2\2\u0285\u0286\7B\2\2\u0286\u0287\7r\2\2\u0287\u0288"+
		"\7t\2\2\u0288\u0289\7g\2\2\u0289\u008e\3\2\2\2\u028a\u028b\7n\2\2\u028b"+
		"\u028c\7g\2\2\u028c\u028d\7v\2\2\u028d\u0090\3\2\2\2\u028e\u028f\7k\2"+
		"\2\u028f\u0290\7p\2\2\u0290\u0092\3\2\2\2\u0291\u0292\7=\2\2\u0292\u0094"+
		"\3\2\2\2\u0293\u0294\7A\2\2\u0294\u0096\3\2\2\2\u0295\u0296\7k\2\2\u0296"+
		"\u0297\7h\2\2\u0297\u0098\3\2\2\2\u0298\u0299\7v\2\2\u0299\u029a\7j\2"+
		"\2\u029a\u029b\7g\2\2\u029b\u029c\7p\2\2\u029c\u009a\3\2\2\2\u029d\u029e"+
		"\7g\2\2\u029e\u029f\7n\2\2\u029f\u02a0\7u\2\2\u02a0\u02a1\7g\2\2\u02a1"+
		"\u009c\3\2\2\2\u02a2\u02a3\7g\2\2\u02a3\u02a4\7p\2\2\u02a4\u02a5\7f\2"+
		"\2\u02a5\u02a6\7k\2\2\u02a6\u02a7\7h\2\2\u02a7\u009e\3\2\2\2\u02a8\u02a9"+
		"\7k\2\2\u02a9\u02aa\7p\2\2\u02aa\u02ab\7x\2\2\u02ab\u02ac\7c\2\2\u02ac"+
		"\u02ad\7n\2\2\u02ad\u02ae\7k\2\2\u02ae\u02af\7f\2\2\u02af\u00a0\3\2\2"+
		"\2\u02b0\u02b1\7p\2\2\u02b1\u02b2\7w\2\2\u02b2\u02b3\7n\2\2\u02b3\u02b4"+
		"\7n\2\2\u02b4\u00a2\3\2\2\2\u02b5\u02b6\7r\2\2\u02b6\u02b7\7c\2\2\u02b7"+
		"\u02b8\7e\2\2\u02b8\u02b9\7m\2\2\u02b9\u02ba\7c\2\2\u02ba\u02bb\7i\2\2"+
		"\u02bb\u02bc\7g\2\2\u02bc\u00a4\3\2\2\2\u02bd\u02be\7g\2\2\u02be\u02bf"+
		"\7p\2\2\u02bf\u02c0\7f\2\2\u02c0\u02c1\7r\2\2\u02c1\u02c2\7c\2\2\u02c2"+
		"\u02c3\7e\2\2\u02c3\u02c4\7m\2\2\u02c4\u02c5\7c\2\2\u02c5\u02c6\7i\2\2"+
		"\u02c6\u02c7\7g\2\2\u02c7\u00a6\3\2\2\2\u02c8\u02c9\7e\2\2\u02c9\u02ca"+
		"\7q\2\2\u02ca\u02cb\7p\2\2\u02cb\u02cc\7v\2\2\u02cc\u02cd\7g\2\2\u02cd"+
		"\u02ce\7z\2\2\u02ce\u02cf\7v\2\2\u02cf\u00a8\3\2\2\2\u02d0\u02d1\7k\2"+
		"\2\u02d1\u02d2\7p\2\2\u02d2\u02d3\7k\2\2\u02d3\u02d4\7v\2\2\u02d4\u00aa"+
		"\3\2\2\2\u02d5\u02d6\7f\2\2\u02d6\u02d7\7g\2\2\u02d7\u02d8\7t\2\2\u02d8"+
		"\u02d9\7k\2\2\u02d9\u02da\7x\2\2\u02da\u02db\7g\2\2\u02db\u00ac\3\2\2"+
		"\2\u02dc\u02dd\7k\2\2\u02dd\u02de\7p\2\2\u02de\u02df\7x\2\2\u02df\u00ae"+
		"\3\2\2\2\u02e0\u02e1\7u\2\2\u02e1\u02e2\7v\2\2\u02e2\u02e3\7c\2\2\u02e3"+
		"\u02e4\7v\2\2\u02e4\u02e5\7k\2\2\u02e5\u02e6\7e\2\2\u02e6\u00b0\3\2\2"+
		"\2\u02e7\u02e8\7f\2\2\u02e8\u02e9\7g\2\2\u02e9\u02ea\7h\2\2\u02ea\u00b2"+
		"\3\2\2\2\u02eb\u02ec\7r\2\2\u02ec\u02ed\7t\2\2\u02ed\u02ee\7g\2\2\u02ee"+
		"\u00b4\3\2\2\2\u02ef\u02f0\7r\2\2\u02f0\u02f1\7q\2\2\u02f1\u02f2\7u\2"+
		"\2\u02f2\u02f3\7v\2\2\u02f3\u00b6\3\2\2\2\u02f4\u02f5\7d\2\2\u02f5\u02f6"+
		"\7q\2\2\u02f6\u02f7\7f\2\2\u02f7\u02f8\7{\2\2\u02f8\u00b8\3\2\2\2\u02f9"+
		"\u02fa\7p\2\2\u02fa\u02fb\7g\2\2\u02fb\u02fc\7z\2\2\u02fc\u02fd\7v\2\2"+
		"\u02fd\u00ba\3\2\2\2\u02fe\u02ff\7c\2\2\u02ff\u0300\7n\2\2\u0300\u0301"+
		"\7y\2\2\u0301\u0302\7c\2\2\u0302\u0303\7{\2\2\u0303\u0304\7u\2\2\u0304"+
		"\u00bc\3\2\2\2\u0305\u0306\7u\2\2\u0306\u0307\7q\2\2\u0307\u0308\7o\2"+
		"\2\u0308\u0309\7g\2\2\u0309\u030a\7v\2\2\u030a\u030b\7k\2\2\u030b\u030c"+
		"\7o\2\2\u030c\u030d\7g\2\2\u030d\u00be\3\2\2\2\u030e\u030f\7w\2\2\u030f"+
		"\u0310\7p\2\2\u0310\u0311\7v\2\2\u0311\u0312\7k\2\2\u0312\u0313\7n\2\2"+
		"\u0313\u00c0\3\2\2\2\u0314\u0315\7d\2\2\u0315\u0316\7g\2\2\u0316\u0317"+
		"\7h\2\2\u0317\u0318\7q\2\2\u0318\u0319\7t\2\2\u0319\u031a\7g\2\2\u031a"+
		"\u00c2\3\2\2\2\u031b\u031c\7r\2\2\u031c\u031d\7t\2\2\u031d\u031e\7g\2"+
		"\2\u031e\u031f\7x\2\2\u031f\u0320\7k\2\2\u0320\u0321\7q\2\2\u0321\u0322"+
		"\7w\2\2\u0322\u0323\7u\2\2\u0323\u00c4\3\2\2\2\u0324\u0325\7c\2\2\u0325"+
		"\u0326\7n\2\2\u0326\u0327\7y\2\2\u0327\u0328\7c\2\2\u0328\u0329\7{\2\2"+
		"\u0329\u032a\7u\2\2\u032a\u032b\7R\2\2\u032b\u032c\7c\2\2\u032c\u032d"+
		"\7u\2\2\u032d\u032e\7v\2\2\u032e\u00c6\3\2\2\2\u032f\u0330\7u\2\2\u0330"+
		"\u0331\7q\2\2\u0331\u0332\7o\2\2\u0332\u0333\7g\2\2\u0333\u0334\7v\2\2"+
		"\u0334\u0335\7k\2\2\u0335\u0336\7o\2\2\u0336\u0337\7g\2\2\u0337\u0338"+
		"\7R\2\2\u0338\u0339\7c\2\2\u0339\u033a\7u\2\2\u033a\u033b\7v\2\2\u033b"+
		"\u00c8\3\2\2\2\u033c\u033d\7u\2\2\u033d\u033e\7k\2\2\u033e\u033f\7p\2"+
		"\2\u033f\u0340\7e\2\2\u0340\u0341\7g\2\2\u0341\u00ca\3\2\2\2\u0342\u0343"+
		"\7B\2\2\u0343\u0344\7p\2\2\u0344\u0345\7g\2\2\u0345\u0346\7z\2\2\u0346"+
		"\u0347\7v\2\2\u0347\u00cc\3\2\2\2\u0348\u034c\t\4\2\2\u0349\u034b\t\5"+
		"\2\2\u034a\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034d\u00ce\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0353\t\6"+
		"\2\2\u0350\u0351\7\f\2\2\u0351\u0353\7\17\2\2\u0352\u034f\3\2\2\2\u0352"+
		"\u0350\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\bh\2\2\u0355\u00d0\3\2"+
		"\2\2\u0356\u0357\7/\2\2\u0357\u0358\7/\2\2\u0358\u035c\3\2\2\2\u0359\u035b"+
		"\n\7\2\2\u035a\u0359\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\bi"+
		"\2\2\u0360\u00d2\3\2\2\2\u0361\u0362\7\61\2\2\u0362\u0363\7,\2\2\u0363"+
		"\u0367\3\2\2\2\u0364\u0366\13\2\2\2\u0365\u0364\3\2\2\2\u0366\u0369\3"+
		"\2\2\2\u0367\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u036a\3\2\2\2\u0369"+
		"\u0367\3\2\2\2\u036a\u036b\7,\2\2\u036b\u036c\7\61\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u036e\bj\2\2\u036e\u00d4\3\2\2\2\u036f\u0375\t\b\2\2\u0370"+
		"\u0375\5\23\n\2\u0371\u0375\t\t\2\2\u0372\u0375\5\13\6\2\u0373\u0375\t"+
		"\3\2\2\u0374\u036f\3\2\2\2\u0374\u0370\3\2\2\2\u0374\u0371\3\2\2\2\u0374"+
		"\u0372\3\2\2\2\u0374\u0373\3\2\2\2\u0375\u00d6\3\2\2\2\u0376\u0377\7^"+
		"\2\2\u0377\u038b\7d\2\2\u0378\u0379\7^\2\2\u0379\u038b\7v\2\2\u037a\u037b"+
		"\7^\2\2\u037b\u038b\7p\2\2\u037c\u037d\7^\2\2\u037d\u038b\7h\2\2\u037e"+
		"\u037f\7^\2\2\u037f\u038b\7t\2\2\u0380\u0381\7^\2\2\u0381\u038b\7$\2\2"+
		"\u0382\u0383\7^\2\2\u0383\u038b\7)\2\2\u0384\u0385\7^\2\2\u0385\u038b"+
		"\7^\2\2\u0386\u0387\7^\2\2\u0387\u038b\7z\2\2\u0388\u0389\7^\2\2\u0389"+
		"\u038b\7w\2\2\u038a\u0376\3\2\2\2\u038a\u0378\3\2\2\2\u038a\u037a\3\2"+
		"\2\2\u038a\u037c\3\2\2\2\u038a\u037e\3\2\2\2\u038a\u0380\3\2\2\2\u038a"+
		"\u0382\3\2\2\2\u038a\u0384\3\2\2\2\u038a\u0386\3\2\2\2\u038a\u0388\3\2"+
		"\2\2\u038b\u00d8\3\2\2\2\u038c\u0390\7)\2\2\u038d\u0391\5\u00d5k\2\u038e"+
		"\u0391\5\u00cfh\2\u038f\u0391\5\u00d7l\2\u0390\u038d\3\2\2\2\u0390\u038e"+
		"\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\7)\2\2\u0395\u00da\3\2"+
		"\2\2\20\2\u00e0\u00e3\u00e6\u00ec\u00f4\u034c\u0352\u035c\u0367\u0374"+
		"\u038a\u0390\u0392\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Uddannelse/DTU/3sem/Compiler/antlrMaven/src/main/java\simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, FLOAT=13, OP=14, IP=15, EP=16, AP=17, ALPHA=18, 
		NUM=19, EQUAL=20, WHITESPACE=21, COMMENT=22, COMMENT2=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ID", "FLOAT", "OP", "IP", "EP", "AP", "ALPHA", "NUM", 
			"EQUAL", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'while'", "'('", "')'", "'(if('", "' then '", "' else '", 
			"'='", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "FLOAT", "OP", "IP", "EP", "AP", "ALPHA", "NUM", "EQUAL", "WHITESPACE", 
			"COMMENT", "COMMENT2"
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\7\r\\\n\r\f\r\16\r_\13\r\3\16\6\16b\n\16\r\16"+
		"\16\16c\3\16\3\16\6\16h\n\16\r\16\16\16i\5\16l\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20u\n\20\3\21\3\21\3\21\3\21\5\21{\n\21\3\22\3\22\3"+
		"\22\3\22\5\22\u0081\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u008a"+
		"\n\26\r\26\16\26\u008b\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0094\n\27\f"+
		"\27\16\27\u0097\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00a1"+
		"\n\30\f\30\16\30\u00a4\13\30\3\30\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\3\2\13\4\2--//\4\2>>@@\13\2C\\aac|\u00a7"+
		"\u00a8\u00ba\u00ba\u00c5\u00c5\u02de\u02de\u2022\u2022\u2028\u2028\3\2"+
		"\62;\3\2??\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00b6\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3"+
		"\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17"+
		"D\3\2\2\2\21K\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2"+
		"\33a\3\2\2\2\35m\3\2\2\2\37t\3\2\2\2!z\3\2\2\2#\u0080\3\2\2\2%\u0082\3"+
		"\2\2\2\'\u0084\3\2\2\2)\u0086\3\2\2\2+\u0089\3\2\2\2-\u008f\3\2\2\2/\u009a"+
		"\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64\7\177\2\2\64\6\3\2\2\2\65\66"+
		"\7y\2\2\66\67\7j\2\2\678\7k\2\289\7n\2\29:\7g\2\2:\b\3\2\2\2;<\7*\2\2"+
		"<\n\3\2\2\2=>\7+\2\2>\f\3\2\2\2?@\7*\2\2@A\7k\2\2AB\7h\2\2BC\7*\2\2C\16"+
		"\3\2\2\2DE\7\"\2\2EF\7v\2\2FG\7j\2\2GH\7g\2\2HI\7p\2\2IJ\7\"\2\2J\20\3"+
		"\2\2\2KL\7\"\2\2LM\7g\2\2MN\7n\2\2NO\7u\2\2OP\7g\2\2PQ\7\"\2\2Q\22\3\2"+
		"\2\2RS\7?\2\2S\24\3\2\2\2TU\7,\2\2U\26\3\2\2\2VW\7\61\2\2W\30\3\2\2\2"+
		"X]\5%\23\2Y\\\5%\23\2Z\\\5\'\24\2[Y\3\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^\32\3\2\2\2_]\3\2\2\2`b\5\'\24\2a`\3\2\2\2bc\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2dk\3\2\2\2eg\7\60\2\2fh\5\'\24\2gf\3\2\2\2hi\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ke\3\2\2\2kl\3\2\2\2l\34\3\2\2\2mn\t\2\2"+
		"\2n\36\3\2\2\2ou\t\3\2\2pq\7@\2\2qu\7?\2\2rs\7>\2\2su\7?\2\2to\3\2\2\2"+
		"tp\3\2\2\2tr\3\2\2\2u \3\2\2\2vw\7#\2\2w{\7?\2\2xy\7?\2\2y{\7?\2\2zv\3"+
		"\2\2\2zx\3\2\2\2{\"\3\2\2\2|}\7~\2\2}\u0081\7~\2\2~\177\7(\2\2\177\u0081"+
		"\7(\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081$\3\2\2\2\u0082\u0083\t\4\2"+
		"\2\u0083&\3\2\2\2\u0084\u0085\t\5\2\2\u0085(\3\2\2\2\u0086\u0087\t\6\2"+
		"\2\u0087*\3\2\2\2\u0088\u008a\t\7\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\26\2\2\u008e,\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7\61\2"+
		"\2\u0091\u0095\3\2\2\2\u0092\u0094\n\b\2\2\u0093\u0092\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\b\27\2\2\u0099.\3\2\2\2\u009a\u009b\7\61\2"+
		"\2\u009b\u009c\7,\2\2\u009c\u00a2\3\2\2\2\u009d\u00a1\n\t\2\2\u009e\u009f"+
		"\7,\2\2\u009f\u00a1\n\n\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\61\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\b\30\2\2\u00a9\60\3\2\2\2\17\2[]ciktz\u0080"+
		"\u008b\u0095\u00a0\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
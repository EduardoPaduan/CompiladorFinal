

package MCGrammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMCGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INCLUDE=2, GLOB=3, MAIN=4, FUNCTION=5, WS=6, NL=7, LC=8, IF=9, 
		ELSE=10, FOR=11, WHILE=12, WRITE=13, READ=14, RET=15, OP=16, CL=17, SEP=18, 
		OPP=19, CLP=20, EOL=21, AT=22, RNG=23, NEG=24, EQ=25, PEG=26, MEG=27, 
		LESS=28, LESSEQ=29, GREATER=30, GREATEREQ=31, CALL=32, TRUE=33, FALSE=34, 
		PLUS=35, MINUM=36, MULT=37, DIV=38, MOD=39, INT=40, FLOAT=41, BOOLEAN=42, 
		STRING=43, ID=44, NUM=45, STR=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "INCLUDE", "GLOB", "MAIN", "FUNCTION", "WS", "NL", "LC", "IF", 
		"ELSE", "FOR", "WHILE", "WRITE", "READ", "RET", "OP", "CL", "SEP", "OPP", 
		"CLP", "EOL", "AT", "RNG", "NEG", "EQ", "PEG", "MEG", "LESS", "LESSEQ", 
		"GREATER", "GREATEREQ", "CALL", "TRUE", "FALSE", "PLUS", "MINUM", "MULT", 
		"DIV", "MOD", "INT", "FLOAT", "BOOLEAN", "STRING", "ID", "NUM", "STR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", "'#Include'", "'global'", "'main'", "'function'", null, null, 
		null, "'if'", "'else'", "'for'", "'while'", "'writeln'", "'readln'", "'return'", 
		"'{'", "'}'", "','", "'('", "')'", "';'", "'='", "'...'", "'!='", "'=='", 
		"'+='", "'-='", "'<'", "'<='", "'>'", "'>='", "'->'", "'true'", "'false'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", "'bool'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "INCLUDE", "GLOB", "MAIN", "FUNCTION", "WS", "NL", "LC", "IF", 
		"ELSE", "FOR", "WHILE", "WRITE", "READ", "RET", "OP", "CL", "SEP", "OPP", 
		"CLP", "EOL", "AT", "RNG", "NEG", "EQ", "PEG", "MEG", "LESS", "LESSEQ", 
		"GREATER", "GREATEREQ", "CALL", "TRUE", "FALSE", "PLUS", "MINUM", "MULT", 
		"DIV", "MOD", "INT", "FLOAT", "BOOLEAN", "STRING", "ID", "NUM", "STR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	
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


	public CMCGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			NL_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			LC_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void LC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u013c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\6\7\u0081\n\7\r\7\16\7\u0082\3\7\3\7\3\b\5\b\u0088"+
		"\n\b\3\b\6\b\u008b\n\b\r\b\16\b\u008c\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0095"+
		"\n\t\f\t\16\t\u0098\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3-\3-\7-\u011c\n-\f-\16-\u011f\13-\3.\5.\u0122\n.\3.\6.\u0125\n.\r."+
		"\16.\u0126\3.\3.\6.\u012b\n.\r.\16.\u012c\5.\u012f\n.\3/\3/\5/\u0133\n"+
		"/\3/\7/\u0136\n/\f/\16/\u0139\13/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60\3\2\n\4\2\13\13\"\"\4\2\f\f\17\17\4\2C\\c|\5\2\62;C"+
		"\\c|\4\2--//\3\2\62;\6\2\"\"\62;C\\c|\b\2\"\"\60\60\62<C\\aac|\u0146\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2"+
		"\2\2\7j\3\2\2\2\tq\3\2\2\2\13v\3\2\2\2\r\u0080\3\2\2\2\17\u0087\3\2\2"+
		"\2\21\u0090\3\2\2\2\23\u009b\3\2\2\2\25\u009e\3\2\2\2\27\u00a3\3\2\2\2"+
		"\31\u00a7\3\2\2\2\33\u00ad\3\2\2\2\35\u00b5\3\2\2\2\37\u00bc\3\2\2\2!"+
		"\u00c3\3\2\2\2#\u00c5\3\2\2\2%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3"+
		"\2\2\2+\u00cd\3\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d5\3\2\2\2\63"+
		"\u00d8\3\2\2\2\65\u00db\3\2\2\2\67\u00de\3\2\2\29\u00e1\3\2\2\2;\u00e3"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00eb\3\2\2\2C\u00ee\3\2\2\2E"+
		"\u00f3\3\2\2\2G\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2\2\2M\u00ff\3\2"+
		"\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0107\3\2\2\2U\u010d\3\2\2\2W\u0112"+
		"\3\2\2\2Y\u0119\3\2\2\2[\u0121\3\2\2\2]\u0130\3\2\2\2_`\7\62\2\2`\4\3"+
		"\2\2\2ab\7%\2\2bc\7K\2\2cd\7p\2\2de\7e\2\2ef\7n\2\2fg\7w\2\2gh\7f\2\2"+
		"hi\7g\2\2i\6\3\2\2\2jk\7i\2\2kl\7n\2\2lm\7q\2\2mn\7d\2\2no\7c\2\2op\7"+
		"n\2\2p\b\3\2\2\2qr\7o\2\2rs\7c\2\2st\7k\2\2tu\7p\2\2u\n\3\2\2\2vw\7h\2"+
		"\2wx\7w\2\2xy\7p\2\2yz\7e\2\2z{\7v\2\2{|\7k\2\2|}\7q\2\2}~\7p\2\2~\f\3"+
		"\2\2\2\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\7\2\2\u0085"+
		"\16\3\2\2\2\u0086\u0088\7\17\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u008a\3\2\2\2\u0089\u008b\7\f\2\2\u008a\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\b\b\3\2\u008f\20\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7\61"+
		"\2\2\u0092\u0096\3\2\2\2\u0093\u0095\n\3\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\t\4\2\u009a\22\3\2\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7h\2\2\u009d\24\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\26\3\2\2\2\u00a3\u00a4"+
		"\7h\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6\30\3\2\2\2\u00a7\u00a8"+
		"\7y\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7t\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7"+
		"g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		" \3\2\2\2\u00c3\u00c4\7}\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7\177\2\2\u00c6"+
		"$\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca("+
		"\3\2\2\2\u00cb\u00cc\7+\2\2\u00cc*\3\2\2\2\u00cd\u00ce\7=\2\2\u00ce,\3"+
		"\2\2\2\u00cf\u00d0\7?\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d3"+
		"\7\60\2\2\u00d3\u00d4\7\60\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6"+
		"\u00d7\7?\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00da"+
		"\64\3\2\2\2\u00db\u00dc\7-\2\2\u00dc\u00dd\7?\2\2\u00dd\66\3\2\2\2\u00de"+
		"\u00df\7/\2\2\u00df\u00e0\7?\2\2\u00e08\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2"+
		":\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7?\2\2\u00e5<\3\2\2\2\u00e6\u00e7"+
		"\7@\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9\u00ea\7?\2\2\u00ea@\3"+
		"\2\2\2\u00eb\u00ec\7/\2\2\u00ec\u00ed\7@\2\2\u00edB\3\2\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"D\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7u\2\2\u00f7\u00f8\7g\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7-\2\2\u00fa"+
		"H\3\2\2\2\u00fb\u00fc\7/\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7,\2\2\u00feL"+
		"\3\2\2\2\u00ff\u0100\7\61\2\2\u0100N\3\2\2\2\u0101\u0102\7\'\2\2\u0102"+
		"P\3\2\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2\u0106"+
		"R\3\2\2\2\u0107\u0108\7h\2\2\u0108\u0109\7n\2\2\u0109\u010a\7q\2\2\u010a"+
		"\u010b\7c\2\2\u010b\u010c\7v\2\2\u010cT\3\2\2\2\u010d\u010e\7d\2\2\u010e"+
		"\u010f\7q\2\2\u010f\u0110\7q\2\2\u0110\u0111\7n\2\2\u0111V\3\2\2\2\u0112"+
		"\u0113\7u\2\2\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7k\2\2"+
		"\u0116\u0117\7p\2\2\u0117\u0118\7i\2\2\u0118X\3\2\2\2\u0119\u011d\t\4"+
		"\2\2\u011a\u011c\t\5\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eZ\3\2\2\2\u011f\u011d\3\2\2\2"+
		"\u0120\u0122\t\6\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124"+
		"\3\2\2\2\u0123\u0125\t\7\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012e\3\2\2\2\u0128\u012a\7\60"+
		"\2\2\u0129\u012b\t\7\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0128\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\\\3\2\2\2\u0130\u0132\7$\2\2\u0131\u0133"+
		"\t\b\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2\2\2\u0134"+
		"\u0136\t\t\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\7$\2\2\u013b^\3\2\2\2\16\2\u0082\u0087\u008c\u0096\u011d\u0121"+
		"\u0126\u012c\u012e\u0132\u0137\5\3\7\2\3\b\3\3\t\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
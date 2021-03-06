// Generated from Tiger.g4 by ANTLR 4.0
package Antlr.Tiger;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, STRING=2, ASSIGN=3, COMMA=4, SEMI=5, COLON=6, DOT=7, LT=8, 
		LE=9, GT=10, GE=11, EQ=12, NEQ=13, AND=14, OR=15, PLUS=16, MINUS=17, MUL=18, 
		DIV=19, LPAR=20, RPAR=21, LSQR=22, RSQR=23, LBCE=24, RBCE=25, NIL=26, 
		NEW=27, IF=28, THEN=29, ELSE=30, WHILE=31, DO=32, FOR=33, TO=34, BREAK=35, 
		LET=36, IN=37, END=38, CLASS=39, EXTENDS=40, VAR=41, TYPE=42, METHOD=43, 
		FUNCTION=44, ARRAY=45, OF=46, PRIMITIVE=47, IMPORT=48, ID=49, INT=50, 
		WHITESPACE=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "STRING", "':='", "','", "';'", "':'", "'.'", "'<'", "'<='", 
		"'>'", "'>='", "'='", "'<>'", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'nil'", "'new'", "'if'", "'then'", 
		"'else'", "'while'", "'do'", "'for'", "'to'", "'break'", "'let'", "'in'", 
		"'end'", "'class'", "'extends'", "'var'", "'type'", "'method'", "'function'", 
		"'array'", "'of'", "'primitive'", "'import'", "ID", "INT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"COMMENT", "STRING", "ASSIGN", "COMMA", "SEMI", "COLON", "DOT", "LT", 
		"LE", "GT", "GE", "EQ", "NEQ", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", 
		"LPAR", "RPAR", "LSQR", "RSQR", "LBCE", "RBCE", "NIL", "NEW", "IF", "THEN", 
		"ELSE", "WHILE", "DO", "FOR", "TO", "BREAK", "LET", "IN", "END", "CLASS", 
		"EXTENDS", "VAR", "TYPE", "METHOD", "FUNCTION", "ARRAY", "OF", "PRIMITIVE", 
		"IMPORT", "ID", "INT", "WHITESPACE", "LETTER", "DIGIT", "SLASH"
	};


	public TigerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tiger.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 50: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\65\u0163\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2y\n\2\f\2\16\2|\13\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\u0086\n\3\f\3\16\3\u0089\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u013a\n\62\f\62\16\62"+
		"\u013d\13\62\3\62\3\62\3\62\3\62\3\62\5\62\u0144\n\62\3\63\6\63\u0147"+
		"\n\63\r\63\16\63\u0148\3\64\6\64\u014c\n\64\r\64\16\64\u014d\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0162\n\67\4z\u00878\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*"+
		"\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\3i\2\1k\2\1m"+
		"\2\1\3\2\24\4,,\61\61\3\61\61\3,,\3^^\5\13\f\17\17\"\"\4C\\c|\3\62;\f"+
		"$$))\629^^cdhhppttvvxx\3\639\3\629\3\63\65\3\629\3\629\4ZZzz\5\62;CHc"+
		"h\4ZZzz\5\63;CHch\5\62;CHch\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\3o\3\2\2\2\5\u0082\3\2\2\2\7\u008c\3\2\2\2\t\u008f\3\2\2\2\13\u0091"+
		"\3\2\2\2\r\u0093\3\2\2\2\17\u0095\3\2\2\2\21\u0097\3\2\2\2\23\u0099\3"+
		"\2\2\2\25\u009c\3\2\2\2\27\u009e\3\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2"+
		"\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2#\u00ac\3\2\2\2%"+
		"\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3"+
		"\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00be\3\2\2"+
		"\2\67\u00c2\3\2\2\29\u00c6\3\2\2\2;\u00c9\3\2\2\2=\u00ce\3\2\2\2?\u00d3"+
		"\3\2\2\2A\u00d9\3\2\2\2C\u00dc\3\2\2\2E\u00e0\3\2\2\2G\u00e3\3\2\2\2I"+
		"\u00e9\3\2\2\2K\u00ed\3\2\2\2M\u00f0\3\2\2\2O\u00f4\3\2\2\2Q\u00fa\3\2"+
		"\2\2S\u0102\3\2\2\2U\u0106\3\2\2\2W\u010b\3\2\2\2Y\u0112\3\2\2\2[\u011b"+
		"\3\2\2\2]\u0121\3\2\2\2_\u0124\3\2\2\2a\u012e\3\2\2\2c\u0143\3\2\2\2e"+
		"\u0146\3\2\2\2g\u014b\3\2\2\2i\u0151\3\2\2\2k\u0153\3\2\2\2m\u0155\3\2"+
		"\2\2op\7\61\2\2pq\7,\2\2qz\3\2\2\2ry\5\3\2\2sy\n\2\2\2tu\7,\2\2uy\n\3"+
		"\2\2vw\7\61\2\2wy\n\4\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xv\3\2\2\2y|\3"+
		"\2\2\2z{\3\2\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7,\2\2~\177\7\61\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\b\2\2\2\u0081\4\3\2\2\2\u0082\u0087\7$"+
		"\2\2\u0083\u0086\5m\67\2\u0084\u0086\n\5\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7$\2\2\u008b"+
		"\6\3\2\2\2\u008c\u008d\7<\2\2\u008d\u008e\7?\2\2\u008e\b\3\2\2\2\u008f"+
		"\u0090\7.\2\2\u0090\n\3\2\2\2\u0091\u0092\7=\2\2\u0092\f\3\2\2\2\u0093"+
		"\u0094\7<\2\2\u0094\16\3\2\2\2\u0095\u0096\7\60\2\2\u0096\20\3\2\2\2\u0097"+
		"\u0098\7>\2\2\u0098\22\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b"+
		"\24\3\2\2\2\u009c\u009d\7@\2\2\u009d\26\3\2\2\2\u009e\u009f\7@\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\7>\2\2\u00a4\u00a5\7@\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7"+
		"\36\3\2\2\2\u00a8\u00a9\7~\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7-\2\2\u00ab"+
		"\"\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad$\3\2\2\2\u00ae\u00af\7,\2\2\u00af"+
		"&\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3"+
		"*\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7."+
		"\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb"+
		"\62\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7k\2\2\u00c0\u00c1\7n\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7"+
		"p\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7y\2\2\u00c58\3\2\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7h\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7j\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd<\3\2\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		">\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8@\3\2\2\2\u00d9\u00da\7f\2\2\u00da"+
		"\u00db\7q\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7q\2\2\u00de"+
		"\u00df\7t\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"F\3\2\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7m\2\2\u00e8H\3\2\2\2\u00e9\u00ea\7n\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7p\2\2\u00efL\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2\2\u00f2"+
		"\u00f3\7f\2\2\u00f3N\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7c\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7u\2\2\u00f9P\3\2\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7z\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2"+
		"\u00fe\u00ff\7p\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7u\2\2\u0101R\3\2\2"+
		"\2\u0102\u0103\7x\2\2\u0103\u0104\7c\2\2\u0104\u0105\7t\2\2\u0105T\3\2"+
		"\2\2\u0106\u0107\7v\2\2\u0107\u0108\7{\2\2\u0108\u0109\7r\2\2\u0109\u010a"+
		"\7g\2\2\u010aV\3\2\2\2\u010b\u010c\7o\2\2\u010c\u010d\7g\2\2\u010d\u010e"+
		"\7v\2\2\u010e\u010f\7j\2\2\u010f\u0110\7q\2\2\u0110\u0111\7f\2\2\u0111"+
		"X\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\7w\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7e\2\2\u0116\u0117\7v\2\2\u0117\u0118\7k\2\2\u0118\u0119\7q\2\2"+
		"\u0119\u011a\7p\2\2\u011aZ\3\2\2\2\u011b\u011c\7c\2\2\u011c\u011d\7t\2"+
		"\2\u011d\u011e\7t\2\2\u011e\u011f\7c\2\2\u011f\u0120\7{\2\2\u0120\\\3"+
		"\2\2\2\u0121\u0122\7q\2\2\u0122\u0123\7h\2\2\u0123^\3\2\2\2\u0124\u0125"+
		"\7r\2\2\u0125\u0126\7t\2\2\u0126\u0127\7k\2\2\u0127\u0128\7o\2\2\u0128"+
		"\u0129\7k\2\2\u0129\u012a\7v\2\2\u012a\u012b\7k\2\2\u012b\u012c\7x\2\2"+
		"\u012c\u012d\7g\2\2\u012d`\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130\7o\2"+
		"\2\u0130\u0131\7r\2\2\u0131\u0132\7q\2\2\u0132\u0133\7t\2\2\u0133\u0134"+
		"\7v\2\2\u0134b\3\2\2\2\u0135\u013b\5i\65\2\u0136\u013a\5i\65\2\u0137\u013a"+
		"\5k\66\2\u0138\u013a\7a\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u0144\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7a\2\2\u013f"+
		"\u0140\7o\2\2\u0140\u0141\7c\2\2\u0141\u0142\7k\2\2\u0142\u0144\7p\2\2"+
		"\u0143\u0135\3\2\2\2\u0143\u013e\3\2\2\2\u0144d\3\2\2\2\u0145\u0147\5"+
		"k\66\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149f\3\2\2\2\u014a\u014c\t\6\2\2\u014b\u014a\3\2\2\2"+
		"\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\b\64\3\2\u0150h\3\2\2\2\u0151\u0152\t\7\2\2\u0152"+
		"j\3\2\2\2\u0153\u0154\t\b\2\2\u0154l\3\2\2\2\u0155\u0161\7^\2\2\u0156"+
		"\u0162\t\t\2\2\u0157\u0158\t\n\2\2\u0158\u0162\t\13\2\2\u0159\u015a\t"+
		"\f\2\2\u015a\u015b\t\r\2\2\u015b\u0162\t\16\2\2\u015c\u015d\t\17\2\2\u015d"+
		"\u0162\t\20\2\2\u015e\u015f\t\21\2\2\u015f\u0160\t\22\2\2\u0160\u0162"+
		"\t\23\2\2\u0161\u0156\3\2\2\2\u0161\u0157\3\2\2\2\u0161\u0159\3\2\2\2"+
		"\u0161\u015c\3\2\2\2\u0161\u015e\3\2\2\2\u0162n\3\2\2\2\r\2xz\u0085\u0087"+
		"\u0139\u013b\u0143\u0148\u014d\u0161";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
// Generated from c:/Escuela/9no_semestre/lenguajes_y_automatasII_ej11-15_streamlit/Ejercicio12/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, STRING=5, INT=6, SYSTEM=7, IF=8, 
		NUM=9, IDF=10, TEXTO=11, PAR1=12, PAR2=13, LLAVE1=14, LLAVE2=15, CORCHETE1=16, 
		CORCHETE2=17, IGUAL=18, MAS=19, MAYORIGUAL=20, MENORIGUAL=21, PUNTOCOMA=22, 
		PUNTO=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "CLASS", "STATIC", "VOID", "STRING", "INT", "SYSTEM", "IF", 
			"NUM", "IDF", "TEXTO", "PAR1", "PAR2", "LLAVE1", "LLAVE2", "CORCHETE1", 
			"CORCHETE2", "IGUAL", "MAS", "MAYORIGUAL", "MENORIGUAL", "PUNTOCOMA", 
			"PUNTO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'String'", "'int'", 
			"'System'", "'if'", null, null, null, "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'='", "'+'", "'>='", "'<='", "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "STRING", "INT", "SYSTEM", 
			"IF", "NUM", "IDF", "TEXTO", "PAR1", "PAR2", "LLAVE1", "LLAVE2", "CORCHETE1", 
			"CORCHETE2", "IGUAL", "MAS", "MAYORIGUAL", "MENORIGUAL", "PUNTOCOMA", 
			"PUNTO", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\u0018\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\ba\b\b"+
		"\u000b\b\f\bb\u0001\t\u0004\tf\b\t\u000b\t\f\tg\u0001\t\u0005\tk\b\t\n"+
		"\t\f\tn\t\t\u0001\n\u0001\n\u0005\nr\b\n\n\n\f\nu\t\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0004\u0017\u0094\b\u0017\u000b\u0017\f\u0017\u0095"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0005\u0001"+
		"\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\n\n\r\r\"\"\u0003"+
		"\u0000\t\n\r\r  \u009d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000"+
		"\u0000\u00038\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007"+
		"E\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000"+
		"\u0000\u0000\rU\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000"+
		"\u0011`\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000\u0015o"+
		"\u0001\u0000\u0000\u0000\u0017x\u0001\u0000\u0000\u0000\u0019z\u0001\u0000"+
		"\u0000\u0000\u001b|\u0001\u0000\u0000\u0000\u001d~\u0001\u0000\u0000\u0000"+
		"\u001f\u0080\u0001\u0000\u0000\u0000!\u0082\u0001\u0000\u0000\u0000#\u0084"+
		"\u0001\u0000\u0000\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001"+
		"\u0000\u0000\u0000)\u008b\u0001\u0000\u0000\u0000+\u008e\u0001\u0000\u0000"+
		"\u0000-\u0090\u0001\u0000\u0000\u0000/\u0093\u0001\u0000\u0000\u00001"+
		"2\u0005p\u0000\u000023\u0005u\u0000\u000034\u0005b\u0000\u000045\u0005"+
		"l\u0000\u000056\u0005i\u0000\u000067\u0005c\u0000\u00007\u0002\u0001\u0000"+
		"\u0000\u000089\u0005c\u0000\u00009:\u0005l\u0000\u0000:;\u0005a\u0000"+
		"\u0000;<\u0005s\u0000\u0000<=\u0005s\u0000\u0000=\u0004\u0001\u0000\u0000"+
		"\u0000>?\u0005s\u0000\u0000?@\u0005t\u0000\u0000@A\u0005a\u0000\u0000"+
		"AB\u0005t\u0000\u0000BC\u0005i\u0000\u0000CD\u0005c\u0000\u0000D\u0006"+
		"\u0001\u0000\u0000\u0000EF\u0005v\u0000\u0000FG\u0005o\u0000\u0000GH\u0005"+
		"i\u0000\u0000HI\u0005d\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005"+
		"S\u0000\u0000KL\u0005t\u0000\u0000LM\u0005r\u0000\u0000MN\u0005i\u0000"+
		"\u0000NO\u0005n\u0000\u0000OP\u0005g\u0000\u0000P\n\u0001\u0000\u0000"+
		"\u0000QR\u0005i\u0000\u0000RS\u0005n\u0000\u0000ST\u0005t\u0000\u0000"+
		"T\f\u0001\u0000\u0000\u0000UV\u0005S\u0000\u0000VW\u0005y\u0000\u0000"+
		"WX\u0005s\u0000\u0000XY\u0005t\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005"+
		"m\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005"+
		"f\u0000\u0000^\u0010\u0001\u0000\u0000\u0000_a\u0007\u0000\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u0012\u0001\u0000\u0000\u0000df\u0007"+
		"\u0001\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hl\u0001\u0000\u0000"+
		"\u0000ik\u0007\u0002\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0014"+
		"\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000os\u0005\"\u0000\u0000"+
		"pr\b\u0003\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vw\u0005\"\u0000\u0000w\u0016\u0001\u0000"+
		"\u0000\u0000xy\u0005(\u0000\u0000y\u0018\u0001\u0000\u0000\u0000z{\u0005"+
		")\u0000\u0000{\u001a\u0001\u0000\u0000\u0000|}\u0005{\u0000\u0000}\u001c"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005}\u0000\u0000\u007f\u001e\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005[\u0000\u0000\u0081 \u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005]\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005=\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"+\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005>\u0000"+
		"\u0000\u0089\u008a\u0005=\u0000\u0000\u008a(\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005<\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d*\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005;\u0000\u0000\u008f,\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005.\u0000\u0000\u0091.\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0007\u0004\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0006\u0017\u0000\u0000\u00980\u0001\u0000\u0000\u0000\u0006\u0000"+
		"bgls\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
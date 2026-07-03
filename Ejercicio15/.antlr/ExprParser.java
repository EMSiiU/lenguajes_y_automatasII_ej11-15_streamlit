// Generated from c:/Escuela/9no_semestre/lenguajes_y_automatasII_ej11-15_streamlit/Ejercicio15/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUDO=1, NMAP=2, SS=3, TCPDUMP=4, CURL=5, DIG=6, JOURNALCTL=7, GREP=8, 
		UFW=9, MX=10, DENY=11, FROM=12, TODAY=13, OPCION_LARGA=14, OPCION_CORTA=15, 
		IP_CIDR=16, IP=17, DOMINIO=18, RUTA=19, TEXTO=20, NUM=21, IDF=22, NL=23, 
		WS=24;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_instruccion = 2, RULE_comando = 3, 
		RULE_argumento = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "instruccion", "comando", "argumento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sudo'", "'nmap'", "'ss'", "'tcpdump'", "'curl'", "'dig'", "'journalctl'", 
			"'grep'", "'ufw'", "'MX'", "'deny'", "'from'", "'today'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUDO", "NMAP", "SS", "TCPDUMP", "CURL", "DIG", "JOURNALCTL", "GREP", 
			"UFW", "MX", "DENY", "FROM", "TODAY", "OPCION_LARGA", "OPCION_CORTA", 
			"IP_CIDR", "IP", "DOMINIO", "RUTA", "TEXTO", "NUM", "IDF", "NL", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				{
				setState(10);
				expr();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ExprParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ExprParser.NL, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			instruccion();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(19);
				match(NL);
				}
				}
				setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode SUDO() { return getToken(ExprParser.SUDO, 0); }
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUDO) {
				{
				setState(25);
				match(SUDO);
				}
			}

			setState(28);
			comando();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8387584L) != 0)) {
				{
				{
				setState(29);
				argumento();
				}
				}
				setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode NMAP() { return getToken(ExprParser.NMAP, 0); }
		public TerminalNode SS() { return getToken(ExprParser.SS, 0); }
		public TerminalNode TCPDUMP() { return getToken(ExprParser.TCPDUMP, 0); }
		public TerminalNode CURL() { return getToken(ExprParser.CURL, 0); }
		public TerminalNode DIG() { return getToken(ExprParser.DIG, 0); }
		public TerminalNode JOURNALCTL() { return getToken(ExprParser.JOURNALCTL, 0); }
		public TerminalNode GREP() { return getToken(ExprParser.GREP, 0); }
		public TerminalNode UFW() { return getToken(ExprParser.UFW, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1020L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode OPCION_LARGA() { return getToken(ExprParser.OPCION_LARGA, 0); }
		public TerminalNode OPCION_CORTA() { return getToken(ExprParser.OPCION_CORTA, 0); }
		public TerminalNode IP_CIDR() { return getToken(ExprParser.IP_CIDR, 0); }
		public TerminalNode IP() { return getToken(ExprParser.IP, 0); }
		public TerminalNode DOMINIO() { return getToken(ExprParser.DOMINIO, 0); }
		public TerminalNode RUTA() { return getToken(ExprParser.RUTA, 0); }
		public TerminalNode TEXTO() { return getToken(ExprParser.TEXTO, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode MX() { return getToken(ExprParser.MX, 0); }
		public TerminalNode DENY() { return getToken(ExprParser.DENY, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public TerminalNode TODAY() { return getToken(ExprParser.TODAY, 0); }
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8387584L) != 0)) ) {
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
		"\u0004\u0001\u0018(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001\n\u0001"+
		"\f\u0001\u0018\t\u0001\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\u0002\t\u0001\u0000"+
		"\n\u0016&\u0000\r\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000"+
		"\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000"+
		"\b%\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001"+
		"\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0016\u0003\u0004\u0002\u0000"+
		"\u0013\u0015\u0005\u0017\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000"+
		"\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001b\u0005\u0001\u0000\u0000"+
		"\u001a\u0019\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c \u0003\u0006\u0003\u0000\u001d"+
		"\u001f\u0003\b\u0004\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\""+
		"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#$\u0007\u0000\u0000\u0000$\u0007\u0001\u0000\u0000\u0000%&\u0007\u0001"+
		"\u0000\u0000&\t\u0001\u0000\u0000\u0000\u0004\r\u0016\u001a ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
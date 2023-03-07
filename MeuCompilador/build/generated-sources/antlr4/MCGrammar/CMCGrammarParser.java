
package MCGrammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMCGrammarParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_includes = 1, RULE_globals = 2, RULE_vars = 3, RULE_functions = 4, 
		RULE_function = 5, RULE_main = 6, RULE_block = 7, RULE_line = 8, RULE_attribution = 9, 
		RULE_input = 10, RULE_output = 11, RULE_outputType = 12, RULE_ifstmt = 13, 
		RULE_whilestmt = 14, RULE_forstmt = 15, RULE_callfunction = 16, RULE_retrn = 17, 
		RULE_type = 18, RULE_assignOP = 19, RULE_expr = 20, RULE_term = 21, RULE_factor = 22, 
		RULE_boolExpr = 23, RULE_incr = 24;
	public static final String[] ruleNames = {
		"prog", "includes", "globals", "vars", "functions", "function", "main", 
		"block", "line", "attribution", "input", "output", "outputType", "ifstmt", 
		"whilestmt", "forstmt", "callfunction", "retrn", "type", "assignOP", "expr", 
		"term", "factor", "boolExpr", "incr"
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
	public String getGrammarFileName() { return "CMCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMCGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(50);
				includes();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOB) {
				{
				setState(53);
				globals();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(56);
				functions();
				}
			}

			setState(59);
			main();
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

	public static class IncludesContext extends ParserRuleContext {
		public List<TerminalNode> INCLUDE() { return getTokens(CMCGrammarParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(CMCGrammarParser.INCLUDE, i);
		}
		public List<TerminalNode> STR() { return getTokens(CMCGrammarParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(CMCGrammarParser.STR, i);
		}
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIncludes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(INCLUDE);
				setState(62);
				match(STR);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
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

	public static class GlobalsContext extends ParserRuleContext {
		public TerminalNode GLOB() { return getToken(CMCGrammarParser.GLOB, 0); }
		public TerminalNode OP() { return getToken(CMCGrammarParser.OP, 0); }
		public TerminalNode CL() { return getToken(CMCGrammarParser.CL, 0); }
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitGlobals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitGlobals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(GLOB);
			setState(68);
			match(OP);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				vars();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			setState(74);
			match(CL);
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

	public static class VarsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CMCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMCGrammarParser.ID, i);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public List<TerminalNode> SEP() { return getTokens(CMCGrammarParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CMCGrammarParser.SEP, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(77);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(78);
				match(SEP);
				setState(79);
				match(ID);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(EOL);
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				function();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CMCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMCGrammarParser.ID, i);
		}
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(CMCGrammarParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CMCGrammarParser.SEP, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			type();
			setState(93);
			match(ID);
			setState(94);
			match(OPP);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						type();
						setState(96);
						match(ID);
						setState(97);
						match(SEP);
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(104);
				type();
				setState(105);
				match(ID);
				}
			}

			setState(109);
			match(CLP);
			setState(110);
			block();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CMCGrammarParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(MAIN);
			setState(113);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(CMCGrammarParser.OP, 0); }
		public TerminalNode CL() { return getToken(CMCGrammarParser.CL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(OP);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				line();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WRITE) | (1L << READ) | (1L << RET) | (1L << OPP) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << STR))) != 0) );
			setState(121);
			match(CL);
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprLineContext extends LineContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public ExprLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLineContext extends LineContext {
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public WhileLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterWhileLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitWhileLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitWhileLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrLineContext extends LineContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public AttrLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAttrLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAttrLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAttrLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputLineContext extends LineContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public InputLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterInputLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitInputLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitInputLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnLineContext extends LineContext {
		public RetrnContext retrn() {
			return getRuleContext(RetrnContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public ReturnLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterReturnLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitReturnLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitReturnLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncLineContext extends LineContext {
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public FuncLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFuncLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFuncLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFuncLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclartContext extends LineContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarDeclartContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterVarDeclart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitVarDeclart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitVarDeclart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputLineContext extends LineContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public OutputLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterOutputLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitOutputLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitOutputLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLineContext extends LineContext {
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public ForLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterForLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitForLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitForLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfLineContext extends LineContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public IfLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIfLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIfLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIfLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_line);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new VarDeclartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				vars();
				}
				break;
			case 2:
				_localctx = new AttrLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				attribution();
				setState(125);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new InputLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				input();
				setState(128);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new OutputLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				output();
				setState(131);
				match(EOL);
				}
				break;
			case 5:
				_localctx = new ExprLineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				expr();
				setState(134);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new IfLineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				ifstmt();
				}
				break;
			case 7:
				_localctx = new WhileLineContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				whilestmt();
				}
				break;
			case 8:
				_localctx = new ForLineContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				forstmt();
				}
				break;
			case 9:
				_localctx = new ReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
				retrn();
				setState(140);
				match(EOL);
				}
				break;
			case 10:
				_localctx = new FuncLineContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				callfunction();
				setState(143);
				match(EOL);
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

	public static class AttributionContext extends ParserRuleContext {
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
	 
		public AttributionContext() { }
		public void copyFrom(AttributionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrStrContext extends AttributionContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode AT() { return getToken(CMCGrammarParser.AT, 0); }
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public AttrStrContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAttrStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAttrStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAttrStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrExprContext extends AttributionContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode AT() { return getToken(CMCGrammarParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrExprContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAttrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAttrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAttrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribution);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AttrExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(ID);
				setState(148);
				match(AT);
				setState(149);
				expr();
				}
				break;
			case 2:
				_localctx = new AttrStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(ID);
				setState(151);
				match(AT);
				setState(152);
				match(STR);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMCGrammarParser.READ, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(READ);
			setState(156);
			match(OPP);
			setState(157);
			match(ID);
			setState(158);
			match(CLP);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CMCGrammarParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public OutputTypeContext outputType() {
			return getRuleContext(OutputTypeContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(WRITE);
			setState(161);
			match(OPP);
			setState(162);
			outputType();
			setState(163);
			match(CLP);
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

	public static class OutputTypeContext extends ParserRuleContext {
		public OutputTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputType; }
	 
		public OutputTypeContext() { }
		public void copyFrom(OutputTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIDContext extends OutputTypeContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public PrintIDContext(OutputTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterPrintID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitPrintID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitPrintID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintSTRContext extends OutputTypeContext {
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public PrintSTRContext(OutputTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterPrintSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitPrintSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitPrintSTR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends OutputTypeContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(OutputTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputTypeContext outputType() throws RecognitionException {
		OutputTypeContext _localctx = new OutputTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_outputType);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new PrintSTRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(STR);
				}
				break;
			case 2:
				_localctx = new PrintIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(ID);
				}
				break;
			case 3:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				expr();
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

	public static class IfstmtContext extends ParserRuleContext {
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	 
		public IfstmtContext() { }
		public void copyFrom(IfstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IffStmtContext extends IfstmtContext {
		public TerminalNode IF() { return getToken(CMCGrammarParser.IF, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IffStmtContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIffStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIffStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIffStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtElseContext extends IfstmtContext {
		public TerminalNode IF() { return getToken(CMCGrammarParser.IF, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CMCGrammarParser.ELSE, 0); }
		public IfStmtElseContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIfStmtElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIfStmtElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIfStmtElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstmt);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IffStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(IF);
				setState(171);
				match(OPP);
				setState(172);
				boolExpr();
				setState(173);
				match(CLP);
				setState(174);
				block();
				}
				break;
			case 2:
				_localctx = new IfStmtElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(IF);
				setState(177);
				match(OPP);
				setState(178);
				boolExpr();
				setState(179);
				match(CLP);
				setState(180);
				block();
				setState(181);
				match(ELSE);
				setState(182);
				block();
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

	public static class WhilestmtContext extends ParserRuleContext {
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	 
		public WhilestmtContext() { }
		public void copyFrom(WhilestmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileeStmtContext extends WhilestmtContext {
		public TerminalNode WHILE() { return getToken(CMCGrammarParser.WHILE, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileeStmtContext(WhilestmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterWhileeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitWhileeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitWhileeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whilestmt);
		try {
			_localctx = new WhileeStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			match(OPP);
			setState(188);
			boolExpr();
			setState(189);
			match(CLP);
			setState(190);
			block();
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

	public static class ForstmtContext extends ParserRuleContext {
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	 
		public ForstmtContext() { }
		public void copyFrom(ForstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForrStmtContext extends ForstmtContext {
		public TerminalNode FOR() { return getToken(CMCGrammarParser.FOR, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(CMCGrammarParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(CMCGrammarParser.EOL, i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public IncrContext incr() {
			return getRuleContext(IncrContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForrStmtContext(ForstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterForrStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitForrStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitForrStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forstmt);
		try {
			_localctx = new ForrStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(FOR);
			setState(193);
			match(OPP);
			setState(194);
			attribution();
			setState(195);
			match(EOL);
			setState(196);
			boolExpr();
			setState(197);
			match(EOL);
			setState(198);
			match(ID);
			setState(199);
			incr();
			setState(200);
			match(NUM);
			setState(201);
			match(CLP);
			setState(202);
			block();
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

	public static class CallfunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CMCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMCGrammarParser.ID, i);
		}
		public TerminalNode CALL() { return getToken(CMCGrammarParser.CALL, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public List<TerminalNode> SEP() { return getTokens(CMCGrammarParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CMCGrammarParser.SEP, i);
		}
		public List<TerminalNode> NUM() { return getTokens(CMCGrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(CMCGrammarParser.NUM, i);
		}
		public CallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfunctionContext callfunction() throws RecognitionException {
		CallfunctionContext _localctx = new CallfunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callfunction);
		try {
			int _alt;
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				setState(205);
				match(CALL);
				setState(206);
				match(ID);
				setState(207);
				match(OPP);
				{
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(208);
						match(ID);
						setState(209);
						match(SEP);
						}
						} 
					}
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(215);
				match(ID);
				}
				setState(217);
				match(CLP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(ID);
				setState(219);
				match(CALL);
				setState(220);
				match(ID);
				setState(221);
				match(OPP);
				{
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						match(NUM);
						setState(223);
						match(SEP);
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(229);
				match(NUM);
				}
				setState(231);
				match(CLP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(ID);
				setState(233);
				match(OPP);
				setState(234);
				match(CLP);
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

	public static class RetrnContext extends ParserRuleContext {
		public RetrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrn; }
	 
		public RetrnContext() { }
		public void copyFrom(RetrnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnValContext extends RetrnContext {
		public TerminalNode RET() { return getToken(CMCGrammarParser.RET, 0); }
		public ReturnValContext(RetrnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterReturnVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitReturnVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitReturnVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrnContext retrn() throws RecognitionException {
		RetrnContext _localctx = new RetrnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retrn);
		try {
			_localctx = new ReturnValContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(RET);
			setState(238);
			match(T__0);
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
		public TerminalNode INT() { return getToken(CMCGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CMCGrammarParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CMCGrammarParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(CMCGrammarParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static class AssignOPContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CMCGrammarParser.EQ, 0); }
		public TerminalNode NEG() { return getToken(CMCGrammarParser.NEG, 0); }
		public TerminalNode LESS() { return getToken(CMCGrammarParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(CMCGrammarParser.LESSEQ, 0); }
		public TerminalNode GREATER() { return getToken(CMCGrammarParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(CMCGrammarParser.GREATEREQ, 0); }
		public AssignOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAssignOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAssignOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAssignOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOPContext assignOP() throws RecognitionException {
		AssignOPContext _localctx = new AssignOPContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEG) | (1L << EQ) | (1L << LESS) | (1L << LESSEQ) | (1L << GREATER) | (1L << GREATEREQ))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CMCGrammarParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinumContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUM() { return getToken(CMCGrammarParser.MINUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprMinum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprMinum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprMinum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				term(0);
				setState(245);
				match(PLUS);
				setState(246);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				term(0);
				setState(249);
				match(MINUM);
				setState(250);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				term(0);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermDivContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CMCGrammarParser.DIV, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTermDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTermDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTermDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermModContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MOD() { return getToken(CMCGrammarParser.MOD, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermModContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTermMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTermMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTermMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTermFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTermFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTermFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermMultContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CMCGrammarParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTermMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTermMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTermMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(256);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TermMultContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(258);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(259);
						match(MULT);
						setState(260);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermDivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
						match(DIV);
						setState(263);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermModContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(264);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(265);
						match(MOD);
						setState(266);
						factor();
						}
						break;
					}
					} 
				}
				setState(271);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorIdContext extends FactorContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public FactorIdContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactorId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorStrContext extends FactorContext {
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public FactorStrContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactorStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactorStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactorStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactorNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactorNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactorNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParntContext extends FactorContext {
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public ExprParntContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprParnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprParnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprParnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPP:
				_localctx = new ExprParntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(OPP);
				setState(273);
				expr();
				setState(274);
				match(CLP);
				}
				break;
			case ID:
				_localctx = new FactorIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(NUM);
				}
				break;
			case STR:
				_localctx = new FactorStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(STR);
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

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseValueContext extends BoolExprContext {
		public TerminalNode FALSE() { return getToken(CMCGrammarParser.FALSE, 0); }
		public FalseValueContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFalseValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFalseValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFalseValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueValueContext extends BoolExprContext {
		public TerminalNode TRUE() { return getToken(CMCGrammarParser.TRUE, 0); }
		public TrueValueContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTrueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTrueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTrueValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpresContext extends BoolExprContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public AssignOPContext assignOP() {
			return getRuleContext(AssignOPContext.class,0);
		}
		public BoolExpresContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterBoolExpres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitBoolExpres(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitBoolExpres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolExpr);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(FALSE);
				}
				break;
			case OPP:
			case ID:
			case NUM:
			case STR:
				_localctx = new BoolExpresContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				factor();
				setState(284);
				assignOP();
				setState(285);
				factor();
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

	public static class IncrContext extends ParserRuleContext {
		public TerminalNode PEG() { return getToken(CMCGrammarParser.PEG, 0); }
		public TerminalNode MEG() { return getToken(CMCGrammarParser.MEG, 0); }
		public IncrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIncr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIncr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIncr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrContext incr() throws RecognitionException {
		IncrContext _localctx = new IncrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_incr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==PEG || _la==MEG) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0126\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\5\29\n\2\3\2\5\2<\n\2\3\2\3\2\3\3\3\3\6"+
		"\3B\n\3\r\3\16\3C\3\4\3\4\3\4\6\4I\n\4\r\4\16\4J\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\7\5S\n\5\f\5\16\5V\13\5\3\5\3\5\3\6\6\6[\n\6\r\6\16\6\\\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\6\tx\n\t\r\t\16\ty\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ab\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bb"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d5\n\22"+
		"\f\22\16\22\u00d8\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u00e3\n\22\f\22\16\22\u00e6\13\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00ee\n\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0100\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u010e\n\27\f\27\16\27\u0111\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011a\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0122\n\31\3\32\3\32\3\32\2\3,\33\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\2\5\3\2*-\4\2\32\33\36!\3\2\34\35\u0131"+
		"\2\65\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nZ\3\2\2\2\f^\3\2\2\2\16"+
		"r\3\2\2\2\20u\3\2\2\2\22\u0093\3\2\2\2\24\u009b\3\2\2\2\26\u009d\3\2\2"+
		"\2\30\u00a2\3\2\2\2\32\u00aa\3\2\2\2\34\u00ba\3\2\2\2\36\u00bc\3\2\2\2"+
		" \u00c2\3\2\2\2\"\u00ed\3\2\2\2$\u00ef\3\2\2\2&\u00f2\3\2\2\2(\u00f4\3"+
		"\2\2\2*\u00ff\3\2\2\2,\u0101\3\2\2\2.\u0119\3\2\2\2\60\u0121\3\2\2\2\62"+
		"\u0123\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		"9\5\6\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\n\6\2;:\3\2\2\2;<\3\2\2"+
		"\2<=\3\2\2\2=>\5\16\b\2>\3\3\2\2\2?@\7\4\2\2@B\7\60\2\2A?\3\2\2\2BC\3"+
		"\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EF\7\5\2\2FH\7\22\2\2GI\5\b\5\2H"+
		"G\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\23\2\2M\7\3\2\2"+
		"\2NO\5&\24\2OT\7.\2\2PQ\7\24\2\2QS\7.\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\27\2\2X\t\3\2\2\2Y[\5\f\7\2ZY\3\2"+
		"\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^_\5&\24\2_`\7.\2\2`"+
		"m\7\25\2\2ab\5&\24\2bc\7.\2\2cd\7\24\2\2df\3\2\2\2ea\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5&\24\2kl\7.\2\2ln\3\2\2\2"+
		"mg\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\26\2\2pq\5\20\t\2q\r\3\2\2\2rs\7\6"+
		"\2\2st\5\20\t\2t\17\3\2\2\2uw\7\22\2\2vx\5\22\n\2wv\3\2\2\2xy\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\23\2\2|\21\3\2\2\2}\u0094\5\b\5\2~"+
		"\177\5\24\13\2\177\u0080\7\27\2\2\u0080\u0094\3\2\2\2\u0081\u0082\5\26"+
		"\f\2\u0082\u0083\7\27\2\2\u0083\u0094\3\2\2\2\u0084\u0085\5\30\r\2\u0085"+
		"\u0086\7\27\2\2\u0086\u0094\3\2\2\2\u0087\u0088\5*\26\2\u0088\u0089\7"+
		"\27\2\2\u0089\u0094\3\2\2\2\u008a\u0094\5\34\17\2\u008b\u0094\5\36\20"+
		"\2\u008c\u0094\5 \21\2\u008d\u008e\5$\23\2\u008e\u008f\7\27\2\2\u008f"+
		"\u0094\3\2\2\2\u0090\u0091\5\"\22\2\u0091\u0092\7\27\2\2\u0092\u0094\3"+
		"\2\2\2\u0093}\3\2\2\2\u0093~\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0084\3"+
		"\2\2\2\u0093\u0087\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093"+
		"\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\23\3\2\2"+
		"\2\u0095\u0096\7.\2\2\u0096\u0097\7\30\2\2\u0097\u009c\5*\26\2\u0098\u0099"+
		"\7.\2\2\u0099\u009a\7\30\2\2\u009a\u009c\7\60\2\2\u009b\u0095\3\2\2\2"+
		"\u009b\u0098\3\2\2\2\u009c\25\3\2\2\2\u009d\u009e\7\20\2\2\u009e\u009f"+
		"\7\25\2\2\u009f\u00a0\7.\2\2\u00a0\u00a1\7\26\2\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a3\7\17\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6"+
		"\7\26\2\2\u00a6\31\3\2\2\2\u00a7\u00ab\7\60\2\2\u00a8\u00ab\7.\2\2\u00a9"+
		"\u00ab\5*\26\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\7\25\2\2\u00ae"+
		"\u00af\5\60\31\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00bb"+
		"\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\5\60\31"+
		"\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\7\f\2\2\u00b8"+
		"\u00b9\5\20\t\2\u00b9\u00bb\3\2\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00b2\3"+
		"\2\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\7\25\2\2\u00be"+
		"\u00bf\5\60\31\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\5\20\t\2\u00c1\37\3"+
		"\2\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\7\25\2\2\u00c4\u00c5\5\24\13\2"+
		"\u00c5\u00c6\7\27\2\2\u00c6\u00c7\5\60\31\2\u00c7\u00c8\7\27\2\2\u00c8"+
		"\u00c9\7.\2\2\u00c9\u00ca\5\62\32\2\u00ca\u00cb\7/\2\2\u00cb\u00cc\7\26"+
		"\2\2\u00cc\u00cd\5\20\t\2\u00cd!\3\2\2\2\u00ce\u00cf\7.\2\2\u00cf\u00d0"+
		"\7\"\2\2\u00d0\u00d1\7.\2\2\u00d1\u00d6\7\25\2\2\u00d2\u00d3\7.\2\2\u00d3"+
		"\u00d5\7\24\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\7.\2\2\u00da\u00db\3\2\2\2\u00db\u00ee\7\26\2\2\u00dc\u00dd\7."+
		"\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7.\2\2\u00df\u00e4\7\25\2\2\u00e0"+
		"\u00e1\7/\2\2\u00e1\u00e3\7\24\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ee\7\26"+
		"\2\2\u00ea\u00eb\7.\2\2\u00eb\u00ec\7\25\2\2\u00ec\u00ee\7\26\2\2\u00ed"+
		"\u00ce\3\2\2\2\u00ed\u00dc\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee#\3\2\2\2"+
		"\u00ef\u00f0\7\21\2\2\u00f0\u00f1\7\3\2\2\u00f1%\3\2\2\2\u00f2\u00f3\t"+
		"\2\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\t\3\2\2\u00f5)\3\2\2\2\u00f6\u00f7"+
		"\5,\27\2\u00f7\u00f8\7%\2\2\u00f8\u00f9\5*\26\2\u00f9\u0100\3\2\2\2\u00fa"+
		"\u00fb\5,\27\2\u00fb\u00fc\7&\2\2\u00fc\u00fd\5*\26\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u0100\5,\27\2\u00ff\u00f6\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100+\3\2\2\2\u0101\u0102\b\27\1\2\u0102\u0103\5.\30\2"+
		"\u0103\u010f\3\2\2\2\u0104\u0105\f\6\2\2\u0105\u0106\7\'\2\2\u0106\u010e"+
		"\5.\30\2\u0107\u0108\f\5\2\2\u0108\u0109\7(\2\2\u0109\u010e\5.\30\2\u010a"+
		"\u010b\f\4\2\2\u010b\u010c\7)\2\2\u010c\u010e\5.\30\2\u010d\u0104\3\2"+
		"\2\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110-\3\2\2\2\u0111\u010f\3\2\2\2"+
		"\u0112\u0113\7\25\2\2\u0113\u0114\5*\26\2\u0114\u0115\7\26\2\2\u0115\u011a"+
		"\3\2\2\2\u0116\u011a\7.\2\2\u0117\u011a\7/\2\2\u0118\u011a\7\60\2\2\u0119"+
		"\u0112\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a/\3\2\2\2\u011b\u0122\7#\2\2\u011c\u0122\7$\2\2\u011d\u011e"+
		"\5.\30\2\u011e\u011f\5(\25\2\u011f\u0120\5.\30\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0122\61\3\2\2"+
		"\2\u0123\u0124\t\4\2\2\u0124\63\3\2\2\2\30\658;CJT\\gmy\u0093\u009b\u00aa"+
		"\u00ba\u00d6\u00e4\u00ed\u00ff\u010d\u010f\u0119\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
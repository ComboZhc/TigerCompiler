// Generated from Tiger.g4 by ANTLR 4.0
package Antlr.Tiger;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "STRING", "':='", "','", "';'", "':'", "'.'", 
		"'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'&'", "'|'", "'+'", "'-'", 
		"'*'", "'/'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'nil'", "'new'", 
		"'if'", "'then'", "'else'", "'while'", "'do'", "'for'", "'to'", "'break'", 
		"'let'", "'in'", "'end'", "'class'", "'extends'", "'var'", "'type'", "'method'", 
		"'function'", "'array'", "'of'", "'primitive'", "'import'", "ID", "INT", 
		"WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_exprList = 1, RULE_exprs = 2, RULE_expr = 3, RULE_arrayInitializer = 4, 
		RULE_typeInitializer = 5, RULE_negateExpr = 6, RULE_newExpr = 7, RULE_sequenceExpr = 8, 
		RULE_assignExpr = 9, RULE_valueExpr = 10, RULE_funcExpr = 11, RULE_methodExpr = 12, 
		RULE_ifExpr = 13, RULE_whileExpr = 14, RULE_forExpr = 15, RULE_forID = 16, 
		RULE_breakExpr = 17, RULE_letExpr = 18, RULE_initFields = 19, RULE_initField = 20, 
		RULE_lvalue = 21, RULE_decs = 22, RULE_dec = 23, RULE_varDec = 24, RULE_typeDec = 25, 
		RULE_classDec = 26, RULE_funcDec = 27, RULE_methodDec = 28, RULE_primitiveDec = 29, 
		RULE_importDec = 30, RULE_type = 31, RULE_arrayType = 32, RULE_recordType = 33, 
		RULE_typeFields = 34, RULE_typeField = 35, RULE_typeID = 36, RULE_classFields = 37, 
		RULE_classField = 38;
	public static final String[] ruleNames = {
		"program", "exprList", "exprs", "expr", "arrayInitializer", "typeInitializer", 
		"negateExpr", "newExpr", "sequenceExpr", "assignExpr", "valueExpr", "funcExpr", 
		"methodExpr", "ifExpr", "whileExpr", "forExpr", "forID", "breakExpr", 
		"letExpr", "initFields", "initField", "lvalue", "decs", "dec", "varDec", 
		"typeDec", "classDec", "funcDec", "methodDec", "primitiveDec", "importDec", 
		"type", "arrayType", "recordType", "typeFields", "typeField", "typeID", 
		"classFields", "classField"
	};

	@Override
	public String getGrammarFileName() { return "Tiger.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TigerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DecsContext decs() {
			return getRuleContext(DecsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case STRING:
			case MINUS:
			case LPAR:
			case NIL:
			case NEW:
			case IF:
			case WHILE:
			case FOR:
			case BREAK:
			case LET:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); expr(0);
				}
				break;
			case EOF:
			case CLASS:
			case VAR:
			case TYPE:
			case FUNCTION:
			case PRIMITIVE:
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); decs();
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

	public static class ExprListContext extends ParserRuleContext {
		public TerminalNode COMMA(int i) {
			return getToken(TigerParser.COMMA, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TigerParser.COMMA); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << MINUS) | (1L << LPAR) | (1L << NIL) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << LET) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(82); expr(0);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83); match(COMMA);
					setState(84); expr(0);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ExprsContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TigerParser.SEMI); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(TigerParser.SEMI, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << MINUS) | (1L << LPAR) | (1L << NIL) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << LET) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(92); expr(0);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(93); match(SEMI);
					setState(94); expr(0);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public TerminalNode GE() { return getToken(TigerParser.GE, 0); }
		public TerminalNode LT() { return getToken(TigerParser.LT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public FuncExprContext funcExpr() {
			return getRuleContext(FuncExprContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public SequenceExprContext sequenceExpr() {
			return getRuleContext(SequenceExprContext.class,0);
		}
		public BreakExprContext breakExpr() {
			return getRuleContext(BreakExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(TigerParser.INT, 0); }
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TigerParser.MINUS, 0); }
		public TerminalNode AND() { return getToken(TigerParser.AND, 0); }
		public NegateExprContext negateExpr() {
			return getRuleContext(NegateExprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(TigerParser.MUL, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public TerminalNode NEQ() { return getToken(TigerParser.NEQ, 0); }
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public TerminalNode NIL() { return getToken(TigerParser.NIL, 0); }
		public TerminalNode OR() { return getToken(TigerParser.OR, 0); }
		public TerminalNode GT() { return getToken(TigerParser.GT, 0); }
		public TerminalNode PLUS() { return getToken(TigerParser.PLUS, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public TerminalNode DIV() { return getToken(TigerParser.DIV, 0); }
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TypeInitializerContext typeInitializer() {
			return getRuleContext(TypeInitializerContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public TerminalNode LE() { return getToken(TigerParser.LE, 0); }
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TigerParser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(103); match(NIL);
				}
				break;

			case 2:
				{
				setState(104); match(INT);
				}
				break;

			case 3:
				{
				setState(105); match(STRING);
				}
				break;

			case 4:
				{
				setState(106); arrayInitializer();
				}
				break;

			case 5:
				{
				setState(107); typeInitializer();
				}
				break;

			case 6:
				{
				setState(108); negateExpr();
				}
				break;

			case 7:
				{
				setState(109); newExpr();
				}
				break;

			case 8:
				{
				setState(110); sequenceExpr();
				}
				break;

			case 9:
				{
				setState(111); assignExpr();
				}
				break;

			case 10:
				{
				setState(112); valueExpr();
				}
				break;

			case 11:
				{
				setState(113); funcExpr();
				}
				break;

			case 12:
				{
				setState(114); methodExpr();
				}
				break;

			case 13:
				{
				setState(115); ifExpr();
				}
				break;

			case 14:
				{
				setState(116); whileExpr();
				}
				break;

			case 15:
				{
				setState(117); forExpr();
				}
				break;

			case 16:
				{
				setState(118); breakExpr();
				}
				break;

			case 17:
				{
				setState(119); letExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(124); expr(23);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(126);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(127); expr(22);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(129);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(130); expr(21);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(132); match(AND);
						setState(133); expr(20);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(135); match(OR);
						setState(136); expr(19);
						}
						break;
					}
					} 
				}
				setState(141);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LSQR() { return getToken(TigerParser.LSQR, 0); }
		public TerminalNode RSQR() { return getToken(TigerParser.RSQR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(TigerParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); typeID();
			setState(143); match(LSQR);
			setState(144); expr(0);
			setState(145); match(RSQR);
			setState(146); match(OF);
			setState(147); expr(0);
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

	public static class TypeInitializerContext extends ParserRuleContext {
		public TerminalNode RBCE() { return getToken(TigerParser.RBCE, 0); }
		public TerminalNode LBCE() { return getToken(TigerParser.LBCE, 0); }
		public InitFieldsContext initFields() {
			return getRuleContext(InitFieldsContext.class,0);
		}
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public TypeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTypeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTypeInitializer(this);
		}
	}

	public final TypeInitializerContext typeInitializer() throws RecognitionException {
		TypeInitializerContext _localctx = new TypeInitializerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); typeID();
			setState(150); match(LBCE);
			setState(151); initFields();
			setState(152); match(RBCE);
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

	public static class NegateExprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(TigerParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negateExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterNegateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitNegateExpr(this);
		}
	}

	public final NegateExprContext negateExpr() throws RecognitionException {
		NegateExprContext _localctx = new NegateExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_negateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(MINUS);
			setState(155); expr(0);
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

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(TigerParser.NEW, 0); }
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitNewExpr(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(NEW);
			setState(158); typeID();
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

	public static class SequenceExprContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public SequenceExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterSequenceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitSequenceExpr(this);
		}
	}

	public final SequenceExprContext sequenceExpr() throws RecognitionException {
		SequenceExprContext _localctx = new SequenceExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sequenceExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(LPAR);
			setState(161); exprs();
			setState(162); match(RPAR);
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

	public static class AssignExprContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TigerParser.ASSIGN, 0); }
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitAssignExpr(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); lvalue();
			setState(165); match(ASSIGN);
			setState(166); expr(0);
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

	public static class ValueExprContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitValueExpr(this);
		}
	}

	public final ValueExprContext valueExpr() throws RecognitionException {
		ValueExprContext _localctx = new ValueExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); lvalue();
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

	public static class FuncExprContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FuncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitFuncExpr(this);
		}
	}

	public final FuncExprContext funcExpr() throws RecognitionException {
		FuncExprContext _localctx = new FuncExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(ID);
			setState(171); match(LPAR);
			setState(172); exprList();
			setState(173); match(RPAR);
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

	public static class MethodExprContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public TerminalNode DOT() { return getToken(TigerParser.DOT, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitMethodExpr(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); lvalue();
			setState(176); match(DOT);
			setState(177); match(ID);
			setState(178); match(LPAR);
			setState(179); exprList();
			setState(180); match(RPAR);
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(TigerParser.THEN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ELSE() { return getToken(TigerParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(TigerParser.IF, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(IF);
			setState(183); expr(0);
			setState(184); match(THEN);
			setState(185); expr(0);
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(186); match(ELSE);
				setState(187); expr(0);
				}
				break;
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

	public static class WhileExprContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TigerParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(TigerParser.WHILE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitWhileExpr(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(WHILE);
			setState(191); expr(0);
			setState(192); match(DO);
			setState(193); expr(0);
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

	public static class ForExprContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TigerParser.DO, 0); }
		public TerminalNode FOR() { return getToken(TigerParser.FOR, 0); }
		public TerminalNode TO() { return getToken(TigerParser.TO, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ForIDContext forID() {
			return getRuleContext(ForIDContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TigerParser.ASSIGN, 0); }
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitForExpr(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(FOR);
			setState(196); forID();
			setState(197); match(ASSIGN);
			setState(198); expr(0);
			setState(199); match(TO);
			setState(200); expr(0);
			setState(201); match(DO);
			setState(202); expr(0);
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

	public static class ForIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ForIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterForID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitForID(this);
		}
	}

	public final ForIDContext forID() throws RecognitionException {
		ForIDContext _localctx = new ForIDContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(ID);
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

	public static class BreakExprContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(TigerParser.BREAK, 0); }
		public BreakExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterBreakExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitBreakExpr(this);
		}
	}

	public final BreakExprContext breakExpr() throws RecognitionException {
		BreakExprContext _localctx = new BreakExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_breakExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(BREAK);
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

	public static class LetExprContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(TigerParser.IN, 0); }
		public DecsContext decs() {
			return getRuleContext(DecsContext.class,0);
		}
		public TerminalNode END() { return getToken(TigerParser.END, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode LET() { return getToken(TigerParser.LET, 0); }
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitLetExpr(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_letExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(LET);
			setState(209); decs();
			setState(210); match(IN);
			setState(211); exprs();
			setState(212); match(END);
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

	public static class InitFieldsContext extends ParserRuleContext {
		public TerminalNode COMMA(int i) {
			return getToken(TigerParser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TigerParser.COMMA); }
		public List<InitFieldContext> initField() {
			return getRuleContexts(InitFieldContext.class);
		}
		public InitFieldContext initField(int i) {
			return getRuleContext(InitFieldContext.class,i);
		}
		public InitFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterInitFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitInitFields(this);
		}
	}

	public final InitFieldsContext initFields() throws RecognitionException {
		InitFieldsContext _localctx = new InitFieldsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(214); initField();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(215); match(COMMA);
					setState(216); initField();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class InitFieldContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterInitField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitInitField(this);
		}
	}

	public final InitFieldContext initField() throws RecognitionException {
		InitFieldContext _localctx = new InitFieldContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(ID);
			setState(225); match(EQ);
			setState(226); expr(0);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode DOT(int i) {
			return getToken(TigerParser.DOT, i);
		}
		public TerminalNode ID(int i) {
			return getToken(TigerParser.ID, i);
		}
		public TerminalNode LSQR(int i) {
			return getToken(TigerParser.LSQR, i);
		}
		public List<TerminalNode> LSQR() { return getTokens(TigerParser.LSQR); }
		public List<TerminalNode> DOT() { return getTokens(TigerParser.DOT); }
		public List<TerminalNode> RSQR() { return getTokens(TigerParser.RSQR); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TigerParser.ID); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode RSQR(int i) {
			return getToken(TigerParser.RSQR, i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lvalue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(ID);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(235);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(229); match(DOT);
						setState(230); match(ID);
						}
						}
						break;
					case LSQR:
						{
						setState(231); match(LSQR);
						setState(232); expr(0);
						setState(233); match(RSQR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class DecsContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public DecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterDecs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitDecs(this);
		}
	}

	public final DecsContext decs() throws RecognitionException {
		DecsContext _localctx = new DecsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << VAR) | (1L << TYPE) | (1L << FUNCTION) | (1L << PRIMITIVE) | (1L << IMPORT))) != 0)) {
				{
				{
				setState(240); dec();
				}
				}
				setState(245);
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

	public static class DecContext extends ParserRuleContext {
		public ClassDecContext classDec() {
			return getRuleContext(ClassDecContext.class,0);
		}
		public ImportDecContext importDec() {
			return getRuleContext(ImportDecContext.class,0);
		}
		public FuncDecContext funcDec() {
			return getRuleContext(FuncDecContext.class,0);
		}
		public PrimitiveDecContext primitiveDec() {
			return getRuleContext(PrimitiveDecContext.class,0);
		}
		public TypeDecContext typeDec() {
			return getRuleContext(TypeDecContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dec);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); typeDec();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); classDec();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(248); varDec();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(249); funcDec();
				}
				break;
			case PRIMITIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(250); primitiveDec();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(251); importDec();
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

	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TigerParser.COLON, 0); }
		public TerminalNode VAR() { return getToken(TigerParser.VAR, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TigerParser.ASSIGN, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitVarDec(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(VAR);
			setState(255); match(ID);
			setState(258);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(256); match(COLON);
				setState(257); typeID();
				}
			}

			setState(260); match(ASSIGN);
			setState(261); expr(0);
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

	public static class TypeDecContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(TigerParser.TYPE, 0); }
		public TypeDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTypeDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTypeDec(this);
		}
	}

	public final TypeDecContext typeDec() throws RecognitionException {
		TypeDecContext _localctx = new TypeDecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(TYPE);
			setState(264); match(ID);
			setState(265); match(EQ);
			setState(266); type();
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

	public static class ClassDecContext extends ParserRuleContext {
		public TerminalNode RBCE() { return getToken(TigerParser.RBCE, 0); }
		public TerminalNode ID(int i) {
			return getToken(TigerParser.ID, i);
		}
		public TerminalNode CLASS() { return getToken(TigerParser.CLASS, 0); }
		public TerminalNode LBCE() { return getToken(TigerParser.LBCE, 0); }
		public List<TerminalNode> ID() { return getTokens(TigerParser.ID); }
		public TerminalNode EXTENDS() { return getToken(TigerParser.EXTENDS, 0); }
		public ClassFieldsContext classFields() {
			return getRuleContext(ClassFieldsContext.class,0);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitClassDec(this);
		}
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(CLASS);
			setState(269); match(ID);
			setState(272);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(270); match(EXTENDS);
				setState(271); match(ID);
				}
			}

			setState(274); match(LBCE);
			setState(275); classFields();
			setState(276); match(RBCE);
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

	public static class FuncDecContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TigerParser.COLON, 0); }
		public TerminalNode FUNCTION() { return getToken(TigerParser.FUNCTION, 0); }
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeFieldsContext typeFields() {
			return getRuleContext(TypeFieldsContext.class,0);
		}
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public FuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitFuncDec(this);
		}
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(FUNCTION);
			setState(279); match(ID);
			setState(280); match(LPAR);
			setState(281); typeFields();
			setState(282); match(RPAR);
			setState(285);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(283); match(COLON);
				setState(284); typeID();
				}
			}

			setState(287); match(EQ);
			setState(288); expr(0);
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

	public static class MethodDecContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TigerParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeFieldsContext typeFields() {
			return getRuleContext(TypeFieldsContext.class,0);
		}
		public TerminalNode METHOD() { return getToken(TigerParser.METHOD, 0); }
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public MethodDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitMethodDec(this);
		}
	}

	public final MethodDecContext methodDec() throws RecognitionException {
		MethodDecContext _localctx = new MethodDecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(METHOD);
			setState(291); match(ID);
			setState(292); match(LPAR);
			setState(293); typeFields();
			setState(294); match(RPAR);
			setState(297);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(295); match(COLON);
				setState(296); typeID();
				}
			}

			setState(299); match(EQ);
			setState(300); expr(0);
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

	public static class PrimitiveDecContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TigerParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeFieldsContext typeFields() {
			return getRuleContext(TypeFieldsContext.class,0);
		}
		public TerminalNode PRIMITIVE() { return getToken(TigerParser.PRIMITIVE, 0); }
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public PrimitiveDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterPrimitiveDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitPrimitiveDec(this);
		}
	}

	public final PrimitiveDecContext primitiveDec() throws RecognitionException {
		PrimitiveDecContext _localctx = new PrimitiveDecContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primitiveDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(PRIMITIVE);
			setState(303); match(ID);
			setState(304); match(LPAR);
			setState(305); typeFields();
			setState(306); match(RPAR);
			setState(309);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(307); match(COLON);
				setState(308); typeID();
				}
			}

			setState(311); match(EQ);
			setState(312); expr(0);
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

	public static class ImportDecContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(TigerParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(TigerParser.STRING, 0); }
		public ImportDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterImportDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitImportDec(this);
		}
	}

	public final ImportDecContext importDec() throws RecognitionException {
		ImportDecContext _localctx = new ImportDecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_importDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(IMPORT);
			setState(315); match(STRING);
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
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		try {
			setState(320);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); typeID();
				}
				break;
			case LBCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); recordType();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(319); arrayType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(TigerParser.OF, 0); }
		public TerminalNode ARRAY() { return getToken(TigerParser.ARRAY, 0); }
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(ARRAY);
			setState(323); match(OF);
			setState(324); typeID();
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

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RBCE() { return getToken(TigerParser.RBCE, 0); }
		public TerminalNode LBCE() { return getToken(TigerParser.LBCE, 0); }
		public TypeFieldsContext typeFields() {
			return getRuleContext(TypeFieldsContext.class,0);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitRecordType(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(LBCE);
			setState(327); typeFields();
			setState(328); match(RBCE);
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

	public static class TypeFieldsContext extends ParserRuleContext {
		public TerminalNode COMMA(int i) {
			return getToken(TigerParser.COMMA, i);
		}
		public List<TypeFieldContext> typeField() {
			return getRuleContexts(TypeFieldContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(TigerParser.COMMA); }
		public TypeFieldContext typeField(int i) {
			return getRuleContext(TypeFieldContext.class,i);
		}
		public TypeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTypeFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTypeFields(this);
		}
	}

	public final TypeFieldsContext typeFields() throws RecognitionException {
		TypeFieldsContext _localctx = new TypeFieldsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(330); typeField();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(331); match(COMMA);
					setState(332); typeField();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class TypeFieldContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TigerParser.COLON, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public TypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTypeField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTypeField(this);
		}
	}

	public final TypeFieldContext typeField() throws RecognitionException {
		TypeFieldContext _localctx = new TypeFieldContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(ID);
			setState(341); match(COLON);
			setState(342); typeID();
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

	public static class TypeIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public TypeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTypeID(this);
		}
	}

	public final TypeIDContext typeID() throws RecognitionException {
		TypeIDContext _localctx = new TypeIDContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(ID);
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

	public static class ClassFieldsContext extends ParserRuleContext {
		public List<ClassFieldContext> classField() {
			return getRuleContexts(ClassFieldContext.class);
		}
		public ClassFieldContext classField(int i) {
			return getRuleContext(ClassFieldContext.class,i);
		}
		public ClassFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterClassFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitClassFields(this);
		}
	}

	public final ClassFieldsContext classFields() throws RecognitionException {
		ClassFieldsContext _localctx = new ClassFieldsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==METHOD) {
				{
				{
				setState(346); classField();
				}
				}
				setState(351);
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

	public static class ClassFieldContext extends ParserRuleContext {
		public MethodDecContext methodDec() {
			return getRuleContext(MethodDecContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ClassFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterClassField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitClassField(this);
		}
	}

	public final ClassFieldContext classField() throws RecognitionException {
		ClassFieldContext _localctx = new ClassFieldContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classField);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(352); varDec();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); methodDec();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 22 >= _localctx._p;

		case 1: return 21 >= _localctx._p;

		case 2: return 20 >= _localctx._p;

		case 3: return 19 >= _localctx._p;

		case 4: return 18 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\65\u0167\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\3\2\3\2\5\2S\n\2\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\5\3]\n\3\3\4\3"+
		"\4\3\4\7\4b\n\4\f\4\16\4e\13\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00bf\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u00dc\n\25\f\25\16\25\u00df\13\25\5\25\u00e1\n\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00ee\n\27\f\27"+
		"\16\27\u00f1\13\27\3\30\7\30\u00f4\n\30\f\30\16\30\u00f7\13\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u00ff\n\31\3\32\3\32\3\32\3\32\5\32\u0105"+
		"\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34"+
		"\u0113\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0120\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u012c"+
		"\n\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0138\n\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\5!\u0143\n!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3$\3$\3$\7$\u0150\n$\f$\16$\u0153\13$\5$\u0155\n$\3%\3%\3%\3%\3&"+
		"\3&\3\'\7\'\u015e\n\'\f\'\16\'\u0161\13\'\3(\3(\5(\u0165\n(\3(\2)\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2"+
		"\5\3\24\25\3\22\23\3\n\17\u016f\2R\3\2\2\2\4\\\3\2\2\2\6f\3\2\2\2\bz\3"+
		"\2\2\2\n\u0090\3\2\2\2\f\u0097\3\2\2\2\16\u009c\3\2\2\2\20\u009f\3\2\2"+
		"\2\22\u00a2\3\2\2\2\24\u00a6\3\2\2\2\26\u00aa\3\2\2\2\30\u00ac\3\2\2\2"+
		"\32\u00b1\3\2\2\2\34\u00b8\3\2\2\2\36\u00c0\3\2\2\2 \u00c5\3\2\2\2\"\u00ce"+
		"\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,"+
		"\u00e6\3\2\2\2.\u00f5\3\2\2\2\60\u00fe\3\2\2\2\62\u0100\3\2\2\2\64\u0109"+
		"\3\2\2\2\66\u010e\3\2\2\28\u0118\3\2\2\2:\u0124\3\2\2\2<\u0130\3\2\2\2"+
		">\u013c\3\2\2\2@\u0142\3\2\2\2B\u0144\3\2\2\2D\u0148\3\2\2\2F\u0154\3"+
		"\2\2\2H\u0156\3\2\2\2J\u015a\3\2\2\2L\u015f\3\2\2\2N\u0164\3\2\2\2PS\5"+
		"\b\5\2QS\5.\30\2RP\3\2\2\2RQ\3\2\2\2S\3\3\2\2\2TY\5\b\5\2UV\7\6\2\2VX"+
		"\5\b\5\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\"+
		"T\3\2\2\2\\]\3\2\2\2]\5\3\2\2\2^c\5\b\5\2_`\7\7\2\2`b\5\b\5\2a_\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f^\3\2\2\2fg\3\2\2"+
		"\2g\7\3\2\2\2hi\b\5\1\2i{\7\34\2\2j{\7\64\2\2k{\7\4\2\2l{\5\n\6\2m{\5"+
		"\f\7\2n{\5\16\b\2o{\5\20\t\2p{\5\22\n\2q{\5\24\13\2r{\5\26\f\2s{\5\30"+
		"\r\2t{\5\32\16\2u{\5\34\17\2v{\5\36\20\2w{\5 \21\2x{\5$\23\2y{\5&\24\2"+
		"zh\3\2\2\2zj\3\2\2\2zk\3\2\2\2zl\3\2\2\2zm\3\2\2\2zn\3\2\2\2zo\3\2\2\2"+
		"zp\3\2\2\2zq\3\2\2\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3\2\2\2"+
		"zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\u008d\3\2\2\2|}\6\5\2\3}~\t\2\2\2~\u008c"+
		"\5\b\5\2\177\u0080\6\5\3\3\u0080\u0081\t\3\2\2\u0081\u008c\5\b\5\2\u0082"+
		"\u0083\6\5\4\3\u0083\u0084\t\4\2\2\u0084\u008c\5\b\5\2\u0085\u0086\6\5"+
		"\5\3\u0086\u0087\7\20\2\2\u0087\u008c\5\b\5\2\u0088\u0089\6\5\6\3\u0089"+
		"\u008a\7\21\2\2\u008a\u008c\5\b\5\2\u008b|\3\2\2\2\u008b\177\3\2\2\2\u008b"+
		"\u0082\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\t\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0091\5J&\2\u0091\u0092\7\30\2\2\u0092\u0093\5\b\5\2\u0093"+
		"\u0094\7\31\2\2\u0094\u0095\7\60\2\2\u0095\u0096\5\b\5\2\u0096\13\3\2"+
		"\2\2\u0097\u0098\5J&\2\u0098\u0099\7\32\2\2\u0099\u009a\5(\25\2\u009a"+
		"\u009b\7\33\2\2\u009b\r\3\2\2\2\u009c\u009d\7\23\2\2\u009d\u009e\5\b\5"+
		"\2\u009e\17\3\2\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\5J&\2\u00a1\21\3"+
		"\2\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\5\6\4\2\u00a4\u00a5\7\27\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a7\5,\27\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\5\b\5"+
		"\2\u00a9\25\3\2\2\2\u00aa\u00ab\5,\27\2\u00ab\27\3\2\2\2\u00ac\u00ad\7"+
		"\63\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\5\4\3\2\u00af\u00b0\7\27\2\2"+
		"\u00b0\31\3\2\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4"+
		"\7\63\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7\27\2"+
		"\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb"+
		"\7\37\2\2\u00bb\u00be\5\b\5\2\u00bc\u00bd\7 \2\2\u00bd\u00bf\5\b\5\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7!\2\2"+
		"\u00c1\u00c2\5\b\5\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\5\b\5\2\u00c4\37"+
		"\3\2\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8\7\5\2\2\u00c8"+
		"\u00c9\5\b\5\2\u00c9\u00ca\7$\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\7\""+
		"\2\2\u00cc\u00cd\5\b\5\2\u00cd!\3\2\2\2\u00ce\u00cf\7\63\2\2\u00cf#\3"+
		"\2\2\2\u00d0\u00d1\7%\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7&\2\2\u00d3\u00d4"+
		"\5.\30\2\u00d4\u00d5\7\'\2\2\u00d5\u00d6\5\6\4\2\u00d6\u00d7\7(\2\2\u00d7"+
		"\'\3\2\2\2\u00d8\u00dd\5*\26\2\u00d9\u00da\7\6\2\2\u00da\u00dc\5*\26\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e3\7\63\2\2\u00e3\u00e4\7\16\2"+
		"\2\u00e4\u00e5\5\b\5\2\u00e5+\3\2\2\2\u00e6\u00ef\7\63\2\2\u00e7\u00e8"+
		"\7\t\2\2\u00e8\u00ee\7\63\2\2\u00e9\u00ea\7\30\2\2\u00ea\u00eb\5\b\5\2"+
		"\u00eb\u00ec\7\31\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e9"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"-\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f2\3\2\2"+
		"\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6/"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00ff\5\64\33\2\u00f9\u00ff\5\66\34"+
		"\2\u00fa\u00ff\5\62\32\2\u00fb\u00ff\58\35\2\u00fc\u00ff\5<\37\2\u00fd"+
		"\u00ff\5> \2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2"+
		"\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\61"+
		"\3\2\2\2\u0100\u0101\7+\2\2\u0101\u0104\7\63\2\2\u0102\u0103\7\b\2\2\u0103"+
		"\u0105\5J&\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2"+
		"\2\u0106\u0107\7\5\2\2\u0107\u0108\5\b\5\2\u0108\63\3\2\2\2\u0109\u010a"+
		"\7,\2\2\u010a\u010b\7\63\2\2\u010b\u010c\7\16\2\2\u010c\u010d\5@!\2\u010d"+
		"\65\3\2\2\2\u010e\u010f\7)\2\2\u010f\u0112\7\63\2\2\u0110\u0111\7*\2\2"+
		"\u0111\u0113\7\63\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\7\32\2\2\u0115\u0116\5L\'\2\u0116\u0117\7\33\2\2"+
		"\u0117\67\3\2\2\2\u0118\u0119\7.\2\2\u0119\u011a\7\63\2\2\u011a\u011b"+
		"\7\26\2\2\u011b\u011c\5F$\2\u011c\u011f\7\27\2\2\u011d\u011e\7\b\2\2\u011e"+
		"\u0120\5J&\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2"+
		"\2\u0121\u0122\7\16\2\2\u0122\u0123\5\b\5\2\u01239\3\2\2\2\u0124\u0125"+
		"\7-\2\2\u0125\u0126\7\63\2\2\u0126\u0127\7\26\2\2\u0127\u0128\5F$\2\u0128"+
		"\u012b\7\27\2\2\u0129\u012a\7\b\2\2\u012a\u012c\5J&\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\16\2\2\u012e"+
		"\u012f\5\b\5\2\u012f;\3\2\2\2\u0130\u0131\7\61\2\2\u0131\u0132\7\63\2"+
		"\2\u0132\u0133\7\26\2\2\u0133\u0134\5F$\2\u0134\u0137\7\27\2\2\u0135\u0136"+
		"\7\b\2\2\u0136\u0138\5J&\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\7\16\2\2\u013a\u013b\5\b\5\2\u013b=\3\2\2\2"+
		"\u013c\u013d\7\62\2\2\u013d\u013e\7\4\2\2\u013e?\3\2\2\2\u013f\u0143\5"+
		"J&\2\u0140\u0143\5D#\2\u0141\u0143\5B\"\2\u0142\u013f\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0141\3\2\2\2\u0143A\3\2\2\2\u0144\u0145\7/\2\2\u0145\u0146"+
		"\7\60\2\2\u0146\u0147\5J&\2\u0147C\3\2\2\2\u0148\u0149\7\32\2\2\u0149"+
		"\u014a\5F$\2\u014a\u014b\7\33\2\2\u014bE\3\2\2\2\u014c\u0151\5H%\2\u014d"+
		"\u014e\7\6\2\2\u014e\u0150\5H%\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2"+
		"\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0154\u014c\3\2\2\2\u0154\u0155\3\2\2\2\u0155G\3\2\2\2\u0156"+
		"\u0157\7\63\2\2\u0157\u0158\7\b\2\2\u0158\u0159\5J&\2\u0159I\3\2\2\2\u015a"+
		"\u015b\7\63\2\2\u015bK\3\2\2\2\u015c\u015e\5N(\2\u015d\u015c\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160M\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0162\u0165\5\62\32\2\u0163\u0165\5:\36\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0163\3\2\2\2\u0165O\3\2\2\2\33RY\\cfz\u008b\u008d\u00be"+
		"\u00dd\u00e0\u00ed\u00ef\u00f5\u00fe\u0104\u0112\u011f\u012b\u0137\u0142"+
		"\u0151\u0154\u015f\u0164";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
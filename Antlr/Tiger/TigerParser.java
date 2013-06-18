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
		RULE_recordInitializer = 5, RULE_initFields = 6, RULE_initField = 7, RULE_negateExpr = 8, 
		RULE_newExpr = 9, RULE_sequenceExpr = 10, RULE_assignExpr = 11, RULE_valueExpr = 12, 
		RULE_funcExpr = 13, RULE_methodExpr = 14, RULE_ifExpr = 15, RULE_whileExpr = 16, 
		RULE_forExpr = 17, RULE_forID = 18, RULE_breakExpr = 19, RULE_letExpr = 20, 
		RULE_lvalue = 21, RULE_decs = 22, RULE_dec = 23, RULE_varDec = 24, RULE_typeDec = 25, 
		RULE_classDec = 26, RULE_funcDec = 27, RULE_methodDec = 28, RULE_primitiveDec = 29, 
		RULE_importDec = 30, RULE_parameterFields = 31, RULE_funcBody = 32, RULE_type = 33, 
		RULE_arrayType = 34, RULE_recordType = 35, RULE_typeFields = 36, RULE_typeField = 37, 
		RULE_typeID = 38, RULE_classFields = 39, RULE_classField = 40;
	public static final String[] ruleNames = {
		"program", "exprList", "exprs", "expr", "arrayInitializer", "recordInitializer", 
		"initFields", "initField", "negateExpr", "newExpr", "sequenceExpr", "assignExpr", 
		"valueExpr", "funcExpr", "methodExpr", "ifExpr", "whileExpr", "forExpr", 
		"forID", "breakExpr", "letExpr", "lvalue", "decs", "dec", "varDec", "typeDec", 
		"classDec", "funcDec", "methodDec", "primitiveDec", "importDec", "parameterFields", 
		"funcBody", "type", "arrayType", "recordType", "typeFields", "typeField", 
		"typeID", "classFields", "classField"
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
			setState(84);
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
				setState(82); expr(0);
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
				setState(83); decs();
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
			setState(94);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << MINUS) | (1L << LPAR) | (1L << NIL) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << LET) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(86); expr(0);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(87); match(COMMA);
					setState(88); expr(0);
					}
					}
					setState(93);
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
			setState(104);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << MINUS) | (1L << LPAR) | (1L << NIL) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << LET) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(96); expr(0);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(97); match(SEMI);
					setState(98); expr(0);
					}
					}
					setState(103);
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
		public RecordInitializerContext recordInitializer() {
			return getRuleContext(RecordInitializerContext.class,0);
		}
		public TerminalNode DIV() { return getToken(TigerParser.DIV, 0); }
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
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
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(107); negateExpr();
				}
				break;

			case 2:
				{
				setState(108); match(NIL);
				}
				break;

			case 3:
				{
				setState(109); match(INT);
				}
				break;

			case 4:
				{
				setState(110); match(STRING);
				}
				break;

			case 5:
				{
				setState(111); arrayInitializer();
				}
				break;

			case 6:
				{
				setState(112); recordInitializer();
				}
				break;

			case 7:
				{
				setState(113); newExpr();
				}
				break;

			case 8:
				{
				setState(114); sequenceExpr();
				}
				break;

			case 9:
				{
				setState(115); assignExpr();
				}
				break;

			case 10:
				{
				setState(116); valueExpr();
				}
				break;

			case 11:
				{
				setState(117); funcExpr();
				}
				break;

			case 12:
				{
				setState(118); methodExpr();
				}
				break;

			case 13:
				{
				setState(119); ifExpr();
				}
				break;

			case 14:
				{
				setState(120); whileExpr();
				}
				break;

			case 15:
				{
				setState(121); forExpr();
				}
				break;

			case 16:
				{
				setState(122); breakExpr();
				}
				break;

			case 17:
				{
				setState(123); letExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(127);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(128); expr(22);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(130);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(131); expr(21);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(133);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(134); expr(20);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(136); match(AND);
						setState(137); expr(19);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(139); match(OR);
						setState(140); expr(18);
						}
						break;
					}
					} 
				}
				setState(145);
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
			setState(146); typeID();
			setState(147); match(LSQR);
			setState(148); expr(0);
			setState(149); match(RSQR);
			setState(150); match(OF);
			setState(151); expr(0);
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

	public static class RecordInitializerContext extends ParserRuleContext {
		public TerminalNode RBCE() { return getToken(TigerParser.RBCE, 0); }
		public TerminalNode LBCE() { return getToken(TigerParser.LBCE, 0); }
		public InitFieldsContext initFields() {
			return getRuleContext(InitFieldsContext.class,0);
		}
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public RecordInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterRecordInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitRecordInitializer(this);
		}
	}

	public final RecordInitializerContext recordInitializer() throws RecognitionException {
		RecordInitializerContext _localctx = new RecordInitializerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recordInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); typeID();
			setState(154); match(LBCE);
			setState(155); initFields();
			setState(156); match(RBCE);
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
		enterRule(_localctx, 12, RULE_initFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(158); initField();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(159); match(COMMA);
					setState(160); initField();
					}
					}
					setState(165);
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
		enterRule(_localctx, 14, RULE_initField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(ID);
			setState(169); match(EQ);
			setState(170); expr(0);
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
		enterRule(_localctx, 16, RULE_negateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(MINUS);
			setState(173); expr(0);
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
		enterRule(_localctx, 18, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(NEW);
			setState(176); typeID();
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
		enterRule(_localctx, 20, RULE_sequenceExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(LPAR);
			setState(179); exprs();
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
		enterRule(_localctx, 22, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); lvalue();
			setState(183); match(ASSIGN);
			setState(184); expr(0);
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
		enterRule(_localctx, 24, RULE_valueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); lvalue();
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
		enterRule(_localctx, 26, RULE_funcExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(ID);
			setState(189); match(LPAR);
			setState(190); exprList();
			setState(191); match(RPAR);
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
		enterRule(_localctx, 28, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); lvalue();
			setState(194); match(DOT);
			setState(195); match(ID);
			setState(196); match(LPAR);
			setState(197); exprList();
			setState(198); match(RPAR);
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
		enterRule(_localctx, 30, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(IF);
			setState(201); expr(0);
			setState(202); match(THEN);
			setState(203); expr(0);
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(204); match(ELSE);
				setState(205); expr(0);
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
		enterRule(_localctx, 32, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(WHILE);
			setState(209); expr(0);
			setState(210); match(DO);
			setState(211); expr(0);
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
		enterRule(_localctx, 34, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(FOR);
			setState(214); forID();
			setState(215); match(ASSIGN);
			setState(216); expr(0);
			setState(217); match(TO);
			setState(218); expr(0);
			setState(219); match(DO);
			setState(220); expr(0);
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
		enterRule(_localctx, 36, RULE_forID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(ID);
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
		enterRule(_localctx, 38, RULE_breakExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(BREAK);
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
		enterRule(_localctx, 40, RULE_letExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(LET);
			setState(227); decs();
			setState(228); match(IN);
			setState(229); exprs();
			setState(230); match(END);
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
			setState(232); match(ID);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(239);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(233); match(DOT);
						setState(234); match(ID);
						}
						}
						break;
					case LSQR:
						{
						setState(235); match(LSQR);
						setState(236); expr(0);
						setState(237); match(RSQR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(243);
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
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << VAR) | (1L << TYPE) | (1L << FUNCTION) | (1L << PRIMITIVE) | (1L << IMPORT))) != 0)) {
				{
				{
				setState(244); dec();
				}
				}
				setState(249);
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
			setState(256);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); typeDec();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); classDec();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); varDec();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(253); funcDec();
				}
				break;
			case PRIMITIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(254); primitiveDec();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(255); importDec();
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
			setState(258); match(VAR);
			setState(259); match(ID);
			setState(262);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(260); match(COLON);
				setState(261); typeID();
				}
			}

			setState(264); match(ASSIGN);
			setState(265); expr(0);
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
			setState(267); match(TYPE);
			setState(268); match(ID);
			setState(269); match(EQ);
			setState(270); type();
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
			setState(272); match(CLASS);
			setState(273); match(ID);
			setState(276);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(274); match(EXTENDS);
				setState(275); match(ID);
				}
			}

			setState(278); match(LBCE);
			setState(279); classFields();
			setState(280); match(RBCE);
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
		public ParameterFieldsContext parameterFields() {
			return getRuleContext(ParameterFieldsContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(TigerParser.FUNCTION, 0); }
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
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
			setState(282); match(FUNCTION);
			setState(283); match(ID);
			setState(284); match(LPAR);
			setState(285); parameterFields();
			setState(286); match(RPAR);
			setState(289);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(287); match(COLON);
				setState(288); typeID();
				}
			}

			setState(291); match(EQ);
			setState(292); funcBody();
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
		public ParameterFieldsContext parameterFields() {
			return getRuleContext(ParameterFieldsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode EQ() { return getToken(TigerParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
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
			setState(294); match(METHOD);
			setState(295); match(ID);
			setState(296); match(LPAR);
			setState(297); parameterFields();
			setState(298); match(RPAR);
			setState(301);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(299); match(COLON);
				setState(300); typeID();
				}
			}

			setState(303); match(EQ);
			setState(304); funcBody();
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
		public ParameterFieldsContext parameterFields() {
			return getRuleContext(ParameterFieldsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TigerParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TigerParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
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
			setState(306); match(PRIMITIVE);
			setState(307); match(ID);
			setState(308); match(LPAR);
			setState(309); parameterFields();
			setState(310); match(RPAR);
			setState(313);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(311); match(COLON);
				setState(312); typeID();
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
			setState(315); match(IMPORT);
			setState(316); match(STRING);
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

	public static class ParameterFieldsContext extends ParserRuleContext {
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
		public ParameterFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterParameterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitParameterFields(this);
		}
	}

	public final ParameterFieldsContext parameterFields() throws RecognitionException {
		ParameterFieldsContext _localctx = new ParameterFieldsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(318); typeField();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(319); match(COMMA);
					setState(320); typeField();
					}
					}
					setState(325);
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

	public static class FuncBodyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitFuncBody(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_funcBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); expr(0);
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
		enterRule(_localctx, 66, RULE_type);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); typeID();
				}
				break;
			case LBCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); recordType();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(332); arrayType();
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
		enterRule(_localctx, 68, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(ARRAY);
			setState(336); match(OF);
			setState(337); typeID();
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
		enterRule(_localctx, 70, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(LBCE);
			setState(340); typeFields();
			setState(341); match(RBCE);
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
		enterRule(_localctx, 72, RULE_typeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(343); typeField();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(344); match(COMMA);
					setState(345); typeField();
					}
					}
					setState(350);
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
		enterRule(_localctx, 74, RULE_typeField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(ID);
			setState(354); match(COLON);
			setState(355); typeID();
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
		enterRule(_localctx, 76, RULE_typeID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(ID);
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
		enterRule(_localctx, 78, RULE_classFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==METHOD) {
				{
				{
				setState(359); classField();
				}
				}
				setState(364);
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
		enterRule(_localctx, 80, RULE_classField);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(365); varDec();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); methodDec();
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
		case 0: return 21 >= _localctx._p;

		case 1: return 20 >= _localctx._p;

		case 2: return 19 >= _localctx._p;

		case 3: return 18 >= _localctx._p;

		case 4: return 17 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\65\u0174\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\3\2\3\2\5\2W\n\2\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\5"+
		"\3a\n\3\3\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\5\4k\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0090\n\5"+
		"\f\5\16\5\u0093\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\7\b\u00a4\n\b\f\b\16\b\u00a7\13\b\5\b\u00a9\n\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00d1\n\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f2\n\27"+
		"\f\27\16\27\u00f5\13\27\3\30\7\30\u00f8\n\30\f\30\16\30\u00fb\13\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0103\n\31\3\32\3\32\3\32\3\32\5\32"+
		"\u0109\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\5\34\u0117\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0124\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0130\n\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u013c"+
		"\n\37\3 \3 \3 \3!\3!\3!\7!\u0144\n!\f!\16!\u0147\13!\5!\u0149\n!\3\"\3"+
		"\"\3#\3#\3#\5#\u0150\n#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\7&\u015d\n&\f"+
		"&\16&\u0160\13&\5&\u0162\n&\3\'\3\'\3\'\3\'\3(\3(\3)\7)\u016b\n)\f)\16"+
		")\u016e\13)\3*\3*\5*\u0172\n*\3*\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\5\3\24\25\3\22\23\3\n\17\u017c"+
		"\2V\3\2\2\2\4`\3\2\2\2\6j\3\2\2\2\b~\3\2\2\2\n\u0094\3\2\2\2\f\u009b\3"+
		"\2\2\2\16\u00a8\3\2\2\2\20\u00aa\3\2\2\2\22\u00ae\3\2\2\2\24\u00b1\3\2"+
		"\2\2\26\u00b4\3\2\2\2\30\u00b8\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2\2"+
		"\2\36\u00c3\3\2\2\2 \u00ca\3\2\2\2\"\u00d2\3\2\2\2$\u00d7\3\2\2\2&\u00e0"+
		"\3\2\2\2(\u00e2\3\2\2\2*\u00e4\3\2\2\2,\u00ea\3\2\2\2.\u00f9\3\2\2\2\60"+
		"\u0102\3\2\2\2\62\u0104\3\2\2\2\64\u010d\3\2\2\2\66\u0112\3\2\2\28\u011c"+
		"\3\2\2\2:\u0128\3\2\2\2<\u0134\3\2\2\2>\u013d\3\2\2\2@\u0148\3\2\2\2B"+
		"\u014a\3\2\2\2D\u014f\3\2\2\2F\u0151\3\2\2\2H\u0155\3\2\2\2J\u0161\3\2"+
		"\2\2L\u0163\3\2\2\2N\u0167\3\2\2\2P\u016c\3\2\2\2R\u0171\3\2\2\2TW\5\b"+
		"\5\2UW\5.\30\2VT\3\2\2\2VU\3\2\2\2W\3\3\2\2\2X]\5\b\5\2YZ\7\6\2\2Z\\\5"+
		"\b\5\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`X"+
		"\3\2\2\2`a\3\2\2\2a\5\3\2\2\2bg\5\b\5\2cd\7\7\2\2df\5\b\5\2ec\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jb\3\2\2\2jk\3\2\2\2"+
		"k\7\3\2\2\2lm\b\5\1\2m\177\5\22\n\2n\177\7\34\2\2o\177\7\64\2\2p\177\7"+
		"\4\2\2q\177\5\n\6\2r\177\5\f\7\2s\177\5\24\13\2t\177\5\26\f\2u\177\5\30"+
		"\r\2v\177\5\32\16\2w\177\5\34\17\2x\177\5\36\20\2y\177\5 \21\2z\177\5"+
		"\"\22\2{\177\5$\23\2|\177\5(\25\2}\177\5*\26\2~l\3\2\2\2~n\3\2\2\2~o\3"+
		"\2\2\2~p\3\2\2\2~q\3\2\2\2~r\3\2\2\2~s\3\2\2\2~t\3\2\2\2~u\3\2\2\2~v\3"+
		"\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3"+
		"\2\2\2\177\u0091\3\2\2\2\u0080\u0081\6\5\2\3\u0081\u0082\t\2\2\2\u0082"+
		"\u0090\5\b\5\2\u0083\u0084\6\5\3\3\u0084\u0085\t\3\2\2\u0085\u0090\5\b"+
		"\5\2\u0086\u0087\6\5\4\3\u0087\u0088\t\4\2\2\u0088\u0090\5\b\5\2\u0089"+
		"\u008a\6\5\5\3\u008a\u008b\7\20\2\2\u008b\u0090\5\b\5\2\u008c\u008d\6"+
		"\5\6\3\u008d\u008e\7\21\2\2\u008e\u0090\5\b\5\2\u008f\u0080\3\2\2\2\u008f"+
		"\u0083\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\t\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\5N(\2\u0095\u0096\7\30\2\2"+
		"\u0096\u0097\5\b\5\2\u0097\u0098\7\31\2\2\u0098\u0099\7\60\2\2\u0099\u009a"+
		"\5\b\5\2\u009a\13\3\2\2\2\u009b\u009c\5N(\2\u009c\u009d\7\32\2\2\u009d"+
		"\u009e\5\16\b\2\u009e\u009f\7\33\2\2\u009f\r\3\2\2\2\u00a0\u00a5\5\20"+
		"\t\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\17\3\2\2\2\u00aa\u00ab\7\63\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\5\b"+
		"\5\2\u00ad\21\3\2\2\2\u00ae\u00af\7\23\2\2\u00af\u00b0\5\b\5\2\u00b0\23"+
		"\3\2\2\2\u00b1\u00b2\7\35\2\2\u00b2\u00b3\5N(\2\u00b3\25\3\2\2\2\u00b4"+
		"\u00b5\7\26\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00b7\7\27\2\2\u00b7\27\3\2"+
		"\2\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\5\b\5\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00bd\5,\27\2\u00bd\33\3\2\2\2\u00be\u00bf\7\63\2\2"+
		"\u00bf\u00c0\7\26\2\2\u00c0\u00c1\5\4\3\2\u00c1\u00c2\7\27\2\2\u00c2\35"+
		"\3\2\2\2\u00c3\u00c4\5,\27\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7\63\2\2"+
		"\u00c6\u00c7\7\26\2\2\u00c7\u00c8\5\4\3\2\u00c8\u00c9\7\27\2\2\u00c9\37"+
		"\3\2\2\2\u00ca\u00cb\7\36\2\2\u00cb\u00cc\5\b\5\2\u00cc\u00cd\7\37\2\2"+
		"\u00cd\u00d0\5\b\5\2\u00ce\u00cf\7 \2\2\u00cf\u00d1\5\b\5\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7!\2\2\u00d3\u00d4"+
		"\5\b\5\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\5\b\5\2\u00d6#\3\2\2\2\u00d7"+
		"\u00d8\7#\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\b"+
		"\5\2\u00db\u00dc\7$\2\2\u00dc\u00dd\5\b\5\2\u00dd\u00de\7\"\2\2\u00de"+
		"\u00df\5\b\5\2\u00df%\3\2\2\2\u00e0\u00e1\7\63\2\2\u00e1\'\3\2\2\2\u00e2"+
		"\u00e3\7%\2\2\u00e3)\3\2\2\2\u00e4\u00e5\7&\2\2\u00e5\u00e6\5.\30\2\u00e6"+
		"\u00e7\7\'\2\2\u00e7\u00e8\5\6\4\2\u00e8\u00e9\7(\2\2\u00e9+\3\2\2\2\u00ea"+
		"\u00f3\7\63\2\2\u00eb\u00ec\7\t\2\2\u00ec\u00f2\7\63\2\2\u00ed\u00ee\7"+
		"\30\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f0\7\31\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8"+
		"\5\60\31\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa/\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0103\5"+
		"\64\33\2\u00fd\u0103\5\66\34\2\u00fe\u0103\5\62\32\2\u00ff\u0103\58\35"+
		"\2\u0100\u0103\5<\37\2\u0101\u0103\5> \2\u0102\u00fc\3\2\2\2\u0102\u00fd"+
		"\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\61\3\2\2\2\u0104\u0105\7+\2\2\u0105\u0108\7\63\2"+
		"\2\u0106\u0107\7\b\2\2\u0107\u0109\5N(\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\5\2\2\u010b\u010c\5\b\5\2\u010c"+
		"\63\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f\7\63\2\2\u010f\u0110\7\16\2"+
		"\2\u0110\u0111\5D#\2\u0111\65\3\2\2\2\u0112\u0113\7)\2\2\u0113\u0116\7"+
		"\63\2\2\u0114\u0115\7*\2\2\u0115\u0117\7\63\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\32\2\2\u0119\u011a\5"+
		"P)\2\u011a\u011b\7\33\2\2\u011b\67\3\2\2\2\u011c\u011d\7.\2\2\u011d\u011e"+
		"\7\63\2\2\u011e\u011f\7\26\2\2\u011f\u0120\5@!\2\u0120\u0123\7\27\2\2"+
		"\u0121\u0122\7\b\2\2\u0122\u0124\5N(\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\16\2\2\u0126\u0127\5B\"\2\u0127"+
		"9\3\2\2\2\u0128\u0129\7-\2\2\u0129\u012a\7\63\2\2\u012a\u012b\7\26\2\2"+
		"\u012b\u012c\5@!\2\u012c\u012f\7\27\2\2\u012d\u012e\7\b\2\2\u012e\u0130"+
		"\5N(\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7\16\2\2\u0132\u0133\5B\"\2\u0133;\3\2\2\2\u0134\u0135\7\61\2\2"+
		"\u0135\u0136\7\63\2\2\u0136\u0137\7\26\2\2\u0137\u0138\5@!\2\u0138\u013b"+
		"\7\27\2\2\u0139\u013a\7\b\2\2\u013a\u013c\5N(\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c=\3\2\2\2\u013d\u013e\7\62\2\2\u013e\u013f\7\4\2\2"+
		"\u013f?\3\2\2\2\u0140\u0145\5L\'\2\u0141\u0142\7\6\2\2\u0142\u0144\5L"+
		"\'\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0140\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149A\3\2\2\2\u014a\u014b\5\b\5\2\u014bC\3\2"+
		"\2\2\u014c\u0150\5N(\2\u014d\u0150\5H%\2\u014e\u0150\5F$\2\u014f\u014c"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150E\3\2\2\2\u0151"+
		"\u0152\7/\2\2\u0152\u0153\7\60\2\2\u0153\u0154\5N(\2\u0154G\3\2\2\2\u0155"+
		"\u0156\7\32\2\2\u0156\u0157\5J&\2\u0157\u0158\7\33\2\2\u0158I\3\2\2\2"+
		"\u0159\u015e\5L\'\2\u015a\u015b\7\6\2\2\u015b\u015d\5L\'\2\u015c\u015a"+
		"\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162K\3\2\2\2\u0163\u0164\7\63\2\2\u0164\u0165\7\b\2\2\u0165\u0166"+
		"\5N(\2\u0166M\3\2\2\2\u0167\u0168\7\63\2\2\u0168O\3\2\2\2\u0169\u016b"+
		"\5R*\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dQ\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0172\5\62\32"+
		"\2\u0170\u0172\5:\36\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172S"+
		"\3\2\2\2\35V]`gj~\u008f\u0091\u00a5\u00a8\u00d0\u00f1\u00f3\u00f9\u0102"+
		"\u0108\u0116\u0123\u012f\u013b\u0145\u0148\u014f\u015e\u0161\u016c\u0171";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
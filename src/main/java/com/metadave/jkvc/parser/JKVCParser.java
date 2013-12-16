// Generated from ./src/main/java/com/metadave/jkvc/parser/JKVC.g4 by ANTLR 4.0
package com.metadave.jkvc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JKVCParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LSQUARE=1, RSQUARE=2, HASH=3, COLON=4, AT=5, DOT=6, I=7, ID=8, INT=9, 
		WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'['", "']'", "'#'", "':'", "'@'", "'.'", "'i'", "ID", "INT", 
		"WS"
	};
	public static final int
		RULE_path = 0, RULE_path_element = 1, RULE_simple_target = 2, RULE_aggregate_fun = 3, 
		RULE_index_ref = 4, RULE_index_range = 5, RULE_method_call = 6;
	public static final String[] ruleNames = {
		"path", "path_element", "simple_target", "aggregate_fun", "index_ref", 
		"index_range", "method_call"
	};

	@Override
	public String getGrammarFileName() { return "JKVC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JKVCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PathContext extends ParserRuleContext {
		public List<Path_elementContext> path_element() {
			return getRuleContexts(Path_elementContext.class);
		}
		public Path_elementContext path_element(int i) {
			return getRuleContext(Path_elementContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); path_element();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HASH) | (1L << AT) | (1L << ID))) != 0) );
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

	public static class Path_elementContext extends ParserRuleContext {
		public Index_refContext index_ref() {
			return getRuleContext(Index_refContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Index_rangeContext index_range() {
			return getRuleContext(Index_rangeContext.class,0);
		}
		public Aggregate_funContext aggregate_fun() {
			return getRuleContext(Aggregate_funContext.class,0);
		}
		public Simple_targetContext simple_target() {
			return getRuleContext(Simple_targetContext.class,0);
		}
		public Path_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).enterPath_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).exitPath_element(this);
		}
	}

	public final Path_elementContext path_element() throws RecognitionException {
		Path_elementContext _localctx = new Path_elementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_path_element);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); simple_target();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); aggregate_fun();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21); index_ref();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(22); index_range();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(23); method_call();
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

	public static class Simple_targetContext extends ParserRuleContext {
		public Token target;
		public TerminalNode ID() { return getToken(JKVCParser.ID, 0); }
		public Simple_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).enterSimple_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).exitSimple_target(this);
		}
	}

	public final Simple_targetContext simple_target() throws RecognitionException {
		Simple_targetContext _localctx = new Simple_targetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); ((Simple_targetContext)_localctx).target = match(ID);
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

	public static class Aggregate_funContext extends ParserRuleContext {
		public Token funid;
		public TerminalNode AT() { return getToken(JKVCParser.AT, 0); }
		public TerminalNode ID() { return getToken(JKVCParser.ID, 0); }
		public Aggregate_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).enterAggregate_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).exitAggregate_fun(this);
		}
	}

	public final Aggregate_funContext aggregate_fun() throws RecognitionException {
		Aggregate_funContext _localctx = new Aggregate_funContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aggregate_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(AT);
			setState(29); ((Aggregate_funContext)_localctx).funid = match(ID);
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

	public static class Index_refContext extends ParserRuleContext {
		public Token idx;
		public TerminalNode AT() { return getToken(JKVCParser.AT, 0); }
		public TerminalNode INT() { return getToken(JKVCParser.INT, 0); }
		public TerminalNode LSQUARE() { return getToken(JKVCParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(JKVCParser.RSQUARE, 0); }
		public TerminalNode I() { return getToken(JKVCParser.I, 0); }
		public Index_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).enterIndex_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).exitIndex_ref(this);
		}
	}

	public final Index_refContext index_ref() throws RecognitionException {
		Index_refContext _localctx = new Index_refContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_index_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(AT);
			setState(32); match(I);
			setState(33); match(LSQUARE);
			setState(34); ((Index_refContext)_localctx).idx = match(INT);
			setState(35); match(RSQUARE);
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

	public static class Index_rangeContext extends ParserRuleContext {
		public Token idx0;
		public Token idx1;
		public TerminalNode COLON() { return getToken(JKVCParser.COLON, 0); }
		public TerminalNode AT() { return getToken(JKVCParser.AT, 0); }
		public List<TerminalNode> INT() { return getTokens(JKVCParser.INT); }
		public TerminalNode LSQUARE() { return getToken(JKVCParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(JKVCParser.RSQUARE, 0); }
		public TerminalNode INT(int i) {
			return getToken(JKVCParser.INT, i);
		}
		public TerminalNode I() { return getToken(JKVCParser.I, 0); }
		public Index_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).enterIndex_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).exitIndex_range(this);
		}
	}

	public final Index_rangeContext index_range() throws RecognitionException {
		Index_rangeContext _localctx = new Index_rangeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(AT);
			setState(38); match(I);
			setState(39); match(LSQUARE);
			setState(40); ((Index_rangeContext)_localctx).idx0 = match(INT);
			setState(41); match(COLON);
			setState(42); ((Index_rangeContext)_localctx).idx1 = match(INT);
			setState(43); match(RSQUARE);
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

	public static class Method_callContext extends ParserRuleContext {
		public Token methodName;
		public TerminalNode HASH() { return getToken(JKVCParser.HASH, 0); }
		public TerminalNode ID() { return getToken(JKVCParser.ID, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JKVCListener ) ((JKVCListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(HASH);
			setState(46); ((Method_callContext)_localctx).methodName = match(ID);
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
		"\2\3\f\63\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2"+
		"\6\2\22\n\2\r\2\16\2\23\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\2\t\2\4\6\b\n\f\16\2\2\60\2\21\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2"+
		"\2\b\36\3\2\2\2\n!\3\2\2\2\f\'\3\2\2\2\16/\3\2\2\2\20\22\5\4\3\2\21\20"+
		"\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\33"+
		"\5\6\4\2\26\33\5\b\5\2\27\33\5\n\6\2\30\33\5\f\7\2\31\33\5\16\b\2\32\25"+
		"\3\2\2\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5"+
		"\3\2\2\2\34\35\7\n\2\2\35\7\3\2\2\2\36\37\7\7\2\2\37 \7\n\2\2 \t\3\2\2"+
		"\2!\"\7\7\2\2\"#\7\t\2\2#$\7\3\2\2$%\7\13\2\2%&\7\4\2\2&\13\3\2\2\2\'"+
		"(\7\7\2\2()\7\t\2\2)*\7\3\2\2*+\7\13\2\2+,\7\6\2\2,-\7\13\2\2-.\7\4\2"+
		"\2.\r\3\2\2\2/\60\7\5\2\2\60\61\7\n\2\2\61\17\3\2\2\2\4\23\32";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
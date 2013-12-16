// Generated from ./src/main/java/com/metadave/jkvc/parser/JKVC.g4 by ANTLR 4.0
package com.metadave.jkvc.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JKVCBaseListener implements JKVCListener {
	@Override public void enterIndex_ref(JKVCParser.Index_refContext ctx) { }
	@Override public void exitIndex_ref(JKVCParser.Index_refContext ctx) { }

	@Override public void enterPath_element(JKVCParser.Path_elementContext ctx) { }
	@Override public void exitPath_element(JKVCParser.Path_elementContext ctx) { }

	@Override public void enterPath(JKVCParser.PathContext ctx) { }
	@Override public void exitPath(JKVCParser.PathContext ctx) { }

	@Override public void enterMethod_call(JKVCParser.Method_callContext ctx) { }
	@Override public void exitMethod_call(JKVCParser.Method_callContext ctx) { }

	@Override public void enterIndex_range(JKVCParser.Index_rangeContext ctx) { }
	@Override public void exitIndex_range(JKVCParser.Index_rangeContext ctx) { }

	@Override public void enterAggregate_fun(JKVCParser.Aggregate_funContext ctx) { }
	@Override public void exitAggregate_fun(JKVCParser.Aggregate_funContext ctx) { }

	@Override public void enterSimple_target(JKVCParser.Simple_targetContext ctx) { }
	@Override public void exitSimple_target(JKVCParser.Simple_targetContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}
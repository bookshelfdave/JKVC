// Generated from ./src/main/java/com/metadave/jkvc/parser/JKVC.g4 by ANTLR 4.0
package com.metadave.jkvc.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JKVCListener extends ParseTreeListener {
	void enterIndex_ref(JKVCParser.Index_refContext ctx);
	void exitIndex_ref(JKVCParser.Index_refContext ctx);

	void enterPath_element(JKVCParser.Path_elementContext ctx);
	void exitPath_element(JKVCParser.Path_elementContext ctx);

	void enterPath(JKVCParser.PathContext ctx);
	void exitPath(JKVCParser.PathContext ctx);

	void enterMethod_call(JKVCParser.Method_callContext ctx);
	void exitMethod_call(JKVCParser.Method_callContext ctx);

	void enterIndex_range(JKVCParser.Index_rangeContext ctx);
	void exitIndex_range(JKVCParser.Index_rangeContext ctx);

	void enterAggregate_fun(JKVCParser.Aggregate_funContext ctx);
	void exitAggregate_fun(JKVCParser.Aggregate_funContext ctx);

	void enterSimple_target(JKVCParser.Simple_targetContext ctx);
	void exitSimple_target(JKVCParser.Simple_targetContext ctx);
}
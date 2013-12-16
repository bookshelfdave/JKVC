package com.metadave.jkvc.parser;


import com.metadave.jkvc.eval.JKVCEvalByName;
import com.metadave.jkvc.eval.JKVCEvalFactory;
import com.metadave.jkvc.eval.JKVCPathEvaluator;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class JKVCWalker extends JKVCBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();
    JKVCEvalFactory f;
    JKVCPathEvaluator p;

    public JKVCWalker(JKVCEvalFactory f) {
        this.f = f;
        this.p = f.makePathEvaluator();
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }


    public JKVCPathEvaluator getP() {
        return p;
    }

    @Override
    public void enterIndex_ref(JKVCParser.Index_refContext ctx) {
        Integer idx = Integer.parseInt(ctx.idx.getText());
        p.addEvaluator(f.makeEvalByIndex(idx));
    }

    @Override
    public void enterIndex_range(JKVCParser.Index_rangeContext ctx) {
        int low = Integer.parseInt(ctx.idx0.getText());
        int high = Integer.parseInt(ctx.idx1.getText());
        p.addEvaluator(f.makeEvalByRange(low, high));
    }

    @Override
    public void enterAggregate_fun(JKVCParser.Aggregate_funContext ctx) {
        p.addEvaluator(f.makeEvalAggregate(ctx.funid.getText()));
    }

    @Override
    public void enterSimple_target(JKVCParser.Simple_targetContext ctx) {
        p.addEvaluator(f.makeEvalByName(ctx.target.getText()));
    }

    @Override
    public void enterMethod_call(JKVCParser.Method_callContext ctx) {
        p.addEvaluator(f.makeEvalMethodCall(ctx.methodName.getText()));
    }
}

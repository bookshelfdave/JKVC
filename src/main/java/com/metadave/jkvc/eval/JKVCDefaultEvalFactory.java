package com.metadave.jkvc.eval;

public class JKVCDefaultEvalFactory implements JKVCEvalFactory {
    @Override
    public JKVCEvalByName makeEvalByName(String name) {
        return new JKVCEvalByName(name);
    }

    @Override
    public JKVCEvalByRange makeEvalByRange(int low, int high) {
        return new JKVCEvalByRange(low, high);
    }

    @Override
    public JKVCEvalByIndex makeEvalByIndex(int idx) {
        return new JKVCEvalByIndex(idx);
    }

    @Override
    public JKVCEvalAggregate makeEvalAggregate(String funname) {
        return new JKVCEvalAggregate(funname);
    }

    @Override
    public JKVCPathEvaluator makePathEvaluator() {
        return new JKVCPathEvaluator();
    }

    @Override
    public JKVCEvalMethodCall makeEvalMethodCall(String methodName) {
        return new JKVCEvalMethodCall(methodName);
    }
}

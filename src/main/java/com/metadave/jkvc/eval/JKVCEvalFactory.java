package com.metadave.jkvc.eval;


public interface JKVCEvalFactory {
    JKVCEvalByName makeEvalByName(String name);
    JKVCEvalByRange makeEvalByRange(int low, int high);
    JKVCEvalByIndex makeEvalByIndex(int idx);
    JKVCEvalAggregate makeEvalAggregate(String funname);
    JKVCEvalMethodCall makeEvalMethodCall(String methodName);
    JKVCPathEvaluator makePathEvaluator();
}

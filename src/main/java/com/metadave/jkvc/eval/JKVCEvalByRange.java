package com.metadave.jkvc.eval;

import java.util.List;

public class JKVCEvalByRange implements JKVCEvaluator {
    protected  int lower;
    protected  int upper;

    public JKVCEvalByRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }
    @Override
    public Object eval(Object o) {
        if(o instanceof List) {
            List l = (List)o;
            return l.subList(lower, upper+1);
        } else {
            return null;
        }
    }
}

package com.metadave.jkvc.eval;

import java.util.List;

public class JKVCEvalByIndex implements JKVCEvaluator {

    protected  int index;

    public JKVCEvalByIndex(int index) {
        this.index = index;
    }

    @Override
    public Object eval(Object o) {
        if(o instanceof List) {
            List l = (List)o;
            return l.get(index);
        } else {
            return null;
        }
    }
}

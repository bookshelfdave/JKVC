package com.metadave.jkvc.eval;

import java.util.Map;

public class JKVCEvalByName implements JKVCEvaluator   {

    protected String key;

    protected JKVCEvalByName(String key) {
        this.key = key;
    }

    @Override
    public Object eval(Object o) {
        if(o instanceof Map<?,?>) {
            Map<?,?> m = (Map<?,?>)o;
            return m.get(key);
        }
        return null;
    }
}

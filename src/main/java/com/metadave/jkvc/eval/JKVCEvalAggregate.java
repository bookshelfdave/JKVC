package com.metadave.jkvc.eval;

import com.metadave.jkvc.eval.aggregates.JKVCAggregate;
import com.metadave.jkvc.eval.aggregates.JKVCAverageAggregate;
import com.metadave.jkvc.eval.aggregates.JKVCCountAggregate;
import com.metadave.jkvc.eval.aggregates.JKVCSumAggregate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JKVCEvalAggregate implements JKVCEvaluator {

    String function;

    static Map<String, JKVCAggregate> funs = new HashMap<String, JKVCAggregate>();

    static {
        funs.put("count", new JKVCCountAggregate());
        funs.put("sum", new JKVCSumAggregate());
        funs.put("avg", new JKVCAverageAggregate());
    }

    public Map<String, JKVCAggregate> aggregateFunctions() {
        return funs;
    }

    protected JKVCEvalAggregate(String function) {
        this.function = function;
        if(!funs.containsKey(function)) {
            throw new RuntimeException("Invalid aggregate function specificed:" + function);
        }
    }

    @Override
    public Object eval(Object o) {
        JKVCAggregate agg = funs.get(function);
        if(o instanceof Collection<?>) {
            Collection c = (Collection)o;
            Iterator it = c.iterator();
            Object acc = agg.init();
            while(it.hasNext()) {
                Object item = it.next();
                acc = agg.apply(item, acc);
            }
            return agg.getResult(acc);
        }
        return null;
    }
}

package com.metadave.jkvc.eval.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.metadave.jkvc.eval.*;
import com.metadave.jkvc.eval.aggregates.JKVCAggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JKVCJsonEvalFactory implements JKVCEvalFactory {
    @Override
    public JKVCEvalByName makeEvalByName(String name) {
        return new JKVCEvalByName(name) {
            @Override
            public Object eval(Object o) {
                return ((JsonNode) o).get(this.key);
            }
        };
    }

    @Override
    public JKVCEvalByRange makeEvalByRange(int low, int high) {
       return new JKVCEvalByRange(low, high) {
           @Override
           public Object eval(Object o) {
               JsonNode jp = (JsonNode)o;
               List<JsonNode> l = new ArrayList<JsonNode>();
               for(int i = this.lower; i < this.upper; i++) {
                    l.add(jp.get(i));
               }
               return l;
           }
       };
    }

    @Override
    public JKVCEvalByIndex makeEvalByIndex(int idx) {
        return new JKVCEvalByIndex(idx) {
            @Override
            public Object eval(Object o) {
                return ((JsonNode) o).get(this.index);
            }
        };
    }

    @Override
    public JKVCEvalAggregate makeEvalAggregate(String funname) {
        return new JKVCEvalAggregate(funname) {
            @Override
            public Object eval(Object o) {
                JKVCAggregate agg = funs.get(function);

                if(o instanceof JsonNode) {
                    JsonNode j = (JsonNode)o;
                    Iterator it = j.iterator();
                    Object acc = agg.init();
                    while(it.hasNext()) {
                        Object item = it.next();
                        acc = agg.apply(item, acc);
                    }
                    return agg.getResult(acc);
                }
                return null;
            }
        };
    }

    @Override
    public JKVCEvalMethodCall makeEvalMethodCall(String methodName) {
        return new JKVCEvalMethodCall(methodName);
    }

    @Override
    public JKVCPathEvaluator makePathEvaluator() {
        return new JKVCPathEvaluator();
    }
}

package com.metadave.jkvc.eval;

import java.util.ArrayList;
import java.util.List;

public class JKVCPathEvaluator {
    private List<JKVCEvaluator> evals = new ArrayList<JKVCEvaluator>();

    public void addEvaluator(JKVCEvaluator e) {
        evals.add(e);
    }

    public Object eval(Object o) {
        Object node = o;
        for(JKVCEvaluator e : evals) {
            if(node == null) {
                System.out.println("Node == null :-(");
                return null;
            } else {
                node = e.eval(node);
            }
        }
        return node;
    }
}

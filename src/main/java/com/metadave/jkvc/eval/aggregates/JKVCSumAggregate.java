package com.metadave.jkvc.eval.aggregates;


public class JKVCSumAggregate implements JKVCAggregate {
    @Override
    public Object init() {
        return 0.0d;
    }

    @Override
    public Object apply(Object o, Object accumulator) {
        double d0 = (Double)accumulator;
        double d = Double.parseDouble(o.toString());
        return d0 + d;
    }

    @Override
    public Object getResult(Object accumulator) {
        double d0 = (Double)accumulator;
        return d0;
    }
}

package com.metadave.jkvc.eval.aggregates;

public class JKVCCountAggregate implements JKVCAggregate {
    @Override
    public Object init() {
        return 0l;
    }

    @Override
    public Object apply(Object o, Object accumulator) {
        long l = (Long)accumulator;
        return l+1;
    }

    @Override
    public Object getResult(Object accumulator) {
        long l = (Long)accumulator;
        return l;
    }
}

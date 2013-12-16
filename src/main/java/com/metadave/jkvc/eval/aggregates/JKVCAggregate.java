package com.metadave.jkvc.eval.aggregates;


public interface JKVCAggregate {
    // initialize an accumulator
    public Object init();

    // return the accumulator after application
    public Object apply(Object o, Object accumulator);

    // used for extracting pieces from the accumulator
    public Object getResult(Object accumulator);
}

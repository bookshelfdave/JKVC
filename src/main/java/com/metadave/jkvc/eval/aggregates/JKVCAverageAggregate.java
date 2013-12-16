package com.metadave.jkvc.eval.aggregates;


public class JKVCAverageAggregate implements JKVCAggregate {
    @Override
    public Object init() {
        // count, accumulator
        Double d[] = {0.0d, 0.0d};
        return d;
    }

    @Override
    public Object apply(Object o, Object accumulator) {
        Double d[] = (Double[])accumulator;
        double val = Double.parseDouble(o.toString());

        d[0] += 1.0d;
        d[1] += val;
        return d;
    }

    @Override
    public Object getResult(Object accumulator) {
        Double d[] = (Double[])accumulator;
        double count = d[0];
        double sum   = d[1];
        double average = sum / count;
        return average;
    }
}

package com.metadave.jkvc.eval;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JKVCEvalMethodCall implements JKVCEvaluator {

    protected String methodName;
    public JKVCEvalMethodCall(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public Object eval(Object o) {

        Class params[] = {};
        try {
            Method m = o.getClass().getMethod(methodName, params);
            Object args[] = {};
            return m.invoke(o, args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

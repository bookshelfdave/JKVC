package com.metadave.jkvc;

import com.metadave.jkvc.eval.JKVCDefaultEvalFactory;
import com.metadave.jkvc.eval.JKVCEvalFactory;
import com.metadave.jkvc.eval.JKVCPathEvaluator;
import com.metadave.jkvc.parser.JKVCLexer;
import com.metadave.jkvc.parser.JKVCParser;
import com.metadave.jkvc.parser.JKVCWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JKVC {

    public static JKVCPathEvaluator prepare(String s) throws Exception {
        return prepare(s, new JKVCDefaultEvalFactory());
    }

    public static JKVCPathEvaluator prepare(String s, JKVCEvalFactory f) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(s);
        JKVCLexer lexer = new JKVCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JKVCParser parser = new JKVCParser(tokens);
        parser.removeErrorListeners();
        //parser.addErrorListener(new JKVCErrorListener());
        JKVCWalker ew = new JKVCWalker(f);
        ParseTreeWalker walker = new ParseTreeWalker();
        JKVCPathEvaluator result;

        try {
            JKVCParser.PathContext pc = parser.path();
            walker.walk(ew, pc);
            result = ew.getP();
        } catch (Throwable e) {
            throw new Exception("JKVC parse error", e);
        }
        return result;
    }
}

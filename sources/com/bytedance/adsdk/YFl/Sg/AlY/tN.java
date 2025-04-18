package com.bytedance.adsdk.YFl.Sg.AlY;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public enum tN implements wN {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final String Wwa;
    private final int qO;
    private static final Map<String, tN> rkt = new HashMap(128);
    private static final Set<tN> lG = new HashSet();

    static {
        for (tN tNVar : values()) {
            rkt.put(tNVar.YFl(), tNVar);
            lG.add(tNVar);
        }
    }

    tN(String str, int i10) {
        this.Wwa = str;
        this.qO = i10;
    }

    public static tN YFl(String str) {
        return rkt.get(str);
    }

    public int Sg() {
        return this.qO;
    }

    public static boolean YFl(wN wNVar) {
        return wNVar instanceof tN;
    }

    public String YFl() {
        return this.Wwa;
    }
}

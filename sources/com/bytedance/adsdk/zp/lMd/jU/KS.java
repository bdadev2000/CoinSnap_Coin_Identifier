package com.bytedance.adsdk.zp.lMd.jU;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public enum KS implements COT {
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

    private final int pvr;
    private final String vwr;
    private static final Map<String, KS> KVG = new HashMap(128);
    private static final Set<KS> woN = new HashSet();

    static {
        for (KS ks : values()) {
            KVG.put(ks.zp(), ks);
            woN.add(ks);
        }
    }

    KS(String str, int i9) {
        this.vwr = str;
        this.pvr = i9;
    }

    public static KS zp(String str) {
        return KVG.get(str);
    }

    public int lMd() {
        return this.pvr;
    }

    public static boolean zp(COT cot) {
        return cot instanceof KS;
    }

    public String zp() {
        return this.vwr;
    }
}

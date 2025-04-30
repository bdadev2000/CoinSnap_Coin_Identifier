package com.bytedance.adsdk.zp.lMd.jU;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum jU implements COT {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, jU> HWF;
    private final String QR;

    static {
        HashMap hashMap = new HashMap(128);
        HWF = hashMap;
        for (jU jUVar : hashMap.values()) {
            HWF.put(jUVar.zp(), jUVar);
        }
    }

    jU(String str) {
        this.QR = str;
    }

    public static boolean zp(COT cot) {
        return cot instanceof jU;
    }

    public String zp() {
        return this.QR;
    }
}

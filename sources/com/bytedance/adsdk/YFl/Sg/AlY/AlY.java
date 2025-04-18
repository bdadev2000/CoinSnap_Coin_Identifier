package com.bytedance.adsdk.YFl.Sg.AlY;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum AlY implements wN {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");


    /* renamed from: vc, reason: collision with root package name */
    private static final Map<String, AlY> f10222vc;
    private final String DSW;

    static {
        HashMap hashMap = new HashMap(128);
        f10222vc = hashMap;
        for (AlY alY : hashMap.values()) {
            f10222vc.put(alY.YFl(), alY);
        }
    }

    AlY(String str) {
        this.DSW = str;
    }

    public static boolean YFl(wN wNVar) {
        return wNVar instanceof AlY;
    }

    public String YFl() {
        return this.DSW;
    }
}

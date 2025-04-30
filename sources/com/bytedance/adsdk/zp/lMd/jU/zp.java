package com.bytedance.adsdk.zp.lMd.jU;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum zp implements COT {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, zp> jU = new HashMap(128);

    static {
        for (zp zpVar : values()) {
            jU.put(zpVar.name().toLowerCase(), zpVar);
        }
    }

    public static zp zp(String str) {
        return jU.get(str.toLowerCase());
    }
}

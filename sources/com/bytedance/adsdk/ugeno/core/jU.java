package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class jU {
    private static Map<String, lMd> zp = new HashMap();

    public static void zp(List<lMd> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (lMd lmd : list) {
            if (lmd != null) {
                zp.put(lmd.zp(), lmd);
            }
        }
    }

    public static lMd zp(String str) {
        return zp.get(str);
    }
}

package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AlY {
    private static Map<String, Sg> YFl = new HashMap();

    public static void YFl(List<Sg> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (Sg sg2 : list) {
            if (sg2 != null) {
                YFl.put(sg2.YFl(), sg2);
            }
        }
    }

    public static Sg YFl(String str) {
        return YFl.get(str);
    }
}

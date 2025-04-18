package com.bytedance.adsdk.ugeno.AlY;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class vc {
    private static Map<String, tN> YFl = new HashMap();

    public static void YFl(List<tN> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (tN tNVar : list) {
            if (tNVar != null) {
                YFl.put(tNVar.YFl(), tNVar);
            }
        }
    }

    public static tN YFl(String str) {
        return YFl.get(str);
    }
}

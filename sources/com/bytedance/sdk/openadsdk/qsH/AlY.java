package com.bytedance.sdk.openadsdk.qsH;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.pq;
import java.util.Map;

/* loaded from: classes.dex */
public final class AlY extends YFl {
    public static tN YFl;

    public static String YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, String str) {
        if (!pq.tN()) {
            return str;
        }
        tN YFl2 = Sg.YFl("net");
        if (YFl2 == null) {
            return str;
        }
        Map map = (Map) YFl2.YFl(1, str);
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                tNVar.Sg(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}

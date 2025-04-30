package com.bytedance.sdk.openadsdk.COT;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.irS;
import java.util.Map;

/* loaded from: classes.dex */
public final class jU extends zp {
    public static KS zp;

    public static String zp(com.bytedance.sdk.component.QR.lMd.KS ks, String str) {
        if (!irS.KS()) {
            return str;
        }
        KS zp2 = lMd.zp("net");
        if (zp2 == null) {
            return str;
        }
        Map map = (Map) zp2.zp(1, str);
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
                ks.lMd(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}

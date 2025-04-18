package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AlY {
    public static String YFl(String str) {
        if (!com.bytedance.sdk.component.utils.YoT.AlY()) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.DSW dsw = new com.bytedance.sdk.openadsdk.core.model.DSW(com.bytedance.sdk.openadsdk.core.NjR.Sg().GA());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = dsw.Sg().iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append("&");
                    sb2.append(dsw.YFl());
                } else {
                    sb2.append("?");
                    sb2.append(dsw.YFl());
                }
            }
        }
        return sb2.toString();
    }
}

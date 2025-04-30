package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public class jU {
    public static String zp(String str) {
        if (!com.bytedance.sdk.component.utils.tG.jU()) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.HWF hwf = new com.bytedance.sdk.openadsdk.core.model.HWF(com.bytedance.sdk.openadsdk.core.ku.lMd().vDp());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = hwf.lMd().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(hwf.zp());
                } else {
                    sb.append("?");
                    sb.append(hwf.zp());
                }
            }
        }
        return sb.toString();
    }
}

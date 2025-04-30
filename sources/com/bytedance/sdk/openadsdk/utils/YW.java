package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class YW {
    private static String lMd(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void zp(String str) {
        zp("any_door_id", str);
    }

    public static String zp() {
        return lMd("any_door_id", null);
    }

    private static void zp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}

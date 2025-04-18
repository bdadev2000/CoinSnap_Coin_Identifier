package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class NjR {
    private static String Sg(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void YFl(String str) {
        YFl("any_door_id", str);
    }

    public static String YFl() {
        return Sg("any_door_id", null);
    }

    private static void YFl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}

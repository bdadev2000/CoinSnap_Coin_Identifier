package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes.dex */
public class pq {
    private static String YFl;

    public static String Sg() {
        if (TextUtils.isEmpty(YFl)) {
            YFl = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return YFl;
    }

    public static boolean YFl() {
        return com.bytedance.sdk.component.utils.YoT.AlY() && com.bytedance.sdk.openadsdk.core.NjR.Sg().lG() && com.bytedance.sdk.openadsdk.core.NjR.Sg().Wwa();
    }

    public static boolean tN() {
        return false;
    }

    public static String YFl(String str) {
        try {
            if (!YFl()) {
                return str;
            }
            String qO = com.bytedance.sdk.openadsdk.core.NjR.Sg().qO();
            if (TextUtils.isEmpty(qO)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(qO)));
            return Uri.parse(str).buildUpon().appendQueryParameter(Sg(), qO).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}

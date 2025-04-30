package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes.dex */
public class irS {
    private static String zp;

    public static boolean KS() {
        return false;
    }

    public static String lMd() {
        if (TextUtils.isEmpty(zp)) {
            zp = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return zp;
    }

    public static boolean zp() {
        return com.bytedance.sdk.component.utils.tG.jU() && com.bytedance.sdk.openadsdk.core.ku.lMd().woN() && com.bytedance.sdk.openadsdk.core.ku.lMd().vwr();
    }

    public static String zp(String str) {
        try {
            if (!zp()) {
                return str;
            }
            String pvr = com.bytedance.sdk.openadsdk.core.ku.lMd().pvr();
            if (TextUtils.isEmpty(pvr)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(pvr)));
            return Uri.parse(str).buildUpon().appendQueryParameter(lMd(), pvr).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}

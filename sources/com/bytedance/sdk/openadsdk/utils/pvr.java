package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class pvr {
    private static boolean zp = false;

    private static String KS(String str, String str2) {
        if (TextUtils.isEmpty("PangleSDK-6003")) {
            return str;
        }
        return zp(o.k(str2, "]-[", str));
    }

    public static void lMd() {
        zp = false;
    }

    public static void zp() {
        zp = true;
    }

    public static void lMd(String str, String str2, Object... objArr) {
        lMd(KS(str, str2), objArr);
    }

    public static void zp(String str, String str2, Object... objArr) {
        zp(KS(str, str2), objArr);
    }

    public static void lMd(String str, String str2) {
        if (zp && str2 != null) {
            Log.e(zp(str), str2);
        }
    }

    public static void zp(String str, String str2) {
        if (zp && str2 != null) {
            Log.d(zp(str), str2);
        }
    }

    public static void lMd(String str, Object... objArr) {
        if (zp && objArr != null) {
            Log.e(zp(str), zp(objArr));
        }
    }

    public static void zp(String str, Object... objArr) {
        if (zp && objArr != null) {
            Log.d(zp(str), zp(objArr));
        }
    }

    private static String zp(String str) {
        return TextUtils.isEmpty("PangleSDK-6003") ? str : zp(AbstractC2914a.e("[PangleSDK-6003]-[", str, "]"));
    }

    private static String zp(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb.append(obj.toString());
                } else {
                    sb.append(" null ");
                }
                sb.append(" ");
            }
            return sb.toString();
        }
        return "";
    }
}

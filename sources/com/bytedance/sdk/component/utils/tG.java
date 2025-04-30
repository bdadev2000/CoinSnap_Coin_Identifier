package com.bytedance.sdk.component.utils;

import Q7.n0;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class tG {
    private static com.bytedance.sdk.component.zp KS = null;
    private static String jU = "";
    private static int lMd = 4;
    private static boolean zp = false;

    public static void KS() {
        zp = false;
        zp(7);
    }

    public static boolean jU() {
        return zp;
    }

    public static void lMd() {
        zp = true;
        zp(3);
    }

    public static void zp(String str) {
        jU = str;
    }

    public static void zp(int i9) {
        lMd = i9;
    }

    public static String KS(String str) {
        return TextUtils.isEmpty(jU) ? str : zp(n0.m(new StringBuilder("["), jU, "]-[", str, "]"));
    }

    public static void lMd(String str) {
        if (zp) {
            zp("Logger", str);
        }
    }

    public static boolean zp() {
        return lMd <= 3;
    }

    public static void zp(String str, String str2) {
        if (KS != null) {
            KS(str);
        }
        if (zp && str2 != null && lMd <= 6) {
            Log.e(KS(str), str2);
        }
    }

    public static String lMd(String str, String str2) {
        return TextUtils.isEmpty(jU) ? str : zp(o.k(str2, "]-[", str));
    }

    public static void zp(String str, String str2, String str3, Throwable th) {
        if (zp) {
            zp(lMd(str, str2), str3, th);
        }
    }

    public static void zp(String str, String str2, Throwable th) {
        if (KS != null) {
            KS(str);
        }
        if (zp) {
            if (!(str2 == null && th == null) && lMd <= 6) {
                Log.e(KS(str), str2, th);
            }
        }
    }

    public static void zp(String str, Object... objArr) {
        if (KS != null) {
            KS(str);
            zp(objArr);
        }
        if (zp && objArr != null && lMd <= 6) {
            Log.e(KS(str), zp(objArr));
        }
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

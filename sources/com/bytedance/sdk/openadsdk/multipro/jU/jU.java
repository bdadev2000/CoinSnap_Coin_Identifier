package com.bytedance.sdk.openadsdk.multipro.jU;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.lMd;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.ku;

/* loaded from: classes.dex */
public class jU {
    private static String lMd(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static boolean zp() {
        return KVG.zp() == null;
    }

    public static void zp(String str, String str2, Boolean bool) {
        if (zp()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp.zp(lMd(str), str2, bool);
        } else {
            zp(lMd(str), str2, bool);
        }
    }

    public static String lMd(String str, String str2, String str3) {
        if (zp()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp.lMd(lMd(str), str2, str3);
        }
        return zp.zp(KVG.zp(), lMd(str), str2, str3);
    }

    public static void zp(String str, String str2, Long l) {
        if (zp()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp.zp(lMd(str), str2, l);
        } else {
            zp(lMd(str), str2, l);
        }
    }

    public static void zp(String str, String str2, String str3) {
        if (zp()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp.zp(lMd(str), str2, str3);
        } else {
            zp(lMd(str), str2, str3);
        }
    }

    public static void zp(String str, String str2, Integer num) {
        if (zp()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp.zp(lMd(str), str2, num);
        } else {
            zp(lMd(str), str2, num);
        }
    }

    public static int zp(String str, String str2, int i9) {
        if (zp()) {
            return i9;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp.zp(lMd(str), str2, i9);
        }
        return zp.zp(KVG.zp(), lMd(str), str2, i9);
    }

    public static boolean zp(String str, String str2, boolean z8) {
        if (zp()) {
            return z8;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp.zp(lMd(str), str2, z8);
        }
        return zp.zp(KVG.zp(), lMd(str), str2, z8);
    }

    public static long zp(String str, String str2, long j7) {
        if (zp()) {
            return j7;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp.zp(lMd(str), str2, j7);
        }
        return zp.zp(KVG.zp(), lMd(str), str2, j7);
    }

    public static void zp(String str, String str2) {
        if (zp()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                zp.lMd(lMd(str), str2);
            } else {
                lMd.lMd(KVG.zp(), lMd(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void zp(String str) {
        if (zp()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp.zp(lMd(str));
        } else {
            lMd.lMd(KVG.zp(), lMd(str));
        }
    }

    private static <T> void zp(String str, String str2, T t9) {
        String zp = zp.zp(str, str2);
        if (ku.COT(zp)) {
            lMd.KS lMd = com.bytedance.sdk.component.lMd.zp(KVG.zp(), lMd(zp)).lMd();
            lMd.zp(lMd, str2, (Object) t9);
            lMd.apply();
        } else {
            SharedPreferences zp2 = lMd.zp(KVG.zp(), lMd(zp));
            if (zp2 == null) {
                return;
            }
            SharedPreferences.Editor edit = zp2.edit();
            lMd.zp(edit, str2, t9);
            edit.apply();
        }
    }
}

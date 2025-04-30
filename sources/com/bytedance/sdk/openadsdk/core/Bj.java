package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import java.util.Locale;

/* loaded from: classes.dex */
public class Bj {
    private static boolean COT;
    private static String KS;
    private static String jU;
    private static String lMd;
    private static String zp;

    @RequiresPermission(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    @SuppressLint({"HardwareIds"})
    private static void COT(Context context) {
        Context jU2;
        if (COT || (jU2 = jU(context)) == null) {
            return;
        }
        lMd = lMd();
        KS = String.valueOf(Build.TIME);
        jU = KS.zp(jU2).lMd("uuid", (String) null);
        COT = true;
    }

    private static void HWF(Context context) {
        Context jU2 = jU(context);
        if (jU2 == null) {
            return;
        }
        zp = KS.zp(jU2).lMd("did", (String) null);
    }

    public static String KS(Context context) {
        if (TextUtils.isEmpty(jU) && !COT) {
            synchronized (Bj.class) {
                try {
                    if (!COT) {
                        COT(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return jU;
    }

    private static Context jU(Context context) {
        if (context == null) {
            return KVG.zp();
        }
        return context;
    }

    public static String lMd(Context context) {
        if (KS == null && !COT) {
            synchronized (Bj.class) {
                try {
                    if (!COT) {
                        COT(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return KS;
    }

    public static String zp(Context context) {
        if (!TextUtils.isEmpty(zp)) {
            return zp;
        }
        HWF(context);
        return zp;
    }

    public static void zp(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(zp)) {
            KS.zp(context).zp("did", str);
            zp = str;
        }
        if (TextUtils.isEmpty(zp)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.COT.KS.lMd(zp);
        dT.zp(zp);
    }

    private static String lMd() {
        StringBuilder sb = new StringBuilder();
        try {
            if (com.bytedance.sdk.openadsdk.utils.yRU.COT()) {
                sb.append("MIUI-");
            } else if (com.bytedance.sdk.openadsdk.utils.yRU.lMd()) {
                sb.append("FLYME-");
            } else {
                String rV = com.bytedance.sdk.openadsdk.utils.yRU.rV();
                if (com.bytedance.sdk.openadsdk.utils.yRU.zp(rV)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(rV)) {
                    sb.append(rV);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String zp() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(locale2)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}

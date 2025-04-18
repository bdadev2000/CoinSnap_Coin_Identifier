package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import java.util.Locale;

/* loaded from: classes.dex */
public class YoT {
    private static String AlY;
    private static String Sg;
    private static String YFl;
    private static String tN;
    private static boolean wN;

    private static Context AlY(Context context) {
        return context == null ? lG.YFl() : context;
    }

    public static String Sg(Context context) {
        if (tN == null && !wN) {
            synchronized (YoT.class) {
                if (!wN) {
                    wN(context);
                }
            }
        }
        return tN;
    }

    public static String YFl(Context context) {
        if (!TextUtils.isEmpty(YFl)) {
            return YFl;
        }
        vc(context);
        return YFl;
    }

    public static String tN(Context context) {
        if (TextUtils.isEmpty(AlY) && !wN) {
            synchronized (YoT.class) {
                if (!wN) {
                    wN(context);
                }
            }
        }
        return AlY;
    }

    private static void vc(Context context) {
        Context AlY2 = AlY(context);
        if (AlY2 == null) {
            return;
        }
        YFl = tN.YFl(AlY2).Sg("did", (String) null);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    @SuppressLint({"HardwareIds"})
    private static void wN(Context context) {
        Context AlY2;
        if (wN || (AlY2 = AlY(context)) == null) {
            return;
        }
        Sg = Sg();
        tN = String.valueOf(Build.TIME);
        AlY = tN.YFl(AlY2).Sg("uuid", (String) null);
        wN = true;
    }

    public static void YFl(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(YFl)) {
            tN.YFl(context).YFl("did", str);
            YFl = str;
        }
        if (TextUtils.isEmpty(YFl)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.NjR.tN.Sg(YFl);
        eT.YFl(YFl);
    }

    private static String Sg() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (com.bytedance.sdk.openadsdk.utils.bZ.wN()) {
                sb2.append("MIUI-");
            } else if (com.bytedance.sdk.openadsdk.utils.bZ.Sg()) {
                sb2.append("FLYME-");
            } else {
                String pDU = com.bytedance.sdk.openadsdk.utils.bZ.pDU();
                if (com.bytedance.sdk.openadsdk.utils.bZ.YFl(pDU)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(pDU)) {
                    sb2.append(pDU);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb2.toString();
    }

    public static String YFl() {
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
            return Locale.SIMPLIFIED_CHINESE.toString().equals(locale2) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}

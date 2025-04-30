package com.bytedance.sdk.component.adexpress.jU;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.cz;
import java.util.Locale;

/* loaded from: classes.dex */
public class QR {
    private static boolean zp;

    public static float KS(Context context, float f9) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().lMd();
        }
        return f9 * jU(context);
    }

    private static float jU(Context context) {
        try {
            if (zp) {
                context.getClassLoader().loadClass("android.util.DisplayMetrics").getDeclaredMethod("getDeviceDensity", null).setAccessible(true);
                return ((Integer) r1.invoke(r0, null)).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int lMd(Context context, float f9) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().lMd();
        }
        float jU = jU(context);
        if (jU <= 0.0f) {
            jU = 1.0f;
        }
        return (int) ((f9 / jU) + 0.5f);
    }

    public static int zp(float f9, float f10, float f11, float f12) {
        return (((int) ((f9 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f11 * 255.0f) + 0.5f)) << 8) | ((int) ((f12 * 255.0f) + 0.5f));
    }

    public static float zp(Context context, float f9) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().lMd();
        }
        return (f9 * jU(context)) + 0.5f;
    }

    public static String KS(Context context) {
        String str;
        try {
            Locale locale = cz.lMd(context).getConfiguration().getLocales().get(0);
            str = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    str = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return zp(str);
    }

    public static int lMd(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().lMd();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int zp(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().lMd();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String zp(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    c9 = 0;
                    break;
                }
                break;
            case 3383:
                if (str.equals("ja")) {
                    c9 = 1;
                    break;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    c9 = 2;
                    break;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    c9 = 3;
                    break;
                }
                break;
            case 3886:
                if (str.equals("zh")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return "aa";
            case 1:
                return "japan";
            case 2:
                return "korea";
            case 3:
                return "my";
            case 4:
                return "cn";
            default:
                return str;
        }
    }
}

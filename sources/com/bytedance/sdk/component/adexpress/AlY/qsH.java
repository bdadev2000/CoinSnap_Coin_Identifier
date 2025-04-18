package com.bytedance.sdk.component.adexpress.AlY;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.qO;
import java.util.Locale;

/* loaded from: classes.dex */
public class qsH {
    private static boolean YFl;

    private static float AlY(Context context) {
        try {
            if (YFl) {
                context.getClassLoader().loadClass("android.util.DisplayMetrics").getDeclaredMethod("getDeviceDensity", new Class[0]).setAccessible(true);
                return ((Integer) r1.invoke(r0, new Object[0])).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int Sg(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().Sg();
        }
        float AlY = AlY(context);
        if (AlY <= 0.0f) {
            AlY = 1.0f;
        }
        return (int) ((f10 / AlY) + 0.5f);
    }

    public static int YFl(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float tN(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().Sg();
        }
        return f10 * AlY(context);
    }

    public static float YFl(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().Sg();
        }
        return (f10 * AlY(context)) + 0.5f;
    }

    public static int Sg(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().Sg();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String tN(Context context) {
        String str;
        try {
            Locale locale = qO.Sg(context).getConfiguration().getLocales().get(0);
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
        return YFl(str);
    }

    public static int YFl(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().Sg();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String YFl(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3383:
                if (str.equals("ja")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3886:
                if (str.equals("zh")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
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

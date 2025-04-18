package com.bytedance.sdk.component.utils;

import a4.j;
import android.text.TextUtils;
import android.util.Log;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
public class YoT {
    private static String AlY = "";
    private static int Sg = 4;
    private static boolean YFl = false;
    private static com.bytedance.sdk.component.YFl tN;

    public static boolean AlY() {
        return YFl;
    }

    public static void Sg() {
        YFl = true;
        YFl(3);
    }

    public static void YFl(String str) {
        AlY = str;
    }

    public static void tN() {
        YFl = false;
        YFl(7);
    }

    public static void YFl(int i10) {
        Sg = i10;
    }

    public static void Sg(String str) {
        if (YFl) {
            YFl("Logger", str);
        }
    }

    public static boolean YFl() {
        return Sg <= 3;
    }

    public static String tN(String str) {
        return TextUtils.isEmpty(AlY) ? str : YFl(j.k(new StringBuilder("["), AlY, "]-[", str, "]"));
    }

    public static void YFl(String str, String str2) {
        if (tN != null) {
            tN(str);
        }
        if (YFl && str2 != null && Sg <= 6) {
            Log.e(tN(str), str2);
        }
    }

    public static String Sg(String str, String str2) {
        return TextUtils.isEmpty(AlY) ? str : YFl(a.m(str2, "]-[", str));
    }

    public static void YFl(String str, String str2, String str3, Throwable th2) {
        if (YFl) {
            YFl(Sg(str, str2), str3, th2);
        }
    }

    public static void YFl(String str, String str2, Throwable th2) {
        if (tN != null) {
            tN(str);
        }
        if (YFl) {
            if (!(str2 == null && th2 == null) && Sg <= 6) {
                Log.e(tN(str), str2, th2);
            }
        }
    }

    public static void YFl(String str, Object... objArr) {
        if (tN != null) {
            tN(str);
            YFl(objArr);
        }
        if (YFl && objArr != null && Sg <= 6) {
            Log.e(tN(str), YFl(objArr));
        }
    }

    private static String YFl(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb2.append(obj.toString());
            } else {
                sb2.append(" null ");
            }
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

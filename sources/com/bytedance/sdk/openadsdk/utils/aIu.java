package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.mediation.ads.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
public class aIu {
    private static boolean YFl = false;

    public static void Sg() {
        YFl = false;
    }

    public static void YFl() {
        YFl = true;
    }

    private static String tN(String str, String str2) {
        if (TextUtils.isEmpty("PangleSDK-6304")) {
            return str;
        }
        return YFl(a.m(str2, "]-[", str));
    }

    public static void Sg(String str, String str2, Object... objArr) {
        Sg(tN(str, str2), objArr);
    }

    public static void YFl(String str, String str2, Object... objArr) {
        YFl(tN(str, str2), objArr);
    }

    public static void Sg(String str, String str2) {
        if (YFl && str2 != null) {
            Log.e(YFl(str), str2);
        }
    }

    public static void YFl(String str, String str2) {
        if (YFl && str2 != null) {
            Log.d(YFl(str), str2);
        }
    }

    public static void Sg(String str, Object... objArr) {
        if (YFl && objArr != null) {
            Log.e(YFl(str), YFl(objArr));
        }
    }

    public static void YFl(String str, Object... objArr) {
        if (YFl && objArr != null) {
            Log.d(YFl(str), YFl(objArr));
        }
    }

    private static String YFl(String str) {
        return TextUtils.isEmpty("PangleSDK-6304") ? str : YFl(e.f("[PangleSDK-6304]-[", str, "]"));
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

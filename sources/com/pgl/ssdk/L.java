package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class L {
    private static SharedPreferences a;

    public static String a(Context context, String str, String str2) {
        SharedPreferences a10 = a(context);
        return a10 != null ? a10.getString(str, str2) : str2;
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences a10 = a(context);
        if (a10 != null) {
            a10.edit().putString(str, str2).apply();
        }
    }

    public static SharedPreferences a(Context context) {
        if (a == null) {
            a = context.getSharedPreferences("ss_config", 0);
        }
        return a;
    }
}

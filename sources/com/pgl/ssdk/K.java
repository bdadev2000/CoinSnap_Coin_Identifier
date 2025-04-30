package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f19545a;

    public static SharedPreferences a(Context context) {
        if (f19545a == null) {
            f19545a = context.getSharedPreferences("ss_config", 0);
        }
        return f19545a;
    }
}

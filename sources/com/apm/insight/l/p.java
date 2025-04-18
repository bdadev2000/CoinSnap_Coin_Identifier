package com.apm.insight.l;

import android.util.Log;

/* loaded from: classes.dex */
public final class p {
    public static void a(Object obj) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    public static void b(Object obj) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.d("npth", String.valueOf(obj));
        }
    }

    public static void a(String str) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.w("npth", str);
        }
    }

    public static void b(Throwable th2) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th2);
        }
    }

    public static void a(String str, Object obj) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    public static void a(String str, Object obj, Throwable th2) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.e("npth", str + " " + obj, th2);
        }
    }

    public static void a(String str, Throwable th2) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.e("npth", str + " NPTH Catch Error", th2);
        }
    }

    public static void a(Throwable th2) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th2);
        }
    }
}

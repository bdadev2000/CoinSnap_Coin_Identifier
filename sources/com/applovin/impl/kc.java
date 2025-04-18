package com.applovin.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class kc {
    private static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5647b = true;

    private static String a(String str, Throwable th2) {
        String a10 = a(th2);
        if (TextUtils.isEmpty(a10)) {
            return str;
        }
        StringBuilder n10 = eb.j.n(str, "\n  ");
        n10.append(a10.replace("\n", "\n  "));
        n10.append('\n');
        return n10.toString();
    }

    public static void b(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static void c(String str, String str2, Throwable th2) {
        d(str, a(str2, th2));
    }

    public static void d(String str, String str2) {
        if (a <= 2) {
            Log.w(str, str2);
        }
    }

    private static boolean b(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void c(String str, String str2) {
        if (a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th2) {
        b(str, a(str2, th2));
    }

    public static String a(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (b(th2)) {
            return "UnknownHostException (no network)";
        }
        if (!f5647b) {
            return th2.getMessage();
        }
        return Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    public static void a(String str, String str2) {
        if (a == 0) {
            Log.d(str, str2);
        }
    }
}

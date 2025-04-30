package com.applovin.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class kc {

    /* renamed from: a, reason: collision with root package name */
    private static int f8619a = 0;
    private static boolean b = true;

    private static String a(String str, Throwable th) {
        String a6 = a(th);
        if (TextUtils.isEmpty(a6)) {
            return str;
        }
        StringBuilder c9 = AbstractC2965e.c(str, "\n  ");
        c9.append(a6.replace("\n", "\n  "));
        c9.append('\n');
        return c9.toString();
    }

    public static void b(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static void c(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void d(String str, String str2) {
        if (f8619a <= 2) {
            Log.w(str, str2);
        }
    }

    private static boolean b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void c(String str, String str2) {
        if (f8619a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (f8619a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (b(th)) {
            return "UnknownHostException (no network)";
        }
        if (!b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void a(String str, String str2) {
        if (f8619a == 0) {
            Log.d(str, str2);
        }
    }
}

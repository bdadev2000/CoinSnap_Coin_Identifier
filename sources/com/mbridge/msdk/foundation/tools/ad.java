package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public final class ad {
    public static boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f13536b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13537c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f13538d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f13539e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f13540f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f13541g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f13542h = true;

    static {
        if (!MBridgeConstans.DEBUG) {
            f13541g = false;
            a = false;
            f13537c = false;
            f13542h = false;
            f13536b = false;
            f13540f = false;
            f13539e = false;
            f13538d = false;
        }
    }

    public static void a(String str, String str2) {
        if (!a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f13536b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f13537c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (f13542h && !TextUtils.isEmpty(str2)) {
            Log.w(a(str), str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f13536b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? vd.e.e("MBRIDGE_", str) : str;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f13542h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f13542h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }
}

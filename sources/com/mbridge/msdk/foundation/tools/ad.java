package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f15977a = true;
    public static boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f15978c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f15979d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f15980e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f15981f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f15982g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f15983h = true;

    static {
        if (!MBridgeConstans.DEBUG) {
            f15982g = false;
            f15977a = false;
            f15978c = false;
            f15983h = false;
            b = false;
            f15981f = false;
            f15980e = false;
            f15979d = false;
        }
    }

    public static void a(String str, String str2) {
        if (!f15977a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f15978c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (f15983h && !TextUtils.isEmpty(str2)) {
            Log.w(a(str), str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? AbstractC2914a.d("MBRIDGE_", str) : str;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f15983h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f15977a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f15983h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}

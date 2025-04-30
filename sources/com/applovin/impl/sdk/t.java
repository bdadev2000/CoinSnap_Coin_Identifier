package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.lc;
import com.applovin.impl.oj;
import com.applovin.impl.x3;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class t {
    private static boolean b;

    /* renamed from: a, reason: collision with root package name */
    private final k f11155a;

    public t(k kVar) {
        this.f11155a = kVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z8) {
        b = z8;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!b || a()) {
            Log.e("AppLovinSdk", AbstractC2914a.k("[", str, "] ", str2), th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (b && !a()) {
            return;
        }
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (b && !a()) {
            return;
        }
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void j(String str, String str2) {
        if (b && !a()) {
            return;
        }
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void l(String str, String str2) {
        k kVar = k.f10832A0;
        if (kVar == null) {
            return;
        }
        kVar.L();
        if (a()) {
            k.f10832A0.L().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int intValue;
        if (a(this.f11155a) && !TextUtils.isEmpty(str2) && (intValue = ((Integer) this.f11155a.a(oj.f9879x)).intValue()) > 0) {
            int length = str2.length();
            int i9 = ((length + intValue) - 1) / intValue;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i10 * intValue;
                a(str, str2.substring(i11, Math.min(length, i11 + intValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        lc lcVar = new lc();
        lcVar.a().a(str).a();
        g("AppLovinSdk", lcVar.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        k kVar = k.f10832A0;
        if (kVar == null) {
            return;
        }
        kVar.L();
        if (a()) {
            k.f10832A0.L().a(str, str2, th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", AbstractC2914a.k("[", str, "] ", str2), th);
    }

    public void a(String str, Throwable th) {
        if (x3.e()) {
            for (Throwable th2 : th.getSuppressed()) {
                b(str, th2.toString());
            }
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", AbstractC2914a.k("[", str, "] ", str2), th);
    }

    public static boolean a() {
        return a(k.f10832A0);
    }

    public static boolean a(k kVar) {
        return kVar != null && kVar.h0().c();
    }
}

package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.qc;
import com.applovin.impl.sj;
import com.applovin.impl.z3;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f26716b;

    /* renamed from: a, reason: collision with root package name */
    private final j f26717a;

    public n(j jVar) {
        this.f26717a = jVar;
        a("SDK Session Begin");
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f26716b || a()) {
            Log.e("AppLovinSdk", androidx.compose.foundation.text.input.a.l("[", str, "] ", str2), th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!f26716b || a()) {
            Log.d("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!f26716b || a()) {
            Log.i("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f26716b || a()) {
            Log.w("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        j jVar = j.f26635v0;
        if (jVar == null) {
            return;
        }
        jVar.J();
        if (a()) {
            j.f26635v0.J().k(str, str2);
        }
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", androidx.compose.foundation.text.input.a.l("[", str, "] ", str2), th);
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", androidx.compose.foundation.text.input.a.l("[", str, "] ", str2), th);
    }

    public void f(String str, String str2) {
        int intValue;
        if (a(this.f26717a) && !TextUtils.isEmpty(str2) && (intValue = ((Integer) this.f26717a.a(sj.f26952t)).intValue()) > 0) {
            int length = str2.length();
            int i2 = ((length + intValue) - 1) / intValue;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * intValue;
                a(str, str2.substring(i4, Math.min(length, i4 + intValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    public static void b(String str, String str2, Throwable th) {
        j jVar = j.f26635v0;
        if (jVar == null) {
            return;
        }
        jVar.J();
        if (a()) {
            j.f26635v0.J().a(str, str2, th);
        }
    }

    public static void a(boolean z2) {
        f26716b = z2;
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    private void a(String str) {
        qc qcVar = new qc();
        qcVar.a().a(str).a();
        g("AppLovinSdk", qcVar.toString());
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, Throwable th) {
        if (z3.e()) {
            for (Throwable th2 : th.getSuppressed()) {
                b(str, th2.toString());
            }
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static boolean a() {
        return a(j.f26635v0);
    }

    public static boolean a(j jVar) {
        return jVar != null && jVar.h0().c();
    }
}

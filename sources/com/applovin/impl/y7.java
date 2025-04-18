package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.m2;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;

/* loaded from: classes.dex */
public final class y7 extends kh {

    /* renamed from: l, reason: collision with root package name */
    public static final m2.a f9141l = new lu(15);

    /* renamed from: d, reason: collision with root package name */
    public final int f9142d;

    /* renamed from: f, reason: collision with root package name */
    public final String f9143f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9144g;

    /* renamed from: h, reason: collision with root package name */
    public final d9 f9145h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9146i;

    /* renamed from: j, reason: collision with root package name */
    public final td f9147j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f9148k;

    private y7(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static y7 a(Throwable th2, String str, int i10, d9 d9Var, int i11, boolean z10, int i12) {
        return new y7(1, th2, null, i12, str, i10, d9Var, d9Var == null ? 4 : i11, z10);
    }

    public static /* synthetic */ y7 c(Bundle bundle) {
        return new y7(bundle);
    }

    private y7(int i10, Throwable th2, String str, int i11, String str2, int i12, d9 d9Var, int i13, boolean z10) {
        this(a(i10, str, str2, i12, d9Var, i13), th2, i11, i10, str2, i12, d9Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public static y7 a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private static String a(int i10, String str, String str2, int i11, d9 d9Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + d9Var + ", format_supported=" + r2.b(i12);
        }
        return !TextUtils.isEmpty(str) ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str3, ": ", str) : str3;
    }

    private y7(Bundle bundle) {
        super(bundle);
        this.f9142d = bundle.getInt(kh.b(1001), 2);
        this.f9143f = bundle.getString(kh.b(1002));
        this.f9144g = bundle.getInt(kh.b(1003), -1);
        this.f9145h = (d9) n2.a(d9.I, bundle.getBundle(kh.b(1004)));
        this.f9146i = bundle.getInt(kh.b(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), 4);
        this.f9148k = bundle.getBoolean(kh.b(1006), false);
        this.f9147j = null;
    }

    public static y7 a(IOException iOException, int i10) {
        return new y7(0, iOException, i10);
    }

    public static y7 a(RuntimeException runtimeException, int i10) {
        return new y7(2, runtimeException, i10);
    }

    private y7(String str, Throwable th2, int i10, int i11, String str2, int i12, d9 d9Var, int i13, td tdVar, long j3, boolean z10) {
        super(str, th2, i10, j3);
        a1.a(!z10 || i11 == 1);
        a1.a(th2 != null || i11 == 3);
        this.f9142d = i11;
        this.f9143f = str2;
        this.f9144g = i12;
        this.f9145h = d9Var;
        this.f9146i = i13;
        this.f9147j = tdVar;
        this.f9148k = z10;
    }

    public y7 a(td tdVar) {
        return new y7((String) yp.a((Object) getMessage()), getCause(), this.a, this.f9142d, this.f9143f, this.f9144g, this.f9145h, this.f9146i, tdVar, this.f5710b, this.f9148k);
    }
}

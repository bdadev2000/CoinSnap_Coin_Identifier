package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.o2;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a8 extends nh {

    /* renamed from: l */
    public static final o2.a f22704l = new rs(4);
    public final int d;

    /* renamed from: f */
    public final String f22705f;

    /* renamed from: g */
    public final int f22706g;

    /* renamed from: h */
    public final f9 f22707h;

    /* renamed from: i */
    public final int f22708i;

    /* renamed from: j */
    public final yd f22709j;

    /* renamed from: k */
    final boolean f22710k;

    private a8(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    public static a8 a(Throwable th, String str, int i2, f9 f9Var, int i3, boolean z2, int i4) {
        return new a8(1, th, null, i4, str, i2, f9Var, f9Var == null ? 4 : i3, z2);
    }

    public static /* synthetic */ a8 c(Bundle bundle) {
        return new a8(bundle);
    }

    private a8(int i2, Throwable th, String str, int i3, String str2, int i4, f9 f9Var, int i5, boolean z2) {
        this(a(i2, str, str2, i4, f9Var, i5), th, i3, i2, str2, i4, f9Var, i5, null, SystemClock.elapsedRealtime(), z2);
    }

    public static a8 a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private static String a(int i2, String str, String str2, int i3, f9 f9Var, int i4) {
        String str3;
        if (i2 == 0) {
            str3 = "Source error";
        } else if (i2 != 1) {
            str3 = i2 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + f9Var + ", format_supported=" + t2.b(i4);
        }
        return !TextUtils.isEmpty(str) ? androidx.compose.foundation.text.input.a.k(str3, ": ", str) : str3;
    }

    private a8(Bundle bundle) {
        super(bundle);
        this.d = bundle.getInt(nh.b(1001), 2);
        this.f22705f = bundle.getString(nh.b(1002));
        this.f22706g = bundle.getInt(nh.b(1003), -1);
        this.f22707h = (f9) p2.a(f9.I, bundle.getBundle(nh.b(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION)));
        this.f22708i = bundle.getInt(nh.b(1005), 4);
        this.f22710k = bundle.getBoolean(nh.b(1006), false);
        this.f22709j = null;
    }

    public static a8 a(IOException iOException, int i2) {
        return new a8(0, iOException, i2);
    }

    private a8(String str, Throwable th, int i2, int i3, String str2, int i4, f9 f9Var, int i5, yd ydVar, long j2, boolean z2) {
        super(str, th, i2, j2);
        b1.a(!z2 || i3 == 1);
        b1.a(th != null || i3 == 3);
        this.d = i3;
        this.f22705f = str2;
        this.f22706g = i4;
        this.f22707h = f9Var;
        this.f22708i = i5;
        this.f22709j = ydVar;
        this.f22710k = z2;
    }

    public static a8 a(RuntimeException runtimeException, int i2) {
        return new a8(2, runtimeException, i2);
    }

    public a8 a(yd ydVar) {
        return new a8((String) xp.a((Object) getMessage()), getCause(), this.f25710a, this.d, this.f22705f, this.f22706g, this.f22707h, this.f22708i, ydVar, this.f25711b, this.f22710k);
    }
}

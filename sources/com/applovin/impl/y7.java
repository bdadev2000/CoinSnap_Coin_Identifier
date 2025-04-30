package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.InterfaceC0725m2;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;

/* loaded from: classes.dex */
public final class y7 extends kh {
    public static final InterfaceC0725m2.a l = new C1(16);

    /* renamed from: d */
    public final int f12345d;

    /* renamed from: f */
    public final String f12346f;

    /* renamed from: g */
    public final int f12347g;

    /* renamed from: h */
    public final d9 f12348h;

    /* renamed from: i */
    public final int f12349i;

    /* renamed from: j */
    public final td f12350j;

    /* renamed from: k */
    final boolean f12351k;

    private y7(int i9, Throwable th, int i10) {
        this(i9, th, null, i10, null, -1, null, 4, false);
    }

    public static y7 a(Throwable th, String str, int i9, d9 d9Var, int i10, boolean z8, int i11) {
        return new y7(1, th, null, i11, str, i9, d9Var, d9Var == null ? 4 : i10, z8);
    }

    public static /* synthetic */ y7 c(Bundle bundle) {
        return new y7(bundle);
    }

    private y7(int i9, Throwable th, String str, int i10, String str2, int i11, d9 d9Var, int i12, boolean z8) {
        this(a(i9, str, str2, i11, d9Var, i12), th, i10, i9, str2, i11, d9Var, i12, null, SystemClock.elapsedRealtime(), z8);
    }

    public static y7 a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private static String a(int i9, String str, String str2, int i10, d9 d9Var, int i11) {
        String str3;
        if (i9 == 0) {
            str3 = "Source error";
        } else if (i9 == 1) {
            str3 = str2 + " error, index=" + i10 + ", format=" + d9Var + ", format_supported=" + AbstractC0744r2.b(i11);
        } else if (i9 != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        return !TextUtils.isEmpty(str) ? com.mbridge.msdk.foundation.entity.o.k(str3, ": ", str) : str3;
    }

    private y7(Bundle bundle) {
        super(bundle);
        this.f12345d = bundle.getInt(kh.b(1001), 2);
        this.f12346f = bundle.getString(kh.b(1002));
        this.f12347g = bundle.getInt(kh.b(1003), -1);
        this.f12348h = (d9) AbstractC0729n2.a(d9.f7194I, bundle.getBundle(kh.b(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION)));
        this.f12349i = bundle.getInt(kh.b(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), 4);
        this.f12351k = bundle.getBoolean(kh.b(1006), false);
        this.f12350j = null;
    }

    private y7(String str, Throwable th, int i9, int i10, String str2, int i11, d9 d9Var, int i12, td tdVar, long j7, boolean z8) {
        super(str, th, i9, j7);
        AbstractC0669a1.a(!z8 || i10 == 1);
        AbstractC0669a1.a(th != null || i10 == 3);
        this.f12345d = i10;
        this.f12346f = str2;
        this.f12347g = i11;
        this.f12348h = d9Var;
        this.f12349i = i12;
        this.f12350j = tdVar;
        this.f12351k = z8;
    }

    public static y7 a(IOException iOException, int i9) {
        return new y7(0, iOException, i9);
    }

    public static y7 a(RuntimeException runtimeException, int i9) {
        return new y7(2, runtimeException, i9);
    }

    public y7 a(td tdVar) {
        return new y7((String) yp.a((Object) getMessage()), getCause(), this.f8692a, this.f12345d, this.f12346f, this.f12347g, this.f12348h, this.f12349i, tdVar, this.b, this.f12351k);
    }
}

package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class cp {
    private final int a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4130d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4131e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4132f;

    /* renamed from: b, reason: collision with root package name */
    private final io f4128b = new io(0);

    /* renamed from: g, reason: collision with root package name */
    private long f4133g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    private long f4134h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    private long f4135i = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    private final yg f4129c = new yg();

    public cp(int i10) {
        this.a = i10;
    }

    private int a(j8 j8Var) {
        this.f4129c.a(yp.f9257f);
        this.f4130d = true;
        j8Var.b();
        return 0;
    }

    public io b() {
        return this.f4128b;
    }

    public boolean c() {
        return this.f4130d;
    }

    private int b(j8 j8Var, qh qhVar, int i10) {
        int min = (int) Math.min(this.a, j8Var.a());
        long j3 = 0;
        if (j8Var.f() != j3) {
            qhVar.a = j3;
            return 1;
        }
        this.f4129c.d(min);
        j8Var.b();
        j8Var.c(this.f4129c.c(), 0, min);
        this.f4133g = a(this.f4129c, i10);
        this.f4131e = true;
        return 0;
    }

    private int c(j8 j8Var, qh qhVar, int i10) {
        long a = j8Var.a();
        int min = (int) Math.min(this.a, a);
        long j3 = a - min;
        if (j8Var.f() != j3) {
            qhVar.a = j3;
            return 1;
        }
        this.f4129c.d(min);
        j8Var.b();
        j8Var.c(this.f4129c.c(), 0, min);
        this.f4134h = b(this.f4129c, i10);
        this.f4132f = true;
        return 0;
    }

    public long a() {
        return this.f4135i;
    }

    public int a(j8 j8Var, qh qhVar, int i10) {
        if (i10 <= 0) {
            return a(j8Var);
        }
        if (!this.f4132f) {
            return c(j8Var, qhVar, i10);
        }
        if (this.f4134h == C.TIME_UNSET) {
            return a(j8Var);
        }
        if (!this.f4131e) {
            return b(j8Var, qhVar, i10);
        }
        long j3 = this.f4133g;
        if (j3 == C.TIME_UNSET) {
            return a(j8Var);
        }
        long b3 = this.f4128b.b(this.f4134h) - this.f4128b.b(j3);
        this.f4135i = b3;
        if (b3 < 0) {
            kc.d("TsDurationReader", "Invalid duration: " + this.f4135i + ". Using TIME_UNSET instead.");
            this.f4135i = C.TIME_UNSET;
        }
        return a(j8Var);
    }

    private long b(yg ygVar, int i10) {
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        for (int i11 = e2 - 188; i11 >= d10; i11--) {
            if (fp.a(ygVar.c(), d10, e2, i11)) {
                long a = fp.a(ygVar, i11, i10);
                if (a != C.TIME_UNSET) {
                    return a;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private long a(yg ygVar, int i10) {
        int e2 = ygVar.e();
        for (int d10 = ygVar.d(); d10 < e2; d10++) {
            if (ygVar.c()[d10] == 71) {
                long a = fp.a(ygVar, d10, i10);
                if (a != C.TIME_UNSET) {
                    return a;
                }
            }
        }
        return C.TIME_UNSET;
    }
}

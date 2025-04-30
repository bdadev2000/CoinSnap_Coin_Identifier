package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class cp {

    /* renamed from: a, reason: collision with root package name */
    private final int f7118a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7120d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7121e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7122f;
    private final io b = new io(0);

    /* renamed from: g, reason: collision with root package name */
    private long f7123g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    private long f7124h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    private long f7125i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    private final yg f7119c = new yg();

    public cp(int i9) {
        this.f7118a = i9;
    }

    private int a(j8 j8Var) {
        this.f7119c.a(yp.f12455f);
        this.f7120d = true;
        j8Var.b();
        return 0;
    }

    public io b() {
        return this.b;
    }

    public boolean c() {
        return this.f7120d;
    }

    private int b(j8 j8Var, qh qhVar, int i9) {
        int min = (int) Math.min(this.f7118a, j8Var.a());
        long j7 = 0;
        if (j8Var.f() != j7) {
            qhVar.f10346a = j7;
            return 1;
        }
        this.f7119c.d(min);
        j8Var.b();
        j8Var.c(this.f7119c.c(), 0, min);
        this.f7123g = a(this.f7119c, i9);
        this.f7121e = true;
        return 0;
    }

    private int c(j8 j8Var, qh qhVar, int i9) {
        long a6 = j8Var.a();
        int min = (int) Math.min(this.f7118a, a6);
        long j7 = a6 - min;
        if (j8Var.f() != j7) {
            qhVar.f10346a = j7;
            return 1;
        }
        this.f7119c.d(min);
        j8Var.b();
        j8Var.c(this.f7119c.c(), 0, min);
        this.f7124h = b(this.f7119c, i9);
        this.f7122f = true;
        return 0;
    }

    public long a() {
        return this.f7125i;
    }

    public int a(j8 j8Var, qh qhVar, int i9) {
        if (i9 <= 0) {
            return a(j8Var);
        }
        if (!this.f7122f) {
            return c(j8Var, qhVar, i9);
        }
        if (this.f7124h == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return a(j8Var);
        }
        if (!this.f7121e) {
            return b(j8Var, qhVar, i9);
        }
        long j7 = this.f7123g;
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return a(j8Var);
        }
        long b = this.b.b(this.f7124h) - this.b.b(j7);
        this.f7125i = b;
        if (b < 0) {
            kc.d("TsDurationReader", "Invalid duration: " + this.f7125i + ". Using TIME_UNSET instead.");
            this.f7125i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return a(j8Var);
    }

    private long b(yg ygVar, int i9) {
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        for (int i10 = e4 - 188; i10 >= d2; i10--) {
            if (fp.a(ygVar.c(), d2, e4, i10)) {
                long a6 = fp.a(ygVar, i10, i9);
                if (a6 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    return a6;
                }
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private long a(yg ygVar, int i9) {
        int e4 = ygVar.e();
        for (int d2 = ygVar.d(); d2 < e4; d2++) {
            if (ygVar.c()[d2] == 71) {
                long a6 = fp.a(ygVar, d2, i9);
                if (a6 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    return a6;
                }
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class di {

    /* renamed from: c, reason: collision with root package name */
    private boolean f7299c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7300d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7301e;

    /* renamed from: a, reason: collision with root package name */
    private final io f7298a = new io(0);

    /* renamed from: f, reason: collision with root package name */
    private long f7302f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: g, reason: collision with root package name */
    private long f7303g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    private long f7304h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    private final yg b = new yg();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public io b() {
        return this.f7298a;
    }

    public boolean c() {
        return this.f7299c;
    }

    private int b(j8 j8Var, qh qhVar) {
        int min = (int) Math.min(20000L, j8Var.a());
        long j7 = 0;
        if (j8Var.f() != j7) {
            qhVar.f10346a = j7;
            return 1;
        }
        this.b.d(min);
        j8Var.b();
        j8Var.c(this.b.c(), 0, min);
        this.f7302f = a(this.b);
        this.f7300d = true;
        return 0;
    }

    private int c(j8 j8Var, qh qhVar) {
        long a6 = j8Var.a();
        int min = (int) Math.min(20000L, a6);
        long j7 = a6 - min;
        if (j8Var.f() != j7) {
            qhVar.f10346a = j7;
            return 1;
        }
        this.b.d(min);
        j8Var.b();
        j8Var.c(this.b.c(), 0, min);
        this.f7303g = b(this.b);
        this.f7301e = true;
        return 0;
    }

    private int a(j8 j8Var) {
        this.b.a(yp.f12455f);
        this.f7299c = true;
        j8Var.b();
        return 0;
    }

    public long a() {
        return this.f7304h;
    }

    private int a(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }

    private long b(yg ygVar) {
        int d2 = ygVar.d();
        for (int e4 = ygVar.e() - 4; e4 >= d2; e4--) {
            if (a(ygVar.c(), e4) == 442) {
                ygVar.f(e4 + 4);
                long c9 = c(ygVar);
                if (c9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    return c9;
                }
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public static long c(yg ygVar) {
        int d2 = ygVar.d();
        if (ygVar.a() < 9) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        ygVar.a(bArr, 0, 9);
        ygVar.f(d2);
        return !a(bArr) ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : b(bArr);
    }

    public int a(j8 j8Var, qh qhVar) {
        if (!this.f7301e) {
            return c(j8Var, qhVar);
        }
        if (this.f7303g == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return a(j8Var);
        }
        if (!this.f7300d) {
            return b(j8Var, qhVar);
        }
        long j7 = this.f7302f;
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return a(j8Var);
        }
        long b = this.f7298a.b(this.f7303g) - this.f7298a.b(j7);
        this.f7304h = b;
        if (b < 0) {
            kc.d("PsDurationReader", "Invalid duration: " + this.f7304h + ". Using TIME_UNSET instead.");
            this.f7304h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return a(j8Var);
    }

    private static long b(byte[] bArr) {
        long j7 = bArr[0];
        long j9 = ((j7 & 3) << 28) | (((56 & j7) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j10 = bArr[2];
        return j9 | (((j10 & 248) >> 3) << 15) | ((j10 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    private long a(yg ygVar) {
        int e4 = ygVar.e();
        for (int d2 = ygVar.d(); d2 < e4 - 3; d2++) {
            if (a(ygVar.c(), d2) == 442) {
                ygVar.f(d2 + 4);
                long c9 = c(ygVar);
                if (c9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    return c9;
                }
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}

package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class di {

    /* renamed from: c, reason: collision with root package name */
    private boolean f4305c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4306d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4307e;
    private final io a = new io(0);

    /* renamed from: f, reason: collision with root package name */
    private long f4308f = C.TIME_UNSET;

    /* renamed from: g, reason: collision with root package name */
    private long f4309g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    private long f4310h = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    private final yg f4304b = new yg();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public io b() {
        return this.a;
    }

    public boolean c() {
        return this.f4305c;
    }

    private int b(j8 j8Var, qh qhVar) {
        int min = (int) Math.min(20000L, j8Var.a());
        long j3 = 0;
        if (j8Var.f() != j3) {
            qhVar.a = j3;
            return 1;
        }
        this.f4304b.d(min);
        j8Var.b();
        j8Var.c(this.f4304b.c(), 0, min);
        this.f4308f = a(this.f4304b);
        this.f4306d = true;
        return 0;
    }

    private int c(j8 j8Var, qh qhVar) {
        long a = j8Var.a();
        int min = (int) Math.min(20000L, a);
        long j3 = a - min;
        if (j8Var.f() != j3) {
            qhVar.a = j3;
            return 1;
        }
        this.f4304b.d(min);
        j8Var.b();
        j8Var.c(this.f4304b.c(), 0, min);
        this.f4309g = b(this.f4304b);
        this.f4307e = true;
        return 0;
    }

    private int a(j8 j8Var) {
        this.f4304b.a(yp.f9257f);
        this.f4305c = true;
        j8Var.b();
        return 0;
    }

    public long a() {
        return this.f4310h;
    }

    private int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    private long b(yg ygVar) {
        int d10 = ygVar.d();
        for (int e2 = ygVar.e() - 4; e2 >= d10; e2--) {
            if (a(ygVar.c(), e2) == 442) {
                ygVar.f(e2 + 4);
                long c10 = c(ygVar);
                if (c10 != C.TIME_UNSET) {
                    return c10;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long c(yg ygVar) {
        int d10 = ygVar.d();
        if (ygVar.a() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        ygVar.a(bArr, 0, 9);
        ygVar.f(d10);
        return !a(bArr) ? C.TIME_UNSET : b(bArr);
    }

    public int a(j8 j8Var, qh qhVar) {
        if (!this.f4307e) {
            return c(j8Var, qhVar);
        }
        if (this.f4309g == C.TIME_UNSET) {
            return a(j8Var);
        }
        if (!this.f4306d) {
            return b(j8Var, qhVar);
        }
        long j3 = this.f4308f;
        if (j3 == C.TIME_UNSET) {
            return a(j8Var);
        }
        long b3 = this.a.b(this.f4309g) - this.a.b(j3);
        this.f4310h = b3;
        if (b3 < 0) {
            kc.d("PsDurationReader", "Invalid duration: " + this.f4310h + ". Using TIME_UNSET instead.");
            this.f4310h = C.TIME_UNSET;
        }
        return a(j8Var);
    }

    private static long b(byte[] bArr) {
        long j3 = bArr[0];
        long j10 = ((j3 & 3) << 28) | (((56 & j3) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j11 = bArr[2];
        return j10 | (((j11 & 248) >> 3) << 15) | ((j11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    private long a(yg ygVar) {
        int e2 = ygVar.e();
        for (int d10 = ygVar.d(); d10 < e2 - 3; d10++) {
            if (a(ygVar.c(), d10) == 442) {
                ygVar.f(d10 + 4);
                long c10 = c(ygVar);
                if (c10 != C.TIME_UNSET) {
                    return c10;
                }
            }
        }
        return C.TIME_UNSET;
    }
}

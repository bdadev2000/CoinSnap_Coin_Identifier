package com.applovin.impl;

/* loaded from: classes.dex */
public final class fj {

    /* renamed from: c, reason: collision with root package name */
    public static final fj f4755c;

    /* renamed from: d, reason: collision with root package name */
    public static final fj f4756d;

    /* renamed from: e, reason: collision with root package name */
    public static final fj f4757e;

    /* renamed from: f, reason: collision with root package name */
    public static final fj f4758f;

    /* renamed from: g, reason: collision with root package name */
    public static final fj f4759g;
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4760b;

    static {
        fj fjVar = new fj(0L, 0L);
        f4755c = fjVar;
        f4756d = new fj(Long.MAX_VALUE, Long.MAX_VALUE);
        f4757e = new fj(Long.MAX_VALUE, 0L);
        f4758f = new fj(0L, Long.MAX_VALUE);
        f4759g = fjVar;
    }

    public fj(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        a1.a(j10 >= 0);
        this.a = j3;
        this.f4760b = j10;
    }

    public long a(long j3, long j10, long j11) {
        boolean z10;
        long j12 = this.a;
        if (j12 == 0 && this.f4760b == 0) {
            return j3;
        }
        long d10 = yp.d(j3, j12, Long.MIN_VALUE);
        long a = yp.a(j3, this.f4760b, Long.MAX_VALUE);
        boolean z11 = true;
        if (d10 <= j10 && j10 <= a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (d10 > j11 || j11 > a) {
            z11 = false;
        }
        if (z10 && z11) {
            if (Math.abs(j10 - j3) <= Math.abs(j11 - j3)) {
                return j10;
            }
            return j11;
        }
        if (z10) {
            return j10;
        }
        if (z11) {
            return j11;
        }
        return d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fj.class != obj.getClass()) {
            return false;
        }
        fj fjVar = (fj) obj;
        if (this.a == fjVar.a && this.f4760b == fjVar.f4760b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f4760b);
    }
}

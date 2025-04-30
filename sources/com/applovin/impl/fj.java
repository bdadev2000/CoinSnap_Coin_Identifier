package com.applovin.impl;

/* loaded from: classes.dex */
public final class fj {

    /* renamed from: c, reason: collision with root package name */
    public static final fj f7711c;

    /* renamed from: d, reason: collision with root package name */
    public static final fj f7712d;

    /* renamed from: e, reason: collision with root package name */
    public static final fj f7713e;

    /* renamed from: f, reason: collision with root package name */
    public static final fj f7714f;

    /* renamed from: g, reason: collision with root package name */
    public static final fj f7715g;

    /* renamed from: a, reason: collision with root package name */
    public final long f7716a;
    public final long b;

    static {
        fj fjVar = new fj(0L, 0L);
        f7711c = fjVar;
        f7712d = new fj(Long.MAX_VALUE, Long.MAX_VALUE);
        f7713e = new fj(Long.MAX_VALUE, 0L);
        f7714f = new fj(0L, Long.MAX_VALUE);
        f7715g = fjVar;
    }

    public fj(long j7, long j9) {
        boolean z8;
        if (j7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        AbstractC0669a1.a(j9 >= 0);
        this.f7716a = j7;
        this.b = j9;
    }

    public long a(long j7, long j9, long j10) {
        boolean z8;
        long j11 = this.f7716a;
        if (j11 == 0 && this.b == 0) {
            return j7;
        }
        long d2 = yp.d(j7, j11, Long.MIN_VALUE);
        long a6 = yp.a(j7, this.b, Long.MAX_VALUE);
        boolean z9 = false;
        if (d2 <= j9 && j9 <= a6) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (d2 <= j10 && j10 <= a6) {
            z9 = true;
        }
        if (z8 && z9) {
            if (Math.abs(j9 - j7) <= Math.abs(j10 - j7)) {
                return j9;
            }
            return j10;
        }
        if (z8) {
            return j9;
        }
        if (z9) {
            return j10;
        }
        return d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fj.class != obj.getClass()) {
            return false;
        }
        fj fjVar = (fj) obj;
        if (this.f7716a == fjVar.f7716a && this.b == fjVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f7716a) * 31) + ((int) this.b);
    }
}

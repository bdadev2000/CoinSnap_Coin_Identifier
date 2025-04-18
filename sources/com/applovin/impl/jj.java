package com.applovin.impl;

/* loaded from: classes.dex */
public final class jj {

    /* renamed from: c, reason: collision with root package name */
    public static final jj f24696c;
    public static final jj d;
    public static final jj e;

    /* renamed from: f, reason: collision with root package name */
    public static final jj f24697f;

    /* renamed from: g, reason: collision with root package name */
    public static final jj f24698g;

    /* renamed from: a, reason: collision with root package name */
    public final long f24699a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24700b;

    static {
        jj jjVar = new jj(0L, 0L);
        f24696c = jjVar;
        d = new jj(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new jj(Long.MAX_VALUE, 0L);
        f24697f = new jj(0L, Long.MAX_VALUE);
        f24698g = jjVar;
    }

    public jj(long j2, long j3) {
        b1.a(j2 >= 0);
        b1.a(j3 >= 0);
        this.f24699a = j2;
        this.f24700b = j3;
    }

    public long a(long j2, long j3, long j4) {
        long j5 = this.f24699a;
        if (j5 == 0 && this.f24700b == 0) {
            return j2;
        }
        long d2 = xp.d(j2, j5, Long.MIN_VALUE);
        long a2 = xp.a(j2, this.f24700b, Long.MAX_VALUE);
        boolean z2 = false;
        boolean z3 = d2 <= j3 && j3 <= a2;
        if (d2 <= j4 && j4 <= a2) {
            z2 = true;
        }
        return (z3 && z2) ? Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4 : z3 ? j3 : z2 ? j4 : d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jj.class != obj.getClass()) {
            return false;
        }
        jj jjVar = (jj) obj;
        return this.f24699a == jjVar.f24699a && this.f24700b == jjVar.f24700b;
    }

    public int hashCode() {
        return (((int) this.f24699a) * 31) + ((int) this.f24700b);
    }
}

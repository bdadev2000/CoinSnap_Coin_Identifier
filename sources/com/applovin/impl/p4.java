package com.applovin.impl;

import com.applovin.impl.ij;

/* loaded from: classes.dex */
public class p4 implements ij {

    /* renamed from: a, reason: collision with root package name */
    private final long f25957a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25958b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25959c;
    private final long d;
    private final int e;

    /* renamed from: f, reason: collision with root package name */
    private final long f25960f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25961g;

    public p4(long j2, long j3, int i2, int i3, boolean z2) {
        this.f25957a = j2;
        this.f25958b = j3;
        this.f25959c = i3 == -1 ? 1 : i3;
        this.e = i2;
        this.f25961g = z2;
        if (j2 == -1) {
            this.d = -1L;
            this.f25960f = -9223372036854775807L;
        } else {
            this.d = j2 - j3;
            this.f25960f = a(j2, j3, i2);
        }
    }

    private static long a(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / i2;
    }

    private long c(long j2) {
        long j3 = this.f25959c;
        long j4 = (((j2 * this.e) / 8000000) / j3) * j3;
        long j5 = this.d;
        if (j5 != -1) {
            j4 = Math.min(j4, j5 - j3);
        }
        return this.f25958b + Math.max(j4, 0L);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.d != -1 || this.f25961g;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f25960f;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        if (this.d == -1 && !this.f25961g) {
            return new ij.a(new kj(0L, this.f25958b));
        }
        long c2 = c(j2);
        long d = d(c2);
        kj kjVar = new kj(d, c2);
        if (this.d != -1 && d < j2) {
            long j3 = c2 + this.f25959c;
            if (j3 < this.f25957a) {
                return new ij.a(kjVar, new kj(d(j3), j3));
            }
        }
        return new ij.a(kjVar);
    }

    public long d(long j2) {
        return a(j2, this.f25958b, this.e);
    }
}

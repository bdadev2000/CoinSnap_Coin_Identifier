package com.applovin.impl;

import com.applovin.impl.ij;

/* loaded from: classes2.dex */
final class or implements ij {

    /* renamed from: a, reason: collision with root package name */
    private final mr f25935a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25936b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25937c;
    private final long d;
    private final long e;

    public or(mr mrVar, int i2, long j2, long j3) {
        this.f25935a = mrVar;
        this.f25936b = i2;
        this.f25937c = j2;
        long j4 = (j3 - j2) / mrVar.e;
        this.d = j4;
        this.e = c(j4);
    }

    private long c(long j2) {
        return xp.c(j2 * this.f25936b, 1000000L, this.f25935a.f25607c);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.e;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        long b2 = xp.b((this.f25935a.f25607c * j2) / (this.f25936b * 1000000), 0L, this.d - 1);
        long j3 = (this.f25935a.e * b2) + this.f25937c;
        long c2 = c(b2);
        kj kjVar = new kj(c2, j3);
        if (c2 < j2 && b2 != this.d - 1) {
            long j4 = b2 + 1;
            return new ij.a(kjVar, new kj(c(j4), (this.f25935a.e * j4) + this.f25937c));
        }
        return new ij.a(kjVar);
    }
}

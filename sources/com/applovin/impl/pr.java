package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
final class pr implements ej {
    private final nr a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7013b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7014c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7015d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7016e;

    public pr(nr nrVar, int i10, long j3, long j10) {
        this.a = nrVar;
        this.f7013b = i10;
        this.f7014c = j3;
        long j11 = (j10 - j3) / nrVar.f6432e;
        this.f7015d = j11;
        this.f7016e = c(j11);
    }

    private long c(long j3) {
        return yp.c(j3 * this.f7013b, 1000000L, this.a.f6430c);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f7016e;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        long b3 = yp.b((this.a.f6430c * j3) / (this.f7013b * 1000000), 0L, this.f7015d - 1);
        long j10 = (this.a.f6432e * b3) + this.f7014c;
        long c10 = c(b3);
        gj gjVar = new gj(c10, j10);
        if (c10 < j3 && b3 != this.f7015d - 1) {
            long j11 = b3 + 1;
            return new ej.a(gjVar, new gj(c(j11), (this.a.f6432e * j11) + this.f7014c));
        }
        return new ej.a(gjVar);
    }
}

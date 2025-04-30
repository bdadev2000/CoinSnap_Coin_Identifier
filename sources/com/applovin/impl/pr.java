package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
final class pr implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final nr f10078a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10079c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10080d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10081e;

    public pr(nr nrVar, int i9, long j7, long j9) {
        this.f10078a = nrVar;
        this.b = i9;
        this.f10079c = j7;
        long j10 = (j9 - j7) / nrVar.f9370e;
        this.f10080d = j10;
        this.f10081e = c(j10);
    }

    private long c(long j7) {
        return yp.c(j7 * this.b, 1000000L, this.f10078a.f9368c);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f10081e;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        long b = yp.b((this.f10078a.f9368c * j7) / (this.b * 1000000), 0L, this.f10080d - 1);
        long j9 = (this.f10078a.f9370e * b) + this.f10079c;
        long c9 = c(b);
        gj gjVar = new gj(c9, j9);
        if (c9 < j7 && b != this.f10080d - 1) {
            long j10 = b + 1;
            return new ej.a(gjVar, new gj(c(j10), (this.f10078a.f9370e * j10) + this.f10079c));
        }
        return new ej.a(gjVar);
    }
}

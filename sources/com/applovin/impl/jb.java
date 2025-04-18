package com.applovin.impl;

import com.applovin.impl.ej;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class jb implements hj {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final mc f5466b;

    /* renamed from: c, reason: collision with root package name */
    private final mc f5467c;

    /* renamed from: d, reason: collision with root package name */
    private long f5468d;

    public jb(long j3, long j10, long j11) {
        this.f5468d = j3;
        this.a = j11;
        mc mcVar = new mc();
        this.f5466b = mcVar;
        mc mcVar2 = new mc();
        this.f5467c = mcVar2;
        mcVar.a(0L);
        mcVar2.a(j10);
    }

    @Override // com.applovin.impl.hj
    public long a(long j3) {
        return this.f5466b.a(yp.a(this.f5467c, j3, true, true));
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.a;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f5468d;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        int a = yp.a(this.f5466b, j3, true, true);
        gj gjVar = new gj(this.f5466b.a(a), this.f5467c.a(a));
        if (gjVar.a != j3 && a != this.f5466b.a() - 1) {
            int i10 = a + 1;
            return new ej.a(gjVar, new gj(this.f5466b.a(i10), this.f5467c.a(i10)));
        }
        return new ej.a(gjVar);
    }

    public boolean c(long j3) {
        mc mcVar = this.f5466b;
        return j3 - mcVar.a(mcVar.a() - 1) < 100000;
    }

    public void d(long j3) {
        this.f5468d = j3;
    }

    public void a(long j3, long j10) {
        if (c(j3)) {
            return;
        }
        this.f5466b.a(j3);
        this.f5467c.a(j10);
    }
}

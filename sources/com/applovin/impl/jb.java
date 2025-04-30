package com.applovin.impl;

import com.applovin.impl.ej;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class jb implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long f8423a;
    private final mc b;

    /* renamed from: c, reason: collision with root package name */
    private final mc f8424c;

    /* renamed from: d, reason: collision with root package name */
    private long f8425d;

    public jb(long j7, long j9, long j10) {
        this.f8425d = j7;
        this.f8423a = j10;
        mc mcVar = new mc();
        this.b = mcVar;
        mc mcVar2 = new mc();
        this.f8424c = mcVar2;
        mcVar.a(0L);
        mcVar2.a(j9);
    }

    @Override // com.applovin.impl.hj
    public long a(long j7) {
        return this.b.a(yp.a(this.f8424c, j7, true, true));
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.f8423a;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f8425d;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        int a6 = yp.a(this.b, j7, true, true);
        gj gjVar = new gj(this.b.a(a6), this.f8424c.a(a6));
        if (gjVar.f7918a != j7 && a6 != this.b.a() - 1) {
            int i9 = a6 + 1;
            return new ej.a(gjVar, new gj(this.b.a(i9), this.f8424c.a(i9)));
        }
        return new ej.a(gjVar);
    }

    public boolean c(long j7) {
        mc mcVar = this.b;
        return j7 - mcVar.a(mcVar.a() - 1) < 100000;
    }

    public void d(long j7) {
        this.f8425d = j7;
    }

    public void a(long j7, long j9) {
        if (c(j7)) {
            return;
        }
        this.b.a(j7);
        this.f8424c.a(j9);
    }
}

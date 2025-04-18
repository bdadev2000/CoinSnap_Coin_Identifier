package com.applovin.impl;

import com.applovin.impl.ij;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class nb implements lj {

    /* renamed from: a, reason: collision with root package name */
    private final long f25688a;

    /* renamed from: b, reason: collision with root package name */
    private final rc f25689b;

    /* renamed from: c, reason: collision with root package name */
    private final rc f25690c;
    private long d;

    public nb(long j2, long j3, long j4) {
        this.d = j2;
        this.f25688a = j4;
        rc rcVar = new rc();
        this.f25689b = rcVar;
        rc rcVar2 = new rc();
        this.f25690c = rcVar2;
        rcVar.a(0L);
        rcVar2.a(j3);
    }

    @Override // com.applovin.impl.lj
    public long a(long j2) {
        return this.f25689b.a(xp.a(this.f25690c, j2, true, true));
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return this.f25688a;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.d;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        int a2 = xp.a(this.f25689b, j2, true, true);
        kj kjVar = new kj(this.f25689b.a(a2), this.f25690c.a(a2));
        if (kjVar.f24923a != j2 && a2 != this.f25689b.a() - 1) {
            int i2 = a2 + 1;
            return new ij.a(kjVar, new kj(this.f25689b.a(i2), this.f25690c.a(i2)));
        }
        return new ij.a(kjVar);
    }

    public boolean c(long j2) {
        rc rcVar = this.f25689b;
        return j2 - rcVar.a(rcVar.a() - 1) < 100000;
    }

    public void d(long j2) {
        this.d = j2;
    }

    public void a(long j2, long j3) {
        if (c(j2)) {
            return;
        }
        this.f25689b.a(j2);
        this.f25690c.a(j3);
    }
}

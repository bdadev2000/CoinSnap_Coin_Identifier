package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
public abstract class pl extends wg implements kl {

    /* renamed from: d, reason: collision with root package name */
    private kl f6989d;

    /* renamed from: f, reason: collision with root package name */
    private long f6990f;

    @Override // com.applovin.impl.kl
    public long a(int i10) {
        return ((kl) a1.a(this.f6989d)).a(i10) + this.f6990f;
    }

    @Override // com.applovin.impl.j2
    public void b() {
        super.b();
        this.f6989d = null;
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return ((kl) a1.a(this.f6989d)).a();
    }

    @Override // com.applovin.impl.kl
    public int a(long j3) {
        return ((kl) a1.a(this.f6989d)).a(j3 - this.f6990f);
    }

    @Override // com.applovin.impl.kl
    public List b(long j3) {
        return ((kl) a1.a(this.f6989d)).b(j3 - this.f6990f);
    }

    public void a(long j3, kl klVar, long j10) {
        this.f8769b = j3;
        this.f6989d = klVar;
        if (j10 != Long.MAX_VALUE) {
            j3 = j10;
        }
        this.f6990f = j3;
    }
}

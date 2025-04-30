package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
public abstract class pl extends wg implements kl {

    /* renamed from: d, reason: collision with root package name */
    private kl f10054d;

    /* renamed from: f, reason: collision with root package name */
    private long f10055f;

    @Override // com.applovin.impl.kl
    public long a(int i9) {
        return ((kl) AbstractC0669a1.a(this.f10054d)).a(i9) + this.f10055f;
    }

    @Override // com.applovin.impl.AbstractC0713j2
    public void b() {
        super.b();
        this.f10054d = null;
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return ((kl) AbstractC0669a1.a(this.f10054d)).a();
    }

    @Override // com.applovin.impl.kl
    public int a(long j7) {
        return ((kl) AbstractC0669a1.a(this.f10054d)).a(j7 - this.f10055f);
    }

    @Override // com.applovin.impl.kl
    public List b(long j7) {
        return ((kl) AbstractC0669a1.a(this.f10054d)).b(j7 - this.f10055f);
    }

    public void a(long j7, kl klVar, long j9) {
        this.b = j7;
        this.f10054d = klVar;
        if (j9 != Long.MAX_VALUE) {
            j7 = j9;
        }
        this.f10055f = j7;
    }
}

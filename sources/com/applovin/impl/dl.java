package com.applovin.impl;

/* loaded from: classes3.dex */
final class dl extends h9 {

    /* renamed from: b, reason: collision with root package name */
    private final long f23499b;

    public dl(l8 l8Var, long j2) {
        super(l8Var);
        b1.a(l8Var.f() >= j2);
        this.f23499b = j2;
    }

    @Override // com.applovin.impl.h9, com.applovin.impl.l8
    public long a() {
        return super.a() - this.f23499b;
    }

    @Override // com.applovin.impl.h9, com.applovin.impl.l8
    public long d() {
        return super.d() - this.f23499b;
    }

    @Override // com.applovin.impl.h9, com.applovin.impl.l8
    public long f() {
        return super.f() - this.f23499b;
    }
}

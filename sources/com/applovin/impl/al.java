package com.applovin.impl;

/* loaded from: classes.dex */
final class al extends f9 {

    /* renamed from: b, reason: collision with root package name */
    private final long f3760b;

    public al(j8 j8Var, long j3) {
        super(j8Var);
        boolean z10;
        if (j8Var.f() >= j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        this.f3760b = j3;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long a() {
        return super.a() - this.f3760b;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long d() {
        return super.d() - this.f3760b;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long f() {
        return super.f() - this.f3760b;
    }
}

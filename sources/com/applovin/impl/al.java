package com.applovin.impl;

/* loaded from: classes.dex */
final class al extends f9 {
    private final long b;

    public al(j8 j8Var, long j7) {
        super(j8Var);
        boolean z8;
        if (j8Var.f() >= j7) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        this.b = j7;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long a() {
        return super.a() - this.b;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long d() {
        return super.d() - this.b;
    }

    @Override // com.applovin.impl.f9, com.applovin.impl.j8
    public long f() {
        return super.f() - this.b;
    }
}

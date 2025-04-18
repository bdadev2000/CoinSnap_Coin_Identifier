package com.applovin.impl;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class sl extends zg implements nl {
    private nl d;

    /* renamed from: f, reason: collision with root package name */
    private long f26966f;

    public void a(long j2, nl nlVar, long j3) {
        this.f28347b = j2;
        this.d = nlVar;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.f26966f = j2;
    }

    @Override // com.applovin.impl.l2
    public void b() {
        super.b();
        this.d = null;
    }

    @Override // com.applovin.impl.nl
    public long a(int i2) {
        return ((nl) b1.a(this.d)).a(i2) + this.f26966f;
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        return ((nl) b1.a(this.d)).b(j2 - this.f26966f);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return ((nl) b1.a(this.d)).a();
    }

    @Override // com.applovin.impl.nl
    public int a(long j2) {
        return ((nl) b1.a(this.d)).a(j2 - this.f26966f);
    }
}

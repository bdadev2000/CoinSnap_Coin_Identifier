package com.applovin.impl;

/* loaded from: classes3.dex */
public final class bl implements gd {

    /* renamed from: a, reason: collision with root package name */
    private final l3 f23119a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23120b;

    /* renamed from: c, reason: collision with root package name */
    private long f23121c;
    private long d;

    /* renamed from: f, reason: collision with root package name */
    private ph f23122f = ph.d;

    public bl(l3 l3Var) {
        this.f23119a = l3Var;
    }

    @Override // com.applovin.impl.gd
    public ph a() {
        return this.f23122f;
    }

    public void b() {
        if (this.f23120b) {
            return;
        }
        this.d = this.f23119a.c();
        this.f23120b = true;
    }

    public void c() {
        if (this.f23120b) {
            a(p());
            this.f23120b = false;
        }
    }

    @Override // com.applovin.impl.gd
    public long p() {
        long j2 = this.f23121c;
        if (!this.f23120b) {
            return j2;
        }
        long c2 = this.f23119a.c() - this.d;
        ph phVar = this.f23122f;
        return j2 + (phVar.f26059a == 1.0f ? t2.a(c2) : phVar.a(c2));
    }

    public void a(long j2) {
        this.f23121c = j2;
        if (this.f23120b) {
            this.d = this.f23119a.c();
        }
    }

    @Override // com.applovin.impl.gd
    public void a(ph phVar) {
        if (this.f23120b) {
            a(p());
        }
        this.f23122f = phVar;
    }
}

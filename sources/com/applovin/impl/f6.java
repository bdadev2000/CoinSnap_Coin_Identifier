package com.applovin.impl;

/* loaded from: classes.dex */
final class f6 implements bd {
    private final yk a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4609b;

    /* renamed from: c, reason: collision with root package name */
    private li f4610c;

    /* renamed from: d, reason: collision with root package name */
    private bd f4611d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4612f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4613g;

    /* loaded from: classes.dex */
    public interface a {
        void a(mh mhVar);
    }

    public f6(a aVar, j3 j3Var) {
        this.f4609b = aVar;
        this.a = new yk(j3Var);
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        bd bdVar = this.f4611d;
        if (bdVar != null) {
            return bdVar.a();
        }
        return this.a.a();
    }

    public void b(li liVar) {
        bd bdVar;
        bd l10 = liVar.l();
        if (l10 == null || l10 == (bdVar = this.f4611d)) {
            return;
        }
        if (bdVar == null) {
            this.f4611d = l10;
            this.f4610c = liVar;
            l10.a(this.a.a());
            return;
        }
        throw y7.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    public void c() {
        this.f4613g = false;
        this.a.c();
    }

    @Override // com.applovin.impl.bd
    public long p() {
        if (this.f4612f) {
            return this.a.p();
        }
        return ((bd) a1.a(this.f4611d)).p();
    }

    private void c(boolean z10) {
        if (a(z10)) {
            this.f4612f = true;
            if (this.f4613g) {
                this.a.b();
                return;
            }
            return;
        }
        bd bdVar = (bd) a1.a(this.f4611d);
        long p10 = bdVar.p();
        if (this.f4612f) {
            if (p10 < this.a.p()) {
                this.a.c();
                return;
            } else {
                this.f4612f = false;
                if (this.f4613g) {
                    this.a.b();
                }
            }
        }
        this.a.a(p10);
        mh a10 = bdVar.a();
        if (a10.equals(this.a.a())) {
            return;
        }
        this.a.a(a10);
        this.f4609b.a(a10);
    }

    public void a(li liVar) {
        if (liVar == this.f4610c) {
            this.f4611d = null;
            this.f4610c = null;
            this.f4612f = true;
        }
    }

    public void b() {
        this.f4613g = true;
        this.a.b();
    }

    public void a(long j3) {
        this.a.a(j3);
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        bd bdVar = this.f4611d;
        if (bdVar != null) {
            bdVar.a(mhVar);
            mhVar = this.f4611d.a();
        }
        this.a.a(mhVar);
    }

    public long b(boolean z10) {
        c(z10);
        return p();
    }

    private boolean a(boolean z10) {
        li liVar = this.f4610c;
        return liVar == null || liVar.c() || (!this.f4610c.d() && (z10 || this.f4610c.j()));
    }
}

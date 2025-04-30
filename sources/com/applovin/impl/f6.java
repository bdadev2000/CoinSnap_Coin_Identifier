package com.applovin.impl;

/* loaded from: classes.dex */
final class f6 implements bd {

    /* renamed from: a, reason: collision with root package name */
    private final yk f7562a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private li f7563c;

    /* renamed from: d, reason: collision with root package name */
    private bd f7564d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7565f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7566g;

    /* loaded from: classes.dex */
    public interface a {
        void a(mh mhVar);
    }

    public f6(a aVar, j3 j3Var) {
        this.b = aVar;
        this.f7562a = new yk(j3Var);
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        bd bdVar = this.f7564d;
        if (bdVar != null) {
            return bdVar.a();
        }
        return this.f7562a.a();
    }

    public void b(li liVar) {
        bd bdVar;
        bd l = liVar.l();
        if (l == null || l == (bdVar = this.f7564d)) {
            return;
        }
        if (bdVar == null) {
            this.f7564d = l;
            this.f7563c = liVar;
            l.a(this.f7562a.a());
            return;
        }
        throw y7.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    public void c() {
        this.f7566g = false;
        this.f7562a.c();
    }

    @Override // com.applovin.impl.bd
    public long p() {
        if (this.f7565f) {
            return this.f7562a.p();
        }
        return ((bd) AbstractC0669a1.a(this.f7564d)).p();
    }

    private void c(boolean z8) {
        if (a(z8)) {
            this.f7565f = true;
            if (this.f7566g) {
                this.f7562a.b();
                return;
            }
            return;
        }
        bd bdVar = (bd) AbstractC0669a1.a(this.f7564d);
        long p2 = bdVar.p();
        if (this.f7565f) {
            if (p2 < this.f7562a.p()) {
                this.f7562a.c();
                return;
            } else {
                this.f7565f = false;
                if (this.f7566g) {
                    this.f7562a.b();
                }
            }
        }
        this.f7562a.a(p2);
        mh a6 = bdVar.a();
        if (a6.equals(this.f7562a.a())) {
            return;
        }
        this.f7562a.a(a6);
        this.b.a(a6);
    }

    public void a(li liVar) {
        if (liVar == this.f7563c) {
            this.f7564d = null;
            this.f7563c = null;
            this.f7565f = true;
        }
    }

    public void b() {
        this.f7566g = true;
        this.f7562a.b();
    }

    public void a(long j7) {
        this.f7562a.a(j7);
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        bd bdVar = this.f7564d;
        if (bdVar != null) {
            bdVar.a(mhVar);
            mhVar = this.f7564d.a();
        }
        this.f7562a.a(mhVar);
    }

    public long b(boolean z8) {
        c(z8);
        return p();
    }

    private boolean a(boolean z8) {
        li liVar = this.f7563c;
        return liVar == null || liVar.c() || (!this.f7563c.d() && (z8 || this.f7563c.j()));
    }
}

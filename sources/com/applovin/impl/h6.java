package com.applovin.impl;

/* loaded from: classes3.dex */
final class h6 implements gd {

    /* renamed from: a, reason: collision with root package name */
    private final bl f24228a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24229b;

    /* renamed from: c, reason: collision with root package name */
    private qi f24230c;
    private gd d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24231f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24232g;

    /* loaded from: classes3.dex */
    public interface a {
        void a(ph phVar);
    }

    public h6(a aVar, l3 l3Var) {
        this.f24229b = aVar;
        this.f24228a = new bl(l3Var);
    }

    public void a(qi qiVar) {
        if (qiVar == this.f24230c) {
            this.d = null;
            this.f24230c = null;
            this.f24231f = true;
        }
    }

    public void b(qi qiVar) {
        gd gdVar;
        gd l2 = qiVar.l();
        if (l2 == null || l2 == (gdVar = this.d)) {
            return;
        }
        if (gdVar == null) {
            this.d = l2;
            this.f24230c = qiVar;
            l2.a(this.f24228a.a());
            return;
        }
        throw a8.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    public void c() {
        this.f24232g = false;
        this.f24228a.c();
    }

    @Override // com.applovin.impl.gd
    public long p() {
        return this.f24231f ? this.f24228a.p() : ((gd) b1.a(this.d)).p();
    }

    private void c(boolean z2) {
        if (a(z2)) {
            this.f24231f = true;
            if (this.f24232g) {
                this.f24228a.b();
                return;
            }
            return;
        }
        gd gdVar = (gd) b1.a(this.d);
        long p2 = gdVar.p();
        if (this.f24231f) {
            if (p2 < this.f24228a.p()) {
                this.f24228a.c();
                return;
            } else {
                this.f24231f = false;
                if (this.f24232g) {
                    this.f24228a.b();
                }
            }
        }
        this.f24228a.a(p2);
        ph a2 = gdVar.a();
        if (a2.equals(this.f24228a.a())) {
            return;
        }
        this.f24228a.a(a2);
        this.f24229b.a(a2);
    }

    @Override // com.applovin.impl.gd
    public ph a() {
        gd gdVar = this.d;
        if (gdVar != null) {
            return gdVar.a();
        }
        return this.f24228a.a();
    }

    public void a(long j2) {
        this.f24228a.a(j2);
    }

    public void b() {
        this.f24232g = true;
        this.f24228a.b();
    }

    @Override // com.applovin.impl.gd
    public void a(ph phVar) {
        gd gdVar = this.d;
        if (gdVar != null) {
            gdVar.a(phVar);
            phVar = this.d.a();
        }
        this.f24228a.a(phVar);
    }

    public long b(boolean z2) {
        c(z2);
        return p();
    }

    private boolean a(boolean z2) {
        qi qiVar = this.f24230c;
        return qiVar == null || qiVar.c() || (!this.f24230c.d() && (z2 || this.f24230c.j()));
    }
}

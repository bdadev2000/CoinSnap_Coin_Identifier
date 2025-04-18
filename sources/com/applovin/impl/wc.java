package com.applovin.impl;

import com.applovin.impl.be;
import com.applovin.impl.wd;

/* loaded from: classes2.dex */
public final class wc implements wd, wd.a {

    /* renamed from: a, reason: collision with root package name */
    public final be.a f27712a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27713b;

    /* renamed from: c, reason: collision with root package name */
    private final n0 f27714c;
    private be d;

    /* renamed from: f, reason: collision with root package name */
    private wd f27715f;

    /* renamed from: g, reason: collision with root package name */
    private wd.a f27716g;

    /* renamed from: h, reason: collision with root package name */
    private long f27717h = -9223372036854775807L;

    public wc(be.a aVar, n0 n0Var, long j2) {
        this.f27712a = aVar;
        this.f27714c = n0Var;
        this.f27713b = j2;
    }

    public void a(be.a aVar) {
        long d = d(this.f27713b);
        wd a2 = ((be) b1.a(this.d)).a(aVar, this.f27714c, d);
        this.f27715f = a2;
        if (this.f27716g != null) {
            a2.a(this, d);
        }
    }

    @Override // com.applovin.impl.wd
    public boolean b(long j2) {
        wd wdVar = this.f27715f;
        return wdVar != null && wdVar.b(j2);
    }

    public long c() {
        return this.f27717h;
    }

    public long d() {
        return this.f27713b;
    }

    public void e(long j2) {
        this.f27717h = j2;
    }

    @Override // com.applovin.impl.wd
    public void f() {
        wd wdVar = this.f27715f;
        if (wdVar != null) {
            wdVar.f();
            return;
        }
        be beVar = this.d;
        if (beVar != null) {
            beVar.b();
        }
    }

    @Override // com.applovin.impl.wd
    public long g() {
        return ((wd) xp.a(this.f27715f)).g();
    }

    @Override // com.applovin.impl.wd
    public long h() {
        return ((wd) xp.a(this.f27715f)).h();
    }

    public void i() {
        if (this.f27715f != null) {
            ((be) b1.a(this.d)).a(this.f27715f);
        }
    }

    private long d(long j2) {
        long j3 = this.f27717h;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // com.applovin.impl.wd
    public po b() {
        return ((wd) xp.a(this.f27715f)).b();
    }

    @Override // com.applovin.impl.wd
    public void c(long j2) {
        ((wd) xp.a(this.f27715f)).c(j2);
    }

    @Override // com.applovin.impl.wd
    public long e() {
        return ((wd) xp.a(this.f27715f)).e();
    }

    @Override // com.applovin.impl.pj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(wd wdVar) {
        ((wd.a) xp.a(this.f27716g)).a((pj) this);
    }

    @Override // com.applovin.impl.wd
    public void a(long j2, boolean z2) {
        ((wd) xp.a(this.f27715f)).a(j2, z2);
    }

    @Override // com.applovin.impl.wd
    public long a(long j2, jj jjVar) {
        return ((wd) xp.a(this.f27715f)).a(j2, jjVar);
    }

    @Override // com.applovin.impl.wd
    public boolean a() {
        wd wdVar = this.f27715f;
        return wdVar != null && wdVar.a();
    }

    @Override // com.applovin.impl.wd.a
    public void a(wd wdVar) {
        ((wd.a) xp.a(this.f27716g)).a((wd) this);
    }

    @Override // com.applovin.impl.wd
    public void a(wd.a aVar, long j2) {
        this.f27716g = aVar;
        wd wdVar = this.f27715f;
        if (wdVar != null) {
            wdVar.a(this, d(this.f27713b));
        }
    }

    @Override // com.applovin.impl.wd
    public long a(long j2) {
        return ((wd) xp.a(this.f27715f)).a(j2);
    }

    @Override // com.applovin.impl.wd
    public long a(h8[] h8VarArr, boolean[] zArr, cj[] cjVarArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f27717h;
        if (j4 == -9223372036854775807L || j2 != this.f27713b) {
            j3 = j2;
        } else {
            this.f27717h = -9223372036854775807L;
            j3 = j4;
        }
        return ((wd) xp.a(this.f27715f)).a(h8VarArr, zArr, cjVarArr, zArr2, j3);
    }

    public void a(be beVar) {
        b1.b(this.d == null);
        this.d = beVar;
    }
}

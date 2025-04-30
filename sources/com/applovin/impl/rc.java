package com.applovin.impl;

import com.applovin.impl.rd;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public final class rc implements rd, rd.a {

    /* renamed from: a, reason: collision with root package name */
    public final wd.a f10482a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0727n0 f10483c;

    /* renamed from: d, reason: collision with root package name */
    private wd f10484d;

    /* renamed from: f, reason: collision with root package name */
    private rd f10485f;

    /* renamed from: g, reason: collision with root package name */
    private rd.a f10486g;

    /* renamed from: h, reason: collision with root package name */
    private long f10487h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public rc(wd.a aVar, InterfaceC0727n0 interfaceC0727n0, long j7) {
        this.f10482a = aVar;
        this.f10483c = interfaceC0727n0;
        this.b = j7;
    }

    public void a(wd.a aVar) {
        long d2 = d(this.b);
        rd a6 = ((wd) AbstractC0669a1.a(this.f10484d)).a(aVar, this.f10483c, d2);
        this.f10485f = a6;
        if (this.f10486g != null) {
            a6.a(this, d2);
        }
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j7) {
        rd rdVar = this.f10485f;
        return rdVar != null && rdVar.b(j7);
    }

    public long c() {
        return this.f10487h;
    }

    public long d() {
        return this.b;
    }

    @Override // com.applovin.impl.rd
    public long e() {
        return ((rd) yp.a(this.f10485f)).e();
    }

    @Override // com.applovin.impl.rd
    public void f() {
        rd rdVar = this.f10485f;
        if (rdVar != null) {
            rdVar.f();
            return;
        }
        wd wdVar = this.f10484d;
        if (wdVar != null) {
            wdVar.b();
        }
    }

    @Override // com.applovin.impl.rd
    public long g() {
        return ((rd) yp.a(this.f10485f)).g();
    }

    @Override // com.applovin.impl.rd
    public long h() {
        return ((rd) yp.a(this.f10485f)).h();
    }

    public void i() {
        if (this.f10485f != null) {
            ((wd) AbstractC0669a1.a(this.f10484d)).a(this.f10485f);
        }
    }

    private long d(long j7) {
        long j9 = this.f10487h;
        return j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j9 : j7;
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        return ((rd) yp.a(this.f10485f)).b();
    }

    @Override // com.applovin.impl.rd
    public void c(long j7) {
        ((rd) yp.a(this.f10485f)).c(j7);
    }

    public void e(long j7) {
        this.f10487h = j7;
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(rd rdVar) {
        ((rd.a) yp.a(this.f10486g)).a((lj) this);
    }

    @Override // com.applovin.impl.rd
    public void a(long j7, boolean z8) {
        ((rd) yp.a(this.f10485f)).a(j7, z8);
    }

    @Override // com.applovin.impl.rd
    public long a(long j7, fj fjVar) {
        return ((rd) yp.a(this.f10485f)).a(j7, fjVar);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        rd rdVar = this.f10485f;
        return rdVar != null && rdVar.a();
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        ((rd.a) yp.a(this.f10486g)).a((rd) this);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j7) {
        this.f10486g = aVar;
        rd rdVar = this.f10485f;
        if (rdVar != null) {
            rdVar.a(this, d(this.b));
        }
    }

    @Override // com.applovin.impl.rd
    public long a(long j7) {
        return ((rd) yp.a(this.f10485f)).a(j7);
    }

    @Override // com.applovin.impl.rd
    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j7) {
        long j9;
        long j10 = this.f10487h;
        if (j10 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j7 != this.b) {
            j9 = j7;
        } else {
            this.f10487h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            j9 = j10;
        }
        return ((rd) yp.a(this.f10485f)).a(f8VarArr, zArr, yiVarArr, zArr2, j9);
    }

    public void a(wd wdVar) {
        AbstractC0669a1.b(this.f10484d == null);
        this.f10484d = wdVar;
    }
}

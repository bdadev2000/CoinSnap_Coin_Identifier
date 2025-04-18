package com.applovin.impl;

import com.applovin.impl.rd;
import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class rc implements rd, rd.a {
    public final wd.a a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7348b;

    /* renamed from: c, reason: collision with root package name */
    private final n0 f7349c;

    /* renamed from: d, reason: collision with root package name */
    private wd f7350d;

    /* renamed from: f, reason: collision with root package name */
    private rd f7351f;

    /* renamed from: g, reason: collision with root package name */
    private rd.a f7352g;

    /* renamed from: h, reason: collision with root package name */
    private long f7353h = C.TIME_UNSET;

    public rc(wd.a aVar, n0 n0Var, long j3) {
        this.a = aVar;
        this.f7349c = n0Var;
        this.f7348b = j3;
    }

    public void a(wd.a aVar) {
        long d10 = d(this.f7348b);
        rd a = ((wd) a1.a(this.f7350d)).a(aVar, this.f7349c, d10);
        this.f7351f = a;
        if (this.f7352g != null) {
            a.a(this, d10);
        }
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j3) {
        rd rdVar = this.f7351f;
        return rdVar != null && rdVar.b(j3);
    }

    public long c() {
        return this.f7353h;
    }

    public long d() {
        return this.f7348b;
    }

    @Override // com.applovin.impl.rd
    public long e() {
        return ((rd) yp.a(this.f7351f)).e();
    }

    @Override // com.applovin.impl.rd
    public void f() {
        rd rdVar = this.f7351f;
        if (rdVar != null) {
            rdVar.f();
            return;
        }
        wd wdVar = this.f7350d;
        if (wdVar != null) {
            wdVar.b();
        }
    }

    @Override // com.applovin.impl.rd
    public long g() {
        return ((rd) yp.a(this.f7351f)).g();
    }

    @Override // com.applovin.impl.rd
    public long h() {
        return ((rd) yp.a(this.f7351f)).h();
    }

    public void i() {
        if (this.f7351f != null) {
            ((wd) a1.a(this.f7350d)).a(this.f7351f);
        }
    }

    private long d(long j3) {
        long j10 = this.f7353h;
        return j10 != C.TIME_UNSET ? j10 : j3;
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        return ((rd) yp.a(this.f7351f)).b();
    }

    @Override // com.applovin.impl.rd
    public void c(long j3) {
        ((rd) yp.a(this.f7351f)).c(j3);
    }

    public void e(long j3) {
        this.f7353h = j3;
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(rd rdVar) {
        ((rd.a) yp.a(this.f7352g)).a((lj) this);
    }

    @Override // com.applovin.impl.rd
    public void a(long j3, boolean z10) {
        ((rd) yp.a(this.f7351f)).a(j3, z10);
    }

    @Override // com.applovin.impl.rd
    public long a(long j3, fj fjVar) {
        return ((rd) yp.a(this.f7351f)).a(j3, fjVar);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        rd rdVar = this.f7351f;
        return rdVar != null && rdVar.a();
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        ((rd.a) yp.a(this.f7352g)).a((rd) this);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j3) {
        this.f7352g = aVar;
        rd rdVar = this.f7351f;
        if (rdVar != null) {
            rdVar.a(this, d(this.f7348b));
        }
    }

    @Override // com.applovin.impl.rd
    public long a(long j3) {
        return ((rd) yp.a(this.f7351f)).a(j3);
    }

    @Override // com.applovin.impl.rd
    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.f7353h;
        if (j11 == C.TIME_UNSET || j3 != this.f7348b) {
            j10 = j3;
        } else {
            this.f7353h = C.TIME_UNSET;
            j10 = j11;
        }
        return ((rd) yp.a(this.f7351f)).a(f8VarArr, zArr, yiVarArr, zArr2, j10);
    }

    public void a(wd wdVar) {
        a1.b(this.f7350d == null);
        this.f7350d = wdVar;
    }
}

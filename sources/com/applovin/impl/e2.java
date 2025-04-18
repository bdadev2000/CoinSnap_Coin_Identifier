package com.applovin.impl;

/* loaded from: classes3.dex */
public abstract class e2 implements qi, ri {

    /* renamed from: a, reason: collision with root package name */
    private final int f23563a;

    /* renamed from: c, reason: collision with root package name */
    private si f23565c;
    private int d;

    /* renamed from: f, reason: collision with root package name */
    private int f23566f;

    /* renamed from: g, reason: collision with root package name */
    private cj f23567g;

    /* renamed from: h, reason: collision with root package name */
    private f9[] f23568h;

    /* renamed from: i, reason: collision with root package name */
    private long f23569i;

    /* renamed from: j, reason: collision with root package name */
    private long f23570j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23572l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23573m;

    /* renamed from: b, reason: collision with root package name */
    private final g9 f23564b = new g9();

    /* renamed from: k, reason: collision with root package name */
    private long f23571k = Long.MIN_VALUE;

    public e2(int i2) {
        this.f23563a = i2;
    }

    @Override // com.applovin.impl.rh.b
    public void a(int i2, Object obj) {
    }

    public abstract void a(long j2, boolean z2);

    public abstract void a(f9[] f9VarArr, long j2, long j3);

    @Override // com.applovin.impl.qi
    public final int b() {
        return this.f23566f;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public final int e() {
        return this.f23563a;
    }

    @Override // com.applovin.impl.qi
    public final void f() {
        b1.b(this.f23566f == 1);
        this.f23564b.a();
        this.f23566f = 0;
        this.f23567g = null;
        this.f23568h = null;
        this.f23572l = false;
        v();
    }

    @Override // com.applovin.impl.qi
    public final void g() {
        this.f23572l = true;
    }

    @Override // com.applovin.impl.qi
    public final void h() {
        ((cj) b1.a(this.f23567g)).a();
    }

    @Override // com.applovin.impl.qi
    public final long i() {
        return this.f23571k;
    }

    @Override // com.applovin.impl.qi
    public final boolean j() {
        return this.f23571k == Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.qi
    public final boolean k() {
        return this.f23572l;
    }

    @Override // com.applovin.impl.qi
    public gd l() {
        return null;
    }

    @Override // com.applovin.impl.ri
    public int m() {
        return 0;
    }

    @Override // com.applovin.impl.qi
    public final ri n() {
        return this;
    }

    @Override // com.applovin.impl.qi
    public final cj o() {
        return this.f23567g;
    }

    public final si q() {
        return (si) b1.a(this.f23565c);
    }

    public final g9 r() {
        this.f23564b.a();
        return this.f23564b;
    }

    @Override // com.applovin.impl.qi
    public final void reset() {
        b1.b(this.f23566f == 0);
        this.f23564b.a();
        w();
    }

    public final int s() {
        return this.d;
    }

    @Override // com.applovin.impl.qi
    public final void start() {
        b1.b(this.f23566f == 1);
        this.f23566f = 2;
        x();
    }

    @Override // com.applovin.impl.qi
    public final void stop() {
        b1.b(this.f23566f == 2);
        this.f23566f = 1;
        y();
    }

    public final f9[] t() {
        return (f9[]) b1.a(this.f23568h);
    }

    public final boolean u() {
        return j() ? this.f23572l : ((cj) b1.a(this.f23567g)).d();
    }

    public abstract void v();

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }

    public void a(boolean z2, boolean z3) {
    }

    @Override // com.applovin.impl.qi
    public final void b(int i2) {
        this.d = i2;
    }

    public final a8 a(Throwable th, f9 f9Var, int i2) {
        return a(th, f9Var, false, i2);
    }

    public int b(long j2) {
        return ((cj) b1.a(this.f23567g)).a(j2 - this.f23569i);
    }

    public final a8 a(Throwable th, f9 f9Var, boolean z2, int i2) {
        int i3;
        if (f9Var != null && !this.f23573m) {
            this.f23573m = true;
            try {
                i3 = ri.d(a(f9Var));
            } catch (a8 unused) {
            } finally {
                this.f23573m = false;
            }
            return a8.a(th, getName(), s(), f9Var, i3, z2, i2);
        }
        i3 = 4;
        return a8.a(th, getName(), s(), f9Var, i3, z2, i2);
    }

    @Override // com.applovin.impl.qi
    public final void a(si siVar, f9[] f9VarArr, cj cjVar, long j2, boolean z2, boolean z3, long j3, long j4) {
        b1.b(this.f23566f == 0);
        this.f23565c = siVar;
        this.f23566f = 1;
        this.f23570j = j2;
        a(z2, z3);
        a(f9VarArr, cjVar, j3, j4);
        a(j2, z2);
    }

    public final int a(g9 g9Var, p5 p5Var, int i2) {
        int a2 = ((cj) b1.a(this.f23567g)).a(g9Var, p5Var, i2);
        if (a2 == -4) {
            if (p5Var.e()) {
                this.f23571k = Long.MIN_VALUE;
                return this.f23572l ? -4 : -3;
            }
            long j2 = p5Var.f25964f + this.f23569i;
            p5Var.f25964f = j2;
            this.f23571k = Math.max(this.f23571k, j2);
        } else if (a2 == -5) {
            f9 f9Var = (f9) b1.a(g9Var.f24058b);
            if (f9Var.f23844q != Long.MAX_VALUE) {
                g9Var.f24058b = f9Var.a().a(f9Var.f23844q + this.f23569i).a();
            }
        }
        return a2;
    }

    @Override // com.applovin.impl.qi
    public final void a(f9[] f9VarArr, cj cjVar, long j2, long j3) {
        b1.b(!this.f23572l);
        this.f23567g = cjVar;
        if (this.f23571k == Long.MIN_VALUE) {
            this.f23571k = j2;
        }
        this.f23568h = f9VarArr;
        this.f23569i = j3;
        a(f9VarArr, j2, j3);
    }

    @Override // com.applovin.impl.qi
    public final void a(long j2) {
        this.f23572l = false;
        this.f23570j = j2;
        this.f23571k = j2;
        a(j2, false);
    }
}

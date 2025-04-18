package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class d2 implements li, mi {
    private final int a;

    /* renamed from: c, reason: collision with root package name */
    private ni f4184c;

    /* renamed from: d, reason: collision with root package name */
    private int f4185d;

    /* renamed from: f, reason: collision with root package name */
    private int f4186f;

    /* renamed from: g, reason: collision with root package name */
    private yi f4187g;

    /* renamed from: h, reason: collision with root package name */
    private d9[] f4188h;

    /* renamed from: i, reason: collision with root package name */
    private long f4189i;

    /* renamed from: j, reason: collision with root package name */
    private long f4190j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4192l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4193m;

    /* renamed from: b, reason: collision with root package name */
    private final e9 f4183b = new e9();

    /* renamed from: k, reason: collision with root package name */
    private long f4191k = Long.MIN_VALUE;

    public d2(int i10) {
        this.a = i10;
    }

    @Override // com.applovin.impl.oh.b
    public void a(int i10, Object obj) {
    }

    public abstract void a(long j3, boolean z10);

    public abstract void a(d9[] d9VarArr, long j3, long j10);

    @Override // com.applovin.impl.li
    public final int b() {
        return this.f4186f;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public final int e() {
        return this.a;
    }

    @Override // com.applovin.impl.li
    public final void f() {
        boolean z10 = true;
        if (this.f4186f != 1) {
            z10 = false;
        }
        a1.b(z10);
        this.f4183b.a();
        this.f4186f = 0;
        this.f4187g = null;
        this.f4188h = null;
        this.f4192l = false;
        v();
    }

    @Override // com.applovin.impl.li
    public final void g() {
        this.f4192l = true;
    }

    @Override // com.applovin.impl.li
    public final void h() {
        ((yi) a1.a(this.f4187g)).a();
    }

    @Override // com.applovin.impl.li
    public final long i() {
        return this.f4191k;
    }

    @Override // com.applovin.impl.li
    public final boolean j() {
        return this.f4191k == Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.li
    public final boolean k() {
        return this.f4192l;
    }

    @Override // com.applovin.impl.li
    public bd l() {
        return null;
    }

    @Override // com.applovin.impl.mi
    public int m() {
        return 0;
    }

    @Override // com.applovin.impl.li
    public final mi n() {
        return this;
    }

    @Override // com.applovin.impl.li
    public final yi o() {
        return this.f4187g;
    }

    public final ni q() {
        return (ni) a1.a(this.f4184c);
    }

    public final e9 r() {
        this.f4183b.a();
        return this.f4183b;
    }

    @Override // com.applovin.impl.li
    public final void reset() {
        boolean z10;
        if (this.f4186f == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        this.f4183b.a();
        w();
    }

    public final int s() {
        return this.f4185d;
    }

    @Override // com.applovin.impl.li
    public final void start() {
        boolean z10 = true;
        if (this.f4186f != 1) {
            z10 = false;
        }
        a1.b(z10);
        this.f4186f = 2;
        x();
    }

    @Override // com.applovin.impl.li
    public final void stop() {
        boolean z10;
        if (this.f4186f == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        this.f4186f = 1;
        y();
    }

    public final d9[] t() {
        return (d9[]) a1.a(this.f4188h);
    }

    public final boolean u() {
        return j() ? this.f4192l : ((yi) a1.a(this.f4187g)).d();
    }

    public abstract void v();

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }

    public void a(boolean z10, boolean z11) {
    }

    @Override // com.applovin.impl.li
    public final void b(int i10) {
        this.f4185d = i10;
    }

    public final y7 a(Throwable th2, d9 d9Var, int i10) {
        return a(th2, d9Var, false, i10);
    }

    public int b(long j3) {
        return ((yi) a1.a(this.f4187g)).a(j3 - this.f4189i);
    }

    public final y7 a(Throwable th2, d9 d9Var, boolean z10, int i10) {
        int i11;
        if (d9Var != null && !this.f4193m) {
            this.f4193m = true;
            try {
                i11 = mi.d(a(d9Var));
            } catch (y7 unused) {
            } finally {
                this.f4193m = false;
            }
            return y7.a(th2, getName(), s(), d9Var, i11, z10, i10);
        }
        i11 = 4;
        return y7.a(th2, getName(), s(), d9Var, i11, z10, i10);
    }

    @Override // com.applovin.impl.li
    public final void a(ni niVar, d9[] d9VarArr, yi yiVar, long j3, boolean z10, boolean z11, long j10, long j11) {
        a1.b(this.f4186f == 0);
        this.f4184c = niVar;
        this.f4186f = 1;
        this.f4190j = j3;
        a(z10, z11);
        a(d9VarArr, yiVar, j10, j11);
        a(j3, z10);
    }

    public final int a(e9 e9Var, n5 n5Var, int i10) {
        int a = ((yi) a1.a(this.f4187g)).a(e9Var, n5Var, i10);
        if (a == -4) {
            if (n5Var.e()) {
                this.f4191k = Long.MIN_VALUE;
                return this.f4192l ? -4 : -3;
            }
            long j3 = n5Var.f6353f + this.f4189i;
            n5Var.f6353f = j3;
            this.f4191k = Math.max(this.f4191k, j3);
        } else if (a == -5) {
            d9 d9Var = (d9) a1.a(e9Var.f4413b);
            if (d9Var.f4232q != Long.MAX_VALUE) {
                e9Var.f4413b = d9Var.a().a(d9Var.f4232q + this.f4189i).a();
            }
        }
        return a;
    }

    @Override // com.applovin.impl.li
    public final void a(d9[] d9VarArr, yi yiVar, long j3, long j10) {
        a1.b(!this.f4192l);
        this.f4187g = yiVar;
        if (this.f4191k == Long.MIN_VALUE) {
            this.f4191k = j3;
        }
        this.f4188h = d9VarArr;
        this.f4189i = j10;
        a(d9VarArr, j3, j10);
    }

    @Override // com.applovin.impl.li
    public final void a(long j3) {
        this.f4192l = false;
        this.f4190j = j3;
        this.f4191k = j3;
        a(j3, false);
    }
}

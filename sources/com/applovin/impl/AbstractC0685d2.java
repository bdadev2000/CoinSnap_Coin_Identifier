package com.applovin.impl;

/* renamed from: com.applovin.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0685d2 implements li, mi {

    /* renamed from: a, reason: collision with root package name */
    private final int f7161a;

    /* renamed from: c, reason: collision with root package name */
    private ni f7162c;

    /* renamed from: d, reason: collision with root package name */
    private int f7163d;

    /* renamed from: f, reason: collision with root package name */
    private int f7164f;

    /* renamed from: g, reason: collision with root package name */
    private yi f7165g;

    /* renamed from: h, reason: collision with root package name */
    private d9[] f7166h;

    /* renamed from: i, reason: collision with root package name */
    private long f7167i;

    /* renamed from: j, reason: collision with root package name */
    private long f7168j;
    private boolean l;
    private boolean m;
    private final e9 b = new e9();

    /* renamed from: k, reason: collision with root package name */
    private long f7169k = Long.MIN_VALUE;

    public AbstractC0685d2(int i9) {
        this.f7161a = i9;
    }

    @Override // com.applovin.impl.oh.b
    public void a(int i9, Object obj) {
    }

    public abstract void a(long j7, boolean z8);

    public abstract void a(d9[] d9VarArr, long j7, long j9);

    @Override // com.applovin.impl.li
    public final int b() {
        return this.f7164f;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public final int e() {
        return this.f7161a;
    }

    @Override // com.applovin.impl.li
    public final void f() {
        boolean z8 = true;
        if (this.f7164f != 1) {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        this.b.a();
        this.f7164f = 0;
        this.f7165g = null;
        this.f7166h = null;
        this.l = false;
        v();
    }

    @Override // com.applovin.impl.li
    public final void g() {
        this.l = true;
    }

    @Override // com.applovin.impl.li
    public final void h() {
        ((yi) AbstractC0669a1.a(this.f7165g)).a();
    }

    @Override // com.applovin.impl.li
    public final long i() {
        return this.f7169k;
    }

    @Override // com.applovin.impl.li
    public final boolean j() {
        if (this.f7169k == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.li
    public final boolean k() {
        return this.l;
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
        return this.f7165g;
    }

    public final ni q() {
        return (ni) AbstractC0669a1.a(this.f7162c);
    }

    public final e9 r() {
        this.b.a();
        return this.b;
    }

    @Override // com.applovin.impl.li
    public final void reset() {
        boolean z8;
        if (this.f7164f == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        this.b.a();
        w();
    }

    public final int s() {
        return this.f7163d;
    }

    @Override // com.applovin.impl.li
    public final void start() {
        boolean z8 = true;
        if (this.f7164f != 1) {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        this.f7164f = 2;
        x();
    }

    @Override // com.applovin.impl.li
    public final void stop() {
        boolean z8;
        if (this.f7164f == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        this.f7164f = 1;
        y();
    }

    public final d9[] t() {
        return (d9[]) AbstractC0669a1.a(this.f7166h);
    }

    public final boolean u() {
        if (j()) {
            return this.l;
        }
        return ((yi) AbstractC0669a1.a(this.f7165g)).d();
    }

    public abstract void v();

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }

    public void a(boolean z8, boolean z9) {
    }

    @Override // com.applovin.impl.li
    public final void b(int i9) {
        this.f7163d = i9;
    }

    public final y7 a(Throwable th, d9 d9Var, int i9) {
        return a(th, d9Var, false, i9);
    }

    public int b(long j7) {
        return ((yi) AbstractC0669a1.a(this.f7165g)).a(j7 - this.f7167i);
    }

    public final y7 a(Throwable th, d9 d9Var, boolean z8, int i9) {
        int i10;
        if (d9Var != null && !this.m) {
            this.m = true;
            try {
                i10 = mi.d(a(d9Var));
            } catch (y7 unused) {
            } finally {
                this.m = false;
            }
            return y7.a(th, getName(), s(), d9Var, i10, z8, i9);
        }
        i10 = 4;
        return y7.a(th, getName(), s(), d9Var, i10, z8, i9);
    }

    @Override // com.applovin.impl.li
    public final void a(ni niVar, d9[] d9VarArr, yi yiVar, long j7, boolean z8, boolean z9, long j9, long j10) {
        AbstractC0669a1.b(this.f7164f == 0);
        this.f7162c = niVar;
        this.f7164f = 1;
        this.f7168j = j7;
        a(z8, z9);
        a(d9VarArr, yiVar, j9, j10);
        a(j7, z8);
    }

    public final int a(e9 e9Var, n5 n5Var, int i9) {
        int a6 = ((yi) AbstractC0669a1.a(this.f7165g)).a(e9Var, n5Var, i9);
        if (a6 == -4) {
            if (n5Var.e()) {
                this.f7169k = Long.MIN_VALUE;
                return this.l ? -4 : -3;
            }
            long j7 = n5Var.f9275f + this.f7167i;
            n5Var.f9275f = j7;
            this.f7169k = Math.max(this.f7169k, j7);
        } else if (a6 == -5) {
            d9 d9Var = (d9) AbstractC0669a1.a(e9Var.b);
            if (d9Var.f7214q != Long.MAX_VALUE) {
                e9Var.b = d9Var.a().a(d9Var.f7214q + this.f7167i).a();
            }
        }
        return a6;
    }

    @Override // com.applovin.impl.li
    public final void a(d9[] d9VarArr, yi yiVar, long j7, long j9) {
        AbstractC0669a1.b(!this.l);
        this.f7165g = yiVar;
        if (this.f7169k == Long.MIN_VALUE) {
            this.f7169k = j7;
        }
        this.f7166h = d9VarArr;
        this.f7167i = j9;
        a(d9VarArr, j7, j9);
    }

    @Override // com.applovin.impl.li
    public final void a(long j7) {
        this.l = false;
        this.f7168j = j7;
        this.f7169k = j7;
        a(j7, false);
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class fg {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4732b;

    /* renamed from: c, reason: collision with root package name */
    public long f4733c;

    /* renamed from: d, reason: collision with root package name */
    public long f4734d;

    /* renamed from: e, reason: collision with root package name */
    public long f4735e;

    /* renamed from: f, reason: collision with root package name */
    public long f4736f;

    /* renamed from: g, reason: collision with root package name */
    public int f4737g;

    /* renamed from: h, reason: collision with root package name */
    public int f4738h;

    /* renamed from: i, reason: collision with root package name */
    public int f4739i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f4740j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    private final yg f4741k = new yg(255);

    public boolean a(j8 j8Var, boolean z10) {
        a();
        this.f4741k.d(27);
        if (!l8.a(j8Var, this.f4741k.c(), 0, 27, z10) || this.f4741k.y() != 1332176723) {
            return false;
        }
        int w10 = this.f4741k.w();
        this.a = w10;
        if (w10 != 0) {
            if (z10) {
                return false;
            }
            throw ah.a("unsupported bit stream revision");
        }
        this.f4732b = this.f4741k.w();
        this.f4733c = this.f4741k.n();
        this.f4734d = this.f4741k.p();
        this.f4735e = this.f4741k.p();
        this.f4736f = this.f4741k.p();
        int w11 = this.f4741k.w();
        this.f4737g = w11;
        this.f4738h = w11 + 27;
        this.f4741k.d(w11);
        if (!l8.a(j8Var, this.f4741k.c(), 0, this.f4737g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f4737g; i10++) {
            this.f4740j[i10] = this.f4741k.w();
            this.f4739i += this.f4740j[i10];
        }
        return true;
    }

    public void a() {
        this.a = 0;
        this.f4732b = 0;
        this.f4733c = 0L;
        this.f4734d = 0L;
        this.f4735e = 0L;
        this.f4736f = 0L;
        this.f4737g = 0;
        this.f4738h = 0;
        this.f4739i = 0;
    }

    public boolean a(j8 j8Var) {
        return a(j8Var, -1L);
    }

    public boolean a(j8 j8Var, long j3) {
        a1.a(j8Var.f() == j8Var.d());
        this.f4741k.d(4);
        while (true) {
            if ((j3 == -1 || j8Var.f() + 4 < j3) && l8.a(j8Var, this.f4741k.c(), 0, 4, true)) {
                this.f4741k.f(0);
                if (this.f4741k.y() == 1332176723) {
                    j8Var.b();
                    return true;
                }
                j8Var.a(1);
            }
        }
        do {
            if (j3 != -1 && j8Var.f() >= j3) {
                break;
            }
        } while (j8Var.b(1) != -1);
        return false;
    }
}

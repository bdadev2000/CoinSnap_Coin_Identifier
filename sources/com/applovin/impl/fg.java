package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class fg {

    /* renamed from: a, reason: collision with root package name */
    public int f7689a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public long f7690c;

    /* renamed from: d, reason: collision with root package name */
    public long f7691d;

    /* renamed from: e, reason: collision with root package name */
    public long f7692e;

    /* renamed from: f, reason: collision with root package name */
    public long f7693f;

    /* renamed from: g, reason: collision with root package name */
    public int f7694g;

    /* renamed from: h, reason: collision with root package name */
    public int f7695h;

    /* renamed from: i, reason: collision with root package name */
    public int f7696i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f7697j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    private final yg f7698k = new yg(255);

    public boolean a(j8 j8Var, boolean z8) {
        a();
        this.f7698k.d(27);
        if (!l8.a(j8Var, this.f7698k.c(), 0, 27, z8) || this.f7698k.y() != 1332176723) {
            return false;
        }
        int w2 = this.f7698k.w();
        this.f7689a = w2;
        if (w2 != 0) {
            if (z8) {
                return false;
            }
            throw ah.a("unsupported bit stream revision");
        }
        this.b = this.f7698k.w();
        this.f7690c = this.f7698k.n();
        this.f7691d = this.f7698k.p();
        this.f7692e = this.f7698k.p();
        this.f7693f = this.f7698k.p();
        int w9 = this.f7698k.w();
        this.f7694g = w9;
        this.f7695h = w9 + 27;
        this.f7698k.d(w9);
        if (!l8.a(j8Var, this.f7698k.c(), 0, this.f7694g, z8)) {
            return false;
        }
        for (int i9 = 0; i9 < this.f7694g; i9++) {
            this.f7697j[i9] = this.f7698k.w();
            this.f7696i += this.f7697j[i9];
        }
        return true;
    }

    public void a() {
        this.f7689a = 0;
        this.b = 0;
        this.f7690c = 0L;
        this.f7691d = 0L;
        this.f7692e = 0L;
        this.f7693f = 0L;
        this.f7694g = 0;
        this.f7695h = 0;
        this.f7696i = 0;
    }

    public boolean a(j8 j8Var) {
        return a(j8Var, -1L);
    }

    public boolean a(j8 j8Var, long j7) {
        AbstractC0669a1.a(j8Var.f() == j8Var.d());
        this.f7698k.d(4);
        while (true) {
            if ((j7 == -1 || j8Var.f() + 4 < j7) && l8.a(j8Var, this.f7698k.c(), 0, 4, true)) {
                this.f7698k.f(0);
                if (this.f7698k.y() == 1332176723) {
                    j8Var.b();
                    return true;
                }
                j8Var.a(1);
            }
        }
        do {
            if (j7 != -1 && j8Var.f() >= j7) {
                break;
            }
        } while (j8Var.b(1) != -1);
        return false;
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class jg {

    /* renamed from: a, reason: collision with root package name */
    public int f24673a;

    /* renamed from: b, reason: collision with root package name */
    public int f24674b;

    /* renamed from: c, reason: collision with root package name */
    public long f24675c;
    public long d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f24676f;

    /* renamed from: g, reason: collision with root package name */
    public int f24677g;

    /* renamed from: h, reason: collision with root package name */
    public int f24678h;

    /* renamed from: i, reason: collision with root package name */
    public int f24679i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f24680j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    private final bh f24681k = new bh(255);

    public void a() {
        this.f24673a = 0;
        this.f24674b = 0;
        this.f24675c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f24676f = 0L;
        this.f24677g = 0;
        this.f24678h = 0;
        this.f24679i = 0;
    }

    public boolean a(l8 l8Var, boolean z2) {
        a();
        this.f24681k.d(27);
        if (!n8.a(l8Var, this.f24681k.c(), 0, 27, z2) || this.f24681k.y() != 1332176723) {
            return false;
        }
        int w = this.f24681k.w();
        this.f24673a = w;
        if (w != 0) {
            if (z2) {
                return false;
            }
            throw dh.a("unsupported bit stream revision");
        }
        this.f24674b = this.f24681k.w();
        this.f24675c = this.f24681k.n();
        this.d = this.f24681k.p();
        this.e = this.f24681k.p();
        this.f24676f = this.f24681k.p();
        int w2 = this.f24681k.w();
        this.f24677g = w2;
        this.f24678h = w2 + 27;
        this.f24681k.d(w2);
        if (!n8.a(l8Var, this.f24681k.c(), 0, this.f24677g, z2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.f24677g; i2++) {
            this.f24680j[i2] = this.f24681k.w();
            this.f24679i += this.f24680j[i2];
        }
        return true;
    }

    public boolean a(l8 l8Var) {
        return a(l8Var, -1L);
    }

    public boolean a(l8 l8Var, long j2) {
        b1.a(l8Var.f() == l8Var.d());
        this.f24681k.d(4);
        while (true) {
            if ((j2 == -1 || l8Var.f() + 4 < j2) && n8.a(l8Var, this.f24681k.c(), 0, 4, true)) {
                this.f24681k.f(0);
                if (this.f24681k.y() == 1332176723) {
                    l8Var.b();
                    return true;
                }
                l8Var.a(1);
            }
        }
        do {
            if (j2 != -1 && l8Var.f() >= j2) {
                break;
            }
        } while (l8Var.b(1) != -1);
        return false;
    }
}

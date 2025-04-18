package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final int f23153a;
    private boolean d;
    private boolean e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23156f;

    /* renamed from: b, reason: collision with root package name */
    private final ho f23154b = new ho(0);

    /* renamed from: g, reason: collision with root package name */
    private long f23157g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f23158h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f23159i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final bh f23155c = new bh();

    public bp(int i2) {
        this.f23153a = i2;
    }

    public long a() {
        return this.f23159i;
    }

    public ho b() {
        return this.f23154b;
    }

    public boolean c() {
        return this.d;
    }

    private int a(l8 l8Var) {
        this.f23155c.a(xp.f27965f);
        this.d = true;
        l8Var.b();
        return 0;
    }

    private int b(l8 l8Var, th thVar, int i2) {
        int min = (int) Math.min(this.f23153a, l8Var.a());
        long j2 = 0;
        if (l8Var.f() != j2) {
            thVar.f27165a = j2;
            return 1;
        }
        this.f23155c.d(min);
        l8Var.b();
        l8Var.c(this.f23155c.c(), 0, min);
        this.f23157g = a(this.f23155c, i2);
        this.e = true;
        return 0;
    }

    private int c(l8 l8Var, th thVar, int i2) {
        long a2 = l8Var.a();
        int min = (int) Math.min(this.f23153a, a2);
        long j2 = a2 - min;
        if (l8Var.f() != j2) {
            thVar.f27165a = j2;
            return 1;
        }
        this.f23155c.d(min);
        l8Var.b();
        l8Var.c(this.f23155c.c(), 0, min);
        this.f23158h = b(this.f23155c, i2);
        this.f23156f = true;
        return 0;
    }

    public int a(l8 l8Var, th thVar, int i2) {
        if (i2 <= 0) {
            return a(l8Var);
        }
        if (!this.f23156f) {
            return c(l8Var, thVar, i2);
        }
        if (this.f23158h == -9223372036854775807L) {
            return a(l8Var);
        }
        if (!this.e) {
            return b(l8Var, thVar, i2);
        }
        long j2 = this.f23157g;
        if (j2 == -9223372036854775807L) {
            return a(l8Var);
        }
        long b2 = this.f23154b.b(this.f23158h) - this.f23154b.b(j2);
        this.f23159i = b2;
        if (b2 < 0) {
            pc.d("TsDurationReader", "Invalid duration: " + this.f23159i + ". Using TIME_UNSET instead.");
            this.f23159i = -9223372036854775807L;
        }
        return a(l8Var);
    }

    private long b(bh bhVar, int i2) {
        int d = bhVar.d();
        int e = bhVar.e();
        for (int i3 = e - 188; i3 >= d; i3--) {
            if (ep.a(bhVar.c(), d, e, i3)) {
                long a2 = ep.a(bhVar, i3, i2);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long a(bh bhVar, int i2) {
        int e = bhVar.e();
        for (int d = bhVar.d(); d < e; d++) {
            if (bhVar.c()[d] == 71) {
                long a2 = ep.a(bhVar, d, i2);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class oo {

    /* renamed from: a, reason: collision with root package name */
    public j6 f9931a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f9932c;

    /* renamed from: d, reason: collision with root package name */
    public long f9933d;

    /* renamed from: e, reason: collision with root package name */
    public int f9934e;

    /* renamed from: f, reason: collision with root package name */
    public int f9935f;
    public boolean m;

    /* renamed from: o, reason: collision with root package name */
    public no f9942o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9944q;

    /* renamed from: r, reason: collision with root package name */
    public long f9945r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9946s;

    /* renamed from: g, reason: collision with root package name */
    public long[] f9936g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f9937h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f9938i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public int[] f9939j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public long[] f9940k = new long[0];
    public boolean[] l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f9941n = new boolean[0];

    /* renamed from: p, reason: collision with root package name */
    public final yg f9943p = new yg();

    public void a(j8 j8Var) {
        j8Var.d(this.f9943p.c(), 0, this.f9943p.e());
        this.f9943p.f(0);
        this.f9944q = false;
    }

    public void b(int i9) {
        this.f9943p.d(i9);
        this.m = true;
        this.f9944q = true;
    }

    public boolean c(int i9) {
        if (this.m && this.f9941n[i9]) {
            return true;
        }
        return false;
    }

    public void a(yg ygVar) {
        ygVar.a(this.f9943p.c(), 0, this.f9943p.e());
        this.f9943p.f(0);
        this.f9944q = false;
    }

    public long a(int i9) {
        return this.f9940k[i9] + this.f9939j[i9];
    }

    public void a(int i9, int i10) {
        this.f9934e = i9;
        this.f9935f = i10;
        if (this.f9937h.length < i9) {
            this.f9936g = new long[i9];
            this.f9937h = new int[i9];
        }
        if (this.f9938i.length < i10) {
            int i11 = (i10 * 125) / 100;
            this.f9938i = new int[i11];
            this.f9939j = new int[i11];
            this.f9940k = new long[i11];
            this.l = new boolean[i11];
            this.f9941n = new boolean[i11];
        }
    }

    public void a() {
        this.f9934e = 0;
        this.f9945r = 0L;
        this.f9946s = false;
        this.m = false;
        this.f9944q = false;
        this.f9942o = null;
    }
}

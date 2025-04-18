package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class oo {
    public j6 a;

    /* renamed from: b, reason: collision with root package name */
    public long f6841b;

    /* renamed from: c, reason: collision with root package name */
    public long f6842c;

    /* renamed from: d, reason: collision with root package name */
    public long f6843d;

    /* renamed from: e, reason: collision with root package name */
    public int f6844e;

    /* renamed from: f, reason: collision with root package name */
    public int f6845f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6852m;

    /* renamed from: o, reason: collision with root package name */
    public no f6854o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6856q;

    /* renamed from: r, reason: collision with root package name */
    public long f6857r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6858s;

    /* renamed from: g, reason: collision with root package name */
    public long[] f6846g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f6847h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f6848i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public int[] f6849j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public long[] f6850k = new long[0];

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f6851l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f6853n = new boolean[0];

    /* renamed from: p, reason: collision with root package name */
    public final yg f6855p = new yg();

    public void a(j8 j8Var) {
        j8Var.d(this.f6855p.c(), 0, this.f6855p.e());
        this.f6855p.f(0);
        this.f6856q = false;
    }

    public void b(int i10) {
        this.f6855p.d(i10);
        this.f6852m = true;
        this.f6856q = true;
    }

    public boolean c(int i10) {
        return this.f6852m && this.f6853n[i10];
    }

    public void a(yg ygVar) {
        ygVar.a(this.f6855p.c(), 0, this.f6855p.e());
        this.f6855p.f(0);
        this.f6856q = false;
    }

    public long a(int i10) {
        return this.f6850k[i10] + this.f6849j[i10];
    }

    public void a(int i10, int i11) {
        this.f6844e = i10;
        this.f6845f = i11;
        if (this.f6847h.length < i10) {
            this.f6846g = new long[i10];
            this.f6847h = new int[i10];
        }
        if (this.f6848i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f6848i = new int[i12];
            this.f6849j = new int[i12];
            this.f6850k = new long[i12];
            this.f6851l = new boolean[i12];
            this.f6853n = new boolean[i12];
        }
    }

    public void a() {
        this.f6844e = 0;
        this.f6857r = 0L;
        this.f6858s = false;
        this.f6852m = false;
        this.f6856q = false;
        this.f6854o = null;
    }
}

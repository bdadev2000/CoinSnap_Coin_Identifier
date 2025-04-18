package com.applovin.impl;

import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class no {

    /* renamed from: a, reason: collision with root package name */
    public l6 f25755a;

    /* renamed from: b, reason: collision with root package name */
    public long f25756b;

    /* renamed from: c, reason: collision with root package name */
    public long f25757c;
    public long d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f25758f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25765m;

    /* renamed from: o, reason: collision with root package name */
    public mo f25767o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25769q;

    /* renamed from: r, reason: collision with root package name */
    public long f25770r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25771s;

    /* renamed from: g, reason: collision with root package name */
    public long[] f25759g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f25760h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f25761i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public int[] f25762j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public long[] f25763k = new long[0];

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f25764l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f25766n = new boolean[0];

    /* renamed from: p, reason: collision with root package name */
    public final bh f25768p = new bh();

    public void a() {
        this.e = 0;
        this.f25770r = 0L;
        this.f25771s = false;
        this.f25765m = false;
        this.f25769q = false;
        this.f25767o = null;
    }

    public void b(int i2) {
        this.f25768p.d(i2);
        this.f25765m = true;
        this.f25769q = true;
    }

    public boolean c(int i2) {
        return this.f25765m && this.f25766n[i2];
    }

    public void a(l8 l8Var) {
        l8Var.d(this.f25768p.c(), 0, this.f25768p.e());
        this.f25768p.f(0);
        this.f25769q = false;
    }

    public void a(bh bhVar) {
        bhVar.a(this.f25768p.c(), 0, this.f25768p.e());
        this.f25768p.f(0);
        this.f25769q = false;
    }

    public long a(int i2) {
        return this.f25763k[i2] + this.f25762j[i2];
    }

    public void a(int i2, int i3) {
        this.e = i2;
        this.f25758f = i3;
        if (this.f25760h.length < i2) {
            this.f25759g = new long[i2];
            this.f25760h = new int[i2];
        }
        if (this.f25761i.length < i3) {
            int i4 = (i3 * Opcodes.LUSHR) / 100;
            this.f25761i = new int[i4];
            this.f25762j = new int[i4];
            this.f25763k = new long[i4];
            this.f25764l = new boolean[i4];
            this.f25766n = new boolean[i4];
        }
    }
}

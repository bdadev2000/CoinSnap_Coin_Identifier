package com.applovin.impl;

import android.text.Layout;

/* loaded from: classes.dex */
final class kp {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private int f5759b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5760c;

    /* renamed from: d, reason: collision with root package name */
    private int f5761d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5762e;

    /* renamed from: k, reason: collision with root package name */
    private float f5768k;

    /* renamed from: l, reason: collision with root package name */
    private String f5769l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f5772o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f5773p;

    /* renamed from: r, reason: collision with root package name */
    private yn f5775r;

    /* renamed from: f, reason: collision with root package name */
    private int f5763f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f5764g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f5765h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f5766i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f5767j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f5770m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f5771n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f5774q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f5776s = Float.MAX_VALUE;

    public kp a(kp kpVar) {
        return a(kpVar, true);
    }

    public int b() {
        if (this.f5760c) {
            return this.f5759b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String c() {
        return this.a;
    }

    public float d() {
        return this.f5768k;
    }

    public int e() {
        return this.f5767j;
    }

    public String f() {
        return this.f5769l;
    }

    public Layout.Alignment g() {
        return this.f5773p;
    }

    public int h() {
        return this.f5771n;
    }

    public int i() {
        return this.f5770m;
    }

    public float j() {
        return this.f5776s;
    }

    public int k() {
        int i10;
        int i11 = this.f5765h;
        if (i11 == -1 && this.f5766i == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f5766i == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public Layout.Alignment l() {
        return this.f5772o;
    }

    public boolean m() {
        return this.f5774q == 1;
    }

    public yn n() {
        return this.f5775r;
    }

    public boolean o() {
        return this.f5762e;
    }

    public boolean p() {
        return this.f5760c;
    }

    public boolean q() {
        return this.f5763f == 1;
    }

    public boolean r() {
        return this.f5764g == 1;
    }

    public int a() {
        if (this.f5762e) {
            return this.f5761d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public kp c(int i10) {
        this.f5767j = i10;
        return this;
    }

    public kp d(int i10) {
        this.f5771n = i10;
        return this;
    }

    public kp e(int i10) {
        this.f5770m = i10;
        return this;
    }

    public kp c(boolean z10) {
        this.f5763f = z10 ? 1 : 0;
        return this;
    }

    public kp d(boolean z10) {
        this.f5774q = z10 ? 1 : 0;
        return this;
    }

    public kp e(boolean z10) {
        this.f5764g = z10 ? 1 : 0;
        return this;
    }

    public kp b(int i10) {
        this.f5759b = i10;
        this.f5760c = true;
        return this;
    }

    private kp a(kp kpVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (kpVar != null) {
            if (!this.f5760c && kpVar.f5760c) {
                b(kpVar.f5759b);
            }
            if (this.f5765h == -1) {
                this.f5765h = kpVar.f5765h;
            }
            if (this.f5766i == -1) {
                this.f5766i = kpVar.f5766i;
            }
            if (this.a == null && (str = kpVar.a) != null) {
                this.a = str;
            }
            if (this.f5763f == -1) {
                this.f5763f = kpVar.f5763f;
            }
            if (this.f5764g == -1) {
                this.f5764g = kpVar.f5764g;
            }
            if (this.f5771n == -1) {
                this.f5771n = kpVar.f5771n;
            }
            if (this.f5772o == null && (alignment2 = kpVar.f5772o) != null) {
                this.f5772o = alignment2;
            }
            if (this.f5773p == null && (alignment = kpVar.f5773p) != null) {
                this.f5773p = alignment;
            }
            if (this.f5774q == -1) {
                this.f5774q = kpVar.f5774q;
            }
            if (this.f5767j == -1) {
                this.f5767j = kpVar.f5767j;
                this.f5768k = kpVar.f5768k;
            }
            if (this.f5775r == null) {
                this.f5775r = kpVar.f5775r;
            }
            if (this.f5776s == Float.MAX_VALUE) {
                this.f5776s = kpVar.f5776s;
            }
            if (z10 && !this.f5762e && kpVar.f5762e) {
                a(kpVar.f5761d);
            }
            if (z10 && this.f5770m == -1 && (i10 = kpVar.f5770m) != -1) {
                this.f5770m = i10;
            }
        }
        return this;
    }

    public kp b(String str) {
        this.f5769l = str;
        return this;
    }

    public kp b(boolean z10) {
        this.f5766i = z10 ? 1 : 0;
        return this;
    }

    public kp b(float f10) {
        this.f5776s = f10;
        return this;
    }

    public kp b(Layout.Alignment alignment) {
        this.f5772o = alignment;
        return this;
    }

    public kp a(int i10) {
        this.f5761d = i10;
        this.f5762e = true;
        return this;
    }

    public kp a(boolean z10) {
        this.f5765h = z10 ? 1 : 0;
        return this;
    }

    public kp a(String str) {
        this.a = str;
        return this;
    }

    public kp a(float f10) {
        this.f5768k = f10;
        return this;
    }

    public kp a(Layout.Alignment alignment) {
        this.f5773p = alignment;
        return this;
    }

    public kp a(yn ynVar) {
        this.f5775r = ynVar;
        return this;
    }
}

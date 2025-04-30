package com.applovin.impl;

import android.text.Layout;

/* loaded from: classes.dex */
final class kp {

    /* renamed from: a, reason: collision with root package name */
    private String f8738a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8739c;

    /* renamed from: d, reason: collision with root package name */
    private int f8740d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8741e;

    /* renamed from: k, reason: collision with root package name */
    private float f8747k;
    private String l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f8749o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f8750p;

    /* renamed from: r, reason: collision with root package name */
    private yn f8752r;

    /* renamed from: f, reason: collision with root package name */
    private int f8742f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f8743g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f8744h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f8745i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f8746j = -1;
    private int m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f8748n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f8751q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f8753s = Float.MAX_VALUE;

    public kp a(kp kpVar) {
        return a(kpVar, true);
    }

    public int b() {
        if (this.f8739c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String c() {
        return this.f8738a;
    }

    public float d() {
        return this.f8747k;
    }

    public int e() {
        return this.f8746j;
    }

    public String f() {
        return this.l;
    }

    public Layout.Alignment g() {
        return this.f8750p;
    }

    public int h() {
        return this.f8748n;
    }

    public int i() {
        return this.m;
    }

    public float j() {
        return this.f8753s;
    }

    public int k() {
        int i9;
        int i10 = this.f8744h;
        if (i10 == -1 && this.f8745i == -1) {
            return -1;
        }
        int i11 = 0;
        if (i10 == 1) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (this.f8745i == 1) {
            i11 = 2;
        }
        return i9 | i11;
    }

    public Layout.Alignment l() {
        return this.f8749o;
    }

    public boolean m() {
        if (this.f8751q == 1) {
            return true;
        }
        return false;
    }

    public yn n() {
        return this.f8752r;
    }

    public boolean o() {
        return this.f8741e;
    }

    public boolean p() {
        return this.f8739c;
    }

    public boolean q() {
        if (this.f8742f == 1) {
            return true;
        }
        return false;
    }

    public boolean r() {
        if (this.f8743g == 1) {
            return true;
        }
        return false;
    }

    public int a() {
        if (this.f8741e) {
            return this.f8740d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public kp c(int i9) {
        this.f8746j = i9;
        return this;
    }

    public kp d(int i9) {
        this.f8748n = i9;
        return this;
    }

    public kp e(int i9) {
        this.m = i9;
        return this;
    }

    public kp c(boolean z8) {
        this.f8742f = z8 ? 1 : 0;
        return this;
    }

    public kp d(boolean z8) {
        this.f8751q = z8 ? 1 : 0;
        return this;
    }

    public kp e(boolean z8) {
        this.f8743g = z8 ? 1 : 0;
        return this;
    }

    public kp b(int i9) {
        this.b = i9;
        this.f8739c = true;
        return this;
    }

    private kp a(kp kpVar, boolean z8) {
        int i9;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (kpVar != null) {
            if (!this.f8739c && kpVar.f8739c) {
                b(kpVar.b);
            }
            if (this.f8744h == -1) {
                this.f8744h = kpVar.f8744h;
            }
            if (this.f8745i == -1) {
                this.f8745i = kpVar.f8745i;
            }
            if (this.f8738a == null && (str = kpVar.f8738a) != null) {
                this.f8738a = str;
            }
            if (this.f8742f == -1) {
                this.f8742f = kpVar.f8742f;
            }
            if (this.f8743g == -1) {
                this.f8743g = kpVar.f8743g;
            }
            if (this.f8748n == -1) {
                this.f8748n = kpVar.f8748n;
            }
            if (this.f8749o == null && (alignment2 = kpVar.f8749o) != null) {
                this.f8749o = alignment2;
            }
            if (this.f8750p == null && (alignment = kpVar.f8750p) != null) {
                this.f8750p = alignment;
            }
            if (this.f8751q == -1) {
                this.f8751q = kpVar.f8751q;
            }
            if (this.f8746j == -1) {
                this.f8746j = kpVar.f8746j;
                this.f8747k = kpVar.f8747k;
            }
            if (this.f8752r == null) {
                this.f8752r = kpVar.f8752r;
            }
            if (this.f8753s == Float.MAX_VALUE) {
                this.f8753s = kpVar.f8753s;
            }
            if (z8 && !this.f8741e && kpVar.f8741e) {
                a(kpVar.f8740d);
            }
            if (z8 && this.m == -1 && (i9 = kpVar.m) != -1) {
                this.m = i9;
            }
        }
        return this;
    }

    public kp b(String str) {
        this.l = str;
        return this;
    }

    public kp b(boolean z8) {
        this.f8745i = z8 ? 1 : 0;
        return this;
    }

    public kp b(float f9) {
        this.f8753s = f9;
        return this;
    }

    public kp b(Layout.Alignment alignment) {
        this.f8749o = alignment;
        return this;
    }

    public kp a(int i9) {
        this.f8740d = i9;
        this.f8741e = true;
        return this;
    }

    public kp a(boolean z8) {
        this.f8744h = z8 ? 1 : 0;
        return this;
    }

    public kp a(String str) {
        this.f8738a = str;
        return this;
    }

    public kp a(float f9) {
        this.f8747k = f9;
        return this;
    }

    public kp a(Layout.Alignment alignment) {
        this.f8750p = alignment;
        return this;
    }

    public kp a(yn ynVar) {
        this.f8752r = ynVar;
        return this;
    }
}

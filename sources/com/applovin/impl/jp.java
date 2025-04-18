package com.applovin.impl;

import android.text.Layout;

/* loaded from: classes.dex */
final class jp {

    /* renamed from: a, reason: collision with root package name */
    private String f24720a;

    /* renamed from: b, reason: collision with root package name */
    private int f24721b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24722c;
    private int d;
    private boolean e;

    /* renamed from: k, reason: collision with root package name */
    private float f24728k;

    /* renamed from: l, reason: collision with root package name */
    private String f24729l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f24732o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f24733p;

    /* renamed from: r, reason: collision with root package name */
    private xn f24735r;

    /* renamed from: f, reason: collision with root package name */
    private int f24723f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f24724g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f24725h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f24726i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f24727j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f24730m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f24731n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f24734q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f24736s = Float.MAX_VALUE;

    public jp a(float f2) {
        this.f24728k = f2;
        return this;
    }

    public jp b(float f2) {
        this.f24736s = f2;
        return this;
    }

    public jp c(int i2) {
        this.f24727j = i2;
        return this;
    }

    public float d() {
        return this.f24728k;
    }

    public int e() {
        return this.f24727j;
    }

    public String f() {
        return this.f24729l;
    }

    public Layout.Alignment g() {
        return this.f24733p;
    }

    public int h() {
        return this.f24731n;
    }

    public int i() {
        return this.f24730m;
    }

    public float j() {
        return this.f24736s;
    }

    public int k() {
        int i2 = this.f24725h;
        if (i2 == -1 && this.f24726i == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f24726i == 1 ? 2 : 0);
    }

    public Layout.Alignment l() {
        return this.f24732o;
    }

    public boolean m() {
        return this.f24734q == 1;
    }

    public xn n() {
        return this.f24735r;
    }

    public boolean o() {
        return this.e;
    }

    public boolean p() {
        return this.f24722c;
    }

    public boolean q() {
        return this.f24723f == 1;
    }

    public boolean r() {
        return this.f24724g == 1;
    }

    public jp a(int i2) {
        this.d = i2;
        this.e = true;
        return this;
    }

    public jp b(int i2) {
        this.f24721b = i2;
        this.f24722c = true;
        return this;
    }

    public jp c(boolean z2) {
        this.f24723f = z2 ? 1 : 0;
        return this;
    }

    public jp d(int i2) {
        this.f24731n = i2;
        return this;
    }

    public jp e(int i2) {
        this.f24730m = i2;
        return this;
    }

    public jp a(Layout.Alignment alignment) {
        this.f24733p = alignment;
        return this;
    }

    public jp b(Layout.Alignment alignment) {
        this.f24732o = alignment;
        return this;
    }

    public String c() {
        return this.f24720a;
    }

    public jp d(boolean z2) {
        this.f24734q = z2 ? 1 : 0;
        return this;
    }

    public jp e(boolean z2) {
        this.f24724g = z2 ? 1 : 0;
        return this;
    }

    public jp a(xn xnVar) {
        this.f24735r = xnVar;
        return this;
    }

    public jp b(String str) {
        this.f24729l = str;
        return this;
    }

    public jp a(String str) {
        this.f24720a = str;
        return this;
    }

    public jp b(boolean z2) {
        this.f24726i = z2 ? 1 : 0;
        return this;
    }

    public jp a(boolean z2) {
        this.f24725h = z2 ? 1 : 0;
        return this;
    }

    public int b() {
        if (this.f24722c) {
            return this.f24721b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public jp a(jp jpVar) {
        return a(jpVar, true);
    }

    public int a() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    private jp a(jp jpVar, boolean z2) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (jpVar != null) {
            if (!this.f24722c && jpVar.f24722c) {
                b(jpVar.f24721b);
            }
            if (this.f24725h == -1) {
                this.f24725h = jpVar.f24725h;
            }
            if (this.f24726i == -1) {
                this.f24726i = jpVar.f24726i;
            }
            if (this.f24720a == null && (str = jpVar.f24720a) != null) {
                this.f24720a = str;
            }
            if (this.f24723f == -1) {
                this.f24723f = jpVar.f24723f;
            }
            if (this.f24724g == -1) {
                this.f24724g = jpVar.f24724g;
            }
            if (this.f24731n == -1) {
                this.f24731n = jpVar.f24731n;
            }
            if (this.f24732o == null && (alignment2 = jpVar.f24732o) != null) {
                this.f24732o = alignment2;
            }
            if (this.f24733p == null && (alignment = jpVar.f24733p) != null) {
                this.f24733p = alignment;
            }
            if (this.f24734q == -1) {
                this.f24734q = jpVar.f24734q;
            }
            if (this.f24727j == -1) {
                this.f24727j = jpVar.f24727j;
                this.f24728k = jpVar.f24728k;
            }
            if (this.f24735r == null) {
                this.f24735r = jpVar.f24735r;
            }
            if (this.f24736s == Float.MAX_VALUE) {
                this.f24736s = jpVar.f24736s;
            }
            if (z2 && !this.e && jpVar.e) {
                a(jpVar.d);
            }
            if (z2 && this.f24730m == -1 && (i2 = jpVar.f24730m) != -1) {
                this.f24730m = i2;
            }
        }
        return this;
    }
}

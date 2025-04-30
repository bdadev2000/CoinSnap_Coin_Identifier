package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class wr {

    /* renamed from: f, reason: collision with root package name */
    private int f12064f;

    /* renamed from: h, reason: collision with root package name */
    private int f12066h;

    /* renamed from: o, reason: collision with root package name */
    private float f12071o;

    /* renamed from: a, reason: collision with root package name */
    private String f12060a = "";
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f12061c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f12062d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f12063e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12065g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12067i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f12068j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f12069k = -1;
    private int l = -1;
    private int m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f12070n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f12072p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12073q = false;

    public int a() {
        if (this.f12067i) {
            return this.f12066h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f12073q;
    }

    public int c() {
        if (this.f12065g) {
            return this.f12064f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f12063e;
    }

    public float e() {
        return this.f12071o;
    }

    public int f() {
        return this.f12070n;
    }

    public int g() {
        return this.f12072p;
    }

    public int h() {
        int i9;
        int i10 = this.l;
        if (i10 == -1 && this.m == -1) {
            return -1;
        }
        int i11 = 0;
        if (i10 == 1) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (this.m == 1) {
            i11 = 2;
        }
        return i9 | i11;
    }

    public boolean i() {
        return this.f12067i;
    }

    public boolean j() {
        return this.f12065g;
    }

    public boolean k() {
        if (this.f12068j == 1) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.f12069k == 1) {
            return true;
        }
        return false;
    }

    public wr b(boolean z8) {
        this.f12073q = z8;
        return this;
    }

    public wr d(int i9) {
        this.f12072p = i9;
        return this;
    }

    public wr b(int i9) {
        this.f12064f = i9;
        this.f12065g = true;
        return this;
    }

    public void d(String str) {
        this.f12062d = str;
    }

    public int a(String str, String str2, Set set, String str3) {
        if (this.f12060a.isEmpty() && this.b.isEmpty() && this.f12061c.isEmpty() && this.f12062d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a6 = a(a(a(0, this.f12060a, str, 1073741824), this.b, str2, 2), this.f12062d, str3, 4);
        if (a6 == -1 || !set.containsAll(this.f12061c)) {
            return 0;
        }
        return (this.f12061c.size() * 4) + a6;
    }

    public wr c(int i9) {
        this.f12070n = i9;
        return this;
    }

    public wr d(boolean z8) {
        this.f12069k = z8 ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.f12060a = str;
    }

    public wr c(boolean z8) {
        this.m = z8 ? 1 : 0;
        return this;
    }

    public void c(String str) {
        this.b = str;
    }

    public wr a(int i9) {
        this.f12066h = i9;
        this.f12067i = true;
        return this;
    }

    public wr a(boolean z8) {
        this.l = z8 ? 1 : 0;
        return this;
    }

    public wr a(String str) {
        this.f12063e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public wr a(float f9) {
        this.f12071o = f9;
        return this;
    }

    public void a(String[] strArr) {
        this.f12061c = new HashSet(Arrays.asList(strArr));
    }

    private static int a(int i9, String str, String str2, int i10) {
        if (str.isEmpty() || i9 == -1) {
            return i9;
        }
        if (str.equals(str2)) {
            return i9 + i10;
        }
        return -1;
    }
}

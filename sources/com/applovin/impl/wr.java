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
    private int f8855f;

    /* renamed from: h, reason: collision with root package name */
    private int f8857h;

    /* renamed from: o, reason: collision with root package name */
    private float f8864o;
    private String a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f8851b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f8852c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f8853d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f8854e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8856g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8858i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f8859j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f8860k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f8861l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f8862m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f8863n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f8865p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8866q = false;

    public int a() {
        if (this.f8858i) {
            return this.f8857h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f8866q;
    }

    public int c() {
        if (this.f8856g) {
            return this.f8855f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f8854e;
    }

    public float e() {
        return this.f8864o;
    }

    public int f() {
        return this.f8863n;
    }

    public int g() {
        return this.f8865p;
    }

    public int h() {
        int i10;
        int i11 = this.f8861l;
        if (i11 == -1 && this.f8862m == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f8862m == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public boolean i() {
        return this.f8858i;
    }

    public boolean j() {
        return this.f8856g;
    }

    public boolean k() {
        return this.f8859j == 1;
    }

    public boolean l() {
        return this.f8860k == 1;
    }

    public wr b(boolean z10) {
        this.f8866q = z10;
        return this;
    }

    public wr d(int i10) {
        this.f8865p = i10;
        return this;
    }

    public wr b(int i10) {
        this.f8855f = i10;
        this.f8856g = true;
        return this;
    }

    public void d(String str) {
        this.f8853d = str;
    }

    public int a(String str, String str2, Set set, String str3) {
        if (this.a.isEmpty() && this.f8851b.isEmpty() && this.f8852c.isEmpty() && this.f8853d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a = a(a(a(0, this.a, str, 1073741824), this.f8851b, str2, 2), this.f8853d, str3, 4);
        if (a == -1 || !set.containsAll(this.f8852c)) {
            return 0;
        }
        return (this.f8852c.size() * 4) + a;
    }

    public wr c(int i10) {
        this.f8863n = i10;
        return this;
    }

    public wr d(boolean z10) {
        this.f8860k = z10 ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.a = str;
    }

    public wr c(boolean z10) {
        this.f8862m = z10 ? 1 : 0;
        return this;
    }

    public void c(String str) {
        this.f8851b = str;
    }

    public wr a(int i10) {
        this.f8857h = i10;
        this.f8858i = true;
        return this;
    }

    public wr a(boolean z10) {
        this.f8861l = z10 ? 1 : 0;
        return this;
    }

    public wr a(String str) {
        this.f8854e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public wr a(float f10) {
        this.f8864o = f10;
        return this;
    }

    public void a(String[] strArr) {
        this.f8852c = new HashSet(Arrays.asList(strArr));
    }

    private static int a(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}

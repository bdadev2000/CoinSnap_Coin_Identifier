package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class vr {

    /* renamed from: f, reason: collision with root package name */
    private int f27628f;

    /* renamed from: h, reason: collision with root package name */
    private int f27630h;

    /* renamed from: o, reason: collision with root package name */
    private float f27637o;

    /* renamed from: a, reason: collision with root package name */
    private String f27625a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f27626b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f27627c = Collections.emptySet();
    private String d = "";
    private String e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27629g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27631i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f27632j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f27633k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f27634l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f27635m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f27636n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f27638p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27639q = false;

    public vr a(float f2) {
        this.f27637o = f2;
        return this;
    }

    public vr b(int i2) {
        this.f27628f = i2;
        this.f27629g = true;
        return this;
    }

    public vr c(int i2) {
        this.f27636n = i2;
        return this;
    }

    public vr d(int i2) {
        this.f27638p = i2;
        return this;
    }

    public float e() {
        return this.f27637o;
    }

    public int f() {
        return this.f27636n;
    }

    public int g() {
        return this.f27638p;
    }

    public int h() {
        int i2 = this.f27634l;
        if (i2 == -1 && this.f27635m == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f27635m == 1 ? 2 : 0);
    }

    public boolean i() {
        return this.f27631i;
    }

    public boolean j() {
        return this.f27629g;
    }

    public boolean k() {
        return this.f27632j == 1;
    }

    public boolean l() {
        return this.f27633k == 1;
    }

    public vr a(int i2) {
        this.f27630h = i2;
        this.f27631i = true;
        return this;
    }

    public vr b(boolean z2) {
        this.f27639q = z2;
        return this;
    }

    public vr c(boolean z2) {
        this.f27635m = z2 ? 1 : 0;
        return this;
    }

    public vr d(boolean z2) {
        this.f27633k = z2 ? 1 : 0;
        return this;
    }

    public vr a(boolean z2) {
        this.f27634l = z2 ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.f27625a = str;
    }

    public void c(String str) {
        this.f27626b = str;
    }

    public String d() {
        return this.e;
    }

    public int a() {
        if (this.f27631i) {
            return this.f27630h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f27639q;
    }

    public int c() {
        if (this.f27629g) {
            return this.f27628f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public void d(String str) {
        this.d = str;
    }

    public int a(String str, String str2, Set set, String str3) {
        if (this.f27625a.isEmpty() && this.f27626b.isEmpty() && this.f27627c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a2 = a(a(a(0, this.f27625a, str, Ints.MAX_POWER_OF_TWO), this.f27626b, str2, 2), this.d, str3, 4);
        if (a2 == -1 || !set.containsAll(this.f27627c)) {
            return 0;
        }
        return (this.f27627c.size() * 4) + a2;
    }

    public vr a(String str) {
        this.e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public void a(String[] strArr) {
        this.f27627c = new HashSet(Arrays.asList(strArr));
    }

    private static int a(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }
}

package com.applovin.impl;

/* loaded from: classes.dex */
public final class lo {

    /* renamed from: a, reason: collision with root package name */
    public final int f25110a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25111b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25112c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final f9 f25113f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25114g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f25115h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f25116i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25117j;

    /* renamed from: k, reason: collision with root package name */
    private final mo[] f25118k;

    public lo(int i2, int i3, long j2, long j3, long j4, f9 f9Var, int i4, mo[] moVarArr, int i5, long[] jArr, long[] jArr2) {
        this.f25110a = i2;
        this.f25111b = i3;
        this.f25112c = j2;
        this.d = j3;
        this.e = j4;
        this.f25113f = f9Var;
        this.f25114g = i4;
        this.f25118k = moVarArr;
        this.f25117j = i5;
        this.f25115h = jArr;
        this.f25116i = jArr2;
    }

    public mo a(int i2) {
        mo[] moVarArr = this.f25118k;
        if (moVarArr == null) {
            return null;
        }
        return moVarArr[i2];
    }
}

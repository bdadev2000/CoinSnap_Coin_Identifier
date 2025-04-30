package com.applovin.impl;

/* loaded from: classes.dex */
public final class mo {

    /* renamed from: a, reason: collision with root package name */
    public final int f9212a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9213c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9214d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9215e;

    /* renamed from: f, reason: collision with root package name */
    public final d9 f9216f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9217g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f9218h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f9219i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9220j;

    /* renamed from: k, reason: collision with root package name */
    private final no[] f9221k;

    public mo(int i9, int i10, long j7, long j9, long j10, d9 d9Var, int i11, no[] noVarArr, int i12, long[] jArr, long[] jArr2) {
        this.f9212a = i9;
        this.b = i10;
        this.f9213c = j7;
        this.f9214d = j9;
        this.f9215e = j10;
        this.f9216f = d9Var;
        this.f9217g = i11;
        this.f9221k = noVarArr;
        this.f9220j = i12;
        this.f9218h = jArr;
        this.f9219i = jArr2;
    }

    public no a(int i9) {
        no[] noVarArr = this.f9221k;
        if (noVarArr == null) {
            return null;
        }
        return noVarArr[i9];
    }
}

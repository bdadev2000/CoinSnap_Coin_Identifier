package com.applovin.impl;

/* loaded from: classes.dex */
public final class mo {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6277b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6278c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6279d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6280e;

    /* renamed from: f, reason: collision with root package name */
    public final d9 f6281f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6282g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f6283h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f6284i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6285j;

    /* renamed from: k, reason: collision with root package name */
    private final no[] f6286k;

    public mo(int i10, int i11, long j3, long j10, long j11, d9 d9Var, int i12, no[] noVarArr, int i13, long[] jArr, long[] jArr2) {
        this.a = i10;
        this.f6277b = i11;
        this.f6278c = j3;
        this.f6279d = j10;
        this.f6280e = j11;
        this.f6281f = d9Var;
        this.f6282g = i12;
        this.f6286k = noVarArr;
        this.f6285j = i13;
        this.f6283h = jArr;
        this.f6284i = jArr2;
    }

    public no a(int i10) {
        no[] noVarArr = this.f6286k;
        if (noVarArr == null) {
            return null;
        }
        return noVarArr[i10];
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class so {

    /* renamed from: a, reason: collision with root package name */
    public final mo f11227a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f11228c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f11229d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11230e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f11231f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f11232g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11233h;

    public so(mo moVar, long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j7) {
        boolean z8;
        boolean z9;
        if (iArr.length == jArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        if (jArr.length == jArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC0669a1.a(z9);
        AbstractC0669a1.a(iArr2.length == jArr2.length);
        this.f11227a = moVar;
        this.f11228c = jArr;
        this.f11229d = iArr;
        this.f11230e = i9;
        this.f11231f = jArr2;
        this.f11232g = iArr2;
        this.f11233h = j7;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j7) {
        for (int b = yp.b(this.f11231f, j7, true, false); b >= 0; b--) {
            if ((this.f11232g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    public int b(long j7) {
        for (int a6 = yp.a(this.f11231f, j7, true, false); a6 < this.f11231f.length; a6++) {
            if ((this.f11232g[a6] & 1) != 0) {
                return a6;
            }
        }
        return -1;
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class so {
    public final mo a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8063b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f8064c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8066e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f8067f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f8068g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8069h;

    public so(mo moVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        a1.a(z11);
        a1.a(iArr2.length == jArr2.length);
        this.a = moVar;
        this.f8064c = jArr;
        this.f8065d = iArr;
        this.f8066e = i10;
        this.f8067f = jArr2;
        this.f8068g = iArr2;
        this.f8069h = j3;
        this.f8063b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j3) {
        for (int b3 = yp.b(this.f8067f, j3, true, false); b3 >= 0; b3--) {
            if ((this.f8068g[b3] & 1) != 0) {
                return b3;
            }
        }
        return -1;
    }

    public int b(long j3) {
        for (int a = yp.a(this.f8067f, j3, true, false); a < this.f8067f.length; a++) {
            if ((this.f8068g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ro {

    /* renamed from: a, reason: collision with root package name */
    public final lo f26358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26359b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f26360c;
    public final int[] d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f26361f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f26362g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26363h;

    public ro(lo loVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        b1.a(iArr.length == jArr2.length);
        b1.a(jArr.length == jArr2.length);
        b1.a(iArr2.length == jArr2.length);
        this.f26358a = loVar;
        this.f26360c = jArr;
        this.d = iArr;
        this.e = i2;
        this.f26361f = jArr2;
        this.f26362g = iArr2;
        this.f26363h = j2;
        this.f26359b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j2) {
        for (int b2 = xp.b(this.f26361f, j2, true, false); b2 >= 0; b2--) {
            if ((this.f26362g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }

    public int b(long j2) {
        for (int a2 = xp.a(this.f26361f, j2, true, false); a2 < this.f26361f.length; a2++) {
            if ((this.f26362g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }
}

package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public final class ib implements ej {
    private final long[] a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f5311b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5312c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5313d;

    public ib(long[] jArr, long[] jArr2, long j3) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5313d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.a = jArr3;
            long[] jArr4 = new long[i10];
            this.f5311b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.a = jArr;
            this.f5311b = jArr2;
        }
        this.f5312c = j3;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        if (!this.f5313d) {
            return new ej.a(gj.f4942c);
        }
        int b3 = yp.b(this.f5311b, j3, true, true);
        gj gjVar = new gj(this.f5311b[b3], this.a[b3]);
        if (gjVar.a != j3 && b3 != this.f5311b.length - 1) {
            int i10 = b3 + 1;
            return new ej.a(gjVar, new gj(this.f5311b[i10], this.a[i10]));
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f5312c;
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.f5313d;
    }
}

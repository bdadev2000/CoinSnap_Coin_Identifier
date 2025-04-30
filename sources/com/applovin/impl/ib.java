package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public final class ib implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f8275a;
    private final long[] b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8276c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8277d;

    public ib(long[] jArr, long[] jArr2, long j7) {
        boolean z8;
        boolean z9;
        if (jArr.length == jArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        int length = jArr2.length;
        if (length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f8277d = z9;
        if (z9 && jArr2[0] > 0) {
            int i9 = length + 1;
            long[] jArr3 = new long[i9];
            this.f8275a = jArr3;
            long[] jArr4 = new long[i9];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f8275a = jArr;
            this.b = jArr2;
        }
        this.f8276c = j7;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        if (!this.f8277d) {
            return new ej.a(gj.f7917c);
        }
        int b = yp.b(this.b, j7, true, true);
        gj gjVar = new gj(this.b[b], this.f8275a[b]);
        if (gjVar.f7918a != j7 && b != this.b.length - 1) {
            int i9 = b + 1;
            return new ej.a(gjVar, new gj(this.b[i9], this.f8275a[i9]));
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f8276c;
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.f8277d;
    }
}

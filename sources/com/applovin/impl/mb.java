package com.applovin.impl;

import com.applovin.impl.ij;

/* loaded from: classes.dex */
public final class mb implements ij {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f25236a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f25237b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25238c;
    private final boolean d;

    public mb(long[] jArr, long[] jArr2, long j2) {
        b1.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z2 = length > 0;
        this.d = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f25236a = jArr;
            this.f25237b = jArr2;
        } else {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.f25236a = jArr3;
            long[] jArr4 = new long[i2];
            this.f25237b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f25238c = j2;
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.d;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f25238c;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        if (!this.d) {
            return new ij.a(kj.f24922c);
        }
        int b2 = xp.b(this.f25237b, j2, true, true);
        kj kjVar = new kj(this.f25237b[b2], this.f25236a[b2]);
        if (kjVar.f24923a != j2 && b2 != this.f25237b.length - 1) {
            int i2 = b2 + 1;
            return new ij.a(kjVar, new kj(this.f25237b[i2], this.f25236a[i2]));
        }
        return new ij.a(kjVar);
    }
}

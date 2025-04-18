package com.applovin.impl;

import com.applovin.impl.ej;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e3 implements ej {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4408b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f4409c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f4410d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f4411e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4412f;

    public e3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4408b = iArr;
        this.f4409c = jArr;
        this.f4410d = jArr2;
        this.f4411e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i10 = length - 1;
            this.f4412f = jArr2[i10] + jArr3[i10];
        } else {
            this.f4412f = 0L;
        }
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public int c(long j3) {
        return yp.b(this.f4411e, j3, true, true);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f4412f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.f4408b) + ", offsets=" + Arrays.toString(this.f4409c) + ", timeUs=" + Arrays.toString(this.f4411e) + ", durationsUs=" + Arrays.toString(this.f4410d) + ")";
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        int c10 = c(j3);
        gj gjVar = new gj(this.f4411e[c10], this.f4409c[c10]);
        if (gjVar.a < j3 && c10 != this.a - 1) {
            int i10 = c10 + 1;
            return new ej.a(gjVar, new gj(this.f4411e[i10], this.f4409c[i10]));
        }
        return new ej.a(gjVar);
    }
}

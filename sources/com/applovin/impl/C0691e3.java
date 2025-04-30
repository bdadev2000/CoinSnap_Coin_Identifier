package com.applovin.impl;

import com.applovin.impl.ej;
import java.util.Arrays;

/* renamed from: com.applovin.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691e3 implements ej {

    /* renamed from: a, reason: collision with root package name */
    public final int f7380a;
    public final int[] b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7381c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7382d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f7383e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7384f;

    public C0691e3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.f7381c = jArr;
        this.f7382d = jArr2;
        this.f7383e = jArr3;
        int length = iArr.length;
        this.f7380a = length;
        if (length > 0) {
            int i9 = length - 1;
            this.f7384f = jArr2[i9] + jArr3[i9];
        } else {
            this.f7384f = 0L;
        }
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public int c(long j7) {
        return yp.b(this.f7383e, j7, true, true);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f7384f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f7380a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.f7381c) + ", timeUs=" + Arrays.toString(this.f7383e) + ", durationsUs=" + Arrays.toString(this.f7382d) + ")";
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        int c9 = c(j7);
        gj gjVar = new gj(this.f7383e[c9], this.f7381c[c9]);
        if (gjVar.f7918a < j7 && c9 != this.f7380a - 1) {
            int i9 = c9 + 1;
            return new ej.a(gjVar, new gj(this.f7383e[i9], this.f7381c[i9]));
        }
        return new ej.a(gjVar);
    }
}

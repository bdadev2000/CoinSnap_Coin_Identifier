package com.applovin.impl;

import com.applovin.impl.ij;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g3 implements ij {

    /* renamed from: a, reason: collision with root package name */
    public final int f24051a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f24052b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f24053c;
    public final long[] d;
    public final long[] e;

    /* renamed from: f, reason: collision with root package name */
    private final long f24054f;

    public g3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f24052b = iArr;
        this.f24053c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f24051a = length;
        if (length <= 0) {
            this.f24054f = 0L;
        } else {
            int i2 = length - 1;
            this.f24054f = jArr2[i2] + jArr3[i2];
        }
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public int c(long j2) {
        return xp.b(this.e, j2, true, true);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f24054f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f24051a + ", sizes=" + Arrays.toString(this.f24052b) + ", offsets=" + Arrays.toString(this.f24053c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        int c2 = c(j2);
        kj kjVar = new kj(this.e[c2], this.f24053c[c2]);
        if (kjVar.f24923a < j2 && c2 != this.f24051a - 1) {
            int i2 = c2 + 1;
            return new ij.a(kjVar, new kj(this.e[i2], this.f24053c[i2]));
        }
        return new ij.a(kjVar);
    }
}

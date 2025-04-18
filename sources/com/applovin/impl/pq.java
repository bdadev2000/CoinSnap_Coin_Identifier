package com.applovin.impl;

import com.applovin.impl.ij;
import com.applovin.impl.tf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class pq implements lj {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f26091a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f26092b;

    /* renamed from: c, reason: collision with root package name */
    private final long f26093c;
    private final long d;

    private pq(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f26091a = jArr;
        this.f26092b = jArr2;
        this.f26093c = j2;
        this.d = j3;
    }

    public static pq a(long j2, long j3, tf.a aVar, bh bhVar) {
        int w;
        bhVar.g(10);
        int j4 = bhVar.j();
        if (j4 <= 0) {
            return null;
        }
        int i2 = aVar.d;
        long c2 = xp.c(j4, (i2 >= 32000 ? 1152 : 576) * 1000000, i2);
        int C = bhVar.C();
        int C2 = bhVar.C();
        int C3 = bhVar.C();
        bhVar.g(2);
        long j5 = j3 + aVar.f27160c;
        long[] jArr = new long[C];
        long[] jArr2 = new long[C];
        int i3 = 0;
        long j6 = j3;
        while (i3 < C) {
            int i4 = C2;
            long j7 = j5;
            jArr[i3] = (i3 * c2) / C;
            jArr2[i3] = Math.max(j6, j7);
            if (C3 == 1) {
                w = bhVar.w();
            } else if (C3 == 2) {
                w = bhVar.C();
            } else if (C3 == 3) {
                w = bhVar.z();
            } else {
                if (C3 != 4) {
                    return null;
                }
                w = bhVar.A();
            }
            j6 += w * i4;
            i3++;
            j5 = j7;
            C2 = i4;
        }
        if (j2 != -1 && j2 != j6) {
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("VBRI data size mismatch: ", j2, ", ");
            r2.append(j6);
            pc.d("VbriSeeker", r2.toString());
        }
        return new pq(jArr, jArr2, c2, j6);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return this.d;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f26093c;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        int b2 = xp.b(this.f26091a, j2, true, true);
        kj kjVar = new kj(this.f26091a[b2], this.f26092b[b2]);
        if (kjVar.f24923a < j2 && b2 != this.f26091a.length - 1) {
            int i2 = b2 + 1;
            return new ij.a(kjVar, new kj(this.f26091a[i2], this.f26092b[i2]));
        }
        return new ij.a(kjVar);
    }

    @Override // com.applovin.impl.lj
    public long a(long j2) {
        return this.f26091a[xp.b(this.f26092b, j2, true, true)];
    }
}

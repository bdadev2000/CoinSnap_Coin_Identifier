package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;

/* loaded from: classes.dex */
final class qq implements hj {
    private final long[] a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f7280b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7281c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7282d;

    private qq(long[] jArr, long[] jArr2, long j3, long j10) {
        this.a = jArr;
        this.f7280b = jArr2;
        this.f7281c = j3;
        this.f7282d = j10;
    }

    public static qq a(long j3, long j10, of.a aVar, yg ygVar) {
        int w10;
        ygVar.g(10);
        int j11 = ygVar.j();
        if (j11 <= 0) {
            return null;
        }
        int i10 = aVar.f6587d;
        long c10 = yp.c(j11, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int C = ygVar.C();
        int C2 = ygVar.C();
        int C3 = ygVar.C();
        ygVar.g(2);
        long j12 = j10 + aVar.f6586c;
        long[] jArr = new long[C];
        long[] jArr2 = new long[C];
        long j13 = j10;
        for (int i11 = 0; i11 < C; i11++) {
            jArr[i11] = (i11 * c10) / C;
            jArr2[i11] = Math.max(j13, j12);
            if (C3 == 1) {
                w10 = ygVar.w();
            } else if (C3 == 2) {
                w10 = ygVar.C();
            } else if (C3 != 3) {
                if (C3 != 4) {
                    return null;
                }
                w10 = ygVar.A();
            } else {
                w10 = ygVar.z();
            }
            j13 += w10 * C2;
        }
        if (j3 != -1 && j3 != j13) {
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("VBRI data size mismatch: ", j3, ", ");
            o10.append(j13);
            kc.d("VbriSeeker", o10.toString());
        }
        return new qq(jArr, jArr2, c10, j13);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.f7282d;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f7281c;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        int b3 = yp.b(this.a, j3, true, true);
        gj gjVar = new gj(this.a[b3], this.f7280b[b3]);
        if (gjVar.a < j3 && b3 != this.a.length - 1) {
            int i10 = b3 + 1;
            return new ej.a(gjVar, new gj(this.a[i10], this.f7280b[i10]));
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.hj
    public long a(long j3) {
        return this.a[yp.b(this.f7280b, j3, true, true)];
    }
}

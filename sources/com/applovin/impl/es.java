package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;

/* loaded from: classes.dex */
final class es implements hj {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4520b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4521c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4522d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4523e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f4524f;

    private es(long j3, int i10, long j10) {
        this(j3, i10, j10, -1L, null);
    }

    public static es a(long j3, long j10, of.a aVar, yg ygVar) {
        int A;
        int i10 = aVar.f6590g;
        int i11 = aVar.f6587d;
        int j11 = ygVar.j();
        if ((j11 & 1) != 1 || (A = ygVar.A()) == 0) {
            return null;
        }
        long c10 = yp.c(A, i10 * 1000000, i11);
        if ((j11 & 6) != 6) {
            return new es(j10, aVar.f6586c, c10);
        }
        long y4 = ygVar.y();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = ygVar.w();
        }
        if (j3 != -1) {
            long j12 = j10 + y4;
            if (j3 != j12) {
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("XING data size mismatch: ", j3, ", ");
                o10.append(j12);
                kc.d("XingSeeker", o10.toString());
            }
        }
        return new es(j10, aVar.f6586c, c10, y4, jArr);
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        if (!b()) {
            return new ej.a(new gj(0L, this.a + this.f4520b));
        }
        long b3 = yp.b(j3, 0L, this.f4521c);
        double d10 = (b3 * 100.0d) / this.f4521c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) a1.b(this.f4524f))[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12) * (d10 - i10));
            }
        }
        return new ej.a(new gj(b3, this.a + yp.b(Math.round((d11 / 256.0d) * this.f4522d), this.f4520b, this.f4522d - 1)));
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.f4523e;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f4521c;
    }

    private es(long j3, int i10, long j10, long j11, long[] jArr) {
        this.a = j3;
        this.f4520b = i10;
        this.f4521c = j10;
        this.f4524f = jArr;
        this.f4522d = j11;
        this.f4523e = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.f4524f != null;
    }

    @Override // com.applovin.impl.hj
    public long a(long j3) {
        long j10 = j3 - this.a;
        if (!b() || j10 <= this.f4520b) {
            return 0L;
        }
        long[] jArr = (long[]) a1.b(this.f4524f);
        double d10 = (j10 * 256.0d) / this.f4522d;
        int b3 = yp.b(jArr, (long) d10, true, true);
        long a = a(b3);
        long j11 = jArr[b3];
        int i10 = b3 + 1;
        long a10 = a(i10);
        return Math.round((j11 == (b3 == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j11) / (r0 - j11)) * (a10 - a)) + a;
    }

    private long a(int i10) {
        return (this.f4521c * i10) / 100;
    }
}

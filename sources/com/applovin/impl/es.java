package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;
import y.AbstractC2933a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class es implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long f7486a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7487c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7488d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7489e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f7490f;

    private es(long j7, int i9, long j9) {
        this(j7, i9, j9, -1L, null);
    }

    public static es a(long j7, long j9, of.a aVar, yg ygVar) {
        int A8;
        int i9 = aVar.f9527g;
        int i10 = aVar.f9524d;
        int j10 = ygVar.j();
        if ((j10 & 1) != 1 || (A8 = ygVar.A()) == 0) {
            return null;
        }
        long c9 = yp.c(A8, i9 * 1000000, i10);
        if ((j10 & 6) != 6) {
            return new es(j9, aVar.f9523c, c9);
        }
        long y4 = ygVar.y();
        long[] jArr = new long[100];
        for (int i11 = 0; i11 < 100; i11++) {
            jArr[i11] = ygVar.w();
        }
        if (j7 != -1) {
            long j11 = j9 + y4;
            if (j7 != j11) {
                StringBuilder a6 = AbstractC2933a.a("XING data size mismatch: ", j7, ", ");
                a6.append(j11);
                kc.d("XingSeeker", a6.toString());
            }
        }
        return new es(j9, aVar.f9523c, c9, y4, jArr);
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        if (!b()) {
            return new ej.a(new gj(0L, this.f7486a + this.b));
        }
        long b = yp.b(j7, 0L, this.f7487c);
        double d2 = (b * 100.0d) / this.f7487c;
        double d9 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d9 = 256.0d;
            } else {
                int i9 = (int) d2;
                double d10 = ((long[]) AbstractC0669a1.b(this.f7490f))[i9];
                d9 = d10 + (((i9 == 99 ? 256.0d : r3[i9 + 1]) - d10) * (d2 - i9));
            }
        }
        return new ej.a(new gj(b, this.f7486a + yp.b(Math.round((d9 / 256.0d) * this.f7488d), this.b, this.f7488d - 1)));
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.f7489e;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f7487c;
    }

    private es(long j7, int i9, long j9, long j10, long[] jArr) {
        this.f7486a = j7;
        this.b = i9;
        this.f7487c = j9;
        this.f7490f = jArr;
        this.f7488d = j10;
        this.f7489e = j10 != -1 ? j7 + j10 : -1L;
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.f7490f != null;
    }

    @Override // com.applovin.impl.hj
    public long a(long j7) {
        long j9 = j7 - this.f7486a;
        if (!b() || j9 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC0669a1.b(this.f7490f);
        double d2 = (j9 * 256.0d) / this.f7488d;
        int b = yp.b(jArr, (long) d2, true, true);
        long a6 = a(b);
        long j10 = jArr[b];
        int i9 = b + 1;
        long a9 = a(i9);
        return Math.round((j10 == (b == 99 ? 256L : jArr[i9]) ? 0.0d : (d2 - j10) / (r0 - j10)) * (a9 - a6)) + a6;
    }

    private long a(int i9) {
        return (this.f7487c * i9) / 100;
    }
}

package com.applovin.impl;

import com.applovin.impl.ij;
import com.applovin.impl.tf;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ds implements lj {

    /* renamed from: a, reason: collision with root package name */
    private final long f23535a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23536b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23537c;
    private final long d;
    private final long e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f23538f;

    private ds(long j2, int i2, long j3) {
        this(j2, i2, j3, -1L, null);
    }

    public static ds a(long j2, long j3, tf.a aVar, bh bhVar) {
        int A;
        int i2 = aVar.f27162g;
        int i3 = aVar.d;
        int j4 = bhVar.j();
        if ((j4 & 1) != 1 || (A = bhVar.A()) == 0) {
            return null;
        }
        long c2 = xp.c(A, i2 * 1000000, i3);
        if ((j4 & 6) != 6) {
            return new ds(j3, aVar.f27160c, c2);
        }
        long y2 = bhVar.y();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = bhVar.w();
        }
        if (j2 != -1) {
            long j5 = j3 + y2;
            if (j2 != j5) {
                StringBuilder r2 = androidx.compose.foundation.text.input.a.r("XING data size mismatch: ", j2, ", ");
                r2.append(j5);
                pc.d("XingSeeker", r2.toString());
            }
        }
        return new ds(j3, aVar.f27160c, c2, y2, jArr);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.f23538f != null;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return this.e;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f23537c;
    }

    private ds(long j2, int i2, long j3, long j4, long[] jArr) {
        this.f23535a = j2;
        this.f23536b = i2;
        this.f23537c = j3;
        this.f23538f = jArr;
        this.d = j4;
        this.e = j4 != -1 ? j2 + j4 : -1L;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        if (!b()) {
            return new ij.a(new kj(0L, this.f23535a + this.f23536b));
        }
        long b2 = xp.b(j2, 0L, this.f23537c);
        double d = (b2 * 100.0d) / this.f23537c;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                double d3 = ((long[]) b1.b(this.f23538f))[i2];
                d2 = d3 + (((i2 == 99 ? 256.0d : r3[i2 + 1]) - d3) * (d - i2));
            }
        }
        return new ij.a(new kj(b2, this.f23535a + xp.b(Math.round((d2 / 256.0d) * this.d), this.f23536b, this.d - 1)));
    }

    @Override // com.applovin.impl.lj
    public long a(long j2) {
        long j3 = j2 - this.f23535a;
        if (!b() || j3 <= this.f23536b) {
            return 0L;
        }
        long[] jArr = (long[]) b1.b(this.f23538f);
        double d = (j3 * 256.0d) / this.d;
        int b2 = xp.b(jArr, (long) d, true, true);
        long a2 = a(b2);
        long j4 = jArr[b2];
        int i2 = b2 + 1;
        long a3 = a(i2);
        return Math.round((j4 == (b2 == 99 ? 256L : jArr[i2]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j4) / (r0 - j4)) * (a3 - a2)) + a2;
    }

    private long a(int i2) {
        return (this.f23537c * i2) / 100;
    }
}

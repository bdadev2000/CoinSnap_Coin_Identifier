package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ff implements hj {
    private final long[] a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f4730b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4731c;

    private ff(long[] jArr, long[] jArr2, long j3) {
        this.a = jArr;
        this.f4730b = jArr2;
        this.f4731c = j3 == C.TIME_UNSET ? r2.a(jArr2[jArr2.length - 1]) : j3;
    }

    public static ff a(long j3, ef efVar, long j10) {
        int length = efVar.f4447f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j3;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j3 += efVar.f4445c + efVar.f4447f[i12];
            j11 += efVar.f4446d + efVar.f4448g[i12];
            jArr[i11] = j3;
            jArr2[i11] = j11;
        }
        return new ff(jArr, jArr2, j10);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return -1L;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f4731c;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        Pair a = a(r2.b(yp.b(j3, 0L, this.f4731c)), this.f4730b, this.a);
        return new ej.a(new gj(r2.a(((Long) a.first).longValue()), ((Long) a.second).longValue()));
    }

    @Override // com.applovin.impl.hj
    public long a(long j3) {
        return r2.a(((Long) a(j3, this.a, this.f4730b).second).longValue());
    }

    private static Pair a(long j3, long[] jArr, long[] jArr2) {
        int b3 = yp.b(jArr, j3, true, true);
        long j10 = jArr[b3];
        long j11 = jArr2[b3];
        int i10 = b3 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) ((jArr[i10] == j10 ? 0.0d : (j3 - j10) / (r6 - j10)) * (jArr2[i10] - j11))) + j11));
    }
}

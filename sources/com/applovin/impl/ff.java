package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.ej;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ff implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f7687a;
    private final long[] b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7688c;

    private ff(long[] jArr, long[] jArr2, long j7) {
        this.f7687a = jArr;
        this.b = jArr2;
        this.f7688c = j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? AbstractC0744r2.a(jArr2[jArr2.length - 1]) : j7;
    }

    public static ff a(long j7, ef efVar, long j9) {
        int length = efVar.f7418f.length;
        int i9 = length + 1;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        jArr[0] = j7;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j7 += efVar.f7416c + efVar.f7418f[i11];
            j10 += efVar.f7417d + efVar.f7419g[i11];
            jArr[i10] = j7;
            jArr2[i10] = j10;
        }
        return new ff(jArr, jArr2, j9);
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
        return this.f7688c;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        Pair a6 = a(AbstractC0744r2.b(yp.b(j7, 0L, this.f7688c)), this.b, this.f7687a);
        return new ej.a(new gj(AbstractC0744r2.a(((Long) a6.first).longValue()), ((Long) a6.second).longValue()));
    }

    @Override // com.applovin.impl.hj
    public long a(long j7) {
        return AbstractC0744r2.a(((Long) a(j7, this.f7687a, this.b).second).longValue());
    }

    private static Pair a(long j7, long[] jArr, long[] jArr2) {
        int b = yp.b(jArr, j7, true, true);
        long j9 = jArr[b];
        long j10 = jArr2[b];
        int i9 = b + 1;
        if (i9 == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) ((jArr[i9] == j9 ? 0.0d : (j7 - j9) / (r6 - j9)) * (jArr2[i9] - j10))) + j10));
    }
}

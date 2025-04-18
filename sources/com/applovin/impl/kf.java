package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.ij;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class kf implements lj {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f24917a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f24918b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24919c;

    private kf(long[] jArr, long[] jArr2, long j2) {
        this.f24917a = jArr;
        this.f24918b = jArr2;
        this.f24919c = j2 == -9223372036854775807L ? t2.a(jArr2[jArr2.length - 1]) : j2;
    }

    public static kf a(long j2, jf jfVar, long j3) {
        int length = jfVar.f24671f.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += jfVar.f24670c + jfVar.f24671f[i4];
            j4 += jfVar.d + jfVar.f24672g[i4];
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new kf(jArr, jArr2, j3);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return -1L;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f24919c;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        Pair a2 = a(t2.b(xp.b(j2, 0L, this.f24919c)), this.f24918b, this.f24917a);
        return new ij.a(new kj(t2.a(((Long) a2.first).longValue()), ((Long) a2.second).longValue()));
    }

    @Override // com.applovin.impl.lj
    public long a(long j2) {
        return t2.a(((Long) a(j2, this.f24917a, this.f24918b).second).longValue());
    }

    private static Pair a(long j2, long[] jArr, long[] jArr2) {
        int b2 = xp.b(jArr, j2, true, true);
        long j3 = jArr[b2];
        long j4 = jArr2[b2];
        int i2 = b2 + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i2] == j3 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j2 - j3) / (r6 - j3)) * (jArr2[i2] - j4))) + j4));
    }
}

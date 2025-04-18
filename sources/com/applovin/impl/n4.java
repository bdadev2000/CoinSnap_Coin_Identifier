package com.applovin.impl;

import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public class n4 implements ej {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6344b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6345c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6346d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6347e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6348f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6349g;

    public n4(long j3, long j10, int i10, int i11, boolean z10) {
        this.a = j3;
        this.f6344b = j10;
        this.f6345c = i11 == -1 ? 1 : i11;
        this.f6347e = i10;
        this.f6349g = z10;
        if (j3 == -1) {
            this.f6346d = -1L;
            this.f6348f = C.TIME_UNSET;
        } else {
            this.f6346d = j3 - j10;
            this.f6348f = a(j3, j10, i10);
        }
    }

    private static long a(long j3, long j10, int i10) {
        return (Math.max(0L, j3 - j10) * 8000000) / i10;
    }

    private long c(long j3) {
        long j10 = this.f6345c;
        long j11 = (((j3 * this.f6347e) / 8000000) / j10) * j10;
        long j12 = this.f6346d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - j10);
        }
        return this.f6344b + Math.max(j11, 0L);
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        if (this.f6346d == -1 && !this.f6349g) {
            return new ej.a(new gj(0L, this.f6344b));
        }
        long c10 = c(j3);
        long d10 = d(c10);
        gj gjVar = new gj(d10, c10);
        if (this.f6346d != -1 && d10 < j3) {
            long j10 = c10 + this.f6345c;
            if (j10 < this.a) {
                return new ej.a(gjVar, new gj(d(j10), j10));
            }
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f6348f;
    }

    public long d(long j3) {
        return a(j3, this.f6344b, this.f6347e);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.f6346d != -1 || this.f6349g;
    }
}

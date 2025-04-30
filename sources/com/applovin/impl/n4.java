package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public class n4 implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final long f9267a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9268c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9269d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9270e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9271f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9272g;

    public n4(long j7, long j9, int i9, int i10, boolean z8) {
        this.f9267a = j7;
        this.b = j9;
        this.f9268c = i10 == -1 ? 1 : i10;
        this.f9270e = i9;
        this.f9272g = z8;
        if (j7 == -1) {
            this.f9269d = -1L;
            this.f9271f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        } else {
            this.f9269d = j7 - j9;
            this.f9271f = a(j7, j9, i9);
        }
    }

    private static long a(long j7, long j9, int i9) {
        return (Math.max(0L, j7 - j9) * 8000000) / i9;
    }

    private long c(long j7) {
        long j9 = this.f9268c;
        long j10 = (((j7 * this.f9270e) / 8000000) / j9) * j9;
        long j11 = this.f9269d;
        if (j11 != -1) {
            j10 = Math.min(j10, j11 - j9);
        }
        return this.b + Math.max(j10, 0L);
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        if (this.f9269d == -1 && !this.f9272g) {
            return new ej.a(new gj(0L, this.b));
        }
        long c9 = c(j7);
        long d2 = d(c9);
        gj gjVar = new gj(d2, c9);
        if (this.f9269d != -1 && d2 < j7) {
            long j9 = c9 + this.f9268c;
            if (j9 < this.f9267a) {
                return new ej.a(gjVar, new gj(d(j9), j9));
            }
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f9271f;
    }

    public long d(long j7) {
        return a(j7, this.b, this.f9270e);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return this.f9269d != -1 || this.f9272g;
    }
}

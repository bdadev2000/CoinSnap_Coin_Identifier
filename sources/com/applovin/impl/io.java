package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class io {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f5362b;

    /* renamed from: c, reason: collision with root package name */
    private long f5363c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f5364d = new ThreadLocal();

    public io(long j3) {
        d(j3);
    }

    public static long e(long j3) {
        return (j3 * 90000) / 1000000;
    }

    public synchronized long a(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.f5362b == C.TIME_UNSET) {
            long j10 = this.a;
            if (j10 == 9223372036854775806L) {
                j10 = ((Long) a1.a((Long) this.f5364d.get())).longValue();
            }
            this.f5362b = j10 - j3;
            notifyAll();
        }
        this.f5363c = j3;
        return j3 + this.f5362b;
    }

    public synchronized long b(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j10 = this.f5363c;
        if (j10 != C.TIME_UNSET) {
            long e2 = e(j10);
            long j11 = (4294967296L + e2) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j3;
            j3 += j11 * 8589934592L;
            if (Math.abs(j12 - e2) < Math.abs(j3 - e2)) {
                j3 = j12;
            }
        }
        return a(c(j3));
    }

    public synchronized long c() {
        return this.f5362b;
    }

    public synchronized void d(long j3) {
        long j10;
        this.a = j3;
        if (j3 == Long.MAX_VALUE) {
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f5362b = j10;
        this.f5363c = C.TIME_UNSET;
    }

    public static long c(long j3) {
        return (j3 * 1000000) / 90000;
    }

    public synchronized long b() {
        long a;
        long j3 = this.f5363c;
        if (j3 != C.TIME_UNSET) {
            a = j3 + this.f5362b;
        } else {
            a = a();
        }
        return a;
    }

    public synchronized long a() {
        long j3;
        j3 = this.a;
        if (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) {
            j3 = C.TIME_UNSET;
        }
        return j3;
    }
}

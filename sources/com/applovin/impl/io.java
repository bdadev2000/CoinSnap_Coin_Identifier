package com.applovin.impl;

/* loaded from: classes.dex */
public final class io {

    /* renamed from: a, reason: collision with root package name */
    private long f8327a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f8328c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f8329d = new ThreadLocal();

    public io(long j7) {
        d(j7);
    }

    public static long e(long j7) {
        return (j7 * 90000) / 1000000;
    }

    public synchronized long a(long j7) {
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        try {
            if (this.b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                long j9 = this.f8327a;
                if (j9 == 9223372036854775806L) {
                    j9 = ((Long) AbstractC0669a1.a((Long) this.f8329d.get())).longValue();
                }
                this.b = j9 - j7;
                notifyAll();
            }
            this.f8328c = j7;
            return j7 + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j7) {
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        try {
            long j9 = this.f8328c;
            if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                long e4 = e(j9);
                long j10 = (4294967296L + e4) / 8589934592L;
                long j11 = ((j10 - 1) * 8589934592L) + j7;
                j7 += j10 * 8589934592L;
                if (Math.abs(j11 - e4) < Math.abs(j7 - e4)) {
                    j7 = j11;
                }
            }
            return a(c(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        return this.b;
    }

    public synchronized void d(long j7) {
        long j9;
        this.f8327a = j7;
        if (j7 == Long.MAX_VALUE) {
            j9 = 0;
        } else {
            j9 = -9223372036854775807L;
        }
        this.b = j9;
        this.f8328c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public static long c(long j7) {
        return (j7 * 1000000) / 90000;
    }

    public synchronized long b() {
        long a6;
        try {
            long j7 = this.f8328c;
            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                a6 = j7 + this.b;
            } else {
                a6 = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a6;
    }

    public synchronized long a() {
        long j7;
        j7 = this.f8327a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return j7;
    }
}

package com.applovin.impl;

/* loaded from: classes.dex */
public final class ho {

    /* renamed from: a, reason: collision with root package name */
    private long f24339a;

    /* renamed from: b, reason: collision with root package name */
    private long f24340b;

    /* renamed from: c, reason: collision with root package name */
    private long f24341c;
    private final ThreadLocal d = new ThreadLocal();

    public ho(long j2) {
        d(j2);
    }

    public static long e(long j2) {
        return (j2 * 90000) / 1000000;
    }

    public synchronized long a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f24340b == -9223372036854775807L) {
                long j3 = this.f24339a;
                if (j3 == 9223372036854775806L) {
                    j3 = ((Long) b1.a((Long) this.d.get())).longValue();
                }
                this.f24340b = j3 - j2;
                notifyAll();
            }
            this.f24341c = j2;
            return j2 + this.f24340b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f24341c;
            if (j3 != -9223372036854775807L) {
                long e = e(j3);
                long j4 = (4294967296L + e) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j2;
                j2 += j4 * 8589934592L;
                if (Math.abs(j5 - e) < Math.abs(j2 - e)) {
                    j2 = j5;
                }
            }
            return a(c(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        return this.f24340b;
    }

    public synchronized void d(long j2) {
        this.f24339a = j2;
        this.f24340b = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f24341c = -9223372036854775807L;
    }

    public static long c(long j2) {
        return (j2 * 1000000) / 90000;
    }

    public synchronized long a() {
        long j2;
        j2 = this.f24339a;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = -9223372036854775807L;
        }
        return j2;
    }

    public synchronized long b() {
        long j2;
        try {
            j2 = this.f24341c;
        } catch (Throwable th) {
            throw th;
        }
        return j2 != -9223372036854775807L ? j2 + this.f24340b : a();
    }
}

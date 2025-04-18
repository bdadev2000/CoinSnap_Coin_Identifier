package n9;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class f0 {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f22536b;

    /* renamed from: c, reason: collision with root package name */
    public long f22537c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f22538d = new ThreadLocal();

    public f0(long j3) {
        d(j3);
    }

    public final synchronized long a(long j3) {
        boolean z10;
        long j10;
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        synchronized (this) {
            if (this.f22536b != C.TIME_UNSET) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j11 = this.a;
                if (j11 == 9223372036854775806L) {
                    Long l10 = (Long) this.f22538d.get();
                    l10.getClass();
                    j11 = l10.longValue();
                }
                this.f22536b = j11 - j3;
                notifyAll();
            }
            this.f22537c = j3;
            j10 = j3 + this.f22536b;
        }
        return j10;
    }

    public final synchronized long b(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j10 = this.f22537c;
        if (j10 != C.TIME_UNSET) {
            long j11 = (j10 * 90000) / 1000000;
            long j12 = (4294967296L + j11) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j3;
            long j14 = (j12 * 8589934592L) + j3;
            if (Math.abs(j13 - j11) < Math.abs(j14 - j11)) {
                j3 = j13;
            } else {
                j3 = j14;
            }
        }
        return a((j3 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j3;
        j3 = this.a;
        if (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) {
            j3 = C.TIME_UNSET;
        }
        return j3;
    }

    public final synchronized void d(long j3) {
        long j10;
        this.a = j3;
        if (j3 == Long.MAX_VALUE) {
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f22536b = j10;
        this.f22537c = C.TIME_UNSET;
    }
}

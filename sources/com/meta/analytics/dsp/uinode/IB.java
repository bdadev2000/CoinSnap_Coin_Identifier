package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class IB {
    public long A00;
    public long A01;
    public volatile long A02 = C.TIME_UNSET;

    public IB(long j7) {
        A02(j7);
    }

    public static long A00(long j7) {
        return (1000000 * j7) / 90000;
    }

    public static long A01(long j7) {
        return (90000 * j7) / 1000000;
    }

    private final synchronized void A02(long j7) {
        AbstractC1192Ha.A04(this.A02 == C.TIME_UNSET);
        this.A00 = j7;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        if (this.A02 != C.TIME_UNSET) {
            return this.A01 + this.A02;
        }
        long j7 = this.A00;
        return j7 != Long.MAX_VALUE ? j7 : C.TIME_UNSET;
    }

    public final long A05() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        return this.A02 == C.TIME_UNSET ? C.TIME_UNSET : this.A01;
    }

    public final long A06(long j7) {
        if (j7 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 != C.TIME_UNSET) {
            this.A02 = j7;
        } else {
            long j9 = this.A00;
            if (j9 != Long.MAX_VALUE) {
                this.A01 = j9 - j7;
            }
            synchronized (this) {
                this.A02 = j7;
                notifyAll();
            }
        }
        return this.A01 + j7;
    }

    public final long A07(long j7) {
        if (j7 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 != C.TIME_UNSET) {
            long A01 = A01(this.A02);
            long closestWrapCount = (4294967296L + A01) / 8589934592L;
            long j9 = ((closestWrapCount - 1) * 8589934592L) + j7;
            long j10 = (8589934592L * closestWrapCount) + j7;
            long lastPts = j9 - A01;
            long abs = Math.abs(lastPts);
            long lastPts2 = j10 - A01;
            if (abs >= Math.abs(lastPts2)) {
                j9 = j10;
            }
            j7 = j9;
        }
        long lastPts3 = A00(j7);
        return A06(lastPts3);
    }

    public final void A08() {
        this.A02 = C.TIME_UNSET;
    }
}

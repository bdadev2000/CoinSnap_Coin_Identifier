package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class IB {
    public long A00;
    public long A01;
    public volatile long A02 = C.TIME_UNSET;

    public IB(long j3) {
        A02(j3);
    }

    public static long A00(long j3) {
        return (1000000 * j3) / 90000;
    }

    public static long A01(long j3) {
        return (90000 * j3) / 1000000;
    }

    private final synchronized void A02(long j3) {
        AbstractC0626Ha.A04(this.A02 == C.TIME_UNSET);
        this.A00 = j3;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        if (this.A02 != C.TIME_UNSET) {
            return this.A01 + this.A02;
        }
        long j3 = this.A00;
        return j3 != Long.MAX_VALUE ? j3 : C.TIME_UNSET;
    }

    public final long A05() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        return this.A02 == C.TIME_UNSET ? C.TIME_UNSET : this.A01;
    }

    public final long A06(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 != C.TIME_UNSET) {
            this.A02 = j3;
        } else {
            long j10 = this.A00;
            if (j10 != Long.MAX_VALUE) {
                this.A01 = j10 - j3;
            }
            synchronized (this) {
                this.A02 = j3;
                notifyAll();
            }
        }
        return this.A01 + j3;
    }

    public final long A07(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 != C.TIME_UNSET) {
            long A01 = A01(this.A02);
            long closestWrapCount = (4294967296L + A01) / 8589934592L;
            long j10 = ((closestWrapCount - 1) * 8589934592L) + j3;
            long j11 = (8589934592L * closestWrapCount) + j3;
            long lastPts = j10 - A01;
            long abs = Math.abs(lastPts);
            long lastPts2 = j11 - A01;
            if (abs >= Math.abs(lastPts2)) {
                j10 = j11;
            }
            j3 = j10;
        }
        long lastPts3 = A00(j3);
        return A06(lastPts3);
    }

    public final void A08() {
        this.A02 = C.TIME_UNSET;
    }
}

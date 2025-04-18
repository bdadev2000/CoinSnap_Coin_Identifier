package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes4.dex */
public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private volatile long lastSampleTimestampUs = C.TIME_UNSET;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j3) {
        setFirstSampleTimestampUs(j3);
    }

    public static long ptsToUs(long j3) {
        return (j3 * 1000000) / 90000;
    }

    public static long usToPts(long j3) {
        return (j3 * 90000) / 1000000;
    }

    public final long adjustSampleTimestamp(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            this.lastSampleTimestampUs = j3;
        } else {
            long j10 = this.firstSampleTimestampUs;
            if (j10 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j10 - j3;
            }
            synchronized (this) {
                this.lastSampleTimestampUs = j3;
                notifyAll();
            }
        }
        return j3 + this.timestampOffsetUs;
    }

    public final long adjustTsTimestamp(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            long usToPts = usToPts(this.lastSampleTimestampUs);
            long j10 = (4294967296L + usToPts) / MAX_PTS_PLUS_ONE;
            long j11 = ((j10 - 1) * MAX_PTS_PLUS_ONE) + j3;
            long j12 = (j10 * MAX_PTS_PLUS_ONE) + j3;
            if (Math.abs(j11 - usToPts) < Math.abs(j12 - usToPts)) {
                j3 = j11;
            } else {
                j3 = j12;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j3));
    }

    public final long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public final long getLastAdjustedTimestampUs() {
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            return this.timestampOffsetUs + this.lastSampleTimestampUs;
        }
        long j3 = this.firstSampleTimestampUs;
        if (j3 == Long.MAX_VALUE) {
            return C.TIME_UNSET;
        }
        return j3;
    }

    public final long getTimestampOffsetUs() {
        if (this.firstSampleTimestampUs == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.lastSampleTimestampUs == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return this.timestampOffsetUs;
    }

    public final void reset() {
        this.lastSampleTimestampUs = C.TIME_UNSET;
    }

    public final synchronized void setFirstSampleTimestampUs(long j3) {
        boolean z10;
        if (this.lastSampleTimestampUs == C.TIME_UNSET) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.firstSampleTimestampUs = j3;
    }

    public final synchronized void waitUntilInitialized() throws InterruptedException {
        while (this.lastSampleTimestampUs == C.TIME_UNSET) {
            wait();
        }
    }
}

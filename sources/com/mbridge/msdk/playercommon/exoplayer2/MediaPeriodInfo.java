package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;

/* loaded from: classes3.dex */
final class MediaPeriodInfo {
    public final long contentPositionUs;
    public final long durationUs;
    public final long endPositionUs;
    public final MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j7, long j9, long j10, long j11, boolean z8, boolean z9) {
        this.id = mediaPeriodId;
        this.startPositionUs = j7;
        this.endPositionUs = j9;
        this.contentPositionUs = j10;
        this.durationUs = j11;
        this.isLastInTimelinePeriod = z8;
        this.isFinal = z9;
    }

    public final MediaPeriodInfo copyWithPeriodIndex(int i9) {
        return new MediaPeriodInfo(this.id.copyWithPeriodIndex(i9), this.startPositionUs, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }

    public final MediaPeriodInfo copyWithStartPositionUs(long j7) {
        return new MediaPeriodInfo(this.id, j7, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }
}

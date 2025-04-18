package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;

/* loaded from: classes4.dex */
final class MediaPeriodInfo {
    public final long contentPositionUs;
    public final long durationUs;
    public final long endPositionUs;

    /* renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f14725id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j3, long j10, long j11, long j12, boolean z10, boolean z11) {
        this.f14725id = mediaPeriodId;
        this.startPositionUs = j3;
        this.endPositionUs = j10;
        this.contentPositionUs = j11;
        this.durationUs = j12;
        this.isLastInTimelinePeriod = z10;
        this.isFinal = z11;
    }

    public final MediaPeriodInfo copyWithPeriodIndex(int i10) {
        return new MediaPeriodInfo(this.f14725id.copyWithPeriodIndex(i10), this.startPositionUs, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }

    public final MediaPeriodInfo copyWithStartPositionUs(long j3) {
        return new MediaPeriodInfo(this.f14725id, j3, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }
}

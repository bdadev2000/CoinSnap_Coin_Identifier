package com.mbridge.msdk.playercommon.exoplayer2.source.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes3.dex */
final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        boolean z8;
        if (timeline.getPeriodCount() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i9, Timeline.Period period, boolean z8) {
        this.timeline.getPeriod(i9, period, z8);
        period.set(period.id, period.uid, period.windowIndex, period.durationUs, period.getPositionInWindowUs(), this.adPlaybackState);
        return period;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i9, Timeline.Window window, boolean z8, long j7) {
        Timeline.Window window2 = super.getWindow(i9, window, z8, j7);
        if (window2.durationUs == C.TIME_UNSET) {
            window2.durationUs = this.adPlaybackState.contentDurationUs;
        }
        return window2;
    }
}

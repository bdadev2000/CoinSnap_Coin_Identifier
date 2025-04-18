package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class LoopingMediaSource extends CompositeMediaSource<Void> {
    private int childPeriodCount;
    private final MediaSource childSource;
    private final int loopCount;

    /* loaded from: classes4.dex */
    public static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        public InfinitelyLoopingTimeline(Timeline timeline) {
            super(timeline);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getNextWindowIndex(int i10, int i11, boolean z10) {
            int nextWindowIndex = this.timeline.getNextWindowIndex(i10, i11, z10);
            if (nextWindowIndex == -1) {
                return getFirstWindowIndex(z10);
            }
            return nextWindowIndex;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getPreviousWindowIndex(int i10, int i11, boolean z10) {
            int previousWindowIndex = this.timeline.getPreviousWindowIndex(i10, i11, z10);
            if (previousWindowIndex == -1) {
                return getLastWindowIndex(z10);
            }
            return previousWindowIndex;
        }
    }

    /* loaded from: classes4.dex */
    public static final class LoopingTimeline extends AbstractConcatenatedTimeline {
        private final int childPeriodCount;
        private final Timeline childTimeline;
        private final int childWindowCount;
        private final int loopCount;

        public LoopingTimeline(Timeline timeline, int i10) {
            super(false, new ShuffleOrder.UnshuffledShuffleOrder(i10));
            this.childTimeline = timeline;
            int periodCount = timeline.getPeriodCount();
            this.childPeriodCount = periodCount;
            this.childWindowCount = timeline.getWindowCount();
            this.loopCount = i10;
            if (periodCount > 0) {
                Assertions.checkState(i10 <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getChildIndexByChildUid(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getChildIndexByPeriodIndex(int i10) {
            return i10 / this.childPeriodCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getChildIndexByWindowIndex(int i10) {
            return i10 / this.childWindowCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final Object getChildUidByChildIndex(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getFirstPeriodIndexByChildIndex(int i10) {
            return i10 * this.childPeriodCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getFirstWindowIndexByChildIndex(int i10) {
            return i10 * this.childWindowCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getPeriodCount() {
            return this.childPeriodCount * this.loopCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final Timeline getTimelineByChildIndex(int i10) {
            return this.childTimeline;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getWindowCount() {
            return this.childWindowCount * this.loopCount;
        }
    }

    public LoopingMediaSource(MediaSource mediaSource) {
        this(mediaSource, Integer.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        if (this.loopCount != Integer.MAX_VALUE) {
            return this.childSource.createPeriod(mediaPeriodId.copyWithPeriodIndex(mediaPeriodId.periodIndex % this.childPeriodCount), allocator);
        }
        return this.childSource.createPeriod(mediaPeriodId, allocator);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z10) {
        super.prepareSourceInternal(exoPlayer, z10);
        prepareChildSource(null, this.childSource);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        this.childSource.releasePeriod(mediaPeriod);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.childPeriodCount = 0;
    }

    public LoopingMediaSource(MediaSource mediaSource, int i10) {
        Assertions.checkArgument(i10 > 0);
        this.childSource = mediaSource;
        this.loopCount = i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Void r12, MediaSource mediaSource, Timeline timeline, Object obj) {
        Timeline infinitelyLoopingTimeline;
        this.childPeriodCount = timeline.getPeriodCount();
        if (this.loopCount != Integer.MAX_VALUE) {
            infinitelyLoopingTimeline = new LoopingTimeline(timeline, this.loopCount);
        } else {
            infinitelyLoopingTimeline = new InfinitelyLoopingTimeline(timeline);
        }
        refreshSourceInfo(infinitelyLoopingTimeline, obj);
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ClippingMediaSource extends CompositeMediaSource<Void> {
    private final boolean allowDynamicClippingUpdates;
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private Object manifest;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private final MediaSource mediaSource;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    /* loaded from: classes4.dex */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j3, long j10) throws IllegalClippingException {
            super(timeline);
            long max;
            long j11;
            boolean z10 = false;
            if (timeline.getPeriodCount() == 1) {
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window(), false);
                long max2 = Math.max(0L, j3);
                if (j10 == Long.MIN_VALUE) {
                    max = window.durationUs;
                } else {
                    max = Math.max(0L, j10);
                }
                long j12 = window.durationUs;
                if (j12 != C.TIME_UNSET) {
                    max = max > j12 ? j12 : max;
                    if (max2 != 0 && !window.isSeekable) {
                        throw new IllegalClippingException(1);
                    }
                    if (max2 > max) {
                        throw new IllegalClippingException(2);
                    }
                }
                this.startUs = max2;
                this.endUs = max;
                if (max == C.TIME_UNSET) {
                    j11 = -9223372036854775807L;
                } else {
                    j11 = max - max2;
                }
                this.durationUs = j11;
                if (window.isDynamic && (max == C.TIME_UNSET || (j12 != C.TIME_UNSET && max == j12))) {
                    z10 = true;
                }
                this.isDynamic = z10;
                return;
            }
            throw new IllegalClippingException(0);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            long j3;
            this.timeline.getPeriod(0, period, z10);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j10 = this.durationUs;
            if (j10 == C.TIME_UNSET) {
                j3 = -9223372036854775807L;
            } else {
                j3 = j10 - positionInWindowUs;
            }
            return period.set(period.f14726id, period.uid, 0, j3, positionInWindowUs);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Window getWindow(int i10, Timeline.Window window, boolean z10, long j3) {
            this.timeline.getWindow(0, window, z10, 0L);
            long j10 = window.positionInFirstPeriodUs;
            long j11 = this.startUs;
            window.positionInFirstPeriodUs = j10 + j11;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j12 = window.defaultPositionUs;
            if (j12 != C.TIME_UNSET) {
                long max = Math.max(j12, j11);
                window.defaultPositionUs = max;
                long j13 = this.endUs;
                if (j13 != C.TIME_UNSET) {
                    max = Math.min(max, j13);
                }
                window.defaultPositionUs = max - this.startUs;
            }
            long usToMs = C.usToMs(this.startUs);
            long j14 = window.presentationStartTimeMs;
            if (j14 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j14 + usToMs;
            }
            long j15 = window.windowStartTimeMs;
            if (j15 != C.TIME_UNSET) {
                window.windowStartTimeMs = j15 + usToMs;
            }
            return window;
        }
    }

    /* loaded from: classes4.dex */
    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* loaded from: classes4.dex */
        public @interface Reason {
        }

        public IllegalClippingException(int i10) {
            super("Illegal clipping: " + getReasonDescription(i10));
            this.reason = i10;
        }

        private static String getReasonDescription(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? AppLovinMediationProvider.UNKNOWN : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j3, long j10) {
        this(mediaSource, j3, j10, true, false, false);
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j3;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        long j10 = Long.MIN_VALUE;
        if (this.clippingTimeline != null && !this.mediaPeriods.isEmpty() && !this.allowDynamicClippingUpdates) {
            long j11 = this.periodStartUs - positionInFirstPeriodUs;
            if (this.endUs != Long.MIN_VALUE) {
                j10 = this.periodEndUs - positionInFirstPeriodUs;
            }
            j3 = j11;
        } else {
            long j12 = this.startUs;
            long j13 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j12 += defaultPositionUs;
                j13 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j12;
            if (this.endUs != Long.MIN_VALUE) {
                j10 = positionInFirstPeriodUs + j13;
            }
            this.periodEndUs = j10;
            int size = this.mediaPeriods.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.mediaPeriods.get(i10).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j3 = j12;
            j10 = j13;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j3, j10);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline, this.manifest);
        } catch (IllegalClippingException e2) {
            this.clippingError = e2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException == null) {
            super.maybeThrowSourceInfoRefreshError();
            return;
        }
        throw illegalClippingException;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z10) {
        super.prepareSourceInternal(exoPlayer, z10);
        prepareChildSource(null, this.mediaSource);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (this.mediaPeriods.isEmpty() && !this.allowDynamicClippingUpdates) {
            refreshClippedTimeline(this.clippingTimeline.timeline);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    public ClippingMediaSource(MediaSource mediaSource, long j3, long j10, boolean z10) {
        this(mediaSource, j3, j10, z10, false, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(Void r72, long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long usToMs = C.usToMs(this.startUs);
        long max = Math.max(0L, j3 - usToMs);
        long j10 = this.endUs;
        return j10 != Long.MIN_VALUE ? Math.min(C.usToMs(j10) - usToMs, max) : max;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Void r12, MediaSource mediaSource, Timeline timeline, Object obj) {
        if (this.clippingError != null) {
            return;
        }
        this.manifest = obj;
        refreshClippedTimeline(timeline);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j3) {
        this(mediaSource, 0L, j3, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j3, long j10, boolean z10, boolean z11, boolean z12) {
        Assertions.checkArgument(j3 >= 0);
        this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        this.startUs = j3;
        this.endUs = j10;
        this.enableInitialDiscontinuity = z10;
        this.allowDynamicClippingUpdates = z11;
        this.relativeToDefaultPosition = z12;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }
}

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

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j7, long j9) throws IllegalClippingException {
            super(timeline);
            long max;
            long j10;
            boolean z8 = false;
            if (timeline.getPeriodCount() == 1) {
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window(), false);
                long max2 = Math.max(0L, j7);
                if (j9 == Long.MIN_VALUE) {
                    max = window.durationUs;
                } else {
                    max = Math.max(0L, j9);
                }
                long j11 = window.durationUs;
                if (j11 != C.TIME_UNSET) {
                    max = max > j11 ? j11 : max;
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
                    j10 = -9223372036854775807L;
                } else {
                    j10 = max - max2;
                }
                this.durationUs = j10;
                if (window.isDynamic && (max == C.TIME_UNSET || (j11 != C.TIME_UNSET && max == j11))) {
                    z8 = true;
                }
                this.isDynamic = z8;
                return;
            }
            throw new IllegalClippingException(0);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i9, Timeline.Period period, boolean z8) {
            long j7;
            this.timeline.getPeriod(0, period, z8);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j9 = this.durationUs;
            if (j9 == C.TIME_UNSET) {
                j7 = -9223372036854775807L;
            } else {
                j7 = j9 - positionInWindowUs;
            }
            return period.set(period.id, period.uid, 0, j7, positionInWindowUs);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Window getWindow(int i9, Timeline.Window window, boolean z8, long j7) {
            this.timeline.getWindow(0, window, z8, 0L);
            long j9 = window.positionInFirstPeriodUs;
            long j10 = this.startUs;
            window.positionInFirstPeriodUs = j9 + j10;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j11 = window.defaultPositionUs;
            if (j11 != C.TIME_UNSET) {
                long max = Math.max(j11, j10);
                window.defaultPositionUs = max;
                long j12 = this.endUs;
                if (j12 != C.TIME_UNSET) {
                    max = Math.min(max, j12);
                }
                window.defaultPositionUs = max - this.startUs;
            }
            long usToMs = C.usToMs(this.startUs);
            long j13 = window.presentationStartTimeMs;
            if (j13 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j13 + usToMs;
            }
            long j14 = window.windowStartTimeMs;
            if (j14 != C.TIME_UNSET) {
                window.windowStartTimeMs = j14 + usToMs;
            }
            return window;
        }
    }

    /* loaded from: classes3.dex */
    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* loaded from: classes3.dex */
        public @interface Reason {
        }

        public IllegalClippingException(int i9) {
            super("Illegal clipping: " + getReasonDescription(i9));
            this.reason = i9;
        }

        private static String getReasonDescription(int i9) {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        return AppLovinMediationProvider.UNKNOWN;
                    }
                    return "start exceeds end";
                }
                return "not seekable to start";
            }
            return "invalid period count";
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j7, long j9) {
        this(mediaSource, j7, j9, true, false, false);
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j7;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        long j9 = Long.MIN_VALUE;
        if (this.clippingTimeline != null && !this.mediaPeriods.isEmpty() && !this.allowDynamicClippingUpdates) {
            long j10 = this.periodStartUs - positionInFirstPeriodUs;
            if (this.endUs != Long.MIN_VALUE) {
                j9 = this.periodEndUs - positionInFirstPeriodUs;
            }
            j7 = j10;
        } else {
            long j11 = this.startUs;
            long j12 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j11 += defaultPositionUs;
                j12 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j11;
            if (this.endUs != Long.MIN_VALUE) {
                j9 = positionInFirstPeriodUs + j12;
            }
            this.periodEndUs = j9;
            int size = this.mediaPeriods.size();
            for (int i9 = 0; i9 < size; i9++) {
                this.mediaPeriods.get(i9).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j7 = j11;
            j9 = j12;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j7, j9);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline, this.manifest);
        } catch (IllegalClippingException e4) {
            this.clippingError = e4;
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
    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z8) {
        super.prepareSourceInternal(exoPlayer, z8);
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

    public ClippingMediaSource(MediaSource mediaSource, long j7, long j9, boolean z8) {
        this(mediaSource, j7, j9, z8, false, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(Void r72, long j7) {
        if (j7 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long usToMs = C.usToMs(this.startUs);
        long max = Math.max(0L, j7 - usToMs);
        long j9 = this.endUs;
        return j9 != Long.MIN_VALUE ? Math.min(C.usToMs(j9) - usToMs, max) : max;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Void r12, MediaSource mediaSource, Timeline timeline, Object obj) {
        if (this.clippingError != null) {
            return;
        }
        this.manifest = obj;
        refreshClippedTimeline(timeline);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j7) {
        this(mediaSource, 0L, j7, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j7, long j9, boolean z8, boolean z9, boolean z10) {
        Assertions.checkArgument(j7 >= 0);
        this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        this.startUs = j7;
        this.endUs = j9;
        this.enableInitialDiscontinuity = z8;
        this.allowDynamicClippingUpdates = z9;
        this.relativeToDefaultPosition = z10;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }
}

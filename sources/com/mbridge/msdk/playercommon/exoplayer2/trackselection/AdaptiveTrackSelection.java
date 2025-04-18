package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.List;

/* loaded from: classes4.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.75f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    public static final long DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 2000;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private final long minTimeBetweenBufferReevaluationMs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    /* loaded from: classes4.dex */
    public static final class Factory implements TrackSelection.Factory {
        private final float bandwidthFraction;
        private final BandwidthMeter bandwidthMeter;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;
        private final long minTimeBetweenBufferReevaluationMs;

        public Factory(BandwidthMeter bandwidthMeter) {
            this(bandwidthMeter, 10000, 25000, 25000, 0.75f, 0.75f, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
        }

        public Factory(BandwidthMeter bandwidthMeter, int i10, int i11, int i12, float f10) {
            this(bandwidthMeter, i10, i11, i12, f10, 0.75f, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection.Factory
        public final AdaptiveTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            return new AdaptiveTrackSelection(trackGroup, iArr, this.bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, this.minTimeBetweenBufferReevaluationMs, this.clock);
        }

        public Factory(BandwidthMeter bandwidthMeter, int i10, int i11, int i12, float f10, float f11, long j3, Clock clock) {
            this.bandwidthMeter = bandwidthMeter;
            this.minDurationForQualityIncreaseMs = i10;
            this.maxDurationForQualityDecreaseMs = i11;
            this.minDurationToRetainAfterDiscardMs = i12;
            this.bandwidthFraction = f10;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f11;
            this.minTimeBetweenBufferReevaluationMs = j3;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, bandwidthMeter, 10000L, 25000L, 25000L, 0.75f, 0.75f, DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
    }

    private int determineIdealSelectedIndex(long j3) {
        long bitrateEstimate = ((float) this.bandwidthMeter.getBitrateEstimate()) * this.bandwidthFraction;
        int i10 = 0;
        for (int i11 = 0; i11 < this.length; i11++) {
            if (j3 == Long.MIN_VALUE || !isBlacklisted(i11, j3)) {
                if (Math.round(getFormat(i11).bitrate * this.playbackSpeed) <= bitrateEstimate) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    private long minDurationForQualityIncreaseUs(long j3) {
        boolean z10;
        if (j3 != C.TIME_UNSET && j3 <= this.minDurationForQualityIncreaseUs) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return ((float) j3) * this.bufferedFractionToLiveEdgeForQualityIncrease;
        }
        return this.minDurationForQualityIncreaseUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int evaluateQueueSize(long j3, List<? extends MediaChunk> list) {
        int i10;
        int i11;
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j10 = this.lastBufferEvaluationMs;
        if (j10 != C.TIME_UNSET && elapsedRealtime - j10 < this.minTimeBetweenBufferReevaluationMs) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j3, this.playbackSpeed) < this.minDurationToRetainAfterDiscardUs) {
            return size;
        }
        Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime));
        for (int i12 = 0; i12 < size; i12++) {
            MediaChunk mediaChunk = list.get(i12);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j3, this.playbackSpeed) >= this.minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i10 = format2.height) != -1 && i10 < 720 && (i11 = format2.width) != -1 && i11 < 1280 && i10 < format.height) {
                return i12;
            }
        }
        return size;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public Object getSelectionData() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void onPlaybackSpeed(float f10) {
        this.playbackSpeed = f10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void updateSelectedTrack(long j3, long j10, long j11) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        int i10 = this.selectedIndex;
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime);
        this.selectedIndex = determineIdealSelectedIndex;
        if (determineIdealSelectedIndex == i10) {
            return;
        }
        if (!isBlacklisted(i10, elapsedRealtime)) {
            Format format = getFormat(i10);
            Format format2 = getFormat(this.selectedIndex);
            if (format2.bitrate > format.bitrate && j10 < minDurationForQualityIncreaseUs(j11)) {
                this.selectedIndex = i10;
            } else if (format2.bitrate < format.bitrate && j10 >= this.maxDurationForQualityDecreaseUs) {
                this.selectedIndex = i10;
            }
        }
        if (this.selectedIndex != i10) {
            this.reason = 3;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j3, long j10, long j11, float f10, float f11, long j12, Clock clock) {
        super(trackGroup, iArr);
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j3 * 1000;
        this.maxDurationForQualityDecreaseUs = j10 * 1000;
        this.minDurationToRetainAfterDiscardUs = j11 * 1000;
        this.bandwidthFraction = f10;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f11;
        this.minTimeBetweenBufferReevaluationMs = j12;
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 1;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.selectedIndex = determineIdealSelectedIndex(Long.MIN_VALUE);
    }
}

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

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
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

        public Factory(BandwidthMeter bandwidthMeter, int i9, int i10, int i11, float f9) {
            this(bandwidthMeter, i9, i10, i11, f9, 0.75f, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection.Factory
        public final AdaptiveTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            return new AdaptiveTrackSelection(trackGroup, iArr, this.bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, this.minTimeBetweenBufferReevaluationMs, this.clock);
        }

        public Factory(BandwidthMeter bandwidthMeter, int i9, int i10, int i11, float f9, float f10, long j7, Clock clock) {
            this.bandwidthMeter = bandwidthMeter;
            this.minDurationForQualityIncreaseMs = i9;
            this.maxDurationForQualityDecreaseMs = i10;
            this.minDurationToRetainAfterDiscardMs = i11;
            this.bandwidthFraction = f9;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f10;
            this.minTimeBetweenBufferReevaluationMs = j7;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, bandwidthMeter, 10000L, 25000L, 25000L, 0.75f, 0.75f, DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, Clock.DEFAULT);
    }

    private int determineIdealSelectedIndex(long j7) {
        long bitrateEstimate = ((float) this.bandwidthMeter.getBitrateEstimate()) * this.bandwidthFraction;
        int i9 = 0;
        for (int i10 = 0; i10 < this.length; i10++) {
            if (j7 == Long.MIN_VALUE || !isBlacklisted(i10, j7)) {
                if (Math.round(getFormat(i10).bitrate * this.playbackSpeed) <= bitrateEstimate) {
                    return i10;
                }
                i9 = i10;
            }
        }
        return i9;
    }

    private long minDurationForQualityIncreaseUs(long j7) {
        if (j7 != C.TIME_UNSET && j7 <= this.minDurationForQualityIncreaseUs) {
            return ((float) j7) * this.bufferedFractionToLiveEdgeForQualityIncrease;
        }
        return this.minDurationForQualityIncreaseUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.BaseTrackSelection, com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int evaluateQueueSize(long j7, List<? extends MediaChunk> list) {
        int i9;
        int i10;
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j9 = this.lastBufferEvaluationMs;
        if (j9 != C.TIME_UNSET && elapsedRealtime - j9 < this.minTimeBetweenBufferReevaluationMs) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j7, this.playbackSpeed) < this.minDurationToRetainAfterDiscardUs) {
            return size;
        }
        Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime));
        for (int i11 = 0; i11 < size; i11++) {
            MediaChunk mediaChunk = list.get(i11);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j7, this.playbackSpeed) >= this.minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i9 = format2.height) != -1 && i9 < 720 && (i10 = format2.width) != -1 && i10 < 1280 && i9 < format.height) {
                return i11;
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
    public void onPlaybackSpeed(float f9) {
        this.playbackSpeed = f9;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void updateSelectedTrack(long j7, long j9, long j10) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        int i9 = this.selectedIndex;
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime);
        this.selectedIndex = determineIdealSelectedIndex;
        if (determineIdealSelectedIndex == i9) {
            return;
        }
        if (!isBlacklisted(i9, elapsedRealtime)) {
            Format format = getFormat(i9);
            Format format2 = getFormat(this.selectedIndex);
            if (format2.bitrate > format.bitrate && j9 < minDurationForQualityIncreaseUs(j10)) {
                this.selectedIndex = i9;
            } else if (format2.bitrate < format.bitrate && j9 >= this.maxDurationForQualityDecreaseUs) {
                this.selectedIndex = i9;
            }
        }
        if (this.selectedIndex != i9) {
            this.reason = 3;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j7, long j9, long j10, float f9, float f10, long j11, Clock clock) {
        super(trackGroup, iArr);
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j7 * 1000;
        this.maxDurationForQualityDecreaseUs = j9 * 1000;
        this.minDurationToRetainAfterDiscardUs = j10 * 1000;
        this.bandwidthFraction = f9;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f10;
        this.minTimeBetweenBufferReevaluationMs = j11;
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 1;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.selectedIndex = determineIdealSelectedIndex(Long.MIN_VALUE);
    }
}

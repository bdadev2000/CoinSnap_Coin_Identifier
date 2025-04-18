package com.mbridge.msdk.playercommon.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface AnalyticsListener {

    /* loaded from: classes4.dex */
    public static final class EventTime {
        public final long currentPlaybackPositionMs;
        public final long eventPlaybackPositionMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j3, Timeline timeline, int i10, MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11, long j12) {
            this.realtimeMs = j3;
            this.timeline = timeline;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j10;
            this.currentPlaybackPositionMs = j11;
            this.totalBufferedDurationMs = j12;
        }
    }

    void onAudioSessionId(EventTime eventTime, int i10);

    void onAudioUnderrun(EventTime eventTime, int i10, long j3, long j10);

    void onBandwidthEstimate(EventTime eventTime, int i10, long j3, long j10);

    void onDecoderDisabled(EventTime eventTime, int i10, DecoderCounters decoderCounters);

    void onDecoderEnabled(EventTime eventTime, int i10, DecoderCounters decoderCounters);

    void onDecoderInitialized(EventTime eventTime, int i10, String str, long j3);

    void onDecoderInputFormatChanged(EventTime eventTime, int i10, Format format);

    void onDownstreamFormatChanged(EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onDrmKeysLoaded(EventTime eventTime);

    void onDrmKeysRemoved(EventTime eventTime);

    void onDrmKeysRestored(EventTime eventTime);

    void onDrmSessionManagerError(EventTime eventTime, Exception exc);

    void onDroppedVideoFrames(EventTime eventTime, int i10, long j3);

    void onLoadCanceled(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onLoadCompleted(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onLoadError(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z10);

    void onLoadStarted(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onLoadingChanged(EventTime eventTime, boolean z10);

    void onMediaPeriodCreated(EventTime eventTime);

    void onMediaPeriodReleased(EventTime eventTime);

    void onMetadata(EventTime eventTime, Metadata metadata);

    void onNetworkTypeChanged(EventTime eventTime, NetworkInfo networkInfo);

    void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters);

    void onPlayerError(EventTime eventTime, ExoPlaybackException exoPlaybackException);

    void onPlayerStateChanged(EventTime eventTime, boolean z10, int i10);

    void onPositionDiscontinuity(EventTime eventTime, int i10);

    void onReadingStarted(EventTime eventTime);

    void onRenderedFirstFrame(EventTime eventTime, Surface surface);

    void onRepeatModeChanged(EventTime eventTime, int i10);

    void onSeekProcessed(EventTime eventTime);

    void onSeekStarted(EventTime eventTime);

    void onShuffleModeChanged(EventTime eventTime, boolean z10);

    void onTimelineChanged(EventTime eventTime, int i10);

    void onTracksChanged(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    void onUpstreamDiscarded(EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onVideoSizeChanged(EventTime eventTime, int i10, int i11, int i12, float f10);

    void onViewportSizeChange(EventTime eventTime, int i10, int i11);
}

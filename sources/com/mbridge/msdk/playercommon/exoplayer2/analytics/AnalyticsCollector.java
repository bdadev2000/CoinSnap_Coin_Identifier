package com.mbridge.msdk.playercommon.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public class AnalyticsCollector implements Player.EventListener, AudioRendererEventListener, DefaultDrmSessionEventListener, MetadataOutput, MediaSourceEventListener, BandwidthMeter.EventListener, VideoRendererEventListener {
    private final Clock clock;
    private Player player;
    private final CopyOnWriteArraySet<AnalyticsListener> listeners = new CopyOnWriteArraySet<>();
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker = new MediaPeriodQueueTracker();
    private final Timeline.Window window = new Timeline.Window();

    /* loaded from: classes4.dex */
    public static class Factory {
        public AnalyticsCollector createAnalyticsCollector(Player player, Clock clock) {
            return new AnalyticsCollector(player, clock);
        }
    }

    /* loaded from: classes4.dex */
    public static final class MediaPeriodQueueTracker {
        private boolean isSeeking;
        private WindowAndMediaPeriodId lastReportedPlayingMediaPeriod;
        private WindowAndMediaPeriodId readingMediaPeriod;
        private final ArrayList<WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>();
        private final Timeline.Period period = new Timeline.Period();
        private Timeline timeline = Timeline.EMPTY;

        private void updateLastReportedPlayingMediaPeriod() {
            if (!this.activeMediaPeriods.isEmpty()) {
                this.lastReportedPlayingMediaPeriod = this.activeMediaPeriods.get(0);
            }
        }

        private WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(WindowAndMediaPeriodId windowAndMediaPeriodId, Timeline timeline) {
            if (!timeline.isEmpty() && !this.timeline.isEmpty()) {
                int indexOfPeriod = timeline.getIndexOfPeriod(this.timeline.getPeriod(windowAndMediaPeriodId.mediaPeriodId.periodIndex, this.period, true).uid);
                if (indexOfPeriod == -1) {
                    return windowAndMediaPeriodId;
                }
                return new WindowAndMediaPeriodId(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, windowAndMediaPeriodId.mediaPeriodId.copyWithPeriodIndex(indexOfPeriod));
            }
            return windowAndMediaPeriodId;
        }

        public final WindowAndMediaPeriodId getLastReportedPlayingMediaPeriod() {
            return this.lastReportedPlayingMediaPeriod;
        }

        public final WindowAndMediaPeriodId getLoadingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty()) {
                return null;
            }
            return this.activeMediaPeriods.get(r0.size() - 1);
        }

        public final WindowAndMediaPeriodId getPlayingMediaPeriod() {
            if (!this.activeMediaPeriods.isEmpty() && !this.timeline.isEmpty() && !this.isSeeking) {
                return this.activeMediaPeriods.get(0);
            }
            return null;
        }

        public final WindowAndMediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public final boolean isSeeking() {
            return this.isSeeking;
        }

        public final void onMediaPeriodCreated(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.activeMediaPeriods.add(new WindowAndMediaPeriodId(i10, mediaPeriodId));
            if (this.activeMediaPeriods.size() == 1 && !this.timeline.isEmpty()) {
                updateLastReportedPlayingMediaPeriod();
            }
        }

        public final void onMediaPeriodReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            WindowAndMediaPeriodId windowAndMediaPeriodId;
            WindowAndMediaPeriodId windowAndMediaPeriodId2 = new WindowAndMediaPeriodId(i10, mediaPeriodId);
            this.activeMediaPeriods.remove(windowAndMediaPeriodId2);
            if (windowAndMediaPeriodId2.equals(this.readingMediaPeriod)) {
                if (this.activeMediaPeriods.isEmpty()) {
                    windowAndMediaPeriodId = null;
                } else {
                    windowAndMediaPeriodId = this.activeMediaPeriods.get(0);
                }
                this.readingMediaPeriod = windowAndMediaPeriodId;
            }
        }

        public final void onPositionDiscontinuity(int i10) {
            updateLastReportedPlayingMediaPeriod();
        }

        public final void onReadingStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.readingMediaPeriod = new WindowAndMediaPeriodId(i10, mediaPeriodId);
        }

        public final void onSeekProcessed() {
            this.isSeeking = false;
            updateLastReportedPlayingMediaPeriod();
        }

        public final void onSeekStarted() {
            this.isSeeking = true;
        }

        public final void onTimelineChanged(Timeline timeline) {
            for (int i10 = 0; i10 < this.activeMediaPeriods.size(); i10++) {
                ArrayList<WindowAndMediaPeriodId> arrayList = this.activeMediaPeriods;
                arrayList.set(i10, updateMediaPeriodToNewTimeline(arrayList.get(i10), timeline));
            }
            WindowAndMediaPeriodId windowAndMediaPeriodId = this.readingMediaPeriod;
            if (windowAndMediaPeriodId != null) {
                this.readingMediaPeriod = updateMediaPeriodToNewTimeline(windowAndMediaPeriodId, timeline);
            }
            this.timeline = timeline;
            updateLastReportedPlayingMediaPeriod();
        }

        public final MediaSource.MediaPeriodId tryResolveWindowIndex(int i10) {
            Timeline timeline = this.timeline;
            if (timeline == null) {
                return null;
            }
            int periodCount = timeline.getPeriodCount();
            MediaSource.MediaPeriodId mediaPeriodId = null;
            for (int i11 = 0; i11 < this.activeMediaPeriods.size(); i11++) {
                WindowAndMediaPeriodId windowAndMediaPeriodId = this.activeMediaPeriods.get(i11);
                int i12 = windowAndMediaPeriodId.mediaPeriodId.periodIndex;
                if (i12 < periodCount && this.timeline.getPeriod(i12, this.period).windowIndex == i10) {
                    if (mediaPeriodId != null) {
                        return null;
                    }
                    mediaPeriodId = windowAndMediaPeriodId.mediaPeriodId;
                }
            }
            return mediaPeriodId;
        }
    }

    /* loaded from: classes4.dex */
    public static final class WindowAndMediaPeriodId {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public WindowAndMediaPeriodId(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || WindowAndMediaPeriodId.class != obj.getClass()) {
                return false;
            }
            WindowAndMediaPeriodId windowAndMediaPeriodId = (WindowAndMediaPeriodId) obj;
            if (this.windowIndex == windowAndMediaPeriodId.windowIndex && this.mediaPeriodId.equals(windowAndMediaPeriodId.mediaPeriodId)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.mediaPeriodId.hashCode() + (this.windowIndex * 31);
        }
    }

    public AnalyticsCollector(Player player, Clock clock) {
        this.player = player;
        this.clock = (Clock) Assertions.checkNotNull(clock);
    }

    private AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLastReportedPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    public void addListener(AnalyticsListener analyticsListener) {
        this.listeners.add(analyticsListener);
    }

    public AnalyticsListener.EventTime generateEventTime(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        long defaultPositionMs;
        long j3;
        Assertions.checkNotNull(this.player);
        long elapsedRealtime = this.clock.elapsedRealtime();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        long j10 = 0;
        if (i10 == this.player.getCurrentWindowIndex()) {
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                if (this.player.getCurrentAdGroupIndex() == mediaPeriodId.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId.adIndexInAdGroup) {
                    j10 = this.player.getCurrentPosition();
                }
                j3 = j10;
            } else {
                defaultPositionMs = this.player.getContentPosition();
                j3 = defaultPositionMs;
            }
        } else {
            if (i10 < currentTimeline.getWindowCount() && (mediaPeriodId == null || !mediaPeriodId.isAd())) {
                defaultPositionMs = currentTimeline.getWindow(i10, this.window).getDefaultPositionMs();
                j3 = defaultPositionMs;
            }
            j3 = j10;
        }
        return new AnalyticsListener.EventTime(elapsedRealtime, currentTimeline, i10, mediaPeriodId, j3, this.player.getCurrentPosition(), this.player.getBufferedPosition() - this.player.getContentPosition());
    }

    public Set<AnalyticsListener> getListeners() {
        return Collections.unmodifiableSet(this.listeners);
    }

    public final void notifyNetworkTypeChanged(NetworkInfo networkInfo) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkTypeChanged(generatePlayingMediaPeriodEventTime, networkInfo);
        }
    }

    public final void notifySeekStarted() {
        if (!this.mediaPeriodQueueTracker.isSeeking()) {
            AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
            this.mediaPeriodQueueTracker.onSeekStarted();
            Iterator<AnalyticsListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onSeekStarted(generatePlayingMediaPeriodEventTime);
            }
        }
    }

    public final void notifyViewportSizeChanged(int i10, int i11) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onViewportSizeChange(generatePlayingMediaPeriodEventTime, i10, i11);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderInitialized(String str, long j3, long j10) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(generateReadingMediaPeriodEventTime, 1, str, j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(generateLastReportedPlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(generatePlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioInputFormatChanged(Format format) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(generateReadingMediaPeriodEventTime, 1, format);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSessionId(int i10) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(generateReadingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSinkUnderrun(int i10, long j3, long j10) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioUnderrun(generateReadingMediaPeriodEventTime, i10, j3, j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i10, long j3, long j10) {
        AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onBandwidthEstimate(generateLoadingMediaPeriodEventTime, i10, j3, j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(generateEventTime, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysLoaded() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysLoaded(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRemoved() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRemoved(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRestored() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRestored(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmSessionManagerError(Exception exc) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(generateReadingMediaPeriodEventTime, exc);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i10, long j3) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(generateLastReportedPlayingMediaPeriodEventTime, i10, j3);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCanceled(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCompleted(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(generateEventTime, loadEventInfo, mediaLoadData, iOException, z10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadStarted(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onLoadingChanged(boolean z10) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadingChanged(generatePlayingMediaPeriodEventTime, z10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodCreated(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodCreated(i10, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(generateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodReleased(i10, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodReleased(generateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(generatePlayingMediaPeriodEventTime, metadata);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackParametersChanged(generatePlayingMediaPeriodEventTime, playbackParameters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerError(generatePlayingMediaPeriodEventTime, exoPlaybackException);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(boolean z10, int i10) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(generatePlayingMediaPeriodEventTime, z10, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(int i10) {
        this.mediaPeriodQueueTracker.onPositionDiscontinuity(i10);
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(generatePlayingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onReadingStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onReadingStarted(i10, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(generateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderedFirstFrame(generateReadingMediaPeriodEventTime, surface);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onRepeatModeChanged(int i10) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRepeatModeChanged(generatePlayingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onSeekProcessed() {
        if (this.mediaPeriodQueueTracker.isSeeking()) {
            this.mediaPeriodQueueTracker.onSeekProcessed();
            AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
            Iterator<AnalyticsListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onSeekProcessed(generatePlayingMediaPeriodEventTime);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onShuffleModeEnabledChanged(boolean z10) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onShuffleModeChanged(generatePlayingMediaPeriodEventTime, z10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onTimelineChanged(Timeline timeline, Object obj, int i10) {
        this.mediaPeriodQueueTracker.onTimelineChanged(timeline);
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(generatePlayingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(generatePlayingMediaPeriodEventTime, trackGroupArray, trackSelectionArray);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onUpstreamDiscarded(generateEventTime, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j3, long j10) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(generateReadingMediaPeriodEventTime, 2, str, j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(generateLastReportedPlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(generatePlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(Format format) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(generateReadingMediaPeriodEventTime, 2, format);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(generateReadingMediaPeriodEventTime, i10, i11, i12, f10);
        }
    }

    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void resetForNewMediaSource() {
        Iterator it = new ArrayList(this.mediaPeriodQueueTracker.activeMediaPeriods).iterator();
        while (it.hasNext()) {
            WindowAndMediaPeriodId windowAndMediaPeriodId = (WindowAndMediaPeriodId) it.next();
            onMediaPeriodReleased(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
        }
    }

    public void setPlayer(Player player) {
        boolean z10;
        if (this.player == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.player = (Player) Assertions.checkNotNull(player);
    }

    private AnalyticsListener.EventTime generateEventTime(WindowAndMediaPeriodId windowAndMediaPeriodId) {
        if (windowAndMediaPeriodId == null) {
            int currentWindowIndex = ((Player) Assertions.checkNotNull(this.player)).getCurrentWindowIndex();
            return generateEventTime(currentWindowIndex, this.mediaPeriodQueueTracker.tryResolveWindowIndex(currentWindowIndex));
        }
        return generateEventTime(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
    }
}

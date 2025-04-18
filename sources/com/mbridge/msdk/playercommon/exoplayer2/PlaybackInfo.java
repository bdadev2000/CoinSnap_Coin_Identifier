package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectorResult;

/* loaded from: classes4.dex */
final class PlaybackInfo {
    public volatile long bufferedPositionUs;
    public final long contentPositionUs;
    public final boolean isLoading;
    public final Object manifest;
    public final MediaSource.MediaPeriodId periodId;
    public final int playbackState;
    public volatile long positionUs;
    public final long startPositionUs;
    public final Timeline timeline;
    public final TrackGroupArray trackGroups;
    public final TrackSelectorResult trackSelectorResult;

    public PlaybackInfo(Timeline timeline, long j3, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this(timeline, null, new MediaSource.MediaPeriodId(0), j3, C.TIME_UNSET, 1, false, trackGroupArray, trackSelectorResult);
    }

    private static void copyMutablePositions(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2) {
        playbackInfo2.positionUs = playbackInfo.positionUs;
        playbackInfo2.bufferedPositionUs = playbackInfo.bufferedPositionUs;
    }

    public final PlaybackInfo copyWithIsLoading(boolean z10) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId, this.startPositionUs, this.contentPositionUs, this.playbackState, z10, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithPeriodIndex(int i10) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId.copyWithPeriodIndex(i10), this.startPositionUs, this.contentPositionUs, this.playbackState, this.isLoading, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithPlaybackState(int i10) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId, this.startPositionUs, this.contentPositionUs, i10, this.isLoading, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithTimeline(Timeline timeline, Object obj) {
        PlaybackInfo playbackInfo = new PlaybackInfo(timeline, obj, this.periodId, this.startPositionUs, this.contentPositionUs, this.playbackState, this.isLoading, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithTrackInfo(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId, this.startPositionUs, this.contentPositionUs, this.playbackState, this.isLoading, trackGroupArray, trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo fromNewPosition(MediaSource.MediaPeriodId mediaPeriodId, long j3, long j10) {
        long j11;
        Timeline timeline = this.timeline;
        Object obj = this.manifest;
        if (mediaPeriodId.isAd()) {
            j11 = j10;
        } else {
            j11 = -9223372036854775807L;
        }
        return new PlaybackInfo(timeline, obj, mediaPeriodId, j3, j11, this.playbackState, this.isLoading, this.trackGroups, this.trackSelectorResult);
    }

    public PlaybackInfo(Timeline timeline, Object obj, MediaSource.MediaPeriodId mediaPeriodId, long j3, long j10, int i10, boolean z10, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.timeline = timeline;
        this.manifest = obj;
        this.periodId = mediaPeriodId;
        this.startPositionUs = j3;
        this.contentPositionUs = j10;
        this.positionUs = j3;
        this.bufferedPositionUs = j3;
        this.playbackState = i10;
        this.isLoading = z10;
        this.trackGroups = trackGroupArray;
        this.trackSelectorResult = trackSelectorResult;
    }
}

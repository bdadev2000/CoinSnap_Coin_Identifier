package com.mbridge.msdk.playercommon.exoplayer2;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.EmptySampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectorResult;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
final class MediaPeriodHolder {
    private static final String TAG = "MediaPeriodHolder";
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    public final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSource mediaSource;
    public MediaPeriodHolder next;
    private TrackSelectorResult periodTrackSelectorResult;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    public long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    public TrackGroupArray trackGroups;
    private final TrackSelector trackSelector;
    public TrackSelectorResult trackSelectorResult;
    public final Object uid;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j3, TrackSelector trackSelector, Allocator allocator, MediaSource mediaSource, Object obj, MediaPeriodInfo mediaPeriodInfo) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j3 - mediaPeriodInfo.startPositionUs;
        this.trackSelector = trackSelector;
        this.mediaSource = mediaSource;
        this.uid = Assertions.checkNotNull(obj);
        this.info = mediaPeriodInfo;
        this.sampleStreams = new SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        MediaPeriod createPeriod = mediaSource.createPeriod(mediaPeriodInfo.f14725id, allocator);
        long j10 = mediaPeriodInfo.endPositionUs;
        this.mediaPeriod = j10 != Long.MIN_VALUE ? new ClippingMediaPeriod(createPeriod, true, 0L, j10) : createPeriod;
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i10 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i10 < rendererCapabilitiesArr.length) {
                if (rendererCapabilitiesArr[i10].getTrackType() == 5 && this.trackSelectorResult.isRendererEnabled(i10)) {
                    sampleStreamArr[i10] = new EmptySampleStream();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void disableTrackSelectionsInResult(TrackSelectorResult trackSelectorResult) {
        for (int i10 = 0; i10 < trackSelectorResult.length; i10++) {
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i10);
            TrackSelection trackSelection = trackSelectorResult.selections.get(i10);
            if (isRendererEnabled && trackSelection != null) {
                trackSelection.disable();
            }
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i10 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i10 < rendererCapabilitiesArr.length) {
                if (rendererCapabilitiesArr[i10].getTrackType() == 5) {
                    sampleStreamArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void enableTrackSelectionsInResult(TrackSelectorResult trackSelectorResult) {
        for (int i10 = 0; i10 < trackSelectorResult.length; i10++) {
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i10);
            TrackSelection trackSelection = trackSelectorResult.selections.get(i10);
            if (isRendererEnabled && trackSelection != null) {
                trackSelection.enable();
            }
        }
    }

    private void updatePeriodTrackSelectorResult(TrackSelectorResult trackSelectorResult) {
        TrackSelectorResult trackSelectorResult2 = this.periodTrackSelectorResult;
        if (trackSelectorResult2 != null) {
            disableTrackSelectionsInResult(trackSelectorResult2);
        }
        this.periodTrackSelectorResult = trackSelectorResult;
        if (trackSelectorResult != null) {
            enableTrackSelectionsInResult(trackSelectorResult);
        }
    }

    public final long applyTrackSelection(long j3, boolean z10) {
        return applyTrackSelection(j3, z10, new boolean[this.rendererCapabilities.length]);
    }

    public final void continueLoading(long j3) {
        this.mediaPeriod.continueLoading(toPeriodTime(j3));
    }

    public final long getBufferedPositionUs(boolean z10) {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE && z10) {
            return this.info.durationUs;
        }
        return bufferedPositionUs;
    }

    public final long getDurationUs() {
        return this.info.durationUs;
    }

    public final long getNextLoadPositionUs() {
        if (this.prepared) {
            return this.mediaPeriod.getNextLoadPositionUs();
        }
        return 0L;
    }

    public final long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public final void handlePrepared(float f10) throws ExoPlaybackException {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        selectTracks(f10);
        long applyTrackSelection = applyTrackSelection(this.info.startPositionUs, false);
        long j3 = this.rendererPositionOffsetUs;
        MediaPeriodInfo mediaPeriodInfo = this.info;
        this.rendererPositionOffsetUs = (mediaPeriodInfo.startPositionUs - applyTrackSelection) + j3;
        this.info = mediaPeriodInfo.copyWithStartPositionUs(applyTrackSelection);
    }

    public final boolean isFullyBuffered() {
        if (this.prepared && (!this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public final void reevaluateBuffer(long j3) {
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j3));
        }
    }

    public final void release() {
        updatePeriodTrackSelectorResult(null);
        try {
            if (this.info.endPositionUs != Long.MIN_VALUE) {
                this.mediaSource.releasePeriod(((ClippingMediaPeriod) this.mediaPeriod).mediaPeriod);
            } else {
                this.mediaSource.releasePeriod(this.mediaPeriod);
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "Period release failed.", e2);
        }
    }

    public final boolean selectTracks(float f10) throws ExoPlaybackException {
        TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, this.trackGroups);
        if (selectTracks.isEquivalent(this.periodTrackSelectorResult)) {
            return false;
        }
        this.trackSelectorResult = selectTracks;
        for (TrackSelection trackSelection : selectTracks.selections.getAll()) {
            if (trackSelection != null) {
                trackSelection.onPlaybackSpeed(f10);
            }
        }
        return true;
    }

    public final long toPeriodTime(long j3) {
        return j3 - getRendererOffset();
    }

    public final long toRendererTime(long j3) {
        return j3 + getRendererOffset();
    }

    public final long applyTrackSelection(long j3, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            boolean z11 = true;
            if (i10 >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z10 || !trackSelectorResult.isEquivalent(this.periodTrackSelectorResult, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        updatePeriodTrackSelectorResult(this.trackSelectorResult);
        TrackSelectionArray trackSelectionArray = this.trackSelectorResult.selections;
        long selectTracks = this.mediaPeriod.selectTracks(trackSelectionArray.getAll(), this.mayRetainStreamFlags, this.sampleStreams, zArr, j3);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i11 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i11 >= sampleStreamArr.length) {
                return selectTracks;
            }
            if (sampleStreamArr[i11] != null) {
                Assertions.checkState(this.trackSelectorResult.isRendererEnabled(i11));
                if (this.rendererCapabilities[i11].getTrackType() != 5) {
                    this.hasEnabledTracks = true;
                }
            } else {
                Assertions.checkState(trackSelectionArray.get(i11) == null);
            }
            i11++;
        }
    }
}

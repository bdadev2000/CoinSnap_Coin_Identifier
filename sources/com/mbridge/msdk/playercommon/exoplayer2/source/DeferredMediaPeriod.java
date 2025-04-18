package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class DeferredMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private final Allocator allocator;
    private MediaPeriod.Callback callback;

    /* renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f14734id;
    private PrepareErrorListener listener;
    private MediaPeriod mediaPeriod;
    public final MediaSource mediaSource;
    private boolean notifiedPrepareError;
    private long preparePositionOverrideUs = C.TIME_UNSET;
    private long preparePositionUs;

    /* loaded from: classes4.dex */
    public interface PrepareErrorListener {
        void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException);
    }

    public DeferredMediaPeriod(MediaSource mediaSource, MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        this.f14734id = mediaPeriodId;
        this.allocator = allocator;
        this.mediaSource = mediaSource;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j3) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.continueLoading(j3);
    }

    public final void createPeriod() {
        MediaPeriod createPeriod = this.mediaSource.createPeriod(this.f14734id, this.allocator);
        this.mediaPeriod = createPeriod;
        if (this.callback != null) {
            createPeriod.prepare(this, this.preparePositionUs);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j3, boolean z10) {
        this.mediaPeriod.discardBuffer(j3, z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j3, SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j3, seekParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.mediaPeriod.getBufferedPositionUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return this.mediaPeriod.getNextLoadPositionUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.mediaPeriod;
            if (mediaPeriod != null) {
                mediaPeriod.maybeThrowPrepareError();
            } else {
                this.mediaSource.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e2) {
            PrepareErrorListener prepareErrorListener = this.listener;
            if (prepareErrorListener != null) {
                if (!this.notifiedPrepareError) {
                    this.notifiedPrepareError = true;
                    prepareErrorListener.onPrepareError(this.f14734id, e2);
                    return;
                }
                return;
            }
            throw e2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        this.callback.onPrepared(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j3) {
        this.callback = callback;
        this.preparePositionUs = j3;
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            mediaPeriod.prepare(this, j3);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        return this.mediaPeriod.readDiscontinuity();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j3) {
        this.mediaPeriod.reevaluateBuffer(j3);
    }

    public final void releasePeriod() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            this.mediaSource.releasePeriod(mediaPeriod);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j3) {
        return this.mediaPeriod.seekToUs(j3);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.preparePositionOverrideUs;
        if (j11 != C.TIME_UNSET && j3 == 0) {
            this.preparePositionOverrideUs = C.TIME_UNSET;
            j10 = j11;
        } else {
            j10 = j3;
        }
        return this.mediaPeriod.selectTracks(trackSelectionArr, zArr, sampleStreamArr, zArr2, j10);
    }

    public final void setDefaultPreparePositionUs(long j3) {
        if (this.preparePositionUs == 0 && j3 != 0) {
            this.preparePositionOverrideUs = j3;
            this.preparePositionUs = j3;
        }
    }

    public final void setPrepareErrorListener(PrepareErrorListener prepareErrorListener) {
        this.listener = prepareErrorListener;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader.Callback
    public final void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.callback.onContinueLoadingRequested(this);
    }
}

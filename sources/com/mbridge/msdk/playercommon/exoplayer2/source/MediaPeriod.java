package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* loaded from: classes3.dex */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    boolean continueLoading(long j7);

    void discardBuffer(long j7, boolean z8);

    long getAdjustedSeekPositionUs(long j7, SeekParameters seekParameters);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    void maybeThrowPrepareError() throws IOException;

    void prepare(Callback callback, long j7);

    long readDiscontinuity();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    void reevaluateBuffer(long j7);

    long seekToUs(long j7);

    long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j7);
}

package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DummyTrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleQueue;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkExtractorWrapper;

/* loaded from: classes3.dex */
public final class BaseMediaChunkOutput implements ChunkExtractorWrapper.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public final int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i9 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i9 < sampleQueueArr.length) {
                SampleQueue sampleQueue = sampleQueueArr[i9];
                if (sampleQueue != null) {
                    iArr[i9] = sampleQueue.getWriteIndex();
                }
                i9++;
            } else {
                return iArr;
            }
        }
    }

    public final void setSampleOffsetUs(long j7) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue != null) {
                sampleQueue.setSampleOffsetUs(j7);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkExtractorWrapper.TrackOutputProvider
    public final TrackOutput track(int i9, int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return this.sampleQueues[i11];
                }
                i11++;
            } else {
                Log.e(TAG, "Unmatched track of type: " + i10);
                return new DummyTrackOutput();
            }
        }
    }
}

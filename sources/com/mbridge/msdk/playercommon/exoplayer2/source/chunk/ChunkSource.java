package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public interface ChunkSource {
    long getAdjustedSeekPositionUs(long j7, SeekParameters seekParameters);

    void getNextChunk(MediaChunk mediaChunk, long j7, long j9, ChunkHolder chunkHolder);

    int getPreferredQueueSize(long j7, List<? extends MediaChunk> list);

    void maybeThrowError() throws IOException;

    void onChunkLoadCompleted(Chunk chunk);

    boolean onChunkLoadError(Chunk chunk, boolean z8, Exception exc);
}

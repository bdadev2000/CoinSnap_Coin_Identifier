package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes3.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i9, Object obj, long j7, long j9, long j10) {
        super(dataSource, dataSpec, 1, format, i9, obj, j7, j9);
        Assertions.checkNotNull(format);
        this.chunkIndex = j10;
    }

    public long getNextChunkIndex() {
        long j7 = this.chunkIndex;
        if (j7 == -1) {
            return -1L;
        }
        return 1 + j7;
    }

    public abstract boolean isLoadCompleted();
}

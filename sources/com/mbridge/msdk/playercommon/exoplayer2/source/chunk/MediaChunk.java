package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, Object obj, long j3, long j10, long j11) {
        super(dataSource, dataSpec, 1, format, i10, obj, j3, j10);
        Assertions.checkNotNull(format);
        this.chunkIndex = j11;
    }

    public long getNextChunkIndex() {
        long j3 = this.chunkIndex;
        if (j3 != -1) {
            return 1 + j3;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}

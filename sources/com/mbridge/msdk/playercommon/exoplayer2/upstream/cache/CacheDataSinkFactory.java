package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;

/* loaded from: classes4.dex */
public final class CacheDataSinkFactory implements DataSink.Factory {
    private final int bufferSize;
    private final Cache cache;
    private final long maxCacheFileSize;

    public CacheDataSinkFactory(Cache cache, long j3) {
        this(cache, j3, CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink.Factory
    public final DataSink createDataSink() {
        return new CacheDataSink(this.cache, this.maxCacheFileSize, this.bufferSize);
    }

    public CacheDataSinkFactory(Cache cache, long j3, int i10) {
        this.cache = cache;
        this.maxCacheFileSize = j3;
        this.bufferSize = i10;
    }
}

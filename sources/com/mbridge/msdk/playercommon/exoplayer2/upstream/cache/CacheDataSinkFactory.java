package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;

/* loaded from: classes3.dex */
public final class CacheDataSinkFactory implements DataSink.Factory {
    private final int bufferSize;
    private final Cache cache;
    private final long maxCacheFileSize;

    public CacheDataSinkFactory(Cache cache, long j7) {
        this(cache, j7, CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink.Factory
    public final DataSink createDataSink() {
        return new CacheDataSink(this.cache, this.maxCacheFileSize, this.bufferSize);
    }

    public CacheDataSinkFactory(Cache cache, long j7, int i9) {
        this.cache = cache;
        this.maxCacheFileSize = j7;
        this.bufferSize = i9;
    }
}

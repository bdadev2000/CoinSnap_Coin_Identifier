package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor, Comparator<CacheSpan> {
    private long currentSize;
    private final TreeSet<CacheSpan> leastRecentlyUsed = new TreeSet<>(this);
    private final long maxBytes;

    public LeastRecentlyUsedCacheEvictor(long j3) {
        this.maxBytes = j3;
    }

    private void evictCache(Cache cache, long j3) {
        while (this.currentSize + j3 > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            try {
                cache.removeSpan(this.leastRecentlyUsed.first());
            } catch (Cache.CacheException unused) {
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheEvictor
    public final void onCacheInitialized() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheEvictor
    public final void onStartFile(Cache cache, String str, long j3, long j10) {
        evictCache(cache, j10);
    }

    @Override // java.util.Comparator
    public final int compare(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j3 = cacheSpan.lastAccessTimestamp;
        long j10 = cacheSpan2.lastAccessTimestamp;
        if (j3 - j10 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j3 < j10 ? -1 : 1;
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ChunkIndex;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String TAG = "CachedRegionTracker";
    private final Cache cache;
    private final String cacheKey;
    private final ChunkIndex chunkIndex;
    private final TreeSet<Region> regions = new TreeSet<>();
    private final Region lookupRegion = new Region(0, 0);

    /* loaded from: classes4.dex */
    public static class Region implements Comparable<Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j3, long j10) {
            this.startOffset = j3;
            this.endOffset = j10;
        }

        @Override // java.lang.Comparable
        public int compareTo(Region region) {
            long j3 = this.startOffset;
            long j10 = region.startOffset;
            if (j3 < j10) {
                return -1;
            }
            return j3 == j10 ? 0 : 1;
        }
    }

    public CachedRegionTracker(Cache cache, String str, ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            Iterator<CacheSpan> descendingIterator = cache.addListener(str, this).descendingIterator();
            while (descendingIterator.hasNext()) {
                mergeSpan(descendingIterator.next());
            }
        }
    }

    private void mergeSpan(CacheSpan cacheSpan) {
        long j3 = cacheSpan.position;
        Region region = new Region(j3, cacheSpan.length + j3);
        Region floor = this.regions.floor(region);
        Region ceiling = this.regions.ceiling(region);
        boolean regionsConnect = regionsConnect(floor, region);
        if (regionsConnect(region, ceiling)) {
            if (regionsConnect) {
                floor.endOffset = ceiling.endOffset;
                floor.endOffsetIndex = ceiling.endOffsetIndex;
            } else {
                region.endOffset = ceiling.endOffset;
                region.endOffsetIndex = ceiling.endOffsetIndex;
                this.regions.add(region);
            }
            this.regions.remove(ceiling);
            return;
        }
        if (regionsConnect) {
            floor.endOffset = region.endOffset;
            int i10 = floor.endOffsetIndex;
            while (true) {
                ChunkIndex chunkIndex = this.chunkIndex;
                if (i10 >= chunkIndex.length - 1) {
                    break;
                }
                int i11 = i10 + 1;
                if (chunkIndex.offsets[i11] > floor.endOffset) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            floor.endOffsetIndex = i10;
            return;
        }
        int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, region.endOffset);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        region.endOffsetIndex = binarySearch;
        this.regions.add(region);
    }

    private boolean regionsConnect(Region region, Region region2) {
        return (region == null || region2 == null || region.endOffset != region2.startOffset) ? false : true;
    }

    public final synchronized int getRegionEndTimeMs(long j3) {
        int i10;
        Region region = this.lookupRegion;
        region.startOffset = j3;
        Region floor = this.regions.floor(region);
        if (floor != null) {
            long j10 = floor.endOffset;
            if (j3 <= j10 && (i10 = floor.endOffsetIndex) != -1) {
                ChunkIndex chunkIndex = this.chunkIndex;
                if (i10 == chunkIndex.length - 1) {
                    if (j10 == chunkIndex.offsets[i10] + chunkIndex.sizes[i10]) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i10] + ((chunkIndex.durationsUs[i10] * (j10 - chunkIndex.offsets[i10])) / chunkIndex.sizes[i10])) / 1000);
            }
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j3 = cacheSpan.position;
        Region region = new Region(j3, cacheSpan.length + j3);
        Region floor = this.regions.floor(region);
        if (floor == null) {
            Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(floor);
        long j10 = floor.startOffset;
        long j11 = region.startOffset;
        if (j10 < j11) {
            Region region2 = new Region(j10, j11);
            int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, region2.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region2.endOffsetIndex = binarySearch;
            this.regions.add(region2);
        }
        long j12 = floor.endOffset;
        long j13 = region.endOffset;
        if (j12 > j13) {
            Region region3 = new Region(j13 + 1, j12);
            region3.endOffsetIndex = floor.endOffsetIndex;
            this.regions.add(region3);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }

    public final void release() {
        this.cache.removeListener(this.cacheKey, this);
    }
}

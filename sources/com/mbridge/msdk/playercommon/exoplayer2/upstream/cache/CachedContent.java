package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CachedContent {
    private static final int VERSION_MAX = Integer.MAX_VALUE;
    private static final int VERSION_METADATA_INTRODUCED = 2;
    public final int id;
    public final String key;
    private boolean locked;
    private DefaultContentMetadata metadata = DefaultContentMetadata.EMPTY;
    private final TreeSet<SimpleCacheSpan> cachedSpans = new TreeSet<>();

    public CachedContent(int i9, String str) {
        this.id = i9;
        this.key = str;
    }

    public static CachedContent readFromStream(int i9, DataInputStream dataInputStream) throws IOException {
        CachedContent cachedContent = new CachedContent(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i9 < 2) {
            long readLong = dataInputStream.readLong();
            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
            ContentMetadataInternal.setContentLength(contentMetadataMutations, readLong);
            cachedContent.applyMetadataMutations(contentMetadataMutations);
        } else {
            cachedContent.metadata = DefaultContentMetadata.readFromStream(dataInputStream);
        }
        return cachedContent;
    }

    public final void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public final boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        this.metadata = this.metadata.copyWithMutationsApplied(contentMetadataMutations);
        return !r2.equals(r0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CachedContent.class != obj.getClass()) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) obj;
        if (this.id == cachedContent.id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
            return true;
        }
        return false;
    }

    public final long getCachedBytesLength(long j7, long j9) {
        long j10;
        SimpleCacheSpan span = getSpan(j7);
        if (span.isHoleSpan()) {
            if (span.isOpenEnded()) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = span.length;
            }
            return -Math.min(j10, j9);
        }
        long j11 = j7 + j9;
        long j12 = span.position + span.length;
        if (j12 < j11) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j13 = simpleCacheSpan.position;
                if (j13 > j12) {
                    break;
                }
                j12 = Math.max(j12, j13 + simpleCacheSpan.length);
                if (j12 >= j11) {
                    break;
                }
            }
        }
        return Math.min(j12 - j7, j9);
    }

    public final ContentMetadata getMetadata() {
        return this.metadata;
    }

    public final SimpleCacheSpan getSpan(long j7) {
        SimpleCacheSpan createLookup = SimpleCacheSpan.createLookup(this.key, j7);
        SimpleCacheSpan floor = this.cachedSpans.floor(createLookup);
        if (floor != null && floor.position + floor.length > j7) {
            return floor;
        }
        SimpleCacheSpan ceiling = this.cachedSpans.ceiling(createLookup);
        if (ceiling == null) {
            return SimpleCacheSpan.createOpenHole(this.key, j7);
        }
        return SimpleCacheSpan.createClosedHole(this.key, j7, ceiling.position - j7);
    }

    public final TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public final int hashCode() {
        return this.cachedSpans.hashCode() + (headerHashCode(Integer.MAX_VALUE) * 31);
    }

    public final int headerHashCode(int i9) {
        int hashCode = this.key.hashCode() + (this.id * 31);
        if (i9 < 2) {
            long contentLength = ContentMetadataInternal.getContentLength(this.metadata);
            return (hashCode * 31) + ((int) (contentLength ^ (contentLength >>> 32)));
        }
        return (hashCode * 31) + this.metadata.hashCode();
    }

    public final boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public final boolean isLocked() {
        return this.locked;
    }

    public final boolean removeSpan(CacheSpan cacheSpan) {
        if (this.cachedSpans.remove(cacheSpan)) {
            cacheSpan.file.delete();
            return true;
        }
        return false;
    }

    public final void setLocked(boolean z8) {
        this.locked = z8;
    }

    public final SimpleCacheSpan touch(SimpleCacheSpan simpleCacheSpan) throws Cache.CacheException {
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        SimpleCacheSpan copyWithUpdatedLastAccessTime = simpleCacheSpan.copyWithUpdatedLastAccessTime(this.id);
        if (simpleCacheSpan.file.renameTo(copyWithUpdatedLastAccessTime.file)) {
            this.cachedSpans.add(copyWithUpdatedLastAccessTime);
            return copyWithUpdatedLastAccessTime;
        }
        throw new Cache.CacheException("Renaming of " + simpleCacheSpan.file + " to " + copyWithUpdatedLastAccessTime.file + " failed.");
    }

    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.id);
        dataOutputStream.writeUTF(this.key);
        this.metadata.writeToStream(dataOutputStream);
    }
}

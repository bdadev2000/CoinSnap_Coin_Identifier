package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CachedContent {
    private static final int VERSION_MAX = Integer.MAX_VALUE;
    private static final int VERSION_METADATA_INTRODUCED = 2;

    /* renamed from: id, reason: collision with root package name */
    public final int f14741id;
    public final String key;
    private boolean locked;
    private DefaultContentMetadata metadata = DefaultContentMetadata.EMPTY;
    private final TreeSet<SimpleCacheSpan> cachedSpans = new TreeSet<>();

    public CachedContent(int i10, String str) {
        this.f14741id = i10;
        this.key = str;
    }

    public static CachedContent readFromStream(int i10, DataInputStream dataInputStream) throws IOException {
        CachedContent cachedContent = new CachedContent(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 < 2) {
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
        if (this.f14741id == cachedContent.f14741id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
            return true;
        }
        return false;
    }

    public final long getCachedBytesLength(long j3, long j10) {
        long j11;
        SimpleCacheSpan span = getSpan(j3);
        if (span.isHoleSpan()) {
            if (span.isOpenEnded()) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = span.length;
            }
            return -Math.min(j11, j10);
        }
        long j12 = j3 + j10;
        long j13 = span.position + span.length;
        if (j13 < j12) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j14 = simpleCacheSpan.position;
                if (j14 > j13) {
                    break;
                }
                j13 = Math.max(j13, j14 + simpleCacheSpan.length);
                if (j13 >= j12) {
                    break;
                }
            }
        }
        return Math.min(j13 - j3, j10);
    }

    public final ContentMetadata getMetadata() {
        return this.metadata;
    }

    public final SimpleCacheSpan getSpan(long j3) {
        SimpleCacheSpan createLookup = SimpleCacheSpan.createLookup(this.key, j3);
        SimpleCacheSpan floor = this.cachedSpans.floor(createLookup);
        if (floor != null && floor.position + floor.length > j3) {
            return floor;
        }
        SimpleCacheSpan ceiling = this.cachedSpans.ceiling(createLookup);
        if (ceiling == null) {
            return SimpleCacheSpan.createOpenHole(this.key, j3);
        }
        return SimpleCacheSpan.createClosedHole(this.key, j3, ceiling.position - j3);
    }

    public final TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public final int hashCode() {
        return this.cachedSpans.hashCode() + (headerHashCode(Integer.MAX_VALUE) * 31);
    }

    public final int headerHashCode(int i10) {
        int hashCode = this.key.hashCode() + (this.f14741id * 31);
        if (i10 < 2) {
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

    public final void setLocked(boolean z10) {
        this.locked = z10;
    }

    public final SimpleCacheSpan touch(SimpleCacheSpan simpleCacheSpan) throws Cache.CacheException {
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        SimpleCacheSpan copyWithUpdatedLastAccessTime = simpleCacheSpan.copyWithUpdatedLastAccessTime(this.f14741id);
        if (simpleCacheSpan.file.renameTo(copyWithUpdatedLastAccessTime.file)) {
            this.cachedSpans.add(copyWithUpdatedLastAccessTime);
            return copyWithUpdatedLastAccessTime;
        }
        throw new Cache.CacheException("Renaming of " + simpleCacheSpan.file + " to " + copyWithUpdatedLastAccessTime.file + " failed.");
    }

    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f14741id);
        dataOutputStream.writeUTF(this.key);
        this.metadata.writeToStream(dataOutputStream);
    }
}

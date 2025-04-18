package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.FileDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.TeeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes4.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final long DEFAULT_MAX_CACHE_FILE_SIZE = 2097152;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final DataSource cacheReadDataSource;
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private DataSource currentDataSource;
    private boolean currentDataSpecLengthUnset;
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final EventListener eventListener;
    private int flags;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private String key;
    private long readPosition;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;
    private Uri uri;

    /* loaded from: classes4.dex */
    public @interface CacheIgnoredReason {
    }

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onCacheIgnored(int i10);

        void onCachedBytesRead(long j3, long j10);
    }

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    public CacheDataSource(Cache cache, DataSource dataSource) {
        this(cache, dataSource, 0, DEFAULT_MAX_CACHE_FILE_SIZE);
    }

    private void closeCurrentSource() throws IOException {
        DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.currentDataSource = null;
            this.currentDataSpecLengthUnset = false;
            CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        }
    }

    private static Uri getRedirectedUriOrDefault(Cache cache, String str, Uri uri) {
        Uri redirectedUri = ContentMetadataInternal.getRedirectedUri(cache.getContentMetadata(str));
        if (redirectedUri != null) {
            return redirectedUri;
        }
        return uri;
    }

    private void handleBeforeThrow(IOException iOException) {
        if (isReadingFromCache() || (iOException instanceof Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isCausedByPositionOutOfRange(java.io.IOException r1) {
        /*
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceException
            if (r0 == 0) goto Lf
            r0 = r1
            com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceException r0 = (com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceException) r0
            int r0 = r0.reason
            if (r0 != 0) goto Lf
            r1 = 1
            return r1
        Lf:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        L14:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource.isCausedByPositionOutOfRange(java.io.IOException):boolean");
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    private void notifyBytesRead() {
        EventListener eventListener = this.eventListener;
        if (eventListener != null && this.totalCachedBytesRead > 0) {
            eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
            this.totalCachedBytesRead = 0L;
        }
    }

    private void notifyCacheIgnored(int i10) {
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i10);
        }
    }

    private void openNextSource(boolean z10) throws IOException {
        CacheSpan startReadWrite;
        long j3;
        DataSpec dataSpec;
        DataSource dataSource;
        long j10;
        boolean z11;
        if (this.currentRequestIgnoresCache) {
            startReadWrite = null;
        } else if (this.blockOnCache) {
            try {
                startReadWrite = this.cache.startReadWrite(this.key, this.readPosition);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            startReadWrite = this.cache.startReadWriteNonBlocking(this.key, this.readPosition);
        }
        if (startReadWrite == null) {
            dataSource = this.upstreamDataSource;
            dataSpec = new DataSpec(this.uri, this.readPosition, this.bytesRemaining, this.key, this.flags);
        } else if (startReadWrite.isCached) {
            Uri fromFile = Uri.fromFile(startReadWrite.file);
            long j11 = this.readPosition - startReadWrite.position;
            long j12 = startReadWrite.length - j11;
            long j13 = this.bytesRemaining;
            if (j13 != -1) {
                j12 = Math.min(j12, j13);
            }
            dataSpec = new DataSpec(fromFile, this.readPosition, j11, j12, this.key, this.flags);
            dataSource = this.cacheReadDataSource;
        } else {
            if (startReadWrite.isOpenEnded()) {
                j3 = this.bytesRemaining;
            } else {
                j3 = startReadWrite.length;
                long j14 = this.bytesRemaining;
                if (j14 != -1) {
                    j3 = Math.min(j3, j14);
                }
            }
            DataSpec dataSpec2 = new DataSpec(this.uri, this.readPosition, j3, this.key, this.flags);
            DataSource dataSource2 = this.cacheWriteDataSource;
            if (dataSource2 == null) {
                dataSource2 = this.upstreamDataSource;
                this.cache.releaseHoleSpan(startReadWrite);
                startReadWrite = null;
            }
            dataSpec = dataSpec2;
            dataSource = dataSource2;
        }
        if (!this.currentRequestIgnoresCache && dataSource == this.upstreamDataSource) {
            j10 = this.readPosition + MIN_READ_BEFORE_CHECKING_CACHE;
        } else {
            j10 = Long.MAX_VALUE;
        }
        this.checkCachePosition = j10;
        if (z10) {
            Assertions.checkState(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            }
            try {
                closeCurrentSource();
            } catch (Throwable th2) {
                if (startReadWrite.isHoleSpan()) {
                    this.cache.releaseHoleSpan(startReadWrite);
                }
                throw th2;
            }
        }
        if (startReadWrite != null && startReadWrite.isHoleSpan()) {
            this.currentHoleSpan = startReadWrite;
        }
        this.currentDataSource = dataSource;
        if (dataSpec.length == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.currentDataSpecLengthUnset = z11;
        long open = dataSource.open(dataSpec);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (this.currentDataSpecLengthUnset && open != -1) {
            this.bytesRemaining = open;
            ContentMetadataInternal.setContentLength(contentMetadataMutations, this.readPosition + open);
        }
        if (isReadingFromUpstream()) {
            Uri uri = this.currentDataSource.getUri();
            this.actualUri = uri;
            if (true ^ this.uri.equals(uri)) {
                ContentMetadataInternal.setRedirectedUri(contentMetadataMutations, this.actualUri);
            } else {
                ContentMetadataInternal.removeRedirectedUri(contentMetadataMutations);
            }
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(this.key, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength() throws IOException {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            this.cache.setContentLength(this.key, this.readPosition);
        }
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        if (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) {
            return 1;
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        this.uri = null;
        this.actualUri = null;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (IOException e2) {
            handleBeforeThrow(e2);
            throw e2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.actualUri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        boolean z10;
        try {
            String key = CacheUtil.getKey(dataSpec);
            this.key = key;
            Uri uri = dataSpec.uri;
            this.uri = uri;
            this.actualUri = getRedirectedUriOrDefault(this.cache, key, uri);
            this.flags = dataSpec.flags;
            this.readPosition = dataSpec.position;
            int shouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            if (shouldIgnoreCacheForRequest != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.currentRequestIgnoresCache = z10;
            if (z10) {
                notifyCacheIgnored(shouldIgnoreCacheForRequest);
            }
            long j3 = dataSpec.length;
            if (j3 == -1 && !this.currentRequestIgnoresCache) {
                long contentLength = this.cache.getContentLength(this.key);
                this.bytesRemaining = contentLength;
                if (contentLength != -1) {
                    long j10 = contentLength - dataSpec.position;
                    this.bytesRemaining = j10;
                    if (j10 <= 0) {
                        throw new DataSourceException(0);
                    }
                }
                openNextSource(false);
                return this.bytesRemaining;
            }
            this.bytesRemaining = j3;
            openNextSource(false);
            return this.bytesRemaining;
        } catch (IOException e2) {
            handleBeforeThrow(e2);
            throw e2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(true);
            }
            int read = this.currentDataSource.read(bArr, i10, i11);
            if (read != -1) {
                if (isReadingFromCache()) {
                    this.totalCachedBytesRead += read;
                }
                long j3 = read;
                this.readPosition += j3;
                long j10 = this.bytesRemaining;
                if (j10 != -1) {
                    this.bytesRemaining = j10 - j3;
                }
            } else if (this.currentDataSpecLengthUnset) {
                setNoBytesRemainingAndMaybeStoreLength();
            } else {
                long j11 = this.bytesRemaining;
                if (j11 <= 0) {
                    if (j11 == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(false);
                return read(bArr, i10, i11);
            }
            return read;
        } catch (IOException e2) {
            if (this.currentDataSpecLengthUnset && isCausedByPositionOutOfRange(e2)) {
                setNoBytesRemainingAndMaybeStoreLength();
                return -1;
            }
            handleBeforeThrow(e2);
            throw e2;
        }
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i10) {
        this(cache, dataSource, i10, DEFAULT_MAX_CACHE_FILE_SIZE);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i10, long j3) {
        this(cache, dataSource, new FileDataSource(), new CacheDataSink(cache, j3), i10, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i10, EventListener eventListener) {
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.blockOnCache = (i10 & 1) != 0;
        this.ignoreCacheOnError = (i10 & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i10 & 4) != 0;
        this.upstreamDataSource = dataSource;
        if (dataSink != null) {
            this.cacheWriteDataSource = new TeeDataSource(dataSource, dataSink);
        } else {
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener;
    }
}

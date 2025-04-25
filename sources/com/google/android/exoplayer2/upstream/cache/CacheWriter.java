package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes12.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private final boolean allowShortContent;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private boolean initialized;
    private volatile boolean isCanceled;
    private long nextPosition;
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    /* loaded from: classes12.dex */
    public interface ProgressListener {
        void onProgress(long j, long j2, long j3);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, boolean z, byte[] bArr, ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.allowShortContent = z;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    public void cancel() {
        this.isCanceled = true;
    }

    public void cache() throws IOException {
        throwIfCanceled();
        if (!this.initialized) {
            if (this.dataSpec.length != -1) {
                this.endPosition = this.dataSpec.position + this.dataSpec.length;
            } else {
                long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
                if (contentLength == -1) {
                    contentLength = -1;
                }
                this.endPosition = contentLength;
            }
            this.bytesCached = this.cache.getCachedBytes(this.cacheKey, this.dataSpec.position, this.dataSpec.length);
            ProgressListener progressListener = this.progressListener;
            if (progressListener != null) {
                progressListener.onProgress(getLength(), this.bytesCached, 0L);
            }
            this.initialized = true;
        }
        while (true) {
            long j = this.endPosition;
            if (j != -1 && this.nextPosition >= j) {
                return;
            }
            throwIfCanceled();
            long j2 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j2 == -1 ? Long.MAX_VALUE : j2 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j3 = -cachedLength;
                if (j3 == Long.MAX_VALUE) {
                    j3 = -1;
                }
                long j4 = this.nextPosition;
                this.nextPosition = j4 + readBlockToCache(j4, j3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:33:0x0018, B:11:0x004b, B:15:0x006c, B:19:0x0075, B:22:0x0083, B:28:0x008b, B:36:0x0034, B:39:0x003a, B:41:0x0040, B:42:0x0046), top: B:7:0x0016, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:33:0x0018, B:11:0x004b, B:15:0x006c, B:19:0x0075, B:22:0x0083, B:28:0x008b, B:36:0x0034, B:39:0x003a, B:41:0x0040, B:42:0x0046), top: B:7:0x0016, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:33:0x0018, B:11:0x004b, B:15:0x006c, B:19:0x0075, B:22:0x0083, B:28:0x008b, B:36:0x0034, B:39:0x003a, B:41:0x0040, B:42:0x0046), top: B:7:0x0016, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long readBlockToCache(long r7, long r9) throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r7 + r9
            long r2 = r6.endPosition
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L13
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L47
            com.google.android.exoplayer2.upstream.DataSpec r5 = r6.dataSpec     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            com.google.android.exoplayer2.upstream.DataSpec$Builder r5 = r5.buildUpon()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            com.google.android.exoplayer2.upstream.DataSpec$Builder r5 = r5.setPosition(r7)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r5.setLength(r9)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            com.google.android.exoplayer2.upstream.DataSpec r9 = r9.build()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r10 = r6.dataSource     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            long r9 = r10.open(r9)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            goto L49
        L31:
            r7 = move-exception
            goto L91
        L33:
            r9 = move-exception
            boolean r10 = r6.allowShortContent     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L46
            if (r0 == 0) goto L46
            boolean r10 = com.google.android.exoplayer2.upstream.DataSourceException.isCausedByPositionOutOfRange(r9)     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L46
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r9 = r6.dataSource     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.util.Util.closeQuietly(r9)     // Catch: java.lang.Throwable -> L31
            goto L47
        L46:
            throw r9     // Catch: java.lang.Throwable -> L31
        L47:
            r1 = r2
            r9 = r3
        L49:
            if (r1 != 0) goto L66
            r6.throwIfCanceled()     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.upstream.DataSpec r9 = r6.dataSpec     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.buildUpon()     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.setPosition(r7)     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.setLength(r3)     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.upstream.DataSpec r9 = r9.build()     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r10 = r6.dataSource     // Catch: java.lang.Throwable -> L31
            long r9 = r10.open(r9)     // Catch: java.lang.Throwable -> L31
        L66:
            if (r0 == 0) goto L70
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L70
            long r9 = r9 + r7
            r6.onRequestEndPosition(r9)     // Catch: java.lang.Throwable -> L31
        L70:
            r9 = r2
            r10 = r9
        L72:
            r1 = -1
            if (r9 == r1) goto L89
            r6.throwIfCanceled()     // Catch: java.lang.Throwable -> L31
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r9 = r6.dataSource     // Catch: java.lang.Throwable -> L31
            byte[] r3 = r6.temporaryBuffer     // Catch: java.lang.Throwable -> L31
            int r4 = r3.length     // Catch: java.lang.Throwable -> L31
            int r9 = r9.read(r3, r2, r4)     // Catch: java.lang.Throwable -> L31
            if (r9 == r1) goto L72
            long r3 = (long) r9     // Catch: java.lang.Throwable -> L31
            r6.onNewBytesCached(r3)     // Catch: java.lang.Throwable -> L31
            int r10 = r10 + r9
            goto L72
        L89:
            if (r0 == 0) goto L97
            long r0 = (long) r10     // Catch: java.lang.Throwable -> L31
            long r7 = r7 + r0
            r6.onRequestEndPosition(r7)     // Catch: java.lang.Throwable -> L31
            goto L97
        L91:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r8 = r6.dataSource
            com.google.android.exoplayer2.util.Util.closeQuietly(r8)
            throw r7
        L97:
            long r7 = (long) r10
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r9 = r6.dataSource
            com.google.android.exoplayer2.util.Util.closeQuietly(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheWriter.readBlockToCache(long, long):long");
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private void onNewBytesCached(long j) {
        this.bytesCached += j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private long getLength() {
        long j = this.endPosition;
        if (j == -1) {
            return -1L;
        }
        return j - this.dataSpec.position;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }
}

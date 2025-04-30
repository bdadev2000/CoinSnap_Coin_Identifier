package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleQueue;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {
    private static final String TAG = "ChunkSampleStream";
    private final SequenceableLoader.Callback<ChunkSampleStream<T>> callback;
    private final T chunkSource;
    long decodeOnlyUntilPositionUs;
    private final SampleQueue[] embeddedSampleQueues;
    private final Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private long lastSeekPositionUs;
    boolean loadingFinished;
    private final BaseMediaChunkOutput mediaChunkOutput;
    private final ArrayList<BaseMediaChunk> mediaChunks;
    private final int minLoadableRetryCount;
    private long pendingResetPositionUs;
    private Format primaryDownstreamTrackFormat;
    private final SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final List<BaseMediaChunk> readOnlyMediaChunks;
    private ReleaseCallback<T> releaseCallback;
    private final Loader loader = new Loader("Loader:ChunkSampleStream");
    private final ChunkHolder nextChunkHolder = new ChunkHolder();

    /* loaded from: classes3.dex */
    public final class EmbeddedSampleStream implements SampleStream {
        private boolean formatNotificationSent;
        private final int index;
        public final ChunkSampleStream<T> parent;
        private final SampleQueue sampleQueue;

        public EmbeddedSampleStream(ChunkSampleStream<T> chunkSampleStream, SampleQueue sampleQueue, int i9) {
            this.parent = chunkSampleStream;
            this.sampleQueue = sampleQueue;
            this.index = i9;
        }

        private void maybeNotifyTrackFormatChanged() {
            if (!this.formatNotificationSent) {
                ChunkSampleStream.this.eventDispatcher.downstreamFormatChanged(ChunkSampleStream.this.embeddedTrackTypes[this.index], ChunkSampleStream.this.embeddedTrackFormats[this.index], 0, null, ChunkSampleStream.this.lastSeekPositionUs);
                this.formatNotificationSent = true;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final boolean isReady() {
            ChunkSampleStream chunkSampleStream = ChunkSampleStream.this;
            if (!chunkSampleStream.loadingFinished && (chunkSampleStream.isPendingReset() || !this.sampleQueue.hasNextSample())) {
                return false;
            }
            return true;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final void maybeThrowError() throws IOException {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
            if (ChunkSampleStream.this.isPendingReset()) {
                return -3;
            }
            SampleQueue sampleQueue = this.sampleQueue;
            ChunkSampleStream chunkSampleStream = ChunkSampleStream.this;
            int read = sampleQueue.read(formatHolder, decoderInputBuffer, z8, chunkSampleStream.loadingFinished, chunkSampleStream.decodeOnlyUntilPositionUs);
            if (read == -4) {
                maybeNotifyTrackFormatChanged();
            }
            return read;
        }

        public final void release() {
            Assertions.checkState(ChunkSampleStream.this.embeddedTracksSelected[this.index]);
            ChunkSampleStream.this.embeddedTracksSelected[this.index] = false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int skipData(long j7) {
            int advanceTo;
            if (ChunkSampleStream.this.loadingFinished && j7 > this.sampleQueue.getLargestQueuedTimestampUs()) {
                advanceTo = this.sampleQueue.advanceToEnd();
            } else {
                advanceTo = this.sampleQueue.advanceTo(j7, true, true);
                if (advanceTo == -1) {
                    advanceTo = 0;
                }
            }
            if (advanceTo > 0) {
                maybeNotifyTrackFormatChanged();
            }
            return advanceTo;
        }
    }

    /* loaded from: classes3.dex */
    public interface ReleaseCallback<T extends ChunkSource> {
        void onSampleStreamReleased(ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i9, int[] iArr, Format[] formatArr, T t9, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j7, int i10, MediaSourceEventListener.EventDispatcher eventDispatcher) {
        int length;
        this.primaryTrackType = i9;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr;
        this.chunkSource = t9;
        this.callback = callback;
        this.eventDispatcher = eventDispatcher;
        this.minLoadableRetryCount = i10;
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = Collections.unmodifiableList(arrayList);
        int i11 = 0;
        if (iArr == null) {
            length = 0;
        } else {
            length = iArr.length;
        }
        this.embeddedSampleQueues = new SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        SampleQueue[] sampleQueueArr = new SampleQueue[i12];
        SampleQueue sampleQueue = new SampleQueue(allocator);
        this.primarySampleQueue = sampleQueue;
        iArr2[0] = i9;
        sampleQueueArr[0] = sampleQueue;
        while (i11 < length) {
            SampleQueue sampleQueue2 = new SampleQueue(allocator);
            this.embeddedSampleQueues[i11] = sampleQueue2;
            int i13 = i11 + 1;
            sampleQueueArr[i13] = sampleQueue2;
            iArr2[i13] = iArr[i11];
            i11 = i13;
        }
        this.mediaChunkOutput = new BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j7;
        this.lastSeekPositionUs = j7;
    }

    private void discardDownstreamMediaChunks(int i9) {
        int primaryStreamIndexToMediaChunkIndex = primaryStreamIndexToMediaChunkIndex(i9, 0);
        if (primaryStreamIndexToMediaChunkIndex > 0) {
            Util.removeRange(this.mediaChunks, 0, primaryStreamIndexToMediaChunkIndex);
        }
    }

    private BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i9) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i9);
        ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i9, arrayList.size());
        int i10 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i10 < sampleQueueArr.length) {
                SampleQueue sampleQueue = sampleQueueArr[i10];
                i10++;
                sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i10));
            } else {
                return baseMediaChunk;
            }
        }
    }

    private BaseMediaChunk getLastMediaChunk() {
        return (BaseMediaChunk) o.g(this.mediaChunks, 1);
    }

    private boolean haveReadFromMediaChunk(int i9) {
        int readIndex;
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i9);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i10 = 0;
        do {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i10 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i10].getReadIndex();
            i10++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i10));
        return true;
    }

    private boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof BaseMediaChunk;
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i9, int i10) {
        int primaryStreamIndexToMediaChunkIndex = primaryStreamIndexToMediaChunkIndex(i9 - i10, 0);
        int primaryStreamIndexToMediaChunkIndex2 = i10 == 1 ? primaryStreamIndexToMediaChunkIndex : primaryStreamIndexToMediaChunkIndex(i9 - 1, primaryStreamIndexToMediaChunkIndex);
        while (primaryStreamIndexToMediaChunkIndex <= primaryStreamIndexToMediaChunkIndex2) {
            maybeNotifyPrimaryTrackFormatChanged(primaryStreamIndexToMediaChunkIndex);
            primaryStreamIndexToMediaChunkIndex++;
        }
    }

    private int primaryStreamIndexToMediaChunkIndex(int i9, int i10) {
        do {
            i10++;
            if (i10 >= this.mediaChunks.size()) {
                return this.mediaChunks.size() - 1;
            }
        } while (this.mediaChunks.get(i10).getFirstSampleIndex(0) <= i9);
        return i10 - 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j7) {
        BaseMediaChunk lastMediaChunk;
        long j9;
        if (this.loadingFinished || this.loader.isLoading()) {
            return false;
        }
        boolean isPendingReset = isPendingReset();
        if (isPendingReset) {
            j9 = this.pendingResetPositionUs;
            lastMediaChunk = null;
        } else {
            lastMediaChunk = getLastMediaChunk();
            j9 = lastMediaChunk.endTimeUs;
        }
        this.chunkSource.getNextChunk(lastMediaChunk, j7, j9, this.nextChunkHolder);
        ChunkHolder chunkHolder = this.nextChunkHolder;
        boolean z8 = chunkHolder.endOfStream;
        Chunk chunk = chunkHolder.chunk;
        chunkHolder.clear();
        if (z8) {
            this.pendingResetPositionUs = C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        if (isMediaChunk(chunk)) {
            BaseMediaChunk baseMediaChunk = (BaseMediaChunk) chunk;
            if (isPendingReset) {
                long j10 = baseMediaChunk.startTimeUs;
                long j11 = this.pendingResetPositionUs;
                if (j10 == j11) {
                    j11 = Long.MIN_VALUE;
                }
                this.decodeOnlyUntilPositionUs = j11;
                this.pendingResetPositionUs = C.TIME_UNSET;
            }
            baseMediaChunk.init(this.mediaChunkOutput);
            this.mediaChunks.add(baseMediaChunk);
        }
        this.eventDispatcher.loadStarted(chunk.dataSpec, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, this.loader.startLoading(chunk, this, this.minLoadableRetryCount));
        return true;
    }

    public void discardBuffer(long j7, boolean z8) {
        int firstIndex = this.primarySampleQueue.getFirstIndex();
        this.primarySampleQueue.discardTo(j7, z8, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
            int i9 = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
                if (i9 < sampleQueueArr.length) {
                    sampleQueueArr[i9].discardTo(firstTimestampUs, z8, this.embeddedTracksSelected[i9]);
                    i9++;
                } else {
                    discardDownstreamMediaChunks(firstIndex2);
                    return;
                }
            }
        }
    }

    public long getAdjustedSeekPositionUs(long j7, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j7, seekParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long j7 = this.lastSeekPositionUs;
        BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                lastMediaChunk = (BaseMediaChunk) o.g(this.mediaChunks, 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            j7 = Math.max(j7, lastMediaChunk.endTimeUs);
        }
        return Math.max(j7, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.chunkSource;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    public boolean isPendingReset() {
        if (this.pendingResetPositionUs != C.TIME_UNSET) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public boolean isReady() {
        if (!this.loadingFinished && (isPendingReset() || !this.primarySampleQueue.hasNextSample())) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        if (!this.loader.isLoading()) {
            this.chunkSource.maybeThrowError();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
        ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
        if (isPendingReset()) {
            return -3;
        }
        int read = this.primarySampleQueue.read(formatHolder, decoderInputBuffer, z8, this.loadingFinished, this.decodeOnlyUntilPositionUs);
        if (read == -4) {
            maybeNotifyPrimaryTrackFormatChanged(this.primarySampleQueue.getReadIndex(), 1);
        }
        return read;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j7) {
        int size;
        int preferredQueueSize;
        if (this.loader.isLoading() || isPendingReset() || (size = this.mediaChunks.size()) <= (preferredQueueSize = this.chunkSource.getPreferredQueueSize(j7, this.readOnlyMediaChunks))) {
            return;
        }
        while (true) {
            if (preferredQueueSize < size) {
                if (!haveReadFromMediaChunk(preferredQueueSize)) {
                    break;
                } else {
                    preferredQueueSize++;
                }
            } else {
                preferredQueueSize = size;
                break;
            }
        }
        if (preferredQueueSize == size) {
            return;
        }
        long j9 = getLastMediaChunk().endTimeUs;
        BaseMediaChunk discardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(preferredQueueSize);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.eventDispatcher.upstreamDiscarded(this.primaryTrackType, discardUpstreamMediaChunksFromIndex.startTimeUs, j9);
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long j7) {
        BaseMediaChunk baseMediaChunk;
        boolean z8;
        boolean z9;
        this.lastSeekPositionUs = j7;
        this.primarySampleQueue.rewind();
        if (isPendingReset()) {
            z9 = false;
        } else {
            for (int i9 = 0; i9 < this.mediaChunks.size(); i9++) {
                baseMediaChunk = this.mediaChunks.get(i9);
                long j9 = baseMediaChunk.startTimeUs;
                if (j9 == j7 && baseMediaChunk.seekTimeUs == C.TIME_UNSET) {
                    break;
                } else {
                    if (j9 > j7) {
                        break;
                    }
                }
            }
            baseMediaChunk = null;
            if (baseMediaChunk != null) {
                z9 = this.primarySampleQueue.setReadPosition(baseMediaChunk.getFirstSampleIndex(0));
                this.decodeOnlyUntilPositionUs = Long.MIN_VALUE;
            } else {
                SampleQueue sampleQueue = this.primarySampleQueue;
                if (j7 < getNextLoadPositionUs()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (sampleQueue.advanceTo(j7, true, z8) != -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.decodeOnlyUntilPositionUs = this.lastSeekPositionUs;
            }
        }
        if (z9) {
            for (SampleQueue sampleQueue2 : this.embeddedSampleQueues) {
                sampleQueue2.rewind();
                sampleQueue2.advanceTo(j7, true, false);
            }
            return;
        }
        this.pendingResetPositionUs = j7;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            this.loader.cancelLoading();
            return;
        }
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue3 : this.embeddedSampleQueues) {
            sampleQueue3.reset();
        }
    }

    public ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j7, int i9) {
        for (int i10 = 0; i10 < this.embeddedSampleQueues.length; i10++) {
            if (this.embeddedTrackTypes[i10] == i9) {
                Assertions.checkState(!this.embeddedTracksSelected[i10]);
                this.embeddedTracksSelected[i10] = true;
                this.embeddedSampleQueues[i10].rewind();
                this.embeddedSampleQueues[i10].advanceTo(j7, true, true);
                return new EmbeddedSampleStream(this, this.embeddedSampleQueues[i10], i10);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int skipData(long j7) {
        int i9 = 0;
        if (isPendingReset()) {
            return 0;
        }
        if (this.loadingFinished && j7 > this.primarySampleQueue.getLargestQueuedTimestampUs()) {
            i9 = this.primarySampleQueue.advanceToEnd();
        } else {
            int advanceTo = this.primarySampleQueue.advanceTo(j7, true, true);
            if (advanceTo != -1) {
                i9 = advanceTo;
            }
        }
        if (i9 > 0) {
            maybeNotifyPrimaryTrackFormatChanged(this.primarySampleQueue.getReadIndex(), i9);
        }
        return i9;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j7, long j9, boolean z8) {
        this.eventDispatcher.loadCanceled(chunk.dataSpec, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j7, j9, chunk.bytesLoaded());
        if (z8) {
            return;
        }
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j7, long j9) {
        this.chunkSource.onChunkLoadCompleted(chunk);
        this.eventDispatcher.loadCompleted(chunk.dataSpec, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j7, j9, chunk.bytesLoaded());
        this.callback.onContinueLoadingRequested(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[RETURN] */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onLoadError(com.mbridge.msdk.playercommon.exoplayer2.source.chunk.Chunk r24, long r25, long r27, java.io.IOException r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            long r17 = r24.bytesLoaded()
            boolean r2 = r23.isMediaChunk(r24)
            java.util.ArrayList<com.mbridge.msdk.playercommon.exoplayer2.source.chunk.BaseMediaChunk> r3 = r0.mediaChunks
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
            r5 = 0
            int r5 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            r21 = 0
            if (r5 == 0) goto L28
            if (r2 == 0) goto L28
            boolean r5 = r0.haveReadFromMediaChunk(r3)
            if (r5 != 0) goto L25
            goto L28
        L25:
            r5 = r21
            goto L29
        L28:
            r5 = r4
        L29:
            T extends com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkSource r6 = r0.chunkSource
            r15 = r29
            boolean r6 = r6.onChunkLoadError(r1, r5, r15)
            if (r6 == 0) goto L5b
            if (r5 != 0) goto L3d
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r3 = "Ignoring attempt to cancel non-cancelable load."
            android.util.Log.w(r2, r3)
            goto L5b
        L3d:
            if (r2 == 0) goto L58
            com.mbridge.msdk.playercommon.exoplayer2.source.chunk.BaseMediaChunk r2 = r0.discardUpstreamMediaChunksFromIndex(r3)
            if (r2 != r1) goto L47
            r2 = r4
            goto L49
        L47:
            r2 = r21
        L49:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r2)
            java.util.ArrayList<com.mbridge.msdk.playercommon.exoplayer2.source.chunk.BaseMediaChunk> r2 = r0.mediaChunks
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L58
            long r2 = r0.lastSeekPositionUs
            r0.pendingResetPositionUs = r2
        L58:
            r22 = r4
            goto L5d
        L5b:
            r22 = r21
        L5d:
            com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.eventDispatcher
            com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec r3 = r1.dataSpec
            int r4 = r1.type
            int r5 = r0.primaryTrackType
            com.mbridge.msdk.playercommon.exoplayer2.Format r6 = r1.trackFormat
            int r7 = r1.trackSelectionReason
            java.lang.Object r8 = r1.trackSelectionData
            long r9 = r1.startTimeUs
            long r11 = r1.endTimeUs
            r13 = r25
            r15 = r27
            r19 = r29
            r20 = r22
            r2.loadError(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r17, r19, r20)
            if (r22 == 0) goto L83
            com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader$Callback<com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkSampleStream<T extends com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkSource>> r1 = r0.callback
            r1.onContinueLoadingRequested(r0)
            r1 = 2
            return r1
        L83:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkSampleStream.onLoadError(com.mbridge.msdk.playercommon.exoplayer2.source.chunk.Chunk, long, long, java.io.IOException):int");
    }

    public void release(ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.discardToEnd();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.discardToEnd();
        }
        this.loader.release(this);
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i9) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i9);
        Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.eventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }
}

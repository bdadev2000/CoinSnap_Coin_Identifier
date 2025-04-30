package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DefaultExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleQueue;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ConditionVariable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
final class ExtractorMediaPeriod implements ExtractorOutput, MediaPeriod, SampleQueue.UpstreamFormatChangedListener, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private int actualMinLoadableRetryCount;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private final String customCacheKey;
    private final DataSource dataSource;
    private int enabledTrackCount;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private int extractedSamplesCountAtStartOfLoad;
    private final ExtractorHolder extractorHolder;
    private boolean haveAudioVideoTracks;
    private long lastSeekPositionUs;
    private final Listener listener;
    private boolean loadingFinished;
    private final int minLoadableRetryCount;
    private boolean notifiedReadingStarted;
    private boolean notifyDiscontinuity;
    private boolean pendingDeferredRetry;
    private boolean prepared;
    private boolean released;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private boolean[] trackEnabledStates;
    private boolean[] trackFormatNotificationSent;
    private boolean[] trackIsAudioVideoFlags;
    private TrackGroupArray tracks;
    private final Uri uri;
    private final Loader loader = new Loader("Loader:ExtractorMediaPeriod");
    private final ConditionVariable loadCondition = new ConditionVariable();
    private final Runnable maybeFinishPrepareRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaPeriod.1
        @Override // java.lang.Runnable
        public void run() {
            ExtractorMediaPeriod.this.maybeFinishPrepare();
        }
    };
    private final Runnable onContinueLoadingRequestedRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaPeriod.2
        @Override // java.lang.Runnable
        public void run() {
            if (!ExtractorMediaPeriod.this.released) {
                ExtractorMediaPeriod.this.callback.onContinueLoadingRequested(ExtractorMediaPeriod.this);
            }
        }
    };
    private final Handler handler = new Handler();
    private int[] sampleQueueTrackIds = new int[0];
    private SampleQueue[] sampleQueues = new SampleQueue[0];
    private long pendingResetPositionUs = C.TIME_UNSET;
    private long length = -1;
    private long durationUs = C.TIME_UNSET;

    /* loaded from: classes3.dex */
    public final class ExtractingLoadable implements Loader.Loadable {
        private long bytesLoaded;
        private final DataSource dataSource;
        private DataSpec dataSpec;
        private final ExtractorHolder extractorHolder;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private long seekTimeUs;
        private final Uri uri;
        private final PositionHolder positionHolder = new PositionHolder();
        private boolean pendingExtractorSeek = true;
        private long length = -1;

        public ExtractingLoadable(Uri uri, DataSource dataSource, ExtractorHolder extractorHolder, ConditionVariable conditionVariable) {
            this.uri = (Uri) Assertions.checkNotNull(uri);
            this.dataSource = (DataSource) Assertions.checkNotNull(dataSource);
            this.extractorHolder = (ExtractorHolder) Assertions.checkNotNull(extractorHolder);
            this.loadCondition = conditionVariable;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
        public final void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
        public final void load() throws IOException, InterruptedException {
            int i9 = 0;
            while (i9 == 0 && !this.loadCanceled) {
                DefaultExtractorInput defaultExtractorInput = null;
                try {
                    long j7 = this.positionHolder.position;
                    DataSpec dataSpec = new DataSpec(this.uri, j7, -1L, ExtractorMediaPeriod.this.customCacheKey);
                    this.dataSpec = dataSpec;
                    long open = this.dataSource.open(dataSpec);
                    this.length = open;
                    if (open != -1) {
                        this.length = open + j7;
                    }
                    DefaultExtractorInput defaultExtractorInput2 = new DefaultExtractorInput(this.dataSource, j7, this.length);
                    try {
                        Extractor selectExtractor = this.extractorHolder.selectExtractor(defaultExtractorInput2, this.dataSource.getUri());
                        if (this.pendingExtractorSeek) {
                            selectExtractor.seek(j7, this.seekTimeUs);
                            this.pendingExtractorSeek = false;
                        }
                        while (i9 == 0 && !this.loadCanceled) {
                            this.loadCondition.block();
                            i9 = selectExtractor.read(defaultExtractorInput2, this.positionHolder);
                            if (defaultExtractorInput2.getPosition() > ExtractorMediaPeriod.this.continueLoadingCheckIntervalBytes + j7) {
                                j7 = defaultExtractorInput2.getPosition();
                                this.loadCondition.close();
                                ExtractorMediaPeriod.this.handler.post(ExtractorMediaPeriod.this.onContinueLoadingRequestedRunnable);
                            }
                        }
                        if (i9 == 1) {
                            i9 = 0;
                        } else {
                            this.positionHolder.position = defaultExtractorInput2.getPosition();
                            this.bytesLoaded = this.positionHolder.position - this.dataSpec.absoluteStreamPosition;
                        }
                        Util.closeQuietly(this.dataSource);
                    } catch (Throwable th) {
                        th = th;
                        defaultExtractorInput = defaultExtractorInput2;
                        if (i9 != 1 && defaultExtractorInput != null) {
                            this.positionHolder.position = defaultExtractorInput.getPosition();
                            this.bytesLoaded = this.positionHolder.position - this.dataSpec.absoluteStreamPosition;
                        }
                        Util.closeQuietly(this.dataSource);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        public final void setLoadPosition(long j7, long j9) {
            this.positionHolder.position = j7;
            this.seekTimeUs = j9;
            this.pendingExtractorSeek = true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ExtractorHolder {
        private Extractor extractor;
        private final ExtractorOutput extractorOutput;
        private final Extractor[] extractors;

        public ExtractorHolder(Extractor[] extractorArr, ExtractorOutput extractorOutput) {
            this.extractors = extractorArr;
            this.extractorOutput = extractorOutput;
        }

        public final void release() {
            Extractor extractor = this.extractor;
            if (extractor != null) {
                extractor.release();
                this.extractor = null;
            }
        }

        public final Extractor selectExtractor(ExtractorInput extractorInput, Uri uri) throws IOException, InterruptedException {
            Extractor extractor = this.extractor;
            if (extractor != null) {
                return extractor;
            }
            Extractor[] extractorArr = this.extractors;
            int length = extractorArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                Extractor extractor2 = extractorArr[i9];
                try {
                    if (extractor2.sniff(extractorInput)) {
                        this.extractor = extractor2;
                        extractorInput.resetPeekPosition();
                        break;
                    }
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    extractorInput.resetPeekPosition();
                    throw th;
                }
                extractorInput.resetPeekPosition();
                i9++;
            }
            Extractor extractor3 = this.extractor;
            if (extractor3 != null) {
                extractor3.init(this.extractorOutput);
                return this.extractor;
            }
            throw new UnrecognizedInputFormatException(AbstractC2914a.h(new StringBuilder("None of the available extractors ("), Util.getCommaDelimitedSimpleClassNames(this.extractors), ") could read the stream."), uri);
        }
    }

    /* loaded from: classes3.dex */
    public interface Listener {
        void onSourceInfoRefreshed(long j7, boolean z8);
    }

    /* loaded from: classes3.dex */
    public final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i9) {
            this.track = i9;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final boolean isReady() {
            return ExtractorMediaPeriod.this.isReady(this.track);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final void maybeThrowError() throws IOException {
            ExtractorMediaPeriod.this.maybeThrowError();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
            return ExtractorMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, z8);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int skipData(long j7) {
            return ExtractorMediaPeriod.this.skipData(this.track, j7);
        }
    }

    public ExtractorMediaPeriod(Uri uri, DataSource dataSource, Extractor[] extractorArr, int i9, MediaSourceEventListener.EventDispatcher eventDispatcher, Listener listener, Allocator allocator, String str, int i10) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.minLoadableRetryCount = i9;
        this.eventDispatcher = eventDispatcher;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i10;
        this.extractorHolder = new ExtractorHolder(extractorArr, this);
        this.actualMinLoadableRetryCount = i9 == -1 ? 3 : i9;
        eventDispatcher.mediaPeriodCreated();
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i9) {
        SeekMap seekMap;
        if (this.length == -1 && ((seekMap = this.seekMap) == null || seekMap.getDurationUs() == C.TIME_UNSET)) {
            if (this.prepared && !suppressRead()) {
                this.pendingDeferredRetry = true;
                return false;
            }
            this.notifyDiscontinuity = this.prepared;
            this.lastSeekPositionUs = 0L;
            this.extractedSamplesCountAtStartOfLoad = 0;
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
            extractingLoadable.setLoadPosition(0L, 0L);
            return true;
        }
        this.extractedSamplesCountAtStartOfLoad = i9;
        return true;
    }

    private void copyLengthFromLoader(ExtractingLoadable extractingLoadable) {
        if (this.length == -1) {
            this.length = extractingLoadable.length;
        }
    }

    private int getExtractedSamplesCount() {
        int i9 = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            i9 += sampleQueue.getWriteIndex();
        }
        return i9;
    }

    private long getLargestQueuedTimestampUs() {
        long j7 = Long.MIN_VALUE;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            j7 = Math.max(j7, sampleQueue.getLargestQueuedTimestampUs());
        }
        return j7;
    }

    private static boolean isLoadableExceptionFatal(IOException iOException) {
        return iOException instanceof UnrecognizedInputFormatException;
    }

    private boolean isPendingReset() {
        if (this.pendingResetPositionUs != C.TIME_UNSET) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && !this.prepared && this.seekMap != null && this.sampleQueuesBuilt) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                if (sampleQueue.getUpstreamFormat() == null) {
                    return;
                }
            }
            this.loadCondition.close();
            int length = this.sampleQueues.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            this.trackIsAudioVideoFlags = new boolean[length];
            this.trackEnabledStates = new boolean[length];
            this.trackFormatNotificationSent = new boolean[length];
            this.durationUs = this.seekMap.getDurationUs();
            int i9 = 0;
            while (true) {
                boolean z8 = true;
                if (i9 >= length) {
                    break;
                }
                Format upstreamFormat = this.sampleQueues[i9].getUpstreamFormat();
                trackGroupArr[i9] = new TrackGroup(upstreamFormat);
                String str = upstreamFormat.sampleMimeType;
                if (!MimeTypes.isVideo(str) && !MimeTypes.isAudio(str)) {
                    z8 = false;
                }
                this.trackIsAudioVideoFlags[i9] = z8;
                this.haveAudioVideoTracks = z8 | this.haveAudioVideoTracks;
                i9++;
            }
            this.tracks = new TrackGroupArray(trackGroupArr);
            if (this.minLoadableRetryCount == -1 && this.length == -1 && this.seekMap.getDurationUs() == C.TIME_UNSET) {
                this.actualMinLoadableRetryCount = 6;
            }
            this.prepared = true;
            this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap.isSeekable());
            this.callback.onPrepared(this);
        }
    }

    private void maybeNotifyTrackFormat(int i9) {
        if (!this.trackFormatNotificationSent[i9]) {
            Format format = this.tracks.get(i9).getFormat(0);
            this.eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
            this.trackFormatNotificationSent[i9] = true;
        }
    }

    private void maybeStartDeferredRetry(int i9) {
        if (this.pendingDeferredRetry && this.trackIsAudioVideoFlags[i9] && !this.sampleQueues[i9].hasNextSample()) {
            this.pendingResetPositionUs = 0L;
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = true;
            this.lastSeekPositionUs = 0L;
            this.extractedSamplesCountAtStartOfLoad = 0;
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
            this.callback.onContinueLoadingRequested(this);
        }
    }

    private boolean seekInsideBufferUs(long j7) {
        int length = this.sampleQueues.length;
        for (int i9 = 0; i9 < length; i9++) {
            SampleQueue sampleQueue = this.sampleQueues[i9];
            sampleQueue.rewind();
            if (sampleQueue.advanceTo(j7, true, false) == -1 && (this.trackIsAudioVideoFlags[i9] || !this.haveAudioVideoTracks)) {
                return false;
            }
        }
        return true;
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.extractorHolder, this.loadCondition);
        if (this.prepared) {
            Assertions.checkState(isPendingReset());
            long j7 = this.durationUs;
            if (j7 != C.TIME_UNSET && this.pendingResetPositionUs >= j7) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = C.TIME_UNSET;
                return;
            } else {
                extractingLoadable.setLoadPosition(this.seekMap.getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
                this.pendingResetPositionUs = C.TIME_UNSET;
            }
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.eventDispatcher.loadStarted(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, this.loader.startLoading(extractingLoadable, this, this.actualMinLoadableRetryCount));
    }

    private boolean suppressRead() {
        if (!this.notifyDiscontinuity && !isPendingReset()) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j7) {
        if (!this.loadingFinished && !this.pendingDeferredRetry) {
            if (!this.prepared || this.enabledTrackCount != 0) {
                boolean open = this.loadCondition.open();
                if (!this.loader.isLoading()) {
                    startLoading();
                    return true;
                }
                return open;
            }
            return false;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j7, boolean z8) {
        int length = this.sampleQueues.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.sampleQueues[i9].discardTo(j7, z8, this.trackEnabledStates[i9]);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j7, SeekParameters seekParameters) {
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j7);
        return Util.resolveSeekPositionUs(j7, seekParameters, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                if (this.trackIsAudioVideoFlags[i9]) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.sampleQueues[i9].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs();
        }
        if (largestQueuedTimestampUs == Long.MIN_VALUE) {
            return this.lastSeekPositionUs;
        }
        return largestQueuedTimestampUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        if (this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    public final boolean isReady(int i9) {
        if (!suppressRead() && (this.loadingFinished || this.sampleQueues[i9].hasNextSample())) {
            return true;
        }
        return false;
    }

    public final void maybeThrowError() throws IOException {
        this.loader.maybeThrowError(this.actualMinLoadableRetryCount);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.ReleaseCallback
    public final void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        this.extractorHolder.release();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public final void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j7) {
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
    }

    public final int readData(int i9, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
        if (suppressRead()) {
            return -3;
        }
        int read = this.sampleQueues[i9].read(formatHolder, decoderInputBuffer, z8, this.loadingFinished, this.lastSeekPositionUs);
        if (read == -4) {
            maybeNotifyTrackFormat(i9);
        } else if (read == -3) {
            maybeStartDeferredRetry(i9);
        }
        return read;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        if (!this.notifiedReadingStarted) {
            this.eventDispatcher.readingStarted();
            this.notifiedReadingStarted = true;
        }
        if (this.notifyDiscontinuity) {
            if (this.loadingFinished || getExtractedSamplesCount() > this.extractedSamplesCountAtStartOfLoad) {
                this.notifyDiscontinuity = false;
                return this.lastSeekPositionUs;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j7) {
    }

    public final void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.discardToEnd();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
        this.eventDispatcher.mediaPeriodReleased();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j7) {
        if (!this.seekMap.isSeekable()) {
            j7 = 0;
        }
        this.lastSeekPositionUs = j7;
        this.notifyDiscontinuity = false;
        if (!isPendingReset() && seekInsideBufferUs(j7)) {
            return j7;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j7;
        this.loadingFinished = false;
        if (this.loader.isLoading()) {
            this.loader.cancelLoading();
        } else {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
        }
        return j7;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j7) {
        boolean z8;
        TrackSelection trackSelection;
        boolean z9;
        boolean z10;
        Assertions.checkState(this.prepared);
        int i9 = this.enabledTrackCount;
        int i10 = 0;
        for (int i11 = 0; i11 < trackSelectionArr.length; i11++) {
            SampleStream sampleStream = sampleStreamArr[i11];
            if (sampleStream != null && (trackSelectionArr[i11] == null || !zArr[i11])) {
                int i12 = ((SampleStreamImpl) sampleStream).track;
                Assertions.checkState(this.trackEnabledStates[i12]);
                this.enabledTrackCount--;
                this.trackEnabledStates[i12] = false;
                sampleStreamArr[i11] = null;
            }
        }
        if (!this.seenFirstTrackSelection ? j7 != 0 : i9 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        for (int i13 = 0; i13 < trackSelectionArr.length; i13++) {
            if (sampleStreamArr[i13] == null && (trackSelection = trackSelectionArr[i13]) != null) {
                if (trackSelection.length() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Assertions.checkState(z9);
                if (trackSelection.getIndexInTrackGroup(0) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Assertions.checkState(z10);
                int indexOf = this.tracks.indexOf(trackSelection.getTrackGroup());
                Assertions.checkState(!this.trackEnabledStates[indexOf]);
                this.enabledTrackCount++;
                this.trackEnabledStates[indexOf] = true;
                sampleStreamArr[i13] = new SampleStreamImpl(indexOf);
                zArr2[i13] = true;
                if (!z8) {
                    SampleQueue sampleQueue = this.sampleQueues[indexOf];
                    sampleQueue.rewind();
                    if (sampleQueue.advanceTo(j7, true, true) == -1 && sampleQueue.getReadIndex() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i10 < length) {
                    sampleQueueArr[i10].discardToEnd();
                    i10++;
                }
                this.loader.cancelLoading();
            } else {
                SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i10 < length2) {
                    sampleQueueArr2[i10].reset();
                    i10++;
                }
            }
        } else if (z8) {
            j7 = seekToUs(j7);
            while (i10 < sampleStreamArr.length) {
                if (sampleStreamArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j7;
    }

    public final int skipData(int i9, long j7) {
        int i10 = 0;
        if (suppressRead()) {
            return 0;
        }
        SampleQueue sampleQueue = this.sampleQueues[i9];
        if (this.loadingFinished && j7 > sampleQueue.getLargestQueuedTimestampUs()) {
            i10 = sampleQueue.advanceToEnd();
        } else {
            int advanceTo = sampleQueue.advanceTo(j7, true, true);
            if (advanceTo != -1) {
                i10 = advanceTo;
            }
        }
        if (i10 > 0) {
            maybeNotifyTrackFormat(i9);
        } else {
            maybeStartDeferredRetry(i9);
        }
        return i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i9, int i10) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.sampleQueueTrackIds[i11] == i9) {
                return this.sampleQueues[i11];
            }
        }
        SampleQueue sampleQueue = new SampleQueue(this.allocator);
        sampleQueue.setUpstreamFormatChangeListener(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.sampleQueueTrackIds, i12);
        this.sampleQueueTrackIds = copyOf;
        copyOf[length] = i9;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i12);
        this.sampleQueues = sampleQueueArr;
        sampleQueueArr[length] = sampleQueue;
        return sampleQueue;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final void onLoadCanceled(ExtractingLoadable extractingLoadable, long j7, long j9, boolean z8) {
        this.eventDispatcher.loadCanceled(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j7, j9, extractingLoadable.bytesLoaded);
        if (z8) {
            return;
        }
        copyLengthFromLoader(extractingLoadable);
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final void onLoadCompleted(ExtractingLoadable extractingLoadable, long j7, long j9) {
        if (this.durationUs == C.TIME_UNSET) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs();
            long j10 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + DEFAULT_LAST_SAMPLE_DURATION_US;
            this.durationUs = j10;
            this.listener.onSourceInfoRefreshed(j10, this.seekMap.isSeekable());
        }
        this.eventDispatcher.loadCompleted(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j7, j9, extractingLoadable.bytesLoaded);
        copyLengthFromLoader(extractingLoadable);
        this.loadingFinished = true;
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final int onLoadError(ExtractingLoadable extractingLoadable, long j7, long j9, IOException iOException) {
        ExtractingLoadable extractingLoadable2;
        boolean z8;
        boolean isLoadableExceptionFatal = isLoadableExceptionFatal(iOException);
        this.eventDispatcher.loadError(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j7, j9, extractingLoadable.bytesLoaded, iOException, isLoadableExceptionFatal);
        copyLengthFromLoader(extractingLoadable);
        if (isLoadableExceptionFatal) {
            return 3;
        }
        int extractedSamplesCount = getExtractedSamplesCount();
        if (extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad) {
            extractingLoadable2 = extractingLoadable;
            z8 = true;
        } else {
            extractingLoadable2 = extractingLoadable;
            z8 = false;
        }
        if (configureRetry(extractingLoadable2, extractedSamplesCount)) {
            return z8 ? 1 : 0;
        }
        return 2;
    }
}

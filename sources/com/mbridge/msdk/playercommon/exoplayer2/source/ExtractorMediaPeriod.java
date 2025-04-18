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
import vd.e;

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
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
            long j3;
            DefaultExtractorInput defaultExtractorInput;
            int i10 = 0;
            while (i10 == 0 && !this.loadCanceled) {
                DefaultExtractorInput defaultExtractorInput2 = null;
                try {
                    j3 = this.positionHolder.position;
                    DataSpec dataSpec = new DataSpec(this.uri, j3, -1L, ExtractorMediaPeriod.this.customCacheKey);
                    this.dataSpec = dataSpec;
                    long open = this.dataSource.open(dataSpec);
                    this.length = open;
                    if (open != -1) {
                        this.length = open + j3;
                    }
                    defaultExtractorInput = new DefaultExtractorInput(this.dataSource, j3, this.length);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    Extractor selectExtractor = this.extractorHolder.selectExtractor(defaultExtractorInput, this.dataSource.getUri());
                    if (this.pendingExtractorSeek) {
                        selectExtractor.seek(j3, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (i10 == 0 && !this.loadCanceled) {
                        this.loadCondition.block();
                        i10 = selectExtractor.read(defaultExtractorInput, this.positionHolder);
                        if (defaultExtractorInput.getPosition() > ExtractorMediaPeriod.this.continueLoadingCheckIntervalBytes + j3) {
                            j3 = defaultExtractorInput.getPosition();
                            this.loadCondition.close();
                            ExtractorMediaPeriod.this.handler.post(ExtractorMediaPeriod.this.onContinueLoadingRequestedRunnable);
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else {
                        this.positionHolder.position = defaultExtractorInput.getPosition();
                        this.bytesLoaded = this.positionHolder.position - this.dataSpec.absoluteStreamPosition;
                    }
                    Util.closeQuietly(this.dataSource);
                } catch (Throwable th3) {
                    th = th3;
                    defaultExtractorInput2 = defaultExtractorInput;
                    if (i10 != 1 && defaultExtractorInput2 != null) {
                        this.positionHolder.position = defaultExtractorInput2.getPosition();
                        this.bytesLoaded = this.positionHolder.position - this.dataSpec.absoluteStreamPosition;
                    }
                    Util.closeQuietly(this.dataSource);
                    throw th;
                }
            }
        }

        public final void setLoadPosition(long j3, long j10) {
            this.positionHolder.position = j3;
            this.seekTimeUs = j10;
            this.pendingExtractorSeek = true;
        }
    }

    /* loaded from: classes4.dex */
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
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                Extractor extractor2 = extractorArr[i10];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th2) {
                    extractorInput.resetPeekPosition();
                    throw th2;
                }
                if (extractor2.sniff(extractorInput)) {
                    this.extractor = extractor2;
                    extractorInput.resetPeekPosition();
                    break;
                }
                continue;
                extractorInput.resetPeekPosition();
                i10++;
            }
            Extractor extractor3 = this.extractor;
            if (extractor3 != null) {
                extractor3.init(this.extractorOutput);
                return this.extractor;
            }
            throw new UnrecognizedInputFormatException(e.h(new StringBuilder("None of the available extractors ("), Util.getCommaDelimitedSimpleClassNames(this.extractors), ") could read the stream."), uri);
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        void onSourceInfoRefreshed(long j3, boolean z10);
    }

    /* loaded from: classes4.dex */
    public final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i10) {
            this.track = i10;
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
        public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) {
            return ExtractorMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, z10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int skipData(long j3) {
            return ExtractorMediaPeriod.this.skipData(this.track, j3);
        }
    }

    public ExtractorMediaPeriod(Uri uri, DataSource dataSource, Extractor[] extractorArr, int i10, MediaSourceEventListener.EventDispatcher eventDispatcher, Listener listener, Allocator allocator, String str, int i11) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.minLoadableRetryCount = i10;
        this.eventDispatcher = eventDispatcher;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i11;
        this.extractorHolder = new ExtractorHolder(extractorArr, this);
        this.actualMinLoadableRetryCount = i10 == -1 ? 3 : i10;
        eventDispatcher.mediaPeriodCreated();
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i10) {
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
        this.extractedSamplesCountAtStartOfLoad = i10;
        return true;
    }

    private void copyLengthFromLoader(ExtractingLoadable extractingLoadable) {
        if (this.length == -1) {
            this.length = extractingLoadable.length;
        }
    }

    private int getExtractedSamplesCount() {
        int i10 = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            i10 += sampleQueue.getWriteIndex();
        }
        return i10;
    }

    private long getLargestQueuedTimestampUs() {
        long j3 = Long.MIN_VALUE;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            j3 = Math.max(j3, sampleQueue.getLargestQueuedTimestampUs());
        }
        return j3;
    }

    private static boolean isLoadableExceptionFatal(IOException iOException) {
        return iOException instanceof UnrecognizedInputFormatException;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
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
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (i10 >= length) {
                    break;
                }
                Format upstreamFormat = this.sampleQueues[i10].getUpstreamFormat();
                trackGroupArr[i10] = new TrackGroup(upstreamFormat);
                String str = upstreamFormat.sampleMimeType;
                if (!MimeTypes.isVideo(str) && !MimeTypes.isAudio(str)) {
                    z10 = false;
                }
                this.trackIsAudioVideoFlags[i10] = z10;
                this.haveAudioVideoTracks = z10 | this.haveAudioVideoTracks;
                i10++;
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

    private void maybeNotifyTrackFormat(int i10) {
        if (!this.trackFormatNotificationSent[i10]) {
            Format format = this.tracks.get(i10).getFormat(0);
            this.eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
            this.trackFormatNotificationSent[i10] = true;
        }
    }

    private void maybeStartDeferredRetry(int i10) {
        if (this.pendingDeferredRetry && this.trackIsAudioVideoFlags[i10] && !this.sampleQueues[i10].hasNextSample()) {
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

    private boolean seekInsideBufferUs(long j3) {
        int length = this.sampleQueues.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            SampleQueue sampleQueue = this.sampleQueues[i10];
            sampleQueue.rewind();
            if (sampleQueue.advanceTo(j3, true, false) == -1) {
                z10 = false;
            }
            if (z10 || (!this.trackIsAudioVideoFlags[i10] && this.haveAudioVideoTracks)) {
                i10++;
            }
        }
        return false;
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.extractorHolder, this.loadCondition);
        if (this.prepared) {
            Assertions.checkState(isPendingReset());
            long j3 = this.durationUs;
            if (j3 != C.TIME_UNSET && this.pendingResetPositionUs >= j3) {
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
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j3) {
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
    public final void discardBuffer(long j3, boolean z10) {
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.sampleQueues[i10].discardTo(j3, z10, this.trackEnabledStates[i10]);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j3, SeekParameters seekParameters) {
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j3);
        return Util.resolveSeekPositionUs(j3, seekParameters, seekPoints.first.timeUs, seekPoints.second.timeUs);
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
            for (int i10 = 0; i10 < length; i10++) {
                if (this.trackIsAudioVideoFlags[i10]) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.sampleQueues[i10].getLargestQueuedTimestampUs());
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

    public final boolean isReady(int i10) {
        return !suppressRead() && (this.loadingFinished || this.sampleQueues[i10].hasNextSample());
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
    public final void prepare(MediaPeriod.Callback callback, long j3) {
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
    }

    public final int readData(int i10, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) {
        if (suppressRead()) {
            return -3;
        }
        int read = this.sampleQueues[i10].read(formatHolder, decoderInputBuffer, z10, this.loadingFinished, this.lastSeekPositionUs);
        if (read == -4) {
            maybeNotifyTrackFormat(i10);
        } else if (read == -3) {
            maybeStartDeferredRetry(i10);
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
    public final void reevaluateBuffer(long j3) {
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
    public final long seekToUs(long j3) {
        if (!this.seekMap.isSeekable()) {
            j3 = 0;
        }
        this.lastSeekPositionUs = j3;
        this.notifyDiscontinuity = false;
        if (!isPendingReset() && seekInsideBufferUs(j3)) {
            return j3;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j3;
        this.loadingFinished = false;
        if (this.loader.isLoading()) {
            this.loader.cancelLoading();
        } else {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
        }
        return j3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j3) {
        boolean z10;
        TrackSelection trackSelection;
        boolean z11;
        boolean z12;
        Assertions.checkState(this.prepared);
        int i10 = this.enabledTrackCount;
        int i11 = 0;
        for (int i12 = 0; i12 < trackSelectionArr.length; i12++) {
            SampleStream sampleStream = sampleStreamArr[i12];
            if (sampleStream != null && (trackSelectionArr[i12] == null || !zArr[i12])) {
                int i13 = ((SampleStreamImpl) sampleStream).track;
                Assertions.checkState(this.trackEnabledStates[i13]);
                this.enabledTrackCount--;
                this.trackEnabledStates[i13] = false;
                sampleStreamArr[i12] = null;
            }
        }
        if (!this.seenFirstTrackSelection ? j3 != 0 : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < trackSelectionArr.length; i14++) {
            if (sampleStreamArr[i14] == null && (trackSelection = trackSelectionArr[i14]) != null) {
                if (trackSelection.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Assertions.checkState(z11);
                if (trackSelection.getIndexInTrackGroup(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Assertions.checkState(z12);
                int indexOf = this.tracks.indexOf(trackSelection.getTrackGroup());
                Assertions.checkState(!this.trackEnabledStates[indexOf]);
                this.enabledTrackCount++;
                this.trackEnabledStates[indexOf] = true;
                sampleStreamArr[i14] = new SampleStreamImpl(indexOf);
                zArr2[i14] = true;
                if (!z10) {
                    SampleQueue sampleQueue = this.sampleQueues[indexOf];
                    sampleQueue.rewind();
                    if (sampleQueue.advanceTo(j3, true, true) == -1 && sampleQueue.getReadIndex() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
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
                while (i11 < length) {
                    sampleQueueArr[i11].discardToEnd();
                    i11++;
                }
                this.loader.cancelLoading();
            } else {
                SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i11 < length2) {
                    sampleQueueArr2[i11].reset();
                    i11++;
                }
            }
        } else if (z10) {
            j3 = seekToUs(j3);
            while (i11 < sampleStreamArr.length) {
                if (sampleStreamArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j3;
    }

    public final int skipData(int i10, long j3) {
        int i11 = 0;
        if (suppressRead()) {
            return 0;
        }
        SampleQueue sampleQueue = this.sampleQueues[i10];
        if (this.loadingFinished && j3 > sampleQueue.getLargestQueuedTimestampUs()) {
            i11 = sampleQueue.advanceToEnd();
        } else {
            int advanceTo = sampleQueue.advanceTo(j3, true, true);
            if (advanceTo != -1) {
                i11 = advanceTo;
            }
        }
        if (i11 > 0) {
            maybeNotifyTrackFormat(i10);
        } else {
            maybeStartDeferredRetry(i10);
        }
        return i11;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i10, int i11) {
        int length = this.sampleQueues.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.sampleQueueTrackIds[i12] == i10) {
                return this.sampleQueues[i12];
            }
        }
        SampleQueue sampleQueue = new SampleQueue(this.allocator);
        sampleQueue.setUpstreamFormatChangeListener(this);
        int i13 = length + 1;
        int[] copyOf = Arrays.copyOf(this.sampleQueueTrackIds, i13);
        this.sampleQueueTrackIds = copyOf;
        copyOf[length] = i10;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i13);
        this.sampleQueues = sampleQueueArr;
        sampleQueueArr[length] = sampleQueue;
        return sampleQueue;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final void onLoadCanceled(ExtractingLoadable extractingLoadable, long j3, long j10, boolean z10) {
        this.eventDispatcher.loadCanceled(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j3, j10, extractingLoadable.bytesLoaded);
        if (z10) {
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
    public final void onLoadCompleted(ExtractingLoadable extractingLoadable, long j3, long j10) {
        if (this.durationUs == C.TIME_UNSET) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs();
            long j11 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + DEFAULT_LAST_SAMPLE_DURATION_US;
            this.durationUs = j11;
            this.listener.onSourceInfoRefreshed(j11, this.seekMap.isSeekable());
        }
        this.eventDispatcher.loadCompleted(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j3, j10, extractingLoadable.bytesLoaded);
        copyLengthFromLoader(extractingLoadable);
        this.loadingFinished = true;
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final int onLoadError(ExtractingLoadable extractingLoadable, long j3, long j10, IOException iOException) {
        ExtractingLoadable extractingLoadable2;
        boolean z10;
        boolean isLoadableExceptionFatal = isLoadableExceptionFatal(iOException);
        this.eventDispatcher.loadError(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j3, j10, extractingLoadable.bytesLoaded, iOException, isLoadableExceptionFatal);
        copyLengthFromLoader(extractingLoadable);
        if (isLoadableExceptionFatal) {
            return 3;
        }
        int extractedSamplesCount = getExtractedSamplesCount();
        if (extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad) {
            extractingLoadable2 = extractingLoadable;
            z10 = true;
        } else {
            extractingLoadable2 = extractingLoadable;
            z10 = false;
        }
        if (configureRetry(extractingLoadable2, extractedSamplesCount)) {
            return z10 ? 1 : 0;
        }
        return 2;
    }
}

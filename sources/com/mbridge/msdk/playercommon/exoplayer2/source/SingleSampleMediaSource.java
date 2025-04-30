package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final long durationUs;
    private final Format format;
    private final int minLoadableRetryCount;
    private final Timeline timeline;
    private final boolean treatLoadErrorsAsEndOfStream;

    /* loaded from: classes3.dex */
    public interface EventListener {
        void onLoadError(int i9, IOException iOException);
    }

    /* loaded from: classes3.dex */
    public static final class EventListenerWrapper extends DefaultMediaSourceEventListener {
        private final EventListener eventListener;
        private final int eventSourceId;

        public EventListenerWrapper(EventListener eventListener, int i9) {
            this.eventListener = (EventListener) Assertions.checkNotNull(eventListener);
            this.eventSourceId = i9;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.DefaultMediaSourceEventListener, com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadError(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z8) {
            this.eventListener.onLoadError(this.eventSourceId, iOException);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        boolean z8;
        if (mediaPeriodId.periodIndex == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        return new SingleSampleMediaPeriod(this.dataSpec, this.dataSourceFactory, this.format, this.durationUs, this.minLoadableRetryCount, createEventDispatcher(mediaPeriodId), this.treatLoadErrorsAsEndOfStream);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z8) {
        refreshSourceInfo(this.timeline, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).release();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
    }

    /* loaded from: classes3.dex */
    public static final class Factory {
        private final DataSource.Factory dataSourceFactory;
        private boolean isCreateCalled;
        private int minLoadableRetryCount = 3;
        private Object tag;
        private boolean treatLoadErrorsAsEndOfStream;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = (DataSource.Factory) Assertions.checkNotNull(factory);
        }

        public final SingleSampleMediaSource createMediaSource(Uri uri, Format format, long j7) {
            this.isCreateCalled = true;
            return new SingleSampleMediaSource(uri, this.dataSourceFactory, format, j7, this.minLoadableRetryCount, this.treatLoadErrorsAsEndOfStream, this.tag);
        }

        public final Factory setMinLoadableRetryCount(int i9) {
            Assertions.checkState(!this.isCreateCalled);
            this.minLoadableRetryCount = i9;
            return this;
        }

        public final Factory setTag(Object obj) {
            Assertions.checkState(!this.isCreateCalled);
            this.tag = obj;
            return this;
        }

        public final Factory setTreatLoadErrorsAsEndOfStream(boolean z8) {
            Assertions.checkState(!this.isCreateCalled);
            this.treatLoadErrorsAsEndOfStream = z8;
            return this;
        }

        public final SingleSampleMediaSource createMediaSource(Uri uri, Format format, long j7, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            SingleSampleMediaSource createMediaSource = createMediaSource(uri, format, j7);
            if (handler != null && mediaSourceEventListener != null) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }
    }

    public SingleSampleMediaSource(Uri uri, DataSource.Factory factory, Format format, long j7) {
        this(uri, factory, format, j7, 3);
    }

    public SingleSampleMediaSource(Uri uri, DataSource.Factory factory, Format format, long j7, int i9) {
        this(uri, factory, format, j7, i9, false, null);
    }

    public SingleSampleMediaSource(Uri uri, DataSource.Factory factory, Format format, long j7, int i9, Handler handler, EventListener eventListener, int i10, boolean z8) {
        this(uri, factory, format, j7, i9, z8, null);
        if (handler == null || eventListener == null) {
            return;
        }
        addEventListener(handler, new EventListenerWrapper(eventListener, i10));
    }

    private SingleSampleMediaSource(Uri uri, DataSource.Factory factory, Format format, long j7, int i9, boolean z8, Object obj) {
        this.dataSourceFactory = factory;
        this.format = format;
        this.durationUs = j7;
        this.minLoadableRetryCount = i9;
        this.treatLoadErrorsAsEndOfStream = z8;
        this.dataSpec = new DataSpec(uri);
        this.timeline = new SinglePeriodTimeline(j7, true, false, obj);
    }
}

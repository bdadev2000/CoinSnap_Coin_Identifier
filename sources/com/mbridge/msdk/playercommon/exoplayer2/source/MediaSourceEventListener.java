package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface MediaSourceEventListener {

    /* loaded from: classes3.dex */
    public static final class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        /* loaded from: classes3.dex */
        public static final class ListenerAndHandler {
            public final Handler handler;
            public final MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private long adjustMediaTime(long j7) {
            long usToMs = C.usToMs(j7);
            if (usToMs == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            return this.mediaTimeOffsetMs + usToMs;
        }

        private void postOrRun(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public final void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            boolean z8;
            if (handler != null && mediaSourceEventListener != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public final void downstreamFormatChanged(int i9, Format format, int i10, Object obj, long j7) {
            downstreamFormatChanged(new MediaLoadData(1, i9, format, i10, obj, adjustMediaTime(j7), C.TIME_UNSET));
        }

        public final void loadCanceled(DataSpec dataSpec, int i9, long j7, long j9, long j10) {
            loadCanceled(dataSpec, i9, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j7, j9, j10);
        }

        public final void loadCompleted(DataSpec dataSpec, int i9, long j7, long j9, long j10) {
            loadCompleted(dataSpec, i9, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j7, j9, j10);
        }

        public final void loadError(DataSpec dataSpec, int i9, long j7, long j9, long j10, IOException iOException, boolean z8) {
            loadError(dataSpec, i9, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j7, j9, j10, iOException, z8);
        }

        public final void loadStarted(DataSpec dataSpec, int i9, long j7) {
            loadStarted(dataSpec, i9, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j7);
        }

        public final void mediaPeriodCreated() {
            boolean z8;
            if (this.mediaPeriodId != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onMediaPeriodCreated(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public final void mediaPeriodReleased() {
            boolean z8;
            if (this.mediaPeriodId != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onMediaPeriodReleased(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public final void readingStarted() {
            boolean z8;
            if (this.mediaPeriodId != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.7
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onReadingStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public final void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                if (next.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public final void upstreamDiscarded(int i9, long j7, long j9) {
            upstreamDiscarded(new MediaLoadData(1, i9, null, 3, null, adjustMediaTime(j7), adjustMediaTime(j9)));
        }

        public final EventDispatcher withParameters(int i9, MediaSource.MediaPeriodId mediaPeriodId, long j7) {
            return new EventDispatcher(this.listenerAndHandlers, i9, mediaPeriodId, j7);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i9, MediaSource.MediaPeriodId mediaPeriodId, long j7) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i9;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaTimeOffsetMs = j7;
        }

        public final void loadCanceled(DataSpec dataSpec, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10, long j11, long j12) {
            loadCanceled(new LoadEventInfo(dataSpec, j10, j11, j12), new MediaLoadData(i9, i10, format, i11, obj, adjustMediaTime(j7), adjustMediaTime(j9)));
        }

        public final void loadCompleted(DataSpec dataSpec, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10, long j11, long j12) {
            loadCompleted(new LoadEventInfo(dataSpec, j10, j11, j12), new MediaLoadData(i9, i10, format, i11, obj, adjustMediaTime(j7), adjustMediaTime(j9)));
        }

        public final void loadError(DataSpec dataSpec, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10, long j11, long j12, IOException iOException, boolean z8) {
            loadError(new LoadEventInfo(dataSpec, j10, j11, j12), new MediaLoadData(i9, i10, format, i11, obj, adjustMediaTime(j7), adjustMediaTime(j9)), iOException, z8);
        }

        public final void loadStarted(DataSpec dataSpec, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10) {
            loadStarted(new LoadEventInfo(dataSpec, j10, 0L, 0L), new MediaLoadData(i9, i10, format, i11, obj, adjustMediaTime(j7), adjustMediaTime(j9)));
        }

        public final void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.9
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public final void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.8
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onUpstreamDiscarded(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public final void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public final void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public final void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z8) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.6
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z8);
                    }
                });
            }
        }

        public final void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadEventInfo {
        public final long bytesLoaded;
        public final DataSpec dataSpec;
        public final long elapsedRealtimeMs;
        public final long loadDurationMs;

        public LoadEventInfo(DataSpec dataSpec, long j7, long j9, long j10) {
            this.dataSpec = dataSpec;
            this.elapsedRealtimeMs = j7;
            this.loadDurationMs = j9;
            this.bytesLoaded = j10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class MediaLoadData {
        public final int dataType;
        public final long mediaEndTimeMs;
        public final long mediaStartTimeMs;
        public final Format trackFormat;
        public final Object trackSelectionData;
        public final int trackSelectionReason;
        public final int trackType;

        public MediaLoadData(int i9, int i10, Format format, int i11, Object obj, long j7, long j9) {
            this.dataType = i9;
            this.trackType = i10;
            this.trackFormat = format;
            this.trackSelectionReason = i11;
            this.trackSelectionData = obj;
            this.mediaStartTimeMs = j7;
            this.mediaEndTimeMs = j9;
        }
    }

    void onDownstreamFormatChanged(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int i9, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int i9, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int i9, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z8);

    void onLoadStarted(int i9, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onMediaPeriodCreated(int i9, MediaSource.MediaPeriodId mediaPeriodId);

    void onMediaPeriodReleased(int i9, MediaSource.MediaPeriodId mediaPeriodId);

    void onReadingStarted(int i9, MediaSource.MediaPeriodId mediaPeriodId);

    void onUpstreamDiscarded(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}

package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, MediaSourceAndListener> childSources = new HashMap<>();
    private Handler eventHandler;
    private ExoPlayer player;

    /* loaded from: classes4.dex */
    public final class ForwardingEventListener implements MediaSourceEventListener {
        private MediaSourceEventListener.EventDispatcher eventDispatcher;

        /* renamed from: id, reason: collision with root package name */
        private final T f14733id;

        public ForwardingEventListener(T t5) {
            this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(null);
            this.f14733id = t5;
        }

        private boolean maybeUpdateEventDispatcher(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2;
            if (mediaPeriodId != null) {
                mediaPeriodId2 = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.f14733id, mediaPeriodId);
                if (mediaPeriodId2 == null) {
                    return false;
                }
            } else {
                mediaPeriodId2 = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.f14733id, i10);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodId2)) {
                this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodId2, 0L);
                return true;
            }
            return true;
        }

        private MediaSourceEventListener.MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener.MediaLoadData mediaLoadData) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f14733id, mediaLoadData.mediaStartTimeMs);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f14733id, mediaLoadData.mediaEndTimeMs);
            if (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) {
                return mediaLoadData;
            }
            return new MediaSourceEventListener.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onDownstreamFormatChanged(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadCanceled(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadCompleted(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadError(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData), iOException, z10);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onMediaPeriodCreated(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.mediaPeriodCreated();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onMediaPeriodReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.mediaPeriodReleased();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onReadingStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.readingStarted();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class MediaSourceAndListener {
        public final MediaSourceEventListener eventListener;
        public final MediaSource.SourceInfoRefreshListener listener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener, MediaSourceEventListener mediaSourceEventListener) {
            this.mediaSource = mediaSource;
            this.listener = sourceInfoRefreshListener;
            this.eventListener = mediaSourceEventListener;
        }
    }

    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(T t5, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(T t5, long j3) {
        return j3;
    }

    public int getWindowIndexForChildWindowIndex(T t5, int i10) {
        return i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<MediaSourceAndListener> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    public abstract void onChildSourceInfoRefreshed(T t5, MediaSource mediaSource, Timeline timeline, Object obj);

    public final void prepareChildSource(final T t5, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t5));
        MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener = new MediaSource.SourceInfoRefreshListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource.SourceInfoRefreshListener
            public void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline, Object obj) {
                CompositeMediaSource.this.onChildSourceInfoRefreshed(t5, mediaSource2, timeline, obj);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(t5);
        this.childSources.put(t5, new MediaSourceAndListener(mediaSource, sourceInfoRefreshListener, forwardingEventListener));
        mediaSource.addEventListener(this.eventHandler, forwardingEventListener);
        mediaSource.prepareSource(this.player, false, sourceInfoRefreshListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z10) {
        this.player = exoPlayer;
        this.eventHandler = new Handler();
    }

    public final void releaseChildSource(T t5) {
        MediaSourceAndListener remove = this.childSources.remove(t5);
        remove.mediaSource.releaseSource(remove.listener);
        remove.mediaSource.removeEventListener(remove.eventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.listener);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
        this.player = null;
    }
}

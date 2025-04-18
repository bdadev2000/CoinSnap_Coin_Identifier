package com.mbridge.msdk.playercommon.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.DeferredMediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsLoader;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import eb.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final String TAG = "AdsMediaSource";
    private long[][] adDurationsUs;
    private MediaSource[][] adGroupMediaSources;
    private final MediaSourceFactory adMediaSourceFactory;
    private AdPlaybackState adPlaybackState;
    private final ViewGroup adUiViewGroup;
    private final AdsLoader adsLoader;
    private ComponentListener componentListener;
    private Object contentManifest;
    private final MediaSource contentMediaSource;
    private Timeline contentTimeline;
    private final Map<MediaSource, List<DeferredMediaPeriod>> deferredMediaPeriodByAdMediaSource;
    private final Handler eventHandler;
    private final EventListener eventListener;
    private final Handler mainHandler;
    private final Timeline.Period period;

    /* loaded from: classes4.dex */
    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* loaded from: classes4.dex */
        public @interface Type {
        }

        private AdLoadException(int i10, Exception exc) {
            super(exc);
            this.type = i10;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i10) {
            return new AdLoadException(1, new IOException(j.i("Failed to load ad group ", i10), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public final RuntimeException getRuntimeExceptionForUnexpected() {
            boolean z10;
            if (this.type == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkState(z10);
            return (RuntimeException) getCause();
        }
    }

    /* loaded from: classes4.dex */
    public final class AdPrepareErrorListener implements DeferredMediaPeriod.PrepareErrorListener {
        private final int adGroupIndex;
        private final int adIndexInAdGroup;
        private final Uri adUri;

        public AdPrepareErrorListener(Uri uri, int i10, int i11) {
            this.adUri = uri;
            this.adGroupIndex = i10;
            this.adIndexInAdGroup = i11;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener
        public final void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new DataSpec(this.adUri), 6, -1L, 0L, 0L, AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.AdPrepareErrorListener.1
                @Override // java.lang.Runnable
                public void run() {
                    AdsMediaSource.this.adsLoader.handlePrepareError(AdPrepareErrorListener.this.adGroupIndex, AdPrepareErrorListener.this.adIndexInAdGroup, iOException);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler = new Handler();
        private volatile boolean released;

        public ComponentListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsLoader.EventListener
        public final void onAdClicked() {
            if (!this.released && AdsMediaSource.this.eventHandler != null && AdsMediaSource.this.eventListener != null) {
                AdsMediaSource.this.eventHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.ComponentListener.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!ComponentListener.this.released) {
                            AdsMediaSource.this.eventListener.onAdClicked();
                        }
                    }
                });
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsLoader.EventListener
        public final void onAdLoadError(final AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.released) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(dataSpec, 6, -1L, 0L, 0L, adLoadException, true);
            if (AdsMediaSource.this.eventHandler != null && AdsMediaSource.this.eventListener != null) {
                AdsMediaSource.this.eventHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.ComponentListener.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!ComponentListener.this.released) {
                            if (adLoadException.type == 3) {
                                AdsMediaSource.this.eventListener.onInternalAdLoadError(adLoadException.getRuntimeExceptionForUnexpected());
                            } else {
                                AdsMediaSource.this.eventListener.onAdLoadError(adLoadException);
                            }
                        }
                    }
                });
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsLoader.EventListener
        public final void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (this.released) {
                return;
            }
            this.playerHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.ComponentListener.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ComponentListener.this.released) {
                        return;
                    }
                    AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
                }
            });
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsLoader.EventListener
        public final void onAdTapped() {
            if (!this.released && AdsMediaSource.this.eventHandler != null && AdsMediaSource.this.eventListener != null) {
                AdsMediaSource.this.eventHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.ComponentListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!ComponentListener.this.released) {
                            AdsMediaSource.this.eventListener.onAdTapped();
                        }
                    }
                });
            }
        }

        public final void release() {
            this.released = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }
    }

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onAdClicked();

        void onAdLoadError(IOException iOException);

        void onAdTapped();

        void onInternalAdLoadError(RuntimeException runtimeException);
    }

    /* loaded from: classes4.dex */
    public interface MediaSourceFactory {
        MediaSource createMediaSource(Uri uri);

        int[] getSupportedTypes();
    }

    public AdsMediaSource(MediaSource mediaSource, DataSource.Factory factory, AdsLoader adsLoader, ViewGroup viewGroup) {
        this(mediaSource, new ExtractorMediaSource.Factory(factory), adsLoader, viewGroup, (Handler) null, (EventListener) null);
    }

    private void maybeUpdateSourceInfo() {
        Timeline singlePeriodAdTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState != null && this.contentTimeline != null) {
            AdPlaybackState withAdDurationsUs = adPlaybackState.withAdDurationsUs(this.adDurationsUs);
            this.adPlaybackState = withAdDurationsUs;
            if (withAdDurationsUs.adGroupCount == 0) {
                singlePeriodAdTimeline = this.contentTimeline;
            } else {
                singlePeriodAdTimeline = new SinglePeriodAdTimeline(this.contentTimeline, this.adPlaybackState);
            }
            refreshSourceInfo(singlePeriodAdTimeline, this.contentManifest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        if (this.adPlaybackState == null) {
            MediaSource[][] mediaSourceArr = new MediaSource[adPlaybackState.adGroupCount];
            this.adGroupMediaSources = mediaSourceArr;
            Arrays.fill(mediaSourceArr, new MediaSource[0]);
            long[][] jArr = new long[adPlaybackState.adGroupCount];
            this.adDurationsUs = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateSourceInfo();
    }

    private void onAdSourceInfoRefreshed(MediaSource mediaSource, int i10, int i11, Timeline timeline) {
        boolean z10 = true;
        if (timeline.getPeriodCount() != 1) {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.adDurationsUs[i10][i11] = timeline.getPeriod(0, this.period).getDurationUs();
        if (this.deferredMediaPeriodByAdMediaSource.containsKey(mediaSource)) {
            List<DeferredMediaPeriod> list = this.deferredMediaPeriodByAdMediaSource.get(mediaSource);
            for (int i12 = 0; i12 < list.size(); i12++) {
                list.get(i12).createPeriod();
            }
            this.deferredMediaPeriodByAdMediaSource.remove(mediaSource);
        }
        maybeUpdateSourceInfo();
    }

    private void onContentSourceInfoRefreshed(Timeline timeline, Object obj) {
        this.contentTimeline = timeline;
        this.contentManifest = obj;
        maybeUpdateSourceInfo();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        if (this.adPlaybackState.adGroupCount > 0 && mediaPeriodId.isAd()) {
            int i10 = mediaPeriodId.adGroupIndex;
            int i11 = mediaPeriodId.adIndexInAdGroup;
            Uri uri = this.adPlaybackState.adGroups[i10].uris[i11];
            if (this.adGroupMediaSources[i10].length <= i11) {
                MediaSource createMediaSource = this.adMediaSourceFactory.createMediaSource(uri);
                MediaSource[][] mediaSourceArr = this.adGroupMediaSources;
                MediaSource[] mediaSourceArr2 = mediaSourceArr[i10];
                int length = mediaSourceArr2.length;
                if (i11 >= length) {
                    int i12 = i11 + 1;
                    mediaSourceArr[i10] = (MediaSource[]) Arrays.copyOf(mediaSourceArr2, i12);
                    long[][] jArr = this.adDurationsUs;
                    jArr[i10] = Arrays.copyOf(jArr[i10], i12);
                    Arrays.fill(this.adDurationsUs[i10], length, i12, C.TIME_UNSET);
                }
                this.adGroupMediaSources[i10][i11] = createMediaSource;
                this.deferredMediaPeriodByAdMediaSource.put(createMediaSource, new ArrayList());
                prepareChildSource(mediaPeriodId, createMediaSource);
            }
            MediaSource mediaSource = this.adGroupMediaSources[i10][i11];
            DeferredMediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(mediaSource, new MediaSource.MediaPeriodId(0, mediaPeriodId.windowSequenceNumber), allocator);
            deferredMediaPeriod.setPrepareErrorListener(new AdPrepareErrorListener(uri, i10, i11));
            List<DeferredMediaPeriod> list = this.deferredMediaPeriodByAdMediaSource.get(mediaSource);
            if (list == null) {
                deferredMediaPeriod.createPeriod();
            } else {
                list.add(deferredMediaPeriod);
            }
            return deferredMediaPeriod;
        }
        DeferredMediaPeriod deferredMediaPeriod2 = new DeferredMediaPeriod(this.contentMediaSource, mediaPeriodId, allocator);
        deferredMediaPeriod2.createPeriod();
        return deferredMediaPeriod2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(final ExoPlayer exoPlayer, boolean z10) {
        super.prepareSourceInternal(exoPlayer, z10);
        Assertions.checkArgument(z10);
        final ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        prepareChildSource(new MediaSource.MediaPeriodId(0), this.contentMediaSource);
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.1
            @Override // java.lang.Runnable
            public void run() {
                AdsMediaSource.this.adsLoader.attachPlayer(exoPlayer, componentListener, AdsMediaSource.this.adUiViewGroup);
            }
        });
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        DeferredMediaPeriod deferredMediaPeriod = (DeferredMediaPeriod) mediaPeriod;
        List<DeferredMediaPeriod> list = this.deferredMediaPeriodByAdMediaSource.get(deferredMediaPeriod.mediaSource);
        if (list != null) {
            list.remove(deferredMediaPeriod);
        }
        deferredMediaPeriod.releasePeriod();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.componentListener.release();
        this.componentListener = null;
        this.deferredMediaPeriodByAdMediaSource.clear();
        this.contentTimeline = null;
        this.contentManifest = null;
        this.adPlaybackState = null;
        this.adGroupMediaSources = new MediaSource[0];
        this.adDurationsUs = new long[0];
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.2
            @Override // java.lang.Runnable
            public void run() {
                AdsMediaSource.this.adsLoader.detachPlayer();
            }
        });
    }

    public AdsMediaSource(MediaSource mediaSource, MediaSourceFactory mediaSourceFactory, AdsLoader adsLoader, ViewGroup viewGroup) {
        this(mediaSource, mediaSourceFactory, adsLoader, viewGroup, (Handler) null, (EventListener) null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline, Object obj) {
        if (mediaPeriodId.isAd()) {
            onAdSourceInfoRefreshed(mediaSource, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, timeline);
        } else {
            onContentSourceInfoRefreshed(timeline, obj);
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSource.Factory factory, AdsLoader adsLoader, ViewGroup viewGroup, Handler handler, EventListener eventListener) {
        this(mediaSource, new ExtractorMediaSource.Factory(factory), adsLoader, viewGroup, handler, eventListener);
    }

    public AdsMediaSource(MediaSource mediaSource, MediaSourceFactory mediaSourceFactory, AdsLoader adsLoader, ViewGroup viewGroup, Handler handler, EventListener eventListener) {
        this.contentMediaSource = mediaSource;
        this.adMediaSourceFactory = mediaSourceFactory;
        this.adsLoader = adsLoader;
        this.adUiViewGroup = viewGroup;
        this.eventHandler = handler;
        this.eventListener = eventListener;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.deferredMediaPeriodByAdMediaSource = new HashMap();
        this.period = new Timeline.Period();
        this.adGroupMediaSources = new MediaSource[0];
        this.adDurationsUs = new long[0];
        adsLoader.setSupportedContentTypes(mediaSourceFactory.getSupportedTypes());
    }
}

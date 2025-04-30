package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    private static final int PERIOD_COUNT_UNSET = -1;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaSource[] mediaSources;
    private IllegalMergeException mergeError;
    private final ArrayList<MediaSource> pendingTimelineSources;
    private int periodCount;
    private Object primaryManifest;
    private Timeline primaryTimeline;

    /* loaded from: classes3.dex */
    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        /* loaded from: classes3.dex */
        public @interface Reason {
        }

        public IllegalMergeException(int i9) {
            this.reason = i9;
        }
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        this(new DefaultCompositeSequenceableLoaderFactory(), mediaSourceArr);
    }

    private IllegalMergeException checkTimelineMerges(Timeline timeline) {
        if (this.periodCount == -1) {
            this.periodCount = timeline.getPeriodCount();
            return null;
        }
        if (timeline.getPeriodCount() != this.periodCount) {
            return new IllegalMergeException(0);
        }
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        int length = this.mediaSources.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        for (int i9 = 0; i9 < length; i9++) {
            mediaPeriodArr[i9] = this.mediaSources[i9].createPeriod(mediaPeriodId, allocator);
        }
        return new MergingMediaPeriod(this.compositeSequenceableLoaderFactory, mediaPeriodArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException == null) {
            super.maybeThrowSourceInfoRefreshError();
            return;
        }
        throw illegalMergeException;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z8) {
        super.prepareSourceInternal(exoPlayer, z8);
        for (int i9 = 0; i9 < this.mediaSources.length; i9++) {
            prepareChildSource(Integer.valueOf(i9), this.mediaSources[i9]);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        int i9 = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.mediaSources;
            if (i9 < mediaSourceArr.length) {
                mediaSourceArr[i9].releasePeriod(mergingMediaPeriod.periods[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.primaryTimeline = null;
        this.primaryManifest = null;
        this.periodCount = -1;
        this.mergeError = null;
        this.pendingTimelineSources.clear();
        Collections.addAll(this.pendingTimelineSources, this.mediaSources);
    }

    public MergingMediaSource(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaSource... mediaSourceArr) {
        this.mediaSources = mediaSourceArr;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.pendingTimelineSources = new ArrayList<>(Arrays.asList(mediaSourceArr));
        this.periodCount = -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Integer num, MediaSource mediaSource, Timeline timeline, Object obj) {
        if (this.mergeError == null) {
            this.mergeError = checkTimelineMerges(timeline);
        }
        if (this.mergeError != null) {
            return;
        }
        this.pendingTimelineSources.remove(mediaSource);
        if (mediaSource == this.mediaSources[0]) {
            this.primaryTimeline = timeline;
            this.primaryManifest = obj;
        }
        if (this.pendingTimelineSources.isEmpty()) {
            refreshSourceInfo(this.primaryTimeline, this.primaryManifest);
        }
    }
}

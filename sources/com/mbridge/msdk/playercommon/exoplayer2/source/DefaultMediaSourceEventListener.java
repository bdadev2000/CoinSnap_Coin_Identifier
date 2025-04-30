package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class DefaultMediaSourceEventListener implements MediaSourceEventListener {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onLoadCanceled(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onLoadCompleted(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z8) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onLoadStarted(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onMediaPeriodCreated(int i9, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onMediaPeriodReleased(int i9, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onReadingStarted(int i9, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int i9, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }
}

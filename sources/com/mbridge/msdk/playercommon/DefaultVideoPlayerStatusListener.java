package com.mbridge.msdk.playercommon;

import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class DefaultVideoPlayerStatusListener implements VideoPlayerStatusListener {
    protected static final String TAG = "DefaultVideoPlayerStatusListener";

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        ad.a(TAG, "OnBufferingEnd");
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        e.A("OnBufferingStart:", str, TAG);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        ad.a(TAG, "onPlayCompleted");
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        e.A("onPlayError:", str, TAG);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        ad.a(TAG, "onPlayProgress:" + i10 + ",allDuration:" + i11);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        ad.a(TAG, "onPlayProgressMS:");
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        e.A("onPlaySetDataSourceError:", str, TAG);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        e.y("onPlayStarted:", i10, TAG);
    }
}

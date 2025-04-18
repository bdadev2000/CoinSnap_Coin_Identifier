package com.mbridge.msdk.interstitialvideo.a;

import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* loaded from: classes4.dex */
public final class a implements InterVideoOutListener {
    private InterstitialVideoListener a;

    /* renamed from: b, reason: collision with root package name */
    private String f13710b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13711c;

    public a(InterstitialVideoListener interstitialVideoListener, String str, boolean z10) {
        this.a = interstitialVideoListener;
        this.f13710b = str;
        this.f13711c = z10;
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onAdCloseWithIVReward(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onShowFail(b bVar, MBridgeIds mBridgeIds, String str) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoAdClicked(boolean z10, MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }
}

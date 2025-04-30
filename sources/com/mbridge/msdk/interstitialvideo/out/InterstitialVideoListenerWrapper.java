package com.mbridge.msdk.interstitialvideo.out;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* loaded from: classes3.dex */
public class InterstitialVideoListenerWrapper implements RewardVideoListener {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialVideoListener f16167a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public InterstitialVideoListenerWrapper(InterstitialVideoListener interstitialVideoListener) {
        this.f16167a = interstitialVideoListener;
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onAdClose(mBridgeIds, rewardInfo);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdCloseWithIVReward(final MBridgeIds mBridgeIds, final boolean z8, final int i9) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onAdCloseWithIVReward(mBridgeIds, new RewardInfo(z8, i9));
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdShow(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onAdShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onEndcardShow(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onEndcardShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onLoadSuccess(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onLoadSuccess(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onShowFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onVideoAdClicked(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoComplete(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onVideoComplete(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onVideoLoadFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f16167a != null) {
                    InterstitialVideoListenerWrapper.this.f16167a.onVideoLoadSuccess(mBridgeIds);
                }
            }
        });
    }
}

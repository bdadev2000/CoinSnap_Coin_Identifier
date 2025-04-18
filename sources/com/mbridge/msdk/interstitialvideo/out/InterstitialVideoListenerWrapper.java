package com.mbridge.msdk.interstitialvideo.out;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* loaded from: classes4.dex */
public class InterstitialVideoListenerWrapper implements RewardVideoListener {
    private final InterstitialVideoListener a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f13712b = new Handler(Looper.getMainLooper());

    public InterstitialVideoListenerWrapper(InterstitialVideoListener interstitialVideoListener) {
        this.a = interstitialVideoListener;
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onAdClose(mBridgeIds, rewardInfo);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdCloseWithIVReward(final MBridgeIds mBridgeIds, final boolean z10, final int i10) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onAdCloseWithIVReward(mBridgeIds, new RewardInfo(z10, i10));
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdShow(final MBridgeIds mBridgeIds) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onAdShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onEndcardShow(final MBridgeIds mBridgeIds) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onEndcardShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onLoadSuccess(final MBridgeIds mBridgeIds) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onLoadSuccess(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onShowFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onVideoAdClicked(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoComplete(final MBridgeIds mBridgeIds) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onVideoComplete(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onVideoLoadFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
        this.f13712b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.a != null) {
                    InterstitialVideoListenerWrapper.this.a.onVideoLoadSuccess(mBridgeIds);
                }
            }
        });
    }
}

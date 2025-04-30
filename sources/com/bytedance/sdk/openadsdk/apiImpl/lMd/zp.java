package com.bytedance.sdk.openadsdk.apiImpl.lMd;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class zp implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener zp;

    public zp(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.zp = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public void onError(final int i9, final String str) {
        if (this.zp == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.lMd.zp.1
            @Override // java.lang.Runnable
            public void run() {
                if (zp.this.zp != null) {
                    zp.this.zp.onError(i9, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.lMd.zp.2
            @Override // java.lang.Runnable
            public void run() {
                if (zp.this.zp != null) {
                    zp.this.zp.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}

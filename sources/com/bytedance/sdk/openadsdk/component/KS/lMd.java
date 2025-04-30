package com.bytedance.sdk.openadsdk.component.KS;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class lMd implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener zp;

    public lMd(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.zp = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public void onError(final int i9, final String str) {
        if (this.zp != null) {
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.KS.lMd.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = lMd.this.zp;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i9, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.zp != null) {
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.KS.lMd.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = lMd.this.zp;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}

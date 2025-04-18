package com.bytedance.sdk.openadsdk.component.tN;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class Sg implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener YFl;

    public Sg(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.YFl = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.YFl != null) {
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.tN.Sg.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = Sg.this.YFl;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public void onError(final int i10, final String str) {
        if (this.YFl != null) {
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.tN.Sg.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = Sg.this.YFl;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}

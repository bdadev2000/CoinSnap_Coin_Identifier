package com.bytedance.sdk.openadsdk.YFl.tN;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class YFl implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener YFl;

    public YFl(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.YFl = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public void onError(final int i10, final String str) {
        if (this.YFl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.tN.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.tN.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}

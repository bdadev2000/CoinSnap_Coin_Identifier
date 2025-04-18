package com.bytedance.sdk.openadsdk.component.tN;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.sdk.openadsdk.YFl.tN.Sg {
    private final PAGInterstitialAdInteractionListener YFl;

    public YFl(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.YFl = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.tN.Sg
    public void Sg() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.YFl;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.tN.Sg
    public void YFl() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.YFl;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.YFl;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}

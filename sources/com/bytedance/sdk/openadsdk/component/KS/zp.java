package com.bytedance.sdk.openadsdk.component.KS;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* loaded from: classes.dex */
public class zp implements com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd {
    private final PAGInterstitialAdInteractionListener zp;

    public zp(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.zp = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd
    public void lMd() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.zp;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.zp;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd
    public void zp() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.zp;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }
}

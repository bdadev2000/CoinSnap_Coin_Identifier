package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;

/* loaded from: classes.dex */
public class lMd implements PAGBannerAdWrapperListener {
    private final PAGBannerAdInteractionListener zp;

    public lMd(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        this.zp = pAGBannerAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.zp;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.zp;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i9) {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.zp;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i9) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view, float f9, float f10) {
    }
}

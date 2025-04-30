package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class COT implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener zp;

    public COT(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.zp = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public void onError(final int i9, final String str) {
        if (this.zp == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.COT.1
            @Override // java.lang.Runnable
            public void run() {
                COT.this.zp.onError(i9, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.COT.2
            @Override // java.lang.Runnable
            public void run() {
                COT.this.zp.onAdLoaded(pAGNativeAd);
            }
        });
    }
}

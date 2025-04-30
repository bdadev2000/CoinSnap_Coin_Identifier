package com.bytedance.sdk.openadsdk.apiImpl.zp;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class zp implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener zp;

    public zp(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.zp = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public void onError(final int i9, final String str) {
        if (this.zp == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.zp.zp.1
            @Override // java.lang.Runnable
            public void run() {
                zp.this.zp.onError(i9, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.zp.zp.2
            @Override // java.lang.Runnable
            public void run() {
                zp.this.zp.onAdLoaded(pAGBannerAd);
            }
        });
    }
}

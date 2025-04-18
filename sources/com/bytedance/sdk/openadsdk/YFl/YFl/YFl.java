package com.bytedance.sdk.openadsdk.YFl.YFl;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class YFl implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener YFl;

    public YFl(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.YFl = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public void onError(final int i10, final String str) {
        if (this.YFl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.YFl.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                YFl.this.YFl.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.YFl.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                YFl.this.YFl.onAdLoaded(pAGBannerAd);
            }
        });
    }
}

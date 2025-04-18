package com.bytedance.sdk.openadsdk.YFl.Sg;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class wN implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener YFl;

    public wN(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.YFl = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public void onError(final int i10, final String str) {
        if (this.YFl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.wN.1
            @Override // java.lang.Runnable
            public void run() {
                wN.this.YFl.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.wN.2
            @Override // java.lang.Runnable
            public void run() {
                wN.this.YFl.onAdLoaded(pAGNativeAd);
            }
        });
    }
}

package com.bytedance.sdk.openadsdk.YFl.Sg;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class DSW implements vc {
    private final PAGNativeAdInteractionListener YFl;

    public DSW(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.YFl = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.Sg.vc
    public boolean Sg() {
        return this.YFl != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.DSW.1
            @Override // java.lang.Runnable
            public void run() {
                if (DSW.this.YFl != null) {
                    DSW.this.YFl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.Sg.vc
    public void YFl(PAGNativeAd pAGNativeAd) {
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.DSW.2
            @Override // java.lang.Runnable
            public void run() {
                if (DSW.this.YFl != null) {
                    DSW.this.YFl.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.Sg.vc
    public void YFl() {
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.DSW.3
            @Override // java.lang.Runnable
            public void run() {
                if (DSW.this.YFl != null) {
                    DSW.this.YFl.onAdDismissed();
                }
            }
        });
    }
}

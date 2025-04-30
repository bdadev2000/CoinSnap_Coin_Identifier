package com.bytedance.sdk.openadsdk.apiImpl.jU;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class lMd implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener zp;

    public lMd(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.zp = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public void onError(final int i9, final String str) {
        if (this.zp == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.jU.lMd.1
            @Override // java.lang.Runnable
            public void run() {
                if (lMd.this.zp != null) {
                    lMd.this.zp.onError(i9, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.jU.lMd.2
            @Override // java.lang.Runnable
            public void run() {
                if (lMd.this.zp != null) {
                    lMd.this.zp.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}

package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class DSW implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener YFl;

    public DSW(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.YFl = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.YFl != null) {
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.DSW.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = DSW.this.YFl;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public void onError(final int i10, final String str) {
        if (this.YFl != null) {
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.DSW.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = DSW.this.YFl;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}

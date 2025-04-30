package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class QR implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener zp;

    public QR(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.zp = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public void onError(final int i9, final String str) {
        if (this.zp != null) {
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.QR.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = QR.this.zp;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i9, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.zp != null) {
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.QR.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = QR.this.zp;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}

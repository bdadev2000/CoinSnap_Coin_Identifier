package com.bytedance.sdk.openadsdk.YFl.wN;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class Sg implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener YFl;

    public Sg(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.YFl = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public void onError(final int i10, final String str) {
        if (this.YFl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.wN.Sg.1
            @Override // java.lang.Runnable
            public void run() {
                if (Sg.this.YFl != null) {
                    Sg.this.YFl.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.wN.Sg.2
            @Override // java.lang.Runnable
            public void run() {
                if (Sg.this.YFl != null) {
                    Sg.this.YFl.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}

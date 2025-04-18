package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;

/* loaded from: classes.dex */
public class NjR implements com.bytedance.sdk.openadsdk.YFl.wN.YFl {
    private final PAGRewardedAdInteractionCallback Sg;
    private final PAGRewardedAdInteractionListener YFl;

    public NjR(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.YFl = pAGRewardedAdInteractionListener;
        this.Sg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.wN.YFl
    public void Sg() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.YFl;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.Sg;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.wN.YFl
    public void YFl() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.YFl;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.Sg;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.YFl;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.Sg;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    public NjR(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.Sg = pAGRewardedAdInteractionCallback;
        this.YFl = null;
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.wN.YFl
    public void YFl(boolean z10, int i10, String str, int i11, String str2) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.YFl;
        if (pAGRewardedAdInteractionListener != null) {
            if (z10) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i10, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i11, str2);
                return;
            }
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.Sg;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z10) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i10, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i11, str2));
            }
        }
    }
}

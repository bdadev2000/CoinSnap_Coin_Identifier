package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;

/* loaded from: classes.dex */
public class YW implements com.bytedance.sdk.openadsdk.apiImpl.jU.zp {
    private final PAGRewardedAdInteractionCallback lMd;
    private final PAGRewardedAdInteractionListener zp;

    public YW(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.zp = pAGRewardedAdInteractionListener;
        this.lMd = null;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.jU.zp
    public void lMd() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zp;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lMd;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zp;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lMd;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.jU.zp
    public void zp() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zp;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lMd;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    public YW(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.lMd = pAGRewardedAdInteractionCallback;
        this.zp = null;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.jU.zp
    public void zp(boolean z8, int i9, String str, int i10, String str2) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zp;
        if (pAGRewardedAdInteractionListener != null) {
            if (z8) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i9, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i10, str2);
                return;
            }
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lMd;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z8) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i9, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i10, str2));
            }
        }
    }
}

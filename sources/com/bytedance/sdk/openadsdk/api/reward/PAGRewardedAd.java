package com.bytedance.sdk.openadsdk.api.reward;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.lMd;

/* loaded from: classes.dex */
public abstract class PAGRewardedAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String str, @NonNull PAGRewardedRequest pAGRewardedRequest, @NonNull PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        ISDKTypeFactory zp = lMd.zp(pAGRewardedAdLoadListener);
        if (zp != null) {
            zp.createADTypeLoaderFactory(str).createRewardAdLoader().loadAd(str, pAGRewardedRequest, pAGRewardedAdLoadListener);
        }
    }

    public abstract void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener);

    public abstract void show(@Nullable Activity activity);

    public static void loadAd(@NonNull String str, @NonNull PAGRewardedRequest pAGRewardedRequest, @NonNull final PAGRewardedAdLoadCallback pAGRewardedAdLoadCallback) {
        loadAd(str, pAGRewardedRequest, new PAGRewardedAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
            public void onError(int i9, String str2) {
                PAGRewardedAdLoadCallback.this.onError(new PAGErrorModel(i9, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                PAGRewardedAdLoadCallback.this.onAdLoaded(pAGRewardedAd);
            }
        });
    }
}

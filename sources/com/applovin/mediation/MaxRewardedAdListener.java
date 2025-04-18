package com.applovin.mediation;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface MaxRewardedAdListener extends MaxAdListener {
    @Deprecated
    default void onRewardedVideoCompleted(@NonNull MaxAd maxAd) {
    }

    @Deprecated
    default void onRewardedVideoStarted(@NonNull MaxAd maxAd) {
    }

    void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward);
}

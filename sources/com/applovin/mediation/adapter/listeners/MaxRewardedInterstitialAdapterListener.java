package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

/* loaded from: classes.dex */
public interface MaxRewardedInterstitialAdapterListener extends MaxAdapterListener {
    void onRewardedInterstitialAdClicked();

    void onRewardedInterstitialAdClicked(@Nullable Bundle bundle);

    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onRewardedInterstitialAdDisplayed();

    void onRewardedInterstitialAdDisplayed(@Nullable Bundle bundle);

    void onRewardedInterstitialAdHidden();

    void onRewardedInterstitialAdHidden(@Nullable Bundle bundle);

    void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdLoaded();

    void onRewardedInterstitialAdLoaded(@Nullable Bundle bundle);

    @Deprecated
    default void onRewardedInterstitialAdVideoCompleted() {
    }

    @Deprecated
    default void onRewardedInterstitialAdVideoStarted() {
    }

    void onUserRewarded(MaxReward maxReward);

    void onUserRewarded(MaxReward maxReward, @Nullable Bundle bundle);
}

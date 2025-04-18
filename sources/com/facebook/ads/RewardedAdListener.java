package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes4.dex */
public interface RewardedAdListener {
    void onRewardedAdCompleted();

    void onRewardedAdServerFailed();

    void onRewardedAdServerSucceeded();
}

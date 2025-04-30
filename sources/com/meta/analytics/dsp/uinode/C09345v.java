package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedInterstitialAdListener;

/* renamed from: com.facebook.ads.redexgen.X.5v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09345v implements RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, RewardedInterstitialAd.RewardedInterstitialLoadAdConfig {
    public final C09375y A00;

    public C09345v(C09375y c09375y) {
        this.A00 = c09375y;
        c09375y.withAdExperience(AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL);
    }

    public final void A00() {
        this.A00.A00();
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withAdListener(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00.withAdListener(new C09335u(rewardedInterstitialAdListener));
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withBid(String str) {
        this.A00.withBid(str);
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z8) {
        this.A00.withFailOnCacheFailureEnabled(z8);
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData) {
        this.A00.withRewardData(rewardData);
        return this;
    }
}

package com.applovin.impl;

import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: classes.dex */
public abstract class je implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0023a {
    private final a.InterfaceC0023a a;

    public je(a.InterfaceC0023a interfaceC0023a) {
        this.a = interfaceC0023a;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        bc.a((MaxAdListener) this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        bc.b(this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        bc.a(this.a, maxAd, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        bc.c(this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        bc.d(this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        bc.e(this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdRequestListener
    public void onAdRequestStarted(String str) {
        bc.a(this.a, str);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        bc.a((MaxAdRevenueListener) this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        bc.g(this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        bc.h(this.a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        bc.a(this.a, maxAd, maxReward);
    }
}

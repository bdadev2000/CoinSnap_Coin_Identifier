package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinRewardedInterstitialAd {
    private final AppLovinIncentivizedInterstitial a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinAdDisplayListener f3641b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdClickListener f3642c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdVideoPlaybackListener f3643d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f3642c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f3641b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f3643d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.a.show(appLovinAd, context, appLovinAdRewardListener, this.f3643d, this.f3641b, this.f3642c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}

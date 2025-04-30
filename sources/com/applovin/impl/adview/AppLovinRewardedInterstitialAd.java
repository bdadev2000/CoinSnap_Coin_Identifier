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

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinIncentivizedInterstitial f6623a;
    private AppLovinAdDisplayListener b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdClickListener f6624c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdVideoPlaybackListener f6625d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f6623a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6624c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6625d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f6623a.show(appLovinAd, context, appLovinAdRewardListener, this.f6625d, this.b, this.f6624c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}

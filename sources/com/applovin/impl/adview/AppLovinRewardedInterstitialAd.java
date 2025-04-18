package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes3.dex */
public class AppLovinRewardedInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinIncentivizedInterstitial f22732a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinAdDisplayListener f22733b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdClickListener f22734c;
    private AppLovinAdVideoPlaybackListener d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f22732a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f22734c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f22733b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f22732a.show(appLovinAd, context, appLovinAdRewardListener, this.d, this.f22733b, this.f22734c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}

package com.applovin.impl.adview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinAppOpenAd {
    private final AppLovinInterstitialAdDialog a;

    public AppLovinAppOpenAd(@NonNull AppLovinSdk appLovinSdk) {
        this.a = AppLovinInterstitialAd.create(appLovinSdk, com.applovin.impl.sdk.k.k());
    }

    public void setAdClickListener(@Nullable AppLovinAdClickListener appLovinAdClickListener) {
        this.a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(@Nullable AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(@Nullable AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(@NonNull AppLovinAd appLovinAd) {
        this.a.showAndRender(appLovinAd);
    }

    @NonNull
    public String toString() {
        return "AppLovinAppOpenAd{}";
    }
}

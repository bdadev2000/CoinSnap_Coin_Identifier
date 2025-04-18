package com.applovin.adview;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.p;
import com.applovin.impl.fb;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class AppLovinIncentivizedInterstitial {
    private final fb a;

    public AppLovinIncentivizedInterstitial(Context context) {
        this(AppLovinSdk.getInstance(context));
    }

    public static AppLovinIncentivizedInterstitial create(Context context) {
        return create(AppLovinSdk.getInstance(context));
    }

    public fb createIncentivizedAdController(String str, AppLovinSdk appLovinSdk) {
        return new fb(str, appLovinSdk);
    }

    public String getZoneId() {
        return this.a.c();
    }

    public boolean isAdReadyToDisplay() {
        return this.a.d();
    }

    public void preload(AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener == null) {
            t.i("AppLovinIncentivizedInterstitial", "AppLovinAdLoadListener was null when preloading incentivized interstitials; using a listener is highly recommended.");
        }
        this.a.b(appLovinAdLoadListener);
    }

    public void setExtraInfo(@NonNull String str, @Nullable Object obj) {
        if (str != null) {
            this.a.a(str, obj);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void show(Context context) {
        show(context, null, null);
    }

    public String toString() {
        return "AppLovinIncentivizedInterstitial{zoneId='" + getZoneId() + "', isAdReadyToDisplay=" + isAdReadyToDisplay() + AbstractJsonLexerKt.END_OBJ;
    }

    public AppLovinIncentivizedInterstitial(AppLovinSdk appLovinSdk) {
        this(null, appLovinSdk);
    }

    public static AppLovinIncentivizedInterstitial create(AppLovinSdk appLovinSdk) {
        return create(null, appLovinSdk);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        show(context, appLovinAdRewardListener, null);
    }

    public AppLovinIncentivizedInterstitial(String str, AppLovinSdk appLovinSdk) {
        if (appLovinSdk != null) {
            this.a = createIncentivizedAdController(str, appLovinSdk);
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static AppLovinIncentivizedInterstitial create(String str, AppLovinSdk appLovinSdk) {
        return new AppLovinIncentivizedInterstitial(str, appLovinSdk);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        show(context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, null);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        show(context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, null);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        show(null, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        this.a.a(appLovinAd, context, null, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void show(AppLovinAd appLovinAd, ViewGroup viewGroup, p pVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        this.a.b(appLovinAd, viewGroup, pVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }
}

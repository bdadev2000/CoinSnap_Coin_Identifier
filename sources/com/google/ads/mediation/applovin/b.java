package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes3.dex */
public final class b {
    public final AppLovinAdView a;

    public b(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this.a = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
    }
}

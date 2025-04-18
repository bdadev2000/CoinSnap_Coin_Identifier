package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* loaded from: classes.dex */
public final /* synthetic */ class xs implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f9079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f9080d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f9081f;

    public /* synthetic */ xs(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i10) {
        this.f9078b = i10;
        this.f9079c = appLovinAdViewEventListener;
        this.f9080d = appLovinAd;
        this.f9081f = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9078b;
        AppLovinAdViewEventListener appLovinAdViewEventListener = this.f9079c;
        AppLovinAdView appLovinAdView = this.f9081f;
        AppLovinAd appLovinAd = this.f9080d;
        switch (i10) {
            case 0:
                bc.d(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                return;
            case 1:
                bc.f(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                return;
            default:
                bc.e(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                return;
        }
    }
}

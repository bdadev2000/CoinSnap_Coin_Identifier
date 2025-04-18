package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* loaded from: classes2.dex */
public final /* synthetic */ class qt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f26221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f26222c;
    public final /* synthetic */ AppLovinAdView d;

    public /* synthetic */ qt(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i2) {
        this.f26220a = i2;
        this.f26221b = appLovinAdViewEventListener;
        this.f26222c = appLovinAd;
        this.d = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26220a;
        AppLovinAdViewEventListener appLovinAdViewEventListener = this.f26221b;
        AppLovinAdView appLovinAdView = this.d;
        AppLovinAd appLovinAd = this.f26222c;
        switch (i2) {
            case 0:
                gc.e(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                return;
            case 1:
                gc.d(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                return;
            default:
                gc.f(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                return;
        }
    }
}

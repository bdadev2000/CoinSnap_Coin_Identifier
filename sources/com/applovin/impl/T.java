package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f6482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f6483d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f6484f;

    public /* synthetic */ T(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i9) {
        this.b = i9;
        this.f6482c = appLovinAdViewEventListener;
        this.f6483d = appLovinAd;
        this.f6484f = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bc.d(this.f6482c, this.f6483d, this.f6484f);
                return;
            case 1:
                bc.f(this.f6482c, this.f6483d, this.f6484f);
                return;
            default:
                bc.e(this.f6482c, this.f6483d, this.f6484f);
                return;
        }
    }
}

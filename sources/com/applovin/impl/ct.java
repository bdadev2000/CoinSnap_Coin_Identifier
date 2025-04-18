package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* loaded from: classes.dex */
public final /* synthetic */ class ct implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f4154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f4155d;

    public /* synthetic */ ct(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i10) {
        this.f4153b = i10;
        this.f4154c = appLovinAdDisplayListener;
        this.f4155d = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4153b;
        AppLovinAd appLovinAd = this.f4155d;
        AppLovinAdDisplayListener appLovinAdDisplayListener = this.f4154c;
        switch (i10) {
            case 0:
                bc.d(appLovinAdDisplayListener, appLovinAd);
                return;
            default:
                bc.c(appLovinAdDisplayListener, appLovinAd);
                return;
        }
    }
}

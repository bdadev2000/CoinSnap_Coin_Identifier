package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class st implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f26981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f26982c;

    public /* synthetic */ st(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i2) {
        this.f26980a = i2;
        this.f26981b = appLovinAdDisplayListener;
        this.f26982c = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26980a;
        AppLovinAd appLovinAd = this.f26982c;
        AppLovinAdDisplayListener appLovinAdDisplayListener = this.f26981b;
        switch (i2) {
            case 0:
                gc.d(appLovinAdDisplayListener, appLovinAd);
                return;
            default:
                gc.c(appLovinAdDisplayListener, appLovinAd);
                return;
        }
    }
}

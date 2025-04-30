package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f6444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f6445d;

    public /* synthetic */ O(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i9) {
        this.b = i9;
        this.f6444c = appLovinAdDisplayListener;
        this.f6445d = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bc.d(this.f6444c, this.f6445d);
                return;
            default:
                bc.c(this.f6444c, this.f6445d);
                return;
        }
    }
}

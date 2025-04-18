package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class tt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f27209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f27210c;
    public final /* synthetic */ Map d;

    public /* synthetic */ tt(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i2) {
        this.f27208a = i2;
        this.f27209b = appLovinAdRewardListener;
        this.f27210c = appLovinAd;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27208a;
        AppLovinAdRewardListener appLovinAdRewardListener = this.f27209b;
        Map map = this.d;
        AppLovinAd appLovinAd = this.f27210c;
        switch (i2) {
            case 0:
                gc.d(appLovinAdRewardListener, appLovinAd, map);
                return;
            case 1:
                gc.e(appLovinAdRewardListener, appLovinAd, map);
                return;
            default:
                gc.f(appLovinAdRewardListener, appLovinAd, map);
                return;
        }
    }
}

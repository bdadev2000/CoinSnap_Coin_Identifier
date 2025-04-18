package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class zs implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f9500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f9501d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f9502f;

    public /* synthetic */ zs(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i10) {
        this.f9499b = i10;
        this.f9500c = appLovinAdRewardListener;
        this.f9501d = appLovinAd;
        this.f9502f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9499b;
        AppLovinAdRewardListener appLovinAdRewardListener = this.f9500c;
        Map map = this.f9502f;
        AppLovinAd appLovinAd = this.f9501d;
        switch (i10) {
            case 0:
                bc.d(appLovinAdRewardListener, appLovinAd, map);
                return;
            case 1:
                bc.f(appLovinAdRewardListener, appLovinAd, map);
                return;
            default:
                bc.e(appLovinAdRewardListener, appLovinAd, map);
                return;
        }
    }
}

package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class U implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f6490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f6491d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f6492f;

    public /* synthetic */ U(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i9) {
        this.b = i9;
        this.f6490c = appLovinAdRewardListener;
        this.f6491d = appLovinAd;
        this.f6492f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bc.d(this.f6490c, this.f6491d, this.f6492f);
                return;
            case 1:
                bc.f(this.f6490c, this.f6491d, this.f6492f);
                return;
            default:
                bc.e(this.f6490c, this.f6491d, this.f6492f);
                return;
        }
    }
}

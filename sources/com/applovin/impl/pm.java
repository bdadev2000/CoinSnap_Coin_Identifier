package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class pm extends hm {

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f26062j;

    public pm(h0 h0Var, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(h0Var, str, jVar);
        this.f26062j = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.hm
    public void a(int i2, String str) {
        super.a(i2, str);
        this.f26062j.onNativeAdLoadFailed(new AppLovinError(i2, str));
    }

    @Override // com.applovin.impl.hm
    public String e() {
        return e4.d(this.f28216a);
    }

    @Override // com.applovin.impl.hm
    public String f() {
        return e4.e(this.f28216a);
    }

    @Override // com.applovin.impl.hm
    public yl a(JSONObject jSONObject) {
        return new ym(jSONObject, this.f26062j, this.f28216a);
    }
}

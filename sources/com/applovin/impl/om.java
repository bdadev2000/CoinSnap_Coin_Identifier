package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class om extends gm {

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f6833j;

    public om(h0 h0Var, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(h0Var, str, kVar);
        this.f6833j = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.gm
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f6833j.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }

    @Override // com.applovin.impl.gm
    public String e() {
        return c4.d(this.a);
    }

    @Override // com.applovin.impl.gm
    public String f() {
        return c4.e(this.a);
    }

    @Override // com.applovin.impl.gm
    public xl a(JSONObject jSONObject) {
        return new xm(jSONObject, this.f6833j, this.a);
    }
}

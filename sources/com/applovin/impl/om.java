package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class om extends gm {

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f9923j;

    public om(C0703h0 c0703h0, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(c0703h0, str, kVar);
        this.f9923j = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.gm
    public void a(int i9, String str) {
        super.a(i9, str);
        this.f9923j.onNativeAdLoadFailed(new AppLovinError(i9, str));
    }

    @Override // com.applovin.impl.gm
    public String e() {
        return c4.d(this.f12278a);
    }

    @Override // com.applovin.impl.gm
    public String f() {
        return c4.e(this.f12278a);
    }

    @Override // com.applovin.impl.gm
    public xl a(JSONObject jSONObject) {
        return new xm(jSONObject, this.f9923j, this.f12278a);
    }
}

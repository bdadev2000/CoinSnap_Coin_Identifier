package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nm extends gm {

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f9359j;

    public nm(C0703h0 c0703h0, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(c0703h0, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.gm
    public void a(int i9, String str) {
        super.a(i9, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f9359j;
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) this.f9359j).failedToReceiveAdV2(new AppLovinError(i9, str));
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i9);
        }
    }

    @Override // com.applovin.impl.gm
    public String e() {
        return c4.a(this.f12278a);
    }

    @Override // com.applovin.impl.gm
    public String f() {
        return c4.b(this.f12278a);
    }

    public nm(C0703h0 c0703h0, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(c0703h0, str, kVar);
        this.f9359j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.gm
    public xl a(JSONObject jSONObject) {
        return new tm(jSONObject, this.f7927h, this.f9359j, this.f12278a);
    }
}

package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nm extends gm {

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f6422j;

    public nm(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(h0Var, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.gm
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6422j;
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) this.f6422j).failedToReceiveAdV2(new AppLovinError(i10, str));
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
    }

    @Override // com.applovin.impl.gm
    public String e() {
        return c4.a(this.a);
    }

    @Override // com.applovin.impl.gm
    public String f() {
        return c4.b(this.a);
    }

    public nm(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(h0Var, str, kVar);
        this.f6422j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.gm
    public xl a(JSONObject jSONObject) {
        return new tm(jSONObject, this.f4951h, this.f6422j, this.a);
    }
}

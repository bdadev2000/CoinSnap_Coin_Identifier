package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class om extends hm {

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f25909j;

    public om(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        this(h0Var, appLovinAdLoadListener, "TaskFetchNextAd", jVar);
    }

    @Override // com.applovin.impl.hm
    public void a(int i2, String str) {
        super.a(i2, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f25909j;
        if (appLovinAdLoadListener instanceof rb) {
            ((rb) this.f25909j).failedToReceiveAdV2(new AppLovinError(i2, str));
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i2);
        }
    }

    @Override // com.applovin.impl.hm
    public String e() {
        return e4.a(this.f28216a);
    }

    @Override // com.applovin.impl.hm
    public String f() {
        return e4.b(this.f28216a);
    }

    public om(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.j jVar) {
        super(h0Var, str, jVar);
        this.f25909j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.hm
    public yl a(JSONObject jSONObject) {
        return new um(jSONObject, this.f24333h, this.f25909j, this.f28216a);
    }
}

package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class nm extends pm {

    /* renamed from: k, reason: collision with root package name */
    private final w f25745k;

    public nm(w wVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(h0.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, jVar);
        this.f25745k = wVar;
    }

    @Override // com.applovin.impl.hm
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f25745k.b());
        hashMap.put("adtoken_prefix", this.f25745k.d());
        return hashMap;
    }
}

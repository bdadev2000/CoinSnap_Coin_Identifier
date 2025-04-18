package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mm extends om {

    /* renamed from: k, reason: collision with root package name */
    private final w f6275k;

    public mm(w wVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(h0.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar);
        this.f6275k = wVar;
    }

    @Override // com.applovin.impl.gm
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f6275k.b());
        hashMap.put("adtoken_prefix", this.f6275k.d());
        return hashMap;
    }
}

package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mm extends om {

    /* renamed from: k, reason: collision with root package name */
    private final C0769w f9210k;

    public mm(C0769w c0769w, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(C0703h0.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar);
        this.f9210k = c0769w;
    }

    @Override // com.applovin.impl.gm
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f9210k.b());
        hashMap.put("adtoken_prefix", this.f9210k.d());
        return hashMap;
    }
}

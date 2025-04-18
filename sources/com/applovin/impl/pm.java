package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class pm extends nm {

    /* renamed from: k, reason: collision with root package name */
    private final w f6991k;

    public pm(w wVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(h0.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar);
        this.f6991k = wVar;
    }

    @Override // com.applovin.impl.gm
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f6991k.b());
        hashMap.put("adtoken_prefix", this.f6991k.d());
        return hashMap;
    }
}

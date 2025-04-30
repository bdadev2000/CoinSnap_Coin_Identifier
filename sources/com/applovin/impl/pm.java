package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class pm extends nm {

    /* renamed from: k, reason: collision with root package name */
    private final C0769w f10056k;

    public pm(C0769w c0769w, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(C0703h0.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar);
        this.f10056k = c0769w;
    }

    @Override // com.applovin.impl.gm
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f10056k.b());
        hashMap.put("adtoken_prefix", this.f10056k.d());
        return hashMap;
    }
}

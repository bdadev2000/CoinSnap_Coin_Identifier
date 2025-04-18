package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class qm extends om {

    /* renamed from: k, reason: collision with root package name */
    private final w f26193k;

    public qm(w wVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(h0.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", jVar);
        this.f26193k = wVar;
    }

    @Override // com.applovin.impl.hm
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f26193k.b());
        hashMap.put("adtoken_prefix", this.f26193k.d());
        return hashMap;
    }
}

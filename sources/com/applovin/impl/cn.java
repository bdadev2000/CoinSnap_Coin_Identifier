package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f7098h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONObject f7099i;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f7100j;

    public cn(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f7098h = jSONObject;
        this.f7099i = jSONObject2;
        this.f7100j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f7098h, this.f7099i, this.f12278a);
        boolean booleanValue = JsonUtils.getBoolean(this.f7098h, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f7098h, "vs_load_immediately", Boolean.TRUE).booleanValue();
        bm bmVar = new bm(aVar, this.f12278a, this.f7100j);
        bmVar.c(booleanValue2);
        bmVar.b(booleanValue);
        this.f12278a.l0().a((xl) bmVar, sm.b.CACHING);
    }
}

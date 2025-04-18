package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f4112h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONObject f4113i;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f4114j;

    public cn(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f4112h = jSONObject;
        this.f4113i = jSONObject2;
        this.f4114j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f4112h, this.f4113i, this.a);
        boolean booleanValue = JsonUtils.getBoolean(this.f4112h, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f4112h, "vs_load_immediately", Boolean.TRUE).booleanValue();
        bm bmVar = new bm(aVar, this.a, this.f4114j);
        bmVar.c(booleanValue2);
        bmVar.b(booleanValue);
        this.a.l0().a((xl) bmVar, sm.b.CACHING);
    }
}

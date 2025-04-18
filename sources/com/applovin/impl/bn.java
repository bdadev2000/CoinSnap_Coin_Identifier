package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bn extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f23139h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONObject f23140i;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f23141j;

    public bn(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderAppLovinAd", jVar);
        this.f23139h = jSONObject;
        this.f23140i = jSONObject2;
        this.f23141j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f23139h, this.f23140i, this.f28216a);
        boolean booleanValue = JsonUtils.getBoolean(this.f23139h, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f23139h, "vs_load_immediately", Boolean.TRUE).booleanValue();
        cm cmVar = new cm(aVar, this.f28216a, this.f23141j);
        cmVar.c(booleanValue2);
        cmVar.b(booleanValue);
        this.f28216a.j0().a((yl) cmVar, tm.b.CACHING);
    }
}

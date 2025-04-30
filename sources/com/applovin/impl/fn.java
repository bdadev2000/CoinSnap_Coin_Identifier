package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fn extends hn {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7741h;

    public fn(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f7741h = bVar;
    }

    @Override // com.applovin.impl.jn
    public void a(int i9) {
        super.a(i9);
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Failed to report reward for ad: " + this.f7741h + " - error code: " + i9);
        }
    }

    @Override // com.applovin.impl.hn
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Reported reward successfully for ad: " + this.f7741h);
        }
    }

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.hn
    public ch h() {
        return this.f7741h.f();
    }

    @Override // com.applovin.impl.hn
    public void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "No reward result was found for ad: " + this.f7741h);
        }
    }

    @Override // com.applovin.impl.jn
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f7741h.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f7741h.V());
        String clCode = this.f7741h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}

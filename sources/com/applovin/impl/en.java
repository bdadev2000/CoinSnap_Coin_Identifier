package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class en extends gn {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f23736h;

    public en(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        super("TaskReportAppLovinReward", jVar);
        this.f23736h = bVar;
    }

    @Override // com.applovin.impl.in
    public void a(int i2) {
        super.a(i2);
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Failed to report reward for ad: " + this.f23736h + " - error code: " + i2);
        }
    }

    @Override // com.applovin.impl.gn
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Reported reward successfully for ad: " + this.f23736h);
        }
    }

    @Override // com.applovin.impl.in
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.gn
    public fh h() {
        return this.f23736h.e();
    }

    @Override // com.applovin.impl.gn
    public void i() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "No reward result was found for ad: " + this.f23736h);
        }
    }

    @Override // com.applovin.impl.in
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f23736h.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f23736h.V());
        String clCode = this.f23736h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}

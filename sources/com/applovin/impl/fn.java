package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class fn extends gn {

    /* renamed from: h, reason: collision with root package name */
    private final ie f23944h;

    public fn(ie ieVar, com.applovin.impl.sdk.j jVar) {
        super("TaskReportMaxReward", jVar);
        this.f23944h = ieVar;
    }

    @Override // com.applovin.impl.in
    public void a(int i2) {
        super.a(i2);
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Failed to report reward for mediated ad: " + this.f23944h + " - error code: " + i2);
        }
    }

    @Override // com.applovin.impl.gn
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Reported reward successfully for mediated ad: " + this.f23944h);
        }
    }

    @Override // com.applovin.impl.in
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.gn
    public fh h() {
        return this.f23944h.m0();
    }

    @Override // com.applovin.impl.gn
    public void i() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "No reward result was found for mediated ad: " + this.f23944h);
        }
    }

    @Override // com.applovin.impl.in
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f23944h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f23944h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f23944h.e());
        String q02 = this.f23944h.q0();
        if (!StringUtils.isValidString(q02)) {
            q02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", q02);
        String B = this.f23944h.B();
        if (!StringUtils.isValidString(B)) {
            B = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", B);
    }
}

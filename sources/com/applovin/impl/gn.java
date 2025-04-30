package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gn extends hn {

    /* renamed from: h, reason: collision with root package name */
    private final de f7930h;

    public gn(de deVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f7930h = deVar;
    }

    @Override // com.applovin.impl.jn
    public void a(int i9) {
        super.a(i9);
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Failed to report reward for mediated ad: " + this.f7930h + " - error code: " + i9);
        }
    }

    @Override // com.applovin.impl.hn
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Reported reward successfully for mediated ad: " + this.f7930h);
        }
    }

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.hn
    public ch h() {
        return this.f7930h.h0();
    }

    @Override // com.applovin.impl.hn
    public void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "No reward result was found for mediated ad: " + this.f7930h);
        }
    }

    @Override // com.applovin.impl.jn
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f7930h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f7930h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f7930h.e());
        String l02 = this.f7930h.l0();
        if (!StringUtils.isValidString(l02)) {
            l02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", l02);
        String A8 = this.f7930h.A();
        if (!StringUtils.isValidString(A8)) {
            A8 = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", A8);
    }
}

package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gn extends hn {

    /* renamed from: h, reason: collision with root package name */
    private final de f4954h;

    public gn(de deVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f4954h = deVar;
    }

    @Override // com.applovin.impl.jn
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Failed to report reward for mediated ad: " + this.f4954h + " - error code: " + i10);
        }
    }

    @Override // com.applovin.impl.hn
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Reported reward successfully for mediated ad: " + this.f4954h);
        }
    }

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.hn
    public ch h() {
        return this.f4954h.h0();
    }

    @Override // com.applovin.impl.hn
    public void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "No reward result was found for mediated ad: " + this.f4954h);
        }
    }

    @Override // com.applovin.impl.jn
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f4954h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f4954h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f4954h.e());
        String l02 = this.f4954h.l0();
        if (!StringUtils.isValidString(l02)) {
            l02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", l02);
        String A = this.f4954h.A();
        if (!StringUtils.isValidString(A)) {
            A = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", A);
    }
}

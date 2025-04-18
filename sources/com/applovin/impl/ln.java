package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ln extends mn {

    /* renamed from: h, reason: collision with root package name */
    private final ie f25109h;

    public ln(ie ieVar, com.applovin.impl.sdk.j jVar) {
        super("TaskValidateMaxReward", jVar);
        this.f25109h = ieVar;
    }

    @Override // com.applovin.impl.mn
    public void a(fh fhVar) {
        this.f25109h.a(fhVar);
    }

    @Override // com.applovin.impl.in
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.mn
    public boolean h() {
        return this.f25109h.t0();
    }

    @Override // com.applovin.impl.in
    public void a(int i2) {
        super.a(i2);
        this.f25109h.a(fh.a((i2 < 400 || i2 >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.in
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f25109h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f25109h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f25109h.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f25109h.getFormat().getLabel());
        String q02 = this.f25109h.q0();
        if (!StringUtils.isValidString(q02)) {
            q02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", q02);
        String B = this.f25109h.B();
        if (!StringUtils.isValidString(B)) {
            B = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", B);
    }
}

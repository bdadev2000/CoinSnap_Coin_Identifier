package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mn extends nn {

    /* renamed from: h, reason: collision with root package name */
    private final de f6276h;

    public mn(de deVar, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f6276h = deVar;
    }

    @Override // com.applovin.impl.nn
    public void a(ch chVar) {
        this.f6276h.a(chVar);
    }

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.nn
    public boolean h() {
        return this.f6276h.o0();
    }

    @Override // com.applovin.impl.jn
    public void a(int i10) {
        super.a(i10);
        this.f6276h.a(ch.a((i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.jn
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f6276h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f6276h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f6276h.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f6276h.getFormat().getLabel());
        String l02 = this.f6276h.l0();
        if (!StringUtils.isValidString(l02)) {
            l02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", l02);
        String A = this.f6276h.A();
        if (!StringUtils.isValidString(A)) {
            A = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", A);
    }
}

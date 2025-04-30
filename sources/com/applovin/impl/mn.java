package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mn extends nn {

    /* renamed from: h, reason: collision with root package name */
    private final de f9211h;

    public mn(de deVar, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f9211h = deVar;
    }

    @Override // com.applovin.impl.nn
    public void a(ch chVar) {
        this.f9211h.a(chVar);
    }

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.nn
    public boolean h() {
        return this.f9211h.o0();
    }

    @Override // com.applovin.impl.jn
    public void a(int i9) {
        String str;
        super.a(i9);
        if (i9 >= 400 && i9 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f9211h.a(ch.a(str));
    }

    @Override // com.applovin.impl.jn
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9211h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9211h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9211h.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f9211h.getFormat().getLabel());
        String l02 = this.f9211h.l0();
        if (!StringUtils.isValidString(l02)) {
            l02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", l02);
        String A8 = this.f9211h.A();
        if (!StringUtils.isValidString(A8)) {
            A8 = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", A8);
    }
}

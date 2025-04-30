package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k4 extends h4 {

    /* renamed from: c, reason: collision with root package name */
    private Map f8540c;

    public k4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public Map e() {
        return this.f8540c;
    }

    public String f() {
        return JsonUtils.getString(this.b, "name", null);
    }

    @Override // com.applovin.impl.h4
    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "name=" + f() + "}";
    }
}

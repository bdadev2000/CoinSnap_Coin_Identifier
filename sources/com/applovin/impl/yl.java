package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class yl extends xl {

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            c4.a(i9, this.f12278a);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            yl.this.a(jSONObject);
        }
    }

    public yl(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) {
        if (((Boolean) this.f12278a.a(oj.f9627L4)).booleanValue()) {
            JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.f12278a.F().c());
        }
    }

    private void c(JSONObject jSONObject) {
        Map l;
        Map A8;
        if (this.f12278a.y() != null) {
            com.applovin.impl.sdk.m y4 = this.f12278a.y();
            l = y4.d();
            A8 = y4.b();
        } else {
            com.applovin.impl.sdk.l x9 = this.f12278a.x();
            l = x9.l();
            A8 = x9.A();
        }
        zp.a("platform", "type", l);
        zp.a("api_level", "sdk_version", l);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(l));
        zp.a("sdk_version", "applovin_sdk_version", A8);
        zp.a("ia", "installed_at", A8);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(A8));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.d(this.b, "Submitting user data...");
        }
        Map c9 = c4.c(this.f12278a);
        JSONObject jSONObject = new JSONObject();
        c(jSONObject);
        b(jSONObject);
        if (((Boolean) this.f12278a.a(oj.f9567C5)).booleanValue() || ((Boolean) this.f12278a.a(oj.f9877w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c9);
            c9 = null;
        }
        a(c9, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f12278a.h0().a(oj.f9762g, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f12278a.h0().a(oj.f9792k, JsonUtils.getString(jSONObject2, "device_token", ""));
        c4.a(jSONObject2, this.f12278a);
        this.f12278a.F().b();
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f12278a).b(c4.b("2.0/device", this.f12278a)).a(c4.a("2.0/device", this.f12278a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f12278a.a(oj.f9616J5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f12278a.a(oj.f9780i3)).intValue()).a(qi.a.a(((Integer) this.f12278a.a(oj.f9864u5)).intValue())).a(), this.f12278a);
        aVar.c(oj.K0);
        aVar.b(oj.f9623L0);
        this.f12278a.l0().a(aVar);
    }
}

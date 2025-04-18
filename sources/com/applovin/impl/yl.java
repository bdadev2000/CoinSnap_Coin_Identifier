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
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            c4.a(i10, this.a);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            yl.this.a(jSONObject);
        }
    }

    public yl(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) {
        if (((Boolean) this.a.a(oj.L4)).booleanValue()) {
            JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.a.F().c());
        }
    }

    private void c(JSONObject jSONObject) {
        Map l10;
        Map A;
        if (this.a.y() != null) {
            com.applovin.impl.sdk.m y4 = this.a.y();
            l10 = y4.d();
            A = y4.b();
        } else {
            com.applovin.impl.sdk.l x10 = this.a.x();
            l10 = x10.l();
            A = x10.A();
        }
        zp.a("platform", "type", l10);
        zp.a("api_level", "sdk_version", l10);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(l10));
        zp.a("sdk_version", "applovin_sdk_version", A);
        zp.a("ia", "installed_at", A);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(A));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.d(this.f9060b, "Submitting user data...");
        }
        Map c10 = c4.c(this.a);
        JSONObject jSONObject = new JSONObject();
        c(jSONObject);
        b(jSONObject);
        if (((Boolean) this.a.a(oj.C5)).booleanValue() || ((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c10);
            c10 = null;
        }
        a(c10, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.a.h0().a(oj.f6656g, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.a.h0().a(oj.f6687k, JsonUtils.getString(jSONObject2, "device_token", ""));
        c4.a(jSONObject2, this.a);
        this.a.F().b();
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).b(c4.b("2.0/device", this.a)).a(c4.a("2.0/device", this.a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.a.a(oj.J5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.a.a(oj.f6676i3)).intValue()).a(qi.a.a(((Integer) this.a.a(oj.f6768u5)).intValue())).a(), this.a);
        aVar.c(oj.K0);
        aVar.b(oj.L0);
        this.a.l0().a(aVar);
    }
}

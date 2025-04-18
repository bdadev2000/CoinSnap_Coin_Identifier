package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.vi;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class zl extends yl {

    /* loaded from: classes4.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            e4.a(i2, this.f28216a);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            zl.this.a(jSONObject);
        }
    }

    public zl(com.applovin.impl.sdk.j jVar) {
        super("TaskApiSubmitData", jVar);
    }

    private void b(JSONObject jSONObject) {
        if (((Boolean) this.f28216a.a(sj.P4)).booleanValue()) {
            JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.f28216a.D().c());
        }
    }

    private void c(JSONObject jSONObject) {
        com.applovin.impl.sdk.k y2 = this.f28216a.y();
        Map l2 = y2.l();
        yp.a(AppLovinBridge.e, "type", l2);
        yp.a("api_level", "sdk_version", l2);
        JsonUtils.putObject(jSONObject, DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(l2));
        Map A = y2.A();
        yp.a("sdk_version", "applovin_sdk_version", A);
        yp.a("ia", "installed_at", A);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(A));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.d(this.f28217b, "Submitting user data...");
        }
        Map c2 = e4.c(this.f28216a);
        JSONObject jSONObject = new JSONObject();
        c(jSONObject);
        b(jSONObject);
        if (((Boolean) this.f28216a.a(sj.H5)).booleanValue() || ((Boolean) this.f28216a.a(sj.B5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c2);
            c2 = null;
        }
        a(c2, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f28216a.h0().a(sj.f26917g, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f28216a.h0().a(sj.f26929k, JsonUtils.getString(jSONObject2, "device_token", ""));
        e4.a(jSONObject2, this.f28216a);
        this.f28216a.D().b();
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f28216a).b(e4.b("2.0/device", this.f28216a)).a(e4.a("2.0/device", this.f28216a)).b(map).a(jSONObject).c(com.safedk.android.a.g.f29074c).b(((Boolean) this.f28216a.a(sj.O5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f28216a.a(sj.r3)).intValue()).a(vi.a.a(((Integer) this.f28216a.a(sj.z5)).intValue())).a(), this.f28216a);
        aVar.c(sj.N0);
        aVar.b(sj.O0);
        this.f28216a.j0().a(aVar);
    }
}

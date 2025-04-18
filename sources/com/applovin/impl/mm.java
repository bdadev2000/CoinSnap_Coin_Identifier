package com.applovin.impl;

import com.applovin.impl.d4;
import com.applovin.impl.l0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.vi;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.SdksMapping;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mm extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final d4.e f25595h;

    /* loaded from: classes.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z2) {
            super(aVar, jVar, z2);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            mm.this.f25595h.a(str, i2, str2, jSONObject);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            mm.this.f25595h.a(str, jSONObject, i2);
        }
    }

    public mm(d4.e eVar, com.applovin.impl.sdk.j jVar) {
        super("TaskFetchMediationDebuggerInfo", jVar, true);
        this.f25595h = eVar;
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, af.a(this.f28216a));
        l0.a f2 = this.f28216a.y().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", f2.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", f2.a());
        return jSONObject;
    }

    public Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f28216a.a(sj.o5)).booleanValue()) {
            hashMap.put("sdk_key", this.f28216a.b0());
        }
        Map A = this.f28216a.y().A();
        hashMap.put("package_name", String.valueOf(A.get("package_name")));
        hashMap.put("app_version", String.valueOf(A.get("app_version")));
        Map G = this.f28216a.y().G();
        hashMap.put(AppLovinBridge.e, String.valueOf(G.get(AppLovinBridge.e)));
        hashMap.put("os", String.valueOf(G.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map f2 = f();
        JSONObject e = e();
        if (((Boolean) this.f28216a.a(sj.E5)).booleanValue() || ((Boolean) this.f28216a.a(sj.B5)).booleanValue()) {
            JsonUtils.putAll(e, (Map<String, ?>) f2);
            f2 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f28216a).c(com.safedk.android.a.g.f29074c).b(qe.i(this.f28216a)).a(qe.h(this.f28216a)).b(f2).a(e).a((Object) new JSONObject()).c(((Long) this.f28216a.a(ve.V6)).intValue()).a(vi.a.a(((Integer) this.f28216a.a(sj.v5)).intValue())).a(), this.f28216a, d());
        aVar.c(ve.R6);
        aVar.b(ve.S6);
        this.f28216a.j0().a(aVar);
    }
}

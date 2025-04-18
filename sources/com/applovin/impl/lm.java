package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.l0;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final b4.e f5897h;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            lm.this.f5897h.a(str, i10, str2, jSONObject);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            lm.this.f5897h.a(str, jSONObject, i10);
        }
    }

    public lm(b4.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f5897h = eVar;
    }

    private JSONObject e() {
        l0.a f10;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", ve.a(this.a));
        if (this.a.y() != null) {
            f10 = this.a.z().d();
        } else {
            f10 = this.a.x().f();
        }
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", f10.b().b());
        Boolean b3 = y3.c().b(a());
        if (((Boolean) this.a.a(oj.S3)).booleanValue() && !Boolean.TRUE.equals(b3)) {
            JsonUtils.putStringIfValid(jSONObject, "idfa", f10.a());
        }
        return jSONObject;
    }

    public Map f() {
        Map A;
        Map G;
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.a.a(oj.f6685j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.d0());
        }
        if (this.a.y() != null) {
            A = this.a.y().b();
            G = this.a.y().k();
        } else {
            A = this.a.x().A();
            G = this.a.x().G();
        }
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, String.valueOf(A.get(CampaignEx.JSON_KEY_PACKAGE_NAME)));
        hashMap.put("app_version", String.valueOf(A.get("app_version")));
        hashMap.put("platform", String.valueOf(G.get("platform")));
        hashMap.put("os", String.valueOf(G.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map f10 = f();
        JSONObject e2 = e();
        if (((Boolean) this.a.a(oj.f6807z5)).booleanValue() || ((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
            JsonUtils.putAll(e2, (Map<String, ?>) f10);
            f10 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).c("POST").b(le.j(this.a)).a(le.i(this.a)).b(f10).a(e2).a((Object) new JSONObject()).c(((Long) this.a.a(qe.M6)).intValue()).a(qi.a.a(((Integer) this.a.a(oj.f6741q5)).intValue())).a(), this.a, d());
        aVar.c(qe.I6);
        aVar.b(qe.J6);
        this.a.l0().a(aVar);
    }
}

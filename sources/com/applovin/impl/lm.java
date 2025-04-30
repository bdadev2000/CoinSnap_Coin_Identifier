package com.applovin.impl;

import com.applovin.impl.AbstractC0719l0;
import com.applovin.impl.b4;
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
    private final b4.e f8860h;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z8) {
            super(aVar, kVar, z8);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            lm.this.f8860h.a(str, i9, str2, jSONObject);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            lm.this.f8860h.a(str, jSONObject, i9);
        }
    }

    public lm(b4.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f8860h = eVar;
    }

    private JSONObject e() {
        AbstractC0719l0.a f9;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", ve.a(this.f12278a));
        if (this.f12278a.y() != null) {
            f9 = this.f12278a.z().d();
        } else {
            f9 = this.f12278a.x().f();
        }
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", f9.b().b());
        Boolean b = y3.c().b(a());
        if (((Boolean) this.f12278a.a(oj.f9672S3)).booleanValue() && !Boolean.TRUE.equals(b)) {
            JsonUtils.putStringIfValid(jSONObject, "idfa", f9.a());
        }
        return jSONObject;
    }

    public Map f() {
        Map A8;
        Map G3;
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f12278a.a(oj.f9790j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f12278a.d0());
        }
        if (this.f12278a.y() != null) {
            A8 = this.f12278a.y().b();
            G3 = this.f12278a.y().k();
        } else {
            A8 = this.f12278a.x().A();
            G3 = this.f12278a.x().G();
        }
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, String.valueOf(A8.get(CampaignEx.JSON_KEY_PACKAGE_NAME)));
        hashMap.put("app_version", String.valueOf(A8.get("app_version")));
        hashMap.put("platform", String.valueOf(G3.get("platform")));
        hashMap.put("os", String.valueOf(G3.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map f9 = f();
        JSONObject e4 = e();
        if (((Boolean) this.f12278a.a(oj.f9899z5)).booleanValue() || ((Boolean) this.f12278a.a(oj.f9877w5)).booleanValue()) {
            JsonUtils.putAll(e4, (Map<String, ?>) f9);
            f9 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f12278a).c("POST").b(le.j(this.f12278a)).a(le.i(this.f12278a)).b(f9).a(e4).a((Object) new JSONObject()).c(((Long) this.f12278a.a(qe.f10305M6)).intValue()).a(qi.a.a(((Integer) this.f12278a.a(oj.f9835q5)).intValue())).a(), this.f12278a, d());
        aVar.c(qe.f10298I6);
        aVar.b(qe.f10299J6);
        this.f12278a.l0().a(aVar);
    }
}

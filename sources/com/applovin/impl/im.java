package com.applovin.impl;

import android.app.ActivityManager;
import com.applovin.impl.l0;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class im extends xl {

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicBoolean f5353k = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final int f5354h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f5355i;

    /* renamed from: j, reason: collision with root package name */
    private b f5356j;

    /* loaded from: classes.dex */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    public class c extends xl {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (im.this.f5356j != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "Timing out fetch basic settings...");
                }
                im.this.a(new JSONObject());
            }
        }
    }

    public im(int i10, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f5355i = new Object();
        this.f5354h = i10;
        this.f5356j = bVar;
    }

    private String f() {
        return c4.a((String) this.a.a(oj.H0), "5.0/i", b());
    }

    private String g() {
        return c4.a((String) this.a.a(oj.G0), "5.0/i", b());
    }

    public JSONObject e() {
        Map A;
        List<String> list;
        Map G;
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.a;
            oj ojVar = oj.f6784w5;
            if (((Boolean) kVar.a(ojVar)).booleanValue() || ((Boolean) this.a.a(ojVar)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", v.b());
            jSONObject.put("init_count", this.f5354h);
            jSONObject.put("server_installed_at", this.a.a(oj.f6757t));
            jSONObject.put("legacy", this.a.C0().get());
            if (this.a.z0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.a.w0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", zp.b(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", zp.g(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.a.a(oj.U3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.a.Q());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.a.A());
            jSONObject.put("installed_mediation_adapters", ve.a(this.a));
            if (this.a.y() != null) {
                A = this.a.y().b();
            } else {
                A = this.a.x().A();
            }
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, A.get(CampaignEx.JSON_KEY_PACKAGE_NAME));
            jSONObject.put("app_version", A.get("app_version"));
            jSONObject.put("test_ads", A.get("test_ads"));
            jSONObject.put("debug", A.get("debug"));
            jSONObject.put("tg", A.get("tg"));
            jSONObject.put("target_sdk", A.get("target_sdk"));
            if (this.a.C0().get()) {
                list = this.a.g0().getInitializationAdUnitIds();
            } else if (this.a.I() != null) {
                list = this.a.I().getAdUnitIds();
            } else {
                list = null;
            }
            if (list != null && list.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", A.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", A.get("IABTCF_gdprApplies"));
            Object obj = A.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.a.t().c());
            if (this.a.y() != null) {
                G = this.a.y().k();
            } else {
                G = this.a.x().G();
            }
            jSONObject.put("platform", G.get("platform"));
            jSONObject.put("os", G.get("os"));
            jSONObject.put("locale", G.get("locale"));
            jSONObject.put("brand", G.get("brand"));
            jSONObject.put("brand_name", G.get("brand_name"));
            jSONObject.put("hardware", G.get("hardware"));
            jSONObject.put("model", G.get("model"));
            jSONObject.put("revision", G.get("revision"));
            jSONObject.put("is_tablet", G.get("is_tablet"));
            jSONObject.put("screen_size_in", G.get("screen_size_in"));
            jSONObject.put("supported_abis", G.get("supported_abis"));
            if (((Boolean) this.a.a(oj.f6645e4)).booleanValue()) {
                jSONObject.put("mtl", this.a.f0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.k().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            Map k02 = this.a.k0();
            if (k02 != null && !k02.isEmpty()) {
                jSONObject.put("targeting_data", new JSONObject(k02));
            }
            if (this.a.y() != null) {
                l0.a d10 = this.a.z().d();
                jSONObject.put("dnt", d10.c());
                jSONObject.put("dnt_code", d10.b().b());
                Boolean b3 = y3.c().b(a());
                if (((Boolean) this.a.a(oj.Q3)).booleanValue() && StringUtils.isValidString(d10.a()) && !Boolean.TRUE.equals(b3)) {
                    jSONObject.put("idfa", d10.a());
                }
                n.c h10 = this.a.z().h();
                if (((Boolean) this.a.a(oj.J3)).booleanValue() && h10 != null && !Boolean.TRUE.equals(b3)) {
                    jSONObject.put("idfv", h10.a());
                    jSONObject.put("idfv_scope", h10.b());
                }
            } else {
                l0.a f10 = this.a.x().f();
                jSONObject.put("dnt", f10.c());
                jSONObject.put("dnt_code", f10.b().b());
                Boolean b10 = y3.c().b(a());
                if (((Boolean) this.a.a(oj.Q3)).booleanValue() && StringUtils.isValidString(f10.a()) && !Boolean.TRUE.equals(b10)) {
                    jSONObject.put("idfa", f10.a());
                }
                l.b B = this.a.x().B();
                if (((Boolean) this.a.a(oj.J3)).booleanValue() && B != null && !Boolean.TRUE.equals(b10)) {
                    jSONObject.put("idfv", B.a);
                    jSONObject.put("idfv_scope", B.f7766b);
                }
            }
            if (this.a.r0() != null) {
                String name = this.a.r0().getName();
                if (StringUtils.isValidString(name)) {
                    jSONObject.put("user_segment_name", StringUtils.encodeUriString(name));
                }
            }
            if (((Boolean) this.a.a(oj.M3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.a.p());
            }
            if (((Boolean) this.a.a(oj.O3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.a.c0());
            }
            if (this.a.n0().c()) {
                jSONObject.put("test_mode", true);
            }
            List b11 = this.a.n0().b();
            if (b11 != null && !b11.isEmpty()) {
                jSONObject.put("test_mode_networks", b11);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.a.g0().getExtraParameters()));
            if (this.f5354h > 1) {
                ArrayService l10 = this.a.l();
                if (l10.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", l10.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", l10.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(l10.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(l10.getAppHubPackageName()));
            }
        } catch (JSONException e2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Failed to create JSON body", e2);
            }
            this.a.B().a(this.f9060b, "createJSONBody", e2);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.a.a(oj.f6792x5)).booleanValue() && !((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
            hashMap.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.a.a(oj.f6685j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.d0());
        }
        Boolean b3 = y3.b().b(a());
        if (b3 != null) {
            hashMap.put("huc", b3.toString());
        }
        Boolean b10 = y3.c().b(a());
        if (b10 != null) {
            hashMap.put("aru", b10.toString());
        }
        Boolean b11 = y3.a().b(a());
        if (b11 != null) {
            hashMap.put("dns", b11.toString());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!x3.k() && f5353k.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.k());
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Cannot update security provider", th2);
                }
            }
        }
        com.applovin.impl.sdk.network.a a10 = com.applovin.impl.sdk.network.a.a(this.a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.a.a(oj.I5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.a.a(oj.f6699l3)).intValue()).b(((Integer) this.a.a(oj.f6723o3)).intValue()).c(((Integer) this.a.a(oj.f6691k3)).intValue()).e(((Boolean) this.a.a(oj.f6790x3)).booleanValue()).a(qi.a.a(((Integer) this.a.a(oj.f6725o5)).intValue())).f(true).a();
        this.a.l0().a(new c(this.a), sm.b.TIMEOUT, ((Integer) this.a.a(r3)).intValue() + 250);
        a aVar = new a(a10, this.a, d());
        aVar.c(oj.G0);
        aVar.b(oj.H0);
        this.a.l0().a(aVar);
    }

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            im.this.a(jSONObject);
            this.a.B().a("fetchBasicSettings", str, i10);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            im.this.a(jSONObject);
            this.a.B().a("fetchBasicSettings", str, i10, CollectionUtils.hashMap("error_message", str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f5355i) {
            bVar = this.f5356j;
            this.f5356j = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}

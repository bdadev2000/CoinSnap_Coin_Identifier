package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class vi {

    /* renamed from: d, reason: collision with root package name */
    private static JSONObject f11736d;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f11737a;
    protected final String b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f11738c = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f11739a;
        private final JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        private final JSONObject f11740c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f11741d;

        /* renamed from: e, reason: collision with root package name */
        private final JSONObject f11742e;

        /* renamed from: f, reason: collision with root package name */
        private final JSONObject f11743f;

        /* renamed from: g, reason: collision with root package name */
        private final JSONObject f11744g;

        /* renamed from: com.applovin.impl.vi$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0039a {

            /* renamed from: a, reason: collision with root package name */
            private JSONObject f11745a;
            private JSONObject b;

            /* renamed from: c, reason: collision with root package name */
            private JSONObject f11746c;

            /* renamed from: d, reason: collision with root package name */
            private JSONObject f11747d;

            /* renamed from: e, reason: collision with root package name */
            private JSONObject f11748e;

            /* renamed from: f, reason: collision with root package name */
            private JSONObject f11749f;

            /* renamed from: g, reason: collision with root package name */
            private JSONObject f11750g;

            public C0039a a(JSONObject jSONObject) {
                this.f11745a = jSONObject;
                return this;
            }

            public C0039a b(JSONObject jSONObject) {
                this.b = jSONObject;
                return this;
            }

            public C0039a c(JSONObject jSONObject) {
                this.f11750g = jSONObject;
                return this;
            }

            public C0039a d(JSONObject jSONObject) {
                this.f11748e = jSONObject;
                return this;
            }

            public String toString() {
                return "S2SApiService.Extensions.Builder(bidRequestExtObject=" + this.f11745a + ", impExtObject=" + this.b + ", appExtObject=" + this.f11746c + ", deviceExtObject=" + this.f11747d + ", userExtObject=" + this.f11748e + ", sourceExtObject=" + this.f11749f + ", regsExtObject=" + this.f11750g + ")";
            }

            public a a() {
                return new a(this.f11745a, this.b, this.f11746c, this.f11747d, this.f11748e, this.f11749f, this.f11750g);
            }
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
            this.f11739a = jSONObject;
            this.b = jSONObject2;
            this.f11740c = jSONObject3;
            this.f11741d = jSONObject4;
            this.f11742e = jSONObject5;
            this.f11743f = jSONObject6;
            this.f11744g = jSONObject7;
        }

        public static C0039a a() {
            return new C0039a();
        }
    }

    public vi(String str, com.applovin.impl.sdk.k kVar) {
        this.b = str;
        this.f11737a = kVar;
    }

    private JSONObject a(Bundle bundle, JSONObject jSONObject, Context context) {
        JSONObject a6 = a(context);
        JsonUtils.putString(a6, "domain", bundle.getString("domain", ""));
        JsonUtils.putString(a6, "storeurl", bundle.getString("storeurl", ""));
        JsonUtils.putJSONObjectIfValid(a6, "ext", jSONObject);
        return a6;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Boolean c9 = c();
        if (c9 != null && c9.booleanValue()) {
            JsonUtils.putBoolean(jSONObject, "did_consent", y3.b().b(com.applovin.impl.sdk.k.k()).booleanValue());
            JsonUtils.putString(jSONObject, "consent", this.f11737a.m0().k());
        }
        return jSONObject;
    }

    public Boolean c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());
        String a6 = qj.f10380r.a();
        if (!defaultSharedPreferences.contains(a6)) {
            return null;
        }
        boolean z8 = false;
        String str = (String) sj.a(a6, "", String.class, defaultSharedPreferences, false);
        if (StringUtils.isValidString(str)) {
            if (str.equals("1") || str.equalsIgnoreCase("true")) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
        Integer num = (Integer) sj.a(a6, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences, false);
        if (num != null && num.intValue() != Integer.MAX_VALUE) {
            if (num.intValue() > 0) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
        Long l = (Long) sj.a(a6, Long.MAX_VALUE, Long.class, defaultSharedPreferences, false);
        if (l != null && l.longValue() != Long.MAX_VALUE) {
            if (l.longValue() > 0) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
        return (Boolean) sj.a(a6, Boolean.FALSE, Boolean.class, defaultSharedPreferences, false);
    }

    private JSONArray a(Bundle bundle, MaxAdFormat maxAdFormat, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putDouble(jSONObject2, "bidfloor", bundle.getDouble("bidfloor", 0.0d));
        if (maxAdFormat.isAdViewAd()) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putInt(jSONObject3, "w", bundle.getInt("width", maxAdFormat.getSize().getWidth()));
            JsonUtils.putInt(jSONObject3, "h", bundle.getInt("height", maxAdFormat.getSize().getHeight()));
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(3);
            jSONArray2.put(5);
            jSONArray2.put(6);
            JsonUtils.putJsonArray(jSONObject3, "api", jSONArray2);
            JsonUtils.putJSONObject(jSONObject2, "banner", jSONObject3);
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    private JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    public JSONObject a() {
        Map A8;
        JSONObject jSONObject = new JSONObject();
        if (this.f11737a.y() != null) {
            A8 = this.f11737a.y().b();
        } else {
            A8 = this.f11737a.x().A();
        }
        JsonUtils.putObject(jSONObject, "gdpr", A8.get("IABTCF_gdprApplies"));
        Boolean b = y3.a().b(com.applovin.impl.sdk.k.k());
        if (b != null) {
            JsonUtils.putString(jSONObject, "us_privacy", b.booleanValue() ? "1YY-" : "1YN-");
        }
        return jSONObject;
    }

    public com.applovin.impl.sdk.network.a a(String str, String str2, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, a aVar, Map map, boolean z8, com.applovin.impl.sdk.k kVar) {
        Map a6;
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            Q7.n0.s("Creating OpenRTB request with ", str2, kVar.L(), this.b);
        }
        Bundle customParameters = maxAdapterResponseParameters.getCustomParameters();
        Context k6 = com.applovin.impl.sdk.k.k();
        if (kVar.y() != null) {
            a6 = kVar.y().d();
        } else {
            a6 = kVar.x().a(false);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", str2);
        JsonUtils.putBoolean(jSONObject, "test", maxAdapterResponseParameters.isTesting());
        JsonUtils.putJsonArrayIfValid(jSONObject, "imp", a(customParameters, maxAdFormat, aVar.b));
        JsonUtils.putJSONObjectIfValid(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, a(customParameters, aVar.f11740c, k6));
        JsonUtils.putJSONObjectIfValid(jSONObject, "device", a(aVar.f11741d, a6, kVar));
        JsonUtils.putJSONObjectIfValid(jSONObject, "user", b(aVar.f11742e));
        JsonUtils.putJSONObjectIfValid(jSONObject, "source", a(aVar.f11743f));
        JsonUtils.putJSONObjectIfValid(jSONObject, "regs", a(aVar.f11744g, k6));
        JsonUtils.putJSONObjectIfValid(jSONObject, "format", a(a6));
        JsonUtils.putJSONObjectIfValid(jSONObject, "ext", aVar.f11739a);
        return com.applovin.impl.sdk.network.a.a(kVar).b(str).c("POST").a(map).a(jSONObject).a((Object) new JSONObject()).a(false).b(z8).a();
    }

    private JSONObject a(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ua", String.valueOf(map.get("ua")));
        JsonUtils.putBoolean(jSONObject2, "dnt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putBoolean(jSONObject2, "lmt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putString(jSONObject2, "ifa", String.valueOf(map.get("idfa")));
        JsonUtils.putString(jSONObject2, "make", String.valueOf(map.get("brand_name")));
        JsonUtils.putString(jSONObject2, "model", String.valueOf(map.get("model")));
        JsonUtils.putString(jSONObject2, "os", "android");
        JsonUtils.putString(jSONObject2, "osv", String.valueOf(map.get("os")));
        JsonUtils.putInt(jSONObject2, "devicetype", 1);
        JsonUtils.putInt(jSONObject2, "connectiontype", c4.h(kVar));
        JsonUtils.putInt(jSONObject2, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject2, "h", ((Integer) map.get("dy")).intValue());
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Boolean b = y3.c().b(context);
        if (b != null) {
            JsonUtils.putBoolean(jSONObject2, "coppa", b.booleanValue());
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject, "h", ((Integer) map.get("dy")).intValue());
        return jSONObject;
    }

    private static JSONObject a(Context context) {
        PackageInfo packageInfo;
        JSONObject jSONObject = f11736d;
        if (jSONObject != null) {
            return jSONObject;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "name", packageManager.getApplicationLabel(applicationInfo).toString());
        JsonUtils.putString(jSONObject2, "bundle", applicationInfo.packageName);
        JsonUtils.putString(jSONObject2, "ver", packageInfo != null ? packageInfo.versionName : "");
        f11736d = jSONObject2;
        return jSONObject2;
    }
}

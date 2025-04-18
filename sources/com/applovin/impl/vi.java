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
    private static JSONObject f8514d;
    protected final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f8515b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f8516c = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());

    /* loaded from: classes.dex */
    public static class a {
        private final JSONObject a;

        /* renamed from: b, reason: collision with root package name */
        private final JSONObject f8517b;

        /* renamed from: c, reason: collision with root package name */
        private final JSONObject f8518c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f8519d;

        /* renamed from: e, reason: collision with root package name */
        private final JSONObject f8520e;

        /* renamed from: f, reason: collision with root package name */
        private final JSONObject f8521f;

        /* renamed from: g, reason: collision with root package name */
        private final JSONObject f8522g;

        /* renamed from: com.applovin.impl.vi$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0039a {
            private JSONObject a;

            /* renamed from: b, reason: collision with root package name */
            private JSONObject f8523b;

            /* renamed from: c, reason: collision with root package name */
            private JSONObject f8524c;

            /* renamed from: d, reason: collision with root package name */
            private JSONObject f8525d;

            /* renamed from: e, reason: collision with root package name */
            private JSONObject f8526e;

            /* renamed from: f, reason: collision with root package name */
            private JSONObject f8527f;

            /* renamed from: g, reason: collision with root package name */
            private JSONObject f8528g;

            public C0039a a(JSONObject jSONObject) {
                this.a = jSONObject;
                return this;
            }

            public C0039a b(JSONObject jSONObject) {
                this.f8523b = jSONObject;
                return this;
            }

            public C0039a c(JSONObject jSONObject) {
                this.f8528g = jSONObject;
                return this;
            }

            public C0039a d(JSONObject jSONObject) {
                this.f8526e = jSONObject;
                return this;
            }

            public String toString() {
                return "S2SApiService.Extensions.Builder(bidRequestExtObject=" + this.a + ", impExtObject=" + this.f8523b + ", appExtObject=" + this.f8524c + ", deviceExtObject=" + this.f8525d + ", userExtObject=" + this.f8526e + ", sourceExtObject=" + this.f8527f + ", regsExtObject=" + this.f8528g + ")";
            }

            public a a() {
                return new a(this.a, this.f8523b, this.f8524c, this.f8525d, this.f8526e, this.f8527f, this.f8528g);
            }
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
            this.a = jSONObject;
            this.f8517b = jSONObject2;
            this.f8518c = jSONObject3;
            this.f8519d = jSONObject4;
            this.f8520e = jSONObject5;
            this.f8521f = jSONObject6;
            this.f8522g = jSONObject7;
        }

        public static C0039a a() {
            return new C0039a();
        }
    }

    public vi(String str, com.applovin.impl.sdk.k kVar) {
        this.f8515b = str;
        this.a = kVar;
    }

    private JSONObject a(Bundle bundle, JSONObject jSONObject, Context context) {
        JSONObject a10 = a(context);
        JsonUtils.putString(a10, "domain", bundle.getString("domain", ""));
        JsonUtils.putString(a10, "storeurl", bundle.getString("storeurl", ""));
        JsonUtils.putJSONObjectIfValid(a10, "ext", jSONObject);
        return a10;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Boolean c10 = c();
        if (c10 != null && c10.booleanValue()) {
            JsonUtils.putBoolean(jSONObject, "did_consent", y3.b().b(com.applovin.impl.sdk.k.k()).booleanValue());
            JsonUtils.putString(jSONObject, "consent", this.a.m0().k());
        }
        return jSONObject;
    }

    public Boolean c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());
        String a10 = qj.f7237r.a();
        if (!defaultSharedPreferences.contains(a10)) {
            return null;
        }
        boolean z10 = false;
        String str = (String) sj.a(a10, "", String.class, defaultSharedPreferences, false);
        if (StringUtils.isValidString(str)) {
            if (str.equals("1") || str.equalsIgnoreCase("true")) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        Integer num = (Integer) sj.a(a10, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences, false);
        if (num != null && num.intValue() != Integer.MAX_VALUE) {
            if (num.intValue() > 0) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        Long l10 = (Long) sj.a(a10, Long.MAX_VALUE, Long.class, defaultSharedPreferences, false);
        if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
            if (l10.longValue() > 0) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        return (Boolean) sj.a(a10, Boolean.FALSE, Boolean.class, defaultSharedPreferences, false);
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
        Map A;
        JSONObject jSONObject = new JSONObject();
        if (this.a.y() != null) {
            A = this.a.y().b();
        } else {
            A = this.a.x().A();
        }
        JsonUtils.putObject(jSONObject, "gdpr", A.get("IABTCF_gdprApplies"));
        Boolean b3 = y3.a().b(com.applovin.impl.sdk.k.k());
        if (b3 != null) {
            JsonUtils.putString(jSONObject, "us_privacy", b3.booleanValue() ? "1YY-" : "1YN-");
        }
        return jSONObject;
    }

    public com.applovin.impl.sdk.network.a a(String str, String str2, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, a aVar, Map map, boolean z10, com.applovin.impl.sdk.k kVar) {
        Map a10;
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.v("Creating OpenRTB request with ", str2, kVar.L(), this.f8515b);
        }
        Bundle customParameters = maxAdapterResponseParameters.getCustomParameters();
        Context k10 = com.applovin.impl.sdk.k.k();
        if (kVar.y() != null) {
            a10 = kVar.y().d();
        } else {
            a10 = kVar.x().a(false);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", str2);
        JsonUtils.putBoolean(jSONObject, "test", maxAdapterResponseParameters.isTesting());
        JsonUtils.putJsonArrayIfValid(jSONObject, "imp", a(customParameters, maxAdFormat, aVar.f8517b));
        JsonUtils.putJSONObjectIfValid(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, a(customParameters, aVar.f8518c, k10));
        JsonUtils.putJSONObjectIfValid(jSONObject, "device", a(aVar.f8519d, a10, kVar));
        JsonUtils.putJSONObjectIfValid(jSONObject, "user", b(aVar.f8520e));
        JsonUtils.putJSONObjectIfValid(jSONObject, "source", a(aVar.f8521f));
        JsonUtils.putJSONObjectIfValid(jSONObject, "regs", a(aVar.f8522g, k10));
        JsonUtils.putJSONObjectIfValid(jSONObject, "format", a(a10));
        JsonUtils.putJSONObjectIfValid(jSONObject, "ext", aVar.a);
        return com.applovin.impl.sdk.network.a.a(kVar).b(str).c("POST").a(map).a(jSONObject).a((Object) new JSONObject()).a(false).b(z10).a();
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
        Boolean b3 = y3.c().b(context);
        if (b3 != null) {
            JsonUtils.putBoolean(jSONObject2, "coppa", b3.booleanValue());
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
        JSONObject jSONObject = f8514d;
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
        f8514d = jSONObject2;
        return jSONObject2;
    }
}

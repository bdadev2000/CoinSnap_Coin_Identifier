package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ul extends vi {

    /* renamed from: j, reason: collision with root package name */
    public static final Uri f11630j = Uri.parse("https://api.taboola.com/");

    /* renamed from: e, reason: collision with root package name */
    private final String f11631e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f11632f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f11633g;

    /* renamed from: h, reason: collision with root package name */
    private String f11634h;

    /* renamed from: i, reason: collision with root package name */
    private String f11635i;

    public ul(String str, String str2, String str3, com.applovin.impl.sdk.k kVar) {
        super("TaboolaApiService", kVar);
        this.f11634h = "init";
        this.f11635i = "";
        this.f11631e = str;
        this.f11632f = Uri.withAppendedPath(URLUtil.isValidUrl(str3) ? Uri.parse(str3) : f11630j, "2.0/json/" + str2);
        HashMap hashMap = new HashMap(3);
        this.f11633g = hashMap;
        hashMap.put("type", "mobile");
        hashMap.put("apiKey", str);
        hashMap.put("origin", "SERVER");
    }

    private JSONObject d() {
        Map A8;
        JSONObject jSONObject = new JSONObject();
        if (this.f11737a.y() != null) {
            A8 = this.f11737a.y().b();
        } else {
            A8 = this.f11737a.x().A();
        }
        Object obj = A8.get("IABTCF_gdprApplies");
        if (obj != null) {
            JsonUtils.putObject(jSONObject, "gdpr_applies", obj);
            JsonUtils.putString(jSONObject, "daisyBit", String.valueOf(A8.get("IABTCF_TCString")));
        }
        return jSONObject;
    }

    /* loaded from: classes.dex */
    public class a extends en {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdapterResponseParameters f11636n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AppLovinNativeAdLoadListener f11637o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
            super(aVar, kVar);
            this.f11636n = maxAdapterResponseParameters;
            this.f11637o = appLovinNativeAdLoadListener;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            if (i9 == 200 && jSONObject != null) {
                ul.this.f11634h = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "user", new JSONObject()), "session", "");
                this.f12278a.l0().a(new an(jSONObject, this.f11636n, MaxAdFormat.NATIVE, this.f11637o, this.f12278a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch " + this.f11636n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i9);
            }
            this.f11637o.onNativeAdLoadFailed(new AppLovinError(i9, "Taboola server returned with code: " + jSONObject));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch " + this.f11636n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i9);
            }
            this.f11637o.onNativeAdLoadFailed(new AppLovinError(i9, "Taboola server returned with code: " + jSONObject));
        }
    }

    /* loaded from: classes.dex */
    public class b extends en {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ vl f11639n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, vl vlVar) {
            super(aVar, kVar);
            this.f11639n = vlVar;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            if (i9 == 200 && jSONObject != null) {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "user", new JSONObject());
                ul.this.f11635i = JsonUtils.getString(jSONObject2, "id", "");
                this.f12278a.b(rj.f10494Q, ul.this.f11635i, ul.this.f11738c);
                this.f12278a.b(rj.f10495R, Long.valueOf(System.currentTimeMillis()), ul.this.f11738c);
                this.f11639n.onInitialized(true, null);
                return;
            }
            String h6 = com.mbridge.msdk.foundation.entity.o.h(i9, "Unable to fetch user id. Server returned ");
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, h6);
            }
            this.f11639n.onInitialized(false, h6);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch user id. Server returned " + i9);
            }
            this.f11639n.onInitialized(false, str2);
        }
    }

    private JSONObject c(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map l;
        if (this.f11737a.y() != null) {
            l = this.f11737a.y().d();
        } else {
            l = this.f11737a.x().l();
        }
        String valueOf = String.valueOf(l.get("ua"));
        String valueOf2 = String.valueOf(l.get("idfa"));
        String str = this.f11634h;
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_session")) {
            Object obj = localExtraParameters.get("taboola_session");
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session", str);
        JsonUtils.putString(jSONObject, "agent", valueOf);
        JsonUtils.putString(jSONObject, "device", valueOf2);
        JsonUtils.putString(jSONObject, "id", this.f11635i);
        JsonUtils.putString(jSONObject, "realip", maxAdapterResponseParameters.getServerParameters().getString("s2s_ip", ""));
        return jSONObject;
    }

    private void a(vl vlVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("app.type", "mobile");
        hashMap.put("app.apikey", this.f11631e);
        this.f11737a.l0().a(new b(com.applovin.impl.sdk.network.a.a(this.f11737a).b(this.f11632f.toString() + "/user.sync").c("GET").b(hashMap).a((Object) new JSONObject()).a(false).b(false).a(), this.f11737a, vlVar));
    }

    private JSONObject b(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "type", maxAdapterResponseParameters.getCustomParameters().getString("source_type", ""));
        JsonUtils.putString(jSONObject, "id", maxAdapterResponseParameters.getCustomParameters().getString("source_id", ""));
        JsonUtils.putString(jSONObject, "url", maxAdapterResponseParameters.getCustomParameters().getString("source_url", ""));
        return jSONObject;
    }

    private JSONObject d(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", a(maxAdapterResponseParameters, "taboola_view_id", ""));
        return jSONObject;
    }

    private Integer a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, Integer num) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
        }
        return Integer.valueOf(maxAdapterResponseParameters.getCustomParameters().getInt(str, num.intValue()));
    }

    private String a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, String str2) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return maxAdapterResponseParameters.getCustomParameters().getString(str, str2);
    }

    private JSONArray a(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        JsonUtils.putInt(jSONObject, "recCount", 1);
        JsonUtils.putString(jSONObject, "organicType", maxAdapterResponseParameters.getCustomParameters().getString("placement_type", "MIX"));
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_thumbnail_height") && localExtraParameters.containsKey("taboola_thumbnail_width")) {
            Integer a6 = a(maxAdapterResponseParameters, "taboola_thumbnail_height", (Integer) 0);
            Integer a9 = a(maxAdapterResponseParameters, "taboola_thumbnail_width", (Integer) 0);
            if (a6.intValue() > 0 && a9.intValue() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JsonUtils.putInt(jSONObject2, "width", a6.intValue());
                JsonUtils.putInt(jSONObject2, "height", a9.intValue());
                JsonUtils.putJSONObject(jSONObject, "thumbnail", jSONObject2);
            }
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, vl vlVar) {
        String str = (String) this.f11737a.a(rj.f10494Q, (Object) null, this.f11738c);
        Long l = (Long) this.f11737a.a(rj.f10495R, (Object) null, this.f11738c);
        if (!StringUtils.isValidString(str) || l == null) {
            a(vlVar);
        } else if (maxAdapterInitializationParameters.getServerParameters().getLong("user_id_expiration_millis", TimeUnit.DAYS.toMillis(30L)) - (System.currentTimeMillis() - l.longValue()) > TimeUnit.HOURS.toMillis(1L)) {
            this.f11635i = str;
            vlVar.onInitialized(true, null);
        } else {
            a(vlVar);
        }
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, new JSONObject(this.f11633g));
        JsonUtils.putJSONObject(jSONObject, "consent", d());
        JsonUtils.putJSONObject(jSONObject, "user", c(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, "source", b(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, d(maxAdapterResponseParameters));
        JsonUtils.putJsonArray(jSONObject, "placements", a(maxAdapterResponseParameters));
        this.f11737a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.f11737a).b(this.f11632f.toString() + "/recommendations.get").c("POST").a(jSONObject).a((Object) new JSONObject()).a(false).b(false).a(), this.f11737a, maxAdapterResponseParameters, appLovinNativeAdLoadListener));
    }
}

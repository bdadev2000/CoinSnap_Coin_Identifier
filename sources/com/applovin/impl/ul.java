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
    public static final Uri f8415j = Uri.parse("https://api.taboola.com/");

    /* renamed from: e, reason: collision with root package name */
    private final String f8416e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f8417f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f8418g;

    /* renamed from: h, reason: collision with root package name */
    private String f8419h;

    /* renamed from: i, reason: collision with root package name */
    private String f8420i;

    public ul(String str, String str2, String str3, com.applovin.impl.sdk.k kVar) {
        super("TaboolaApiService", kVar);
        this.f8419h = "init";
        this.f8420i = "";
        this.f8416e = str;
        this.f8417f = Uri.withAppendedPath(URLUtil.isValidUrl(str3) ? Uri.parse(str3) : f8415j, "2.0/json/" + str2);
        HashMap hashMap = new HashMap(3);
        this.f8418g = hashMap;
        hashMap.put("type", "mobile");
        hashMap.put("apiKey", str);
        hashMap.put("origin", "SERVER");
    }

    private JSONObject d() {
        Map A;
        JSONObject jSONObject = new JSONObject();
        if (this.a.y() != null) {
            A = this.a.y().b();
        } else {
            A = this.a.x().A();
        }
        Object obj = A.get("IABTCF_gdprApplies");
        if (obj != null) {
            JsonUtils.putObject(jSONObject, "gdpr_applies", obj);
            JsonUtils.putString(jSONObject, "daisyBit", String.valueOf(A.get("IABTCF_TCString")));
        }
        return jSONObject;
    }

    /* loaded from: classes.dex */
    public class a extends en {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdapterResponseParameters f8421n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AppLovinNativeAdLoadListener f8422o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
            super(aVar, kVar);
            this.f8421n = maxAdapterResponseParameters;
            this.f8422o = appLovinNativeAdLoadListener;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200 && jSONObject != null) {
                ul.this.f8419h = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "user", new JSONObject()), "session", "");
                this.a.l0().a(new an(jSONObject, this.f8421n, MaxAdFormat.NATIVE, this.f8422o, this.a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch " + this.f8421n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i10);
            }
            this.f8422o.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch " + this.f8421n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i10);
            }
            this.f8422o.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject));
        }
    }

    /* loaded from: classes.dex */
    public class b extends en {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ vl f8424n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, vl vlVar) {
            super(aVar, kVar);
            this.f8424n = vlVar;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200 && jSONObject != null) {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "user", new JSONObject());
                ul.this.f8420i = JsonUtils.getString(jSONObject2, "id", "");
                this.a.b(rj.Q, ul.this.f8420i, ul.this.f8516c);
                this.a.b(rj.R, Long.valueOf(System.currentTimeMillis()), ul.this.f8516c);
                this.f8424n.onInitialized(true, null);
                return;
            }
            String i11 = eb.j.i("Unable to fetch user id. Server returned ", i10);
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, i11);
            }
            this.f8424n.onInitialized(false, i11);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch user id. Server returned " + i10);
            }
            this.f8424n.onInitialized(false, str2);
        }
    }

    private JSONObject c(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map l10;
        if (this.a.y() != null) {
            l10 = this.a.y().d();
        } else {
            l10 = this.a.x().l();
        }
        String valueOf = String.valueOf(l10.get("ua"));
        String valueOf2 = String.valueOf(l10.get("idfa"));
        String str = this.f8419h;
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
        JsonUtils.putString(jSONObject, "id", this.f8420i);
        JsonUtils.putString(jSONObject, "realip", maxAdapterResponseParameters.getServerParameters().getString("s2s_ip", ""));
        return jSONObject;
    }

    private void a(vl vlVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("app.type", "mobile");
        hashMap.put("app.apikey", this.f8416e);
        this.a.l0().a(new b(com.applovin.impl.sdk.network.a.a(this.a).b(this.f8417f.toString() + "/user.sync").c("GET").b(hashMap).a((Object) new JSONObject()).a(false).b(false).a(), this.a, vlVar));
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
            Integer a10 = a(maxAdapterResponseParameters, "taboola_thumbnail_height", (Integer) 0);
            Integer a11 = a(maxAdapterResponseParameters, "taboola_thumbnail_width", (Integer) 0);
            if (a10.intValue() > 0 && a11.intValue() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JsonUtils.putInt(jSONObject2, "width", a10.intValue());
                JsonUtils.putInt(jSONObject2, "height", a11.intValue());
                JsonUtils.putJSONObject(jSONObject, "thumbnail", jSONObject2);
            }
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, vl vlVar) {
        String str = (String) this.a.a(rj.Q, (Object) null, this.f8516c);
        Long l10 = (Long) this.a.a(rj.R, (Object) null, this.f8516c);
        if (!StringUtils.isValidString(str) || l10 == null) {
            a(vlVar);
        } else if (maxAdapterInitializationParameters.getServerParameters().getLong("user_id_expiration_millis", TimeUnit.DAYS.toMillis(30L)) - (System.currentTimeMillis() - l10.longValue()) > TimeUnit.HOURS.toMillis(1L)) {
            this.f8420i = str;
            vlVar.onInitialized(true, null);
        } else {
            a(vlVar);
        }
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, new JSONObject(this.f8418g));
        JsonUtils.putJSONObject(jSONObject, "consent", d());
        JsonUtils.putJSONObject(jSONObject, "user", c(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, "source", b(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, d(maxAdapterResponseParameters));
        JsonUtils.putJsonArray(jSONObject, "placements", a(maxAdapterResponseParameters));
        this.a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.a).b(this.f8417f.toString() + "/recommendations.get").c("POST").a(jSONObject).a((Object) new JSONObject()).a(false).b(false).a(), this.a, maxAdapterResponseParameters, appLovinNativeAdLoadListener));
    }
}

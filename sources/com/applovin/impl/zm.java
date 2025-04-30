package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import c7.C0665z;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zm extends xl {

    /* renamed from: o, reason: collision with root package name */
    private static JSONObject f12665o;

    /* renamed from: p, reason: collision with root package name */
    private static JSONObject f12666p;

    /* renamed from: q, reason: collision with root package name */
    private static JSONObject f12667q;

    /* renamed from: h, reason: collision with root package name */
    protected final JSONObject f12668h;

    /* renamed from: i, reason: collision with root package name */
    protected final MaxAdapterResponseParameters f12669i;

    /* renamed from: j, reason: collision with root package name */
    protected final MaxAdFormat f12670j;

    /* renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f12671k;
    private final AppLovinAdSize l;
    private final AppLovinAdType m;

    /* renamed from: n, reason: collision with root package name */
    protected String f12672n;

    public zm(String str, JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f12668h = jSONObject;
        this.f12669i = maxAdapterResponseParameters;
        this.f12670j = maxAdFormat;
        this.f12671k = kVar;
        this.l = a(maxAdFormat);
        this.m = b(maxAdFormat);
    }

    private static AppLovinAdType b(MaxAdFormat maxAdFormat) {
        if (!maxAdFormat.isAdViewAd() && MaxAdFormat.INTERSTITIAL != maxAdFormat) {
            if (MaxAdFormat.NATIVE == maxAdFormat) {
                return AppLovinAdType.NATIVE;
            }
            if (MaxAdFormat.REWARDED == maxAdFormat) {
                return AppLovinAdType.INCENTIVIZED;
            }
            if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                return AppLovinAdType.AUTO_INCENTIVIZED;
            }
            if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                return AppLovinAdType.APP_OPEN;
            }
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
        return AppLovinAdType.REGULAR;
    }

    private JSONArray c(pg pgVar) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "id", 1);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, MimeTypes.BASE_TYPE_TEXT, pgVar.y());
        JsonUtils.putJSONObject(jSONObject, CampaignEx.JSON_KEY_TITLE, jSONObject2);
        jSONArray.put(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putInt(jSONObject3, "id", 8);
        JSONObject jSONObject4 = new JSONObject();
        JsonUtils.putString(jSONObject4, AppMeasurementSdk.ConditionalUserProperty.VALUE, pgVar.p());
        JsonUtils.putJSONObject(jSONObject3, DataSchemeDataSource.SCHEME_DATA, jSONObject4);
        jSONArray.put(jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JsonUtils.putInt(jSONObject5, "id", 4);
        JSONObject jSONObject6 = new JSONObject();
        JsonUtils.putString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, pgVar.q());
        JsonUtils.putJSONObject(jSONObject5, DataSchemeDataSource.SCHEME_DATA, jSONObject6);
        jSONArray.put(jSONObject5);
        if (StringUtils.isValidString(pgVar.w())) {
            JSONObject jSONObject7 = new JSONObject();
            JsonUtils.putInt(jSONObject7, "id", 2);
            JSONObject jSONObject8 = new JSONObject();
            JsonUtils.putString(jSONObject8, "url", pgVar.w());
            JsonUtils.putInt(jSONObject8, "w", pgVar.x());
            JsonUtils.putInt(jSONObject8, "h", pgVar.v());
            JsonUtils.putJSONObject(jSONObject7, "img", jSONObject8);
            jSONArray.put(jSONObject7);
        }
        return jSONArray;
    }

    private JSONArray d(pg pgVar) {
        JSONArray jSONArray = new JSONArray();
        for (String str : pgVar.t()) {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "url", str);
            JsonUtils.putInt(jSONObject, NotificationCompat.CATEGORY_EVENT, 1);
            JsonUtils.putInt(jSONObject, "method", 1);
            jSONArray.put(jSONObject);
        }
        for (String str2 : pgVar.u()) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "url", str2);
            JsonUtils.putInt(jSONObject2, "type", 1);
            JsonUtils.putInt(jSONObject2, "method", 2);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private JSONObject e() {
        JSONObject jSONObject = f12665o;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putString(jSONObject2, "base_url", C0665z.FILE_SCHEME);
        JsonUtils.putString(jSONObject2, "graphic_background_color", "#000000");
        JsonUtils.putBoolean(jSONObject2, "lock_current_orientation", true);
        JsonUtils.putBoolean(jSONObject2, "omsdk_enabled", false);
        JsonUtils.putBoolean(jSONObject2, "playback_requires_user_action", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putBoolean(jSONObject2, "unhide_adview_on_render", true);
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", g());
        f12665o = jSONObject2;
        return jSONObject2;
    }

    private JSONObject f() {
        JSONObject jSONObject = f12666p;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putBoolean(jSONObject2, "uerp", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", g());
        f12666p = jSONObject2;
        return jSONObject2;
    }

    private static JSONObject g() {
        JSONObject jSONObject = f12667q;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putBoolean(jSONObject2, "allow_file_access", true);
        f12667q = jSONObject2;
        return jSONObject2;
    }

    public JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject e4 = e();
        JsonUtils.putAll(e4, JsonUtils.deserialize(this.f12669i.getServerParameters().getString("ad_object")));
        JsonUtils.putString(e4, "html", str);
        JsonUtils.putJSONObject(e4, "click_tracking_urls", jSONObject);
        JsonUtils.putJSONObject(e4, "imp_urls", jSONObject2);
        return e4;
    }

    public JSONObject a(pg pgVar) {
        JSONObject f9 = f();
        JsonUtils.putAll(f9, JsonUtils.deserialize(this.f12669i.getServerParameters().getString("ad_object")));
        JsonUtils.putJSONObject(f9, "ortb_response", b(pgVar));
        return f9;
    }

    private JSONObject b(pg pgVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArray(jSONObject, "assets", c(pgVar));
        JsonUtils.putJSONObject(jSONObject, "link", e(pgVar));
        JsonUtils.putJsonArray(jSONObject, "eventtrackers", d(pgVar));
        JsonUtils.putString(jSONObject, "ver", pgVar.z());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObject(jSONObject2, "native", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putString(jSONObject3, "version", pgVar.z());
        JsonUtils.putJSONObject(jSONObject3, AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
        return jSONObject3;
    }

    private static AppLovinAdSize a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isFullscreenAd()) {
            return AppLovinAdSize.INTERSTITIAL;
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return AppLovinAdSize.BANNER;
        }
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return AppLovinAdSize.LEADER;
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return AppLovinAdSize.MREC;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdSize.NATIVE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private JSONObject e(pg pgVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "url", pgVar.r());
        JsonUtils.putJsonArray(jSONObject, "clicktrackers", pgVar.s());
        return jSONObject;
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ad_size", this.l.toString());
        JsonUtils.putString(jSONObject2, "ad_type", this.m.toString());
        JsonUtils.putString(jSONObject2, "dsp_name", this.f12672n);
        JsonUtils.putInt(jSONObject2, NotificationCompat.CATEGORY_STATUS, 200);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JsonUtils.putJsonArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray);
        return jSONObject2;
    }
}

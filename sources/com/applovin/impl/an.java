package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.pg;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class an extends zm {

    /* renamed from: r, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f6766r;

    /* renamed from: s, reason: collision with root package name */
    private final pg.a f6767s;

    /* renamed from: t, reason: collision with root package name */
    private String f6768t;

    /* renamed from: u, reason: collision with root package name */
    private String f6769u;

    /* renamed from: v, reason: collision with root package name */
    private String f6770v;

    /* renamed from: w, reason: collision with root package name */
    private String f6771w;

    public an(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessTaboolaAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.f6767s = pg.o();
        this.f6768t = "";
        this.f6769u = "";
        this.f6770v = "";
        this.f6771w = null;
        this.f6766r = appLovinNativeAdLoadListener;
    }

    private String a(Object obj, String str, String str2) {
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonUtils.getString(jSONObject, "onEvent", "");
        String string2 = JsonUtils.getString(jSONObject, "type", "");
        if (StringUtils.isValidString(str) && !str.equalsIgnoreCase(string)) {
            return null;
        }
        if (!StringUtils.isValidString(str2) || str2.equalsIgnoreCase(string2)) {
            return JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
        }
        return null;
    }

    public JSONObject h() {
        JSONObject a6 = a(this.f6767s.a());
        JsonUtils.putString(a6, "cache_prefix", "taboola_");
        JsonUtils.putString(a6, "type", "taboola");
        JsonUtils.putString(a6, CampaignEx.JSON_KEY_PRIVACY_URL, this.f6771w);
        return a6;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject optJSONObject;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f12668h, "placements", new JSONArray());
        if (jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f6766r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "list", new JSONArray());
        String string = JsonUtils.getString(jSONObject, "name", "");
        if (jSONArray2.length() == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f6766r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray2, 0, new JSONObject());
        this.f6768t = JsonUtils.getString(jSONObject2, "id", "");
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a("TaskProcessTaboolaAd", Q7.n0.m(new StringBuilder("Processing Taboola ad ("), this.f6768t, ") for placement: ", string, "..."));
        }
        this.f6769u = JsonUtils.getString(jSONObject2, "type", "");
        this.f6770v = JsonUtils.getString(jSONObject2, "origin", "");
        this.f6771w = JsonUtils.getString(jSONObject2, "discloser", null);
        this.f6767s.f("Taboola_2.0");
        this.f6767s.e(JsonUtils.getString(jSONObject2, "name", ""));
        this.f6767s.a(JsonUtils.getString(jSONObject2, "branding", ""));
        this.f6767s.b(JsonUtils.getString(jSONObject2, "description", ""));
        this.f6767s.c(JsonUtils.getString(jSONObject2, "url", null));
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, "thumbnail", new JSONArray());
        if (jSONArray3.length() > 0 && (optJSONObject = jSONArray3.optJSONObject(0)) != null) {
            this.f6767s.d(JsonUtils.getString(optJSONObject, "url", null));
            this.f6767s.b(JsonUtils.getInt(optJSONObject, "width", 0));
            this.f6767s.a(JsonUtils.getInt(optJSONObject, "height", 0));
        }
        JSONArray jSONArray4 = JsonUtils.getJSONArray(jSONObject2, "beacons", null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "events", (JSONObject) null);
        JSONArray jSONArray5 = JsonUtils.getJSONArray(JsonUtils.getJSONObject(this.f12668h, "user", (JSONObject) null), "beacons", null);
        this.f6767s.a(a(jSONObject3, jSONArray4));
        this.f6767s.b(a(jSONArray4, jSONArray5));
        this.f6767s.a(a(jSONObject3, jSONArray4, jSONArray5));
        JSONObject a6 = a(h());
        if (com.applovin.impl.sdk.t.a()) {
            L.v("Starting render task for Taboola ad: ", string, "...", this.f12279c, "TaskProcessTaboolaAd");
        }
        this.f12671k.l0().a((xl) new xm(a6, this.f6766r, this.f12671k), sm.b.CORE);
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        String string = JsonUtils.getString(jSONObject, CampaignEx.JSON_NATIVE_VIDEO_CLICK, null);
        if (StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                Q7.n0.s("Processed click tracking URL: ", string, this.f12279c, "TaskProcessTaboolaAd");
            }
            jSONArray2.put(string);
        }
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                String a6 = a(JsonUtils.getObjectAtIndex(jSONArray, i9, null), CampaignEx.JSON_NATIVE_VIDEO_CLICK, "pixel");
                if (!TextUtils.isEmpty(a6)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        Q7.n0.s("Processed click tracking URL: ", a6, this.f12279c, "TaskProcessTaboolaAd");
                    }
                    jSONArray2.put(a6);
                }
            }
        }
        return jSONArray2;
    }

    private List a(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        String string = JsonUtils.getString(jSONObject, "available", null);
        if (StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                Q7.n0.s("Processed impression URL: ", string, this.f12279c, "TaskProcessTaboolaAd");
            }
            arrayList.add(string);
        }
        String string2 = JsonUtils.getString(jSONObject, "visible", null);
        if (StringUtils.isValidString(string2)) {
            if (com.applovin.impl.sdk.t.a()) {
                Q7.n0.s("Processed impression URL: ", string2, this.f12279c, "TaskProcessTaboolaAd");
            }
            arrayList.add(string2);
        }
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i9, null);
                String a6 = a(objectAtIndex, "available", "pixel");
                if (!StringUtils.isValidString(a6)) {
                    a6 = a(objectAtIndex, "visible", "pixel");
                }
                if (!TextUtils.isEmpty(a6)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        Q7.n0.s("Processed impression URL: ", a6, this.f12279c, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(a6);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String a9 = a(JsonUtils.getObjectAtIndex(jSONArray2, i10, null), (String) null, "pixel");
                if (!TextUtils.isEmpty(a9)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        Q7.n0.s("Processed impression URL: ", a9, this.f12279c, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(a9);
                }
            }
        }
        return arrayList;
    }

    private List a(JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                String a6 = a(JsonUtils.getObjectAtIndex(jSONArray, i9, null), (String) null, "script");
                if (!TextUtils.isEmpty(a6)) {
                    arrayList.add(Uri.decode(a6));
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String a9 = a(JsonUtils.getObjectAtIndex(jSONArray2, i10, null), (String) null, "script");
                if (!TextUtils.isEmpty(a9)) {
                    arrayList.add(Uri.decode(a9));
                }
            }
        }
        return arrayList;
    }
}

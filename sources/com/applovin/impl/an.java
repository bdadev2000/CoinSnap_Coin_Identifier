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
    private final AppLovinNativeAdLoadListener f3773r;

    /* renamed from: s, reason: collision with root package name */
    private final pg.a f3774s;

    /* renamed from: t, reason: collision with root package name */
    private String f3775t;
    private String u;

    /* renamed from: v, reason: collision with root package name */
    private String f3776v;

    /* renamed from: w, reason: collision with root package name */
    private String f3777w;

    public an(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessTaboolaAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.f3774s = pg.o();
        this.f3775t = "";
        this.u = "";
        this.f3776v = "";
        this.f3777w = null;
        this.f3773r = appLovinNativeAdLoadListener;
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
        JSONObject a = a(this.f3774s.a());
        JsonUtils.putString(a, "cache_prefix", "taboola_");
        JsonUtils.putString(a, "type", "taboola");
        JsonUtils.putString(a, CampaignEx.JSON_KEY_PRIVACY_URL, this.f3777w);
        return a;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject optJSONObject;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f9475h, "placements", new JSONArray());
        if (jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f3773r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "list", new JSONArray());
        String string = JsonUtils.getString(jSONObject, "name", "");
        if (jSONArray2.length() == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f3773r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray2, 0, new JSONObject());
        this.f3775t = JsonUtils.getString(jSONObject2, "id", "");
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a("TaskProcessTaboolaAd", a4.j.k(new StringBuilder("Processing Taboola ad ("), this.f3775t, ") for placement: ", string, "..."));
        }
        this.u = JsonUtils.getString(jSONObject2, "type", "");
        this.f3776v = JsonUtils.getString(jSONObject2, "origin", "");
        this.f3777w = JsonUtils.getString(jSONObject2, "discloser", null);
        this.f3774s.f("Taboola_2.0");
        this.f3774s.e(JsonUtils.getString(jSONObject2, "name", ""));
        this.f3774s.a(JsonUtils.getString(jSONObject2, "branding", ""));
        this.f3774s.b(JsonUtils.getString(jSONObject2, "description", ""));
        this.f3774s.c(JsonUtils.getString(jSONObject2, "url", null));
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, "thumbnail", new JSONArray());
        if (jSONArray3.length() > 0 && (optJSONObject = jSONArray3.optJSONObject(0)) != null) {
            this.f3774s.d(JsonUtils.getString(optJSONObject, "url", null));
            this.f3774s.b(JsonUtils.getInt(optJSONObject, "width", 0));
            this.f3774s.a(JsonUtils.getInt(optJSONObject, "height", 0));
        }
        JSONArray jSONArray4 = JsonUtils.getJSONArray(jSONObject2, "beacons", null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "events", (JSONObject) null);
        JSONArray jSONArray5 = JsonUtils.getJSONArray(JsonUtils.getJSONObject(this.f9475h, "user", (JSONObject) null), "beacons", null);
        this.f3774s.a(a(jSONObject3, jSONArray4));
        this.f3774s.b(a(jSONArray4, jSONArray5));
        this.f3774s.a(a(jSONObject3, jSONArray4, jSONArray5));
        JSONObject a = a(h());
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.x("Starting render task for Taboola ad: ", string, "...", this.f9061c, "TaskProcessTaboolaAd");
        }
        this.f9478k.l0().a((xl) new xm(a, this.f3773r, this.f9478k), sm.b.CORE);
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        String string = JsonUtils.getString(jSONObject, CampaignEx.JSON_NATIVE_VIDEO_CLICK, null);
        if (StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Processed click tracking URL: ", string, this.f9061c, "TaskProcessTaboolaAd");
            }
            jSONArray2.put(string);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String a = a(JsonUtils.getObjectAtIndex(jSONArray, i10, null), CampaignEx.JSON_NATIVE_VIDEO_CLICK, "pixel");
                if (!TextUtils.isEmpty(a)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        a4.j.v("Processed click tracking URL: ", a, this.f9061c, "TaskProcessTaboolaAd");
                    }
                    jSONArray2.put(a);
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
                a4.j.v("Processed impression URL: ", string, this.f9061c, "TaskProcessTaboolaAd");
            }
            arrayList.add(string);
        }
        String string2 = JsonUtils.getString(jSONObject, "visible", null);
        if (StringUtils.isValidString(string2)) {
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Processed impression URL: ", string2, this.f9061c, "TaskProcessTaboolaAd");
            }
            arrayList.add(string2);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                String a = a(objectAtIndex, "available", "pixel");
                if (!StringUtils.isValidString(a)) {
                    a = a(objectAtIndex, "visible", "pixel");
                }
                if (!TextUtils.isEmpty(a)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        a4.j.v("Processed impression URL: ", a, this.f9061c, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(a);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String a10 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, null), (String) null, "pixel");
                if (!TextUtils.isEmpty(a10)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        a4.j.v("Processed impression URL: ", a10, this.f9061c, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(a10);
                }
            }
        }
        return arrayList;
    }

    private List a(JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String a = a(JsonUtils.getObjectAtIndex(jSONArray, i10, null), (String) null, "script");
                if (!TextUtils.isEmpty(a)) {
                    arrayList.add(Uri.decode(a));
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String a10 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, null), (String) null, "script");
                if (!TextUtils.isEmpty(a10)) {
                    arrayList.add(Uri.decode(a10));
                }
            }
        }
        return arrayList;
    }
}

package com.applovin.impl;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ym extends zm implements AppLovinAdLoadListener {

    /* renamed from: r, reason: collision with root package name */
    private final String f12438r;

    /* renamed from: s, reason: collision with root package name */
    private final AppLovinAdLoadListener f12439s;

    /* renamed from: t, reason: collision with root package name */
    private String f12440t;

    /* renamed from: u, reason: collision with root package name */
    private JSONObject f12441u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f12442v;

    /* renamed from: w, reason: collision with root package name */
    private String f12443w;

    public ym(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, String str, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNimbusAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.f12438r = str;
        this.f12439s = appLovinAdLoadListener;
    }

    private JSONObject a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                String string = jSONArray.getString(i9);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(string, "");
                }
            } catch (JSONException e4) {
                this.f12671k.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12671k.L().a(this.b, "Failed to retrieve tracking url with a non-String value.", e4);
                }
            }
        }
        return jSONObject;
    }

    private JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "Nimbus-Session-Id", this.f12438r);
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ((AppLovinAdImpl) appLovinAd).setMaxAdValue(CampaignEx.JSON_KEY_CREATIVE_ID, this.f12443w);
        this.f12439s.adReceived(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i9) {
        this.f12439s.failedToReceiveAd(i9);
    }

    public JSONObject h() {
        JSONObject a6 = a(this.f12440t, this.f12442v, this.f12441u);
        JsonUtils.putString(a6, "cache_prefix", "nimbus");
        JsonUtils.putString(a6, "type", "nimbus");
        JsonUtils.putJSONObject(a6, "http_headers_for_postbacks", i());
        return a6;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = JsonUtils.getString(this.f12668h, "markup", "");
        this.f12440t = string;
        if (TextUtils.isEmpty(string)) {
            this.f12439s.failedToReceiveAd(204);
            return;
        }
        String string2 = JsonUtils.getString(this.f12668h, "position", "");
        String string3 = JsonUtils.getString(this.f12668h, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, "");
        String string4 = JsonUtils.getString(this.f12668h, "auction_id", "");
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f12279c;
            StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("Processing Nimbus ad (", string2, ") for placement: ", string3, " with auction id: ");
            o3.append(string4);
            o3.append("...");
            tVar.a("TaskProcessNimbusAd", o3.toString());
        }
        this.f12672n = JsonUtils.getString(this.f12668h, "network", "");
        this.f12443w = JsonUtils.getString(this.f12668h, "crid", null);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f12668h, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, new JSONObject());
        this.f12442v = a(JsonUtils.getJSONArray(jSONObject, "click_trackers", null));
        this.f12441u = a(JsonUtils.getJSONArray(jSONObject, "impression_trackers", null));
        JSONObject h6 = h();
        JSONObject a6 = a(h6);
        if (com.applovin.impl.sdk.t.a()) {
            L.v("Starting render task for Nimbus ad: ", string2, "...", this.f12279c, "TaskProcessNimbusAd");
        }
        this.f12671k.l0().a((xl) new cn(h6, a6, this.f12439s, this.f12671k), sm.b.CORE);
    }
}

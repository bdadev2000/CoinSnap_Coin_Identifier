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
    private final String f9241r;

    /* renamed from: s, reason: collision with root package name */
    private final AppLovinAdLoadListener f9242s;

    /* renamed from: t, reason: collision with root package name */
    private String f9243t;
    private JSONObject u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f9244v;

    /* renamed from: w, reason: collision with root package name */
    private String f9245w;

    public ym(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, String str, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNimbusAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.f9241r = str;
        this.f9242s = appLovinAdLoadListener;
    }

    private JSONObject a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String string = jSONArray.getString(i10);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(string, "");
                }
            } catch (JSONException e2) {
                this.f9478k.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9478k.L().a(this.f9060b, "Failed to retrieve tracking url with a non-String value.", e2);
                }
            }
        }
        return jSONObject;
    }

    private JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "Nimbus-Session-Id", this.f9241r);
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ((AppLovinAdImpl) appLovinAd).setMaxAdValue(CampaignEx.JSON_KEY_CREATIVE_ID, this.f9245w);
        this.f9242s.adReceived(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        this.f9242s.failedToReceiveAd(i10);
    }

    public JSONObject h() {
        JSONObject a = a(this.f9243t, this.f9244v, this.u);
        JsonUtils.putString(a, "cache_prefix", "nimbus");
        JsonUtils.putString(a, "type", "nimbus");
        JsonUtils.putJSONObject(a, "http_headers_for_postbacks", i());
        return a;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = JsonUtils.getString(this.f9475h, "markup", "");
        this.f9243t = string;
        if (TextUtils.isEmpty(string)) {
            this.f9242s.failedToReceiveAd(204);
            return;
        }
        String string2 = JsonUtils.getString(this.f9475h, "position", "");
        String string3 = JsonUtils.getString(this.f9475h, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, "");
        String string4 = JsonUtils.getString(this.f9475h, "auction_id", "");
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f9061c;
            StringBuilder p10 = a4.j.p("Processing Nimbus ad (", string2, ") for placement: ", string3, " with auction id: ");
            p10.append(string4);
            p10.append("...");
            tVar.a("TaskProcessNimbusAd", p10.toString());
        }
        this.f9481n = JsonUtils.getString(this.f9475h, "network", "");
        this.f9245w = JsonUtils.getString(this.f9475h, "crid", null);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9475h, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, new JSONObject());
        this.f9244v = a(JsonUtils.getJSONArray(jSONObject, "click_trackers", null));
        this.u = a(JsonUtils.getJSONArray(jSONObject, "impression_trackers", null));
        JSONObject h10 = h();
        JSONObject a = a(h10);
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.x("Starting render task for Nimbus ad: ", string2, "...", this.f9061c, "TaskProcessNimbusAd");
        }
        this.f9478k.l0().a((xl) new cn(h10, a, this.f9242s, this.f9478k), sm.b.CORE);
    }
}

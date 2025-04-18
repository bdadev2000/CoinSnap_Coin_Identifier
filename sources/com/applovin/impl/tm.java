package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tm extends xl implements mb {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f8286h;

    /* renamed from: i, reason: collision with root package name */
    private final h0 f8287i;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f8288j;

    public tm(JSONObject jSONObject, h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject != null) {
            if (h0Var != null) {
                this.f8286h = jSONObject;
                this.f8287i = h0Var;
                this.f8288j = appLovinAdLoadListener;
                return;
            }
            throw new IllegalArgumentException("No zone specified");
        }
        throw new IllegalArgumentException("No response specified");
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Starting task for AppLovin ad...");
            }
            this.a.l0().a(new cn(jSONObject, this.f8286h, this, this.a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Starting task for VAST ad...");
            }
            this.a.l0().a(bn.a(jSONObject, this.f8286h, this, this.a));
            return;
        }
        if ("js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Starting task for JS tag ad...");
            }
            this.a.l0().a(new um(jSONObject, this.f8286h, this, this.a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, vd.e.e("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8288j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.mb
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8288j;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8286h, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.k(this.f9060b, "No ads were returned from the server");
            }
            zp.a(this.f8287i.e(), this.f8287i.d(), this.f8286h, this.a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }
}

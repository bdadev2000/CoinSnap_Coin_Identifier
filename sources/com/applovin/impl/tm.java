package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class tm extends xl implements mb {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f11503h;

    /* renamed from: i, reason: collision with root package name */
    private final C0703h0 f11504i;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f11505j;

    public tm(JSONObject jSONObject, C0703h0 c0703h0, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject != null) {
            if (c0703h0 != null) {
                this.f11503h = jSONObject;
                this.f11504i = c0703h0;
                this.f11505j = appLovinAdLoadListener;
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
                this.f12279c.a(this.b, "Starting task for AppLovin ad...");
            }
            this.f12278a.l0().a(new cn(jSONObject, this.f11503h, this, this.f12278a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Starting task for VAST ad...");
            }
            this.f12278a.l0().a(bn.a(jSONObject, this.f11503h, this, this.f12278a));
            return;
        }
        if ("js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Starting task for JS tag ad...");
            }
            this.f12278a.l0().a(new um(jSONObject, this.f11503h, this, this.f12278a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, AbstractC2914a.d("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f11505j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i9) {
        failedToReceiveAdV2(new AppLovinError(i9, ""));
    }

    @Override // com.applovin.impl.mb
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f11505j;
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
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f11503h, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.k(this.b, "No ads were returned from the server");
            }
            zp.a(this.f11504i.e(), this.f11504i.d(), this.f11503h, this.f12278a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }
}

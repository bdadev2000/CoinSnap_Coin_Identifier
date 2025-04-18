package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f9065h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f9066i;

    public xm(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f9065h = jSONObject;
        this.f9066i = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f9065h, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Processing ad...");
            }
            this.a.l0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f9065h, this.f9066i, this.a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.k(this.f9060b, "No ads were returned from the server");
        }
        zp.a("native_native", MaxAdFormat.NATIVE, this.f9065h, this.a);
        this.f9066i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}

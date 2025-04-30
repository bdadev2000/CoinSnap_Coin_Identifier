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
    private final JSONObject f12283h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f12284i;

    public xm(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f12283h = jSONObject;
        this.f12284i = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f12283h, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Processing ad...");
            }
            this.f12278a.l0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f12283h, this.f12284i, this.f12278a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.k(this.b, "No ads were returned from the server");
        }
        zp.a("native_native", MaxAdFormat.NATIVE, this.f12283h, this.f12278a);
        this.f12284i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}

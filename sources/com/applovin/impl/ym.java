package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ym extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f28221h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f28222i;

    public ym(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessNativeAdResponse", jVar);
        this.f28221h = jSONObject;
        this.f28222i = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f28221h, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Processing ad...");
            }
            this.f28216a.j0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f28221h, this.f28222i, this.f28216a));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.k(this.f28217b, "No ads were returned from the server");
        }
        yp.a("native_native", MaxAdFormat.NATIVE, this.f28221h, this.f28216a);
        this.f28222i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}

package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class um extends yl implements rb {

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f27370h;

    /* renamed from: i, reason: collision with root package name */
    private final h0 f27371i;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f27372j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f27373k;

    public um(JSONObject jSONObject, h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        this(jSONObject, h0Var, false, appLovinAdLoadListener, jVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Starting task for AppLovin ad...");
            }
            this.f28216a.j0().a(new bn(jSONObject, this.f27370h, this, this.f28216a));
            return;
        }
        if (CreativeInfo.f29630r.equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Starting task for VAST ad...");
            }
            this.f28216a.j0().a(zm.a(jSONObject, this.f27370h, this, this.f28216a));
            return;
        }
        if ("js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Starting task for JS tag ad...");
            }
            this.f28216a.j0().a(new vm(jSONObject, this.f27370h, this, this.f28216a));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, androidx.compose.ui.platform.j.b("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f27372j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f27373k || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f28216a.E().a(la.f25011i, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        failedToReceiveAdV2(new AppLovinError(i2, ""));
    }

    @Override // com.applovin.impl.rb
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f27372j;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof rb) {
            ((rb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f27373k) {
            return;
        }
        this.f28216a.E().a(la.f25012j, this.f27371i, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f27370h, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.k(this.f28217b, "No ads were returned from the server");
            }
            yp.a(this.f27371i.e(), this.f27371i.d(), this.f27370h, this.f28216a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public um(JSONObject jSONObject, h0 h0Var, boolean z2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessAdResponse", jVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (h0Var == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f27370h = jSONObject;
        this.f27371i = h0Var;
        this.f27372j = appLovinAdLoadListener;
        this.f27373k = z2;
    }
}

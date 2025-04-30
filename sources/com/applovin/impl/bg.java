package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.vi;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class bg extends vi {

    /* renamed from: e, reason: collision with root package name */
    private final String f6862e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6863f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6864g;

    /* renamed from: h, reason: collision with root package name */
    private String f6865h;

    /* loaded from: classes.dex */
    public class a extends en {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdapterResponseParameters f6866n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f6867o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ AppLovinAdLoadListener f6868p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) {
            super(aVar, kVar);
            this.f6866n = maxAdapterResponseParameters;
            this.f6867o = maxAdFormat;
            this.f6868p = appLovinAdLoadListener;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            if (jSONObject != null && "No Bid".equalsIgnoreCase(JsonUtils.getString(jSONObject, "message", null))) {
                Object object = JsonUtils.getObject(jSONObject, "nbr", null);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "Nimbus request for " + this.f6866n.getThirdPartyAdPlacementId() + " returned with no fill code: " + object);
                }
                this.f6868p.failedToReceiveAd(204);
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch " + this.f6866n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i9);
            }
            this.f6868p.failedToReceiveAd(i9);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            if (i9 == 200 && jSONObject != null) {
                this.f12278a.l0().a(new ym(jSONObject, this.f6866n, this.f6867o, bg.this.f6865h, this.f6868p, this.f12278a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch " + this.f6866n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i9);
            }
            this.f6868p.failedToReceiveAd(i9);
        }
    }

    public bg(String str, String str2, String str3, com.applovin.impl.sdk.k kVar) {
        super("NimbusApiService", kVar);
        this.f6862e = str;
        this.f6865h = UUID.randomUUID().toString().toLowerCase(Locale.US);
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t L8 = kVar.L();
            String str4 = this.b;
            StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("Initializing Nimbus with apiKey=", str, ", pubId=", str2, ", sessionId=");
            o3.append(this.f6865h);
            L8.a(str4, o3.toString());
        }
        this.f6863f = AbstractC2914a.k("https://", str2, ".", StringUtils.isValidString(str3) ? str3 : "adsbynimbus.com/rta/v1");
        qj qjVar = rj.f10496S;
        String str5 = (String) kVar.a(qjVar, (Object) null, this.f11738c);
        if (TextUtils.isEmpty(str5)) {
            str5 = UUID.randomUUID().toString();
            kVar.b(qjVar, str5, this.f11738c);
        }
        this.f6864g = str5;
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            Q7.n0.s("Setting Nimbus instanceId=", str5, kVar.L(), this.b);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        a((MaxAdapterParameters) maxAdapterInitializationParameters);
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) {
        Map l;
        this.f11737a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f11737a.L().a(this.b, "Loading Nimbus " + maxAdFormat.getLabel() + " ad with position: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        }
        a(maxAdapterResponseParameters);
        if (this.f11737a.y() != null) {
            l = this.f11737a.y().d();
        } else {
            l = this.f11737a.x().l();
        }
        HashMap m = L.m("x-openrtb-version", "2.5");
        m.put("Nimbus-Api-Key", this.f6862e);
        m.put("Nimbus-Sdkv", "2.0.0");
        m.put("Nimbus-Instance-Id", this.f6864g);
        m.put(Command.HTTP_HEADER_USER_AGENT, String.valueOf(l.get("ua")));
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session_id", this.f6865h);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "position", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.f11737a.l0().a(new a(a(this.f6863f, UUID.randomUUID().toString().toLowerCase(Locale.US), maxAdapterResponseParameters, maxAdFormat, vi.a.a().a(jSONObject).c(a()).b(jSONObject2).d(b()).a(), m, true, this.f11737a), this.f11737a, maxAdapterResponseParameters, maxAdFormat, appLovinAdLoadListener));
    }

    private void a(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("session_id");
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isValidString(str)) {
                this.f11737a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11737a.L().a(this.b, "Updating Nimbus sessionId to " + obj);
                }
                this.f6865h = str;
            }
        }
    }
}

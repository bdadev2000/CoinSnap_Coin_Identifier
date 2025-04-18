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
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bg extends vi {

    /* renamed from: e, reason: collision with root package name */
    private final String f3880e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3881f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3882g;

    /* renamed from: h, reason: collision with root package name */
    private String f3883h;

    /* loaded from: classes.dex */
    public class a extends en {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdapterResponseParameters f3884n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f3885o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ AppLovinAdLoadListener f3886p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) {
            super(aVar, kVar);
            this.f3884n = maxAdapterResponseParameters;
            this.f3885o = maxAdFormat;
            this.f3886p = appLovinAdLoadListener;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (jSONObject != null && "No Bid".equalsIgnoreCase(JsonUtils.getString(jSONObject, PglCryptUtils.KEY_MESSAGE, null))) {
                Object object = JsonUtils.getObject(jSONObject, "nbr", null);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "Nimbus request for " + this.f3884n.getThirdPartyAdPlacementId() + " returned with no fill code: " + object);
                }
                this.f3886p.failedToReceiveAd(204);
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch " + this.f3884n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i10);
            }
            this.f3886p.failedToReceiveAd(i10);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200 && jSONObject != null) {
                this.a.l0().a(new ym(jSONObject, this.f3884n, this.f3885o, bg.this.f3883h, this.f3886p, this.a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch " + this.f3884n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i10);
            }
            this.f3886p.failedToReceiveAd(i10);
        }
    }

    public bg(String str, String str2, String str3, com.applovin.impl.sdk.k kVar) {
        super("NimbusApiService", kVar);
        this.f3880e = str;
        this.f3883h = UUID.randomUUID().toString().toLowerCase(Locale.US);
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t L = kVar.L();
            String str4 = this.f8515b;
            StringBuilder p10 = a4.j.p("Initializing Nimbus with apiKey=", str, ", pubId=", str2, ", sessionId=");
            p10.append(this.f3883h);
            L.a(str4, p10.toString());
        }
        this.f3881f = eb.j.l("https://", str2, ".", StringUtils.isValidString(str3) ? str3 : "adsbynimbus.com/rta/v1");
        qj qjVar = rj.S;
        String str5 = (String) kVar.a(qjVar, (Object) null, this.f8516c);
        if (TextUtils.isEmpty(str5)) {
            str5 = UUID.randomUUID().toString();
            kVar.b(qjVar, str5, this.f8516c);
        }
        this.f3882g = str5;
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.v("Setting Nimbus instanceId=", str5, kVar.L(), this.f8515b);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        a((MaxAdapterParameters) maxAdapterInitializationParameters);
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) {
        Map l10;
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a(this.f8515b, "Loading Nimbus " + maxAdFormat.getLabel() + " ad with position: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        }
        a(maxAdapterResponseParameters);
        if (this.a.y() != null) {
            l10 = this.a.y().d();
        } else {
            l10 = this.a.x().l();
        }
        HashMap q10 = a4.j.q("x-openrtb-version", "2.5");
        q10.put("Nimbus-Api-Key", this.f3880e);
        q10.put("Nimbus-Sdkv", "2.0.0");
        q10.put("Nimbus-Instance-Id", this.f3882g);
        q10.put(Command.HTTP_HEADER_USER_AGENT, String.valueOf(l10.get("ua")));
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session_id", this.f3883h);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "position", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.a.l0().a(new a(a(this.f3881f, UUID.randomUUID().toString().toLowerCase(Locale.US), maxAdapterResponseParameters, maxAdFormat, vi.a.a().a(jSONObject).c(a()).b(jSONObject2).d(b()).a(), q10, true, this.a), this.a, maxAdapterResponseParameters, maxAdFormat, appLovinAdLoadListener));
    }

    private void a(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("session_id");
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isValidString(str)) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a(this.f8515b, "Updating Nimbus sessionId to " + obj);
                }
                this.f3883h = str;
            }
        }
    }
}

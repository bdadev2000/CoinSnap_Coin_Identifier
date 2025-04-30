package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private String f14438a;
    private com.iab.omid.library.applovin.weakreference.b b;

    /* renamed from: c, reason: collision with root package name */
    private AdEvents f14439c;

    /* renamed from: d, reason: collision with root package name */
    private MediaEvents f14440d;

    /* renamed from: e, reason: collision with root package name */
    private a f14441e;

    /* renamed from: f, reason: collision with root package name */
    private long f14442f;

    /* loaded from: classes3.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f14438a = str;
        this.b = new com.iab.omid.library.applovin.weakreference.b(null);
    }

    public void a() {
        this.f14442f = f.b();
        this.f14441e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.b.clear();
    }

    public AdEvents c() {
        return this.f14439c;
    }

    public MediaEvents d() {
        return this.f14440d;
    }

    public boolean e() {
        return this.b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f14438a);
    }

    public void g() {
        h.a().b(getWebView(), this.f14438a);
    }

    public WebView getWebView() {
        return this.b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f9) {
        h.a().a(getWebView(), this.f14438a, f9);
    }

    public void b(String str, long j7) {
        if (j7 >= this.f14442f) {
            this.f14441e = a.AD_STATE_VISIBLE;
            h.a().a(getWebView(), this.f14438a, str);
        }
    }

    public void a(WebView webView) {
        this.b = new com.iab.omid.library.applovin.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f14439c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f14438a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f14438a, errorType, str);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.applovin.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.applovin.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.12-Applovin");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f14440d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j7) {
        if (j7 >= this.f14442f) {
            a aVar = this.f14441e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f14441e = aVar2;
                h.a().a(getWebView(), this.f14438a, str);
            }
        }
    }

    public void a(String str, @Nullable JSONObject jSONObject) {
        h.a().a(getWebView(), this.f14438a, str, jSONObject);
    }

    public void a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(@Nullable JSONObject jSONObject) {
        h.a().b(getWebView(), this.f14438a, jSONObject);
    }

    public void a(boolean z8) {
        if (e()) {
            h.a().b(getWebView(), this.f14438a, z8 ? "foregrounded" : "backgrounded");
        }
    }
}

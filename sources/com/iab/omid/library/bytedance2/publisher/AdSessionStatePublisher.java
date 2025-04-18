package com.iab.omid.library.bytedance2.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.ErrorType;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class AdSessionStatePublisher {
    private com.iab.omid.library.bytedance2.weakreference.b a;

    /* renamed from: b, reason: collision with root package name */
    private AdEvents f12269b;

    /* renamed from: c, reason: collision with root package name */
    private MediaEvents f12270c;

    /* renamed from: d, reason: collision with root package name */
    private a f12271d;

    /* renamed from: e, reason: collision with root package name */
    private long f12272e;

    /* loaded from: classes4.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        a();
        this.a = new com.iab.omid.library.bytedance2.weakreference.b(null);
    }

    public void a() {
        this.f12272e = f.b();
        this.f12271d = a.AD_STATE_IDLE;
    }

    public void b() {
        this.a.clear();
    }

    public AdEvents c() {
        return this.f12269b;
    }

    public MediaEvents d() {
        return this.f12270c;
    }

    public boolean e() {
        return this.a.get() != null;
    }

    public void f() {
        g.a().a(getWebView());
    }

    public void g() {
        g.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.a.get();
    }

    public void h() {
        g.a().c(getWebView());
    }

    public void i() {
    }

    public void a(float f10) {
        g.a().a(getWebView(), f10);
    }

    public void b(String str, long j3) {
        if (j3 >= this.f12272e) {
            this.f12271d = a.AD_STATE_VISIBLE;
            g.a().a(getWebView(), str);
        }
    }

    public void a(WebView webView) {
        this.a = new com.iab.omid.library.bytedance2.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f12269b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        g.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        g.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.bytedance2.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.bytedance2.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.4-Bytedance2");
        c.a(jSONObject4, "appId", com.iab.omid.library.bytedance2.internal.f.b().a().getApplicationContext().getPackageName());
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
        g.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f12270c = mediaEvents;
    }

    public void a(String str) {
        g.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j3) {
        if (j3 >= this.f12272e) {
            a aVar = this.f12271d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f12271d = aVar2;
                g.a().a(getWebView(), str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        g.a().a(getWebView(), str, jSONObject);
    }

    public void a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        g.a().c(getWebView(), jSONObject);
    }

    public void a(@NonNull JSONObject jSONObject) {
        g.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            g.a().b(getWebView(), z10 ? "foregrounded" : "backgrounded");
        }
    }
}

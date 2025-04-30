package com.applovin.impl;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.ue;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class um extends xl implements ue.a {

    /* renamed from: h */
    private final com.applovin.impl.sdk.ad.a f11641h;

    /* renamed from: i */
    private AppLovinAdLoadListener f11642i;

    /* renamed from: j */
    private com.applovin.impl.adview.b f11643j;

    public um(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessJavaScriptTagAd", kVar);
        this.f11641h = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, kVar);
        this.f11642i = appLovinAdLoadListener;
        kVar.U().a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Rendering AppLovin ad #" + this.f11641h.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new F0(this, 18));
    }

    /* loaded from: classes.dex */
    public class b extends com.applovin.impl.adview.c {
        private b(com.applovin.impl.sdk.k kVar) {
            super(null, kVar);
        }

        private boolean a(String str, oj ojVar) {
            Iterator it = um.this.f12278a.c(ojVar).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ b(um umVar, com.applovin.impl.sdk.k kVar, a aVar) {
            this(kVar);
        }

        @Override // com.applovin.impl.adview.c
        public boolean a(WebView webView, String str) {
            com.applovin.impl.sdk.t tVar = um.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                um umVar = um.this;
                umVar.f12279c.d(umVar.b, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.b)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!a(scheme, oj.Z1)) {
                return true;
            }
            if (a(host, oj.f9723a2)) {
                com.applovin.impl.sdk.t tVar2 = um.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    um umVar2 = um.this;
                    umVar2.f12279c.a(umVar2.b, "Ad load succeeded");
                }
                if (um.this.f11642i == null) {
                    return true;
                }
                um.this.f11642i.adReceived(um.this.f11641h);
                um.this.f11642i = null;
                return true;
            }
            if (a(host, oj.f9729b2)) {
                com.applovin.impl.sdk.t tVar3 = um.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    um umVar3 = um.this;
                    umVar3.f12279c.a(umVar3.b, "Ad load failed");
                }
                if (um.this.f11642i == null) {
                    return true;
                }
                um.this.f11642i.failedToReceiveAd(204);
                um.this.f11642i = null;
                return true;
            }
            com.applovin.impl.sdk.t tVar4 = um.this.f12279c;
            if (!com.applovin.impl.sdk.t.a()) {
                return true;
            }
            um umVar4 = um.this;
            umVar4.f12279c.b(umVar4.b, "Unrecognized webview event");
            return true;
        }
    }

    public /* synthetic */ void e() {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f12278a, a());
            this.f11643j = bVar;
            bVar.a(new b(this.f12278a));
            this.f11643j.loadDataWithBaseURL(this.f11641h.h(), this.f11641h.e1(), "text/html", null, "");
        } catch (Throwable th) {
            this.f12278a.U().b(this);
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Failed to initialize WebView", th);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f11642i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(-1);
                this.f11642i = null;
            }
        }
    }

    @Override // com.applovin.impl.ue.a
    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.f11641h.H())) {
            this.f12278a.U().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f11642i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f11641h);
                this.f11642i = null;
            }
        }
    }
}

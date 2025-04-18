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
    private final com.applovin.impl.sdk.ad.a f8426h;

    /* renamed from: i */
    private AppLovinAdLoadListener f8427i;

    /* renamed from: j */
    private com.applovin.impl.adview.b f8428j;

    public um(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessJavaScriptTagAd", kVar);
        this.f8426h = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, kVar);
        this.f8427i = appLovinAdLoadListener;
        kVar.U().a(this);
    }

    public static /* synthetic */ void e(um umVar) {
        umVar.e();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Rendering AppLovin ad #" + this.f8426h.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new nt(this, 18));
    }

    /* loaded from: classes.dex */
    public class b extends com.applovin.impl.adview.c {
        private b(com.applovin.impl.sdk.k kVar) {
            super(null, kVar);
        }

        private boolean a(String str, oj ojVar) {
            Iterator it = um.this.a.c(ojVar).iterator();
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
            com.applovin.impl.sdk.t tVar = um.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                um umVar = um.this;
                umVar.f9061c.d(umVar.f9060b, "Processing click on ad URL \"" + str + "\"");
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
            if (a(host, oj.f6615a2)) {
                com.applovin.impl.sdk.t tVar2 = um.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    um umVar2 = um.this;
                    umVar2.f9061c.a(umVar2.f9060b, "Ad load succeeded");
                }
                if (um.this.f8427i == null) {
                    return true;
                }
                um.this.f8427i.adReceived(um.this.f8426h);
                um.this.f8427i = null;
                return true;
            }
            if (a(host, oj.f6622b2)) {
                com.applovin.impl.sdk.t tVar3 = um.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    um umVar3 = um.this;
                    umVar3.f9061c.a(umVar3.f9060b, "Ad load failed");
                }
                if (um.this.f8427i == null) {
                    return true;
                }
                um.this.f8427i.failedToReceiveAd(204);
                um.this.f8427i = null;
                return true;
            }
            com.applovin.impl.sdk.t tVar4 = um.this.f9061c;
            if (!com.applovin.impl.sdk.t.a()) {
                return true;
            }
            um umVar4 = um.this;
            umVar4.f9061c.b(umVar4.f9060b, "Unrecognized webview event");
            return true;
        }
    }

    public /* synthetic */ void e() {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.a, a());
            this.f8428j = bVar;
            bVar.a(new b(this.a));
            this.f8428j.loadDataWithBaseURL(this.f8426h.h(), this.f8426h.e1(), "text/html", null, "");
        } catch (Throwable th2) {
            this.a.U().b(this);
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Failed to initialize WebView", th2);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8427i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(-1);
                this.f8427i = null;
            }
        }
    }

    @Override // com.applovin.impl.ue.a
    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.f8426h.H())) {
            this.a.U().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8427i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f8426h);
                this.f8427i = null;
            }
        }
    }
}

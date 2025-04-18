package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class rr extends com.applovin.impl.sdk.x {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.t f7398b;

    /* renamed from: c */
    private WebView f7399c;

    /* renamed from: d */
    private final Set f7400d = Collections.synchronizedSet(new HashSet());

    public rr(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f7398b = kVar.L();
    }

    public static /* synthetic */ void d(rr rrVar) {
        rrVar.a();
    }

    @Override // com.applovin.impl.sdk.x, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.f7399c) {
            AppLovinSdkUtils.runOnUiThread(new nt(this, 14));
        } else {
            b(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* renamed from: a */
    public void b(WebView webView) {
        if (webView == null || !this.f7400d.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new nt(webView, 15));
    }

    public /* synthetic */ void c(String str) {
        WebView a = a(str);
        if (a == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f7398b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
            }
        } else {
            this.f7400d.add(a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new rs(26, this, a), ((Integer) this.a.a(oj.X2)).intValue());
        }
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f7398b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f7398b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new rs(27, this, str));
        }
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new yv(11, this, eVar, appLovinPostbackListener));
    }

    public /* synthetic */ void a() {
        this.f7399c.destroy();
        this.f7399c = null;
    }

    private WebView a(String str) {
        zp.b();
        WebView b3 = zp.b(com.applovin.impl.sdk.k.k(), "web tracker");
        if (b3 == null) {
            return null;
        }
        b3.getSettings().setJavaScriptEnabled(true);
        b3.setWebViewClient(this);
        b3.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return b3;
    }

    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String appendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.a.a(oj.f6747r3)).booleanValue());
        if (this.f7399c == null) {
            WebView a = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>");
            this.f7399c = a;
            if (a == null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f7398b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                return;
            }
        }
        String f10 = com.applovin.impl.mediation.ads.e.f("al_firePostback('", appendQueryParameters, "')");
        if (x3.e()) {
            this.f7399c.evaluateJavascript(f10, null);
        } else {
            this.f7399c.loadUrl("javascript:" + f10);
        }
        appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
    }
}

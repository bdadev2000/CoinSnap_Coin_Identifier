package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class rr extends com.applovin.impl.sdk.x {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f10535a;
    private final com.applovin.impl.sdk.t b;

    /* renamed from: c */
    private WebView f10536c;

    /* renamed from: d */
    private final Set f10537d = Collections.synchronizedSet(new HashSet());

    public rr(com.applovin.impl.sdk.k kVar) {
        this.f10535a = kVar;
        this.b = kVar.L();
    }

    @Override // com.applovin.impl.sdk.x, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.f10536c) {
            AppLovinSdkUtils.runOnUiThread(new F0(this, 14));
        } else {
            b(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* renamed from: a */
    public void b(WebView webView) {
        if (webView == null || !this.f10537d.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new F0(webView, 15));
    }

    public /* synthetic */ void c(String str) {
        WebView a6 = a(str);
        if (a6 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
            }
        } else {
            this.f10537d.add(a6);
            AppLovinSdkUtils.runOnUiThreadDelayed(new F(26, this, a6), ((Integer) this.f10535a.a(oj.f9704X2)).intValue());
        }
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new F(27, this, str));
        }
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new O2(this, eVar, appLovinPostbackListener, 11));
    }

    public /* synthetic */ void a() {
        this.f10536c.destroy();
        this.f10536c = null;
    }

    private WebView a(String str) {
        zp.b();
        WebView b = zp.b(com.applovin.impl.sdk.k.k(), "web tracker");
        if (b == null) {
            return null;
        }
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebViewClient(this);
        b.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return b;
    }

    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String appendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f10535a.a(oj.f9841r3)).booleanValue());
        if (this.f10536c == null) {
            WebView a6 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>");
            this.f10536c = a6;
            if (a6 == null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                return;
            }
        }
        String e4 = AbstractC2914a.e("al_firePostback('", appendQueryParameters, "')");
        if (x3.e()) {
            this.f10536c.evaluateJavascript(e4, null);
        } else {
            this.f10536c.loadUrl("javascript:" + e4);
        }
        appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
    }
}

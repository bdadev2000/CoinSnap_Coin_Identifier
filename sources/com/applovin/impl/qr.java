package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class qr extends pi {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f26214a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.n f26215b;

    /* renamed from: c */
    private WebView f26216c;
    private boolean d;
    private final Set e = Collections.synchronizedSet(new HashSet());

    /* loaded from: classes2.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f30048a, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/qr$a;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f30048a, webView, str);
            safedk_qr$a_onPageFinished_40cfffa422b0f4d6be32f4a97689f39b(webView, str);
        }

        public void safedk_qr$a_onPageFinished_40cfffa422b0f4d6be32f4a97689f39b(WebView p02, String p12) {
            com.applovin.impl.sdk.n unused = qr.this.f26215b;
            if (com.applovin.impl.sdk.n.a()) {
                qr.this.f26215b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
            }
            qr.this.d = true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f30048a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f30048a, view, url, super.shouldInterceptRequest(view, url));
        }
    }

    public qr(com.applovin.impl.sdk.j jVar) {
        this.f26214a = jVar;
        this.f26215b = jVar.J();
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f30048a, view, url);
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f30048a, view, url);
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.f26216c) {
            AppLovinSdkUtils.runOnUiThread(new zu(this, 1));
        } else {
            b(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f30048a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f30048a, view, url, super.shouldInterceptRequest(view, url));
    }

    public /* synthetic */ void c(String str) {
        WebView a2 = a(str);
        if (a2 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f26215b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
            }
        } else {
            this.e.add(a2);
            AppLovinSdkUtils.runOnUiThreadDelayed(new ms(23, this, a2), ((Integer) this.f26214a.a(sj.d3)).intValue());
        }
    }

    private boolean d() {
        return ((Boolean) this.f26214a.a(sj.i3)).booleanValue();
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f26215b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26215b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new ms(22, this, str));
        }
    }

    /* renamed from: a */
    public void b(WebView webView) {
        if (webView == null || !this.e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new av(webView, 0));
    }

    private WebView a(String str) {
        return a(str, false);
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new ks(this, 13, eVar, appLovinPostbackListener));
    }

    public /* synthetic */ void a() {
        this.f26216c.destroy();
        this.f26216c = null;
    }

    private WebView a(String str, boolean z2) {
        yp.b();
        WebView b2 = yp.b(com.applovin.impl.sdk.j.l(), "web tracker");
        if (b2 == null) {
            return null;
        }
        b2.getSettings().setJavaScriptEnabled(true);
        b2.setWebViewClient(this);
        if (z2 && d()) {
            b2.setWebViewClient(new a());
        }
        AppLovinNetworkBridge.webviewLoadData(b2, androidx.compose.foundation.text.input.a.A("<html><head><link rel=\"icon\" href=\"data:,\">", str, "</head><body></body></html>"), "text/html", "UTF-8");
        return b2;
    }

    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String appendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f26214a.a(sj.A3)).booleanValue());
        if (this.f26216c == null) {
            WebView a2 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f26216c = a2;
            if (a2 == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26215b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                return;
            }
        }
        if (d() && !this.d) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f26215b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            hashMap.put("url", appendQueryParameters);
            this.f26214a.E().a(la.U, (Map) hashMap);
            appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
            return;
        }
        tr.a(this.f26216c, androidx.compose.foundation.text.input.a.A("al_firePostback('", appendQueryParameters, "')"));
        appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
    }

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new zu(this, 0));
    }

    public /* synthetic */ void b() {
        WebView a2 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f26216c = a2;
        if (a2 == null && com.applovin.impl.sdk.n.a()) {
            this.f26215b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }
}

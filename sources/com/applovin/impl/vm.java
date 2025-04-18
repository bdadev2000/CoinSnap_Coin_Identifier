package com.applovin.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.impl.ze;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class vm extends yl implements ze.a {

    /* renamed from: h */
    private final com.applovin.impl.sdk.ad.a f27584h;

    /* renamed from: i */
    private AppLovinAdLoadListener f27585i;

    /* renamed from: j */
    private com.applovin.impl.adview.b f27586j;

    /* loaded from: classes2.dex */
    public class b extends com.applovin.impl.adview.c {
        private b(com.applovin.impl.sdk.j jVar) {
            super(null, jVar);
        }

        private boolean a(String str, sj sjVar) {
            Iterator it = vm.this.f28216a.c(sjVar).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.impl.adview.c, com.applovin.impl.pi, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f30048a, view, url);
        }

        @Override // com.applovin.impl.adview.c, com.applovin.impl.pi, android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f30048a, view, url);
        }

        @Override // com.applovin.impl.adview.c, com.applovin.impl.pi, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f30048a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.adview.c, com.applovin.impl.pi, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f30048a, view, url, super.shouldInterceptRequest(view, url));
        }

        public /* synthetic */ b(vm vmVar, com.applovin.impl.sdk.j jVar, a aVar) {
            this(jVar);
        }

        @Override // com.applovin.impl.adview.c
        public boolean a(WebView webView, String str) {
            com.applovin.impl.sdk.n nVar = vm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                vm vmVar = vm.this;
                vmVar.f28218c.d(vmVar.f28217b, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.b)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!a(scheme, sj.b2)) {
                return true;
            }
            if (a(host, sj.c2)) {
                com.applovin.impl.sdk.n nVar2 = vm.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    vm vmVar2 = vm.this;
                    vmVar2.f28218c.a(vmVar2.f28217b, "Ad load succeeded");
                }
                if (vm.this.f27585i == null) {
                    return true;
                }
                vm.this.f27585i.adReceived(vm.this.f27584h);
                vm.this.f27585i = null;
                return true;
            }
            if (a(host, sj.d2)) {
                com.applovin.impl.sdk.n nVar3 = vm.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    vm vmVar3 = vm.this;
                    vmVar3.f28218c.a(vmVar3.f28217b, "Ad load failed");
                }
                if (vm.this.f27585i == null) {
                    return true;
                }
                vm.this.f27585i.failedToReceiveAd(204);
                vm.this.f27585i = null;
                return true;
            }
            com.applovin.impl.sdk.n nVar4 = vm.this.f28218c;
            if (!com.applovin.impl.sdk.n.a()) {
                return true;
            }
            vm vmVar4 = vm.this;
            vmVar4.f28218c.b(vmVar4.f28217b, "Unrecognized webview event");
            return true;
        }
    }

    public vm(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessJavaScriptTagAd", jVar);
        this.f27584h = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, jVar);
        this.f27585i = appLovinAdLoadListener;
        jVar.S().a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Rendering AppLovin ad #" + this.f27584h.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new mt(this, 19));
    }

    public /* synthetic */ void e() {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f28216a, a());
            this.f27586j = bVar;
            bVar.a(new b(this.f28216a));
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f27586j, this.f27584h.g(), this.f27584h.j1(), "text/html", null, "");
        } catch (Throwable th) {
            this.f28216a.S().b(this);
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Failed to initialize WebView", th);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f27585i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(-1);
                this.f27585i = null;
            }
        }
    }

    @Override // com.applovin.impl.ze.a
    public void a(ge geVar) {
        if (geVar.S().equalsIgnoreCase(this.f27584h.H())) {
            this.f28216a.S().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f27585i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f27584h);
                this.f27585i = null;
            }
        }
    }
}

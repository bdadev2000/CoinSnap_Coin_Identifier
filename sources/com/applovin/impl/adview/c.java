package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.aq;
import com.applovin.impl.dq;
import com.applovin.impl.la;
import com.applovin.impl.ma;
import com.applovin.impl.mq;
import com.applovin.impl.pi;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tp;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinAdSize;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends pi {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f22791a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f22792b;

    /* renamed from: c, reason: collision with root package name */
    private final a f22793c;

    public c(a aVar, com.applovin.impl.sdk.j jVar) {
        this.f22791a = jVar;
        this.f22792b = jVar.J();
        this.f22793c = aVar;
    }

    private void a(aq aqVar, b bVar) {
        a(aqVar, bVar, (Bundle) null);
    }

    private void b() {
        this.f22793c.a();
    }

    public a c() {
        return this.f22793c;
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f30048a, webView, str);
        safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(webView, str);
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f30048a, webView, str);
        safedk_c_onPageFinished_a44c2ec5ed56e4c2419c3d079c098b25(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        a aVar = this.f22793c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i2 = aVar.i();
            if (com.applovin.impl.sdk.n.a()) {
                this.f22792b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + i2);
            }
        }
        if (yp.a(webResourceRequest.getUrl().toString(), this.f22791a)) {
            this.f22791a.E().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        a aVar = this.f22793c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i2 = aVar.i();
            String str = "Received SSL error: " + sslError;
            if (com.applovin.impl.sdk.n.a()) {
                this.f22792b.b("AdWebView", str + " for ad: " + i2);
            }
        }
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        if (this.f22793c == null) {
            return true;
        }
        com.applovin.impl.sdk.n.h("AdWebView", "Render process gone for ad: " + this.f22793c.i() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.ad.b i2 = this.f22793c.i();
        if (i2 != null) {
            Map a2 = ma.a(i2);
            CollectionUtils.putStringIfValid("top_main_method", "onRenderProcessGone", a2);
            if (z3.i()) {
                a2.put("source", renderProcessGoneDetail.didCrash() ? AppMeasurement.CRASH_ORIGIN : "non_crash");
            }
            this.f22791a.E().a(la.U, a2);
        }
        if (((Boolean) this.f22791a.a(sj.S5)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f22791a.a(sj.V5)).booleanValue()) {
                throw new RuntimeException(androidx.compose.ui.platform.j.b("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", i2 != null ? String.valueOf(i2.getAdIdNumber()) : "null"));
            }
            if (webView != null && webView.equals(this.f22793c.g())) {
                this.f22793c.b();
                AppLovinAdSize m2 = this.f22793c.m();
                if (yp.a(m2)) {
                    this.f22793c.a(m2);
                    this.f22793c.H();
                }
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(WebView p02, String p12) {
        super.onLoadResource(p02, p12);
        if (com.applovin.impl.sdk.n.a()) {
            this.f22792b.d("AdWebView", "Loaded resource: " + p12);
        }
    }

    public void safedk_c_onPageFinished_a44c2ec5ed56e4c2419c3d079c098b25(WebView p02, String p12) {
        super.onPageFinished(p02, p12);
        if (com.applovin.impl.sdk.n.a()) {
            this.f22792b.d("AdWebView", "Loaded URL: " + p12);
        }
        a aVar = this.f22793c;
        if (aVar != null) {
            aVar.a(p02, p12);
        }
    }

    public boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(WebView p02, WebResourceRequest p12) {
        Uri url = p12.getUrl();
        if (url != null) {
            return a(p02, url.toString());
        }
        if (!com.applovin.impl.sdk.n.a()) {
            return false;
        }
        this.f22792b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f30048a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f30048a, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba = safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f30048a, webView, webResourceRequest, safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba);
        return safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10 = safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f30048a, webView, str, safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10);
        return safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10;
    }

    private void a(aq aqVar, b bVar, Bundle bundle) {
        dq j12 = aqVar.j1();
        if (j12 != null) {
            mq.a(j12.a(), this.f22793c.l());
            a(bVar, j12.b(), bundle);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        a aVar = this.f22793c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i3 = aVar.i();
            String str3 = "Received error with error code: " + i2 + " with description \\'" + str + "\\' for URL: " + str2;
            if (com.applovin.impl.sdk.n.a()) {
                this.f22792b.b("AdWebView", str3 + " for ad: " + i3);
            }
        }
        if (yp.a(str2, this.f22791a)) {
            this.f22791a.E().a("adWebViewReceivedError", str2, i2);
        }
    }

    public boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(WebView p02, String p12) {
        return a(p02, p12);
    }

    public boolean a(WebView webView, String str) {
        boolean z2;
        if (this.f22793c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f22792b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.b i2 = this.f22793c.i();
            if (i2 == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f22792b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            Iterator it = i2.d0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                String str2 = (String) it.next();
                if (StringUtils.isValidString(path) && path.contains(str2)) {
                    z2 = false;
                    break;
                }
            }
            boolean a2 = bVar.a();
            boolean z3 = (!i2.Y0() || a2) ? z2 : false;
            if ("applovin".equals(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                if ("/adservice/close_ad".equals(path)) {
                    String str3 = this.f22791a.g0().getExtraParameters().get("enable_close_URL_ad_value");
                    if (StringUtils.isValidString(str3) && Boolean.parseBoolean(str3)) {
                        i2.setMaxAdValue("close_url", str);
                    }
                    a();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (i2.Z0() && !a2) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f22792b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    b();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(a2, i2, parse)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f22792b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        tp.a(parse, this.f22793c, this.f22791a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(a2, i2, parse)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f22792b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (i2 instanceof aq) {
                            a((aq) i2, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(a2, i2, parse)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f22792b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (i2 instanceof aq) {
                            aq aqVar = (aq) i2;
                            if (aqVar.A1()) {
                                a(aqVar, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        tp.a(parse, i2, this.f22791a);
                    } else if ("/ga_init".equals(path)) {
                        this.f22793c.b(parse);
                    } else if ("/ga_event".equals(path)) {
                        this.f22793c.a(parse);
                    } else if ("/playable_event".equals(path)) {
                        a(parse);
                    } else if ("/adservice/direct_download".equals(path)) {
                        Bundle a3 = tp.a(parse);
                        if (i2 instanceof aq) {
                            aq aqVar2 = (aq) i2;
                            if (aqVar2.A1()) {
                                a(aqVar2, bVar, a3);
                            }
                        }
                        a(bVar, i2.i(), a3);
                    } else if ("/template_error".equals(path)) {
                        tp.b(parse, i2, this.f22791a);
                    } else if (this.f22793c.h() != null) {
                        if ("/video_began".equals(path)) {
                            this.f22793c.h().b(yp.a(parse.getQueryParameter("duration"), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                        } else if ("/video_completed".equals(path)) {
                            this.f22793c.h().e();
                        } else if ("/video_progress".equals(path)) {
                            this.f22793c.h().a(yp.a(parse.getQueryParameter("percent_viewed"), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                        } else if ("/video_waiting".equals(path)) {
                            this.f22793c.h().a();
                        } else if ("/video_resumed".equals(path)) {
                            this.f22793c.h().d();
                        }
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.f22793c.A();
                    } else {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f22792b.k("AdWebView", "Unknown URL: ".concat(str));
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f22792b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else if (z3) {
                List x02 = i2.x0();
                List w02 = i2.w0();
                if ((!x02.isEmpty() && !x02.contains(scheme)) || (!w02.isEmpty() && !w02.contains(host))) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f22792b.b("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                } else {
                    if (i2 instanceof aq) {
                        aq aqVar3 = (aq) i2;
                        if (aqVar3.A1()) {
                            a(aqVar3, bVar);
                            if (!a2 && i2.f1()) {
                                this.f22791a.E().a(la.E, a(i2, parse));
                            }
                        }
                    }
                    a(bVar, parse);
                    if (!a2) {
                        this.f22791a.E().a(la.E, a(i2, parse));
                    }
                }
            }
        }
        return true;
    }

    private boolean a(boolean z2, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z2) {
            return false;
        }
        if (bVar.Z0()) {
            return true;
        }
        if (bVar.f1()) {
            this.f22791a.E().a(la.E, a(bVar, uri));
        }
        return false;
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        Map a2 = ma.a(bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), a2);
        return a2;
    }

    private void a() {
        this.f22793c.z();
    }

    private void a(MotionEvent motionEvent) {
        this.f22793c.a(motionEvent);
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView k2 = this.f22793c.k();
        if (k2 != null && currentAd != null) {
            if (currentAd instanceof aq) {
                ((aq) currentAd).getAdEventTracker().v();
            }
            this.f22793c.a(currentAd, k2, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f22792b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String b2;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            b2 = androidx.compose.ui.platform.j.b("Tracked event: ", queryParameter);
        } else {
            b2 = androidx.compose.ui.platform.j.b("Failed to track event: ", queryParameter);
        }
        yp.a(b2, com.applovin.impl.sdk.j.l());
    }
}

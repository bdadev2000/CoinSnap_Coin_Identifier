package com.applovin.impl.adview;

import Q7.n0;
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
import com.applovin.impl.bq;
import com.applovin.impl.eq;
import com.applovin.impl.nq;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.up;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAdSize;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class c extends x {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6692a;
    private final com.applovin.impl.sdk.t b;

    /* renamed from: c, reason: collision with root package name */
    private final a f6693c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.f6692a = kVar;
        this.b = kVar.L();
        this.f6693c = aVar;
    }

    private void a(bq bqVar, b bVar) {
        a(bqVar, bVar, (Bundle) null);
    }

    private void b() {
        this.f6693c.a();
    }

    public a c() {
        return this.f6693c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.t.a()) {
            this.b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.t.a()) {
            this.b.d("AdWebView", "Loaded URL: " + str);
        }
        a aVar = this.f6693c;
        if (aVar != null) {
            aVar.a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        a aVar = this.f6693c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i9 = aVar.i();
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + i9);
            }
        }
        if (zp.c(webResourceRequest.getUrl().toString())) {
            this.f6692a.B().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        a aVar = this.f6693c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i9 = aVar.i();
            String str = "Received SSL error: " + sslError;
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("AdWebView", str + " for ad: " + i9);
            }
        }
    }

    @Override // com.applovin.impl.sdk.x, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        boolean didCrash2;
        String str;
        boolean didCrash3;
        String str2;
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        if (this.f6693c == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Render process gone for ad: ");
        sb.append(this.f6693c.i());
        sb.append(". Process did crash: ");
        didCrash = renderProcessGoneDetail.didCrash();
        sb.append(didCrash);
        com.applovin.impl.sdk.t.h("AdWebView", sb.toString());
        com.applovin.impl.sdk.ad.b i9 = this.f6693c.i();
        if (i9 != null) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
            CollectionUtils.putStringIfValid("ad_size", i9.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(i9.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", i9.getDspName(), hashMap);
            if (x3.i()) {
                didCrash3 = renderProcessGoneDetail.didCrash();
                if (didCrash3) {
                    str2 = AppMeasurement.CRASH_ORIGIN;
                } else {
                    str2 = "non_crash";
                }
                hashMap.put("source", str2);
            }
            this.f6692a.B().a(o.b.WEB_VIEW_ERROR, (Map) hashMap);
        }
        if (((Boolean) this.f6692a.a(oj.f9642N5)).booleanValue()) {
            didCrash2 = renderProcessGoneDetail.didCrash();
            if (didCrash2 && ((Boolean) this.f6692a.a(oj.f9661Q5)).booleanValue()) {
                if (i9 != null) {
                    str = String.valueOf(i9.getAdIdNumber());
                } else {
                    str = "null";
                }
                throw new RuntimeException(AbstractC2914a.d("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", str));
            }
            if (webView != null && webView.equals(this.f6693c.g())) {
                this.f6693c.b();
                AppLovinAdSize m = this.f6693c.m();
                if (zp.a(m)) {
                    this.f6693c.a(m);
                    this.f6693c.G();
                }
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.t.a()) {
            return false;
        }
        this.b.b("AdWebView", "No url found for request");
        return false;
    }

    private void a(bq bqVar, b bVar, Bundle bundle) {
        eq e12 = bqVar.e1();
        if (e12 != null) {
            nq.a(e12.a(), this.f6693c.l());
            a(bVar, e12.b(), bundle);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i9, String str, String str2) {
        super.onReceivedError(webView, i9, str, str2);
        a aVar = this.f6693c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i10 = aVar.i();
            String str3 = "Received error with error code: " + i9 + " with description \\'" + str + "\\' for URL: " + str2;
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("AdWebView", str3 + " for ad: " + i10);
            }
        }
        if (zp.c(str2)) {
            this.f6692a.B().a("adWebViewReceivedError", str2, i9);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    public boolean a(WebView webView, String str) {
        boolean z8;
        if (this.f6693c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.b i9 = this.f6693c.i();
            if (i9 == null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            Iterator it = i9.c0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z8 = true;
                    break;
                }
                String str2 = (String) it.next();
                if (StringUtils.isValidString(path) && path.contains(str2)) {
                    z8 = false;
                    break;
                }
            }
            boolean a6 = bVar.a();
            boolean z9 = (!i9.U0() || a6) ? z8 : false;
            if ("applovin".equals(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                if ("/adservice/close_ad".equals(path)) {
                    String str3 = (String) n0.d(this.f6692a, "enable_close_URL_ad_value");
                    if (StringUtils.isValidString(str3) && Boolean.parseBoolean(str3)) {
                        i9.setMaxAdValue("close_url", str);
                    }
                    a();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (i9.V0() && !a6) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.b.b("AdWebView", "Skipping expand command without user interaction");
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
                        if (i9.V0() && !a6) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        up.a(parse, this.f6693c, this.f6692a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (i9.V0() && !a6) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (i9 instanceof bq) {
                            a((bq) i9, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (i9.V0() && !a6) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (i9 instanceof bq) {
                            bq bqVar = (bq) i9;
                            if (bqVar.v1()) {
                                a(bqVar, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        up.a(parse, i9, this.f6692a);
                    } else if ("/playable_event".equals(path)) {
                        a(parse);
                    } else if ("/adservice/direct_download".equals(path)) {
                        Bundle a9 = up.a(parse);
                        if (i9 instanceof bq) {
                            bq bqVar2 = (bq) i9;
                            if (bqVar2.v1()) {
                                a(bqVar2, bVar, a9);
                            }
                        }
                        a(bVar, i9.j(), a9);
                    } else if ("/template_error".equals(path)) {
                        up.b(parse, i9, this.f6692a);
                    } else if (this.f6693c.h() != null) {
                        if ("/video_began".equals(path)) {
                            this.f6693c.h().b(zp.a(parse.getQueryParameter("duration"), 0.0d));
                        } else if ("/video_completed".equals(path)) {
                            this.f6693c.h().e();
                        } else if ("/video_progress".equals(path)) {
                            this.f6693c.h().a(zp.a(parse.getQueryParameter("percent_viewed"), 0.0d));
                        } else if ("/video_waiting".equals(path)) {
                            this.f6693c.h().a();
                        } else if ("/video_resumed".equals(path)) {
                            this.f6693c.h().d();
                        }
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.f6693c.z();
                    } else {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.b.k("AdWebView", "Unknown URL: ".concat(str));
                        }
                        if (com.applovin.impl.sdk.t.a()) {
                            this.b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else if (z9) {
                List w02 = i9.w0();
                List v02 = i9.v0();
                if ((!w02.isEmpty() && !w02.contains(scheme)) || (!v02.isEmpty() && !v02.contains(host))) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.b.b("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                } else {
                    if (i9 instanceof bq) {
                        bq bqVar3 = (bq) i9;
                        if (bqVar3.v1()) {
                            a(bqVar3, bVar);
                        }
                    }
                    a(bVar, parse);
                }
            }
        }
        return true;
    }

    private void a() {
        this.f6693c.y();
    }

    private void a(MotionEvent motionEvent) {
        this.f6693c.a(motionEvent);
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView k6 = this.f6693c.k();
        if (k6 != null && currentAd != null) {
            if (currentAd instanceof bq) {
                ((bq) currentAd).getAdEventTracker().v();
            }
            this.f6693c.a(currentAd, k6, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (com.applovin.impl.sdk.t.a()) {
            this.b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String d2;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            d2 = AbstractC2914a.d("Tracked event: ", queryParameter);
        } else {
            d2 = AbstractC2914a.d("Failed to track event: ", queryParameter);
        }
        zp.a(d2, com.applovin.impl.sdk.k.k());
    }
}

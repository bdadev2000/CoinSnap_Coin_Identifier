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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class c extends x {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f3696b;

    /* renamed from: c, reason: collision with root package name */
    private final a f3697c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f3696b = kVar.L();
        this.f3697c = aVar;
    }

    private void a(bq bqVar, b bVar) {
        a(bqVar, bVar, (Bundle) null);
    }

    private void b() {
        this.f3697c.a();
    }

    public a c() {
        return this.f3697c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.t.a()) {
            this.f3696b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.t.a()) {
            this.f3696b.d("AdWebView", "Loaded URL: " + str);
        }
        a aVar = this.f3697c;
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
        a aVar = this.f3697c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i10 = aVar.i();
            if (com.applovin.impl.sdk.t.a()) {
                this.f3696b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + i10);
            }
        }
        if (zp.c(webResourceRequest.getUrl().toString())) {
            this.a.B().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        a aVar = this.f3697c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i10 = aVar.i();
            String str = "Received SSL error: " + sslError;
            if (com.applovin.impl.sdk.t.a()) {
                this.f3696b.b("AdWebView", str + " for ad: " + i10);
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
        if (this.f3697c == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("Render process gone for ad: ");
        sb2.append(this.f3697c.i());
        sb2.append(". Process did crash: ");
        didCrash = renderProcessGoneDetail.didCrash();
        sb2.append(didCrash);
        com.applovin.impl.sdk.t.h("AdWebView", sb2.toString());
        com.applovin.impl.sdk.ad.b i10 = this.f3697c.i();
        if (i10 != null) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
            CollectionUtils.putStringIfValid("ad_size", i10.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(i10.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", i10.getDspName(), hashMap);
            if (x3.i()) {
                didCrash3 = renderProcessGoneDetail.didCrash();
                if (didCrash3) {
                    str2 = AppMeasurement.CRASH_ORIGIN;
                } else {
                    str2 = "non_crash";
                }
                hashMap.put("source", str2);
            }
            this.a.B().a(o.b.WEB_VIEW_ERROR, (Map) hashMap);
        }
        if (((Boolean) this.a.a(oj.N5)).booleanValue()) {
            didCrash2 = renderProcessGoneDetail.didCrash();
            if (didCrash2 && ((Boolean) this.a.a(oj.Q5)).booleanValue()) {
                if (i10 != null) {
                    str = String.valueOf(i10.getAdIdNumber());
                } else {
                    str = AbstractJsonLexerKt.NULL;
                }
                throw new RuntimeException(vd.e.e("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", str));
            }
            if (webView != null && webView.equals(this.f3697c.g())) {
                this.f3697c.b();
                AppLovinAdSize m10 = this.f3697c.m();
                if (zp.a(m10)) {
                    this.f3697c.a(m10);
                    this.f3697c.G();
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
        this.f3696b.b("AdWebView", "No url found for request");
        return false;
    }

    private void a(bq bqVar, b bVar, Bundle bundle) {
        eq e12 = bqVar.e1();
        if (e12 != null) {
            nq.a(e12.a(), this.f3697c.l());
            a(bVar, e12.b(), bundle);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        a aVar = this.f3697c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b i11 = aVar.i();
            String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
            if (com.applovin.impl.sdk.t.a()) {
                this.f3696b.b("AdWebView", str3 + " for ad: " + i11);
            }
        }
        if (zp.c(str2)) {
            this.a.B().a("adWebViewReceivedError", str2, i10);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    public boolean a(WebView webView, String str) {
        boolean z10;
        if (this.f3697c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f3696b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.b i10 = this.f3697c.i();
            if (i10 == null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f3696b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            Iterator it = i10.c0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                String str2 = (String) it.next();
                if (StringUtils.isValidString(path) && path.contains(str2)) {
                    z10 = false;
                    break;
                }
            }
            boolean a = bVar.a();
            boolean z11 = (!i10.U0() || a) ? z10 : false;
            if ("applovin".equals(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                if ("/adservice/close_ad".equals(path)) {
                    String str3 = (String) a4.j.b(this.a, "enable_close_URL_ad_value");
                    if (StringUtils.isValidString(str3) && Boolean.parseBoolean(str3)) {
                        i10.setMaxAdValue("close_url", str);
                    }
                    a();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (i10.V0() && !a) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f3696b.b("AdWebView", "Skipping expand command without user interaction");
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
                        if (i10.V0() && !a) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f3696b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        up.a(parse, this.f3697c, this.a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (i10.V0() && !a) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f3696b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (i10 instanceof bq) {
                            a((bq) i10, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (i10.V0() && !a) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f3696b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (i10 instanceof bq) {
                            bq bqVar = (bq) i10;
                            if (bqVar.v1()) {
                                a(bqVar, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        up.a(parse, i10, this.a);
                    } else if ("/playable_event".equals(path)) {
                        a(parse);
                    } else if ("/adservice/direct_download".equals(path)) {
                        Bundle a10 = up.a(parse);
                        if (i10 instanceof bq) {
                            bq bqVar2 = (bq) i10;
                            if (bqVar2.v1()) {
                                a(bqVar2, bVar, a10);
                            }
                        }
                        a(bVar, i10.j(), a10);
                    } else if ("/template_error".equals(path)) {
                        up.b(parse, i10, this.a);
                    } else if (this.f3697c.h() != null) {
                        if ("/video_began".equals(path)) {
                            this.f3697c.h().b(zp.a(parse.getQueryParameter("duration"), 0.0d));
                        } else if ("/video_completed".equals(path)) {
                            this.f3697c.h().e();
                        } else if ("/video_progress".equals(path)) {
                            this.f3697c.h().a(zp.a(parse.getQueryParameter("percent_viewed"), 0.0d));
                        } else if ("/video_waiting".equals(path)) {
                            this.f3697c.h().a();
                        } else if ("/video_resumed".equals(path)) {
                            this.f3697c.h().d();
                        }
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.f3697c.z();
                    } else {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f3696b.k("AdWebView", "Unknown URL: ".concat(str));
                        }
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f3696b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else if (z11) {
                List w02 = i10.w0();
                List v02 = i10.v0();
                if ((!w02.isEmpty() && !w02.contains(scheme)) || (!v02.isEmpty() && !v02.contains(host))) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f3696b.b("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                } else {
                    if (i10 instanceof bq) {
                        bq bqVar3 = (bq) i10;
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
        this.f3697c.y();
    }

    private void a(MotionEvent motionEvent) {
        this.f3697c.a(motionEvent);
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView k10 = this.f3697c.k();
        if (k10 != null && currentAd != null) {
            if (currentAd instanceof bq) {
                ((bq) currentAd).getAdEventTracker().v();
            }
            this.f3697c.a(currentAd, k10, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (com.applovin.impl.sdk.t.a()) {
            this.f3696b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String e2;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            e2 = vd.e.e("Tracked event: ", queryParameter);
        } else {
            e2 = vd.e.e("Failed to track event: ", queryParameter);
        }
        zp.a(e2, com.applovin.impl.sdk.k.k());
    }
}

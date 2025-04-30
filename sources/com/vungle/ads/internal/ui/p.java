package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c7.C0665z;
import c7.p1;
import com.adjust.sdk.Constants;
import com.facebook.internal.C1838g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.C2137s;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class p extends WebViewClient implements i7.j {
    public static final n Companion = new n(null);
    private static final String TAG = "VungleWebClient";
    private final C0665z advertisement;
    private boolean collectConsent;
    private i7.i errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private i7.h mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final p1 placement;
    private boolean ready;
    private final com.vungle.ads.internal.signals.j signalManager;
    private e7.i webViewObserver;

    public /* synthetic */ p(C0665z c0665z, p1 p1Var, ExecutorService executorService, com.vungle.ads.internal.signals.j jVar, int i9, G7.f fVar) {
        this(c0665z, p1Var, executorService, (i9 & 8) != 0 ? null : jVar);
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String str, String str2, boolean z8) {
        String str3 = str2 + ' ' + str;
        i7.i iVar = this.errorHandler;
        if (iVar != null) {
            ((com.vungle.ads.internal.presenter.q) iVar).onReceivedError(str3, z8);
        }
    }

    private final boolean isCriticalAsset(String str) {
        if (str.length() > 0) {
            return this.advertisement.isCriticalAsset(str);
        }
        return false;
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        try {
            v.Companion.w(TAG, "mraid Injecting JS " + str);
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        } catch (Exception e4) {
            C2137s.INSTANCE.logError$vungle_ads_release(313, "Evaluate js failed " + e4.getLocalizedMessage(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
        }
    }

    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2 */
    public static final void m86shouldOverrideUrlLoading$lambda4$lambda3$lambda2(i7.h hVar, String str, f8.v vVar, Handler handler, p pVar, WebView webView) {
        G7.j.e(hVar, "$it");
        G7.j.e(str, "$command");
        G7.j.e(vVar, "$args");
        G7.j.e(handler, "$handler");
        G7.j.e(pVar, "this$0");
        if (((com.vungle.ads.internal.presenter.q) hVar).processCommand(str, vVar)) {
            handler.post(new com.facebook.appevents.k(9, pVar, webView));
        }
    }

    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2$lambda-1 */
    public static final void m87shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1(p pVar, WebView webView) {
        G7.j.e(pVar, "this$0");
        pVar.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final i7.i getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    public final i7.h getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final e7.i getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j7) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j7 + ')');
        }
    }

    @Override // i7.j
    public void notifyPropertiesChange(boolean z8) {
        String str;
        WebView webView = this.loadedWebView;
        if (webView != null) {
            C1838g c1838g = new C1838g(2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            f8.v vVar = new f8.v(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            f8.v vVar2 = new f8.v(linkedHashMap2);
            C1838g c1838g2 = new C1838g(2);
            Boolean bool = Boolean.FALSE;
            z2.i.n(c1838g2, "sms", bool);
            z2.i.n(c1838g2, "tel", bool);
            z2.i.n(c1838g2, "calendar", bool);
            z2.i.n(c1838g2, "storePicture", bool);
            z2.i.n(c1838g2, "inlineVideo", bool);
            f8.v f9 = c1838g2.f();
            c1838g.g(vVar, "maxSize");
            c1838g.g(vVar, "screenSize");
            c1838g.g(vVar2, "defaultPosition");
            c1838g.g(vVar2, "currentPosition");
            c1838g.g(f9, "supports");
            z2.i.o(c1838g, "placementType", this.advertisement.templateType());
            Boolean bool2 = this.isViewable;
            if (bool2 != null) {
                z2.i.n(c1838g, "isViewable", bool2);
            }
            z2.i.o(c1838g, "os", "android");
            z2.i.o(c1838g, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
            z2.i.n(c1838g, "incentivized", this.placement.getIncentivized());
            c1838g.g(C2.m.a(Integer.valueOf(this.advertisement.getShowCloseDelay(this.placement.getIncentivized()))), "enableBackImmediately");
            z2.i.o(c1838g, "version", "1.0");
            if (this.collectConsent) {
                z2.i.n(c1838g, "consentRequired", Boolean.TRUE);
                z2.i.o(c1838g, "consentTitleText", this.gdprTitle);
                z2.i.o(c1838g, "consentBodyText", this.gdprBody);
                z2.i.o(c1838g, "consentAcceptButtonText", this.gdprAccept);
                z2.i.o(c1838g, "consentDenyButtonText", this.gdprDeny);
            } else {
                z2.i.n(c1838g, "consentRequired", bool);
            }
            if (!F.INSTANCE.signalsDisabled()) {
                com.vungle.ads.internal.signals.j jVar = this.signalManager;
                String str2 = null;
                if (jVar != null) {
                    str = jVar.getUuid();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    com.vungle.ads.internal.signals.j jVar2 = this.signalManager;
                    if (jVar2 != null) {
                        str2 = jVar2.getUuid();
                    }
                    z2.i.o(c1838g, "sessionId", str2);
                }
            }
            z2.i.o(c1838g, "sdkVersion", "7.3.2");
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + c1838g.f() + ',' + z8 + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new o(this.errorHandler));
        }
        e7.i iVar = this.webViewObserver;
        if (iVar != null) {
            ((e7.g) iVar).onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i9, String str, String str2) {
        G7.j.e(str, "description");
        G7.j.e(str2, "failingUrl");
        super.onReceivedError(webView, i9, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Integer num;
        boolean z8;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Uri uri = null;
        if (webResourceResponse != null) {
            num = Integer.valueOf(webResourceResponse.getStatusCode());
        } else {
            num = null;
        }
        String valueOf = String.valueOf(num);
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        }
        String valueOf2 = String.valueOf(uri);
        boolean z9 = false;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z8 = true;
        } else {
            z8 = false;
        }
        v.Companion.e(TAG, "Http Error desc " + valueOf + ' ' + z8 + " for URL " + valueOf2);
        if (isCriticalAsset(valueOf2) && z8) {
            z9 = true;
        }
        handleWebViewError(valueOf, valueOf2, z9);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        Boolean bool;
        Boolean bool2 = null;
        String str2 = null;
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            u uVar = v.Companion;
            StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
            if (webView != null) {
                str2 = webView.getUrl();
            }
            sb.append(str2);
            uVar.w(TAG, sb.toString());
            return true;
        }
        u uVar2 = v.Companion;
        StringBuilder sb2 = new StringBuilder("onRenderProcessGone url: ");
        if (webView != null) {
            str = webView.getUrl();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(", did crash: ");
        if (renderProcessGoneDetail != null) {
            bool = Boolean.valueOf(renderProcessGoneDetail.didCrash());
        } else {
            bool = null;
        }
        sb2.append(bool);
        uVar2.w(TAG, sb2.toString());
        i7.i iVar = this.errorHandler;
        if (iVar != null) {
            if (renderProcessGoneDetail != null) {
                bool2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            return ((com.vungle.ads.internal.presenter.q) iVar).onWebRenderingProcessGone(webView, bool2);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // i7.j
    public void setAdVisibility(boolean z8) {
        this.isViewable = Boolean.valueOf(z8);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z8) {
        this.collectConsent = z8;
    }

    @Override // i7.j
    public void setConsentStatus(boolean z8, String str, String str2, String str3, String str4) {
        this.collectConsent = z8;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // i7.j
    public void setErrorHandler(i7.i iVar) {
        G7.j.e(iVar, "errorHandler");
        this.errorHandler = iVar;
    }

    public final void setErrorHandler$vungle_ads_release(i7.i iVar) {
        this.errorHandler = iVar;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // i7.j
    public void setMraidDelegate(i7.h hVar) {
        this.mraidDelegate = hVar;
    }

    public final void setMraidDelegate$vungle_ads_release(i7.h hVar) {
        this.mraidDelegate = hVar;
    }

    public final void setReady$vungle_ads_release(boolean z8) {
        this.ready = z8;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // i7.j
    public void setWebViewObserver(e7.i iVar) {
        this.webViewObserver = iVar;
    }

    public final void setWebViewObserver$vungle_ads_release(e7.i iVar) {
        this.webViewObserver = iVar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        u uVar = v.Companion;
        uVar.d(TAG, "MRAID Command " + str);
        if (str != null && str.length() != 0) {
            Uri parse = Uri.parse(str);
            if (parse == null || parse.getScheme() == null) {
                return false;
            }
            String scheme = parse.getScheme();
            if (G7.j.a(scheme, CampaignEx.JSON_KEY_MRAID)) {
                final String host = parse.getHost();
                if (host != null) {
                    if ("propertiesChangeCompleted".equals(host)) {
                        if (!this.ready) {
                            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this.advertisement.createMRAIDArgs() + ')');
                            this.ready = true;
                        }
                    } else {
                        final i7.h hVar = this.mraidDelegate;
                        if (hVar != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (String str2 : parse.getQueryParameterNames()) {
                                G7.j.d(str2, "param");
                            }
                            final f8.v vVar = new f8.v(linkedHashMap);
                            final Handler handler = new Handler(Looper.getMainLooper());
                            this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.m
                                @Override // java.lang.Runnable
                                public final void run() {
                                    p.m86shouldOverrideUrlLoading$lambda4$lambda3$lambda2(i7.h.this, host, vVar, handler, this, webView);
                                }
                            });
                        }
                    }
                    return true;
                }
            } else if ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)) {
                uVar.d(TAG, "Open URL".concat(str));
                i7.h hVar2 = this.mraidDelegate;
                if (hVar2 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    ((com.vungle.ads.internal.presenter.q) hVar2).processCommand("openNonMraid", new f8.v(linkedHashMap2));
                }
                return true;
            }
            return false;
        }
        uVar.e(TAG, "Invalid URL ");
        return false;
    }

    public p(C0665z c0665z, p1 p1Var, ExecutorService executorService, com.vungle.ads.internal.signals.j jVar) {
        G7.j.e(c0665z, "advertisement");
        G7.j.e(p1Var, "placement");
        G7.j.e(executorService, "offloadExecutor");
        this.advertisement = c0665z;
        this.placement = p1Var;
        this.offloadExecutor = executorService;
        this.signalManager = jVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z8 = false;
        boolean z9 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        v.Companion.e(TAG, "Error desc " + valueOf + ' ' + z9 + " for URL " + valueOf2);
        if (isCriticalAsset(valueOf2) && z9) {
            z8 = true;
        }
        handleWebViewError(valueOf, valueOf2, z8);
    }
}

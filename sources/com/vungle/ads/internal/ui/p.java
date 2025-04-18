package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bh.o3;
import bh.z;
import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.s;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class p extends WebViewClient implements hh.j {
    public static final n Companion = new n(null);
    private static final String TAG = "VungleWebClient";
    private final z advertisement;
    private boolean collectConsent;
    private hh.i errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private hh.h mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final o3 placement;
    private boolean ready;
    private final com.vungle.ads.internal.signals.j signalManager;
    private dh.i webViewObserver;

    public /* synthetic */ p(z zVar, o3 o3Var, ExecutorService executorService, com.vungle.ads.internal.signals.j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, o3Var, executorService, (i10 & 8) != 0 ? null : jVar);
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

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        hh.i iVar = this.errorHandler;
        if (iVar != null) {
            ((com.vungle.ads.internal.presenter.q) iVar).onReceivedError(str3, z10);
        }
    }

    private final boolean isCriticalAsset(String str) {
        boolean z10;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.advertisement.isCriticalAsset(str);
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        try {
            v.Companion.w(TAG, "mraid Injecting JS " + str);
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        } catch (Exception e2) {
            s.INSTANCE.logError$vungle_ads_release(313, "Evaluate js failed " + e2.getLocalizedMessage(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
        }
    }

    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2 */
    public static final void m66shouldOverrideUrlLoading$lambda4$lambda3$lambda2(hh.h it, String command, JsonObject args, Handler handler, p this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(handler, "$handler");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((com.vungle.ads.internal.presenter.q) it).processCommand(command, args)) {
            handler.post(new jb.j(17, this$0, webView));
        }
    }

    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2$lambda-1 */
    public static final void m67shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1(p this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final hh.i getErrorHandler$vungle_ads_release() {
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

    public final hh.h getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final dh.i getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j3) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j3 + ')');
        }
    }

    @Override // hh.j
    public void notifyPropertiesChange(boolean z10) {
        String str;
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder2, "width", Integer.valueOf(webView.getWidth()));
            JsonElementBuildersKt.put(jsonObjectBuilder2, "height", Integer.valueOf(webView.getHeight()));
            JsonObject build = jsonObjectBuilder2.build();
            JsonObjectBuilder jsonObjectBuilder3 = new JsonObjectBuilder();
            boolean z11 = false;
            JsonElementBuildersKt.put(jsonObjectBuilder3, "x", (Number) 0);
            JsonElementBuildersKt.put(jsonObjectBuilder3, "y", (Number) 0);
            JsonElementBuildersKt.put(jsonObjectBuilder3, "width", Integer.valueOf(webView.getWidth()));
            JsonElementBuildersKt.put(jsonObjectBuilder3, "height", Integer.valueOf(webView.getHeight()));
            JsonObject build2 = jsonObjectBuilder3.build();
            JsonObjectBuilder jsonObjectBuilder4 = new JsonObjectBuilder();
            Boolean bool = Boolean.FALSE;
            JsonElementBuildersKt.put(jsonObjectBuilder4, "sms", bool);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "tel", bool);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "calendar", bool);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "storePicture", bool);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "inlineVideo", bool);
            JsonObject build3 = jsonObjectBuilder4.build();
            jsonObjectBuilder.put("maxSize", build);
            jsonObjectBuilder.put("screenSize", build);
            jsonObjectBuilder.put("defaultPosition", build2);
            jsonObjectBuilder.put("currentPosition", build2);
            jsonObjectBuilder.put("supports", build3);
            JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this.advertisement.templateType());
            Boolean bool2 = this.isViewable;
            if (bool2 != null) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "isViewable", Boolean.valueOf(bool2.booleanValue()));
            }
            JsonElementBuildersKt.put(jsonObjectBuilder, "os", "android");
            JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
            JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", this.placement.getIncentivized());
            JsonElementBuildersKt.put(jsonObjectBuilder, "enableBackImmediately", Integer.valueOf(this.advertisement.getShowCloseDelay(this.placement.getIncentivized())));
            JsonElementBuildersKt.put(jsonObjectBuilder, "version", "1.0");
            if (this.collectConsent) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.TRUE);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this.gdprTitle);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this.gdprBody);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this.gdprAccept);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this.gdprDeny);
            } else {
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", bool);
            }
            if (!f0.INSTANCE.signalsDisabled()) {
                com.vungle.ads.internal.signals.j jVar = this.signalManager;
                String str2 = null;
                if (jVar != null) {
                    str = jVar.getUuid();
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    com.vungle.ads.internal.signals.j jVar2 = this.signalManager;
                    if (jVar2 != null) {
                        str2 = jVar2.getUuid();
                    }
                    JsonElementBuildersKt.put(jsonObjectBuilder, "sessionId", str2);
                }
            }
            JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", "7.3.2");
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + AbstractJsonLexerKt.COMMA + z10 + ')');
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
        dh.i iVar = this.webViewObserver;
        if (iVar != null) {
            ((dh.g) iVar).onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public void onReceivedError(WebView webView, int i10, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(webView, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Integer num;
        boolean z10;
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
        boolean z11 = true;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z10 = true;
        } else {
            z10 = false;
        }
        v.Companion.e(TAG, "Http Error desc " + valueOf + ' ' + z10 + " for URL " + valueOf2);
        if (!isCriticalAsset(valueOf2) || !z10) {
            z11 = false;
        }
        handleWebViewError(valueOf, valueOf2, z11);
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
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone url: ");
            if (webView != null) {
                str2 = webView.getUrl();
            }
            sb2.append(str2);
            uVar.w(TAG, sb2.toString());
            return true;
        }
        u uVar2 = v.Companion;
        StringBuilder sb3 = new StringBuilder("onRenderProcessGone url: ");
        if (webView != null) {
            str = webView.getUrl();
        } else {
            str = null;
        }
        sb3.append(str);
        sb3.append(", did crash: ");
        if (renderProcessGoneDetail != null) {
            bool = Boolean.valueOf(renderProcessGoneDetail.didCrash());
        } else {
            bool = null;
        }
        sb3.append(bool);
        uVar2.w(TAG, sb3.toString());
        hh.i iVar = this.errorHandler;
        if (iVar != null) {
            if (renderProcessGoneDetail != null) {
                bool2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            return ((com.vungle.ads.internal.presenter.q) iVar).onWebRenderingProcessGone(webView, bool2);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // hh.j
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // hh.j
    public void setConsentStatus(boolean z10, String str, String str2, String str3, String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // hh.j
    public void setErrorHandler(hh.i errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(hh.i iVar) {
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

    @Override // hh.j
    public void setMraidDelegate(hh.h hVar) {
        this.mraidDelegate = hVar;
    }

    public final void setMraidDelegate$vungle_ads_release(hh.h hVar) {
        this.mraidDelegate = hVar;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // hh.j
    public void setWebViewObserver(dh.i iVar) {
        this.webViewObserver = iVar;
    }

    public final void setWebViewObserver$vungle_ads_release(dh.i iVar) {
        this.webViewObserver = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (r4 != false) goto L86;
     */
    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Java")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldOverrideUrlLoading(final android.webkit.WebView r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ui.p.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public p(z advertisement, o3 placement, ExecutorService offloadExecutor, com.vungle.ads.internal.signals.j jVar) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.signalManager = jVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        v.Companion.e(TAG, "Error desc " + valueOf + ' ' + z10 + " for URL " + valueOf2);
        handleWebViewError(valueOf, valueOf2, isCriticalAsset(valueOf2) && z10);
    }
}

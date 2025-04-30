package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0693f0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7519a;
    private final com.applovin.impl.sdk.t b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.adview.a f7520c;

    public C0693f0(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        this.f7519a = kVar;
        this.b = kVar.L();
        this.f7520c = aVar;
    }

    private void a(ConsoleMessage consoleMessage) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
        com.applovin.impl.sdk.ad.b i9 = this.f7520c.i();
        if (i9 != null) {
            String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            HashMap hashMap = new HashMap();
            hashMap.put("source", "AdWebView:onPoststitialShowEvaluationError");
            hashMap.put("top_main_method", str);
            hashMap.put("error_message", consoleMessage.message());
            CollectionUtils.putStringIfValid("ad_size", i9.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(i9.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", i9.getDspName(), hashMap);
            this.f7519a.B().a(o.b.TEMPLATE_ERROR, (Map) hashMap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (com.applovin.impl.sdk.t.a()) {
            this.b.a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        if (!consoleMessage.message().contains("al_onPoststitialShow") && !consoleMessage.message().contains("al_showPostitial")) {
            return true;
        }
        a(consoleMessage);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.k("AdWebView", "Alert attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.k("AdWebView", "JS confirm attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i9) {
        com.applovin.impl.adview.a aVar;
        if (i9 == 100 && (aVar = this.f7520c) != null) {
            aVar.c(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i9, String str2) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.k("AdWebView", "console.log[" + i9 + "] :" + str);
        }
    }
}

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

/* loaded from: classes.dex */
public class f0 extends WebChromeClient {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f4564b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.adview.a f4565c;

    public f0(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f4564b = kVar.L();
        this.f4565c = aVar;
    }

    private void a(ConsoleMessage consoleMessage) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
        com.applovin.impl.sdk.ad.b i10 = this.f4565c.i();
        if (i10 != null) {
            String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            HashMap hashMap = new HashMap();
            hashMap.put("source", "AdWebView:onPoststitialShowEvaluationError");
            hashMap.put("top_main_method", str);
            hashMap.put("error_message", consoleMessage.message());
            CollectionUtils.putStringIfValid("ad_size", i10.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(i10.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", i10.getDspName(), hashMap);
            this.a.B().a(o.b.TEMPLATE_ERROR, (Map) hashMap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (com.applovin.impl.sdk.t.a()) {
            this.f4564b.a("AdWebView", str);
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
        if (!com.applovin.impl.sdk.t.a()) {
            return true;
        }
        this.f4564b.k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.t.a()) {
            return true;
        }
        this.f4564b.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.t.a()) {
            return true;
        }
        this.f4564b.k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        com.applovin.impl.adview.a aVar;
        if (i10 == 100 && (aVar = this.f4565c) != null) {
            aVar.c(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f4564b.k("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }
}

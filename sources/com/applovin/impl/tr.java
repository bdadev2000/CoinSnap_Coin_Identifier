package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;

/* loaded from: classes2.dex */
public abstract class tr {
    public static void a(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new av(webView, 2));
    }

    public static /* synthetic */ void b(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        AppLovinNetworkBridge.webviewLoadUrl(webView, "about:blank");
        webView.onPause();
    }

    public static void d(WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new av(webView, 1));
    }

    public static void a(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new dw(webView, str, 1));
    }

    public static /* synthetic */ void c(WebView webView) {
        a(webView);
        webView.removeAllViews();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void a(WebView webView, String str, String str2, com.applovin.impl.sdk.j jVar) {
        if (webView == null) {
            return;
        }
        try {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new dw(webView, str, 0));
        } catch (Throwable th) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a(str2, "Unable to forward to WebView", th);
            }
            jVar.E().a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }

    public static /* synthetic */ void b(WebView webView, String str) {
        if (z3.e()) {
            webView.evaluateJavascript(str, null);
            return;
        }
        AppLovinNetworkBridge.webviewLoadUrl(webView, "javascript:" + str);
    }
}

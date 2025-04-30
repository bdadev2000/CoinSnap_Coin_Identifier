package com.bytedance.sdk.openadsdk.vDp;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class YW {
    private static void lMd(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            QR.zp("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void zp(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            QR.zp("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void zp(WebView webView) {
        lMd(webView);
        WebSettings settings = webView.getSettings();
        zp(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            QR.zp("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            QR.zp("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i9 = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z8 = i9 >= 28;
        try {
        } catch (Throwable th3) {
            QR.zp("WebViewSettings", "setLayerType error", th3);
        }
        if (!z8) {
            webView.setLayerType(0, null);
        } else {
            if (z8) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}

package com.bytedance.sdk.openadsdk.qO;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class NjR {
    private static void Sg(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            DSW.YFl("WebViewSettings", "removeJavascriptInterfacesSafe error", th2);
        }
    }

    private static void YFl(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            DSW.YFl("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th2);
        }
    }

    public static void YFl(WebView webView) {
        if (webView == null) {
            return;
        }
        Sg(webView);
        WebSettings settings = webView.getSettings();
        YFl(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th2) {
            DSW.YFl("WebViewSettings", "setJavaScriptEnabled error", th2);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th3) {
            DSW.YFl("WebViewSettings", "setSupportZoom error", th3);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i10 = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z10 = i10 >= 28;
        try {
        } catch (Throwable th4) {
            DSW.YFl("WebViewSettings", "setLayerType error", th4);
        }
        if (!z10) {
            webView.setLayerType(0, null);
        } else {
            if (z10) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}

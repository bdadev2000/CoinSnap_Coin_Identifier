package com.bytedance.sdk.openadsdk.core.widget.YFl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.YoT;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class tN {
    private final WeakReference<Context> YFl;
    private boolean Sg = true;
    private final boolean tN = true;
    private final boolean AlY = true;
    private final boolean wN = false;

    /* renamed from: vc, reason: collision with root package name */
    private final boolean f10761vc = true;
    private boolean DSW = true;

    private tN(Context context) {
        this.YFl = new WeakReference<>(context);
    }

    public static tN YFl(Context context) {
        return new tN(context);
    }

    public tN Sg(boolean z10) {
        this.Sg = z10;
        return this;
    }

    public static void Sg(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            YoT.Sg(th2.toString());
        }
    }

    public tN YFl(boolean z10) {
        this.DSW = z10;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void YFl(WebView webView) {
        if (webView == null || this.YFl.get() == null) {
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
        } catch (Exception e2) {
            YoT.YFl("SSWebSettings", e2.getMessage());
        }
        try {
            if (this.Sg) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th2) {
            YoT.YFl("SSWebSettings", th2.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.DSW) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th3) {
            YoT.YFl("SSWebSettings", th3.getMessage());
        }
    }

    private void YFl(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            YoT.Sg(th2.toString());
        }
    }
}

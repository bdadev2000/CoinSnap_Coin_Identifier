package com.bytedance.sdk.openadsdk.core.widget.zp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.tG;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class KS {
    private final WeakReference<Context> zp;
    private boolean lMd = true;
    private final boolean KS = true;
    private final boolean jU = true;
    private final boolean COT = false;
    private final boolean HWF = true;
    private boolean QR = true;

    private KS(Context context) {
        this.zp = new WeakReference<>(context);
    }

    public static KS zp(Context context) {
        return new KS(context);
    }

    public KS lMd(boolean z8) {
        this.lMd = z8;
        return this;
    }

    public static void lMd(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            tG.lMd(th.toString());
        }
    }

    public KS zp(boolean z8) {
        this.QR = z8;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void zp(WebView webView) {
        if (webView == null || this.zp.get() == null) {
            return;
        }
        lMd(webView);
        WebSettings settings = webView.getSettings();
        zp(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e4) {
            tG.zp("SSWebSettings", e4.getMessage());
        }
        try {
            if (this.lMd) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            tG.zp("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.QR) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            tG.zp("SSWebSettings", th2.getMessage());
        }
    }

    private void zp(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            tG.lMd(th.toString());
        }
    }
}

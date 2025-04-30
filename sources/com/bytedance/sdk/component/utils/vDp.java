package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class vDp {
    private static final zp zp = new lMd();

    @TargetApi(19)
    /* loaded from: classes.dex */
    public static class lMd extends zp {
        private lMd() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.vDp.zp
        public void zp(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z8 = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class zp {
        private zp() {
        }

        public void zp(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void zp(WebView webView, String str) {
        zp.zp(webView, str);
    }
}

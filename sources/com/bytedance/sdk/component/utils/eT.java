package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class eT {
    private static final YFl YFl = new Sg();

    @TargetApi(19)
    /* loaded from: classes.dex */
    public static class Sg extends YFl {
        private Sg() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.eT.YFl
        public void YFl(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            boolean z10 = false;
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    z10 = true;
                } catch (Throwable th2) {
                    boolean z11 = th2 instanceof IllegalStateException;
                }
            }
            if (!z10) {
                try {
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl {
        private YFl() {
        }

        public void YFl(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void YFl(WebView webView, String str) {
        YFl.YFl(webView, str);
    }
}

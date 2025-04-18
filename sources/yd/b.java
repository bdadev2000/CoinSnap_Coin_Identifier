package yd;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class b extends a {
    public b(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f28167b = new ce.a(webView);
    }
}

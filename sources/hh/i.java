package hh;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;

/* loaded from: classes4.dex */
public interface i {
    void onReceivedError(String str, boolean z10);

    void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

    boolean onWebRenderingProcessGone(WebView webView, Boolean bool);
}

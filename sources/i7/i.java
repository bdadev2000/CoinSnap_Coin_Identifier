package i7;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;

/* loaded from: classes3.dex */
public interface i {
    void onReceivedError(String str, boolean z8);

    void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

    boolean onWebRenderingProcessGone(WebView webView, Boolean bool);
}

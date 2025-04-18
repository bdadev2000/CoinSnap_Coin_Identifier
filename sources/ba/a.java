package ba;

import android.content.LocusId;
import android.media.MediaCodecInfo;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ LocusId c(String str) {
        return new LocusId(str);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ void q(WebView webView, WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }
}

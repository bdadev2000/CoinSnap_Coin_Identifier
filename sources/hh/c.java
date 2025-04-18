package hh;

import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements Runnable {
    private final WebView webView;

    public c(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.webView.stopLoading();
            if (Build.VERSION.SDK_INT >= 29) {
                this.webView.setWebViewRenderProcessClient(null);
            }
            this.webView.loadData("", null, null);
            this.webView.destroy();
        } catch (Throwable unused) {
        }
    }
}

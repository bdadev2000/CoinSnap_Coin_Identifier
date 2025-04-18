package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@RequiresApi
/* loaded from: classes2.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.webkit.WebViewRenderProcessClient f21837a;

    public WebViewRenderProcessClientFrameworkAdapter(androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.f21837a = webViewRenderProcessClient;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient = this.f21837a;
        WeakHashMap weakHashMap = WebViewRenderProcessImpl.f21838b;
        if (((WebViewRenderProcessImpl) weakHashMap.get(webViewRenderProcess)) == null) {
            Object obj = new Object();
            new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, obj);
        }
        webViewRenderProcessClient.a();
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient = this.f21837a;
        WeakHashMap weakHashMap = WebViewRenderProcessImpl.f21838b;
        if (((WebViewRenderProcessImpl) weakHashMap.get(webViewRenderProcess)) == null) {
            Object obj = new Object();
            new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, obj);
        }
        webViewRenderProcessClient.b();
    }
}

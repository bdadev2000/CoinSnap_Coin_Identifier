package androidx.webkit;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebViewCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21802a = 0;

    /* loaded from: classes2.dex */
    public interface VisualStateCallback {
        void onComplete();
    }

    /* loaded from: classes2.dex */
    public interface WebMessageListener {
        void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy);
    }

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.webkit.internal.WebViewProviderAdapter] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.webkit.internal.WebMessageListenerAdapter, java.lang.Object] */
    public static void a(WebView webView, String str, Set set, WebMessageListener webMessageListener) {
        if (!WebViewFeatureInternal.f21830h.c()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewProviderBoundaryInterface createWebView = WebViewGlueCommunicator.b().createWebView(webView);
        ?? obj = new Object();
        obj.f21834a = createWebView;
        String[] strArr = (String[]) set.toArray(new String[0]);
        ?? obj2 = new Object();
        obj2.f21820a = webMessageListener;
        obj.f21834a.addWebMessageListener(str, strArr, BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(obj2));
    }
}

package T0;

import U0.l;
import U0.m;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import com.facebook.ads.internal.dynamicloading.g;
import j5.C2400c;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2954a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, d dVar) {
        if (l.f3110c.b()) {
            WebViewProviderBoundaryInterface createWebView = m.f3112a.createWebView(webView);
            String[] strArr = (String[]) set.toArray(new String[0]);
            C2400c c2400c = new C2400c(17, false);
            c2400c.f21107c = dVar;
            createWebView.addWebMessageListener(str, strArr, new g(c2400c, 1));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}

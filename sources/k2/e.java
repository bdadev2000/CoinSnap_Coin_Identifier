package k2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import com.facebook.ads.internal.dynamicloading.g;
import java.util.Set;
import l2.n;
import l2.o;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class e {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, d dVar) {
        if (n.f21120d.b()) {
            v3.c c10 = c(webView);
            ((WebViewProviderBoundaryInterface) c10.f26021c).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new g(new kc.c(dVar, 11), 1));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static v3.c c(WebView webView) {
        return new v3.c(o.a.createWebView(webView), 11);
    }
}

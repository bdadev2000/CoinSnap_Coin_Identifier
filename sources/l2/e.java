package l2;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class e {
    @NonNull
    public static PackageInfo a() {
        PackageInfo currentWebViewPackage;
        currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return currentWebViewPackage;
    }

    public static boolean b(@NonNull WebSettings webSettings) {
        boolean safeBrowsingEnabled;
        safeBrowsingEnabled = webSettings.getSafeBrowsingEnabled();
        return safeBrowsingEnabled;
    }

    @Nullable
    public static WebChromeClient c(@NonNull WebView webView) {
        WebChromeClient webChromeClient;
        webChromeClient = webView.getWebChromeClient();
        return webChromeClient;
    }

    @Nullable
    public static WebViewClient d(@NonNull WebView webView) {
        WebViewClient webViewClient;
        webViewClient = webView.getWebViewClient();
        return webViewClient;
    }

    public static void e(@NonNull WebSettings webSettings, boolean z10) {
        webSettings.setSafeBrowsingEnabled(z10);
    }
}

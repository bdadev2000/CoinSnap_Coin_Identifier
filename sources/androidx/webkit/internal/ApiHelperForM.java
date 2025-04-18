package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;

@RequiresApi
/* loaded from: classes3.dex */
public class ApiHelperForM {
    @DoNotInline
    public static void a(@NonNull WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    @NonNull
    @DoNotInline
    public static WebMessage b(@NonNull WebMessageCompat webMessageCompat) {
        WebMessagePort[] webMessagePortArr;
        webMessageCompat.a(0);
        WebMessagePortCompat[] webMessagePortCompatArr = webMessageCompat.f21798a;
        if (webMessagePortCompatArr == null) {
            webMessagePortArr = null;
        } else {
            int length = webMessagePortCompatArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i2 = 0; i2 < length; i2++) {
                webMessagePortArr2[i2] = webMessagePortCompatArr[i2].a();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(webMessageCompat.f21799b, webMessagePortArr);
    }

    @NonNull
    @DoNotInline
    public static WebMessagePort[] c(@NonNull WebView webView) {
        return webView.createWebMessageChannel();
    }

    @NonNull
    @DoNotInline
    public static WebMessageCompat d(@NonNull WebMessage webMessage) {
        WebMessagePortCompat[] webMessagePortCompatArr;
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            webMessagePortCompatArr = null;
        } else {
            WebMessagePortCompat[] webMessagePortCompatArr2 = new WebMessagePortCompat[ports.length];
            for (int i2 = 0; i2 < ports.length; i2++) {
                webMessagePortCompatArr2[i2] = new WebMessagePortImpl(ports[i2]);
            }
            webMessagePortCompatArr = webMessagePortCompatArr2;
        }
        return new WebMessageCompat(data, webMessagePortCompatArr);
    }

    @NonNull
    @DoNotInline
    public static CharSequence e(@NonNull WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    @DoNotInline
    public static int f(@NonNull WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    @DoNotInline
    public static boolean g(@NonNull WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    @DoNotInline
    public static void h(@NonNull WebMessagePort webMessagePort, @NonNull WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    @DoNotInline
    public static void i(@NonNull WebView webView, long j2, @NonNull final WebViewCompat.VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j2, new WebView.VisualStateCallback() { // from class: androidx.webkit.internal.ApiHelperForM.3
            @Override // android.webkit.WebView.VisualStateCallback
            public final void onComplete(long j3) {
                WebViewCompat.VisualStateCallback.this.onComplete();
            }
        });
    }

    @DoNotInline
    public static void j(@NonNull WebView webView, @NonNull WebMessage webMessage, @NonNull Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    @DoNotInline
    public static void k(@NonNull WebSettings webSettings, boolean z2) {
        webSettings.setOffscreenPreRaster(z2);
    }

    @DoNotInline
    public static void l(@NonNull WebMessagePort webMessagePort, @NonNull final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.1
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public final void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                ApiHelperForM.d(webMessage);
                WebMessagePortCompat.WebMessageCallbackCompat.this.getClass();
            }
        });
    }

    @DoNotInline
    public static void m(@NonNull WebMessagePort webMessagePort, @NonNull final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat, @Nullable Handler handler) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.2
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public final void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                ApiHelperForM.d(webMessage);
                WebMessagePortCompat.WebMessageCallbackCompat.this.getClass();
            }
        }, handler);
    }
}

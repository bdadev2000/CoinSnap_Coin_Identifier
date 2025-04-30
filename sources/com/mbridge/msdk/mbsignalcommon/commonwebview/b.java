package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<WebViewClient> f16642a = new CopyOnWriteArrayList<>();

    public final void a(WebViewClient webViewClient) {
        this.f16642a.add(webViewClient);
    }

    public final void b(WebViewClient webViewClient) {
        this.f16642a.remove(webViewClient);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z8) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().doUpdateVisitedHistory(webView, str, z8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        try {
            Iterator<WebViewClient> it = this.f16642a.iterator();
            while (it.hasNext()) {
                it.next().onPageCommitVisible(webView, str);
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            Iterator<WebViewClient> it = this.f16642a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i9, String str, String str2) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedError(webView, i9, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            Iterator<WebViewClient> it = this.f16642a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean z8 = false;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<WebViewClient> it = this.f16642a.iterator();
                while (it.hasNext()) {
                    z8 = it.next().onRenderProcessGone(webView, renderProcessGoneDetail);
                }
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
        return z8;
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i9, SafeBrowsingResponse safeBrowsingResponse) {
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                Iterator<WebViewClient> it = this.f16642a.iterator();
                while (it.hasNext()) {
                    it.next().onSafeBrowsingHit(webView, webResourceRequest, i9, safeBrowsingResponse);
                }
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f9, float f10) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onScaleChanged(webView, f9, f10);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        while (it.hasNext()) {
            it.next().onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        WebResourceResponse webResourceResponse = null;
        while (it.hasNext()) {
            webResourceResponse = it.next().shouldInterceptRequest(webView, str);
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = it.next().shouldOverrideKeyEvent(webView, keyEvent);
        }
        return z8;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f16642a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            boolean shouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(webView, str);
            if (shouldOverrideUrlLoading) {
                z8 = shouldOverrideUrlLoading;
            }
        }
        return z8;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            Iterator<WebViewClient> it = this.f16642a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse = null;
        try {
            Iterator<WebViewClient> it = this.f16642a.iterator();
            while (it.hasNext()) {
                webResourceResponse = it.next().shouldInterceptRequest(webView, webResourceRequest);
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z8 = false;
        try {
            Iterator<WebViewClient> it = this.f16642a.iterator();
            while (it.hasNext()) {
                boolean shouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
                if (shouldOverrideUrlLoading) {
                    z8 = shouldOverrideUrlLoading;
                }
            }
        } catch (Exception e4) {
            ad.b("CommonWebViewClient", e4.getMessage());
        }
        return z8;
    }
}

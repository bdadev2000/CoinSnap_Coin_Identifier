package com.glority.base.widget.webview;

import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewClientProxy.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0018\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0019\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u001c\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lcom/glority/base/widget/webview/WebViewClientProxy;", "Landroid/webkit/WebViewClient;", "webView", "Lcom/glority/base/widget/webview/JsbWebView;", "<init>", "(Lcom/glority/base/widget/webview/JsbWebView;)V", "webViewClient", "getWebViewClient$base_release", "()Landroid/webkit/WebViewClient;", "setWebViewClient$base_release", "(Landroid/webkit/WebViewClient;)V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "request", "Landroid/webkit/WebResourceRequest;", "onPageStarted", "", "favicon", "Landroid/graphics/Bitmap;", "onPageFinished", "onLoadResource", "onPageCommitVisible", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "onTooManyRedirects", "cancelMsg", "Landroid/os/Message;", "continueMsg", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class WebViewClientProxy extends WebViewClient {
    public static final int $stable = 8;
    private final JsbWebView webView;
    private WebViewClient webViewClient;

    public WebViewClientProxy(JsbWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
    }

    /* renamed from: getWebViewClient$base_release, reason: from getter */
    public final WebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    public final void setWebViewClient$base_release(WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        WebViewClient webViewClient = this.webViewClient;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(view, url) : super.shouldOverrideUrlLoading(view, url);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        WebViewClient webViewClient = this.webViewClient;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(view, request) : super.shouldOverrideUrlLoading(view, request);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        this.webView.evaluateJavascript("console.log(\"123\")", null);
        this.webView.rejectStartupParams();
        this.webView.evaluateJavascript(JsbKt.jsb, null);
        WebViewClient webViewClient = this.webViewClient;
        if (webViewClient != null) {
            webViewClient.onPageStarted(view, url, favicon);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        WebViewClient webViewClient = this.webViewClient;
        if (webViewClient != null) {
            webViewClient.onPageFinished(view, url);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        WebViewClient webViewClient = this.webViewClient;
        if (webViewClient != null) {
            webViewClient.onLoadResource(view, url);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView view, String url) {
        WebViewClient webViewClient = this.webViewClient;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(view, url);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebViewClient webViewClient = this.webViewClient;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(view, request);
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        WebViewClient webViewClient = this.webViewClient;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(view, url);
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView view, Message cancelMsg, Message continueMsg) {
        WebViewClient webViewClient = this.webViewClient;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(view, cancelMsg, continueMsg);
        }
    }
}

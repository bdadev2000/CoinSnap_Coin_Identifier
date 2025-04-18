package com.bytedance.sdk.component.NjR;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.component.sdk.annotation.RequiresApi;
import com.bytedance.sdk.component.NjR.YFl;
import java.util.List;

/* loaded from: classes.dex */
public class wN extends WebViewClient {
    private final YFl.InterfaceC0077YFl Sg;
    private final WebViewClient YFl;
    private final List<String> tN;

    public wN(YFl.InterfaceC0077YFl interfaceC0077YFl, WebViewClient webViewClient, List<String> list) {
        this.Sg = interfaceC0077YFl;
        this.YFl = webViewClient;
        this.tN = list;
    }

    private int YFl(WebView webView) {
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList == null) {
                return -1;
            }
            return copyBackForwardList.getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.YFl.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        YFl.InterfaceC0077YFl interfaceC0077YFl = this.Sg;
        if (interfaceC0077YFl != null) {
            interfaceC0077YFl.YFl(YFl(webView));
        }
        this.YFl.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.YFl.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.YFl.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.YFl.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.YFl.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.YFl.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        YFl.InterfaceC0077YFl interfaceC0077YFl = this.Sg;
        if (interfaceC0077YFl != null) {
            interfaceC0077YFl.YFl();
        }
        return this.YFl.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.YFl.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        YFl.InterfaceC0077YFl interfaceC0077YFl;
        if (Sg.YFl(this.tN, webResourceRequest.getUrl().toString()) && (interfaceC0077YFl = this.Sg) != null) {
            interfaceC0077YFl.YFl();
        }
        return this.YFl.shouldInterceptRequest(webView, webResourceRequest);
    }
}

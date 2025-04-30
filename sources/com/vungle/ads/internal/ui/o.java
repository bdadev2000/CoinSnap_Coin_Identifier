package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;

/* loaded from: classes3.dex */
public final class o extends WebViewRenderProcessClient {
    private i7.i errorHandler;

    public o(i7.i iVar) {
        this.errorHandler = iVar;
    }

    public final i7.i getErrorHandler() {
        return this.errorHandler;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        G7.j.e(webView, "webView");
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        boolean z8;
        G7.j.e(webView, "webView");
        u uVar = v.Companion;
        StringBuilder sb = new StringBuilder("onRenderProcessUnresponsive(Title = ");
        sb.append(webView.getTitle());
        sb.append(", URL = ");
        sb.append(webView.getOriginalUrl());
        sb.append(", (webViewRenderProcess != null) = ");
        if (webViewRenderProcess != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        sb.append(z8);
        uVar.w("VungleWebClient", sb.toString());
        i7.i iVar = this.errorHandler;
        if (iVar != null) {
            ((com.vungle.ads.internal.presenter.q) iVar).onRenderProcessUnresponsive(webView, webViewRenderProcess);
        }
    }

    public final void setErrorHandler(i7.i iVar) {
        this.errorHandler = iVar;
    }
}

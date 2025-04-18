package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends WebViewRenderProcessClient {
    private hh.i errorHandler;

    public o(hh.i iVar) {
        this.errorHandler = iVar;
    }

    public final hh.i getErrorHandler() {
        return this.errorHandler;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        boolean z10;
        Intrinsics.checkNotNullParameter(webView, "webView");
        u uVar = v.Companion;
        StringBuilder sb2 = new StringBuilder("onRenderProcessUnresponsive(Title = ");
        sb2.append(webView.getTitle());
        sb2.append(", URL = ");
        sb2.append(webView.getOriginalUrl());
        sb2.append(", (webViewRenderProcess != null) = ");
        if (webViewRenderProcess != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        uVar.w("VungleWebClient", sb2.toString());
        hh.i iVar = this.errorHandler;
        if (iVar != null) {
            ((com.vungle.ads.internal.presenter.q) iVar).onRenderProcessUnresponsive(webView, webViewRenderProcess);
        }
    }

    public final void setErrorHandler(hh.i iVar) {
        this.errorHandler = iVar;
    }
}

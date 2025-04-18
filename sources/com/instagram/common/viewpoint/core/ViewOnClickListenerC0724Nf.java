package com.instagram.common.viewpoint.core;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Nf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0724Nf implements View.OnClickListener {
    public final /* synthetic */ C0728Nj A00;

    public ViewOnClickListenerC0724Nf(C0728Nj c0728Nj) {
        this.A00 = c0728Nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A0A;
            if (!webView.canGoBack()) {
                return;
            }
            webView2 = this.A00.A0A;
            webView2.goBack();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}

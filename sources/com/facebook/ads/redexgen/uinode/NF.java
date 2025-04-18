package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.webkit.WebView;

/* loaded from: assets/audience_network.dex */
public class NF implements View.OnClickListener {
    public final /* synthetic */ NJ A00;

    public NF(NJ nj) {
        this.A00 = nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (KL.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A0A;
            if (!webView.canGoBack()) {
                return;
            }
            webView2 = this.A00.A0A;
            webView2.goBack();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}

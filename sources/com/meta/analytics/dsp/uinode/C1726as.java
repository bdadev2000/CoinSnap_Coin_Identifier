package com.meta.analytics.dsp.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1726as implements C6U {
    public final C08131c A00;
    public final InterfaceC08271q A01;
    public final C09416c A02;
    public final C1636Yn A03;
    public final boolean A04;

    public C1726as(C1636Yn c1636Yn, InterfaceC08271q interfaceC08271q, C09416c c09416c, C08131c c08131c, boolean z8) {
        this.A03 = c1636Yn;
        this.A01 = interfaceC08271q;
        this.A02 = c09416c;
        this.A00 = c08131c;
        this.A04 = z8;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C08281r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z8) {
        if (this.A00.A09() == EnumC08141d.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z8) {
            C09416c c09416c = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c09416c.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ACa();
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}

package com.facebook.ads.redexgen.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1160as implements C6U {
    public final C02471c A00;
    public final InterfaceC02611q A01;
    public final C03756c A02;
    public final C1070Yn A03;
    public final boolean A04;

    public C1160as(C1070Yn c1070Yn, InterfaceC02611q interfaceC02611q, C03756c c03756c, C02471c c02471c, boolean z10) {
        this.A03 = c1070Yn;
        this.A01 = interfaceC02611q;
        this.A02 = c03756c;
        this.A00 = c02471c;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C02621r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z10) {
        if (this.A00.A09() == EnumC02481d.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z10) {
            C03756c c03756c = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c03756c.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ACa();
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}

package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.c0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1174c0 implements C6X {
    public final C01901b A00;
    public final InterfaceC02041p A01;
    public final C03226f A02;
    public final C1045Zs A03;
    public final boolean A04;

    public C1174c0(C1045Zs c1045Zs, InterfaceC02041p interfaceC02041p, C03226f c03226f, C01901b c01901b, boolean z2) {
        this.A03 = c1045Zs;
        this.A01 = interfaceC02041p;
        this.A02 = c03226f;
        this.A00 = c01901b;
        this.A04 = z2;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        C02051q playableWebViewClient = new C02051q(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0F());
        playableWebViewClient.A03();
    }

    private void A01(boolean z2) {
        if (this.A00.A0A() == EnumC01911c.A05) {
            A00();
            return;
        }
        String A0F = this.A00.A0F();
        if (z2) {
            C03226f c03226f = this.A02;
            String markupUrlResult = this.A00.A0F();
            A0F = c03226f.A0R(markupUrlResult);
        }
        this.A00.A0K(A0F);
        this.A01.AD3();
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABT() {
        if (this.A04) {
            this.A01.AD2(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABc() {
        A01(true);
    }
}

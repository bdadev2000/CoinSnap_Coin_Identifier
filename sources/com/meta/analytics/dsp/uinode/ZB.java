package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZB implements C6U {
    public final List<C1754bK> A00;
    public final /* synthetic */ ZA A01;

    public ZB(ZA za, List<C1754bK> list) {
        this.A01 = za;
        this.A00 = list;
    }

    private void A00() {
        C09255m c09255m;
        C09255m c09255m2;
        C09255m c09255m3;
        C1636Yn c1636Yn;
        C09255m c09255m4;
        C09255m c09255m5;
        C1636Yn c1636Yn2;
        c09255m = this.A01.A00;
        c09255m.A05(true);
        c09255m2 = this.A01.A00;
        c09255m2.A02();
        c09255m3 = this.A01.A00;
        c09255m3.A03(0);
        for (C1754bK c1754bK : this.A00) {
            c1636Yn = this.A01.A01;
            V5 A0K = V2.A0K();
            c09255m4 = this.A01.A00;
            V2 v22 = new V2(c1636Yn, c1754bK, null, A0K, c09255m4.A01());
            if (v22.A0y() != null && v22.A0y().A0F() != null) {
                ((AbstractC1715ah) v22.A0y().A0F()).A00(v22);
            }
            c09255m5 = this.A01.A00;
            c1636Yn2 = this.A01.A01;
            c09255m5.A04(new NativeAd(c1636Yn2, v22));
        }
        KK.A00(new ZC(this));
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00();
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00();
    }
}

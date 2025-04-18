package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZB implements C6U {
    public final List<C1188bK> A00;
    public final /* synthetic */ ZA A01;

    public ZB(ZA za2, List<C1188bK> list) {
        this.A01 = za2;
        this.A00 = list;
    }

    private void A00() {
        C03595m c03595m;
        C03595m c03595m2;
        C03595m c03595m3;
        C1070Yn c1070Yn;
        C03595m c03595m4;
        C03595m c03595m5;
        C1070Yn c1070Yn2;
        c03595m = this.A01.A00;
        c03595m.A05(true);
        c03595m2 = this.A01.A00;
        c03595m2.A02();
        c03595m3 = this.A01.A00;
        c03595m3.A03(0);
        for (C1188bK c1188bK : this.A00) {
            c1070Yn = this.A01.A01;
            V5 A0K = V2.A0K();
            c03595m4 = this.A01.A00;
            V2 v22 = new V2(c1070Yn, c1188bK, null, A0K, c03595m4.A01());
            if (v22.A0y() != null && v22.A0y().A0F() != null) {
                ((AbstractC1149ah) v22.A0y().A0F()).A00(v22);
            }
            c03595m5 = this.A01.A00;
            c1070Yn2 = this.A01.A01;
            c03595m5.A04(new NativeAd(c1070Yn2, v22));
        }
        KK.A00(new ZC(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A00();
    }
}

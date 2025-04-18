package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TP extends RD {
    public final /* synthetic */ B3 A00;

    public TP(B3 b3) {
        this.A00 = b3;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        C0729Lg c0729Lg;
        C0729Lg c0729Lg2;
        RE re2;
        C0729Lg c0729Lg3;
        J2 j22;
        AbstractC1173b5 abstractC1173b5;
        AbstractC1173b5 abstractC1173b52;
        C1070Yn c1070Yn;
        C1070Yn c1070Yn2;
        AbstractC1173b5 abstractC1173b53;
        MC mc2;
        MC mc3;
        InterfaceC0758Mj interfaceC0758Mj;
        c0729Lg = this.A00.A0B;
        if (!c0729Lg.A07()) {
            c0729Lg2 = this.A00.A0B;
            c0729Lg2.A05();
            C0783Ni c0783Ni = new C0783Ni();
            re2 = this.A00.A0H;
            C0783Ni A03 = c0783Ni.A03(re2);
            c0729Lg3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(c0729Lg3).A05();
            j22 = this.A00.A08;
            abstractC1173b5 = this.A00.A06;
            j22.A9g(abstractC1173b5.A12(), A05);
            abstractC1173b52 = this.A00.A06;
            C1U A0y = abstractC1173b52.A0y();
            c1070Yn = this.A00.A07;
            C1U.A07(A0y, c1070Yn);
            c1070Yn2 = this.A00.A07;
            c1070Yn2.A0E().A2k();
            abstractC1173b53 = this.A00.A06;
            C2O.A00(abstractC1173b53.A0N());
            mc2 = this.A00.A0C;
            if (mc2 != null) {
                mc3 = this.A00.A0C;
                interfaceC0758Mj = this.A00.A0D;
                mc3.A43(interfaceC0758Mj.A7B());
            }
        }
    }
}

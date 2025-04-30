package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TP extends RD {
    public final /* synthetic */ B3 A00;

    public TP(B3 b32) {
        this.A00 = b32;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        C1295Lg c1295Lg;
        C1295Lg c1295Lg2;
        RE re;
        C1295Lg c1295Lg3;
        J2 j22;
        AbstractC1739b5 abstractC1739b5;
        AbstractC1739b5 abstractC1739b52;
        C1636Yn c1636Yn;
        C1636Yn c1636Yn2;
        AbstractC1739b5 abstractC1739b53;
        MC mc;
        MC mc2;
        InterfaceC1324Mj interfaceC1324Mj;
        c1295Lg = this.A00.A0B;
        if (!c1295Lg.A07()) {
            c1295Lg2 = this.A00.A0B;
            c1295Lg2.A05();
            C1349Ni c1349Ni = new C1349Ni();
            re = this.A00.A0H;
            C1349Ni A03 = c1349Ni.A03(re);
            c1295Lg3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(c1295Lg3).A05();
            j22 = this.A00.A08;
            abstractC1739b5 = this.A00.A06;
            j22.A9g(abstractC1739b5.A12(), A05);
            abstractC1739b52 = this.A00.A06;
            C1U A0y = abstractC1739b52.A0y();
            c1636Yn = this.A00.A07;
            C1U.A07(A0y, c1636Yn);
            c1636Yn2 = this.A00.A07;
            c1636Yn2.A0E().A2k();
            abstractC1739b53 = this.A00.A06;
            C2O.A00(abstractC1739b53.A0N());
            mc = this.A00.A0C;
            if (mc != null) {
                mc2 = this.A00.A0C;
                interfaceC1324Mj = this.A00.A0D;
                mc2.A43(interfaceC1324Mj.A7B());
            }
        }
    }
}

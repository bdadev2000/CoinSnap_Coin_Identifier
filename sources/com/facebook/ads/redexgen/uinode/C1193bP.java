package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1193bP extends RD {
    public final /* synthetic */ C1191bN A00;

    public C1193bP(C1191bN c1191bN) {
        this.A00 = c1191bN;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        C0729Lg c0729Lg;
        C0729Lg c0729Lg2;
        EQ eq;
        C1179bB c1179bB;
        EQ eq2;
        FV fv;
        RE re2;
        C0729Lg c0729Lg3;
        FV fv2;
        J2 j22;
        FV fv3;
        FV fv4;
        FV fv5;
        C1U A0y;
        EQ eq3;
        RE re3;
        c0729Lg = this.A00.A06;
        if (!c0729Lg.A07()) {
            c0729Lg2 = this.A00.A06;
            c0729Lg2.A05();
            eq = this.A00.A04;
            InterfaceC1210bg A0E = eq.A0E();
            c1179bB = this.A00.A02;
            A0E.A3k(c1179bB != null);
            eq2 = this.A00.A04;
            eq2.A0E().A2k();
            fv = this.A00.A03;
            C2O.A00(fv.A0N());
            C0783Ni c0783Ni = new C0783Ni();
            re2 = this.A00.A0B;
            C0783Ni A03 = c0783Ni.A03(re2);
            c0729Lg3 = this.A00.A06;
            C0783Ni A02 = A03.A02(c0729Lg3);
            fv2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(fv2.A0O()).A05();
            j22 = this.A00.A05;
            fv3 = this.A00.A03;
            j22.A9g(fv3.A12(), A05);
            fv4 = this.A00.A03;
            if (fv4 == null) {
                A0y = null;
            } else {
                fv5 = this.A00.A03;
                A0y = fv5.A0y();
            }
            eq3 = this.A00.A04;
            C1U.A07(A0y, eq3);
            re3 = this.A00.A0B;
            re3.A0V();
        }
    }
}

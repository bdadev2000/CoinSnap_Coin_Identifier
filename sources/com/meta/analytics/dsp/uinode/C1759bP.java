package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1759bP extends RD {
    public final /* synthetic */ C1757bN A00;

    public C1759bP(C1757bN c1757bN) {
        this.A00 = c1757bN;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        C1295Lg c1295Lg;
        C1295Lg c1295Lg2;
        EQ eq;
        C1745bB c1745bB;
        EQ eq2;
        FV fv;
        RE re;
        C1295Lg c1295Lg3;
        FV fv2;
        J2 j22;
        FV fv3;
        FV fv4;
        FV fv5;
        C1U A0y;
        EQ eq3;
        RE re2;
        c1295Lg = this.A00.A06;
        if (!c1295Lg.A07()) {
            c1295Lg2 = this.A00.A06;
            c1295Lg2.A05();
            eq = this.A00.A04;
            InterfaceC1776bg A0E = eq.A0E();
            c1745bB = this.A00.A02;
            A0E.A3k(c1745bB != null);
            eq2 = this.A00.A04;
            eq2.A0E().A2k();
            fv = this.A00.A03;
            C2O.A00(fv.A0N());
            C1349Ni c1349Ni = new C1349Ni();
            re = this.A00.A0B;
            C1349Ni A03 = c1349Ni.A03(re);
            c1295Lg3 = this.A00.A06;
            C1349Ni A02 = A03.A02(c1295Lg3);
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
            re2 = this.A00.A0B;
            re2.A0V();
        }
    }
}

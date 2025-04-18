package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class UL extends AbstractC0832Rj {
    public final /* synthetic */ BO A00;

    public UL(BO bo) {
        this.A00 = bo;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        C0688Lv c0688Lv;
        C0688Lv c0688Lv2;
        C0833Rk c0833Rk;
        C0688Lv c0688Lv3;
        J7 j7;
        AbstractC1187cD abstractC1187cD;
        C1045Zs c1045Zs;
        N9 n9;
        AbstractC1187cD abstractC1187cD2;
        AbstractC1187cD abstractC1187cD3;
        C1045Zs c1045Zs2;
        C1045Zs c1045Zs3;
        AbstractC1187cD abstractC1187cD4;
        AbstractC1187cD abstractC1187cD5;
        MR mr;
        MR mr2;
        N9 n92;
        c0688Lv = this.A00.A0B;
        if (!c0688Lv.A07()) {
            c0688Lv2 = this.A00.A0B;
            c0688Lv2.A05();
            O8 o8 = new O8();
            c0833Rk = this.A00.A0H;
            O8 A03 = o8.A03(c0833Rk);
            c0688Lv3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(c0688Lv3).A05();
            j7 = this.A00.A08;
            abstractC1187cD = this.A00.A06;
            j7.AA6(abstractC1187cD.A1U(), A05);
            c1045Zs = this.A00.A07;
            C0651Kh A00 = C0651Kh.A00(c1045Zs);
            n9 = this.A00.A0D;
            String A83 = n9.A83();
            abstractC1187cD2 = this.A00.A06;
            A00.A0E(A83, abstractC1187cD2.A1U());
            abstractC1187cD3 = this.A00.A06;
            C1T A1Q = abstractC1187cD3.A1Q();
            c1045Zs2 = this.A00.A07;
            C1T.A07(A1Q, c1045Zs2);
            c1045Zs3 = this.A00.A07;
            c1045Zs3.A0E().A36();
            abstractC1187cD4 = this.A00.A06;
            String A0a = abstractC1187cD4.A0a();
            abstractC1187cD5 = this.A00.A06;
            C2M.A02(A0a, AbstractC0671Le.A00(abstractC1187cD5.A0c()));
            mr = this.A00.A0C;
            if (mr != null) {
                mr2 = this.A00.A0C;
                n92 = this.A00.A0D;
                mr2.A4P(n92.A7Z());
            }
        }
    }
}

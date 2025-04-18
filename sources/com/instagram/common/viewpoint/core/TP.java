package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TP extends AbstractC0832Rj {
    public final /* synthetic */ C9Z A00;

    public TP(C9Z c9z) {
        this.A00 = c9z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        C0688Lv c0688Lv;
        C0688Lv c0688Lv2;
        String str;
        C0833Rk c0833Rk;
        C0688Lv c0688Lv3;
        AbstractC1187cD abstractC1187cD;
        J7 j7;
        String str2;
        AbstractC1187cD abstractC1187cD2;
        C1045Zs c1045Zs;
        C1045Zs c1045Zs2;
        AbstractC1187cD abstractC1187cD3;
        AbstractC1187cD abstractC1187cD4;
        c0688Lv = this.A00.A0E;
        if (!c0688Lv.A07()) {
            C9Z c9z = this.A00;
            c0688Lv2 = this.A00.A0E;
            c9z.setImpressionRecordingFlag(c0688Lv2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                O8 o8 = new O8();
                c0833Rk = this.A00.A09;
                O8 A03 = o8.A03(c0833Rk);
                c0688Lv3 = this.A00.A0E;
                O8 A02 = A03.A02(c0688Lv3);
                abstractC1187cD = ((VP) ((VP) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC1187cD.A0b()).A05();
                j7 = ((VP) ((VP) this.A00)).A0C;
                str2 = this.A00.A0A;
                j7.AA6(str2, A05);
                abstractC1187cD2 = ((VP) ((VP) this.A00)).A0A;
                C1T A1Q = abstractC1187cD2.A1Q();
                c1045Zs = this.A00.A0D;
                C1T.A07(A1Q, c1045Zs);
                c1045Zs2 = this.A00.A0D;
                c1045Zs2.A0E().A36();
                abstractC1187cD3 = this.A00.A03;
                String A0a = abstractC1187cD3.A0a();
                abstractC1187cD4 = ((VP) ((VP) this.A00)).A0A;
                C2M.A02(A0a, AbstractC0671Le.A00(abstractC1187cD4.A0c()));
            }
        }
    }
}

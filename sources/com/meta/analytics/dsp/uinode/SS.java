package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SS extends RD {
    public final /* synthetic */ C9P A00;

    public SS(C9P c9p) {
        this.A00 = c9p;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        C1295Lg c1295Lg;
        C1295Lg c1295Lg2;
        String str;
        RE re;
        C1295Lg c1295Lg3;
        AbstractC1739b5 abstractC1739b5;
        J2 j22;
        String str2;
        AbstractC1739b5 abstractC1739b52;
        C1636Yn c1636Yn;
        C1636Yn c1636Yn2;
        AbstractC1739b5 abstractC1739b53;
        c1295Lg = this.A00.A0E;
        if (!c1295Lg.A07()) {
            C9P c9p = this.A00;
            c1295Lg2 = c9p.A0E;
            c9p.setImpressionRecordingFlag(c1295Lg2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C1349Ni c1349Ni = new C1349Ni();
                re = this.A00.A09;
                C1349Ni A03 = c1349Ni.A03(re);
                c1295Lg3 = this.A00.A0E;
                C1349Ni A02 = A03.A02(c1295Lg3);
                abstractC1739b5 = ((UL) ((UL) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC1739b5.A0O()).A05();
                j22 = ((UL) ((UL) this.A00)).A0C;
                str2 = this.A00.A0A;
                j22.A9g(str2, A05);
                abstractC1739b52 = ((UL) ((UL) this.A00)).A0A;
                C1U A0y = abstractC1739b52.A0y();
                c1636Yn = this.A00.A0D;
                C1U.A07(A0y, c1636Yn);
                c1636Yn2 = this.A00.A0D;
                c1636Yn2.A0E().A2k();
                abstractC1739b53 = this.A00.A03;
                C2O.A00(abstractC1739b53.A0N());
            }
        }
    }
}

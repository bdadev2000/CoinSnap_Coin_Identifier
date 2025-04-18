package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SS extends RD {
    public final /* synthetic */ C9P A00;

    public SS(C9P c9p) {
        this.A00 = c9p;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        C0729Lg c0729Lg;
        C0729Lg c0729Lg2;
        String str;
        RE re2;
        C0729Lg c0729Lg3;
        AbstractC1173b5 abstractC1173b5;
        J2 j22;
        String str2;
        AbstractC1173b5 abstractC1173b52;
        C1070Yn c1070Yn;
        C1070Yn c1070Yn2;
        AbstractC1173b5 abstractC1173b53;
        c0729Lg = this.A00.A0E;
        if (!c0729Lg.A07()) {
            C9P c9p = this.A00;
            c0729Lg2 = c9p.A0E;
            c9p.setImpressionRecordingFlag(c0729Lg2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C0783Ni c0783Ni = new C0783Ni();
                re2 = this.A00.A09;
                C0783Ni A03 = c0783Ni.A03(re2);
                c0729Lg3 = this.A00.A0E;
                C0783Ni A02 = A03.A02(c0729Lg3);
                abstractC1173b5 = ((UL) ((UL) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC1173b5.A0O()).A05();
                j22 = ((UL) ((UL) this.A00)).A0C;
                str2 = this.A00.A0A;
                j22.A9g(str2, A05);
                abstractC1173b52 = ((UL) ((UL) this.A00)).A0A;
                C1U A0y = abstractC1173b52.A0y();
                c1070Yn = this.A00.A0D;
                C1U.A07(A0y, c1070Yn);
                c1070Yn2 = this.A00.A0D;
                c1070Yn2.A0E().A2k();
                abstractC1173b53 = this.A00.A03;
                C2O.A00(abstractC1173b53.A0N());
            }
        }
    }
}

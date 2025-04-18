package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SP extends RD {
    public final /* synthetic */ J2 A00;
    public final /* synthetic */ C0729Lg A01;
    public final /* synthetic */ C0842Pp A02;
    public final /* synthetic */ SN A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public SP(SN sn, String str, C0842Pp c0842Pp, J2 j22, Map map, C0729Lg c0729Lg) {
        this.A03 = sn;
        this.A04 = str;
        this.A02 = c0842Pp;
        this.A00 = j22;
        this.A05 = map;
        this.A01 = c0729Lg;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        RE re2;
        SparseBooleanArray sparseBooleanArray;
        RE re3;
        C1U c1u;
        C1070Yn c1070Yn;
        SparseBooleanArray sparseBooleanArray2;
        re2 = this.A03.A02;
        if (!re2.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A08;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                J2 j22 = this.A00;
                String str = this.A04;
                C0783Ni c0783Ni = new C0783Ni(this.A05);
                re3 = this.A03.A03;
                j22.A9g(str, c0783Ni.A03(re3).A02(this.A01).A05());
                c1u = this.A03.A00;
                c1070Yn = this.A03.A09;
                C1U.A07(c1u, c1070Yn);
                sparseBooleanArray2 = this.A03.A08;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}

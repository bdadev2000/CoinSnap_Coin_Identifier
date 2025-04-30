package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SX extends RD {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ J2 A00;
    public final /* synthetic */ C1295Lg A01;
    public final /* synthetic */ C1408Pp A02;
    public final /* synthetic */ SV A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public SX(SV sv, String str, C1408Pp c1408Pp, J2 j22, Map map, C1295Lg c1295Lg) {
        this.A03 = sv;
        this.A04 = str;
        this.A02 = c1408Pp;
        this.A00 = j22;
        this.A05 = map;
        this.A01 = c1295Lg;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        RE re;
        SparseBooleanArray sparseBooleanArray;
        RE re2;
        C1U c1u;
        C1636Yn c1636Yn;
        SparseBooleanArray sparseBooleanArray2;
        re = this.A03.A02;
        if (re.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                J2 j22 = this.A00;
                String str2 = this.A04;
                C1349Ni c1349Ni = new C1349Ni(this.A05);
                re2 = this.A03.A03;
                j22.A9g(str2, c1349Ni.A03(re2).A02(this.A01).A05());
                c1u = this.A03.A00;
                c1636Yn = this.A03.A06;
                C1U.A07(c1u, c1636Yn);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}

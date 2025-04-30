package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class SW implements InterfaceC1383Oq {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ C1408Pp A00;
    public final /* synthetic */ SV A01;

    public SW(SV sv, C1408Pp c1408Pp) {
        this.A01 = sv;
        this.A00 = c1408Pp;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1383Oq
    public final void AAn() {
        RE re;
        RE re2;
        RE re3;
        if (this.A00.A02() == 0) {
            re3 = this.A01.A02;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            re3.A0U();
        }
        re = this.A01.A03;
        if (re != null) {
            re2 = this.A01.A03;
            re2.A0U();
        }
    }
}

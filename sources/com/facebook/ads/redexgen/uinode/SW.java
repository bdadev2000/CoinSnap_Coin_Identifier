package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SW implements InterfaceC0817Oq {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ C0842Pp A00;
    public final /* synthetic */ SV A01;

    public SW(SV sv, C0842Pp c0842Pp) {
        this.A01 = sv;
        this.A00 = c0842Pp;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0817Oq
    public final void AAn() {
        RE re2;
        RE re3;
        RE re4;
        if (this.A00.A02() == 0) {
            re4 = this.A01.A02;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            re4.A0U();
        }
        re2 = this.A01.A03;
        if (re2 != null) {
            re3 = this.A01.A03;
            re3.A0U();
        }
    }
}

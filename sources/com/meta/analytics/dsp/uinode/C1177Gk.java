package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Gk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1177Gk {
    public static String[] A04 = {"1e59kXQlLqMkYu", "73uDxCsdQKWLV7ukq8JJdZs18UKd6swo", "mCuMZDHsEtXcrT2f0", "82", "pR5c7vVXcuaoTTpQp", "OeCOW4uYvzA4LVqnaAabDbQ1U", "2mUnq0j6yY0W6wQrn1U3Lg5rNBUJPBqf", "6oWLaazoE5vpCSBDL9uHOzoNvgEAVE9"};
    public final int A00;
    public final C1174Gh A01;
    public final Object A02;
    public final AB[] A03;

    public C1177Gk(AB[] abArr, InterfaceC1173Gg[] interfaceC1173GgArr, Object obj) {
        this.A03 = abArr;
        this.A01 = new C1174Gh(interfaceC1173GgArr);
        this.A02 = obj;
        this.A00 = abArr.length;
    }

    public final boolean A00(int i9) {
        return this.A03[i9] != null;
    }

    public final boolean A01(C1177Gk c1177Gk) {
        if (c1177Gk == null || c1177Gk.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i9 = 0; i9 < this.A01.A01; i9++) {
            if (!A02(c1177Gk, i9)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(C1177Gk c1177Gk, int i9) {
        if (c1177Gk == null) {
            return false;
        }
        AB[] abArr = this.A03;
        String[] strArr = A04;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "XY11p18RHVDFci";
        strArr2[3] = "x2";
        return IF.A0g(abArr[i9], c1177Gk.A03[i9]) && IF.A0g(this.A01.A00(i9), c1177Gk.A01.A00(i9));
    }
}

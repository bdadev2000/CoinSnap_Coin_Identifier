package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.58, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass58 {
    public static String[] A05 = {"IS69BmVCyt3r7rCL06vW", "i2lfi3JYyaWanuhNA9EoVixSZwQkBGPJ", "IP2snh2DbdtJP84nmUNUnat", "M7qM02aMAAjP0VsgCoHzcI67snq6Xoz6", "g2Y2aWNGMjfm3AzRUQfTQ", "z59QBS9AE5GFtdBn17xV89BNaNN5ntVX", "icRlwMXc031dCVyQa9g0z", "JdVLDxEugZkBcdzJI35N90WET0E7DRJI"};
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    private final int A00(int i9, int i10) {
        if (i9 > i10) {
            return 1;
        }
        if (i9 == i10) {
            return 2;
        }
        return 4;
    }

    public final void A01() {
        this.A00 = 0;
    }

    public final void A02(int i9) {
        this.A00 |= i9;
    }

    public final void A03(int i9, int i10, int i11, int i12) {
        this.A04 = i9;
        this.A03 = i10;
        this.A02 = i11;
        this.A01 = i12;
    }

    public final boolean A04() {
        int i9 = this.A00;
        if ((i9 & 7) != 0 && (i9 & (A00(this.A02, this.A04) << 0)) == 0) {
            return false;
        }
        int i10 = this.A00;
        int i11 = i10 & 112;
        String[] strArr = A05;
        if (strArr[5].charAt(13) != strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        A05[0] = "xw0gZhFc6GA1WyK2bJob";
        if (i11 != 0 && (i10 & (A00(this.A02, this.A03) << 4)) == 0) {
            return false;
        }
        int i12 = this.A00;
        if ((i12 & 1792) != 0 && (i12 & (A00(this.A01, this.A04) << 8)) == 0) {
            return false;
        }
        int i13 = this.A00;
        return (i13 & 28672) == 0 || (i13 & (A00(this.A01, this.A03) << 12)) != 0;
    }
}

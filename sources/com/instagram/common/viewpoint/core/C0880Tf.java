package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0880Tf extends KY {
    public static byte[] A02;
    public static String[] A03 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C03839a A00;
    public final /* synthetic */ C9O A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 14);
            if (A03[5].length() != 5) {
                throw new RuntimeException();
            }
            A03[2] = "VyWbJGKy3Ebs7lO";
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{42, 29, 14, 14, 13, 26, 1, 6, 15, 72, 1, 6, 12, 13, 14, 1, 6, 1, 28, 13, 4, 17};
    }

    static {
        A02();
    }

    public C0880Tf(C03839a c03839a, C9O c9o) {
        this.A00 = c03839a;
        this.A01 = c9o;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        T7 t7;
        T7 t72;
        t7 = this.A00.A0J;
        if (t7.getState() == EnumC0830Rh.A02) {
            t72 = this.A00.A0J;
            if (t72.getCurrentPositionInMillis() == A00()) {
                this.A00.A0M(A00(0, 22, 102));
            }
        }
    }
}

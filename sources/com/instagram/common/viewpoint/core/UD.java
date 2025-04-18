package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UD extends KY {
    public static byte[] A01;
    public final /* synthetic */ PT A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-87, -68, -73, -72, -62, 115, -63, -72, -55, -72, -59, 115, -58, -57, -76, -59, -57, -72, -73, 115, -61, -65, -76, -52, -68, -63, -70};
    }

    public UD(PT pt) {
        this.A00 = pt;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        z2 = this.A00.A04;
        if (!z2) {
            this.A00.A0I(A00(0, 27, 64));
        }
    }
}

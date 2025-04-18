package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class W0 extends KY {
    public static byte[] A01;
    public final /* synthetic */ K9 A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-81, -78, -90, -92, -81, -94, -73, -85, -75, -78, -73, -73, -81, -88};
    }

    public W0(K9 k9) {
        this.A00 = k9;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C1045Zs c1045Zs;
        c1045Zs = this.A00.A04;
        c1045Zs.A07().A9A(A00(0, 14, 26));
    }
}

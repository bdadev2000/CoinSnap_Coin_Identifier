package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UB extends KY {
    public static byte[] A02;
    public final /* synthetic */ PT A00;
    public final /* synthetic */ C9O A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public UB(PT pt, C9O c9o) {
        this.A00 = pt;
        this.A01 = c9o;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        T7 t7;
        T7 t72;
        t7 = this.A00.A0D;
        if (t7.getState() == EnumC0830Rh.A02) {
            t72 = this.A00.A0D;
            if (t72.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 47));
            }
        }
    }
}

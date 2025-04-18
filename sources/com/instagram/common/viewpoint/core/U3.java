package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class U3 extends KY {
    public static byte[] A01;
    public final /* synthetic */ C0409Ab A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-56, -37, -42, -41, -31, -110, -23, -45, -27, -110, -32, -41, -24, -41, -28, -110, -30, -28, -41, -30, -45, -28, -41, -42};
    }

    public U3(C0409Ab c0409Ab) {
        this.A00 = c0409Ab;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        Q4 q4;
        z2 = this.A00.A07;
        if (!z2) {
            q4 = this.A00.A0F;
            q4.AE0(A00(0, 24, 91));
        }
    }
}

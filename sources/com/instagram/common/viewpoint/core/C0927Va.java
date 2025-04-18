package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0927Va implements InterfaceC0727Ni {
    public static byte[] A01;
    public final /* synthetic */ VY A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C0927Va(VY vy) {
        this.A00 = vy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0727Ni
    public final void ABX() {
        this.A00.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0727Ni
    public final void ACs() {
        this.A00.A0H(A00(0, 43, 56));
    }
}

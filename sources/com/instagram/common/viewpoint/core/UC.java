package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class UC extends KY {
    public static byte[] A01;
    public final /* synthetic */ PT A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ Opcodes.FREM);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{87, 104, 101, 100, 110, 33, 118, 96, 114, 33, 111, 100, 119, 100, 115, 33, 113, 115, 100, 113, 96, 115, 100, 101};
    }

    public UC(PT pt) {
        this.A00 = pt;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        z2 = this.A00.A03;
        if (!z2) {
            this.A00.A0I(A00(0, 24, Opcodes.DREM));
        }
    }
}

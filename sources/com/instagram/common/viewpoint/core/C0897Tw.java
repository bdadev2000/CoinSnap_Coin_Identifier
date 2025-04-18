package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0897Tw extends KY {
    public static byte[] A02;
    public final /* synthetic */ A6 A00;
    public final /* synthetic */ C9O A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ Opcodes.FNEG);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{98, 85, 70, 70, 69, 82, 73, 78, 71, 0, 73, 78, 68, 69, 70, 73, 78, 73, 84, 69, 76, 89};
    }

    public C0897Tw(A6 a6, C9O c9o) {
        this.A00 = a6;
        this.A01 = c9o;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        T7 t7;
        T7 t72;
        Q4 q4;
        t7 = this.A00.A0Z;
        if (t7.getState() == EnumC0830Rh.A02) {
            t72 = this.A00.A0Z;
            if (t72.getCurrentPositionInMillis() == A00()) {
                q4 = this.A00.A0X;
                q4.AE0(A00(0, 22, 86));
            }
        }
    }
}

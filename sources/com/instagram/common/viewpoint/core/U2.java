package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class U2 extends KY {
    public static byte[] A02;
    public static String[] A03 = {"mPUp", "QaVG6HdjpkfaxAZj0g", "f", "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ C0409Ab A00;
    public final /* synthetic */ C9O A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-43, 8, -7, -7, -8, 5, -4, 1, -6, -77, -4, 1, -9, -8, -7, -4, 1, -4, 7, -8, -1, 12};
    }

    static {
        A02();
    }

    public U2(C0409Ab c0409Ab, C9O c9o) {
        this.A00 = c0409Ab;
        this.A01 = c9o;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        T7 t7;
        T7 t72;
        Q4 q4;
        t7 = this.A00.A0I;
        if (t7.getState() == EnumC0830Rh.A02) {
            C0409Ab c0409Ab = this.A00;
            String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[3] = "r7zn";
            t72 = c0409Ab.A0I;
            if (t72.getCurrentPositionInMillis() == A00()) {
                q4 = this.A00.A0F;
                q4.AE0(A00(0, 22, Opcodes.LSHL));
            }
        }
    }
}

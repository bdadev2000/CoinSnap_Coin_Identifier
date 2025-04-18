package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class DU extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -24, -20, -36, -23, -16, -105, -20, -27, -37, -36, -23, -29, -16, -32, -27, -34, -105, -28, -36, -37, -32, -40, -105, -38, -26, -37, -36, -38, -22};
    }

    public DU(Throwable th) {
        super(A00(0, 39, Opcodes.DREM), th);
    }
}

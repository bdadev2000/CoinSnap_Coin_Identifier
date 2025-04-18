package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.controller.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class I2 extends IOException {
    public static byte[] A00;
    public static String[] A01 = {"9oUH6IggskzJ9KRnNq9fhlyXZqfLC7qm", "O", "6vBLsFlXvIsZh7TCn1R3IT4lCv45HTaK", "MDpcepjwzWMs517m4Ih6aUQSJk", "3hrQycwauA7dGDeH7qJo", "b1qkSdZDeqb", "rPde78X67wgfjzgLBIP3X6whAm", a.a};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].length() != 20) {
                throw new RuntimeException();
            }
            A01[5] = "xrQk8FQC87O";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 60);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{102, 106, 34, 35, 45, 34, 47, 57, 62, 119, 51, 17, 10, Ascii.FF, 17, 10, Ascii.ETB, Ascii.SUB, 67, Ascii.ETB, Ascii.FF, Ascii.FF, 67, Ascii.SI, Ascii.FF, Ascii.DC4, 67, 56, 19, 17, 10, Ascii.FF, 17, 10, Ascii.ETB, Ascii.SUB, 94, 62};
    }

    static {
        A01();
    }

    public I2(int i10, int i11) {
        super(A00(10, 27, 95) + i10 + A00(0, 10, 118) + i11 + A00(37, 1, 95));
    }
}

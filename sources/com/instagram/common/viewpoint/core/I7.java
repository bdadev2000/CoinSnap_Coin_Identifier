package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class I7 extends IOException {
    public static byte[] A00;
    public static String[] A01 = {"Par4AxgKHuADzZajYCYNv8eTOybwGgE2", "HOlKa3VqrZNKzXakTySiImjoYLF1tZiN", "sTSFXoUHOi5oDtfYDlzbl5cXoLl4KFeB", "BEd4Yr8LrEpTvBWaPpQjQteHmdcbjxPt", "vX3nZ4LKyiX8ravoL0WOyW1E36Z0Tdtf", "vpWWQ4wUWg0aqGuW9hPs7ZH", "ICpSMLm3FgqRzKio0CYh0", "tdB"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(17) != '0') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "DyR";
            strArr[6] = "x1HJO6sm0oZLnlsePqFvX";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 89);
            i5++;
        }
    }

    public static void A01() {
        A00 = new byte[]{32, 44, 100, 101, 107, 100, 105, Byte.MAX_VALUE, 120, 49, 76, 110, 117, 115, 110, 117, 104, 101, 60, 104, 115, 115, 60, 112, 115, 107, 60, 71, 108, 110, 117, 115, 110, 117, 104, 101, 33, 111};
    }

    static {
        A01();
    }

    public I7(int i2, int i3) {
        super(A00(10, 27, 69) + i2 + A00(0, 10, 85) + i3 + A00(37, 1, 107));
    }
}

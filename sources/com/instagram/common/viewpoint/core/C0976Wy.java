package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0976Wy extends H9 {
    public static byte[] A01;
    public static String[] A02 = {"oXD3w3tUVJHNPl", "GdV70Wcz8", "", "DzmyP9XSV", "ggRTYYsXaYFY6DcFpfUTDxKOGTV0t8hM", "gCu8mLRj1GKWx9K1TPcxrUR4JUG", "r1pVudNzCyG", "yxqMOZmEiVbhC7e6Vd9eEudE3"};
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] ^ i4) ^ 46;
            if (A02[6].length() == 27) {
                throw new RuntimeException();
            }
            A02[6] = "lZqD6G";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{53, 18, 10, 29, 16, 21, 24, 92, 31, 19, 18, 8, 25, 18, 8, 92, 8, 5, 12, 25, 70, 92};
    }

    static {
        A01();
    }

    public C0976Wy(String str, H3 h3) {
        super(A00(0, 22, 82) + str, h3, 1);
        this.A00 = str;
    }
}

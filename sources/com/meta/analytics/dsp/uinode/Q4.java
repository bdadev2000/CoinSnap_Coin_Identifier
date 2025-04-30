package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum Q4 {
    A04,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"5OO1eWJNP7Y3s5cQVhBQzuf4m1TAFPYu", "jypq8Huvx", "jrpdYYVceDk6A6K9eES7EYlVVXbr1rnB", "0AH7qFhs7PL8sRdpBGyIu3", "QWErYf377ArBGiXitK75JQXJw", "6gjozywHn1tStRqNZ4amJv", "kQUf5kbyDrtyo", "1dtSAN9pZ"};

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            byte b = (byte) ((copyOfRange[i12] ^ i11) ^ 3);
            if (A01[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "4K3nSgRyXAG8o";
            strArr[4] = "A3wHnoq4BiJ6LQy7c3XTOTZiL";
            copyOfRange[i12] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{117, 114, 122, 115, 106, 122, 107, 124, 124, 119, 106, 113, 118, 109, 106};
    }

    static {
        A01();
    }
}

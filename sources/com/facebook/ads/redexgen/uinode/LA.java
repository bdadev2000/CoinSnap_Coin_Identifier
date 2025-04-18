package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.foundation.same.report.i;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum LA {
    A05(0),
    A06(1),
    A04(2);

    public static byte[] A01;
    public static String[] A02 = {"D", "C", "8vWlkexf09f1piT", "bgKjpA4PjvHZdywoorD", "7PPvca8DkKgRdh14PD5p9M98ffpM", "UMv18", "Efwwh", "kVnW00famwT2UvCG2iLw1Nw0GuoWmmQs"};
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = i.a;
        strArr[0] = "v";
        A01 = new byte[]{117, 104, 104, 115, 98, 99, 122, 97, 100, 97, 96, 120, 97, 68, 95, 67, 94, 94, 69, 84, 85};
    }

    static {
        A01();
    }

    LA(int i10) {
        this.A00 = i10;
    }
}

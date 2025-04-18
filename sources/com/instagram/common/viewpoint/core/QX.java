package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class QX {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-102, -110, -107, -100, -110, -108, -45, -30, -30, -47, -32, -45, -33, -41, -10, -9, 8, -5, -11, -9, -15, -1, 1, -10, -9, -2, -39, -36, -48, -50, -39, -46, -65, -61, 38, 42, 22, 45, 28, 41, -10, -25, -8, -6, -12, -21, -8, -27, -21, -12, -22, -10, -11, -17, -12, -6, -31, -35, -46, -22, -46, -45, -35, -42, -48, -33, -46, -34, -42, -56, -72, -57, -70, -70, -61, -76, -67, -70, -66, -68, -67, -55, 22, 6, 21, 8, 8, 17, 2, 26, 12, 7, 23, 11, -19, -34, -27, -39, -16, -33, -20, -19, -29, -23, -24, -1, -15, -1, -1, -11, -5, -6, -21, -11, -16};
    }

    public static Map<String, String> A01(C7j c7j, String str, String str2) {
        HashMap hashMap = new HashMap();
        C8O c8o = new C8O(c7j);
        int i2 = c7j.getResources().getDisplayMetrics().widthPixels;
        int i3 = c7j.getResources().getDisplayMetrics().heightPixels;
        hashMap.put(A00(105, 10, 69), c7j.A08().A02());
        hashMap.put(A00(56, 13, 42), str2);
        hashMap.put(A00(40, 16, 63), str);
        hashMap.put(A00(14, 12, 75), String.valueOf(c8o.A09()));
        hashMap.put(A00(82, 12, 92), String.valueOf((int) (i2 / LP.A02)));
        hashMap.put(A00(69, 13, 14), String.valueOf((int) (i3 / LP.A02)));
        hashMap.put(A00(32, 2, 9), c7j.A04().A8f());
        hashMap.put(A00(34, 6, 112), C8O.A04);
        hashMap.put(A00(26, 6, 38), Locale.getDefault().toString());
        hashMap.put(A00(94, 11, 51), A00(0, 6, 29));
        hashMap.put(A00(6, 8, 43), c8o.A05());
        return hashMap;
    }
}

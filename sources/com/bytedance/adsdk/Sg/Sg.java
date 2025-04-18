package com.bytedance.adsdk.Sg;

/* loaded from: classes.dex */
class Sg {
    static final int[] YFl = new int[0];
    static final long[] Sg = new long[0];
    static final Object[] tN = new Object[0];

    public static int YFl(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}

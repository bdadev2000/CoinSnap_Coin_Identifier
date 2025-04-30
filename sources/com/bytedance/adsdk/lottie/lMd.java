package com.bytedance.adsdk.lottie;

/* loaded from: classes.dex */
class lMd {
    static final int[] zp = new int[0];
    static final long[] lMd = new long[0];
    static final Object[] KS = new Object[0];

    public static int zp(int[] iArr, int i9, int i10) {
        int i11 = i9 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }
}

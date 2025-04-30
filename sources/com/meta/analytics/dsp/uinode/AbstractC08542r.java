package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.2r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08542r {
    public static final int[] A00 = new int[0];
    public static final long[] A01 = new long[0];
    public static final Object[] A02 = new Object[0];

    public static int A00(int i9) {
        return A01(i9 * 8) / 8;
    }

    public static int A01(int i9) {
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = 1 << i10;
            if (i9 <= i11 - 12) {
                int i12 = (1 << i10) - 12;
                return i12;
            }
        }
        return i9;
    }

    public static int A02(int[] iArr, int i9, int i10) {
        int midVal = 0;
        int mid = i9 - 1;
        while (midVal <= mid) {
            int lo = midVal + mid;
            int hi = lo >>> 1;
            int lo2 = iArr[hi];
            if (lo2 < i10) {
                midVal = hi + 1;
            } else if (lo2 > i10) {
                mid = hi - 1;
            } else {
                return hi;
            }
        }
        int lo3 = midVal ^ (-1);
        return lo3;
    }

    public static int A03(long[] jArr, int i9, long j7) {
        int i10 = 0;
        int i11 = i9 - 1;
        while (i10 <= i11) {
            int lo = i10 + i11;
            int i12 = lo >>> 1;
            long j9 = jArr[i12];
            if (j9 < j7) {
                i10 = i12 + 1;
            } else if (j9 > j7) {
                i11 = i12 - 1;
            } else {
                return i12;
            }
        }
        int lo2 = i10 ^ (-1);
        return lo2;
    }

    public static boolean A04(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}

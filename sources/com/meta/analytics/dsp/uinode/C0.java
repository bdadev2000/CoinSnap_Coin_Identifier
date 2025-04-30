package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C0 {
    public static byte[] A02;
    public static String[] A03 = {"Gbswf2Oe9t45f6fRXzJLdAUlgQT", "ILNBZUp42FM6TmLhILZx0TrWlxeoP8dK", "KU", "J93uRO2wcICtg9xFmL1Wq8rEF85pJV62", "WBJuDd9qSYCq15FLuSiwKDay7Pd8LUVo", "UmX4zZlFAFbztGwQ3UKbr8sh4otzaxWO", "w0DdKfGqK3izgJmDnX6HRUGA0zrElZm3", "IS4KApUzDZfogKvNlWTv5mOgPbEmupwQ"};
    public final C2 A00;
    public final C2 A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(12) != strArr[6].charAt(12)) {
                break;
            }
            A03[1] = "eICKKIbMZhBsAVWt1kLewwmF6yp8rXBH";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i12] - i11) - 117);
            if (A03[5].charAt(24) != '4') {
                break;
            }
            String[] strArr2 = A03;
            strArr2[3] = "G7JsKoOQIIowgLRlO4ILFQyuaNQJNquj";
            strArr2[6] = "vJABouZitnLUgZWdQ8VJmHv3StFvgqBT";
            copyOfRange[i12] = b;
            i12++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A02 = new byte[]{-65, -77, -22, -10};
    }

    static {
        A01();
    }

    public C0(C2 c22) {
        this(c22, c22);
    }

    public C0(C2 c22, C2 c23) {
        this.A00 = (C2) AbstractC1192Ha.A01(c22);
        this.A01 = (C2) AbstractC1192Ha.A01(c23);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0 c02 = (C0) obj;
        return this.A00.equals(c02.A00) && this.A01.equals(c02.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(2, 1, 26) + this.A00 + (this.A00.equals(this.A01) ? A00(0, 0, 116) : A00(0, 2, 30) + this.A01) + A00(3, 1, 36);
    }
}

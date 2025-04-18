package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1020Yt implements C6 {
    public static byte[] A06;
    public static String[] A07 = {"VPsJYR6nwnKl3GGsBKT9FowhdWGAXZgf", "t9hnQybDG6g7LPOKqAGiDP2", "Gb301YYJpOgpSDcybjg8W8RhsXLlFC2", "K51ciyg1bfmePwJiFReGXIVxb", "s2EXwZrfzgHoO4PfEfdPmYAG5v8xH9jH", "U3dudkeTlUyTG47", "CeJtzK2mqLvn7YYYi0VUzVQJpJ4l9CMm", "xs5QEvE"};
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[3].length() != 25) {
                throw new RuntimeException();
            }
            A07[6] = "J2GrNKZ7b522JA972PPYRjQW9OTYafkr";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 101);
            i5++;
        }
    }

    public static void A02() {
        byte[] bArr = {-6, -98, -110, -42, -25, -28, -45, -26, -37, -31, -32, -27, -57, -27, -81, -80, -92, -13, -22, -22, -9, -23, -8, -9, -63, -31, -43, 40, 30, 47, 26, 40, -14, -77, -89, -5, -16, -12, -20, -36, -6, -60, -19, 18, 31, 24, 21, -13, 24, 14, 15, 34, -46, 22, 15, 24, 17, 30, 18, -25};
        if (A07[6].charAt(22) != 'Q') {
            throw new RuntimeException();
        }
        A07[0] = "mCtn7rBTOervmGdInElAArjuggAxpBXf";
        A06 = bArr;
    }

    static {
        A02();
    }

    public C1020Yt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j2) {
        return IK.A0B(this.A04, j2, true, true);
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        int A00 = A00(j2);
        C7 c7 = new C7(this.A04[A00], this.A03[A00]);
        if (c7.A01 < j2) {
            int i2 = this.A00;
            String[] strArr = A07;
            String str = strArr[2];
            String str2 = strArr[1];
            int length = str.length();
            int chunkIndex = str2.length();
            if (length == chunkIndex) {
                throw new RuntimeException();
            }
            A07[6] = "5dqNVttcMNtWdKoHzKCRCPQ2iaXgPTKU";
            int chunkIndex2 = i2 - 1;
            if (A00 != chunkIndex2) {
                int chunkIndex3 = A00 + 1;
                long j3 = this.A04[chunkIndex3];
                int chunkIndex4 = A00 + 1;
                C7 seekPoint = new C7(j3, this.A03[chunkIndex4]);
                return new C5(c7, seekPoint);
            }
        }
        return new C5(c7);
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 69) + this.A00 + A01(25, 8, 80) + Arrays.toString(this.A01) + A01(15, 10, 31) + Arrays.toString(this.A03) + A01(33, 9, 34) + Arrays.toString(this.A04) + A01(1, 14, 13) + Arrays.toString(this.A02) + A01(0, 1, 108);
    }
}

package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1217Hz {
    public static byte[] A03;
    public static String[] A04 = {"oSbtVRwphkTFlAHrFUFfvlQVewHH9uZD", "ke9406sA8vEe4ogcratlCLLRCygX4Y6v", "LkVrMYKeL4j", "rD3J2lWEcQES1OY4rXh7UnGCqOy7njew", "qJRaOB7ViewD6", "qa5huEKLFbsop1eqm4Yriado9DIEiYjV", "GSl3McmMnOZYTOuxGBg0tC3pnH", "ySC3qX4TjccxO5mLdOZ"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            byte b = copyOfRange[i12];
            String[] strArr = A04;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "EdmI6fYX5kJGCYPfpqvG1yUufp2PCRFX";
            strArr2[3] = "bDUsxAC2PGUD72vhZpZ7z8M6PcC6y0P6";
            copyOfRange[i12] = (byte) ((b - i11) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{50, 87, 95, 74, 85, 82, 77, 9, 62, 61, 47, Ascii.SYN, 33, 9, 92, 78, 90, 94, 78, 87, 76, 78, 9, 76, 88, 87, 93, 82, 87, 94, 74, 93, 82, 88, 87, 9, 75, 98, 93, 78, 35, 9, 41, 78, 86, 65, 76, 73, 68, 0, 53, 52, 38, Ascii.CR, Ascii.CAN, 0, 83, 69, 81, 85, 69, 78, 67, 69, 0, 70, 73, 82, 83, 84, 0, 66, 89, 84, 69, Ascii.SUB, 0, -35, -8, -7, -87, -21, -14, -3, -87, -9, -8, -3, -87, 3, -18, -5, -8, -61, -87, -32, -33, -47, -72, -61};
    }

    static {
        A01();
    }

    public C1217Hz() {
    }

    public C1217Hz(int i9) {
        this.A00 = new byte[i9];
        this.A01 = i9;
    }

    public C1217Hz(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C1217Hz(byte[] bArr, int i9) {
        this.A00 = bArr;
        this.A01 = i9;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        return (char) ((bArr[i9 + 1] & 255) | ((bArr[i9] & 255) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = (bArr[i9] & 255) << 24;
        int i12 = i10 + 1;
        this.A02 = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        int i14 = i12 + 1;
        this.A02 = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.A02 = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = ((bArr[i9] & 255) << 24) >> 8;
        int i12 = i10 + 1;
        this.A02 = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.A02 = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i10 + 1;
        this.A02 = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        int i14 = i12 + 1;
        this.A02 = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.A02 = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = bArr[i9] & 255;
        this.A02 = i10 + 1;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final int A0D() {
        int b22 = A0E();
        int b12 = A0E();
        int b42 = A0E();
        int b32 = A0E();
        int b23 = (b22 << 21) | (b12 << 14);
        int b13 = b42 << 7;
        return b23 | b13 | b32;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        return bArr[i9] & 255;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = (bArr[i9] & 255) << 8;
        int i12 = i10 + 1;
        this.A02 = i12;
        int i13 = (bArr[i10] & 255) | i11;
        int result = i12 + 2;
        this.A02 = result;
        return i13;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = (bArr[i9] & 255) << 16;
        int i12 = i10 + 1;
        this.A02 = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.A02 = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.A02 = i10 + 1;
        return (bArr[i10] & 255) | i11;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i9 = this.A02 + 1;
        this.A02 = i9;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = i10 + 1;
        this.A02 = i11;
        long j7 = (bArr[r0] & 255) | ((bArr[i9] & 255) << 8) | ((bArr[i10] & 255) << 16);
        int i12 = i11 + 1;
        this.A02 = i12;
        long j9 = j7 | ((bArr[i11] & 255) << 24);
        int i13 = i12 + 1;
        this.A02 = i13;
        long j10 = j9 | ((bArr[i12] & 255) << 32);
        int i14 = i13 + 1;
        this.A02 = i14;
        long j11 = j10 | ((bArr[i13] & 255) << 40);
        int i15 = i14 + 1;
        this.A02 = i15;
        long j12 = j11 | ((bArr[i14] & 255) << 48);
        this.A02 = i15 + 1;
        return ((bArr[i15] & 255) << 56) | j12;
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i9 = this.A02 + 1;
        this.A02 = i9;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = i10 + 1;
        this.A02 = i11;
        long j7 = (bArr[r0] & 255) | ((bArr[i9] & 255) << 8) | ((bArr[i10] & 255) << 16);
        this.A02 = i11 + 1;
        return ((bArr[i11] & 255) << 24) | j7;
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i9 = this.A02 + 1;
        this.A02 = i9;
        int i10 = i9 + 1;
        this.A02 = i10;
        long j7 = ((bArr[r0] & 255) << 56) | ((bArr[i9] & 255) << 48);
        int i11 = i10 + 1;
        this.A02 = i11;
        long j9 = j7 | ((bArr[i10] & 255) << 40);
        int i12 = i11 + 1;
        this.A02 = i12;
        long j10 = j9 | ((bArr[i11] & 255) << 32);
        int i13 = i12 + 1;
        this.A02 = i13;
        long j11 = j10 | ((bArr[i12] & 255) << 24);
        int i14 = i13 + 1;
        this.A02 = i14;
        long j12 = j11 | ((bArr[i13] & 255) << 16);
        int i15 = i14 + 1;
        this.A02 = i15;
        long j13 = j12 | ((bArr[i14] & 255) << 8);
        this.A02 = i15 + 1;
        return (bArr[i15] & 255) | j13;
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i9 = this.A02 + 1;
        this.A02 = i9;
        int i10 = i9 + 1;
        this.A02 = i10;
        long j7 = ((bArr[r0] & 255) << 24) | ((bArr[i9] & 255) << 16);
        int i11 = i10 + 1;
        this.A02 = i11;
        long j9 = j7 | ((bArr[i10] & 255) << 8);
        this.A02 = i11 + 1;
        return (bArr[i11] & 255) | j9;
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A0L);
    }

    public final long A0O() {
        int i9 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j7 = bArr[length];
        int i10 = 7;
        while (true) {
            if (i10 < 0) {
                break;
            }
            int length2 = 1 << i10;
            long value = length2;
            if ((value & j7) != 0) {
                i10--;
            } else if (i10 < 6) {
                int length3 = 1 << i10;
                j7 &= length3 - 1;
                i9 = 7 - i10;
            } else if (i10 == 7) {
                i9 = 1;
            }
        }
        if (i9 != 0) {
            for (int i11 = 1; i11 < i9; i11++) {
                byte[] bArr2 = this.A00;
                int i12 = this.A02;
                if (A04[2].length() != 11) {
                    throw new RuntimeException();
                }
                A04[2] = "bgE5KGMxqsO";
                byte b = bArr2[i12 + i11];
                if ((b & 192) == 128) {
                    int length4 = b & 63;
                    j7 = (j7 << 6) | length4;
                } else {
                    throw new NumberFormatException(A00(0, 42, 117) + j7);
                }
            }
            int length5 = this.A02;
            this.A02 = length5 + i9;
            return j7;
        }
        throw new NumberFormatException(A00(42, 35, 108) + j7);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0P() {
        /*
            r6 = this;
            int r0 = r6.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r6.A02
        La:
            int r0 = r6.A01
            if (r3 >= r0) goto L1b
            byte[] r0 = r6.A00
            r0 = r0[r3]
            boolean r0 = com.meta.analytics.dsp.uinode.IF.A0d(r0)
            if (r0 != 0) goto L1b
            int r3 = r3 + 1
            goto La
        L1b:
            int r5 = r6.A02
            int r0 = r3 - r5
            r4 = 3
            if (r0 < r4) goto L3d
            byte[] r2 = r6.A00
            r1 = r2[r5]
            r0 = -17
            if (r1 != r0) goto L3d
            int r0 = r5 + 1
            r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L3d
            int r0 = r5 + 2
            r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L3d
            int r5 = r5 + r4
            r6.A02 = r5
        L3d:
            byte[] r2 = r6.A00
            int r1 = r6.A02
            int r0 = r3 - r1
            java.lang.String r5 = com.meta.analytics.dsp.uinode.IF.A0R(r2, r1, r0)
            r6.A02 = r3
            int r2 = r6.A01
            if (r3 != r2) goto L4e
            return r5
        L4e:
            byte[] r4 = r6.A00
            r1 = r4[r3]
            r0 = 13
            if (r1 != r0) goto L5d
            int r0 = r3 + 1
            r6.A02 = r0
            if (r0 != r2) goto L5d
            return r5
        L5d:
            int r3 = r6.A02
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C1217Hz.A04
            r0 = 0
            r1 = r1[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C1217Hz.A04
            java.lang.String r1 = "dK52fOK8jWv7xyi3a3n"
            r0 = 7
            r2[r0] = r1
            r1 = r4[r3]
            r0 = 10
            if (r1 != r0) goto L9a
            int r3 = r3 + 1
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C1217Hz.A04
            r0 = 0
            r1 = r1[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L9b
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C1217Hz.A04
            java.lang.String r1 = "CzkRNJa9FDUHAtzqy7ViO0FrfGLEXvBM"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "L6K2rBVJE7KS5cY2UbZwATPHMS3LrQAX"
            r0 = 3
            r2[r0] = r1
            r6.A02 = r3
        L9a:
            return r5
        L9b:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C1217Hz.A04
            java.lang.String r1 = "fuXjTapUFN2iKU6xFo1uSk4UrCSPBhbp"
            r0 = 0
            r2[r0] = r1
            r6.A02 = r3
            goto L9a
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1217Hz.A0P():java.lang.String");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0Q() {
        /*
            r4 = this;
            int r0 = r4.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r4.A02
        La:
            int r0 = r4.A01
            if (r3 >= r0) goto L17
            byte[] r0 = r4.A00
            r0 = r0[r3]
            if (r0 == 0) goto L17
            int r3 = r3 + 1
            goto La
        L17:
            byte[] r2 = r4.A00
            int r1 = r4.A02
            int r0 = r3 - r1
            java.lang.String r1 = com.meta.analytics.dsp.uinode.IF.A0R(r2, r1, r0)
            r4.A02 = r3
            int r0 = r4.A01
            if (r3 >= r0) goto L2b
            int r0 = r3 + 1
            r4.A02 = r0
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1217Hz.A0Q():java.lang.String");
    }

    public final String A0R(int i9) {
        if (i9 == 0) {
            return A00(0, 0, 25);
        }
        int i10 = i9;
        int lastIndex = this.A02;
        int stringLength = lastIndex + i9;
        int i11 = stringLength - 1;
        int stringLength2 = this.A01;
        if (i11 < stringLength2) {
            int stringLength3 = this.A00[i11];
            if (stringLength3 == 0) {
                i10--;
            }
        }
        String A0R = IF.A0R(this.A00, lastIndex, i10);
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[4];
        int length = str.length();
        int stringLength4 = str2.length();
        if (length == stringLength4) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "dyM2aynMSNvMWhKjh5bvH5o1wH";
        strArr2[4] = "u6o51QVZzHu50";
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i9;
        return A0R;
    }

    public final String A0S(int i9) {
        return A0T(i9, Charset.forName(A00(95, 5, 23)));
    }

    public final String A0T(int i9, Charset charset) {
        String str = new String(this.A00, this.A02, i9, charset);
        this.A02 += i9;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i9 = this.A02;
        int i10 = i9 + 1;
        this.A02 = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.A02 = i10 + 1;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i9) {
        A0b(A05() < i9 ? new byte[i9] : this.A00, i9);
    }

    public final void A0X(int i9) {
        AbstractC1192Ha.A03(i9 >= 0 && i9 <= this.A00.length);
        this.A01 = i9;
    }

    public final void A0Y(int i9) {
        AbstractC1192Ha.A03(i9 >= 0 && i9 <= this.A01);
        this.A02 = i9;
    }

    public final void A0Z(int i9) {
        A0Y(this.A02 + i9);
    }

    public final void A0a(C1216Hy c1216Hy, int i9) {
        A0c(c1216Hy.A00, 0, i9);
        c1216Hy.A07(0);
    }

    public final void A0b(byte[] bArr, int i9) {
        this.A00 = bArr;
        this.A01 = i9;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i9, int i10) {
        System.arraycopy(this.A00, this.A02, bArr, i9, i10);
        this.A02 += i10;
    }
}

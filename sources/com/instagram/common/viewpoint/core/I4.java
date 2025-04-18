package com.instagram.common.viewpoint.core;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class I4 {
    public static byte[] A03;
    public static String[] A04 = {"BUPkySTcvyKGzFoXb8xNfxJs2vcj6SI6", "", "9t9QVMNm", "OEPmW7llGTv5RugeZAnT8CJpnv71Deb6", "l81c8yE1UXyvzPuTPm0IGIR5VvYUnp6F", "GkKhWAhOLudlAi1KBbGzOYTYZtsrVTXq", "47Bu8gqHgcKZB6yF", "qEfz1IOL"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 48, 56, 35, 46, 43, 38, -30, 23, 22, 8, -17, -6, -30, 53, 39, 51, 55, 39, 48, 37, 39, -30, 37, 49, 48, 54, 43, 48, 55, 35, 54, 43, 49, 48, -30, 36, 59, 54, 39, -4, -30, -52, -15, -7, -28, -17, -20, -25, -93, -40, -41, -55, -80, -69, -93, -10, -24, -12, -8, -24, -15, -26, -24, -93, -23, -20, -11, -10, -9, -93, -27, -4, -9, -24, -67, -93, -12, 15, 16, -64, 2, 9, 20, -64, 14, 15, 20, -64, 26, 5, 18, 15, -38, -64, -24, -25, -39, -64, -53};
    }

    static {
        A01();
    }

    public I4() {
    }

    public I4(int i2) {
        this.A00 = new byte[i2];
        this.A01 = i2;
    }

    public I4(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public I4(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A01 = i2;
    }

    public final char A02() {
        return (char) (((this.A00[this.A02] & UnsignedBytes.MAX_VALUE) << 8) | (this.A00[this.A02 + 1] & UnsignedBytes.MAX_VALUE));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 24;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & UnsignedBytes.MAX_VALUE) << 16);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = i5 | ((bArr3[i6] & UnsignedBytes.MAX_VALUE) << 8);
        byte[] bArr4 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return i7 | (bArr4[i8] & UnsignedBytes.MAX_VALUE);
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & UnsignedBytes.MAX_VALUE) << 8);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        return i5 | (bArr3[i6] & UnsignedBytes.MAX_VALUE);
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & UnsignedBytes.MAX_VALUE) << 8);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = i5 | ((bArr3[i6] & UnsignedBytes.MAX_VALUE) << 16);
        byte[] bArr4 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return i7 | ((bArr4[i8] & UnsignedBytes.MAX_VALUE) << 24);
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 70) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return i3 | ((bArr2[i4] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public final int A0D() {
        int b2 = A0E();
        int b12 = A0E();
        int b4 = A0E();
        int b3 = A0E();
        int b22 = (b2 << 21) | (b12 << 14);
        int b13 = b4 << 7;
        return b22 | b13 | b3;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        return bArr[i2] & UnsignedBytes.MAX_VALUE;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | (bArr2[i4] & UnsignedBytes.MAX_VALUE);
        int result = this.A02;
        this.A02 = result + 2;
        return i5;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 16;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & UnsignedBytes.MAX_VALUE) << 8);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        return i5 | (bArr3[i6] & UnsignedBytes.MAX_VALUE);
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 70) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return i3 | (bArr2[i4] & UnsignedBytes.MAX_VALUE);
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j5 = j4 | ((bArr4[r1] & 255) << 24);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j6 = j5 | ((bArr5[r1] & 255) << 32);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j7 = j6 | ((bArr6[r1] & 255) << 40);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j8 = j7 | ((bArr7[r1] & 255) << 48);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j8 | ((255 & bArr8[r1]) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j4 | ((255 & bArr4[r1]) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = (bArr[r1] & 255) << 56;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr2[r1] & 255) << 48);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr3[r1] & 255) << 40);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j5 = j4 | ((bArr4[r1] & 255) << 32);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j6 = j5 | ((bArr5[r1] & 255) << 24);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j7 = j6 | ((bArr6[r1] & 255) << 16);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j8 = j7 | ((bArr7[r1] & 255) << 8);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j8 | (255 & bArr8[r1]);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = (bArr[r1] & 255) << 24;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr2[r1] & 255) << 16);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr3[r1] & 255) << 8);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j4 | (255 & bArr4[r1]);
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 70) + A0L);
    }

    public final long A0O() {
        byte b2;
        int i2 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j2 = bArr[length];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int length2 = 1 << i3;
            long j3 = length2 & j2;
            String[] strArr = A04;
            String str = strArr[3];
            String str2 = strArr[0];
            int charAt = str.charAt(13);
            int length3 = str2.charAt(13);
            if (charAt == length3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "8vK315ay";
            strArr2[7] = "jAQDKlNg";
            if (j3 != 0) {
                i3--;
            } else if (i3 < 6) {
                int length4 = 1 << i3;
                j2 &= length4 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        if (i2 != 0) {
            for (int x = 1; x < i2; x++) {
                byte[] bArr2 = this.A00;
                if (A04[4].charAt(3) != 'S') {
                    A04[1] = "x";
                    int length5 = this.A02;
                    b2 = bArr2[length5 + x];
                    if ((b2 & 192) == 128) {
                        int length6 = b2 & Utf8.REPLACEMENT_BYTE;
                        j2 = (j2 << 6) | length6;
                    } else {
                        throw new NumberFormatException(A00(0, 42, 104) + j2);
                    }
                } else {
                    A04[5] = "n5PcJgzDrPqbI2Nld6vWULHVZbuOfTZA";
                    int length7 = this.A02;
                    b2 = bArr2[length7 + x];
                    if ((b2 & 192) == 92) {
                        int length62 = b2 & Utf8.REPLACEMENT_BYTE;
                        j2 = (j2 << 6) | length62;
                    } else {
                        throw new NumberFormatException(A00(0, 42, 104) + j2);
                    }
                }
            }
            int length8 = this.A02;
            this.A02 = length8 + i2;
            return j2;
        }
        throw new NumberFormatException(A00(42, 35, 41) + j2);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0P() {
        /*
            r5 = this;
            int r0 = r5.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r4 = r5.A02
        La:
            int r0 = r5.A01
            if (r4 >= r0) goto L1b
            byte[] r0 = r5.A00
            r0 = r0[r4]
            boolean r0 = com.instagram.common.viewpoint.core.IK.A0d(r0)
            if (r0 != 0) goto L1b
            int r4 = r4 + 1
            goto La
        L1b:
            int r0 = r5.A02
            int r0 = r4 - r0
            r2 = 3
            if (r0 < r2) goto L49
            byte[] r1 = r5.A00
            int r0 = r5.A02
            r1 = r1[r0]
            r0 = -17
            if (r1 != r0) goto L49
            byte[] r1 = r5.A00
            int r0 = r5.A02
            int r0 = r0 + 1
            r1 = r1[r0]
            r0 = -69
            if (r1 != r0) goto L49
            byte[] r1 = r5.A00
            int r0 = r5.A02
            int r0 = r0 + 2
            r1 = r1[r0]
            r0 = -65
            if (r1 != r0) goto L49
            int r0 = r5.A02
            int r0 = r0 + r2
            r5.A02 = r0
        L49:
            byte[] r3 = r5.A00
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.I4.A04
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L9a
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.I4.A04
            java.lang.String r1 = "0OPZ9wXiOG88J5thRDM8zE849EKoF2PW"
            r0 = 5
            r2[r0] = r1
            int r1 = r5.A02
            int r0 = r5.A02
            int r0 = r4 - r0
            java.lang.String r2 = com.instagram.common.viewpoint.core.IK.A0R(r3, r1, r0)
            r5.A02 = r4
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 != r0) goto L72
            return r2
        L72:
            byte[] r1 = r5.A00
            int r0 = r5.A02
            r1 = r1[r0]
            r0 = 13
            if (r1 != r0) goto L89
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 != r0) goto L89
            return r2
        L89:
            byte[] r1 = r5.A00
            int r0 = r5.A02
            r1 = r1[r0]
            r0 = 10
            if (r1 != r0) goto L99
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
        L99:
            return r2
        L9a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.I4.A0P():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r2 = r5.A00;
        r1 = r5.A02;
        r0 = r5.A02;
        r4 = com.instagram.common.viewpoint.core.IK.A0R(r2, r1, r3 - r0);
        r5.A02 = r3;
        r3 = r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (com.instagram.common.viewpoint.core.I4.A04[1].length() == 11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        com.instagram.common.viewpoint.core.I4.A04[1] = "UHIahekmnsnG1d53o8blPpYvLvDdhHQg";
        r0 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r3 >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r0 = r5.A02;
        r5.A02 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r0 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r3 >= r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0Q() {
        /*
            r5 = this;
            int r0 = r5.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r5.A02
        La:
            int r4 = r5.A01
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.I4.A04
            r0 = 4
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 83
            if (r1 == r0) goto L60
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.I4.A04
            java.lang.String r1 = "7q14VOks0nwB3sOQXz"
            r0 = 6
            r2[r0] = r1
            if (r3 >= r4) goto L2c
            byte[] r0 = r5.A00
            r0 = r0[r3]
            if (r0 == 0) goto L2c
            int r3 = r3 + 1
            goto La
        L2c:
            byte[] r2 = r5.A00
            int r1 = r5.A02
            int r0 = r5.A02
            int r0 = r3 - r0
            java.lang.String r4 = com.instagram.common.viewpoint.core.IK.A0R(r2, r1, r0)
            r5.A02 = r3
            int r3 = r5.A02
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.I4.A04
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L5b
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.I4.A04
            java.lang.String r1 = "UHIahekmnsnG1d53o8blPpYvLvDdhHQg"
            r0 = 1
            r2[r0] = r1
            int r0 = r5.A01
            if (r3 >= r0) goto L5a
        L54:
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
        L5a:
            return r4
        L5b:
            int r0 = r5.A01
            if (r3 >= r0) goto L5a
            goto L54
        L60:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.I4.A0Q():java.lang.String");
    }

    public final String A0R(int i2) {
        if (i2 == 0) {
            return A00(0, 0, 111);
        }
        int i3 = i2;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i2) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i3--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0R = IK.A0R(bArr, stringLength4, i3);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i2;
        return A0R;
    }

    public final String A0S(int i2) {
        return A0T(i2, Charset.forName(A00(95, 5, 57)));
    }

    public final String A0T(int i2, Charset charset) {
        String str = new String(this.A00, this.A02, i2, charset);
        this.A02 += i2;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return (short) (i3 | (bArr2[i4] & UnsignedBytes.MAX_VALUE));
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i2) {
        A0b(A05() < i2 ? new byte[i2] : this.A00, i2);
    }

    public final void A0X(int i2) {
        AbstractC0576Hf.A03(i2 >= 0 && i2 <= this.A00.length);
        this.A01 = i2;
    }

    public final void A0Y(int i2) {
        AbstractC0576Hf.A03(i2 >= 0 && i2 <= this.A01);
        this.A02 = i2;
    }

    public final void A0Z(int i2) {
        A0Y(this.A02 + i2);
    }

    public final void A0a(I3 i3, int i2) {
        A0c(i3.A00, 0, i2);
        i3.A07(0);
    }

    public final void A0b(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A01 = i2;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.A00, this.A02, bArr, i2, i3);
        this.A02 += i3;
    }
}

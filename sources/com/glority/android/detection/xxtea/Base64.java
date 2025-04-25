package com.glority.android.detection.xxtea;

import com.google.common.base.Ascii;

/* loaded from: classes13.dex */
final class Base64 {
    private static final char[] base64EncodeChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] base64DecodeChars = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    private Base64() {
    }

    public static final String encode(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length % 3;
        int length2 = bArr.length - length;
        int i = 0;
        while (i < length2) {
            int i2 = i + 2;
            int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
            i += 3;
            int i4 = i3 | (bArr[i2] & 255);
            char[] cArr = base64EncodeChars;
            sb.append(cArr[i4 >> 18]);
            sb.append(cArr[(i4 >> 12) & 63]);
            sb.append(cArr[(i4 >> 6) & 63]);
            sb.append(cArr[i4 & 63]);
        }
        if (length == 1) {
            byte b = bArr[i];
            char[] cArr2 = base64EncodeChars;
            sb.append(cArr2[(b & 255) >> 2]);
            sb.append(cArr2[(b & 3) << 4]);
            sb.append("==");
        } else if (length == 2) {
            int i5 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
            char[] cArr3 = base64EncodeChars;
            sb.append(cArr3[i5 >> 10]);
            sb.append(cArr3[(i5 >> 4) & 63]);
            sb.append(cArr3[(i5 & 15) << 2]);
            sb.append("=");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r2 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte[] decode(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L87
        Ld:
            byte[] r3 = com.glority.android.detection.xxtea.Base64.base64DecodeChars
            int r4 = r2 + 1
            r2 = r8[r2]
            r2 = r3[r2]
            r3 = -1
            if (r4 >= r0) goto L1d
            if (r2 == r3) goto L1b
            goto L1d
        L1b:
            r2 = r4
            goto Ld
        L1d:
            if (r2 != r3) goto L21
            goto L87
        L21:
            byte[] r5 = com.glority.android.detection.xxtea.Base64.base64DecodeChars
            int r6 = r4 + 1
            r4 = r8[r4]
            r4 = r5[r4]
            if (r6 >= r0) goto L30
            if (r4 == r3) goto L2e
            goto L30
        L2e:
            r4 = r6
            goto L21
        L30:
            if (r4 != r3) goto L33
            goto L87
        L33:
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)
        L3d:
            int r2 = r6 + 1
            r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L4a
            byte[] r8 = r1.toByteArray()
            return r8
        L4a:
            byte[] r7 = com.glority.android.detection.xxtea.Base64.base64DecodeChars
            r5 = r7[r5]
            if (r2 >= r0) goto L55
            if (r5 == r3) goto L53
            goto L55
        L53:
            r6 = r2
            goto L3d
        L55:
            if (r5 != r3) goto L58
            goto L87
        L58:
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)
        L64:
            int r4 = r2 + 1
            r2 = r8[r2]
            if (r2 != r6) goto L6f
            byte[] r8 = r1.toByteArray()
            return r8
        L6f:
            byte[] r7 = com.glority.android.detection.xxtea.Base64.base64DecodeChars
            r2 = r7[r2]
            if (r4 >= r0) goto L7a
            if (r2 == r3) goto L78
            goto L7a
        L78:
            r2 = r4
            goto L64
        L7a:
            if (r2 != r3) goto L7d
            goto L87
        L7d:
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto Lb
        L87:
            byte[] r8 = r1.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.detection.xxtea.Base64.decode(java.lang.String):byte[]");
    }
}

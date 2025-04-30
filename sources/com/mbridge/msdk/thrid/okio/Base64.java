package com.mbridge.msdk.thrid.okio;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
final class Base64 {
    private static final byte[] MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    private Base64() {
    }

    public static byte[] decode(String str) {
        int i9;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i10 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char charAt2 = str.charAt(i14);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i9 = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i9 = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i9 = charAt2 + 4;
            } else if (charAt2 != '+' && charAt2 != '-') {
                if (charAt2 != '/' && charAt2 != '_') {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                } else {
                    i9 = 63;
                }
            } else {
                i9 = 62;
            }
            i12 = (i12 << 6) | ((byte) i9);
            i11++;
            if (i11 % 4 == 0) {
                bArr[i13] = (byte) (i12 >> 16);
                int i15 = i13 + 2;
                bArr[i13 + 1] = (byte) (i12 >> 8);
                i13 += 3;
                bArr[i15] = (byte) i12;
            }
        }
        int i16 = i11 % 4;
        if (i16 == 1) {
            return null;
        }
        if (i16 == 2) {
            bArr[i13] = (byte) ((i12 << 12) >> 16);
            i13++;
        } else if (i16 == 3) {
            int i17 = i12 << 6;
            int i18 = i13 + 1;
            bArr[i13] = (byte) (i17 >> 16);
            i13 += 2;
            bArr[i18] = (byte) (i17 >> 8);
        }
        if (i13 == i10) {
            return bArr;
        }
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        return bArr2;
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, MAP);
    }

    public static String encodeUrl(byte[] bArr) {
        return encode(bArr, URL_MAP);
    }

    private static String encode(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            bArr3[i9] = bArr2[(bArr[i10] & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i9 + 1] = bArr2[((bArr[i10] & 3) << 4) | ((bArr[i11] & 255) >> 4)];
            int i12 = i9 + 3;
            int i13 = (bArr[i11] & Ascii.SI) << 2;
            int i14 = i10 + 2;
            bArr3[i9 + 2] = bArr2[i13 | ((bArr[i14] & 255) >> 6)];
            i9 += 4;
            bArr3[i12] = bArr2[bArr[i14] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i9] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i9 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i9 + 2] = 61;
            bArr3[i9 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i9] = bArr2[(bArr[length] & 255) >> 2];
            int i15 = (bArr[length] & 3) << 4;
            int i16 = length + 1;
            bArr3[i9 + 1] = bArr2[((bArr[i16] & 255) >> 4) | i15];
            bArr3[i9 + 2] = bArr2[(bArr[i16] & Ascii.SI) << 2];
            bArr3[i9 + 3] = 61;
        }
        try {
            return new String(bArr3, C.ASCII_NAME);
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }
}

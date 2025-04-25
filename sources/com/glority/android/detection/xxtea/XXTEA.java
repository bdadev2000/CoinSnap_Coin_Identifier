package com.glority.android.detection.xxtea;

import java.io.UnsupportedEncodingException;

/* loaded from: classes13.dex */
public final class XXTEA {
    private static final int DELTA = -1640531527;

    private static int MX(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        return ((i ^ i2) + (iArr[(i4 & 3) ^ i5] ^ i3)) ^ (((i3 >>> 5) ^ (i2 << 2)) + ((i2 >>> 3) ^ (i3 << 4)));
    }

    private XXTEA() {
    }

    public static final byte[] encrypt(byte[] bArr, byte[] bArr2) {
        return bArr.length == 0 ? bArr : toByteArray(encrypt(toIntArray(bArr, true), toIntArray(fixKey(bArr2), false)), false);
    }

    public static final byte[] encrypt(String str, byte[] bArr) {
        try {
            return encrypt(str.getBytes("UTF-8"), bArr);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final byte[] encrypt(byte[] bArr, String str) {
        try {
            return encrypt(bArr, str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final byte[] encrypt(String str, String str2) {
        try {
            return encrypt(str.getBytes("UTF-8"), str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String encryptToBase64String(byte[] bArr, byte[] bArr2) {
        byte[] encrypt = encrypt(bArr, bArr2);
        if (encrypt == null) {
            return null;
        }
        return Base64.encode(encrypt);
    }

    public static final String encryptToBase64String(String str, byte[] bArr) {
        byte[] encrypt = encrypt(str, bArr);
        if (encrypt == null) {
            return null;
        }
        return Base64.encode(encrypt);
    }

    public static final String encryptToBase64String(byte[] bArr, String str) {
        byte[] encrypt = encrypt(bArr, str);
        if (encrypt == null) {
            return null;
        }
        return Base64.encode(encrypt);
    }

    public static final String encryptToBase64String(String str, String str2) {
        byte[] encrypt = encrypt(str, str2);
        if (encrypt == null) {
            return null;
        }
        return Base64.encode(encrypt);
    }

    public static final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        return bArr.length == 0 ? bArr : toByteArray(decrypt(toIntArray(bArr, false), toIntArray(fixKey(bArr2), false)), true);
    }

    public static final byte[] decrypt(byte[] bArr, String str) {
        try {
            return decrypt(bArr, str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final byte[] decryptBase64String(String str, byte[] bArr) {
        return decrypt(Base64.decode(str), bArr);
    }

    public static final byte[] decryptBase64String(String str, String str2) {
        return decrypt(Base64.decode(str), str2);
    }

    public static final String decryptToString(byte[] bArr, byte[] bArr2) {
        try {
            byte[] decrypt = decrypt(bArr, bArr2);
            if (decrypt == null) {
                return null;
            }
            return new String(decrypt, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String decryptToString(byte[] bArr, String str) {
        try {
            byte[] decrypt = decrypt(bArr, str);
            if (decrypt == null) {
                return null;
            }
            return new String(decrypt, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String decryptBase64StringToString(String str, byte[] bArr) {
        try {
            byte[] decrypt = decrypt(Base64.decode(str), bArr);
            if (decrypt == null) {
                return null;
            }
            return new String(decrypt, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String decryptBase64StringToString(String str, String str2) {
        try {
            byte[] decrypt = decrypt(Base64.decode(str), str2);
            if (decrypt == null) {
                return null;
            }
            return new String(decrypt, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static int[] encrypt(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = length - 1;
        if (i < 1) {
            return iArr;
        }
        int i2 = (52 / length) + 6;
        int i3 = iArr[i];
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return iArr;
            }
            i4 += DELTA;
            int i6 = (i4 >>> 2) & 3;
            int i7 = i3;
            int i8 = 0;
            while (i8 < i) {
                int i9 = i8 + 1;
                i7 = iArr[i8] + MX(i4, iArr[i9], i7, i8, i6, iArr2);
                iArr[i8] = i7;
                i8 = i9;
            }
            i3 = MX(i4, iArr[0], i7, i8, i6, iArr2) + iArr[i];
            iArr[i] = i3;
            i2 = i5;
        }
    }

    private static int[] decrypt(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = length - 1;
        if (i < 1) {
            return iArr;
        }
        int i2 = iArr[0];
        for (int i3 = ((52 / length) + 6) * DELTA; i3 != 0; i3 -= DELTA) {
            int i4 = (i3 >>> 2) & 3;
            int i5 = i2;
            int i6 = i;
            while (i6 > 0) {
                i5 = iArr[i6] - MX(i3, i5, iArr[i6 - 1], i6, i4, iArr2);
                iArr[i6] = i5;
                i6--;
            }
            i2 = iArr[0] - MX(i3, i5, iArr[i], i6, i4, iArr2);
            iArr[0] = i2;
        }
        return iArr;
    }

    private static byte[] fixKey(byte[] bArr) {
        if (bArr.length == 16) {
            return bArr;
        }
        byte[] bArr2 = new byte[16];
        if (bArr.length < 16) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, 16);
        }
        return bArr2;
    }

    private static int[] toIntArray(byte[] bArr, boolean z) {
        int length;
        int[] iArr;
        if ((bArr.length & 3) == 0) {
            length = bArr.length >>> 2;
        } else {
            length = (bArr.length >>> 2) + 1;
        }
        if (z) {
            iArr = new int[length + 1];
            iArr[length] = bArr.length;
        } else {
            iArr = new int[length];
        }
        int length2 = bArr.length;
        for (int i = 0; i < length2; i++) {
            int i2 = i >>> 2;
            iArr[i2] = iArr[i2] | ((bArr[i] & 255) << ((i & 3) << 3));
        }
        return iArr;
    }

    private static byte[] toByteArray(int[] iArr, boolean z) {
        int length = iArr.length << 2;
        if (z) {
            int i = iArr[iArr.length - 1];
            int i2 = length - 4;
            if (i < length - 7 || i > i2) {
                return null;
            }
            length = i;
        }
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = (byte) (iArr[i3 >>> 2] >>> ((i3 & 3) << 3));
        }
        return bArr;
    }
}

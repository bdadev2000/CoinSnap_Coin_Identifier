package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16079a;
    public static final int[] b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f16079a = charArray;
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i9 = 0; i9 < length; i9++) {
            b[f16079a[i9]] = i9;
        }
        b[61] = 0;
    }

    public static String a(String str) {
        int i9;
        int i10;
        byte[] bArr;
        int i11;
        int length = str.length();
        if (length == 0) {
            bArr = new byte[0];
        } else {
            int i12 = length - 1;
            int i13 = 0;
            while (i13 < i12 && b[str.charAt(i13) & 255] < 0) {
                i13++;
            }
            while (i12 > 0 && b[str.charAt(i12) & 255] < 0) {
                i12--;
            }
            if (str.charAt(i12) == '=') {
                if (str.charAt(i12 - 1) == '=') {
                    i9 = 2;
                } else {
                    i9 = 1;
                }
            } else {
                i9 = 0;
            }
            int i14 = (i12 - i13) + 1;
            if (length > 76) {
                if (str.charAt(76) == '\r') {
                    i11 = i14 / 78;
                } else {
                    i11 = 0;
                }
                i10 = i11 << 1;
            } else {
                i10 = 0;
            }
            int i15 = (((i14 - i10) * 6) >> 3) - i9;
            byte[] bArr2 = new byte[i15];
            int i16 = (i15 / 3) * 3;
            int i17 = 0;
            int i18 = 0;
            while (i17 < i16) {
                int[] iArr = b;
                int i19 = i13 + 4;
                int i20 = iArr[str.charAt(i13 + 3)] | (iArr[str.charAt(i13 + 1)] << 12) | (iArr[str.charAt(i13)] << 18) | (iArr[str.charAt(i13 + 2)] << 6);
                bArr2[i17] = (byte) (i20 >> 16);
                int i21 = i17 + 2;
                bArr2[i17 + 1] = (byte) (i20 >> 8);
                i17 += 3;
                bArr2[i21] = (byte) i20;
                if (i10 > 0 && (i18 = i18 + 1) == 19) {
                    i13 += 6;
                    i18 = 0;
                } else {
                    i13 = i19;
                }
            }
            if (i17 < i15) {
                int i22 = 0;
                int i23 = 0;
                while (i13 <= i12 - i9) {
                    i22 |= b[str.charAt(i13)] << (18 - (i23 * 6));
                    i23++;
                    i13++;
                }
                int i24 = 16;
                while (i17 < i15) {
                    bArr2[i17] = (byte) (i22 >> i24);
                    i24 -= 8;
                    i17++;
                }
            }
            bArr = bArr2;
        }
        if (bArr.length == 0) {
            return "";
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}

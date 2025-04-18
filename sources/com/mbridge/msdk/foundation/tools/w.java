package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class w {
    public static final char[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13638b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        a = charArray;
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        f13638b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            f13638b[a[i10]] = i10;
        }
        f13638b[61] = 0;
    }

    public static String a(String str) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int length = str.length();
        int i13 = 0;
        if (length == 0) {
            bArr = new byte[0];
        } else {
            int i14 = length - 1;
            int i15 = 0;
            while (i15 < i14 && f13638b[str.charAt(i15) & 255] < 0) {
                i15++;
            }
            while (i14 > 0 && f13638b[str.charAt(i14) & 255] < 0) {
                i14--;
            }
            if (str.charAt(i14) == '=') {
                if (str.charAt(i14 - 1) == '=') {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
            } else {
                i10 = 0;
            }
            int i16 = (i14 - i15) + 1;
            if (length > 76) {
                if (str.charAt(76) == '\r') {
                    i12 = i16 / 78;
                } else {
                    i12 = 0;
                }
                i11 = i12 << 1;
            } else {
                i11 = 0;
            }
            int i17 = (((i16 - i11) * 6) >> 3) - i10;
            byte[] bArr2 = new byte[i17];
            int i18 = (i17 / 3) * 3;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i18) {
                int[] iArr = f13638b;
                int i21 = i15 + 1;
                int i22 = i21 + 1;
                int i23 = (iArr[str.charAt(i15)] << 18) | (iArr[str.charAt(i21)] << 12);
                int i24 = i22 + 1;
                int i25 = i23 | (iArr[str.charAt(i22)] << 6);
                int i26 = i24 + 1;
                int i27 = i25 | iArr[str.charAt(i24)];
                int i28 = i19 + 1;
                bArr2[i19] = (byte) (i27 >> 16);
                int i29 = i28 + 1;
                bArr2[i28] = (byte) (i27 >> 8);
                int i30 = i29 + 1;
                bArr2[i29] = (byte) i27;
                if (i11 > 0 && (i20 = i20 + 1) == 19) {
                    i26 += 2;
                    i20 = 0;
                }
                i15 = i26;
                i19 = i30;
            }
            if (i19 < i17) {
                int i31 = 0;
                while (i15 <= i14 - i10) {
                    i13 |= f13638b[str.charAt(i15)] << (18 - (i31 * 6));
                    i31++;
                    i15++;
                }
                int i32 = 16;
                while (i19 < i17) {
                    bArr2[i19] = (byte) (i13 >> i32);
                    i32 -= 8;
                    i19++;
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

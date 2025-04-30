package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    @KeepForSdk
    public static String bytesToStringLowercase(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i9 = 0;
        for (byte b : bArr) {
            char[] cArr2 = zzb;
            cArr[i9] = cArr2[(b & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b & Ascii.SI];
            i9 += 2;
        }
        return new String(cArr);
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @NonNull
    @KeepForSdk
    public static byte[] stringToBytes(@NonNull String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9 + 2;
                bArr[i9 / 2] = (byte) Integer.parseInt(str.substring(i9, i10), 16);
                i9 = i10;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr, boolean z8) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i9 = 0; i9 < length && (!z8 || i9 != length - 1 || (bArr[i9] & 255) != 0); i9++) {
            char[] cArr = zza;
            sb.append(cArr[(bArr[i9] & 240) >>> 4]);
            sb.append(cArr[bArr[i9] & Ascii.SI]);
        }
        return sb.toString();
    }
}

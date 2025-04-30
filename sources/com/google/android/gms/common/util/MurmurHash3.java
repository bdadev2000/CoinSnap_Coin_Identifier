package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@NonNull byte[] bArr, int i9, int i10, int i11) {
        int i12;
        int i13 = i9;
        while (true) {
            i12 = (i10 & (-4)) + i9;
            if (i13 >= i12) {
                break;
            }
            int i14 = ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | (bArr[i13 + 3] << 24)) * (-862048943);
            int i15 = i11 ^ (((i14 >>> 17) | (i14 << 15)) * 461845907);
            i11 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
            i13 += 4;
        }
        int i16 = i10 & 3;
        int i17 = 0;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    i17 = (bArr[i12 + 2] & 255) << 16;
                }
                int i18 = i11 ^ i10;
                int i19 = (i18 ^ (i18 >>> 16)) * (-2048144789);
                int i20 = (i19 ^ (i19 >>> 13)) * (-1028477387);
                return i20 ^ (i20 >>> 16);
            }
            i17 |= (bArr[i12 + 1] & 255) << 8;
        }
        int i21 = ((bArr[i12] & 255) | i17) * (-862048943);
        i11 ^= ((i21 >>> 17) | (i21 << 15)) * 461845907;
        int i182 = i11 ^ i10;
        int i192 = (i182 ^ (i182 >>> 16)) * (-2048144789);
        int i202 = (i192 ^ (i192 >>> 13)) * (-1028477387);
        return i202 ^ (i202 >>> 16);
    }
}

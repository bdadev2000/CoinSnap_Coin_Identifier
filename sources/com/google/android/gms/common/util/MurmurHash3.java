package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@NonNull byte[] bArr, int i2, int i3, int i4) {
        int i5;
        int i6 = i2;
        while (true) {
            i5 = (i3 & (-4)) + i2;
            if (i6 >= i5) {
                break;
            }
            int i7 = ((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | (bArr[i6 + 3] << 24)) * (-862048943);
            int i8 = i4 ^ (((i7 >>> 17) | (i7 << 15)) * 461845907);
            i4 = (((i8 >>> 19) | (i8 << 13)) * 5) - 430675100;
            i6 += 4;
        }
        int i9 = i3 & 3;
        if (i9 != 1) {
            if (i9 != 2) {
                r0 = i9 == 3 ? (bArr[i5 + 2] & 255) << 16 : 0;
                int i10 = i4 ^ i3;
                int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
                int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
                return i12 ^ (i12 >>> 16);
            }
            r0 |= (bArr[i5 + 1] & 255) << 8;
        }
        int i13 = ((bArr[i5] & 255) | r0) * (-862048943);
        i4 ^= ((i13 >>> 17) | (i13 << 15)) * 461845907;
        int i102 = i4 ^ i3;
        int i112 = (i102 ^ (i102 >>> 16)) * (-2048144789);
        int i122 = (i112 ^ (i112 >>> 13)) * (-1028477387);
        return i122 ^ (i122 >>> 16);
    }
}

package com.google.android.gms.internal.play_billing;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes2.dex */
final class zzfs extends zzfr {
    @Override // com.google.android.gms.internal.play_billing.zzfr
    public final int zza(int i9, byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b = bArr[i10];
            if (b < 0) {
                if (b < -32) {
                    if (i12 >= i11) {
                        return b;
                    }
                    if (b >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i12 >= i11 - 1) {
                        return zzfu.zza(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b8 = bArr[i12];
                    if (b8 <= -65 && ((b != -32 || b8 >= -96) && (b != -19 || b8 < -96))) {
                        i10 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    return zzfu.zza(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b9 = bArr[i12];
                if (b9 <= -65) {
                    if ((((b9 + 112) + (b << Ascii.FS)) >> 30) == 0) {
                        int i15 = i10 + 3;
                        if (bArr[i14] <= -65) {
                            i10 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }
}

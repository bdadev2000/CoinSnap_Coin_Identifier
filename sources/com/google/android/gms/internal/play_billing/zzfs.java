package com.google.android.gms.internal.play_billing;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes3.dex */
final class zzfs extends zzfr {
    @Override // com.google.android.gms.internal.play_billing.zzfr
    public final int zza(int i10, byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b3 = bArr[i11];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i13 >= i12) {
                        return b3;
                    }
                    if (b3 >= -62) {
                        i11 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b3 < -16) {
                    if (i13 >= i12 - 1) {
                        return zzfu.zza(bArr, i13, i12);
                    }
                    int i14 = i13 + 1;
                    byte b10 = bArr[i13];
                    if (b10 <= -65 && ((b3 != -32 || b10 >= -96) && (b3 != -19 || b10 < -96))) {
                        i11 = i14 + 1;
                        if (bArr[i14] > -65) {
                        }
                    }
                } else {
                    if (i13 >= i12 - 2) {
                        return zzfu.zza(bArr, i13, i12);
                    }
                    int i15 = i13 + 1;
                    byte b11 = bArr[i13];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b3 << Ascii.FS)) >> 30) == 0) {
                            int i16 = i15 + 1;
                            if (bArr[i15] <= -65) {
                                i13 = i16 + 1;
                                if (bArr[i16] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            i11 = i13;
        }
        return 0;
    }
}

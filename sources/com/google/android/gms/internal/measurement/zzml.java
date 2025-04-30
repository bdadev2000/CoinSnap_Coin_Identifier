package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes2.dex */
final class zzml extends zzmm {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.zzmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zza(java.lang.String, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmm
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
                        return zzmk.zza(bArr, i12, i11);
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
                    return zzmk.zza(bArr, i12, i11);
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

    @Override // com.google.android.gms.internal.measurement.zzmm
    public final String zza(byte[] bArr, int i9, int i10) throws zzjs {
        if ((i9 | i10 | ((bArr.length - i9) - i10)) >= 0) {
            int i11 = i9 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i9 < i11) {
                byte b = bArr[i9];
                if (b < 0) {
                    break;
                }
                i9++;
                zzmj.zza(b, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i9 < i11) {
                int i14 = i9 + 1;
                byte b8 = bArr[i9];
                if (b8 >= 0) {
                    int i15 = i13 + 1;
                    zzmj.zza(b8, cArr, i13);
                    while (i14 < i11) {
                        byte b9 = bArr[i14];
                        if (b9 < 0) {
                            break;
                        }
                        i14++;
                        zzmj.zza(b9, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i9 = i14;
                } else if (b8 < -32) {
                    if (i14 < i11) {
                        i9 += 2;
                        zzmj.zza(b8, bArr[i14], cArr, i13);
                        i13++;
                    } else {
                        throw zzjs.zzd();
                    }
                } else if (b8 < -16) {
                    if (i14 < i11 - 1) {
                        int i16 = i9 + 2;
                        i9 += 3;
                        zzmj.zza(b8, bArr[i14], bArr[i16], cArr, i13);
                        i13++;
                    } else {
                        throw zzjs.zzd();
                    }
                } else if (i14 < i11 - 2) {
                    byte b10 = bArr[i14];
                    int i17 = i9 + 3;
                    byte b11 = bArr[i9 + 2];
                    i9 += 4;
                    zzmj.zza(b8, b10, b11, bArr[i17], cArr, i13);
                    i13 += 2;
                } else {
                    throw zzjs.zzd();
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
    }
}

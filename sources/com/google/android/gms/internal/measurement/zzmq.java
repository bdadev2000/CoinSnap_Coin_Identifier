package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
final class zzmq extends zzmr {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.zzmr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmq.zza(java.lang.String, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final int zza(int i2, byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return 0;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i5 >= i4) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i3 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i5 >= i4 - 1) {
                        return zzmp.zza(bArr, i5, i4);
                    }
                    int i6 = i3 + 2;
                    byte b3 = bArr[i5];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i3 += 3;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                if (i5 >= i4 - 2) {
                    return zzmp.zza(bArr, i5, i4);
                }
                int i7 = i3 + 2;
                byte b4 = bArr[i5];
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i8 = i3 + 3;
                        if (bArr[i7] <= -65) {
                            i3 += 4;
                            if (bArr[i8] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i3 = i5;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final String zza(byte[] bArr, int i2, int i3) throws zzkb {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    break;
                }
                i2++;
                zzmo.zza(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b3 = bArr[i2];
                if (b3 >= 0) {
                    int i8 = i6 + 1;
                    zzmo.zza(b3, cArr, i6);
                    while (i7 < i4) {
                        byte b4 = bArr[i7];
                        if (b4 < 0) {
                            break;
                        }
                        i7++;
                        zzmo.zza(b4, cArr, i8);
                        i8++;
                    }
                    i6 = i8;
                    i2 = i7;
                } else if (b3 < -32) {
                    if (i7 < i4) {
                        i2 += 2;
                        zzmo.zza(b3, bArr[i7], cArr, i6);
                        i6++;
                    } else {
                        throw zzkb.zzd();
                    }
                } else if (b3 < -16) {
                    if (i7 < i4 - 1) {
                        int i9 = i2 + 2;
                        i2 += 3;
                        zzmo.zza(b3, bArr[i7], bArr[i9], cArr, i6);
                        i6++;
                    } else {
                        throw zzkb.zzd();
                    }
                } else if (i7 < i4 - 2) {
                    byte b5 = bArr[i7];
                    int i10 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    zzmo.zza(b3, b5, b6, bArr[i10], cArr, i6);
                    i6 += 2;
                } else {
                    throw zzkb.zzd();
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}

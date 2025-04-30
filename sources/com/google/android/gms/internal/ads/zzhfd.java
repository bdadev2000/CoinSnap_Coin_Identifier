package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhfd extends zzhfc {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhfc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhfd.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhfc
    public final String zzb(byte[] bArr, int i9, int i10) throws zzhcd {
        int i11;
        int length = bArr.length;
        if ((((length - i9) - i10) | i9 | i10) >= 0) {
            int i12 = i9 + i10;
            char[] cArr = new char[i10];
            int i13 = 0;
            while (i9 < i12) {
                byte b = bArr[i9];
                if (!zzhfb.zzd(b)) {
                    break;
                }
                i9++;
                cArr[i13] = (char) b;
                i13++;
            }
            int i14 = i13;
            while (i9 < i12) {
                int i15 = i9 + 1;
                byte b8 = bArr[i9];
                if (zzhfb.zzd(b8)) {
                    cArr[i14] = (char) b8;
                    i14++;
                    i9 = i15;
                    while (i9 < i12) {
                        byte b9 = bArr[i9];
                        if (zzhfb.zzd(b9)) {
                            i9++;
                            cArr[i14] = (char) b9;
                            i14++;
                        }
                    }
                } else {
                    if (zzhfb.zzf(b8)) {
                        if (i15 < i12) {
                            i11 = i14 + 1;
                            i9 += 2;
                            zzhfb.zzc(b8, bArr[i15], cArr, i14);
                        } else {
                            throw zzhcd.zzd();
                        }
                    } else if (zzhfb.zze(b8)) {
                        if (i15 < i12 - 1) {
                            i11 = i14 + 1;
                            int i16 = i9 + 2;
                            i9 += 3;
                            zzhfb.zzb(b8, bArr[i15], bArr[i16], cArr, i14);
                        } else {
                            throw zzhcd.zzd();
                        }
                    } else if (i15 < i12 - 2) {
                        byte b10 = bArr[i15];
                        int i17 = i9 + 3;
                        byte b11 = bArr[i9 + 2];
                        i9 += 4;
                        zzhfb.zza(b8, b10, b11, bArr[i17], cArr, i14);
                        i14 += 2;
                    } else {
                        throw zzhcd.zzd();
                    }
                    i14 = i11;
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i9), Integer.valueOf(i10)));
    }
}

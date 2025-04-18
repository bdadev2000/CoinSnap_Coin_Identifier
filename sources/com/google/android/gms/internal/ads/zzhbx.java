package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhbx extends zzhbw {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbx.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final String zzb(byte[] bArr, int i10, int i11) throws zzgzm {
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b3 = bArr[i10];
                if (!zzhbv.zzd(b3)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b3;
                i13++;
            }
            while (i10 < i12) {
                int i14 = i10 + 1;
                byte b10 = bArr[i10];
                if (zzhbv.zzd(b10)) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b10;
                    i10 = i14;
                    while (true) {
                        i13 = i15;
                        if (i10 < i12) {
                            byte b11 = bArr[i10];
                            if (zzhbv.zzd(b11)) {
                                i10++;
                                i15 = i13 + 1;
                                cArr[i13] = (char) b11;
                            }
                        }
                    }
                } else if (zzhbv.zzf(b10)) {
                    if (i14 < i12) {
                        zzhbv.zzc(b10, bArr[i14], cArr, i13);
                        i13++;
                        i10 = i14 + 1;
                    } else {
                        throw new zzgzm("Protocol message had invalid UTF-8.");
                    }
                } else if (zzhbv.zze(b10)) {
                    if (i14 < i12 - 1) {
                        int i16 = i14 + 1;
                        zzhbv.zzb(b10, bArr[i14], bArr[i16], cArr, i13);
                        i13++;
                        i10 = i16 + 1;
                    } else {
                        throw new zzgzm("Protocol message had invalid UTF-8.");
                    }
                } else if (i14 < i12 - 2) {
                    int i17 = i14 + 1;
                    byte b12 = bArr[i14];
                    int i18 = i17 + 1;
                    zzhbv.zza(b10, b12, bArr[i17], bArr[i18], cArr, i13);
                    i13 += 2;
                    i10 = i18 + 1;
                } else {
                    throw new zzgzm("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }
}

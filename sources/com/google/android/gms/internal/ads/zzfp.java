package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfp {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - i10;
        boolean z13 = false;
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzh(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzh(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzh(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b3 = bArr[i14];
            if ((b3 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b3 == 1) {
                    zzh(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !zArr[2] || bArr[i11 - 2] != 0 || bArr[i13] != 1 : bArr[i11 - 3] != 0 || bArr[i11 - 2] != 0 || bArr[i13] != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        zArr[0] = z11;
        if (i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : !(bArr[i11 - 2] != 0 || bArr[i13] != 0)) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr[1] = z12;
        if (bArr[i13] == 0) {
            z13 = true;
        }
        zArr[2] = z13;
        return i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 < i10 - 2) {
                            int i14 = i12 + 1;
                            if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                                break;
                            }
                            i12 = i14;
                        } else {
                            i12 = i10;
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i20 + 1;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfj zzc(byte[] r27, int r28, int r29, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfm r30) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfp.zzc(byte[], int, int, com.google.android.gms.internal.ads.zzfm):com.google.android.gms.internal.ads.zzfj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfm zzd(byte[] r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 2091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfp.zzd(byte[], int, int):com.google.android.gms.internal.ads.zzfm");
    }

    public static zzfn zze(byte[] bArr, int i10, int i11) {
        zzfq zzfqVar = new zzfq(bArr, 4, i11);
        int zzc2 = zzfqVar.zzc();
        int zzc3 = zzfqVar.zzc();
        zzfqVar.zze();
        return new zzfn(zzc2, zzc3, zzfqVar.zzh());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfo zzf(byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfp.zzf(byte[], int, int):com.google.android.gms.internal.ads.zzfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static String zzg(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                zzfzl zzfzlVar = new zzfzl();
                int i11 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i11 >= length2) {
                        break;
                    }
                    int zza2 = zza(bArr, i11, length2, zArr);
                    if (zza2 != length2) {
                        zzfzlVar.zzf(Integer.valueOf(zza2));
                    }
                    i11 = zza2 + 3;
                }
                zzfzo zzi = zzfzlVar.zzi();
                for (int i12 = 0; i12 < zzi.size(); i12++) {
                    if (((Integer) zzi.get(i12)).intValue() + 3 < length) {
                        zzfq zzfqVar = new zzfq(bArr, ((Integer) zzi.get(i12)).intValue() + 3, length);
                        zzfd zzl = zzl(zzfqVar);
                        if (zzl.zza == 33 && zzl.zzb == 0) {
                            zzfqVar.zzf(4);
                            int zza3 = zzfqVar.zza(3);
                            zzfqVar.zze();
                            zzfe zzm = zzm(zzfqVar, true, zza3, null);
                            return zzdd.zzd(zzm.zza, zzm.zzb, zzm.zzc, zzm.zzd, zzm.zze, zzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void zzh(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzi(byte b3) {
        if (((b3 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b3 & Ascii.US;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    private static int zzj(int i10, int i11, int i12, int i13) {
        return i10 - ((i12 + i13) * (i11 == 1 ? 2 : 1));
    }

    private static int zzk(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - ((i12 + i13) * i14);
    }

    private static zzfd zzl(zzfq zzfqVar) {
        zzfqVar.zze();
        return new zzfd(zzfqVar.zza(6), zzfqVar.zza(6), zzfqVar.zza(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzfe zzm(com.google.android.gms.internal.ads.zzfq r18, boolean r19, int r20, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfe r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L3c
            r2 = 2
            int r2 = r0.zza(r2)
            boolean r7 = r18.zzh()
            r8 = 5
            int r8 = r0.zza(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r18.zzh()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zza(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
            goto L49
        L3c:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
        L49:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zza(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzf(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzf(r5)
        L79:
            com.google.android.gms.internal.ads.zzfe r0 = new com.google.android.gms.internal.ads.zzfe
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfp.zzm(com.google.android.gms.internal.ads.zzfq, boolean, int, com.google.android.gms.internal.ads.zzfe):com.google.android.gms.internal.ads.zzfe");
    }

    private static void zzn(zzfq zzfqVar) {
        int zzc2 = zzfqVar.zzc() + 1;
        zzfqVar.zzf(8);
        for (int i10 = 0; i10 < zzc2; i10++) {
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zze();
        }
        zzfqVar.zzf(20);
    }
}

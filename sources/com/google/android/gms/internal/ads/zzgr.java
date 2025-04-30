package com.google.android.gms.internal.ads;

import com.applovin.impl.L;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgr {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i9, int i10, boolean[] zArr) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i11 = i10 - i9;
        boolean z11 = false;
        if (i11 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i9 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i9] == 1) {
            zzf(zArr);
            return i9 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i9] == 0 && bArr[i9 + 1] == 1) {
            zzf(zArr);
            return i9 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i9 + 2;
        while (i13 < i12) {
            byte b = bArr[i13];
            if ((b & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b == 1) {
                    zzf(zArr);
                    return i14;
                }
                i13 = i14;
            }
            i13 += 3;
        }
        if (i11 <= 2 ? !(i11 != 2 ? !zArr[1] || bArr[i12] != 1 : !zArr[2] || bArr[i10 - 2] != 0 || bArr[i12] != 1) : !(bArr[i10 - 3] != 0 || bArr[i10 - 2] != 0 || bArr[i12] != 1)) {
            z9 = true;
        } else {
            z9 = false;
        }
        zArr[0] = z9;
        if (i11 <= 1 ? !(!zArr[2] || bArr[i12] != 0) : !(bArr[i10 - 2] != 0 || bArr[i12] != 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[1] = z10;
        if (bArr[i12] == 0) {
            z11 = true;
        }
        zArr[2] = z11;
        return i10;
    }

    public static int zzb(byte[] bArr, int i9) {
        int i10;
        synchronized (zzc) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                while (true) {
                    try {
                        if (i11 < i9 - 2) {
                            int i13 = i11 + 1;
                            if (bArr[i11] == 0 && bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                                break;
                            }
                            i11 = i13;
                        } else {
                            i11 = i9;
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i9) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i12) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i9 - i12;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = zzd[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i10 - i15);
        }
        return i10;
    }

    public static zzgo zzc(byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        zzgs zzgsVar = new zzgs(bArr, i9, i10);
        int i25 = 4;
        zzgsVar.zze(4);
        int zza2 = zzgsVar.zza(3);
        zzgsVar.zzd();
        int zza3 = zzgsVar.zza(2);
        boolean zzf = zzgsVar.zzf();
        int zza4 = zzgsVar.zza(5);
        int i26 = 0;
        for (int i27 = 0; i27 < 32; i27++) {
            if (zzgsVar.zzf()) {
                i26 |= 1 << i27;
            }
        }
        int i28 = 6;
        int[] iArr2 = new int[6];
        for (int i29 = 0; i29 < 6; i29++) {
            iArr2[i29] = zzgsVar.zza(8);
        }
        int zza5 = zzgsVar.zza(8);
        int i30 = 0;
        for (int i31 = 0; i31 < zza2; i31++) {
            if (zzgsVar.zzf()) {
                i30 += 89;
            }
            if (zzgsVar.zzf()) {
                i30 += 8;
            }
        }
        zzgsVar.zze(i30);
        if (zza2 > 0) {
            int i32 = 8 - zza2;
            zzgsVar.zze(i32 + i32);
        }
        int zzc2 = zzgsVar.zzc();
        int zzc3 = zzgsVar.zzc();
        if (zzc3 == 3) {
            zzgsVar.zzd();
            zzc3 = 3;
        }
        int zzc4 = zzgsVar.zzc();
        int zzc5 = zzgsVar.zzc();
        if (zzgsVar.zzf()) {
            int zzc6 = zzgsVar.zzc();
            int zzc7 = zzgsVar.zzc();
            int zzc8 = zzgsVar.zzc();
            int zzc9 = zzgsVar.zzc();
            if (zzc3 != 1) {
                if (zzc3 == 2) {
                    zzc3 = 2;
                    i23 = 2;
                } else {
                    i23 = 1;
                }
            } else {
                i23 = 2;
            }
            if (zzc3 == 1) {
                i24 = 2;
            } else {
                i24 = 1;
            }
            zzc4 -= (zzc6 + zzc7) * i23;
            zzc5 -= (zzc8 + zzc9) * i24;
        }
        int i33 = zzc4;
        int i34 = zzc3;
        int i35 = zzc5;
        int zzc10 = zzgsVar.zzc();
        int zzc11 = zzgsVar.zzc();
        int zzc12 = zzgsVar.zzc();
        if (true != zzgsVar.zzf()) {
            i11 = zza2;
        } else {
            i11 = 0;
        }
        while (i11 <= zza2) {
            zzgsVar.zzc();
            zzgsVar.zzc();
            zzgsVar.zzc();
            i11++;
        }
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        if (zzgsVar.zzf() && zzgsVar.zzf()) {
            int i36 = 0;
            while (i36 < i25) {
                int i37 = 0;
                while (i37 < i28) {
                    if (!zzgsVar.zzf()) {
                        zzgsVar.zzc();
                    } else {
                        int min = Math.min(64, 1 << ((i36 + i36) + 4));
                        if (i36 > 1) {
                            zzgsVar.zzb();
                        }
                        for (int i38 = 0; i38 < min; i38++) {
                            zzgsVar.zzb();
                        }
                    }
                    if (i36 == 3) {
                        i22 = 3;
                    } else {
                        i22 = 1;
                    }
                    i37 += i22;
                    i28 = 6;
                }
                i36++;
                i25 = 4;
                i28 = 6;
            }
        }
        zzgsVar.zze(2);
        if (zzgsVar.zzf()) {
            zzgsVar.zze(8);
            zzgsVar.zzc();
            zzgsVar.zzc();
            zzgsVar.zzd();
        }
        int zzc13 = zzgsVar.zzc();
        int i39 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i40 = -1;
        int i41 = -1;
        int i42 = -1;
        while (i39 < zzc13) {
            if (i39 != 0 && zzgsVar.zzf()) {
                int i43 = i41 + i42;
                boolean zzf2 = zzgsVar.zzf();
                int zzc14 = zzgsVar.zzc() + 1;
                int i44 = 1 - ((zzf2 ? 1 : 0) + (zzf2 ? 1 : 0));
                int i45 = i43 + 1;
                i16 = zzc13;
                boolean[] zArr = new boolean[i45];
                iArr = iArr2;
                for (int i46 = 0; i46 <= i43; i46++) {
                    if (!zzgsVar.zzf()) {
                        zArr[i46] = zzgsVar.zzf();
                    } else {
                        zArr[i46] = true;
                    }
                }
                int i47 = i42 - 1;
                int[] iArr5 = new int[i45];
                int[] iArr6 = new int[i45];
                int i48 = 0;
                while (true) {
                    i21 = i44 * zzc14;
                    if (i47 < 0) {
                        break;
                    }
                    int i49 = iArr4[i47] + i21;
                    if (i49 < 0 && zArr[i41 + i47]) {
                        iArr5[i48] = i49;
                        i48++;
                    }
                    i47--;
                }
                if (i21 < 0 && zArr[i43]) {
                    iArr5[i48] = i21;
                    i48++;
                }
                i17 = i26;
                i18 = i34;
                int i50 = i48;
                for (int i51 = 0; i51 < i41; i51++) {
                    int i52 = iArr3[i51] + i21;
                    if (i52 < 0 && zArr[i51]) {
                        iArr5[i50] = i52;
                        i50++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i50);
                int i53 = 0;
                for (int i54 = i41 - 1; i54 >= 0; i54--) {
                    int i55 = iArr3[i54] + i21;
                    if (i55 > 0 && zArr[i54]) {
                        iArr6[i53] = i55;
                        i53++;
                    }
                }
                if (i21 > 0 && zArr[i43]) {
                    iArr6[i53] = i21;
                    i53++;
                }
                int i56 = i53;
                for (int i57 = 0; i57 < i42; i57++) {
                    int i58 = iArr4[i57] + i21;
                    if (i58 > 0 && zArr[i41 + i57]) {
                        iArr6[i56] = i58;
                        i56++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i56);
                i42 = i56;
                iArr3 = copyOf;
                i41 = i50;
            } else {
                i16 = zzc13;
                i17 = i26;
                i18 = i34;
                iArr = iArr2;
                int zzc15 = zzgsVar.zzc();
                int zzc16 = zzgsVar.zzc();
                int[] iArr7 = new int[zzc15];
                for (int i59 = 0; i59 < zzc15; i59++) {
                    if (i59 > 0) {
                        i20 = iArr7[i59 - 1];
                    } else {
                        i20 = 0;
                    }
                    iArr7[i59] = i20 - (zzgsVar.zzc() + 1);
                    zzgsVar.zzd();
                }
                int[] iArr8 = new int[zzc16];
                for (int i60 = 0; i60 < zzc16; i60++) {
                    if (i60 > 0) {
                        i19 = iArr8[i60 - 1];
                    } else {
                        i19 = 0;
                    }
                    iArr8[i60] = zzgsVar.zzc() + 1 + i19;
                    zzgsVar.zzd();
                }
                i42 = zzc16;
                iArr4 = iArr8;
                i41 = zzc15;
                iArr3 = iArr7;
            }
            i39++;
            i34 = i18;
            i26 = i17;
            zzc13 = i16;
            iArr2 = iArr;
        }
        int i61 = i26;
        int i62 = i34;
        int[] iArr9 = iArr2;
        if (zzgsVar.zzf()) {
            int zzc17 = zzgsVar.zzc();
            for (int i63 = 0; i63 < zzc17; i63++) {
                zzgsVar.zze(zzc12 + 5);
            }
        }
        zzgsVar.zze(2);
        float f9 = 1.0f;
        if (zzgsVar.zzf()) {
            if (zzgsVar.zzf()) {
                int zza6 = zzgsVar.zza(8);
                if (zza6 == 255) {
                    int zza7 = zzgsVar.zza(16);
                    int zza8 = zzgsVar.zza(16);
                    if (zza7 != 0 && zza8 != 0) {
                        f9 = zza7 / zza8;
                    }
                } else if (zza6 < 17) {
                    f9 = zzb[zza6];
                } else {
                    L.z(zza6, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (zzgsVar.zzf()) {
                zzgsVar.zzd();
            }
            if (zzgsVar.zzf()) {
                zzgsVar.zze(3);
                int i64 = 1;
                if (true != zzgsVar.zzf()) {
                    i64 = 2;
                }
                if (zzgsVar.zzf()) {
                    int zza9 = zzgsVar.zza(8);
                    int zza10 = zzgsVar.zza(8);
                    zzgsVar.zze(8);
                    int zza11 = zzt.zza(zza9);
                    i15 = zzt.zzb(zza10);
                    i13 = zza11;
                } else {
                    i13 = -1;
                    i15 = -1;
                }
                i40 = i64;
            } else {
                i13 = -1;
                i15 = -1;
            }
            if (zzgsVar.zzf()) {
                zzgsVar.zzc();
                zzgsVar.zzc();
            }
            zzgsVar.zzd();
            if (zzgsVar.zzf()) {
                i35 += i35;
            }
            i14 = i15;
            i12 = i35;
        } else {
            i12 = i35;
            i13 = -1;
            i14 = -1;
        }
        return new zzgo(zza3, zzf, zza4, i61, i62, zzc10, zzc11, iArr9, zza5, zzc2, i33, i12, f9, i13, i40, i14);
    }

    public static zzgp zzd(byte[] bArr, int i9, int i10) {
        zzgs zzgsVar = new zzgs(bArr, 4, i10);
        int zzc2 = zzgsVar.zzc();
        int zzc3 = zzgsVar.zzc();
        zzgsVar.zzd();
        return new zzgp(zzc2, zzc3, zzgsVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgq zze(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.zze(byte[], int, int):com.google.android.gms.internal.ads.zzgq");
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}

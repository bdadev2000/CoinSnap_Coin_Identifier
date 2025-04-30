package com.google.android.gms.internal.ads;

import Q7.n0;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaen {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i9) {
        boolean zzm;
        int i10;
        int i11;
        int i12;
        int i13;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i14;
        int[] iArr4;
        int[] iArr5;
        int i15;
        int[] iArr6;
        zzm = zzaeo.zzm(i9);
        if (zzm && (i10 = (i9 >>> 19) & 3) != 1 && (i11 = (i9 >>> 17) & 3) != 0 && (i12 = (i9 >>> 12) & 15) != 0 && i12 != 15 && (i13 = (i9 >>> 10) & 3) != 3) {
            int i16 = i12 - 1;
            this.zza = i10;
            strArr = zzaeo.zza;
            this.zzb = strArr[3 - i11];
            iArr = zzaeo.zzb;
            int i17 = iArr[i13];
            this.zzd = i17;
            int i18 = 2;
            if (i10 == 2) {
                i17 /= 2;
                this.zzd = i17;
            } else if (i10 == 0) {
                i17 /= 4;
                this.zzd = i17;
            }
            int i19 = (i9 >>> 9) & 1;
            zzl = zzaeo.zzl(i10, i11);
            this.zzg = zzl;
            if (i11 == 3) {
                if (i10 == 3) {
                    iArr6 = zzaeo.zzc;
                    i15 = iArr6[i16];
                } else {
                    iArr5 = zzaeo.zzd;
                    i15 = iArr5[i16];
                }
                this.zzf = i15;
                this.zzc = (((i15 * 12) / i17) + i19) * 4;
            } else {
                int i20 = 144;
                if (i10 == 3) {
                    if (i11 == 2) {
                        iArr4 = zzaeo.zze;
                        i14 = iArr4[i16];
                    } else {
                        iArr3 = zzaeo.zzf;
                        i14 = iArr3[i16];
                    }
                    this.zzf = i14;
                    this.zzc = n0.v(i14, 144, i17, i19);
                } else {
                    iArr2 = zzaeo.zzg;
                    int i21 = iArr2[i16];
                    this.zzf = i21;
                    if (i11 == 1) {
                        i20 = 72;
                    }
                    this.zzc = n0.v(i20, i21, i17, i19);
                }
            }
            if (((i9 >> 6) & 3) == 3) {
                i18 = 1;
            }
            this.zze = i18;
            return true;
        }
        return false;
    }
}

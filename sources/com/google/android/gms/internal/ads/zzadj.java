package com.google.android.gms.internal.ads;

import a4.j;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzadj {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadj() {
    }

    public zzadj(zzadj zzadjVar) {
        this.zza = zzadjVar.zza;
        this.zzb = zzadjVar.zzb;
        this.zzc = zzadjVar.zzc;
        this.zzd = zzadjVar.zzd;
        this.zze = zzadjVar.zze;
        this.zzf = zzadjVar.zzf;
        this.zzg = zzadjVar.zzg;
    }

    public final boolean zza(int i10) {
        boolean zzm;
        int i11;
        int i12;
        int i13;
        int i14;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i15;
        int[] iArr4;
        int[] iArr5;
        int i16;
        int[] iArr6;
        zzm = zzadk.zzm(i10);
        if (zzm && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0 && (i13 = (i10 >>> 12) & 15) != 0 && i13 != 15 && (i14 = (i10 >>> 10) & 3) != 3) {
            int i17 = i13 - 1;
            this.zza = i11;
            strArr = zzadk.zza;
            this.zzb = strArr[3 - i12];
            iArr = zzadk.zzb;
            int i18 = iArr[i14];
            this.zzd = i18;
            int i19 = 2;
            if (i11 == 2) {
                i18 /= 2;
                this.zzd = i18;
            } else if (i11 == 0) {
                i18 /= 4;
                this.zzd = i18;
            }
            int i20 = (i10 >>> 9) & 1;
            zzl = zzadk.zzl(i11, i12);
            this.zzg = zzl;
            if (i12 == 3) {
                if (i11 == 3) {
                    iArr6 = zzadk.zzc;
                    i16 = iArr6[i17];
                } else {
                    iArr5 = zzadk.zzd;
                    i16 = iArr5[i17];
                }
                this.zzf = i16;
                this.zzc = (((i16 * 12) / i18) + i20) * 4;
            } else {
                int i21 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        iArr4 = zzadk.zze;
                        i15 = iArr4[i17];
                    } else {
                        iArr3 = zzadk.zzf;
                        i15 = iArr3[i17];
                    }
                    this.zzf = i15;
                    this.zzc = j.z(i15, 144, i18, i20);
                } else {
                    iArr2 = zzadk.zzg;
                    int i22 = iArr2[i17];
                    this.zzf = i22;
                    if (i12 == 1) {
                        i21 = 72;
                    }
                    this.zzc = j.z(i21, i22, i18, i20);
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i19 = 1;
            }
            this.zze = i19;
            return true;
        }
        return false;
    }
}

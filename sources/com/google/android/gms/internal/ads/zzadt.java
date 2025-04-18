package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class zzadt {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadt() {
    }

    public zzadt(zzadt zzadtVar) {
        this.zza = zzadtVar.zza;
        this.zzb = zzadtVar.zzb;
        this.zzc = zzadtVar.zzc;
        this.zzd = zzadtVar.zzd;
        this.zze = zzadtVar.zze;
        this.zzf = zzadtVar.zzf;
        this.zzg = zzadtVar.zzg;
    }

    public final boolean zza(int i2) {
        boolean zzm;
        int i3;
        int i4;
        int i5;
        int i6;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int[] iArr5;
        int i8;
        int[] iArr6;
        zzm = zzadu.zzm(i2);
        if (!zzm || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = i5 - 1;
        this.zza = i3;
        strArr = zzadu.zza;
        this.zzb = strArr[3 - i4];
        iArr = zzadu.zzb;
        int i10 = iArr[i6];
        this.zzd = i10;
        if (i3 == 2) {
            i10 /= 2;
            this.zzd = i10;
        } else if (i3 == 0) {
            i10 /= 4;
            this.zzd = i10;
        }
        int i11 = (i2 >>> 9) & 1;
        zzl = zzadu.zzl(i3, i4);
        this.zzg = zzl;
        if (i4 == 3) {
            if (i3 == 3) {
                iArr6 = zzadu.zzc;
                i8 = iArr6[i9];
            } else {
                iArr5 = zzadu.zzd;
                i8 = iArr5[i9];
            }
            this.zzf = i8;
            this.zzc = (((i8 * 12) / i10) + i11) * 4;
        } else {
            int i12 = Opcodes.D2F;
            if (i3 == 3) {
                if (i4 == 2) {
                    iArr4 = zzadu.zze;
                    i7 = iArr4[i9];
                } else {
                    iArr3 = zzadu.zzf;
                    i7 = iArr3[i9];
                }
                this.zzf = i7;
                this.zzc = androidx.compose.foundation.text.input.a.z(i7, Opcodes.D2F, i10, i11);
            } else {
                iArr2 = zzadu.zzg;
                int i13 = iArr2[i9];
                this.zzf = i13;
                if (i4 == 1) {
                    i12 = 72;
                }
                this.zzc = androidx.compose.foundation.text.input.a.z(i12, i13, i10, i11);
            }
        }
        this.zze = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}

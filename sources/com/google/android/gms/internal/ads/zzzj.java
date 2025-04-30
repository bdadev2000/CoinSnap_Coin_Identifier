package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzzj extends zzzm {

    @Nullable
    private zzzi zza;

    public abstract Pair zzd(zzzi zzziVar, int[][][] iArr, int[] iArr2, zzvo zzvoVar, zzdc zzdcVar) throws zzjh;

    @Override // com.google.android.gms.internal.ads.zzzm
    public final zzzn zzp(zzmp[] zzmpVarArr, zzxr zzxrVar, zzvo zzvoVar, zzdc zzdcVar) throws zzjh {
        boolean z8;
        boolean z9;
        zzgbc zzm;
        int[] iArr;
        boolean z10;
        int[] iArr2 = new int[3];
        zzde[][] zzdeVarArr = new zzde[3];
        int[][][] iArr3 = new int[3][];
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = zzxrVar.zzc;
            zzdeVarArr[i9] = new zzde[i10];
            iArr3[i9] = new int[i10];
        }
        int i11 = 2;
        int[] iArr4 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr4[i12] = zzmpVarArr[i12].zze();
        }
        int i13 = 0;
        while (i13 < zzxrVar.zzc) {
            zzde zzb = zzxrVar.zzb(i13);
            int i14 = zzb.zzd;
            int i15 = i11;
            int i16 = 0;
            int i17 = 0;
            boolean z11 = true;
            while (i16 < i11) {
                zzmp zzmpVar = zzmpVarArr[i16];
                int i18 = 0;
                for (int i19 = 0; i19 < zzb.zzb; i19++) {
                    i18 = Math.max(i18, zzmpVar.zzY(zzb.zzb(i19)) & 7);
                }
                if (iArr2[i16] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i18 <= i17) {
                    if (i18 == i17 && i14 == 5 && !z11 && z10) {
                        i15 = i16;
                        i17 = i18;
                        z11 = true;
                    }
                } else {
                    z11 = z10;
                    i15 = i16;
                    i17 = i18;
                }
                i16++;
                i11 = 2;
            }
            if (i15 == i11) {
                iArr = new int[zzb.zzb];
            } else {
                zzmp zzmpVar2 = zzmpVarArr[i15];
                int[] iArr5 = new int[zzb.zzb];
                for (int i20 = 0; i20 < zzb.zzb; i20++) {
                    iArr5[i20] = zzmpVar2.zzY(zzb.zzb(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i15];
            zzdeVarArr[i15][i21] = zzb;
            iArr3[i15][i21] = iArr;
            iArr2[i15] = i21 + 1;
            i13++;
            i11 = 2;
        }
        int i22 = i11;
        boolean z12 = true;
        zzxr[] zzxrVarArr = new zzxr[i22];
        String[] strArr = new String[i22];
        int[] iArr6 = new int[i22];
        int i23 = 0;
        while (i23 < i22) {
            int i24 = iArr2[i23];
            zzxrVarArr[i23] = new zzxr((zzde[]) zzgd.zzP(zzdeVarArr[i23], i24));
            iArr3[i23] = (int[][]) zzgd.zzP(iArr3[i23], i24);
            strArr[i23] = zzmpVarArr[i23].zzU();
            iArr6[i23] = zzmpVarArr[i23].zzb();
            i23++;
            i22 = 2;
        }
        int i25 = i22;
        zzzi zzziVar = new zzzi(strArr, iArr6, zzxrVarArr, iArr4, iArr3, new zzxr((zzde[]) zzgd.zzP(zzdeVarArr[i25], iArr2[i25])));
        Pair zzd = zzd(zzziVar, iArr3, iArr4, zzvoVar, zzdcVar);
        zzzk[] zzzkVarArr = (zzzk[]) zzd.second;
        List[] listArr = new List[zzzkVarArr.length];
        for (int i26 = 0; i26 < zzzkVarArr.length; i26++) {
            zzzk zzzkVar = zzzkVarArr[i26];
            if (zzzkVar != null) {
                zzm = zzgbc.zzn(zzzkVar);
            } else {
                zzm = zzgbc.zzm();
            }
            listArr[i26] = zzm;
        }
        zzgaz zzgazVar = new zzgaz();
        int i27 = 0;
        for (int i28 = 2; i27 < i28; i28 = 2) {
            zzxr zzd2 = zzziVar.zzd(i27);
            List list = listArr[i27];
            int i29 = 0;
            while (i29 < zzd2.zzc) {
                zzde zzb2 = zzd2.zzb(i29);
                if (zzziVar.zza(i27, i29, false) != 0) {
                    z8 = z12;
                } else {
                    z8 = false;
                }
                int i30 = zzb2.zzb;
                int[] iArr7 = new int[i30];
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 < zzb2.zzb; i31++) {
                    iArr7[i31] = zzziVar.zzb(i27, i29, i31) & 7;
                    int i32 = 0;
                    while (true) {
                        if (i32 < list.size()) {
                            zzzk zzzkVar2 = (zzzk) list.get(i32);
                            if (zzzkVar2.zze().equals(zzb2) && zzzkVar2.zzb(i31) != -1) {
                                z9 = true;
                                break;
                            }
                            i32++;
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    zArr[i31] = z9;
                }
                zzgazVar.zzf(new zzdo(zzb2, z8, iArr7, zArr));
                i29++;
                z12 = true;
            }
            i27++;
            z12 = true;
        }
        zzxr zze = zzziVar.zze();
        for (int i33 = 0; i33 < zze.zzc; i33++) {
            zzde zzb3 = zze.zzb(i33);
            int[] iArr8 = new int[zzb3.zzb];
            Arrays.fill(iArr8, 0);
            zzgazVar.zzf(new zzdo(zzb3, false, iArr8, new boolean[zzb3.zzb]));
        }
        return new zzzn((zzmq[]) zzd.first, (zzzg[]) zzd.second, new zzdp(zzgazVar.zzi()), zzziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzq(@Nullable Object obj) {
        this.zza = (zzzi) obj;
    }
}

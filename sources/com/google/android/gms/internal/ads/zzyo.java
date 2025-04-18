package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzyo extends zzyr {
    public abstract Pair zzd(zzyn zzynVar, int[][][] iArr, int[] iArr2, zzuy zzuyVar, zzcc zzccVar) throws zzij;

    @Override // com.google.android.gms.internal.ads.zzyr
    public final zzys zzo(zzlu[] zzluVarArr, zzwy zzwyVar, zzuy zzuyVar, zzcc zzccVar) throws zzij {
        boolean z2;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcd[][] zzcdVarArr = new zzcd[3];
        int[][][] iArr3 = new int[3][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzwyVar.zzb;
            zzcdVarArr[i2] = new zzcd[i3];
            iArr3[i2] = new int[i3];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = zzluVarArr[i5].zze();
        }
        int i6 = 0;
        while (i6 < zzwyVar.zzb) {
            zzcd zzb = zzwyVar.zzb(i6);
            int i7 = zzb.zzc;
            int i8 = i4;
            int i9 = 0;
            int i10 = 0;
            boolean z3 = true;
            while (i9 < i4) {
                zzlu zzluVar = zzluVarArr[i9];
                int i11 = 0;
                for (int i12 = 0; i12 < zzb.zza; i12++) {
                    i11 = Math.max(i11, zzluVar.zzY(zzb.zzb(i12)) & 7);
                }
                boolean z4 = iArr2[i9] == 0;
                if (i11 > i10) {
                    z3 = z4;
                    i8 = i9;
                    i10 = i11;
                } else if (i11 == i10 && i7 == 5 && !z3 && z4) {
                    i8 = i9;
                    i10 = i11;
                    z3 = true;
                }
                i9++;
                i4 = 2;
            }
            if (i8 == i4) {
                iArr = new int[zzb.zza];
            } else {
                zzlu zzluVar2 = zzluVarArr[i8];
                int[] iArr5 = new int[zzb.zza];
                for (int i13 = 0; i13 < zzb.zza; i13++) {
                    iArr5[i13] = zzluVar2.zzY(zzb.zzb(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i8];
            zzcdVarArr[i8][i14] = zzb;
            iArr3[i8][i14] = iArr;
            iArr2[i8] = i14 + 1;
            i6++;
            i4 = 2;
        }
        int i15 = i4;
        boolean z5 = true;
        zzwy[] zzwyVarArr = new zzwy[i15];
        String[] strArr = new String[i15];
        int[] iArr6 = new int[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            zzwyVarArr[i16] = new zzwy((zzcd[]) zzeu.zzN(zzcdVarArr[i16], i17));
            iArr3[i16] = (int[][]) zzeu.zzN(iArr3[i16], i17);
            strArr[i16] = zzluVarArr[i16].zzU();
            iArr6[i16] = zzluVarArr[i16].zzb();
            i16++;
            i15 = 2;
        }
        int i18 = i15;
        zzyn zzynVar = new zzyn(strArr, iArr6, zzwyVarArr, iArr4, iArr3, new zzwy((zzcd[]) zzeu.zzN(zzcdVarArr[i18], iArr2[i18])));
        Pair zzd = zzd(zzynVar, iArr3, iArr4, zzuyVar, zzccVar);
        zzyp[] zzypVarArr = (zzyp[]) zzd.second;
        List[] listArr = new List[zzypVarArr.length];
        for (int i19 = 0; i19 < zzypVarArr.length; i19++) {
            zzyp zzypVar = zzypVarArr[i19];
            listArr[i19] = zzypVar != null ? zzgax.zzo(zzypVar) : zzgax.zzn();
        }
        zzgau zzgauVar = new zzgau();
        int i20 = 0;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            zzwy zzd2 = zzynVar.zzd(i20);
            List list = listArr[i20];
            int i22 = 0;
            while (i22 < zzd2.zzb) {
                zzcd zzb2 = zzd2.zzb(i22);
                boolean z6 = zzynVar.zza(i20, i22, false) != 0 ? z5 : false;
                int i23 = zzb2.zza;
                int[] iArr7 = new int[i23];
                boolean[] zArr = new boolean[i23];
                for (int i24 = 0; i24 < zzb2.zza; i24++) {
                    iArr7[i24] = zzynVar.zzb(i20, i22, i24) & 7;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        zzyp zzypVar2 = (zzyp) list.get(i25);
                        if (zzypVar2.zze().equals(zzb2) && zzypVar2.zzb(i24) != -1) {
                            z2 = true;
                            break;
                        }
                        i25++;
                    }
                    zArr[i24] = z2;
                }
                zzgauVar.zzf(new zzcj(zzb2, z6, iArr7, zArr));
                i22++;
                z5 = true;
            }
            i20++;
            z5 = true;
        }
        zzwy zze = zzynVar.zze();
        for (int i26 = 0; i26 < zze.zzb; i26++) {
            zzcd zzb3 = zze.zzb(i26);
            int[] iArr8 = new int[zzb3.zza];
            Arrays.fill(iArr8, 0);
            zzgauVar.zzf(new zzcj(zzb3, false, iArr8, new boolean[zzb3.zza]));
        }
        return new zzys((zzlv[]) zzd.first, (zzyl[]) zzd.second, new zzck(zzgauVar.zzi()), zzynVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzp(@Nullable Object obj) {
    }
}

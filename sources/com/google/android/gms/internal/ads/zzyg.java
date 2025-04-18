package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzyg extends zzyj {
    public abstract Pair zzd(zzyf zzyfVar, int[][][] iArr, int[] iArr2, zzur zzurVar, zzbv zzbvVar) throws zzig;

    @Override // com.google.android.gms.internal.ads.zzyj
    public final zzyk zzo(zzlq[] zzlqVarArr, zzwr zzwrVar, zzur zzurVar, zzbv zzbvVar) throws zzig {
        boolean z10;
        boolean z11;
        zzfzo zzn;
        int[] iArr;
        boolean z12;
        int[] iArr2 = new int[3];
        zzbw[][] zzbwVarArr = new zzbw[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzwrVar.zzb;
            zzbwVarArr[i10] = new zzbw[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzlqVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzwrVar.zzb) {
            zzbw zzb = zzwrVar.zzb(i14);
            int i15 = zzb.zzc;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z13 = true;
            while (i17 < i12) {
                zzlq zzlqVar = zzlqVarArr[i17];
                int i19 = 0;
                for (int i20 = 0; i20 < zzb.zza; i20++) {
                    i19 = Math.max(i19, zzlqVar.zzY(zzb.zzb(i20)) & 7);
                }
                if (iArr2[i17] == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i19 <= i18) {
                    if (i19 == i18 && i15 == 5 && !z13 && z12) {
                        i16 = i17;
                        i18 = i19;
                        z13 = true;
                    }
                } else {
                    z13 = z12;
                    i16 = i17;
                    i18 = i19;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[zzb.zza];
            } else {
                zzlq zzlqVar2 = zzlqVarArr[i16];
                int[] iArr5 = new int[zzb.zza];
                for (int i21 = 0; i21 < zzb.zza; i21++) {
                    iArr5[i21] = zzlqVar2.zzY(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzbwVarArr[i16][i22] = zzb;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        int i23 = i12;
        boolean z14 = true;
        zzwr[] zzwrVarArr = new zzwr[i23];
        String[] strArr = new String[i23];
        int[] iArr6 = new int[i23];
        int i24 = 0;
        while (i24 < i23) {
            int i25 = iArr2[i24];
            zzwrVarArr[i24] = new zzwr((zzbw[]) zzen.zzO(zzbwVarArr[i24], i25));
            iArr3[i24] = (int[][]) zzen.zzO(iArr3[i24], i25);
            strArr[i24] = zzlqVarArr[i24].zzU();
            iArr6[i24] = zzlqVarArr[i24].zzb();
            i24++;
            i23 = 2;
        }
        int i26 = i23;
        zzyf zzyfVar = new zzyf(strArr, iArr6, zzwrVarArr, iArr4, iArr3, new zzwr((zzbw[]) zzen.zzO(zzbwVarArr[i26], iArr2[i26])));
        Pair zzd = zzd(zzyfVar, iArr3, iArr4, zzurVar, zzbvVar);
        zzyh[] zzyhVarArr = (zzyh[]) zzd.second;
        List[] listArr = new List[zzyhVarArr.length];
        for (int i27 = 0; i27 < zzyhVarArr.length; i27++) {
            zzyh zzyhVar = zzyhVarArr[i27];
            if (zzyhVar != null) {
                zzn = zzfzo.zzo(zzyhVar);
            } else {
                zzn = zzfzo.zzn();
            }
            listArr[i27] = zzn;
        }
        zzfzl zzfzlVar = new zzfzl();
        int i28 = 0;
        while (i28 < 2) {
            zzwr zzd2 = zzyfVar.zzd(i28);
            List list = listArr[i28];
            int i29 = 0;
            while (i29 < zzd2.zzb) {
                zzbw zzb2 = zzd2.zzb(i29);
                if (zzyfVar.zza(i28, i29, false) != 0) {
                    z10 = z14;
                } else {
                    z10 = false;
                }
                int i30 = zzb2.zza;
                int[] iArr7 = new int[i30];
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 < zzb2.zza; i31++) {
                    iArr7[i31] = zzyfVar.zzb(i28, i29, i31) & 7;
                    int i32 = 0;
                    while (true) {
                        if (i32 < list.size()) {
                            zzyh zzyhVar2 = (zzyh) list.get(i32);
                            if (zzyhVar2.zze().equals(zzb2) && zzyhVar2.zzb(i31) != -1) {
                                z11 = true;
                                break;
                            }
                            i32++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    zArr[i31] = z11;
                }
                zzfzlVar.zzf(new zzcc(zzb2, z10, iArr7, zArr));
                i29++;
                z14 = true;
            }
            i28++;
            z14 = true;
        }
        zzwr zze = zzyfVar.zze();
        for (int i33 = 0; i33 < zze.zzb; i33++) {
            zzbw zzb3 = zze.zzb(i33);
            int[] iArr8 = new int[zzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfzlVar.zzf(new zzcc(zzb3, false, iArr8, new boolean[zzb3.zza]));
        }
        return new zzyk((zzlr[]) zzd.first, (zzyd[]) zzd.second, new zzcd(zzfzlVar.zzi()), zzyfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzp(@Nullable Object obj) {
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzwy extends zzxa {
    public zzwy(zzbw zzbwVar, int[] iArr, int i10, zzyr zzyrVar, long j3, long j10, long j11, int i11, int i12, float f10, float f11, List list, zzdc zzdcVar) {
        super(zzbwVar, iArr, 0);
        zzfzo.zzl(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ zzfzo zzf(zzyc[] zzycVarArr) {
        int i10;
        int i11;
        zzfzo zzi;
        double d10;
        long j3;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i13 >= 2) {
                break;
            }
            zzyc zzycVar = zzycVarArr[i13];
            if (zzycVar != null && zzycVar.zzb.length > 1) {
                zzfzl zzfzlVar = new zzfzl();
                zzfzlVar.zzf(new zzww(0L, 0L));
                arrayList.add(zzfzlVar);
            } else {
                arrayList.add(null);
            }
            i13++;
        }
        long[][] jArr = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            zzyc zzycVar2 = zzycVarArr[i14];
            if (zzycVar2 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[zzycVar2.zzb.length];
                int i15 = 0;
                while (true) {
                    int[] iArr = zzycVar2.zzb;
                    if (i15 >= iArr.length) {
                        break;
                    }
                    long j10 = zzycVar2.zza.zzb(iArr[i15]).zzj;
                    long[] jArr2 = jArr[i14];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i15] = j10;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr4 = jArr[i16];
            if (jArr4.length == 0) {
                j3 = 0;
            } else {
                j3 = jArr4[0];
            }
            jArr3[i16] = j3;
        }
        zzg(arrayList, jArr3);
        zzfzz zza = zzgau.zzc(zzgaz.zzc()).zzb(2).zza();
        int i17 = 0;
        while (i17 < i10) {
            int length = jArr[i17].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i18 = i12;
                while (true) {
                    long[] jArr5 = jArr[i17];
                    double d11 = 0.0d;
                    if (i18 >= jArr5.length) {
                        break;
                    }
                    long j11 = jArr5[i18];
                    if (j11 != -1) {
                        d11 = Math.log(j11);
                    }
                    dArr[i18] = d11;
                    i18++;
                }
                int i19 = length - 1;
                double d12 = dArr[i19] - dArr[i12];
                int i20 = i12;
                while (i20 < i19) {
                    double d13 = dArr[i20];
                    i20++;
                    double d14 = d13 + dArr[i20];
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = ((d14 * 0.5d) - dArr[i12]) / d12;
                    }
                    zza.zzq(Double.valueOf(d10), Integer.valueOf(i17));
                    i12 = 0;
                }
            }
            i17++;
            i12 = 0;
            i10 = 2;
            i11 = 1;
        }
        zzfzo zzl = zzfzo.zzl(zza.zzr());
        for (int i21 = 0; i21 < zzl.size(); i21++) {
            int intValue = ((Integer) zzl.get(i21)).intValue();
            int i22 = iArr2[intValue] + 1;
            iArr2[intValue] = i22;
            jArr3[intValue] = jArr[intValue][i22];
            zzg(arrayList, jArr3);
        }
        for (int i23 = 0; i23 < 2; i23++) {
            if (arrayList.get(i23) != null) {
                long j12 = jArr3[i23];
                jArr3[i23] = j12 + j12;
            }
        }
        zzg(arrayList, jArr3);
        zzfzl zzfzlVar2 = new zzfzl();
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            zzfzl zzfzlVar3 = (zzfzl) arrayList.get(i24);
            if (zzfzlVar3 == null) {
                zzi = zzfzo.zzn();
            } else {
                zzi = zzfzlVar3.zzi();
            }
            zzfzlVar2.zzf(zzi);
        }
        return zzfzlVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j3 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j3 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfzl zzfzlVar = (zzfzl) list.get(i11);
            if (zzfzlVar != null) {
                zzfzlVar.zzf(new zzww(j3, jArr[i11]));
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzxy extends zzya {
    private final zzzu zzd;
    private final zzgbc zze;
    private final zzer zzf;

    public zzxy(zzde zzdeVar, int[] iArr, int i9, zzzu zzzuVar, long j7, long j9, long j10, int i10, int i11, float f9, float f10, List list, zzer zzerVar) {
        super(zzdeVar, iArr, 0);
        this.zzd = zzzuVar;
        this.zze = zzgbc.zzk(list);
        this.zzf = zzerVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ zzgbc zzf(zzzf[] zzzfVarArr) {
        int i9;
        int i10;
        zzgbc zzi;
        double d2;
        long j7;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i9 = 2;
            i10 = 1;
            if (i12 >= 2) {
                break;
            }
            zzzf zzzfVar = zzzfVarArr[i12];
            if (zzzfVar != null && zzzfVar.zzb.length > 1) {
                zzgaz zzgazVar = new zzgaz();
                zzgazVar.zzf(new zzxw(0L, 0L));
                arrayList.add(zzgazVar);
            } else {
                arrayList.add(null);
            }
            i12++;
        }
        long[][] jArr = new long[2];
        for (int i13 = 0; i13 < 2; i13++) {
            zzzf zzzfVar2 = zzzfVarArr[i13];
            if (zzzfVar2 == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[zzzfVar2.zzb.length];
                int i14 = 0;
                while (true) {
                    int[] iArr = zzzfVar2.zzb;
                    if (i14 >= iArr.length) {
                        break;
                    }
                    long j9 = zzzfVar2.zza.zzb(iArr[i14]).zzj;
                    long[] jArr2 = jArr[i13];
                    if (j9 == -1) {
                        j9 = 0;
                    }
                    jArr2[i14] = j9;
                    i14++;
                }
                Arrays.sort(jArr[i13]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i15 = 0; i15 < 2; i15++) {
            long[] jArr4 = jArr[i15];
            if (jArr4.length == 0) {
                j7 = 0;
            } else {
                j7 = jArr4[0];
            }
            jArr3[i15] = j7;
        }
        zzg(arrayList, jArr3);
        zzgbn zza = zzgci.zzc(zzgcn.zzc()).zzb(2).zza();
        int i16 = 0;
        while (i16 < i9) {
            int length = jArr[i16].length;
            if (length > i10) {
                double[] dArr = new double[length];
                int i17 = i11;
                while (true) {
                    long[] jArr5 = jArr[i16];
                    double d9 = 0.0d;
                    if (i17 >= jArr5.length) {
                        break;
                    }
                    long j10 = jArr5[i17];
                    if (j10 != -1) {
                        d9 = Math.log(j10);
                    }
                    dArr[i17] = d9;
                    i17++;
                }
                int i18 = length - 1;
                double d10 = dArr[i18] - dArr[i11];
                int i19 = i11;
                while (i19 < i18) {
                    double d11 = dArr[i19];
                    i19++;
                    double d12 = d11 + dArr[i19];
                    if (d10 == 0.0d) {
                        d2 = 1.0d;
                    } else {
                        d2 = ((d12 * 0.5d) - dArr[i11]) / d10;
                    }
                    zza.zzq(Double.valueOf(d2), Integer.valueOf(i16));
                    i11 = 0;
                }
            }
            i16++;
            i11 = 0;
            i9 = 2;
            i10 = 1;
        }
        zzgbc zzk = zzgbc.zzk(zza.zzr());
        for (int i20 = 0; i20 < zzk.size(); i20++) {
            int intValue = ((Integer) zzk.get(i20)).intValue();
            int i21 = iArr2[intValue] + 1;
            iArr2[intValue] = i21;
            jArr3[intValue] = jArr[intValue][i21];
            zzg(arrayList, jArr3);
        }
        for (int i22 = 0; i22 < 2; i22++) {
            if (arrayList.get(i22) != null) {
                long j11 = jArr3[i22];
                jArr3[i22] = j11 + j11;
            }
        }
        zzg(arrayList, jArr3);
        zzgaz zzgazVar2 = new zzgaz();
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            zzgaz zzgazVar3 = (zzgaz) arrayList.get(i23);
            if (zzgazVar3 == null) {
                zzi = zzgbc.zzm();
            } else {
                zzi = zzgazVar3.zzi();
            }
            zzgazVar2.zzf(zzi);
        }
        return zzgazVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j7 = 0;
        for (int i9 = 0; i9 < 2; i9++) {
            j7 += jArr[i9];
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzgaz zzgazVar = (zzgaz) list.get(i10);
            if (zzgazVar != null) {
                zzgazVar.zzf(new zzxw(j7, jArr[i10]));
            }
        }
    }
}

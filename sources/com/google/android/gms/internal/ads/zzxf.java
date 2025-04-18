package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzxf extends zzxh {
    public zzxf(zzcd zzcdVar, int[] iArr, int i2, zzyz zzyzVar, long j2, long j3, long j4, int i3, int i4, float f2, float f3, List list, zzdj zzdjVar) {
        super(zzcdVar, iArr, 0);
        zzgax.zzl(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ zzgax zzf(zzyk[] zzykVarArr) {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = 2;
            i3 = 1;
            if (i5 >= 2) {
                break;
            }
            zzyk zzykVar = zzykVarArr[i5];
            if (zzykVar == null || zzykVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzgau zzgauVar = new zzgau();
                zzgauVar.zzf(new zzxd(0L, 0L));
                arrayList.add(zzgauVar);
            }
            i5++;
        }
        long[][] jArr = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            zzyk zzykVar2 = zzykVarArr[i6];
            if (zzykVar2 == null) {
                jArr[i6] = new long[0];
            } else {
                jArr[i6] = new long[zzykVar2.zzb.length];
                int i7 = 0;
                while (true) {
                    int[] iArr = zzykVar2.zzb;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    long j2 = zzykVar2.zza.zzb(iArr[i7]).zzi;
                    long[] jArr2 = jArr[i6];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i7] = j2;
                    i7++;
                }
                Arrays.sort(jArr[i6]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i8 = 0; i8 < 2; i8++) {
            long[] jArr4 = jArr[i8];
            jArr3[i8] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzgbi zza = zzgcd.zzc(zzgci.zzc()).zzb(2).zza();
        int i9 = 0;
        while (i9 < i2) {
            int length = jArr[i9].length;
            if (length > i3) {
                double[] dArr = new double[length];
                int i10 = i4;
                while (true) {
                    long[] jArr5 = jArr[i9];
                    int length2 = jArr5.length;
                    double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i10 >= length2) {
                        break;
                    }
                    long j3 = jArr5[i10];
                    if (j3 != -1) {
                        d = Math.log(j3);
                    }
                    dArr[i10] = d;
                    i10++;
                }
                int i11 = length - 1;
                double d2 = dArr[i11] - dArr[i4];
                int i12 = i4;
                while (i12 < i11) {
                    double d3 = dArr[i12];
                    i12++;
                    zza.zzq(Double.valueOf(d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d3 + dArr[i12]) * 0.5d) - dArr[i4]) / d2), Integer.valueOf(i9));
                    i4 = 0;
                }
            }
            i9++;
            i4 = 0;
            i2 = 2;
            i3 = 1;
        }
        zzgax zzl = zzgax.zzl(zza.zzr());
        for (int i13 = 0; i13 < zzl.size(); i13++) {
            int intValue = ((Integer) zzl.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr3[intValue] = jArr[intValue][i14];
            zzg(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j4 = jArr3[i15];
                jArr3[i15] = j4 + j4;
            }
        }
        zzg(arrayList, jArr3);
        zzgau zzgauVar2 = new zzgau();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzgau zzgauVar3 = (zzgau) arrayList.get(i16);
            zzgauVar2.zzf(zzgauVar3 == null ? zzgax.zzn() : zzgauVar3.zzi());
        }
        return zzgauVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j2 = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            j2 += jArr[i2];
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgau zzgauVar = (zzgau) list.get(i3);
            if (zzgauVar != null) {
                zzgauVar.zzf(new zzxd(j2, jArr[i3]));
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzzi {
    private final String[] zza;
    private final int[] zzb;
    private final zzxr[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzxr zzf;

    public zzzi(String[] strArr, int[] iArr, zzxr[] zzxrVarArr, int[] iArr2, int[][][] iArr3, zzxr zzxrVar) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzxrVarArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzxrVar;
    }

    public final int zza(int i9, int i10, boolean z8) {
        int i11 = this.zzc[i9].zzb(i10).zzb;
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if ((this.zze[i9][i10][i14] & 7) == 4) {
                iArr[i13] = i14;
                i13++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i13);
        String str = null;
        int i15 = 0;
        int i16 = 16;
        boolean z9 = false;
        while (i12 < copyOf.length) {
            String str2 = this.zzc[i9].zzb(i10).zzb(copyOf[i12]).zzn;
            int i17 = i15 + 1;
            if (i15 == 0) {
                str = str2;
            } else {
                z9 |= !zzgd.zzG(str, str2);
            }
            i16 = Math.min(i16, this.zze[i9][i10][i12] & 24);
            i12++;
            i15 = i17;
        }
        if (z9) {
            return Math.min(i16, this.zzd[i9]);
        }
        return i16;
    }

    public final int zzb(int i9, int i10, int i11) {
        return this.zze[i9][i10][i11];
    }

    public final int zzc(int i9) {
        return this.zzb[i9];
    }

    public final zzxr zzd(int i9) {
        return this.zzc[i9];
    }

    public final zzxr zze() {
        return this.zzf;
    }
}

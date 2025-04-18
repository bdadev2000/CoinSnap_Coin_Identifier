package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzyn {
    private final int[] zza;
    private final zzwy[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwy zze;

    @VisibleForTesting
    public zzyn(String[] strArr, int[] iArr, zzwy[] zzwyVarArr, int[] iArr2, int[][][] iArr3, zzwy zzwyVar) {
        this.zza = iArr;
        this.zzb = zzwyVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwyVar;
    }

    public final int zza(int i2, int i3, boolean z2) {
        int i4 = this.zzb[i2].zzb(i3).zza;
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            if ((this.zzd[i2][i3][i7] & 7) == 4) {
                iArr[i6] = i7;
                i6++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i6);
        String str = null;
        int i8 = 0;
        int i9 = 16;
        boolean z3 = false;
        while (i5 < copyOf.length) {
            String str2 = this.zzb[i2].zzb(i3).zzb(copyOf[i5]).zzn;
            int i10 = i8 + 1;
            if (i8 == 0) {
                str = str2;
            } else {
                z3 |= !Objects.equals(str, str2);
            }
            i9 = Math.min(i9, this.zzd[i2][i3][i5] & 24);
            i5++;
            i8 = i10;
        }
        return z3 ? Math.min(i9, this.zzc[i2]) : i9;
    }

    public final int zzb(int i2, int i3, int i4) {
        return this.zzd[i2][i3][i4];
    }

    public final int zzc(int i2) {
        return this.zza[i2];
    }

    public final zzwy zzd(int i2) {
        return this.zzb[i2];
    }

    public final zzwy zze() {
        return this.zze;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzdo {
    public final int zzb;
    private final zzde zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final boolean[] zzj;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdn
    };

    public zzdo(zzde zzdeVar, boolean z8, int[] iArr, boolean[] zArr) {
        boolean z9;
        int i9 = zzdeVar.zzb;
        this.zzb = i9;
        if (i9 == iArr.length && i9 == zArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzeq.zzd(z9);
        this.zzg = zzdeVar;
        this.zzh = z8 && i9 > 1;
        this.zzi = (int[]) iArr.clone();
        this.zzj = (boolean[]) zArr.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdo.class == obj.getClass()) {
            zzdo zzdoVar = (zzdo) obj;
            if (this.zzh == zzdoVar.zzh && this.zzg.equals(zzdoVar.zzg) && Arrays.equals(this.zzi, zzdoVar.zzi) && Arrays.equals(this.zzj, zzdoVar.zzj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzg.hashCode() * 31;
        int[] iArr = this.zzi;
        int hashCode2 = Arrays.hashCode(iArr) + ((hashCode + (this.zzh ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zzj) + (hashCode2 * 31);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzan zzb(int i9) {
        return this.zzg.zzb(i9);
    }

    public final boolean zzc() {
        for (boolean z8 : this.zzj) {
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i9) {
        return this.zzj[i9];
    }
}

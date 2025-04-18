package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzcc {
    public final int zza;
    private final zzbw zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzcc(zzbw zzbwVar, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = zzbwVar.zza;
        this.zza = i10;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdb.zzd(z11);
        this.zzb = zzbwVar;
        this.zzc = z10 && i10 > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcc.class == obj.getClass()) {
            zzcc zzccVar = (zzcc) obj;
            if (this.zzc == zzccVar.zzc && this.zzb.equals(zzccVar.zzb) && Arrays.equals(this.zzd, zzccVar.zzd) && Arrays.equals(this.zze, zzccVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        int[] iArr = this.zzd;
        int hashCode2 = Arrays.hashCode(iArr) + ((hashCode + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (hashCode2 * 31);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzad zzb(int i10) {
        return this.zzb.zzb(i10);
    }

    public final boolean zzc() {
        for (boolean z10 : this.zze) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zze[i10];
    }
}

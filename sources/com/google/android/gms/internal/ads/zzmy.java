package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzmy {
    public final long zza;
    public final zzdc zzb;
    public final int zzc;

    @Nullable
    public final zzvo zzd;
    public final long zze;
    public final zzdc zzf;
    public final int zzg;

    @Nullable
    public final zzvo zzh;
    public final long zzi;
    public final long zzj;

    public zzmy(long j7, zzdc zzdcVar, int i9, @Nullable zzvo zzvoVar, long j9, zzdc zzdcVar2, int i10, @Nullable zzvo zzvoVar2, long j10, long j11) {
        this.zza = j7;
        this.zzb = zzdcVar;
        this.zzc = i9;
        this.zzd = zzvoVar;
        this.zze = j9;
        this.zzf = zzdcVar2;
        this.zzg = i10;
        this.zzh = zzvoVar2;
        this.zzi = j10;
        this.zzj = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmy.class == obj.getClass()) {
            zzmy zzmyVar = (zzmy) obj;
            if (this.zza == zzmyVar.zza && this.zzc == zzmyVar.zzc && this.zze == zzmyVar.zze && this.zzg == zzmyVar.zzg && this.zzi == zzmyVar.zzi && this.zzj == zzmyVar.zzj && zzfya.zza(this.zzb, zzmyVar.zzb) && zzfya.zza(this.zzd, zzmyVar.zzd) && zzfya.zza(this.zzf, zzmyVar.zzf) && zzfya.zza(this.zzh, zzmyVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}

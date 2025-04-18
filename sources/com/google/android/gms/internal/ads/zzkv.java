package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkv {
    public final zzuy zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzkv(zzuy zzuyVar, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        zzdi.zzd(!z5 || z3);
        if (z4 && !z3) {
            z6 = false;
        }
        zzdi.zzd(z6);
        this.zza = zzuyVar;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = false;
        this.zzg = z3;
        this.zzh = z4;
        this.zzi = z5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkv.class == obj.getClass()) {
            zzkv zzkvVar = (zzkv) obj;
            if (this.zzb == zzkvVar.zzb && this.zzc == zzkvVar.zzc && this.zzd == zzkvVar.zzd && this.zze == zzkvVar.zze && this.zzg == zzkvVar.zzg && this.zzh == zzkvVar.zzh && this.zzi == zzkvVar.zzi && Objects.equals(this.zza, zzkvVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j2 = this.zze;
        long j3 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j3)) * 31) + ((int) j2)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkv zza(long j2) {
        return j2 == this.zzc ? this : new zzkv(this.zza, this.zzb, j2, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkv zzb(long j2) {
        return j2 == this.zzb ? this : new zzkv(this.zza, j2, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}

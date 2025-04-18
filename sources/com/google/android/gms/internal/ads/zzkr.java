package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkr {
    public final zzur zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzkr(zzur zzurVar, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = true;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        zzdb.zzd(z14);
        if (z12 && !z11) {
            z15 = false;
        }
        zzdb.zzd(z15);
        this.zza = zzurVar;
        this.zzb = j3;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkr.class == obj.getClass()) {
            zzkr zzkrVar = (zzkr) obj;
            if (this.zzb == zzkrVar.zzb && this.zzc == zzkrVar.zzc && this.zzd == zzkrVar.zzd && this.zze == zzkrVar.zze && this.zzg == zzkrVar.zzg && this.zzh == zzkrVar.zzh && this.zzi == zzkrVar.zzi && Objects.equals(this.zza, zzkrVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j3 = this.zze;
        long j10 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j10)) * 31) + ((int) j3)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkr zza(long j3) {
        return j3 == this.zzc ? this : new zzkr(this.zza, this.zzb, j3, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkr zzb(long j3) {
        return j3 == this.zzb ? this : new zzkr(this.zza, j3, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}

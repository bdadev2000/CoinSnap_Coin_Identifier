package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlr {
    public final zzvo zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzlr(zzvo zzvoVar, long j7, long j9, long j10, long j11, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (!z11 || z9) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzeq.zzd(z12);
        if (z10 && !z9) {
            z13 = false;
        }
        zzeq.zzd(z13);
        this.zza = zzvoVar;
        this.zzb = j7;
        this.zzc = j9;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = false;
        this.zzg = z9;
        this.zzh = z10;
        this.zzi = z11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlr.class == obj.getClass()) {
            zzlr zzlrVar = (zzlr) obj;
            if (this.zzb == zzlrVar.zzb && this.zzc == zzlrVar.zzc && this.zzd == zzlrVar.zzd && this.zze == zzlrVar.zze && this.zzg == zzlrVar.zzg && this.zzh == zzlrVar.zzh && this.zzi == zzlrVar.zzi && zzgd.zzG(this.zza, zzlrVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j7 = this.zze;
        long j9 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j9)) * 31) + ((int) j7)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzlr zza(long j7) {
        if (j7 == this.zzc) {
            return this;
        }
        return new zzlr(this.zza, this.zzb, j7, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzlr zzb(long j7) {
        if (j7 == this.zzb) {
            return this;
        }
        return new zzlr(this.zza, j7, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}

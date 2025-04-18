package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzlz implements zzkt {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbq zzd = zzbq.zza;

    public zzlz(zzdj zzdjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
        long j2 = this.zzb;
        if (!this.zza) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzbq zzbqVar = this.zzd;
        return j2 + (zzbqVar.zzb == 1.0f ? zzeu.zzr(elapsedRealtime) : zzbqVar.zza(elapsedRealtime));
    }

    public final void zzb(long j2) {
        this.zzb = j2;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final zzbq zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(zzbq zzbqVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}

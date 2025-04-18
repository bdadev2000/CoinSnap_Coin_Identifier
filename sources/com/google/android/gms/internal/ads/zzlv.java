package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzlv implements zzkp {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbj zzd = zzbj.zza;

    public zzlv(zzdc zzdcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        long zza;
        long j3 = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzbj zzbjVar = this.zzd;
            if (zzbjVar.zzb == 1.0f) {
                zza = zzen.zzs(elapsedRealtime);
            } else {
                zza = zzbjVar.zza(elapsedRealtime);
            }
            return j3 + zza;
        }
        return j3;
    }

    public final void zzb(long j3) {
        this.zzb = j3;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbj zzc() {
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

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzbj zzbjVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}

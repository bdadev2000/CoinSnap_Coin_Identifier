package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzmu implements zzlp {
    private final zzer zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzcl zze = zzcl.zza;

    public zzmu(zzer zzerVar) {
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final long zza() {
        long zza;
        long j7 = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzcl zzclVar = this.zze;
            if (zzclVar.zzc == 1.0f) {
                zza = zzgd.zzr(elapsedRealtime);
            } else {
                zza = zzclVar.zza(elapsedRealtime);
            }
            return j7 + zza;
        }
        return j7;
    }

    public final void zzb(long j7) {
        this.zzc = j7;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final zzcl zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (!this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
            this.zzb = true;
        }
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzg(zzcl zzclVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmn {
    protected long zza;
    final /* synthetic */ zzmh zzb;
    private long zzc;
    private final zzat zzd;

    public zzmn(zzmh zzmhVar) {
        this.zzb = zzmhVar;
        this.zzd = new zzmq(this, zzmhVar.zzu);
        long elapsedRealtime = zzmhVar.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    public final long zza(long j7) {
        long j9 = j7 - this.zza;
        this.zza = j7;
        return j9;
    }

    public final void zzb(long j7) {
        this.zzd.zza();
    }

    public final void zzc(long j7) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j7;
        this.zza = j7;
    }

    public static /* synthetic */ void zza(zzmn zzmnVar) {
        zzmnVar.zzb.zzt();
        zzmnVar.zza(false, false, zzmnVar.zzb.zzb().elapsedRealtime());
        zzmnVar.zzb.zzc().zza(zzmnVar.zzb.zzb().elapsedRealtime());
    }

    public final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbf.zzcy)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    public final boolean zza(boolean z8, boolean z9, long j7) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j9 = j7 - this.zzc;
        if (!z8 && j9 < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j9));
            return false;
        }
        if (!z9) {
            j9 = zza(j7);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(j9));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        zznp.zza(this.zzb.zzn().zza(!this.zzb.zze().zzv()), bundle, true);
        if (!z9) {
            this.zzb.zzm().zzc("auto", "_e", bundle);
        }
        this.zzc = j7;
        this.zzd.zza();
        this.zzd.zza(zzbf.zzba.zza(null).longValue());
        return true;
    }
}

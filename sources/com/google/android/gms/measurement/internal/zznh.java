package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes12.dex */
public final class zznh {
    protected long zza;
    final /* synthetic */ zznb zzb;
    private long zzc;
    private final zzav zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(long j) {
        long j2 = j - this.zza;
        this.zza = j;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zznh zznhVar) {
        zznhVar.zzb.zzt();
        zznhVar.zza(false, false, zznhVar.zzb.zzb().elapsedRealtime());
        zznhVar.zzb.zzc().zza(zznhVar.zzb.zzb().elapsedRealtime());
    }

    public zznh(zznb zznbVar) {
        this.zzb = zznbVar;
        this.zzd = new zznk(this, zznbVar.zzu);
        long elapsedRealtime = zznbVar.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbh.zzdb)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j) {
        this.zzd.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(long j) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j;
        this.zza = j;
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j2 = j - this.zzc;
        if (!z && j2 < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = zza(j);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzos.zza(this.zzb.zzn().zza(!this.zzb.zze().zzw()), bundle, true);
        if (!z2) {
            this.zzb.zzm().zzc("auto", "_e", bundle);
        }
        this.zzc = j;
        this.zzd.zza();
        this.zzd.zza(zzbh.zzbc.zza(null).longValue());
        return true;
    }
}

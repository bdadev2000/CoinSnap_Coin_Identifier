package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zznh {

    @VisibleForTesting
    protected long zza;
    final /* synthetic */ zznb zzb;

    @VisibleForTesting
    private long zzc;
    private final zzav zzd;

    public zznh(zznb zznbVar) {
        this.zzb = zznbVar;
        this.zzd = new zznk(this, zznbVar.zzu);
        long elapsedRealtime = zznbVar.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    @VisibleForTesting
    @WorkerThread
    public final long zza(long j2) {
        long j3 = j2 - this.zza;
        this.zza = j2;
        return j3;
    }

    @WorkerThread
    public final void zzb(long j2) {
        this.zzd.zza();
    }

    @WorkerThread
    public final void zzc(long j2) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j2;
        this.zza = j2;
    }

    public static /* synthetic */ void zza(zznh zznhVar) {
        zznhVar.zzb.zzt();
        zznhVar.zza(false, false, zznhVar.zzb.zzb().elapsedRealtime());
        zznhVar.zzb.zzc().zza(zznhVar.zzb.zzb().elapsedRealtime());
    }

    public final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbh.zzdb)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    @WorkerThread
    public final boolean zza(boolean z2, boolean z3, long j2) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j3 = j2 - this.zzc;
        if (!z2 && j3 < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
            return false;
        }
        if (!z3) {
            j3 = zza(j2);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(j3));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        zzos.zza(this.zzb.zzn().zza(!this.zzb.zze().zzw()), bundle, true);
        if (!z3) {
            this.zzb.zzm().zzc("auto", "_e", bundle);
        }
        this.zzc = j2;
        this.zzd.zza();
        this.zzd.zza(zzbh.zzbc.zza(null).longValue());
        return true;
    }
}

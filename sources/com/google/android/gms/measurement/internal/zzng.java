package com.google.android.gms.measurement.internal;

import android.os.Handler;
import androidx.annotation.WorkerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzng {
    final /* synthetic */ zznb zza;
    private zznf zzb;

    public zzng(zznb zznbVar) {
        this.zza = zznbVar;
    }

    @WorkerThread
    public final void zza(long j2) {
        Handler handler;
        this.zzb = new zznf(this, this.zza.zzb().currentTimeMillis(), j2);
        handler = this.zza.zzc;
        handler.postDelayed(this.zzb, 2000L);
    }

    @WorkerThread
    public final void zza() {
        Handler handler;
        this.zza.zzt();
        if (this.zzb != null) {
            handler = this.zza.zzc;
            handler.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
        if (this.zza.zze().zza(zzbh.zzcl) && this.zza.zzm().zzau()) {
            this.zza.zzj().zzp().zza("Retrying trigger URI registration in foreground");
            this.zza.zzm().zzas();
        }
    }
}

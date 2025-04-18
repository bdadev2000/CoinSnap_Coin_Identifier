package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzkc implements FutureCallback<Object> {
    private final /* synthetic */ zzno zza;
    private final /* synthetic */ zzjq zzb;

    public zzkc(zzjq zzjqVar, zzno zznoVar) {
        this.zza = zznoVar;
        this.zzb = zzjqVar;
    }

    private final void zza() {
        SparseArray<Long> zzm = this.zzb.zzk().zzm();
        zzno zznoVar = this.zza;
        zzm.put(zznoVar.zzc, Long.valueOf(zznoVar.zzb));
        this.zzb.zzk().zza(zzm);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.zzb.zzt();
        this.zzb.zzh = false;
        if (!this.zzb.zze().zza(zzbh.zzcn)) {
            this.zzb.zzas();
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th);
            return;
        }
        int zza = (this.zzb.zze().zza(zzbh.zzcl) ? zzjq.zza(this.zzb, th) : 2) - 1;
        if (zza == 0) {
            this.zzb.zzj().zzu().zza("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(th.toString()));
            this.zzb.zzi = 1;
            this.zzb.zzal().add(this.zza);
            return;
        }
        if (zza != 1) {
            if (zza != 2) {
                return;
            }
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzgo.zza(this.zzb.zzg().zzad()), th);
            zza();
            this.zzb.zzi = 1;
            this.zzb.zzas();
            return;
        }
        this.zzb.zzal().add(this.zza);
        i2 = this.zzb.zzi;
        if (i2 > 32) {
            this.zzb.zzi = 1;
            this.zzb.zzj().zzu().zza("registerTriggerAsync failed. May try later. App ID, throwable", zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(th.toString()));
            return;
        }
        zzgq zzu = this.zzb.zzj().zzu();
        Object zza2 = zzgo.zza(this.zzb.zzg().zzad());
        i3 = this.zzb.zzi;
        zzu.zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", zza2, zzgo.zza(String.valueOf(i3)), zzgo.zza(th.toString()));
        zzjq zzjqVar = this.zzb;
        i4 = zzjqVar.zzi;
        zzjq.zzb(zzjqVar, i4);
        zzjq zzjqVar2 = this.zzb;
        i5 = zzjqVar2.zzi;
        zzjqVar2.zzi = i5 << 1;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Object obj) {
        this.zzb.zzt();
        if (!this.zzb.zze().zza(zzbh.zzcn)) {
            this.zzb.zzh = false;
            this.zzb.zzas();
            this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
        } else {
            zza();
            this.zzb.zzh = false;
            this.zzb.zzi = 1;
            this.zzb.zzj().zzc().zza("Successfully registered trigger URI", this.zza.zza);
            this.zzb.zzas();
        }
    }
}

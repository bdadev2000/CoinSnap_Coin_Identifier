package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import ua.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkc implements a {
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

    @Override // ua.a
    public final void onFailure(Throwable th2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.zzb.zzt();
        this.zzb.zzh = false;
        if (!this.zzb.zze().zza(zzbh.zzcn)) {
            this.zzb.zzas();
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th2);
            return;
        }
        if (this.zzb.zze().zza(zzbh.zzcl)) {
            i10 = zzjq.zza(this.zzb, th2);
        } else {
            i10 = 2;
        }
        int i15 = i10 - 1;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    this.zzb.zzj().zzg().zza("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzgo.zza(this.zzb.zzg().zzad()), th2);
                    zza();
                    this.zzb.zzi = 1;
                    this.zzb.zzas();
                    return;
                }
                return;
            }
            this.zzb.zzal().add(this.zza);
            i11 = this.zzb.zzi;
            if (i11 > 32) {
                this.zzb.zzi = 1;
                this.zzb.zzj().zzu().zza("registerTriggerAsync failed. May try later. App ID, throwable", zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(th2.toString()));
                return;
            }
            zzgq zzu = this.zzb.zzj().zzu();
            Object zza = zzgo.zza(this.zzb.zzg().zzad());
            i12 = this.zzb.zzi;
            zzu.zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", zza, zzgo.zza(String.valueOf(i12)), zzgo.zza(th2.toString()));
            zzjq zzjqVar = this.zzb;
            i13 = zzjqVar.zzi;
            zzjq.zzb(zzjqVar, i13);
            zzjq zzjqVar2 = this.zzb;
            i14 = zzjqVar2.zzi;
            zzjqVar2.zzi = i14 << 1;
            return;
        }
        this.zzb.zzj().zzu().zza("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(th2.toString()));
        this.zzb.zzi = 1;
        this.zzb.zzal().add(this.zza);
    }

    @Override // ua.a
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

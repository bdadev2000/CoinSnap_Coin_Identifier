package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import f4.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjh implements a {
    private final /* synthetic */ zzmu zza;
    private final /* synthetic */ zziv zzb;

    public zzjh(zziv zzivVar, zzmu zzmuVar) {
        this.zza = zzmuVar;
        this.zzb = zzivVar;
    }

    @Override // f4.a
    public final void onFailure(Throwable th) {
        int i9;
        int i10;
        int i11;
        int i12;
        this.zzb.zzt();
        this.zzb.zzh = false;
        if (!this.zzb.zze().zza(zzbf.zzcf)) {
            this.zzb.zzar();
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th);
            return;
        }
        this.zzb.zzal().add(this.zza);
        i9 = this.zzb.zzi;
        if (i9 > 64) {
            this.zzb.zzi = 1;
            this.zzb.zzj().zzu().zza("registerTriggerAsync failed. May try later. App ID, throwable", zzfw.zza(this.zzb.zzg().zzad()), zzfw.zza(th.toString()));
            return;
        }
        zzfy zzu = this.zzb.zzj().zzu();
        Object zza = zzfw.zza(this.zzb.zzg().zzad());
        i10 = this.zzb.zzi;
        zzu.zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", zza, zzfw.zza(String.valueOf(i10)), zzfw.zza(th.toString()));
        zziv zzivVar = this.zzb;
        i11 = zzivVar.zzi;
        zziv.zzb(zzivVar, i11);
        zziv zzivVar2 = this.zzb;
        i12 = zzivVar2.zzi;
        zzivVar2.zzi = i12 << 1;
    }

    @Override // f4.a
    public final void onSuccess(Object obj) {
        this.zzb.zzt();
        if (!this.zzb.zze().zza(zzbf.zzcf)) {
            this.zzb.zzh = false;
            this.zzb.zzar();
            this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
            return;
        }
        SparseArray<Long> zzh = this.zzb.zzk().zzh();
        zzmu zzmuVar = this.zza;
        zzh.put(zzmuVar.zzc, Long.valueOf(zzmuVar.zzb));
        this.zzb.zzk().zza(zzh);
        this.zzb.zzh = false;
        this.zzb.zzi = 1;
        this.zzb.zzj().zzc().zza("Successfully registered trigger URI", this.zza.zza);
        this.zzb.zzar();
    }
}

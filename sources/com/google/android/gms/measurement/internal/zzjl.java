package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjl implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zziv zzb;

    public zzjl(zziv zzivVar, long j7) {
        this.zza = j7;
        this.zzb = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzf.zza(this.zza);
        this.zzb.zzj().zzc().zza("Session timeout duration set", Long.valueOf(this.zza));
    }
}

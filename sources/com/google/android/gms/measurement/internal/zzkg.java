package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkg implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzjq zzb;

    public zzkg(zzjq zzjqVar, long j3) {
        this.zza = j3;
        this.zzb = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzf.zza(this.zza);
        this.zzb.zzj().zzc().zza("Session timeout duration set", Long.valueOf(this.zza));
    }
}

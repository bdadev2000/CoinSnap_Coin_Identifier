package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkv implements Runnable {
    private final /* synthetic */ zzkp zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzks zzc;

    public zzkv(zzks zzksVar, zzkp zzkpVar, long j7) {
        this.zza = zzkpVar;
        this.zzb = j7;
        this.zzc = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        zzks zzksVar = this.zzc;
        zzksVar.zza = null;
        zzksVar.zzo().zza((zzkp) null);
    }
}

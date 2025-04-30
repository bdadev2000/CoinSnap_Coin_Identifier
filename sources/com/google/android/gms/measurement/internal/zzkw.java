package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkw implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzks zzb;

    public zzkw(zzks zzksVar, long j7) {
        this.zza = j7;
        this.zzb = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}

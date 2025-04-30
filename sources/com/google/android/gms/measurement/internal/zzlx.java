package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzlx implements Runnable {
    private final /* synthetic */ zzfl zza;
    private final /* synthetic */ zzlw zzb;

    public zzlx(zzlw zzlwVar, zzfl zzflVar) {
        this.zza = zzflVar;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            try {
                this.zzb.zzb = false;
                if (!this.zzb.zza.zzak()) {
                    this.zzb.zza.zzj().zzc().zza("Connected to remote service");
                    this.zzb.zza.zza(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

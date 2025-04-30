package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkd implements Runnable {
    private final /* synthetic */ zzav zza;
    private final /* synthetic */ zziv zzb;

    public zzkd(zziv zzivVar, zzav zzavVar) {
        this.zza = zzavVar;
        this.zzb = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb.zzk().zza(this.zza)) {
            this.zzb.zzj().zzp().zza("Setting DMA consent(FE)", this.zza);
            if (this.zzb.zzo().zzan()) {
                this.zzb.zzo().zzai();
                return;
            } else {
                this.zzb.zzo().zza(false);
                return;
            }
        }
        this.zzb.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.zza.zza()));
    }
}

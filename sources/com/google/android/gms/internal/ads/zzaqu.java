package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaqu implements Runnable {
    private final zzare zza;
    private final zzark zzb;
    private final Runnable zzc;

    public zzaqu(zzare zzareVar, zzark zzarkVar, Runnable runnable) {
        this.zza = zzareVar;
        this.zzb = zzarkVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzark zzarkVar = this.zzb;
        if (zzarkVar.zzc()) {
            this.zza.zzo(zzarkVar.zza);
        } else {
            this.zza.zzn(zzarkVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}

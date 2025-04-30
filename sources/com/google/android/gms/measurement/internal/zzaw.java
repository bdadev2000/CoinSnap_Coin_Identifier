package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaw implements Runnable {
    private final /* synthetic */ zzil zza;
    private final /* synthetic */ zzat zzb;

    public zzaw(zzat zzatVar, zzil zzilVar) {
        this.zza = zzilVar;
        this.zzb = zzatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
        if (zzab.zza()) {
            this.zza.zzl().zzb(this);
            return;
        }
        boolean zzc = this.zzb.zzc();
        this.zzb.zzd = 0L;
        if (zzc) {
            this.zzb.zzb();
        }
    }
}

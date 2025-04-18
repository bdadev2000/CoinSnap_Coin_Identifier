package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmz implements Runnable {
    private final /* synthetic */ zznv zza;
    private final /* synthetic */ Runnable zzb;

    public zzmz(zzmy zzmyVar, zznv zznvVar, Runnable runnable) {
        this.zza = zznvVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
        this.zza.zza(this.zzb);
        this.zza.zzw();
    }
}

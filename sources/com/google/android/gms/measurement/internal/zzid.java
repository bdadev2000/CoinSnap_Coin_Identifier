package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzid implements Runnable {
    private final /* synthetic */ zzjo zza;
    private final /* synthetic */ zzhy zzb;

    public zzid(zzhy zzhyVar, zzjo zzjoVar) {
        this.zza = zzjoVar;
        this.zzb = zzhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhy.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}

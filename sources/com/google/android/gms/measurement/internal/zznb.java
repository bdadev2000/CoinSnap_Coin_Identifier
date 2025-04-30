package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zznb implements Runnable {
    private final /* synthetic */ zznm zza;
    private final /* synthetic */ zznc zzb;

    public zznb(zznc zzncVar, zznm zznmVar) {
        this.zza = zznmVar;
        this.zzb = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc.zza(this.zzb, this.zza);
        this.zzb.zzv();
    }
}

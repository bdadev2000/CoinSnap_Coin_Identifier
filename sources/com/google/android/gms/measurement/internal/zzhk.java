package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhk implements Runnable {
    private final /* synthetic */ zzit zza;
    private final /* synthetic */ zzhj zzb;

    public zzhk(zzhj zzhjVar, zzit zzitVar) {
        this.zza = zzitVar;
        this.zzb = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhj.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}

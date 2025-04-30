package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzid implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhn zzc;

    public zzid(zzhn zzhnVar, zzbd zzbdVar, zzo zzoVar) {
        this.zza = zzbdVar;
        this.zzb = zzoVar;
        this.zzc = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzc(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}

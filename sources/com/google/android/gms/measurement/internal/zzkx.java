package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzkx implements Runnable {
    private final /* synthetic */ zzje zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzje zze;
    private final /* synthetic */ zzjq zzf;

    public zzkx(zzjq zzjqVar, zzje zzjeVar, long j2, long j3, boolean z2, zzje zzjeVar2) {
        this.zza = zzjeVar;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = z2;
        this.zze = zzjeVar2;
        this.zzf = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zza(this.zza);
        if (!com.google.android.gms.internal.measurement.zznm.zza() || !this.zzf.zze().zza(zzbh.zzcx)) {
            this.zzf.zza(this.zzb, false);
        }
        zzjq.zza(this.zzf, this.zza, this.zzc, true, this.zzd);
        zzjq.zza(this.zzf, this.zza, this.zze);
    }
}

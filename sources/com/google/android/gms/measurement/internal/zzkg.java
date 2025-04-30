package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkg implements Runnable {
    private final /* synthetic */ zzin zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzin zze;
    private final /* synthetic */ zziv zzf;

    public zzkg(zziv zzivVar, zzin zzinVar, long j7, long j9, boolean z8, zzin zzinVar2) {
        this.zza = zzinVar;
        this.zzb = j7;
        this.zzc = j9;
        this.zzd = z8;
        this.zze = zzinVar2;
        this.zzf = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zza(this.zza);
        if (!com.google.android.gms.internal.measurement.zznk.zza() || !this.zzf.zze().zza(zzbf.zzcu)) {
            this.zzf.zza(this.zzb, false);
        }
        zziv.zza(this.zzf, this.zza, this.zzc, true, this.zzd);
        zziv.zza(this.zzf, this.zza, this.zze);
    }
}

package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkf implements Runnable {
    private final /* synthetic */ zzin zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzin zzd;
    private final /* synthetic */ zziv zze;

    public zzkf(zziv zzivVar, zzin zzinVar, long j7, boolean z8, zzin zzinVar2) {
        this.zza = zzinVar;
        this.zzb = j7;
        this.zzc = z8;
        this.zzd = zzinVar2;
        this.zze = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza);
        zziv.zza(this.zze, this.zza, this.zzb, false, this.zzc);
        zziv.zza(this.zze, this.zza, this.zzd);
    }
}

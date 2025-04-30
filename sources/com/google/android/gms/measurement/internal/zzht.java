package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzht implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzhn zze;

    public zzht(zzhn zzhnVar, String str, String str2, String str3, long j7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j7;
        this.zze = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        String str = this.zza;
        if (str == null) {
            zzncVar2 = this.zze.zza;
            zzncVar2.zza(this.zzb, (zzkp) null);
        } else {
            zzkp zzkpVar = new zzkp(this.zzc, str, this.zzd);
            zzncVar = this.zze.zza;
            zzncVar.zza(this.zzb, zzkpVar);
        }
    }
}

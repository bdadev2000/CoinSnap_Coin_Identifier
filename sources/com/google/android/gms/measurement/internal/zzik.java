package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzik implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzic zze;

    public zzik(zzic zzicVar, String str, String str2, String str3, long j3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j3;
        this.zze = zzicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznv zznvVar;
        zznv zznvVar2;
        String str = this.zza;
        if (str == null) {
            zznvVar2 = this.zze.zza;
            zznvVar2.zza(this.zzb, (zzlk) null);
        } else {
            zzlk zzlkVar = new zzlk(this.zzc, str, this.zzd);
            zznvVar = this.zze.zza;
            zznvVar.zza(this.zzb, zzlkVar);
        }
    }
}

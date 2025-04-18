package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdun implements zzgee {
    final /* synthetic */ zzdup zza;

    public zzdun(zzdup zzdupVar) {
        this.zza = zzdupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        long j3;
        zzcao zzcaoVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdup zzdupVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            j3 = this.zza.zzd;
            zzdupVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j3));
            zzcaoVar = this.zza.zze;
            zzcaoVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j3;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdup zzdupVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            j3 = this.zza.zzd;
            zzdupVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j3));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdum
                @Override // java.lang.Runnable
                public final void run() {
                    zzdup.zzj(zzdun.this.zza, str);
                }
            });
        }
    }
}

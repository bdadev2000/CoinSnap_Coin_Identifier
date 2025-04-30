package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdxd implements zzgfp {
    final /* synthetic */ zzdxf zza;

    public zzdxd(zzdxf zzdxfVar) {
        this.zza = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        long j7;
        zzccn zzccnVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdxf zzdxfVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j7 = this.zza.zzd;
            zzdxfVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j7));
            zzccnVar = this.zza.zze;
            zzccnVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j7;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdxf zzdxfVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j7 = this.zza.zzd;
            zzdxfVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j7));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxc
                @Override // java.lang.Runnable
                public final void run() {
                    zzdxf.zzj(zzdxd.this.zza, str);
                }
            });
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzdwe implements zzgfk {
    final /* synthetic */ zzdwg zza;

    public zzdwe(zzdwg zzdwgVar) {
        this.zza = zzdwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        long j2;
        zzcas zzcasVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdwg zzdwgVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j2 = this.zza.zzd;
            zzdwgVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j2));
            zzcasVar = this.zza.zze;
            zzcasVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j2;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdwg zzdwgVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j2 = this.zza.zzd;
            zzdwgVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j2));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwd
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwg.zzj(zzdwe.this.zza, str);
                }
            });
        }
    }
}

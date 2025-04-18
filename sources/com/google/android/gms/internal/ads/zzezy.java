package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzezy implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzezz zzd;
    final /* synthetic */ zzfab zze;

    public zzezy(zzfab zzfabVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzezz zzezzVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzezzVar;
        this.zze = zzfabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzfck zzfckVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfar zzfarVar;
        zzcvs zzm;
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th2);
        }
        zzfckVar = this.zze.zze;
        zzcon zzconVar = (zzcon) zzfckVar.zzd();
        if (zzconVar == null) {
            zza = zzfgq.zzb(th2, null);
        } else {
            zza = zzconVar.zzb().zza(th2);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzconVar != null) {
                zzconVar.zzc().zzdB(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhP)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfar zzfarVar2;
                            zzfarVar2 = zzezy.this.zze.zzd;
                            zzfarVar2.zzdB(zza);
                        }
                    });
                }
            } else {
                zzfarVar = this.zze.zzd;
                zzfarVar.zzdB(zza);
                zzm = this.zze.zzm(this.zzd);
                ((zzcon) zzm.zzh()).zzb().zzc().zzh();
            }
            zzfgl.zzb(zza.zza, th2, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
                zzfklVar.zzc(zza);
                zzfka zzfkaVar = this.zzc;
                zzfkaVar.zzh(th2);
                zzfkaVar.zzg(false);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfkoVar = this.zze.zzh;
                zzfka zzfkaVar2 = this.zzc;
                zzfkaVar2.zza(zza);
                zzfkaVar2.zzh(th2);
                zzfkaVar2.zzg(false);
                zzfkoVar.zzb(zzfkaVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        zzfar zzfarVar;
        zzcrq zzcrqVar = (zzcrq) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhP)).booleanValue()) {
                zzdas zzo = zzcrqVar.zzo();
                zzfarVar = this.zze.zzd;
                zzo.zzb(zzfarVar);
            }
            this.zza.zzb(zzcrqVar);
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
                zzfklVar.zzg(zzcrqVar.zzq().zzb);
                zzfklVar.zze(zzcrqVar.zzm().zzg());
                zzfka zzfkaVar = this.zzc;
                zzfkaVar.zzg(true);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfkoVar = this.zze.zzh;
                zzfka zzfkaVar2 = this.zzc;
                zzfkaVar2.zzb(zzcrqVar.zzq().zzb);
                zzfkaVar2.zzd(zzcrqVar.zzm().zzg());
                zzfkaVar2.zzg(true);
                zzfkoVar.zzb(zzfkaVar2.zzm());
            }
        }
    }
}

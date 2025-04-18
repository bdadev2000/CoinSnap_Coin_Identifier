package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfbm implements zzgfk {
    final /* synthetic */ zzeoq zza;
    final /* synthetic */ zzfma zzb;
    final /* synthetic */ zzflp zzc;
    final /* synthetic */ zzfbo zzd;
    final /* synthetic */ zzfbp zze;

    public zzfbm(zzfbp zzfbpVar, zzeoq zzeoqVar, zzfma zzfmaVar, zzflp zzflpVar, zzfbo zzfboVar) {
        this.zza = zzeoqVar;
        this.zzb = zzfmaVar;
        this.zzc = zzflpVar;
        this.zzd = zzfboVar;
        this.zze = zzfbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzfdy zzfdyVar;
        zzfcf zzfcfVar;
        zzcxg zzm;
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        Executor executor;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("App open ad failed to load", th);
        zzfdyVar = this.zze.zze;
        zzcqb zzcqbVar = (zzcqb) zzfdyVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcqbVar == null ? zzfie.zzb(th, null) : zzcqbVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (zzcqbVar != null) {
                    zzcqbVar.zzc().zzdB(zzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhN)).booleanValue()) {
                        executor = this.zze.zzc;
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbl
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzfcf zzfcfVar2;
                                zzfcfVar2 = zzfbm.this.zze.zzd;
                                zzfcfVar2.zzdB(zzb);
                            }
                        });
                    }
                } else {
                    zzfcfVar = this.zze.zzd;
                    zzfcfVar.zzdB(zzb);
                    zzm = this.zze.zzm(this.zzd);
                    ((zzcqb) zzm.zzh()).zzb().zzc().zzh();
                }
                zzfhz.zzb(zzb.zza, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zzb) == null) {
                    zzfmdVar = this.zze.zzh;
                    zzflp zzflpVar = this.zzc;
                    zzflpVar.zza(zzb);
                    zzflpVar.zzh(th);
                    zzflpVar.zzg(false);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzfmaVar.zzc(zzb);
                    zzflp zzflpVar2 = this.zzc;
                    zzflpVar2.zzh(th);
                    zzflpVar2.zzg(false);
                    zzfmaVar.zza(zzflpVar2);
                    zzfmaVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        zzfcf zzfcfVar;
        zzcte zzcteVar = (zzcte) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhN)).booleanValue()) {
                    zzdci zzo = zzcteVar.zzo();
                    zzfcfVar = this.zze.zzd;
                    zzo.zzb(zzfcfVar);
                }
                this.zza.zzb(zzcteVar);
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zzb) == null) {
                    zzfmdVar = this.zze.zzh;
                    zzflp zzflpVar = this.zzc;
                    zzflpVar.zzb(zzcteVar.zzq().zzb);
                    zzflpVar.zzd(zzcteVar.zzm().zzg());
                    zzflpVar.zzg(true);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzfmaVar.zzg(zzcteVar.zzq().zzb);
                    zzfmaVar.zze(zzcteVar.zzm().zzg());
                    zzflp zzflpVar2 = this.zzc;
                    zzflpVar2.zzg(true);
                    zzfmaVar.zza(zzflpVar2);
                    zzfmaVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfej implements zzgfk {
    final /* synthetic */ zzeoq zza;
    final /* synthetic */ zzfma zzb;
    final /* synthetic */ zzflp zzc;
    final /* synthetic */ zzdic zzd;
    final /* synthetic */ zzfek zze;

    public zzfej(zzfek zzfekVar, zzeoq zzeoqVar, zzfma zzfmaVar, zzflp zzflpVar, zzdic zzdicVar) {
        this.zza = zzeoqVar;
        this.zzb = zzfmaVar;
        this.zzc = zzflpVar;
        this.zzd = zzdicVar;
        this.zze = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        Executor executor;
        Executor executor2;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Interstitial ad failed to load", th);
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                this.zzd.zzb().zzdB(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhO)).booleanValue()) {
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfef
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeob zzeobVar;
                            zzeobVar = zzfej.this.zze.zzd;
                            zzeobVar.zzdB(zza);
                        }
                    });
                    executor2 = this.zze.zzb;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzffk zzffkVar;
                            zzffkVar = zzfej.this.zze.zze;
                            zzffkVar.zzdB(zza);
                        }
                    });
                }
                zzfhz.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zzb) == null) {
                    zzfmdVar = this.zze.zzg;
                    zzflp zzflpVar = this.zzc;
                    zzflpVar.zza(zza);
                    zzflpVar.zzh(th);
                    zzflpVar.zzg(false);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzfmaVar.zzc(zza);
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
        Executor executor;
        Executor executor2;
        zzeob zzeobVar;
        zzffk zzffkVar;
        zzdgy zzdgyVar = (zzdgy) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                zzbcm zzbcmVar = zzbcv.zzhO;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                    zzdci zzo = zzdgyVar.zzo();
                    zzeobVar = this.zze.zzd;
                    zzo.zza(zzeobVar);
                    zzffkVar = this.zze.zze;
                    zzo.zzd(zzffkVar);
                }
                this.zza.zzb(zzdgyVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeob zzeobVar2;
                            zzeobVar2 = zzfej.this.zze.zzd;
                            zzeobVar2.zzs();
                        }
                    });
                    executor2 = this.zze.zzb;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfei
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzffk zzffkVar2;
                            zzffkVar2 = zzfej.this.zze.zze;
                            zzffkVar2.zzs();
                        }
                    });
                }
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zzb) == null) {
                    zzfmdVar = this.zze.zzg;
                    zzflp zzflpVar = this.zzc;
                    zzflpVar.zzb(zzdgyVar.zzq().zzb);
                    zzflpVar.zzd(zzdgyVar.zzm().zzg());
                    zzflpVar.zzg(true);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzfmaVar.zzg(zzdgyVar.zzq().zzb);
                    zzfmaVar.zze(zzdgyVar.zzm().zzg());
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

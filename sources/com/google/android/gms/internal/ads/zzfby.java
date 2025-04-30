package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfby implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzfca zzd;
    final /* synthetic */ zzfcb zze;

    public zzfby(zzfcb zzfcbVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzfca zzfcaVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzfcaVar;
        this.zze = zzfcbVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcys] */
    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfek zzfekVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfcr zzfcrVar;
        zzcyr zzm;
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        Executor executor;
        zzfekVar = this.zze.zze;
        zzcrp zzcrpVar = (zzcrp) zzfekVar.zzd();
        if (zzcrpVar == null) {
            zza = zzfiq.zzb(th, null);
        } else {
            zza = zzcrpVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (zzcrpVar != null) {
                    zzcrpVar.zzc().zzdB(zza);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzil)).booleanValue()) {
                        executor = this.zze.zzc;
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbx
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzfcr zzfcrVar2;
                                zzfcrVar2 = zzfby.this.zze.zzd;
                                zzfcrVar2.zzdB(zza);
                            }
                        });
                    }
                } else {
                    zzfcrVar = this.zze.zzd;
                    zzfcrVar.zzdB(zza);
                    zzm = this.zze.zzm(this.zzd);
                    zzm.zzh().zzb().zzc().zzh();
                }
                zzfil.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzc(zza);
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzi(th);
                    zzfmcVar.zzh(false);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zzh;
                    zzfmc zzfmcVar2 = this.zzc;
                    zzfmcVar2.zza(zza);
                    zzfmcVar2.zzi(th);
                    zzfmcVar2.zzh(false);
                    zzfmqVar.zzb(zzfmcVar2.zzn());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        zzfcr zzfcrVar;
        zzcup zzcupVar = (zzcup) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzil)).booleanValue()) {
                    zzddq zzn = zzcupVar.zzn();
                    zzfcrVar = this.zze.zzd;
                    zzn.zzb(zzfcrVar);
                }
                this.zza.zzb(zzcupVar);
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzh(zzcupVar.zzp().zzb);
                    zzfmnVar.zzf(zzcupVar.zzl().zzg());
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzh(true);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zzh;
                    zzfmc zzfmcVar2 = this.zzc;
                    zzfmcVar2.zzb(zzcupVar.zzp().zzb);
                    zzfmcVar2.zze(zzcupVar.zzl().zzg());
                    zzfmcVar2.zzh(true);
                    zzfmqVar.zzb(zzfmcVar2.zzn());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

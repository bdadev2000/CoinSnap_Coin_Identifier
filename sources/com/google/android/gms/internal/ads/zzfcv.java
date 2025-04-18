package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfcv implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzdgn zzd;
    final /* synthetic */ zzfcw zze;

    public zzfcv(zzfcw zzfcwVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzdgn zzdgnVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzdgnVar;
        this.zze = zzfcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        Executor executor;
        Executor executor2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th2);
        }
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th2);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdB(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhQ)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzems zzemsVar;
                        zzemsVar = zzfcv.this.zze.zzd;
                        zzemsVar.zzdB(zza);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcs
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdw zzfdwVar;
                        zzfdwVar = zzfcv.this.zze.zze;
                        zzfdwVar.zzdB(zza);
                    }
                });
            }
            zzfgl.zzb(zza.zza, th2, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
                zzfklVar.zzc(zza);
                zzfka zzfkaVar = this.zzc;
                zzfkaVar.zzh(th2);
                zzfkaVar.zzg(false);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfkoVar = this.zze.zzg;
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
        Executor executor;
        Executor executor2;
        zzems zzemsVar;
        zzfdw zzfdwVar;
        zzdfj zzdfjVar = (zzdfj) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbce zzbceVar = zzbcn.zzhQ;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
                zzdas zzo = zzdfjVar.zzo();
                zzemsVar = this.zze.zzd;
                zzo.zza(zzemsVar);
                zzfdwVar = this.zze.zze;
                zzo.zzd(zzfdwVar);
            }
            this.zza.zzb(zzdfjVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfct
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzems zzemsVar2;
                        zzemsVar2 = zzfcv.this.zze.zzd;
                        zzemsVar2.zzs();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdw zzfdwVar2;
                        zzfdwVar2 = zzfcv.this.zze.zze;
                        zzfdwVar2.zzs();
                    }
                });
            }
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
                zzfklVar.zzg(zzdfjVar.zzq().zzb);
                zzfklVar.zze(zzdfjVar.zzm().zzg());
                zzfka zzfkaVar = this.zzc;
                zzfkaVar.zzg(true);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfkoVar = this.zze.zzg;
                zzfka zzfkaVar2 = this.zzc;
                zzfkaVar2.zzb(zzdfjVar.zzq().zzb);
                zzfkaVar2.zzd(zzdfjVar.zzm().zzg());
                zzfkaVar2.zzg(true);
                zzfkoVar.zzb(zzfkaVar2.zzm());
            }
        }
    }
}

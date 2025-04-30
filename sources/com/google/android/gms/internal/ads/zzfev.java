package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfev implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzdjh zzd;
    final /* synthetic */ zzfew zze;

    public zzfev(zzfew zzfewVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzdjh zzdjhVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzdjhVar;
        this.zze = zzfewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                this.zzd.zzb().zzdB(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzim)).booleanValue()) {
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfer
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzepc zzepcVar;
                            zzepcVar = zzfev.this.zze.zzd;
                            zzepcVar.zzdB(zza);
                        }
                    });
                    executor2 = this.zze.zzb;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfes
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzffw zzffwVar;
                            zzffwVar = zzfev.this.zze.zze;
                            zzffwVar.zzdB(zza);
                        }
                    });
                }
                zzfil.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzc(zza);
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzi(th);
                    zzfmcVar.zzh(false);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zzg;
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
        Executor executor;
        Executor executor2;
        zzepc zzepcVar;
        zzffw zzffwVar;
        zzdig zzdigVar = (zzdig) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                zzbeg zzbegVar = zzbep.zzim;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
                    zzddq zzn = zzdigVar.zzn();
                    zzepcVar = this.zze.zzd;
                    zzn.zza(zzepcVar);
                    zzffwVar = this.zze.zze;
                    zzn.zzd(zzffwVar);
                }
                this.zza.zzb(zzdigVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfet
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzepc zzepcVar2;
                            zzepcVar2 = zzfev.this.zze.zzd;
                            zzepcVar2.zzs();
                        }
                    });
                    executor2 = this.zze.zzb;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzffw zzffwVar2;
                            zzffwVar2 = zzfev.this.zze.zze;
                            zzffwVar2.zzs();
                        }
                    });
                }
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzh(zzdigVar.zzp().zzb);
                    zzfmnVar.zzf(zzdigVar.zzl().zzg());
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzh(true);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zzg;
                    zzfmc zzfmcVar2 = this.zzc;
                    zzfmcVar2.zzb(zzdigVar.zzp().zzb);
                    zzfmcVar2.zze(zzdigVar.zzl().zzg());
                    zzfmcVar2.zzh(true);
                    zzfmqVar.zzb(zzfmcVar2.zzn());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

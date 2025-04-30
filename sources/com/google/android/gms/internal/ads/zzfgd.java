package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfgd implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzfgf zzd;
    final /* synthetic */ zzfgg zze;

    public zzfgd(zzfgg zzfggVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzfgf zzfgfVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzfgfVar;
        this.zze = zzfggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfek zzfekVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzffw zzffwVar;
        zzdrl zzk;
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        Executor executor;
        zzfekVar = this.zze.zze;
        zzdrm zzdrmVar = (zzdrm) zzfekVar.zzd();
        if (zzdrmVar == null) {
            zza = zzfiq.zzb(th, null);
        } else {
            zza = zzdrmVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            try {
                if (zzdrmVar != null) {
                    zzdrmVar.zza().zzdB(zza);
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgb
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzffw zzffwVar2;
                            zzffwVar2 = zzfgd.this.zze.zzd;
                            zzffwVar2.zzdB(zza);
                        }
                    });
                } else {
                    zzffwVar = this.zze.zzd;
                    zzffwVar.zzdB(zza);
                    zzk = this.zze.zzk(this.zzd);
                    zzk.zzh().zzb().zzc().zzh();
                }
                zzfil.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
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
        zzffw zzffwVar;
        Executor executor;
        final zzffw zzffwVar2;
        zzffw zzffwVar3;
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        zzdrh zzdrhVar = (zzdrh) obj;
        synchronized (this.zze) {
            try {
                zzddq zzn = zzdrhVar.zzn();
                zzffwVar = this.zze.zzd;
                zzn.zzd(zzffwVar);
                this.zza.zzb(zzdrhVar);
                zzfgg zzfggVar = this.zze;
                executor = zzfggVar.zzb;
                zzffwVar2 = zzfggVar.zzd;
                Objects.requireNonNull(zzffwVar2);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzffw.this.zzs();
                    }
                });
                zzffwVar3 = this.zze.zzd;
                zzffwVar3.onAdMetadataChanged();
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzh(zzdrhVar.zzp().zzb);
                    zzfmnVar.zzf(zzdrhVar.zzl().zzg());
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzh(true);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zzg;
                    zzfmc zzfmcVar2 = this.zzc;
                    zzfmcVar2.zzb(zzdrhVar.zzp().zzb);
                    zzfmcVar2.zze(zzdrhVar.zzl().zzg());
                    zzfmcVar2.zzh(true);
                    zzfmqVar.zzb(zzfmcVar2.zzn());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzffr implements zzgfk {
    final /* synthetic */ zzeoq zza;
    final /* synthetic */ zzfma zzb;
    final /* synthetic */ zzflp zzc;
    final /* synthetic */ zzfft zzd;
    final /* synthetic */ zzffu zze;

    public zzffr(zzffu zzffuVar, zzeoq zzeoqVar, zzfma zzfmaVar, zzflp zzflpVar, zzfft zzfftVar) {
        this.zza = zzeoqVar;
        this.zzb = zzfmaVar;
        this.zzc = zzflpVar;
        this.zzd = zzfftVar;
        this.zze = zzffuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzfdy zzfdyVar;
        zzffk zzffkVar;
        zzdqm zzk;
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        Executor executor;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Rewarded ad failed to load", th);
        zzfdyVar = this.zze.zze;
        zzdqn zzdqnVar = (zzdqn) zzfdyVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdqnVar == null ? zzfie.zzb(th, null) : zzdqnVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdqnVar != null) {
                    zzdqnVar.zza().zzdB(zzb);
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffp
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzffk zzffkVar2;
                            zzffkVar2 = zzffr.this.zze.zzd;
                            zzffkVar2.zzdB(zzb);
                        }
                    });
                } else {
                    zzffkVar = this.zze.zzd;
                    zzffkVar.zzdB(zzb);
                    zzk = this.zze.zzk(this.zzd);
                    zzk.zzh().zzb().zzc().zzh();
                }
                zzfhz.zzb(zzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zzb) == null) {
                    zzfmdVar = this.zze.zzg;
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
        zzffk zzffkVar;
        Executor executor;
        final zzffk zzffkVar2;
        zzffk zzffkVar3;
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        zzdqi zzdqiVar = (zzdqi) obj;
        synchronized (this.zze) {
            try {
                zzdci zzo = zzdqiVar.zzo();
                zzffkVar = this.zze.zzd;
                zzo.zzd(zzffkVar);
                this.zza.zzb(zzdqiVar);
                zzffu zzffuVar = this.zze;
                executor = zzffuVar.zzb;
                zzffkVar2 = zzffuVar.zzd;
                Objects.requireNonNull(zzffkVar2);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzffk.this.zzs();
                    }
                });
                zzffkVar3 = this.zze.zzd;
                zzffkVar3.onAdMetadataChanged();
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zzb) == null) {
                    zzfmdVar = this.zze.zzg;
                    zzflp zzflpVar = this.zzc;
                    zzflpVar.zzb(zzdqiVar.zzq().zzb);
                    zzflpVar.zzd(zzdqiVar.zzm().zzg());
                    zzflpVar.zzg(true);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzfmaVar.zzg(zzdqiVar.zzq().zzb);
                    zzfmaVar.zze(zzdqiVar.zzm().zzg());
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

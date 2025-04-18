package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfed implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzfee zzd;
    final /* synthetic */ zzfeg zze;

    public zzfed(zzfeg zzfegVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzfee zzfeeVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzfeeVar;
        this.zze = zzfegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzfck zzfckVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfdw zzfdwVar;
        zzdov zzk;
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th2);
        }
        zzfckVar = this.zze.zze;
        zzdow zzdowVar = (zzdow) zzfckVar.zzd();
        if (zzdowVar == null) {
            zza = zzfgq.zzb(th2, null);
        } else {
            zza = zzdowVar.zzb().zza(th2);
        }
        synchronized (this.zze) {
            if (zzdowVar != null) {
                zzdowVar.zza().zzdB(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdw zzfdwVar2;
                        zzfdwVar2 = zzfed.this.zze.zzd;
                        zzfdwVar2.zzdB(zza);
                    }
                });
            } else {
                zzfdwVar = this.zze.zzd;
                zzfdwVar.zzdB(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzh();
            }
            zzfgl.zzb(zza.zza, th2, "RewardedAdLoader.onFailure");
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
        zzfdw zzfdwVar;
        Executor executor;
        final zzfdw zzfdwVar2;
        zzfdw zzfdwVar3;
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        zzdor zzdorVar = (zzdor) obj;
        synchronized (this.zze) {
            zzdas zzo = zzdorVar.zzo();
            zzfdwVar = this.zze.zzd;
            zzo.zzd(zzfdwVar);
            this.zza.zzb(zzdorVar);
            zzfeg zzfegVar = this.zze;
            executor = zzfegVar.zzb;
            zzfdwVar2 = zzfegVar.zzd;
            Objects.requireNonNull(zzfdwVar2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfec
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdw.this.zzs();
                }
            });
            zzfdwVar3 = this.zze.zzd;
            zzfdwVar3.onAdMetadataChanged();
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
                zzfklVar.zzg(zzdorVar.zzq().zzb);
                zzfklVar.zze(zzdorVar.zzm().zzg());
                zzfka zzfkaVar = this.zzc;
                zzfkaVar.zzg(true);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfkoVar = this.zze.zzg;
                zzfka zzfkaVar2 = this.zzc;
                zzfkaVar2.zzb(zzdorVar.zzq().zzb);
                zzfkaVar2.zzd(zzdorVar.zzm().zzg());
                zzfkaVar2.zzg(true);
                zzfkoVar.zzb(zzfkaVar2.zzm());
            }
        }
    }
}

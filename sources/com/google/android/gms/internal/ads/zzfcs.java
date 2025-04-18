package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfcs implements zzgfk {
    final /* synthetic */ zzfma zza;
    final /* synthetic */ zzflp zzb;
    final /* synthetic */ zzcrv zzc;
    final /* synthetic */ zzfct zzd;

    public zzfcs(zzfct zzfctVar, zzfma zzfmaVar, zzflp zzflpVar, zzcrv zzcrvVar) {
        this.zza = zzfmaVar;
        this.zzb = zzflpVar;
        this.zzc = zzcrvVar;
        this.zzd = zzfctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        boolean z2;
        zzfmd zzfmdVar;
        com.google.android.gms.ads.internal.client.zze zzeVar3;
        zzfma zzfmaVar;
        com.google.android.gms.ads.internal.client.zze zzeVar4;
        zzdat zzdatVar;
        zzdcz zzdczVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Banner ad failed to load", th);
        this.zzd.zzn = this.zzc.zzd().zza(th);
        synchronized (this.zzd) {
            try {
                zzcyc zzf = this.zzc.zzf();
                zzeVar = this.zzd.zzn;
                zzf.zzdB(zzeVar);
                zzeVar2 = this.zzd.zzn;
                zzfhz.zzb(zzeVar2.zza, th, "BannerAdLoader.onFailure");
                zzfct zzfctVar = this.zzd;
                z2 = zzfctVar.zzm;
                if (z2) {
                    zzfctVar.zzu();
                    zzfct zzfctVar2 = this.zzd;
                    zzdatVar = zzfctVar2.zzh;
                    zzdczVar = zzfctVar2.zzj;
                    zzdatVar.zzd(zzdczVar.zzc());
                }
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zza) == null) {
                    zzfct zzfctVar3 = this.zzd;
                    zzfmdVar = zzfctVar3.zzi;
                    zzflp zzflpVar = this.zzb;
                    zzeVar3 = zzfctVar3.zzn;
                    zzflpVar.zza(zzeVar3);
                    zzflpVar.zzh(th);
                    zzflpVar.zzg(false);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzeVar4 = this.zzd.zzn;
                    zzfmaVar.zzc(zzeVar4);
                    zzflp zzflpVar2 = this.zzb;
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
        boolean z2;
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        zzcqr zzcqrVar = (zzcqr) obj;
        synchronized (this.zzd) {
            try {
                zzfct zzfctVar = this.zzd;
                z2 = zzfctVar.zzm;
                if (z2) {
                    zzfctVar.zzr();
                }
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zza) == null) {
                    zzfmdVar = this.zzd.zzi;
                    zzflp zzflpVar = this.zzb;
                    zzflpVar.zzb(zzcqrVar.zzq().zzb);
                    zzflpVar.zzd(zzcqrVar.zzm().zzg());
                    zzflpVar.zzg(true);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzfmaVar.zzg(zzcqrVar.zzq().zzb);
                    zzfmaVar.zze(zzcqrVar.zzm().zzg());
                    zzflp zzflpVar2 = this.zzb;
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

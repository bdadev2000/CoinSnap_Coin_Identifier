package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfbe implements zzgee {
    final /* synthetic */ zzfkl zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ zzcqh zzc;
    final /* synthetic */ zzfbf zzd;

    public zzfbe(zzfbf zzfbfVar, zzfkl zzfklVar, zzfka zzfkaVar, zzcqh zzcqhVar) {
        this.zza = zzfklVar;
        this.zzb = zzfkaVar;
        this.zzc = zzcqhVar;
        this.zzd = zzfbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        boolean z10;
        zzfko zzfkoVar;
        com.google.android.gms.ads.internal.client.zze zzeVar3;
        zzfkl zzfklVar;
        com.google.android.gms.ads.internal.client.zze zzeVar4;
        zzcze zzczeVar;
        zzdbk zzdbkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th2);
        }
        this.zzd.zzn = this.zzc.zzd().zza(th2);
        synchronized (this.zzd) {
            zzcwo zzf = this.zzc.zzf();
            zzeVar = this.zzd.zzn;
            zzf.zzdB(zzeVar);
            zzeVar2 = this.zzd.zzn;
            zzfgl.zzb(zzeVar2.zza, th2, "BannerAdLoader.onFailure");
            zzfbf zzfbfVar = this.zzd;
            z10 = zzfbfVar.zzm;
            if (z10) {
                zzfbfVar.zzu();
                zzfbf zzfbfVar2 = this.zzd;
                zzczeVar = zzfbfVar2.zzh;
                zzdbkVar = zzfbfVar2.zzj;
                zzczeVar.zzd(zzdbkVar.zzc());
            }
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zza) != null) {
                zzeVar4 = this.zzd.zzn;
                zzfklVar.zzc(zzeVar4);
                zzfka zzfkaVar = this.zzb;
                zzfkaVar.zzh(th2);
                zzfkaVar.zzg(false);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfbf zzfbfVar3 = this.zzd;
                zzfkoVar = zzfbfVar3.zzi;
                zzfka zzfkaVar2 = this.zzb;
                zzeVar3 = zzfbfVar3.zzn;
                zzfkaVar2.zza(zzeVar3);
                zzfkaVar2.zzh(th2);
                zzfkaVar2.zzg(false);
                zzfkoVar.zzb(zzfkaVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        zzcpd zzcpdVar = (zzcpd) obj;
        synchronized (this.zzd) {
            zzfbf zzfbfVar = this.zzd;
            z10 = zzfbfVar.zzm;
            if (z10) {
                zzfbfVar.zzr();
            }
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zza) != null) {
                zzfklVar.zzg(zzcpdVar.zzq().zzb);
                zzfklVar.zze(zzcpdVar.zzm().zzg());
                zzfka zzfkaVar = this.zzb;
                zzfkaVar.zzg(true);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfkoVar = this.zzd.zzi;
                zzfka zzfkaVar2 = this.zzb;
                zzfkaVar2.zzb(zzcpdVar.zzq().zzb);
                zzfkaVar2.zzd(zzcpdVar.zzm().zzg());
                zzfkaVar2.zzg(true);
                zzfkoVar.zzb(zzfkaVar2.zzm());
            }
        }
    }
}

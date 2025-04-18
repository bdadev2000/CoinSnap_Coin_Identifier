package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeno implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzdhj zzd;
    final /* synthetic */ zzenp zze;

    public zzeno(zzenp zzenpVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzdhj zzdhjVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzdhjVar;
        this.zze = zzenpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzchk zzchkVar;
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th2);
        }
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th2);
        this.zzd.zzb().zzdB(zza);
        zzchkVar = this.zze.zzb;
        zzchkVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.lang.Runnable
            public final void run() {
                zzenf zzenfVar;
                zzenfVar = zzeno.this.zze.zzd;
                zzenfVar.zza().zzdB(zza);
            }
        });
        zzfgl.zzb(zza.zza, th2, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
            zzfklVar.zzc(zza);
            zzfka zzfkaVar = this.zzc;
            zzfkaVar.zzh(th2);
            zzfkaVar.zzg(false);
            zzfklVar.zza(zzfkaVar);
            zzfklVar.zzh();
            return;
        }
        zzenp zzenpVar = this.zze;
        zzfka zzfkaVar2 = this.zzc;
        zzfkoVar = zzenpVar.zze;
        zzfkaVar2.zza(zza);
        zzfkaVar2.zzh(th2);
        zzfkaVar2.zzg(false);
        zzfkoVar.zzb(zzfkaVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzenf zzenfVar;
        zzchk zzchkVar;
        zzfko zzfkoVar;
        zzfkl zzfklVar;
        zzcrq zzcrqVar = (zzcrq) obj;
        synchronized (this.zze) {
            zzdas zzo = zzcrqVar.zzo();
            zzenfVar = this.zze.zzd;
            zzo.zza(zzenfVar.zzd());
            this.zza.zzb(zzcrqVar);
            zzchkVar = this.zze.zzb;
            zzchkVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenm
                @Override // java.lang.Runnable
                public final void run() {
                    zzenf zzenfVar2;
                    zzenfVar2 = zzeno.this.zze.zzd;
                    zzenfVar2.zzb().zzs();
                }
            });
            if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
                zzfklVar.zzg(zzcrqVar.zzq().zzb);
                zzfklVar.zze(zzcrqVar.zzm().zzg());
                zzfka zzfkaVar = this.zzc;
                zzfkaVar.zzg(true);
                zzfklVar.zza(zzfkaVar);
                zzfklVar.zzh();
            } else {
                zzfkoVar = this.zze.zze;
                zzfka zzfkaVar2 = this.zzc;
                zzfkaVar2.zzb(zzcrqVar.zzq().zzb);
                zzfkaVar2.zzd(zzcrqVar.zzm().zzg());
                zzfkaVar2.zzg(true);
                zzfkoVar.zzb(zzfkaVar2.zzm());
            }
        }
    }
}

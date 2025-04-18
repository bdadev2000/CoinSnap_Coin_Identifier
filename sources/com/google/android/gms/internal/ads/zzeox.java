package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeox implements zzgfk {
    final /* synthetic */ zzeoq zza;
    final /* synthetic */ zzfma zzb;
    final /* synthetic */ zzflp zzc;
    final /* synthetic */ zzdiy zzd;
    final /* synthetic */ zzeoy zze;

    public zzeox(zzeoy zzeoyVar, zzeoq zzeoqVar, zzfma zzfmaVar, zzflp zzflpVar, zzdiy zzdiyVar) {
        this.zza = zzeoqVar;
        this.zzb = zzfmaVar;
        this.zzc = zzflpVar;
        this.zzd = zzdiyVar;
        this.zze = zzeoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzcho zzchoVar;
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Native ad failed to load", th);
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdB(zza);
        zzchoVar = this.zze.zzb;
        zzchoVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeow
            @Override // java.lang.Runnable
            public final void run() {
                zzeoo zzeooVar;
                zzeooVar = zzeox.this.zze.zzd;
                zzeooVar.zza().zzdB(zza);
            }
        });
        zzfhz.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbek.zzc.zze()).booleanValue() && (zzfmaVar = this.zzb) != null) {
            zzfmaVar.zzc(zza);
            zzflp zzflpVar = this.zzc;
            zzflpVar.zzh(th);
            zzflpVar.zzg(false);
            zzfmaVar.zza(zzflpVar);
            zzfmaVar.zzh();
            return;
        }
        zzeoy zzeoyVar = this.zze;
        zzflp zzflpVar2 = this.zzc;
        zzfmdVar = zzeoyVar.zze;
        zzflpVar2.zza(zza);
        zzflpVar2.zzh(th);
        zzflpVar2.zzg(false);
        zzfmdVar.zzb(zzflpVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeoo zzeooVar;
        zzcho zzchoVar;
        zzfmd zzfmdVar;
        zzfma zzfmaVar;
        zzcte zzcteVar = (zzcte) obj;
        synchronized (this.zze) {
            try {
                zzdci zzo = zzcteVar.zzo();
                zzeooVar = this.zze.zzd;
                zzo.zza(zzeooVar.zzd());
                this.zza.zzb(zzcteVar);
                zzchoVar = this.zze.zzb;
                zzchoVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeov
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeoo zzeooVar2;
                        zzeooVar2 = zzeox.this.zze.zzd;
                        zzeooVar2.zzb().zzs();
                    }
                });
                if (!((Boolean) zzbek.zzc.zze()).booleanValue() || (zzfmaVar = this.zzb) == null) {
                    zzfmdVar = this.zze.zze;
                    zzflp zzflpVar = this.zzc;
                    zzflpVar.zzb(zzcteVar.zzq().zzb);
                    zzflpVar.zzd(zzcteVar.zzm().zzg());
                    zzflpVar.zzg(true);
                    zzfmdVar.zzb(zzflpVar.zzm());
                } else {
                    zzfmaVar.zzg(zzcteVar.zzq().zzb);
                    zzfmaVar.zze(zzcteVar.zzm().zzg());
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

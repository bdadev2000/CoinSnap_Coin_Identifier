package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzepy implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzdkd zzd;
    final /* synthetic */ zzepz zze;

    public zzepy(zzepz zzepzVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzdkd zzdkdVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzdkdVar;
        this.zze = zzepzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzcjd zzcjdVar;
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdB(zza);
        zzcjdVar = this.zze.zzb;
        zzcjdVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepx
            @Override // java.lang.Runnable
            public final void run() {
                zzepp zzeppVar;
                zzeppVar = zzepy.this.zze.zzd;
                zzeppVar.zza().zzdB(zza);
            }
        });
        zzfil.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
            zzfmnVar.zzc(zza);
            zzfmc zzfmcVar = this.zzc;
            zzfmcVar.zzi(th);
            zzfmcVar.zzh(false);
            zzfmnVar.zza(zzfmcVar);
            zzfmnVar.zzi();
            return;
        }
        zzepz zzepzVar = this.zze;
        zzfmc zzfmcVar2 = this.zzc;
        zzfmqVar = zzepzVar.zze;
        zzfmcVar2.zza(zza);
        zzfmcVar2.zzi(th);
        zzfmcVar2.zzh(false);
        zzfmqVar.zzb(zzfmcVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzepp zzeppVar;
        zzcjd zzcjdVar;
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        zzcup zzcupVar = (zzcup) obj;
        synchronized (this.zze) {
            try {
                zzddq zzn = zzcupVar.zzn();
                zzeppVar = this.zze.zzd;
                zzn.zza(zzeppVar.zzd());
                this.zza.zzb(zzcupVar);
                zzcjdVar = this.zze.zzb;
                zzcjdVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzepp zzeppVar2;
                        zzeppVar2 = zzepy.this.zze.zzd;
                        zzeppVar2.zzb().zzs();
                    }
                });
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzh(zzcupVar.zzp().zzb);
                    zzfmnVar.zzf(zzcupVar.zzl().zzg());
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzh(true);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zze;
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

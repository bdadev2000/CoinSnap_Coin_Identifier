package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzegg implements zzefh {
    private final Context zza;
    private final zzcqh zzb;
    private final Executor zzc;

    public zzegg(Context context, zzcqh zzcqhVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqhVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, final zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
            zzbpp zzc = ((zzfgm) zzefeVar.zzb).zzc();
            if (zzc != null) {
                try {
                    zza = (View) ObjectWrapper.unwrap(zzc.zze());
                    boolean zzf = zzc.zzf();
                    if (zza != null) {
                        if (zzf) {
                            try {
                                zza = (View) zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzege
                                    @Override // com.google.android.gms.internal.ads.zzgdp
                                    public final ua.b zza(Object obj) {
                                        return zzegg.this.zzc(zza, zzfetVar, obj);
                                    }
                                }, zzcaj.zze).get();
                            } catch (InterruptedException | ExecutionException e2) {
                                throw new zzffv(e2);
                            }
                        }
                    } else {
                        throw new zzffv(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                } catch (RemoteException e10) {
                    throw new zzffv(e10);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzffv(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            zza = ((zzfgm) zzefeVar.zzb).zza();
        }
        zzcqh zzcqhVar = this.zzb;
        zzcsg zzcsgVar = new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza);
        final zzfgm zzfgmVar = (zzfgm) zzefeVar.zzb;
        Objects.requireNonNull(zzfgmVar);
        zzcpe zza2 = zzcqhVar.zza(zzcsgVar, new zzcpk(zza, null, new zzcro() { // from class: com.google.android.gms.internal.ads.zzegf
            @Override // com.google.android.gms.internal.ads.zzcro
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return zzfgm.this.zzb();
            }
        }, (zzfeu) zzfetVar.zzu.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzc);
        ((zzegx) zzefeVar.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        com.google.android.gms.ads.internal.client.zzs zza;
        com.google.android.gms.ads.internal.client.zzs zzsVar = zzfffVar.zza.zza.zze;
        if (zzsVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzs(this.zza, com.google.android.gms.ads.zzb.zzd(zzsVar.zze, zzsVar.zzb));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
                zza = new com.google.android.gms.ads.internal.client.zzs(this.zza, com.google.android.gms.ads.zzb.zze(zzsVar.zze, zzsVar.zzb));
            } else {
                zza = zzffu.zza(this.zza, zzfetVar.zzu);
            }
        }
        com.google.android.gms.ads.internal.client.zzs zzsVar2 = zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
            Object obj = zzefeVar.zzb;
            Context context = this.zza;
            zzffo zzffoVar = zzfffVar.zza.zza;
            ((zzfgm) obj).zzn(context, zzsVar2, zzffoVar.zzd, zzfetVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbr.zzm(zzfetVar.zzs), (zzbpm) zzefeVar.zzc);
            return;
        }
        Object obj2 = zzefeVar.zzb;
        Context context2 = this.zza;
        zzffo zzffoVar2 = zzfffVar.zza.zza;
        ((zzfgm) obj2).zzm(context2, zzsVar2, zzffoVar2.zzd, zzfetVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbr.zzm(zzfetVar.zzs), (zzbpm) zzefeVar.zzc);
    }

    public final /* synthetic */ ua.b zzc(View view, zzfet zzfetVar, Object obj) throws Exception {
        return zzgei.zzh(zzcrc.zza(this.zza, view, zzfetVar));
    }
}

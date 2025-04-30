package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeiq implements zzehr {
    private final Context zza;
    private final zzctg zzb;
    private final Executor zzc;

    public zzeiq(Context context, zzctg zzctgVar, Executor executor) {
        this.zza = context;
        this.zzb = zzctgVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, final zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
            zzbro zzc = ((zzfim) zzehoVar.zzb).zzc();
            if (zzc != null) {
                try {
                    zza = (View) ObjectWrapper.unwrap(zzc.zze());
                    boolean zzf = zzc.zzf();
                    if (zza != null) {
                        if (zzf) {
                            try {
                                zza = (View) zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeio
                                    @Override // com.google.android.gms.internal.ads.zzgfa
                                    public final f4.c zza(Object obj) {
                                        return zzeiq.this.zzc(zza, zzfgtVar, obj);
                                    }
                                }, zzcci.zze).get();
                            } catch (InterruptedException | ExecutionException e4) {
                                throw new zzfhv(e4);
                            }
                        }
                    } else {
                        throw new zzfhv(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                } catch (RemoteException e9) {
                    throw new zzfhv(e9);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfhv(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            zza = ((zzfim) zzehoVar.zzb).zza();
        }
        zzctg zzctgVar = this.zzb;
        zzcvf zzcvfVar = new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza);
        final zzfim zzfimVar = (zzfim) zzehoVar.zzb;
        Objects.requireNonNull(zzfimVar);
        zzcsg zza2 = zzctgVar.zza(zzcvfVar, new zzcsm(zza, null, new zzcun() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfim.this.zzb();
            }
        }, (zzfgu) zzfgtVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzc);
        ((zzejh) zzehoVar.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        com.google.android.gms.ads.internal.client.zzq zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = zzfhfVar.zza.zza.zze;
        if (zzqVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
                zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb));
            } else {
                zza = zzfhu.zza(this.zza, zzfgtVar.zzv);
            }
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
            Object obj = zzehoVar.zzb;
            Context context = this.zza;
            zzfho zzfhoVar = zzfhfVar.zza.zza;
            ((zzfim) obj).zzn(context, zzqVar2, zzfhoVar.zzd, zzfgtVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzm(zzfgtVar.zzt), (zzbrl) zzehoVar.zzc);
            return;
        }
        Object obj2 = zzehoVar.zzb;
        Context context2 = this.zza;
        zzfho zzfhoVar2 = zzfhfVar.zza.zza;
        ((zzfim) obj2).zzm(context2, zzqVar2, zzfhoVar2.zzd, zzfgtVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzm(zzfgtVar.zzt), (zzbrl) zzehoVar.zzc);
    }

    public final /* synthetic */ f4.c zzc(View view, zzfgt zzfgtVar, Object obj) throws Exception {
        return zzgft.zzh(zzcub.zza(this.zza, view, zzfgtVar));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzehx implements zzefh {
    private final Context zza;
    private final zzdhj zzb;
    private final Executor zzc;

    public zzehx(Context context, zzdhj zzdhjVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhjVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfff zzfffVar, int i10) {
        return zzfffVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        zzdiy zzah;
        zzbpr zzD = ((zzfgm) zzefeVar.zzb).zzD();
        zzbps zzE = ((zzfgm) zzefeVar.zzb).zzE();
        zzbpv zzd = ((zzfgm) zzefeVar.zzb).zzd();
        if (zzd != null && zzc(zzfffVar, 6)) {
            zzah = zzdiy.zzt(zzd);
        } else if (zzD != null && zzc(zzfffVar, 6)) {
            zzah = zzdiy.zzai(zzD);
        } else if (zzD != null && zzc(zzfffVar, 2)) {
            zzah = zzdiy.zzag(zzD);
        } else if (zzE != null && zzc(zzfffVar, 6)) {
            zzah = zzdiy.zzaj(zzE);
        } else if (zzE != null && zzc(zzfffVar, 1)) {
            zzah = zzdiy.zzah(zzE);
        } else {
            throw new zzeiz(1, "No native ad mappers");
        }
        zzffo zzffoVar = zzfffVar.zza.zza;
        if (zzffoVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            zzdja zze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdjk(zzah), new zzdlb(zzE, zzD, zzd));
            ((zzegx) zzefeVar.zzc).zzc(zze.zzk());
            zze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeiz(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        zzfgm zzfgmVar = (zzfgm) zzefeVar.zzb;
        zzffo zzffoVar = zzfffVar.zza.zza;
        String jSONObject = zzfetVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbr.zzm(zzfetVar.zzs);
        zzbpm zzbpmVar = (zzbpm) zzefeVar.zzc;
        zzffo zzffoVar2 = zzfffVar.zza.zza;
        zzfgmVar.zzp(this.zza, zzffoVar.zzd, jSONObject, zzm, zzbpmVar, zzffoVar2.zzi, zzffoVar2.zzg);
    }
}

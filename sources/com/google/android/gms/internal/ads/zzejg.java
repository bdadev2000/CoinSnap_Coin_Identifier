package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzejg implements zzegq {
    private final Context zza;
    private final zzdiy zzb;
    private final Executor zzc;

    public zzejg(Context context, zzdiy zzdiyVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdiyVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfgt zzfgtVar, int i2) {
        return zzfgtVar.zza.zza.zzg.contains(Integer.toString(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj, zzeki {
        zzdkp zzah;
        zzbpw zzD = ((zzfia) zzegnVar.zzb).zzD();
        zzbpx zzE = ((zzfia) zzegnVar.zzb).zzE();
        zzbqa zzd = ((zzfia) zzegnVar.zzb).zzd();
        if (zzd != null && zzc(zzfgtVar, 6)) {
            zzah = zzdkp.zzt(zzd);
        } else if (zzD != null && zzc(zzfgtVar, 6)) {
            zzah = zzdkp.zzai(zzD);
        } else if (zzD != null && zzc(zzfgtVar, 2)) {
            zzah = zzdkp.zzag(zzD);
        } else if (zzE != null && zzc(zzfgtVar, 6)) {
            zzah = zzdkp.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfgtVar, 1)) {
                throw new zzeki(1, "No native ad mappers");
            }
            zzah = zzdkp.zzah(zzE);
        }
        zzfhc zzfhcVar = zzfgtVar.zza.zza;
        if (!zzfhcVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            throw new zzeki(1, "No corresponding native ad listener");
        }
        zzdkr zze = this.zzb.zze(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdlb(zzah), new zzdms(zzE, zzD, zzd));
        ((zzeig) zzegnVar.zzc).zzc(zze.zzk());
        zze.zzd().zzo(new zzcof((zzfia) zzegnVar.zzb), this.zzc);
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        zzfia zzfiaVar = (zzfia) zzegnVar.zzb;
        zzfhc zzfhcVar = zzfgtVar.zza.zza;
        String jSONObject = zzfghVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzfghVar.zzs);
        zzbpr zzbprVar = (zzbpr) zzegnVar.zzc;
        zzfhc zzfhcVar2 = zzfgtVar.zza.zza;
        zzfiaVar.zzp(this.zza, zzfhcVar.zzd, jSONObject, zzm, zzbprVar, zzfhcVar2.zzi, zzfhcVar2.zzg);
    }
}

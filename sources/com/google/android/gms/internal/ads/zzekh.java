package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzekh implements zzehr {
    private final Context zza;
    private final zzdkd zzb;
    private final Executor zzc;

    public zzekh(Context context, zzdkd zzdkdVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdkdVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfhf zzfhfVar, int i9) {
        return zzfhfVar.zza.zza.zzg.contains(Integer.toString(i9));
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        zzdlt zzah;
        zzbrq zzD = ((zzfim) zzehoVar.zzb).zzD();
        zzbrr zzE = ((zzfim) zzehoVar.zzb).zzE();
        zzbru zzd = ((zzfim) zzehoVar.zzb).zzd();
        if (zzd != null && zzc(zzfhfVar, 6)) {
            zzah = zzdlt.zzt(zzd);
        } else if (zzD != null && zzc(zzfhfVar, 6)) {
            zzah = zzdlt.zzai(zzD);
        } else if (zzD != null && zzc(zzfhfVar, 2)) {
            zzah = zzdlt.zzag(zzD);
        } else if (zzE != null && zzc(zzfhfVar, 6)) {
            zzah = zzdlt.zzaj(zzE);
        } else if (zzE != null && zzc(zzfhfVar, 1)) {
            zzah = zzdlt.zzah(zzE);
        } else {
            throw new zzelj(1, "No native ad mappers");
        }
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        if (zzfhoVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            zzdlv zze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdmf(zzah), new zzdnw(zzE, zzD, zzd));
            ((zzejh) zzehoVar.zzc).zzc(zze.zzk());
            zze.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzelj(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        zzfim zzfimVar = (zzfim) zzehoVar.zzb;
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        String jSONObject = zzfgtVar.zzw.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbw.zzm(zzfgtVar.zzt);
        zzbrl zzbrlVar = (zzbrl) zzehoVar.zzc;
        zzfho zzfhoVar2 = zzfhfVar.zza.zza;
        zzfimVar.zzp(this.zza, zzfhoVar.zzd, jSONObject, zzm, zzbrlVar, zzfhoVar2.zzi, zzfhoVar2.zzg);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdkj implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;

    public zzdkj(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcjd zzcjdVar = (zzcjd) this.zza.zzb();
        zzcyt zza = ((zzczd) this.zzb).zza();
        zzdfc zza2 = ((zzdfw) this.zzc).zza();
        zzdjy zza3 = ((zzdka) this.zzd).zza();
        zzdca zzb = ((zzcse) this.zze).zzb();
        zzelf zzelfVar = (zzelf) this.zzf.zzb();
        zzctf zze = zzcjdVar.zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzenl(null));
        zze.zzg(new zzcuh(zzb, null));
        zze.zzc(new zzcsc(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdD)).booleanValue()) {
            zze.zzj(zzelo.zzb(zzelfVar));
        }
        zzcus zzc = zze.zzh().zzc();
        zzhkx.zzb(zzc);
        return zzc;
    }
}

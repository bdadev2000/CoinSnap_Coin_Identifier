package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzdje implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;
    private final zzhja zzd;
    private final zzhja zze;
    private final zzhja zzf;

    public zzdje(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4, zzhja zzhjaVar5, zzhja zzhjaVar6) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
        this.zzd = zzhjaVar4;
        this.zze = zzhjaVar5;
        this.zzf = zzhjaVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcho zzchoVar = (zzcho) this.zza.zzb();
        zzcxi zza = ((zzcxs) this.zzb).zza();
        zzddu zza2 = ((zzdeo) this.zzc).zza();
        zzdit zza3 = ((zzdiv) this.zzd).zza();
        zzdat zzb = ((zzcqq) this.zze).zzb();
        zzeke zzekeVar = (zzeke) this.zzf.zzb();
        zzcru zze = zzchoVar.zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzemk(null));
        zze.zzg(new zzcsw(zzb, null));
        zze.zzc(new zzcqo(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdC)).booleanValue()) {
            zze.zzj(zzekn.zzb(zzekeVar));
        }
        zzcth zzc = zze.zzh().zzc();
        zzhiq.zzb(zzc);
        return zzc;
    }
}

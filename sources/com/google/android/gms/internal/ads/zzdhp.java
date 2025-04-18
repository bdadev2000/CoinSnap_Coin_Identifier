package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdhp implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;

    public zzdhp(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
        this.zzf = zzhgpVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchk zzchkVar = (zzchk) this.zza.zzb();
        zzcvu zza = ((zzcwe) this.zzb).zza();
        zzdcf zza2 = ((zzdcz) this.zzc).zza();
        zzdhe zza3 = ((zzdhg) this.zzd).zza();
        zzcze zzb = ((zzcpc) this.zze).zzb();
        zzeiv zzeivVar = (zzeiv) this.zzf.zzb();
        zzcqg zze = zzchkVar.zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzelb(null));
        zze.zzg(new zzcri(zzb, null));
        zze.zzc(new zzcpa(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdJ)).booleanValue()) {
            zze.zzj(zzeje.zzb(zzeivVar));
        }
        zzcrt zzc = zze.zzh().zzc();
        zzhgf.zzb(zzc);
        return zzc;
    }
}

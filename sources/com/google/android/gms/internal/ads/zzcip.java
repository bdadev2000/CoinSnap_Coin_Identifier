package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcip implements zzdhi {
    private final zzciy zza;
    private zzfco zzb;
    private zzfbr zzc;
    private zzdcf zzd;
    private zzcvw zze;
    private zzdhe zzf;
    private zzcpa zzg;

    public /* synthetic */ zzcip(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final /* synthetic */ zzcvs zza(zzfbr zzfbrVar) {
        this.zzc = zzfbrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final /* synthetic */ zzcvs zzb(zzfco zzfcoVar) {
        this.zzb = zzfcoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final /* bridge */ /* synthetic */ zzdhi zzc(zzcpa zzcpaVar) {
        this.zzg = zzcpaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final /* bridge */ /* synthetic */ zzdhi zzd(zzdhe zzdheVar) {
        this.zzf = zzdheVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final /* bridge */ /* synthetic */ zzdhi zze(zzdcf zzdcfVar) {
        this.zzd = zzdcfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final /* bridge */ /* synthetic */ zzdhi zzf(zzcvw zzcvwVar) {
        this.zze = zzcvwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdhj zzh() {
        zzhgf.zzc(this.zzd, zzdcf.class);
        zzhgf.zzc(this.zze, zzcvw.class);
        zzhgf.zzc(this.zzf, zzdhe.class);
        zzhgf.zzc(this.zzg, zzcpa.class);
        return new zzciq(this.zza, this.zzg, this.zzf, new zzcta(), new zzfgu(), new zzcuz(), new zzdta(), this.zzd, this.zze, zzejg.zza(), null, this.zzb, this.zzc, null);
    }
}

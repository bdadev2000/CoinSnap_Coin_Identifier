package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcjr implements zzdgm {
    private final zzciy zza;
    private zzfco zzb;
    private zzfbr zzc;
    private zzdcf zzd;
    private zzcvw zze;
    private zzelb zzf;

    public /* synthetic */ zzcjr(zzciy zzciyVar, zzckd zzckdVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final /* bridge */ /* synthetic */ zzdgm zzc(zzelb zzelbVar) {
        this.zzf = zzelbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final /* bridge */ /* synthetic */ zzdgm zzd(zzdcf zzdcfVar) {
        this.zzd = zzdcfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final /* bridge */ /* synthetic */ zzdgm zze(zzcvw zzcvwVar) {
        this.zze = zzcvwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdgn zzh() {
        zzhgf.zzc(this.zzd, zzdcf.class);
        zzhgf.zzc(this.zze, zzcvw.class);
        zzhgf.zzc(this.zzf, zzelb.class);
        return new zzcjs(this.zza, new zzcta(), new zzfgu(), new zzcuz(), new zzdta(), this.zzd, this.zze, zzejg.zza(), this.zzf, null, this.zzb, this.zzc, null);
    }
}

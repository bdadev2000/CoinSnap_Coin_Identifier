package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcjy implements zzdov {
    private final zzciy zza;
    private zzfco zzb;
    private zzfbr zzc;
    private zzdcf zzd;
    private zzcvw zze;

    public /* synthetic */ zzcjy(zzciy zzciyVar, zzckd zzckdVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdov
    public final /* bridge */ /* synthetic */ zzdov zzc(zzdcf zzdcfVar) {
        this.zzd = zzdcfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdov
    public final /* bridge */ /* synthetic */ zzdov zzd(zzcvw zzcvwVar) {
        this.zze = zzcvwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdow zzh() {
        zzhgf.zzc(this.zzd, zzdcf.class);
        zzhgf.zzc(this.zze, zzcvw.class);
        return new zzcjz(this.zza, new zzcta(), new zzfgu(), new zzcuz(), new zzdta(), this.zzd, this.zze, zzejg.zza(), null, this.zzb, this.zzc, null);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcmm implements zzdjg {
    private final zzcla zza;
    private zzfeo zzb;
    private zzfdr zzc;
    private zzdfc zzd;
    private zzcyv zze;
    private zzenl zzf;

    public /* synthetic */ zzcmm(zzcla zzclaVar, zzcml zzcmlVar) {
        this.zza = zzclaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final /* synthetic */ zzcyr zza(zzfdr zzfdrVar) {
        this.zzc = zzfdrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final /* synthetic */ zzcyr zzb(zzfeo zzfeoVar) {
        this.zzb = zzfeoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final /* synthetic */ zzdjg zzc(zzenl zzenlVar) {
        this.zzf = zzenlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final /* synthetic */ zzdjg zzd(zzdfc zzdfcVar) {
        this.zzd = zzdfcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final /* synthetic */ zzdjg zze(zzcyv zzcyvVar) {
        this.zze = zzcyvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdjh zzh() {
        zzhkx.zzc(this.zzd, zzdfc.class);
        zzhkx.zzc(this.zze, zzcyv.class);
        zzhkx.zzc(this.zzf, zzenl.class);
        return new zzcmo(this.zza, new zzcvz(), new zzfiu(), new zzcxy(), new zzdvq(), this.zzd, this.zze, zzelq.zza(), this.zzf, null, this.zzb, this.zzc, null);
    }
}

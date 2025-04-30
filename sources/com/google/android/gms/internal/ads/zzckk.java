package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzckk implements zzdkc {
    private final zzcla zza;
    private zzfeo zzb;
    private zzfdr zzc;
    private zzdfc zzd;
    private zzcyv zze;
    private zzdjy zzf;
    private zzcsc zzg;

    public /* synthetic */ zzckk(zzcla zzclaVar, zzckj zzckjVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdkc
    public final /* synthetic */ zzdkc zzc(zzcsc zzcscVar) {
        this.zzg = zzcscVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkc
    public final /* synthetic */ zzdkc zzd(zzdjy zzdjyVar) {
        this.zzf = zzdjyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkc
    public final /* synthetic */ zzdkc zze(zzdfc zzdfcVar) {
        this.zzd = zzdfcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkc
    public final /* synthetic */ zzdkc zzf(zzcyv zzcyvVar) {
        this.zze = zzcyvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdkd zzh() {
        zzhkx.zzc(this.zzd, zzdfc.class);
        zzhkx.zzc(this.zze, zzcyv.class);
        zzhkx.zzc(this.zzf, zzdjy.class);
        zzhkx.zzc(this.zzg, zzcsc.class);
        return new zzckm(this.zza, this.zzg, this.zzf, new zzcvz(), new zzfiu(), new zzcxy(), new zzdvq(), this.zzd, this.zze, zzelq.zza(), null, this.zzb, this.zzc, null);
    }
}

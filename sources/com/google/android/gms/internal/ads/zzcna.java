package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcna implements zzdrl {
    private final zzcla zza;
    private zzfeo zzb;
    private zzfdr zzc;
    private zzdfc zzd;
    private zzcyv zze;

    public /* synthetic */ zzcna(zzcla zzclaVar, zzcmz zzcmzVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdrl
    public final /* synthetic */ zzdrl zzc(zzdfc zzdfcVar) {
        this.zzd = zzdfcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrl
    public final /* synthetic */ zzdrl zzd(zzcyv zzcyvVar) {
        this.zze = zzcyvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdrm zzh() {
        zzhkx.zzc(this.zzd, zzdfc.class);
        zzhkx.zzc(this.zze, zzcyv.class);
        return new zzcnc(this.zza, new zzcvz(), new zzfiu(), new zzcxy(), new zzdvq(), this.zzd, this.zze, zzelq.zza(), null, this.zzb, this.zzc, null);
    }
}

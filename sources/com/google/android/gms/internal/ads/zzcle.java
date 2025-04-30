package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcle implements zzcrs {
    private final zzcla zza;
    private zzfeo zzb;
    private zzfdr zzc;
    private zzdfc zzd;
    private zzcyv zze;

    public /* synthetic */ zzcle(zzcla zzclaVar, zzcld zzcldVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcrs
    public final /* synthetic */ zzcrs zzc(zzdfc zzdfcVar) {
        this.zzd = zzdfcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcrs
    public final /* synthetic */ zzcrs zzd(zzcyv zzcyvVar) {
        this.zze = zzcyvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzcrt zzh() {
        zzhkx.zzc(this.zzd, zzdfc.class);
        zzhkx.zzc(this.zze, zzcyv.class);
        return new zzclg(this.zza, new zzcvz(), new zzfiu(), new zzcxy(), new zzdvq(), this.zzd, this.zze, zzelq.zza(), null, this.zzb, this.zzc, null);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcne implements com.google.android.gms.ads.nonagon.signalgeneration.zzq {
    private final zzcla zza;
    private zzcyv zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzao zzc;

    public /* synthetic */ zzcne(zzcla zzclaVar, zzcnd zzcndVar) {
        this.zza = zzclaVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzq
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzq zza(zzcyv zzcyvVar) {
        this.zzb = zzcyvVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzq
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzq zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzao zzaoVar) {
        this.zzc = zzaoVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzq
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzr zzc() {
        zzhkx.zzc(this.zzb, zzcyv.class);
        zzhkx.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzao.class);
        return new zzcng(this.zza, this.zzc, new zzcvz(), new zzcxy(), new zzdvq(), this.zzb, null, null, null);
    }
}

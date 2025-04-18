package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcjm implements zzdtn {
    private final zzciy zza;
    private final zzcjp zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcjm(zzciy zzciyVar, zzcjp zzcjpVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
        this.zzb = zzcjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* bridge */ /* synthetic */ zzdtn zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* bridge */ /* synthetic */ zzdtn zzb(long j3) {
        this.zzc = Long.valueOf(j3);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final zzdto zzc() {
        zzhgf.zzc(this.zzc, Long.class);
        zzhgf.zzc(this.zzd, String.class);
        return new zzcjn(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

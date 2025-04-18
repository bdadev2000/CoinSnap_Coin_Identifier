package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdgk implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzcys zza;
    private final zzddx zzb;

    public zzdgk(zzcys zzcysVar, zzddx zzddxVar) {
        this.zza = zzcysVar;
        this.zzb = zzddxVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
        this.zza.zzdH();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        this.zza.zzdq();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        this.zza.zzdr();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        this.zza.zzdt();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i10) {
        this.zza.zzdu(i10);
        this.zzb.zza();
    }
}

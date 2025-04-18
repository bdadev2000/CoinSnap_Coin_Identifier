package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzdhz implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzdag zza;
    private final zzdfm zzb;

    public zzdhz(zzdag zzdagVar, zzdfm zzdfmVar) {
        this.zza = zzdagVar;
        this.zzb = zzdfmVar;
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
    public final void zzdu(int i2) {
        this.zza.zzdu(i2);
        this.zzb.zza();
    }
}

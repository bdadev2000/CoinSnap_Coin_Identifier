package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdje implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzdbr zza;
    private final zzdgu zzb;

    public zzdje(zzdbr zzdbrVar, zzdgu zzdguVar) {
        this.zza = zzdbrVar;
        this.zzb = zzdguVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        this.zza.zzdH();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        this.zza.zzdq();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        this.zza.zzdr();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        this.zza.zzdt();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i9) {
        this.zza.zzdu(i9);
        this.zzb.zza();
    }
}

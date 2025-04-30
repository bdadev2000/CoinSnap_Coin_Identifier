package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzchk implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzchd zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzp zzb;

    public zzchk(zzchd zzchdVar, @Nullable com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zza = zzchdVar;
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i9) {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdu(i9);
        }
        this.zza.zzY();
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzcfv implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzcfo zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzr zzb;

    public zzcfv(zzcfo zzcfoVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zza = zzcfoVar;
        this.zzb = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i2) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzdu(i2);
        }
        this.zza.zzY();
    }
}

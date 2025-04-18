package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzcsl implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzcxt zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcsl(zzcxt zzcxtVar) {
        this.zza = zzcxtVar;
    }

    private final void zzh() {
        if (!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i10) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}

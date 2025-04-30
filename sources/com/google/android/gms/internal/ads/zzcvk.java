package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcvk implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzdas zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcvk(zzdas zzdasVar) {
        this.zza = zzdasVar;
    }

    private final void zzh() {
        if (!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i9) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}

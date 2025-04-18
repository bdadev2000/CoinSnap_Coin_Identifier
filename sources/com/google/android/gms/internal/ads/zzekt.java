package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzekt implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcwk zzb;
    private final zzcxe zzc;
    private final zzden zzd;
    private final zzdef zze;
    private final zzcny zzf;

    public zzekt(zzcwk zzcwkVar, zzcxe zzcxeVar, zzden zzdenVar, zzdef zzdefVar, zzcny zzcnyVar) {
        this.zzb = zzcwkVar;
        this.zzc = zzcxeVar;
        this.zzd = zzdenVar;
        this.zze = zzdefVar;
        this.zzf = zzcnyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (!this.zza.compareAndSet(false, true)) {
            return;
        }
        this.zzf.zzr();
        this.zze.zza(view);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}

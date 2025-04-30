package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzend implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzczj zzb;
    private final zzdad zzc;
    private final zzdhk zzd;
    private final zzdhc zze;
    private final zzcra zzf;

    public zzend(zzczj zzczjVar, zzdad zzdadVar, zzdhk zzdhkVar, zzdhc zzdhcVar, zzcra zzcraVar) {
        this.zzb = zzczjVar;
        this.zzc = zzdadVar;
        this.zzd = zzdhkVar;
        this.zze = zzdhcVar;
        this.zzf = zzcraVar;
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

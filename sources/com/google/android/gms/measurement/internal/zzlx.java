package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlx implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzon zzc;
    private final /* synthetic */ zzls zzd;

    public zzlx(zzls zzlsVar, zzo zzoVar, boolean z10, zzon zzonVar) {
        this.zza = zzoVar;
        this.zzb = z10;
        this.zzc = zzonVar;
        this.zzd = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        zzon zzonVar;
        zzgbVar = this.zzd.zzb;
        if (zzgbVar == null) {
            this.zzd.zzj().zzg().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzls zzlsVar = this.zzd;
        if (this.zzb) {
            zzonVar = null;
        } else {
            zzonVar = this.zzc;
        }
        zzlsVar.zza(zzgbVar, zzonVar, this.zza);
        this.zzd.zzar();
    }
}

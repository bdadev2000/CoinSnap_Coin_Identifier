package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlg implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzno zzc;
    private final /* synthetic */ zzkx zzd;

    public zzlg(zzkx zzkxVar, zzo zzoVar, boolean z8, zzno zznoVar) {
        this.zza = zzoVar;
        this.zzb = z8;
        this.zzc = zznoVar;
        this.zzd = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzno zznoVar;
        zzflVar = this.zzd.zzb;
        if (zzflVar == null) {
            this.zzd.zzj().zzg().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzkx zzkxVar = this.zzd;
        if (this.zzb) {
            zznoVar = null;
        } else {
            zznoVar = this.zzc;
        }
        zzkxVar.zza(zzflVar, zznoVar, this.zza);
        this.zzd.zzaq();
    }
}

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlj implements Runnable {
    private final /* synthetic */ zzkp zza;
    private final /* synthetic */ zzkx zzb;

    public zzlj(zzkx zzkxVar, zzkp zzkpVar) {
        this.zza = zzkpVar;
        this.zzb = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzflVar = this.zzb.zzb;
        if (zzflVar == null) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzkp zzkpVar = this.zza;
            if (zzkpVar == null) {
                zzflVar.zza(0L, (String) null, (String) null, this.zzb.zza().getPackageName());
            } else {
                zzflVar.zza(zzkpVar.zzc, zzkpVar.zza, zzkpVar.zzb, this.zzb.zza().getPackageName());
            }
            this.zzb.zzaq();
        } catch (RemoteException e4) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to the service", e4);
        }
    }
}

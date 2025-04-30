package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlf implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzkx zzb;

    public zzlf(zzkx zzkxVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzflVar = this.zzb.zzb;
        if (zzflVar == null) {
            this.zzb.zzj().zzg().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzflVar.zzd(this.zza);
        } catch (RemoteException e4) {
            this.zzb.zzj().zzg().zza("Failed to reset data on the service: remote exception", e4);
        }
        this.zzb.zzaq();
    }
}

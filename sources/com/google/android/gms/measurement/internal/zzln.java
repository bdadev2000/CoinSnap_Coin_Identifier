package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzln implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzkx zzb;

    public zzln(zzkx zzkxVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzflVar = this.zzb.zzb;
        if (zzflVar == null) {
            this.zzb.zzj().zzg().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzflVar.zzg(this.zza);
            this.zzb.zzaq();
        } catch (RemoteException e4) {
            this.zzb.zzj().zzg().zza("Failed to send measurementEnabled to the service", e4);
        }
    }
}

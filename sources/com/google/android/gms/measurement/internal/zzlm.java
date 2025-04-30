package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlm implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzkx zzc;

    public zzlm(zzkx zzkxVar, zzo zzoVar, Bundle bundle) {
        this.zza = zzoVar;
        this.zzb = bundle;
        this.zzc = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzflVar = this.zzc.zzb;
        if (zzflVar == null) {
            this.zzc.zzj().zzg().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzflVar.zza(this.zzb, this.zza);
        } catch (RemoteException e4) {
            this.zzc.zzj().zzg().zza("Failed to send default event parameters to service", e4);
        }
    }
}

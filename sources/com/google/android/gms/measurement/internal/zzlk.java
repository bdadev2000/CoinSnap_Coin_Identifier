package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlk implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzkx zzb;

    public zzlk(zzkx zzkxVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzflVar = this.zzb.zzb;
        if (zzflVar == null) {
            this.zzb.zzj().zzg().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzflVar.zzc(this.zza);
            this.zzb.zzh().zzac();
            this.zzb.zza(zzflVar, (AbstractSafeParcelable) null, this.zza);
            this.zzb.zzaq();
        } catch (RemoteException e4) {
            this.zzb.zzj().zzg().zza("Failed to send app launch to the service", e4);
        }
    }
}

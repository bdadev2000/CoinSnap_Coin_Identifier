package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzle implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzkx zzd;

    public zzle(zzkx zzkxVar, AtomicReference atomicReference, zzo zzoVar, boolean z8) {
        this.zza = atomicReference;
        this.zzb = zzoVar;
        this.zzc = z8;
        this.zzd = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        synchronized (this.zza) {
            try {
                try {
                    zzflVar = this.zzd.zzb;
                } catch (RemoteException e4) {
                    this.zzd.zzj().zzg().zza("Failed to get all user properties; remote exception", e4);
                }
                if (zzflVar == null) {
                    this.zzd.zzj().zzg().zza("Failed to get all user properties; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzflVar.zza(this.zzb, this.zzc));
                this.zzd.zzaq();
                this.zza.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}

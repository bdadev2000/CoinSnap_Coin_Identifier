package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzli implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzkx zzc;

    public zzli(zzkx zzkxVar, AtomicReference atomicReference, zzo zzoVar) {
        this.zza = atomicReference;
        this.zzb = zzoVar;
        this.zzc = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        synchronized (this.zza) {
            try {
                try {
                } catch (RemoteException e4) {
                    this.zzc.zzj().zzg().zza("Failed to get app instance id", e4);
                }
                if (this.zzc.zzk().zzn().zzj()) {
                    zzflVar = this.zzc.zzb;
                    if (zzflVar == null) {
                        this.zzc.zzj().zzg().zza("Failed to get app instance id");
                        return;
                    }
                    Preconditions.checkNotNull(this.zzb);
                    this.zza.set(zzflVar.zzb(this.zzb));
                    String str = (String) this.zza.get();
                    if (str != null) {
                        this.zzc.zzm().zzc(str);
                        this.zzc.zzk().zze.zza(str);
                    }
                    this.zzc.zzaq();
                    this.zza.notify();
                    return;
                }
                this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzm().zzc((String) null);
                this.zzc.zzk().zze.zza(null);
                this.zza.set(null);
            } finally {
                this.zza.notify();
            }
        }
    }
}

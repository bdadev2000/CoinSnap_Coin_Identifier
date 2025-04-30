package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlh implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zzb;
    private final /* synthetic */ zzkx zzc;

    public zzlh(zzkx zzkxVar, zzo zzoVar, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        this.zza = zzoVar;
        this.zzb = zzdgVar;
        this.zzc = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        try {
            if (this.zzc.zzk().zzn().zzj()) {
                zzflVar = this.zzc.zzb;
                if (zzflVar == null) {
                    this.zzc.zzj().zzg().zza("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull(this.zza);
                String zzb = zzflVar.zzb(this.zza);
                if (zzb != null) {
                    this.zzc.zzm().zzc(zzb);
                    this.zzc.zzk().zze.zza(zzb);
                }
                this.zzc.zzaq();
                this.zzc.zzq().zza(this.zzb, zzb);
                return;
            }
            this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
            this.zzc.zzm().zzc((String) null);
            this.zzc.zzk().zze.zza(null);
        } catch (RemoteException e4) {
            this.zzc.zzj().zzg().zza("Failed to get app instance id", e4);
        } finally {
            this.zzc.zzq().zza(this.zzb, (String) null);
        }
    }
}

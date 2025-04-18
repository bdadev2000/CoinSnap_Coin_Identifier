package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmc implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zzb;
    private final /* synthetic */ zzls zzc;

    public zzmc(zzls zzlsVar, zzo zzoVar, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = zzoVar;
        this.zzb = zzdoVar;
        this.zzc = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        try {
            if (this.zzc.zzk().zzo().zzh()) {
                zzgbVar = this.zzc.zzb;
                if (zzgbVar == null) {
                    this.zzc.zzj().zzg().zza("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull(this.zza);
                String zzb = zzgbVar.zzb(this.zza);
                if (zzb != null) {
                    this.zzc.zzm().zzc(zzb);
                    this.zzc.zzk().zze.zza(zzb);
                }
                this.zzc.zzar();
                this.zzc.zzq().zza(this.zzb, zzb);
                return;
            }
            this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
            this.zzc.zzm().zzc((String) null);
            this.zzc.zzk().zze.zza(null);
        } catch (RemoteException e2) {
            this.zzc.zzj().zzg().zza("Failed to get app instance id", e2);
        } finally {
            this.zzc.zzq().zza(this.zzb, (String) null);
        }
    }
}

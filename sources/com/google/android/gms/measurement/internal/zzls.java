package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzls implements Runnable {
    private final /* synthetic */ boolean zza = true;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzae zzd;
    private final /* synthetic */ zzae zze;
    private final /* synthetic */ zzkx zzf;

    public zzls(zzkx zzkxVar, boolean z8, zzo zzoVar, boolean z9, zzae zzaeVar, zzae zzaeVar2) {
        this.zzb = zzoVar;
        this.zzc = z9;
        this.zzd = zzaeVar;
        this.zze = zzaeVar2;
        this.zzf = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzae zzaeVar;
        zzflVar = this.zzf.zzb;
        if (zzflVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            zzkx zzkxVar = this.zzf;
            if (this.zzc) {
                zzaeVar = null;
            } else {
                zzaeVar = this.zzd;
            }
            zzkxVar.zza(zzflVar, zzaeVar, this.zzb);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze.zza)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzflVar.zza(this.zzd, this.zzb);
                } else {
                    zzflVar.zza(this.zzd);
                }
            } catch (RemoteException e4) {
                this.zzf.zzj().zzg().zza("Failed to send conditional user property to the service", e4);
            }
        }
        this.zzf.zzaq();
    }
}

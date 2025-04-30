package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlb implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzo zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zze;
    private final /* synthetic */ zzkx zzf;

    public zzlb(zzkx zzkxVar, String str, String str2, zzo zzoVar, boolean z8, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzoVar;
        this.zzd = z8;
        this.zze = zzdgVar;
        this.zzf = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        Bundle bundle = new Bundle();
        try {
            zzflVar = this.zzf.zzb;
            if (zzflVar == null) {
                this.zzf.zzj().zzg().zza("Failed to get user properties; not connected to service", this.zza, this.zzb);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            Bundle zza = zznp.zza(zzflVar.zza(this.zza, this.zzb, this.zzd, this.zzc));
            this.zzf.zzaq();
            this.zzf.zzq().zza(this.zze, zza);
        } catch (RemoteException e4) {
            this.zzf.zzj().zzg().zza("Failed to get user properties; remote exception", this.zza, e4);
        } finally {
            this.zzf.zzq().zza(this.zze, bundle);
        }
    }
}

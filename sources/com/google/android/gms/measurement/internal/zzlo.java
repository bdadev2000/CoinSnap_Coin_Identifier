package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlo implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zzc;
    private final /* synthetic */ zzkx zzd;

    public zzlo(zzkx zzkxVar, zzbd zzbdVar, String str, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        this.zza = zzbdVar;
        this.zzb = str;
        this.zzc = zzdgVar;
        this.zzd = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        try {
            zzflVar = this.zzd.zzb;
            if (zzflVar == null) {
                this.zzd.zzj().zzg().zza("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] zza = zzflVar.zza(this.zza, this.zzb);
            this.zzd.zzaq();
            this.zzd.zzq().zza(this.zzc, zza);
        } catch (RemoteException e4) {
            this.zzd.zzj().zzg().zza("Failed to send event to the service to bundle", e4);
        } finally {
            this.zzd.zzq().zza(this.zzc, (byte[]) null);
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlp implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbd zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzkx zzf;

    public zzlp(zzkx zzkxVar, boolean z8, zzo zzoVar, boolean z9, zzbd zzbdVar, String str) {
        this.zza = z8;
        this.zzb = zzoVar;
        this.zzc = z9;
        this.zzd = zzbdVar;
        this.zze = str;
        this.zzf = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        zzbd zzbdVar;
        zzflVar = this.zzf.zzb;
        if (zzflVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            zzkx zzkxVar = this.zzf;
            if (this.zzc) {
                zzbdVar = null;
            } else {
                zzbdVar = this.zzd;
            }
            zzkxVar.zza(zzflVar, zzbdVar, this.zzb);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzflVar.zza(this.zzd, this.zzb);
                } else {
                    zzflVar.zza(this.zzd, this.zze, this.zzf.zzj().zzx());
                }
            } catch (RemoteException e4) {
                this.zzf.zzj().zzg().zza("Failed to send event to the service", e4);
            }
        }
        this.zzf.zzaq();
    }
}

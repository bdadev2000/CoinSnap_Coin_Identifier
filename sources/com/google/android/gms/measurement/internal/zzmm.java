package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmm implements Runnable {
    private final /* synthetic */ boolean zza = true;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzae zzd;
    private final /* synthetic */ zzae zze;
    private final /* synthetic */ zzls zzf;

    public zzmm(zzls zzlsVar, boolean z10, zzo zzoVar, boolean z11, zzae zzaeVar, zzae zzaeVar2) {
        this.zzb = zzoVar;
        this.zzc = z11;
        this.zzd = zzaeVar;
        this.zze = zzaeVar2;
        this.zzf = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        zzae zzaeVar;
        zzgbVar = this.zzf.zzb;
        if (zzgbVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            zzls zzlsVar = this.zzf;
            if (this.zzc) {
                zzaeVar = null;
            } else {
                zzaeVar = this.zzd;
            }
            zzlsVar.zza(zzgbVar, zzaeVar, this.zzb);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze.zza)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzgbVar.zza(this.zzd, this.zzb);
                } else {
                    zzgbVar.zza(this.zzd);
                }
            } catch (RemoteException e2) {
                this.zzf.zzj().zzg().zza("Failed to send conditional user property to the service", e2);
            }
        }
        this.zzf.zzar();
    }
}

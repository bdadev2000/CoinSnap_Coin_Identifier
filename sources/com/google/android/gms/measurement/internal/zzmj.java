package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmj implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbf zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzls zzf;

    public zzmj(zzls zzlsVar, boolean z10, zzo zzoVar, boolean z11, zzbf zzbfVar, String str) {
        this.zza = z10;
        this.zzb = zzoVar;
        this.zzc = z11;
        this.zzd = zzbfVar;
        this.zze = str;
        this.zzf = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        long j3;
        long j10;
        long j11;
        zzbf zzbfVar;
        zzgbVar = this.zzf.zzb;
        if (zzgbVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            zzls zzlsVar = this.zzf;
            if (this.zzc) {
                zzbfVar = null;
            } else {
                zzbfVar = this.zzd;
            }
            zzlsVar.zza(zzgbVar, zzbfVar, this.zzb);
        } else {
            boolean zza = this.zzf.zze().zza(zzbh.zzce);
            try {
                if (TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    if (zza) {
                        j11 = this.zzf.zzu.zzb().currentTimeMillis();
                        try {
                            j3 = this.zzf.zzu.zzb().elapsedRealtime();
                        } catch (RemoteException e2) {
                            e = e2;
                            j3 = 0;
                            j10 = j11;
                            this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
                            if (zza && j10 != 0) {
                                zzgm.zza(this.zzf.zzu).zza(36301, 13, j10, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j3));
                            }
                            this.zzf.zzar();
                        }
                    } else {
                        j11 = 0;
                        j3 = 0;
                    }
                    try {
                        zzgbVar.zza(this.zzd, this.zzb);
                        if (zza) {
                            this.zzf.zzj().zzp().zza("Logging telemetry for logEvent");
                            zzgm.zza(this.zzf.zzu).zza(36301, 0, j11, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j3));
                        }
                    } catch (RemoteException e10) {
                        e = e10;
                        j10 = j11;
                        this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
                        if (zza) {
                            zzgm.zza(this.zzf.zzu).zza(36301, 13, j10, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j3));
                        }
                        this.zzf.zzar();
                    }
                } else {
                    zzgbVar.zza(this.zzd, this.zze, this.zzf.zzj().zzx());
                }
            } catch (RemoteException e11) {
                e = e11;
                j3 = 0;
                j10 = 0;
            }
        }
        this.zzf.zzar();
    }
}

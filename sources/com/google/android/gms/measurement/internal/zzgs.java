package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzoj;

/* loaded from: classes2.dex */
final class zzgs implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzbz zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzgp zzc;

    public zzgs(zzgp zzgpVar, com.google.android.gms.internal.measurement.zzbz zzbzVar, ServiceConnection serviceConnection) {
        this.zza = zzbzVar;
        this.zzb = serviceConnection;
        this.zzc = zzgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z8;
        zzgp zzgpVar = this.zzc;
        zzgq zzgqVar = zzgpVar.zza;
        str = zzgpVar.zzb;
        com.google.android.gms.internal.measurement.zzbz zzbzVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza = zzgqVar.zza(str, zzbzVar);
        zzgqVar.zza.zzl().zzt();
        zzgqVar.zza.zzy();
        if (zza != null) {
            long j7 = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j7 == 0) {
                zzgqVar.zza.zzj().zzu().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString(Constants.INSTALL_REFERRER);
                if (string != null && !string.isEmpty()) {
                    zzgqVar.zza.zzj().zzp().zza("InstallReferrer API result", string);
                    if (zzoj.zza() && zzgqVar.zza.zzf().zza(zzbf.zzcm)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Bundle zza2 = zzgqVar.zza.zzt().zza(Uri.parse("?".concat(string)), z8);
                    if (zza2 == null) {
                        zzgqVar.zza.zzj().zzg().zza("No campaign params defined in Install Referrer result");
                    } else {
                        if (z8) {
                            long j9 = zza.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j9 > 0) {
                                zza2.putLong("click_timestamp", j9);
                            }
                        } else {
                            String string2 = zza2.getString(Constants.MEDIUM);
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j10 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j10 == 0) {
                                    zzgqVar.zza.zzj().zzg().zza("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    zza2.putLong("click_timestamp", j10);
                                }
                            }
                        }
                        if (j7 == zzgqVar.zza.zzn().zzd.zza()) {
                            zzgqVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzgqVar.zza.zzac()) {
                            zzgqVar.zza.zzn().zzd.zza(j7);
                            zzgqVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zza2.putString("_cis", "referrer API v2");
                            zzgqVar.zza.zzp().zza("auto", "_cmp", zza2, str);
                        }
                    }
                } else {
                    zzgqVar.zza.zzj().zzg().zza("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzgqVar.zza.zza(), serviceConnection);
        }
    }
}

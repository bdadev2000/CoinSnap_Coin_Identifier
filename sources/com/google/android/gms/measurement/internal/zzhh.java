package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzov;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class zzhh implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzbz zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzhi zzc;

    public zzhh(zzhi zzhiVar, com.google.android.gms.internal.measurement.zzbz zzbzVar, ServiceConnection serviceConnection) {
        this.zza = zzbzVar;
        this.zzb = serviceConnection;
        this.zzc = zzhiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z10;
        boolean z11;
        zzhi zzhiVar = this.zzc;
        zzhf zzhfVar = zzhiVar.zza;
        str = zzhiVar.zzb;
        com.google.android.gms.internal.measurement.zzbz zzbzVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza = zzhfVar.zza(str, zzbzVar);
        zzhfVar.zza.zzl().zzt();
        zzhfVar.zza.zzy();
        if (zza != null) {
            long j3 = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j3 == 0) {
                zzhfVar.zza.zzj().zzu().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString(Constants.INSTALL_REFERRER);
                if (string != null && !string.isEmpty()) {
                    zzhfVar.zza.zzj().zzp().zza("InstallReferrer API result", string);
                    if (zzov.zza() && zzhfVar.zza.zzf().zza(zzbh.zzcu)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Bundle zza2 = zzhfVar.zza.zzt().zza(Uri.parse("?".concat(string)), z10);
                    if (zza2 == null) {
                        zzhfVar.zza.zzj().zzg().zza("No campaign params defined in Install Referrer result");
                    } else {
                        if (z10) {
                            if (zza2.containsKey("gclid") || zza2.containsKey("gbraid")) {
                                long j10 = zza.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j10 > 0) {
                                    zza2.putLong("click_timestamp", j10);
                                }
                            }
                        } else {
                            String string2 = zza2.getString(Constants.MEDIUM);
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                long j11 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j11 == 0) {
                                    zzhfVar.zza.zzj().zzg().zza("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    zza2.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j3 == zzhfVar.zza.zzn().zzd.zza()) {
                            zzhfVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzhfVar.zza.zzac()) {
                            zzhfVar.zza.zzn().zzd.zza(j3);
                            zzhfVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zza2.putString("_cis", "referrer API v2");
                            zzhfVar.zza.zzp().zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", zza2, str);
                        }
                    }
                } else {
                    zzhfVar.zza.zzj().zzg().zza("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzhfVar.zza.zza(), serviceConnection);
        }
    }
}

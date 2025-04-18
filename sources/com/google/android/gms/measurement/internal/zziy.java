package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zziy implements Callable<List<zzno>> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzic zzc;

    public zziy(zzic zzicVar, zzo zzoVar, Bundle bundle) {
        this.zza = zzoVar;
        this.zzb = bundle;
        this.zzc = zzicVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzno> call() throws Exception {
        zznv zznvVar;
        zznv zznvVar2;
        zznvVar = this.zzc.zza;
        zznvVar.zzr();
        zznvVar2 = this.zzc.zza;
        zzo zzoVar = this.zza;
        Bundle bundle = this.zzb;
        zznvVar2.zzl().zzt();
        if (zzpn.zza() && zznvVar2.zze().zze(zzoVar.zza, zzbh.zzch) && zzoVar.zza != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i10 = 0; i10 < intArray.length; i10++) {
                            zzal zzf = zznvVar2.zzf();
                            String str = zzoVar.zza;
                            int i11 = intArray[i10];
                            long j3 = longArray[i10];
                            Preconditions.checkNotEmpty(str);
                            zzf.zzt();
                            zzf.zzal();
                            try {
                                int delete = zzf.e_().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j3)});
                                zzf.zzj().zzp().zza("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j3));
                            } catch (SQLiteException e2) {
                                zzf.zzj().zzg().zza("Error pruning trigger URIs. appId", zzgo.zza(str), e2);
                            }
                        }
                    } else {
                        zznvVar2.zzj().zzg().zza("Uri sources and timestamps do not match");
                    }
                }
            }
            return zznvVar2.zzf().zzk(zzoVar.zza);
        }
        return new ArrayList();
    }
}

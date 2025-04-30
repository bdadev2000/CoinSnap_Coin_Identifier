package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzih implements Callable<List<zzmu>> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzhn zzc;

    public zzih(zzhn zzhnVar, zzo zzoVar, Bundle bundle) {
        this.zza = zzoVar;
        this.zzb = bundle;
        this.zzc = zzhnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzmu> call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzc.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzc.zza;
        zzo zzoVar = this.zza;
        Bundle bundle = this.zzb;
        zzncVar2.zzl().zzt();
        if (zzpg.zza() && zzncVar2.zze().zze(zzoVar.zza, zzbf.zzbz) && zzoVar.zza != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i9 = 0; i9 < intArray.length; i9++) {
                            zzal zzf = zzncVar2.zzf();
                            String str = zzoVar.zza;
                            int i10 = intArray[i9];
                            long j7 = longArray[i9];
                            Preconditions.checkNotEmpty(str);
                            zzf.zzt();
                            zzf.zzal();
                            try {
                                int delete = zzf.e_().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j7)});
                                zzf.zzj().zzp().zza("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i10), Long.valueOf(j7));
                            } catch (SQLiteException e4) {
                                zzf.zzj().zzg().zza("Error pruning trigger URIs. appId", zzfw.zza(str), e4);
                            }
                        }
                    } else {
                        zzncVar2.zzj().zzg().zza("Uri sources and timestamps do not match");
                    }
                }
            }
            return zzncVar2.zzf().zzj(zzoVar.zza);
        }
        return new ArrayList();
    }
}

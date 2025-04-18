package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzeys implements zzevz {
    final ScheduledExecutorService zza;

    public zzeys(zzbtk zzbtkVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return zzgei.zzm(zzgei.zzo(zzgei.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzej)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeyr
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzeyt((Bundle) obj);
            }
        }, zzcaj.zza);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfav implements zzexw {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbvk zzc;

    public zzfav(zzbvk zzbvkVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbvkVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zzm(zzgft.zzo(zzgft.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzee)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfau
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzfaw((Bundle) obj);
            }
        }, zzcci.zza);
    }
}

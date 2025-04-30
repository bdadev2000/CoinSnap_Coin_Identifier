package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzewe implements zzexw {
    private final zzexw zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzewe(zzexw zzexwVar, long j7, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzexwVar;
        this.zzb = j7;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        f4.c zzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzci)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j7 = this.zzb;
        if (j7 > 0) {
            zzb = zzgft.zzo(zzb, j7, timeUnit, this.zzc);
        }
        return zzgft.zzf(zzb, Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzewd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzewe.this.zzc((Throwable) obj);
            }
        }, zzcci.zzf);
    }

    public final /* synthetic */ f4.c zzc(Throwable th) throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzch)).booleanValue()) {
            zzexw zzexwVar = this.zza;
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "OptionalSignalTimeout:" + zzexwVar.zza());
        }
        return zzgft.zzh(null);
    }
}

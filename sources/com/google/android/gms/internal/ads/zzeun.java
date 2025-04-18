package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzeun implements zzevz {
    private final zzevz zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeun(zzevz zzevzVar, long j3, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzevzVar;
        this.zzb = j3;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        ua.b zzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcq)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j3 = this.zzb;
        if (j3 > 0) {
            zzb = zzgei.zzo(zzb, j3, timeUnit, this.zzc);
        }
        return zzgei.zzf(zzb, Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzeun.this.zzc((Throwable) obj);
            }
        }, zzcaj.zzf);
    }

    public final /* synthetic */ ua.b zzc(Throwable th2) throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcp)).booleanValue()) {
            zzevz zzevzVar = this.zza;
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "OptionalSignalTimeout:" + zzevzVar.zza());
        }
        return zzgei.zzh(null);
    }
}

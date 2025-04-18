package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzevp implements zzexh {
    private final zzexh zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzevp(zzexh zzexhVar, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzexhVar;
        this.zzb = j2;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcn)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j2 = this.zzb;
        if (j2 > 0) {
            zzb = zzgfo.zzo(zzb, j2, timeUnit, this.zzc);
        }
        return zzgfo.zzf(zzb, Throwable.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzevo
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzevp.this.zzc((Throwable) obj);
            }
        }, zzcan.zzf);
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcm)).booleanValue()) {
            zzexh zzexhVar = this.zza;
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "OptionalSignalTimeout:" + zzexhVar.zza());
        }
        return zzgfo.zzh(null);
    }
}

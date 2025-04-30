package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggq extends zzgfj {
    private f4.c zza;
    private ScheduledFuture zzb;

    private zzggq(f4.c cVar) {
        cVar.getClass();
        this.zza = cVar;
    }

    public static f4.c zzf(f4.c cVar, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzggq zzggqVar = new zzggq(cVar);
        zzggn zzggnVar = new zzggn(zzggqVar);
        zzggqVar.zzb = scheduledExecutorService.schedule(zzggnVar, j7, timeUnit);
        cVar.addListener(zzggnVar, zzgfh.INSTANCE);
        return zzggqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final String zza() {
        f4.c cVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (cVar != null) {
            String e4 = AbstractC2914a.e("inputFuture=[", cVar.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return e4 + ", remaining delay=[" + delay + " ms]";
                }
                return e4;
            }
            return e4;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
